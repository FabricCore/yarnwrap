package yarnwrap.world.gen;
public class FlatLevelGeneratorPreset { public net.minecraft.world.gen.FlatLevelGeneratorPreset wrapperContained; public FlatLevelGeneratorPreset(net.minecraft.world.gen.FlatLevelGeneratorPreset wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.FlatLevelGeneratorPreset.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.FlatLevelGeneratorPreset.CODEC = value; }

// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec ENTRY_CODEC() { return net.minecraft.world.gen.FlatLevelGeneratorPreset.ENTRY_CODEC; }
// public static void ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.FlatLevelGeneratorPreset.ENTRY_CODEC = value; }

// public com.mojang.datafixers.kinds.App method_41576(Object instance) { return wrapperContained.method_41576(instance); }
// public static com.mojang.datafixers.kinds.App method_41576(Object instance, ) { return net.minecraft.world.gen.FlatLevelGeneratorPreset.method_41576(instance); }
// public yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig method_41577(yarnwrap.world.gen.FlatLevelGeneratorPreset preset) { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(wrapperContained.method_41577(preset.wrapperContained)); }
// public static yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig method_41577(yarnwrap.world.gen.FlatLevelGeneratorPreset preset, ) { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(net.minecraft.world.gen.FlatLevelGeneratorPreset.method_41577(preset.wrapperContained)); }
// public yarnwrap.registry.entry.RegistryEntry method_41578(yarnwrap.world.gen.FlatLevelGeneratorPreset preset) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_41578(preset.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry method_41578(yarnwrap.world.gen.FlatLevelGeneratorPreset preset, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.FlatLevelGeneratorPreset.method_41578(preset.wrapperContained)); }

}