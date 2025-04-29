package yarnwrap.util.function;
public class CharPredicate { public net.minecraft.util.function.CharPredicate wrapperContained; public CharPredicate(net.minecraft.util.function.CharPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.function.CharPredicate negate() { return new yarnwrap.util.function.CharPredicate(wrapperContained.negate()); }
// public static yarnwrap.util.function.CharPredicate negate() { return new yarnwrap.util.function.CharPredicate(net.minecraft.util.function.CharPredicate.negate()); }
// public boolean method_36124(char c) { return wrapperContained.method_36124(c); }
// public static boolean method_36124(char c, ) { return net.minecraft.util.function.CharPredicate.method_36124(c); }
public yarnwrap.util.function.CharPredicate and(yarnwrap.util.function.CharPredicate predicate) { return new yarnwrap.util.function.CharPredicate(wrapperContained.and(predicate.wrapperContained)); }
// public static yarnwrap.util.function.CharPredicate and(yarnwrap.util.function.CharPredicate predicate, ) { return new yarnwrap.util.function.CharPredicate(net.minecraft.util.function.CharPredicate.and(predicate.wrapperContained)); }
// public boolean method_36126(yarnwrap.util.function.CharPredicate c) { return wrapperContained.method_36126(c.wrapperContained); }
// public static boolean method_36126(yarnwrap.util.function.CharPredicate c, ) { return net.minecraft.util.function.CharPredicate.method_36126(c.wrapperContained); }
public yarnwrap.util.function.CharPredicate or(yarnwrap.util.function.CharPredicate predicate) { return new yarnwrap.util.function.CharPredicate(wrapperContained.or(predicate.wrapperContained)); }
// public static yarnwrap.util.function.CharPredicate or(yarnwrap.util.function.CharPredicate predicate, ) { return new yarnwrap.util.function.CharPredicate(net.minecraft.util.function.CharPredicate.or(predicate.wrapperContained)); }
// public boolean method_36128(yarnwrap.util.function.CharPredicate c) { return wrapperContained.method_36128(c.wrapperContained); }
// public static boolean method_36128(yarnwrap.util.function.CharPredicate c, ) { return net.minecraft.util.function.CharPredicate.method_36128(c.wrapperContained); }
public boolean test(char c) { return wrapperContained.test(c); }
// public static boolean test(char c, ) { return net.minecraft.util.function.CharPredicate.test(c); }

}