package yarnwrap.world.gen.carver;
public class ConfiguredCarvers { public net.minecraft.world.gen.carver.ConfiguredCarvers wrapperContained; public ConfiguredCarvers(net.minecraft.world.gen.carver.ConfiguredCarvers wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey register(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.register(id)); }
// public static yarnwrap.registry.RegistryKey register(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.world.gen.carver.ConfiguredCarvers.register(id)); }
// public void bootstrap(yarnwrap.registry.Registerable carverRegisterable) { wrapperContained.bootstrap(carverRegisterable.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable carverRegisterable, ) { net.minecraft.world.gen.carver.ConfiguredCarvers.bootstrap(carverRegisterable.wrapperContained); }

}