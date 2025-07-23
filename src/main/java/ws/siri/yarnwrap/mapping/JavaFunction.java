package ws.siri.yarnwrap.mapping;

import com.mojang.datafixers.util.Pair;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import ws.siri.yarnwrap.common.ScriptFunction;
import ws.siri.yarnwrap.util.NullableOption;

/**
 * Represents a set of overloaded methods with the same name, chooses the
 * correct method to execute when called with specific parameters
 */
public class JavaFunction implements ScriptFunction, JavaLike {
    /**
     * collection of the methods and their parameters
     */
    public final HashMap<Class<?>[], Executable> methods = new HashMap<>();
    /**
     * string qualifier for the method
     */
    public final String qualifier;
    /**
     * parent object or class
     */
    public final JavaLike parent;

    /**
     * construct a new JavaFunction
     *
     * @param potentialMethods list of all methods with that name
     * @param qualifier        string qualifier for the method
     * @param parent           parent object or class
     */
    public JavaFunction(Executable[] potentialMethods, String qualifier, JavaLike parent) {
        Arrays.stream(potentialMethods)
                .forEach((method) -> methods.put(method.getParameterTypes(), method));
        this.qualifier = qualifier;
        this.parent = parent;
    }

    /**
     * converts primitive classes to the Wrapped primitive classes (int -> Integer)
     *
     * @param primitiveClass
     * @return
     */
    private static Class<?> primitiveWrapper(Class<?> primitiveClass) {
        if (primitiveClass == int.class)
            return Integer.class;
        if (primitiveClass == char.class)
            return Character.class;
        if (primitiveClass == double.class)
            return Double.class;
        if (primitiveClass == float.class)
            return Float.class;
        if (primitiveClass == long.class)
            return Long.class;
        if (primitiveClass == short.class)
            return Short.class;
        if (primitiveClass == byte.class)
            return Byte.class;
        if (primitiveClass == boolean.class)
            return Boolean.class;

        throw new UnsupportedOperationException(primitiveClass.getName() + " is not a primitive");
    }

    private static HashMap<Class<?>, HashMap<Class<?>, Integer>> assignAccepts = new HashMap<>();

    static {
        {
            HashMap<Class<?>, Integer> map = new HashMap<>();
            map.put(Byte.class, 0);
            map.put(Short.class, 10);
            map.put(Integer.class, 15);
            map.put(Long.class, 18);
            map.put(Float.class, 30);
            map.put(Double.class, 30);
            assignAccepts.put(Byte.class, map);
        }

        {
            HashMap<Class<?>, Integer> map = new HashMap<>();
            map.put(Byte.class, 1);
            map.put(Short.class, 0);
            map.put(Integer.class, 10);
            map.put(Long.class, 15);
            map.put(Float.class, 30);
            map.put(Double.class, 30);
            assignAccepts.put(Short.class, map);
        }

        {
            HashMap<Class<?>, Integer> map = new HashMap<>();
            map.put(Byte.class, 1);
            map.put(Short.class, 1);
            map.put(Integer.class, 0);
            map.put(Long.class, 10);
            map.put(Float.class, 30);
            map.put(Double.class, 30);
            assignAccepts.put(Integer.class, map);
        }

        {
            HashMap<Class<?>, Integer> map = new HashMap<>();
            map.put(Byte.class, 1);
            map.put(Short.class, 1);
            map.put(Integer.class, 1);
            map.put(Long.class, 0);
            map.put(Float.class, 30);
            map.put(Double.class, 30);
            assignAccepts.put(Long.class, map);
        }

        {
            HashMap<Class<?>, Integer> map = new HashMap<>();
            map.put(Byte.class, 2);
            map.put(Short.class, 2);
            map.put(Integer.class, 2);
            map.put(Long.class, 2);
            map.put(Float.class, 0);
            map.put(Double.class, 1);
            assignAccepts.put(Float.class, map);
        }

        {
            HashMap<Class<?>, Integer> map = new HashMap<>();
            map.put(Byte.class, 2);
            map.put(Short.class, 2);
            map.put(Integer.class, 2);
            map.put(Long.class, 2);
            map.put(Float.class, 1);
            map.put(Double.class, 0);
            assignAccepts.put(Double.class, map);
        }
    }

    /**
     * check if type b can be converted to type a
     *
     * @param a
     * @param b
     * @return true if such conversion is possible
     */
    public int areEquivalent(Class<?> a, Class<?> b) {
        if (a.isAssignableFrom(b))
            return 0;

        if (a.isPrimitive())
            a = primitiveWrapper(a);
        if (b.isPrimitive())
            b = primitiveWrapper(b);

        if (assignAccepts.containsKey(a) && assignAccepts.get(a).containsKey(b))
            return assignAccepts.get(a).get(b);

        return a == b ? 0 : -1;
    }

    /**
     * runs the function with specific parameters
     */
    public Object run(Object... args) throws Exception {
        for (int i = 0; i < args.length; i++) {
            args[i] = JavaObject.unwrapAll(args[i]);
        }

        Class<?>[] argTypes = Arrays.stream(args).map((arg) -> arg.getClass()).toArray(Class<?>[]::new);
        List<Pair<Class<?>[], Optional<Class<?>[]>>> sigTypes = new ArrayList<>();

        for (Class<?>[] sig : methods.keySet()) {
            if (sig.length == argTypes.length) {
                sigTypes.add(new Pair<>(sig, Optional.empty()));
            }
            if (sig.length <= argTypes.length + 1) {
                if (sig.length != 0 && sig[sig.length - 1].isArray()) {
                    Class<?>[] expanded = new Class[argTypes.length];
                    for (int i = 0; i < argTypes.length; i++) {
                        if (i < sig.length - 1) {
                            expanded[i] = sig[i];
                        } else {
                            expanded[i] = sig[sig.length - 1].getComponentType();
                        }
                    }

                    sigTypes.add(new Pair<>(expanded, Optional.of(sig)));
                }
            }
        }

        Executable executable = null;
        Class<?>[] executableSignature = null;
        Optional<Class<?>[]> originalSignature = Optional.empty();
        int executableScore = -1;

        if (methods.containsKey(argTypes)) {
            executable = methods.get(argTypes);
        } else {
            signatureLoop: for (Pair<Class<?>[], Optional<Class<?>[]>> pair : sigTypes) {
                Class<?>[] signature = pair.getFirst();
                if (signature.length != argTypes.length)
                    continue;

                int runningScore = 0;

                for (int i = 0; i < signature.length; i++) {
                    int score = areEquivalent(signature[i], argTypes[i]);
                    if (score == -1)
                        continue signatureLoop;
                    runningScore += score;
                }

                if (executableScore == -1 || runningScore < executableScore) {
                    executable = methods.get(pair.getSecond().orElse(signature));
                    executableSignature = signature;
                    executableScore = runningScore;
                    originalSignature = pair.getSecond();
                }

                if (runningScore == 0)
                    break signatureLoop;
            }

            if (executable == null)
                throw new UnsupportedOperationException(String.format(
                        "no method implementation with arguments `%s`", Arrays.toString(argTypes)));

            for (int i = 0; i < executableSignature.length; i++) {
                Class<?> sig = executableSignature[i];

                if (sig.isPrimitive())
                    sig = primitiveWrapper(sig);

                if (sig != args[i].getClass() && assignAccepts.containsKey(sig)) {
                    Number n = (Number) args[i];
                    if (sig == Short.class)
                        args[i] = n.shortValue();
                    else if (sig == Integer.class)
                        args[i] = n.intValue();
                    else if (sig == Long.class)
                        args[i] = n.longValue();
                    else if (sig == Double.class)
                        args[i] = n.doubleValue();
                    else if (sig == Float.class)
                        args[i] = n.floatValue();
                }
            }

            if (originalSignature.isPresent()) {
                Class<?>[] original = originalSignature.get();
                Object[] newArgs = new Object[original.length];
                for (int i = 0; i < original.length - 1; i++) {
                    newArgs[i] = args[i];
                }
                newArgs[original.length - 1] = Array.newInstance(original[original.length - 1].getComponentType(),
                        args.length - original.length + 1);

                for (int i = 0; i < args.length - original.length + 1; i++) {
                    Array.set(newArgs[original.length - 1], i, args[i + original.length - 1]);
                }
                args = newArgs;
            }
        }

        if (executable instanceof Constructor) {
            return JavaObject.autoWrap(((Constructor<?>) executable).newInstance(args));
        } else {
            Method method = (Method) executable;
            method.setAccessible(true);
            try {
                if (Modifier.isStatic(method.getModifiers())) {
                    return JavaObject.autoWrap(method.invoke(null, args));
                } else if (parent instanceof JavaObject) {
                    return JavaObject.autoWrap(method.invoke(JavaObject.unwrapAll(parent), args));
                } else {
                    throw new UnsupportedOperationException(
                            String.format("no static implementation with arguments `%s`",
                                    Arrays.toString(argTypes)));
                }
            } catch (InvocationTargetException e) {
                throw new Exception(e.getTargetException());
            }
        }
    }

    @Override
    public @NotNull NullableOption<Object> getRelative(List<String> path) {
        return NullableOption.empty();
    }

    @Override
    public @NotNull String[] getQualifier() {
        return qualifier.split("\\$|/");
    }

    @Override
    public @NotNull String stringQualifier() {
        return qualifier;
    }

    @Override
    public String toString() {
        return String.format("JavaPackage(%s)", stringQualifier());
    }
}