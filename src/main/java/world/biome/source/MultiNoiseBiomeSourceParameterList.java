package yarnwrap.world.biome.source;
public class MultiNoiseBiomeSourceParameterList { public net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList wrapperContained; public MultiNoiseBiomeSourceParameterList(net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
// public Object preset() { return wrapperContained.preset; }
// public Object entries() { return wrapperContained.entries; }
public Object getEntries() { return wrapperContained.getEntries(); }
public java.util.Map getPresetToEntriesMap() { return wrapperContained.getPresetToEntriesMap(); }

}