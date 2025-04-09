package yarnwrap.world.biome.source;
public class MultiNoiseBiomeSourceParameterLists { public net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterLists wrapperContained; public MultiNoiseBiomeSourceParameterLists(net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterLists wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
public void bootstrap(yarnwrap.registry.Registerable registry) { wrapperContained.bootstrap(registry.wrapperContained); }

}