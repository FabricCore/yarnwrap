package yarnwrap.world.gen;
public class FlatLevelGeneratorPresets { public net.minecraft.world.gen.FlatLevelGeneratorPresets wrapperContained; public FlatLevelGeneratorPresets(net.minecraft.world.gen.FlatLevelGeneratorPresets wrapperContained) { this.wrapperContained = wrapperContained; }

public void bootstrap(yarnwrap.registry.Registerable presetRegisterable) { wrapperContained.bootstrap(presetRegisterable.wrapperContained); }
// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }

}