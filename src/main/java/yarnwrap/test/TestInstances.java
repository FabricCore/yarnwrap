package yarnwrap.test;
public class TestInstances { public net.minecraft.test.TestInstances wrapperContained; public TestInstances(net.minecraft.test.TestInstances wrapperContained) { this.wrapperContained = wrapperContained; }

// // public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
// public static yarnwrap.registry.RegistryKey of(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.test.TestInstances.of(id)); }
// public void bootstrap(yarnwrap.registry.Registerable registry) { wrapperContained.bootstrap(registry.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable registry, ) { net.minecraft.test.TestInstances.bootstrap(registry.wrapperContained); }

}