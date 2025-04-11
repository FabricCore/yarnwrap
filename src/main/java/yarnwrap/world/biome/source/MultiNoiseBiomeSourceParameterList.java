package yarnwrap.world.biome.source;
public class MultiNoiseBiomeSourceParameterList { public net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList wrapperContained; public MultiNoiseBiomeSourceParameterList(net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
// public void REGISTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.REGISTRY_CODEC = value; }
// public Object preset() { return wrapperContained.preset; }
// // public void preset(Object value) { wrapperContained.preset = value; }
// public Object entries() { return wrapperContained.entries; }
// // public void entries(Object value) { wrapperContained.entries = value; }
// public MultiNoiseBiomeSourceParameterList(Object preset,yarnwrap.registry.RegistryEntryLookup biomeLookup) { this.wrapperContained = new net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList(preset,biomeLookup.wrapperContained); }
public Object getEntries() { return wrapperContained.getEntries(); }
// public Object method_49509(Object preset) { return wrapperContained.method_49509(preset); }
public java.util.Map getPresetToEntriesMap() { return wrapperContained.getPresetToEntriesMap(); }

}