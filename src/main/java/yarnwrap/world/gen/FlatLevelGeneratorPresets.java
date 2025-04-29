package yarnwrap.world.gen;
public class FlatLevelGeneratorPresets { public net.minecraft.world.gen.FlatLevelGeneratorPresets wrapperContained; public FlatLevelGeneratorPresets(net.minecraft.world.gen.FlatLevelGeneratorPresets wrapperContained) { this.wrapperContained = wrapperContained; }

// public void bootstrap(yarnwrap.registry.Registerable presetRegisterable) { wrapperContained.bootstrap(presetRegisterable.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable presetRegisterable, ) { net.minecraft.world.gen.FlatLevelGeneratorPresets.bootstrap(presetRegisterable.wrapperContained); }
// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
// public static yarnwrap.registry.RegistryKey of(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.world.gen.FlatLevelGeneratorPresets.of(id)); }

}