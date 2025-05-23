package yarnwrap.test;
public class BuiltinTestFunctions { public net.minecraft.test.BuiltinTestFunctions wrapperContained; public BuiltinTestFunctions(net.minecraft.test.BuiltinTestFunctions wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Consumer ALWAYS_PASS_FUNCTION() { return wrapperContained.ALWAYS_PASS_FUNCTION; }
// public void ALWAYS_PASS_FUNCTION(java.util.function.Consumer value) { wrapperContained.ALWAYS_PASS_FUNCTION = value; }
public static java.util.function.Consumer ALWAYS_PASS_FUNCTION() { return net.minecraft.test.BuiltinTestFunctions.ALWAYS_PASS_FUNCTION; }
// public static void ALWAYS_PASS_FUNCTION(java.util.function.Consumer value, ) { net.minecraft.test.BuiltinTestFunctions.ALWAYS_PASS_FUNCTION = value; }

// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
// public static yarnwrap.registry.RegistryKey of(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.test.BuiltinTestFunctions.of(id)); }
// public java.util.function.Consumer registerAndGetDefault(yarnwrap.registry.Registry registry) { return wrapperContained.registerAndGetDefault(registry.wrapperContained); }
// public static java.util.function.Consumer registerAndGetDefault(yarnwrap.registry.Registry registry, ) { return net.minecraft.test.BuiltinTestFunctions.registerAndGetDefault(registry.wrapperContained); }

}