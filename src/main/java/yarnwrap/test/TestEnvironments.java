package yarnwrap.test;
public class TestEnvironments { public net.minecraft.test.TestEnvironments wrapperContained; public TestEnvironments(net.minecraft.test.TestEnvironments wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String DEFAULT_ID() { return wrapperContained.DEFAULT_ID; }
// public void DEFAULT_ID(java.lang.String value) { wrapperContained.DEFAULT_ID = value; }
public static java.lang.String DEFAULT_ID() { return net.minecraft.test.TestEnvironments.DEFAULT_ID; }
// public static void DEFAULT_ID(java.lang.String value, ) { net.minecraft.test.TestEnvironments.DEFAULT_ID = value; }

// // public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
// public static yarnwrap.registry.RegistryKey of(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.test.TestEnvironments.of(id)); }
// public void bootstrap(yarnwrap.registry.Registerable registry) { wrapperContained.bootstrap(registry.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable registry, ) { net.minecraft.test.TestEnvironments.bootstrap(registry.wrapperContained); }

}