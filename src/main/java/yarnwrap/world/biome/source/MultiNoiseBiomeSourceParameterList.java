package yarnwrap.world.biome.source;
public class MultiNoiseBiomeSourceParameterList { public net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList wrapperContained; public MultiNoiseBiomeSourceParameterList(net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList.CODEC = value; }

// public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
// public void REGISTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.REGISTRY_CODEC = value; }
public static com.mojang.serialization.Codec REGISTRY_CODEC() { return net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList.REGISTRY_CODEC; }
// public static void REGISTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList.REGISTRY_CODEC = value; }

// public Object preset() { return wrapperContained.preset; }
// // public void preset(Object value) { wrapperContained.preset = value; }
// // public static Object preset() { return net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList.preset; }
// // public static void preset(Object value, ) { net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList.preset = value; }

// public Object entries() { return wrapperContained.entries; }
// // public void entries(Object value) { wrapperContained.entries = value; }
// // public static Object entries() { return net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList.entries; }
// // public static void entries(Object value, ) { net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList.entries = value; }

// public MultiNoiseBiomeSourceParameterList(Object preset,yarnwrap.registry.RegistryEntryLookup biomeLookup) { this.wrapperContained = new net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList(preset,biomeLookup.wrapperContained); }
public Object getEntries() { return wrapperContained.getEntries(); }
// public static Object getEntries() { return net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList.getEntries(); }
// public Object method_49509(Object preset) { return wrapperContained.method_49509(preset); }
// public static Object method_49509(Object preset, ) { return net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList.method_49509(preset); }
// public java.util.Map getPresetToEntriesMap() { return wrapperContained.getPresetToEntriesMap(); }
public static java.util.Map getPresetToEntriesMap() { return net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList.getPresetToEntriesMap(); }

}