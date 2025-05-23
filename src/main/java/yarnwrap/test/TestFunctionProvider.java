package yarnwrap.test;
public class TestFunctionProvider { public net.minecraft.test.TestFunctionProvider wrapperContained; public TestFunctionProvider(net.minecraft.test.TestFunctionProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List PROVIDERS() { return wrapperContained.PROVIDERS; }
// public void PROVIDERS(java.util.List value) { wrapperContained.PROVIDERS = value; }
// public static java.util.List PROVIDERS() { return net.minecraft.test.TestFunctionProvider.PROVIDERS; }
// public static void PROVIDERS(java.util.List value, ) { net.minecraft.test.TestFunctionProvider.PROVIDERS = value; }

public void register(java.util.function.BiConsumer registry) { wrapperContained.register(registry); }
// public static void register(java.util.function.BiConsumer registry, ) { net.minecraft.test.TestFunctionProvider.register(registry); }
// public void method_67075(yarnwrap.registry.Registry key,yarnwrap.registry.RegistryKey value) { wrapperContained.method_67075(key.wrapperContained,value.wrapperContained); }
// public static void method_67075(yarnwrap.registry.Registry key,yarnwrap.registry.RegistryKey value, ) { net.minecraft.test.TestFunctionProvider.method_67075(key.wrapperContained,value.wrapperContained); }
// public void addProvider(yarnwrap.test.TestFunctionProvider provider) { wrapperContained.addProvider(provider.wrapperContained); }
// public static void addProvider(yarnwrap.test.TestFunctionProvider provider, ) { net.minecraft.test.TestFunctionProvider.addProvider(provider.wrapperContained); }
// public void registerAll(yarnwrap.registry.Registry registry) { wrapperContained.registerAll(registry.wrapperContained); }
// public static void registerAll(yarnwrap.registry.Registry registry, ) { net.minecraft.test.TestFunctionProvider.registerAll(registry.wrapperContained); }

}