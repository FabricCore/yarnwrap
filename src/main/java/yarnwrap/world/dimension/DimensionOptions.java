package yarnwrap.world.dimension;
public class DimensionOptions { public net.minecraft.world.dimension.DimensionOptions wrapperContained; public DimensionOptions(net.minecraft.world.dimension.DimensionOptions wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry dimensionTypeEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.dimensionTypeEntry); }
// public void dimensionTypeEntry(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.dimensionTypeEntry = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry dimensionTypeEntry() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.dimension.DimensionOptions.dimensionTypeEntry); }
// public static void dimensionTypeEntry(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.world.dimension.DimensionOptions.dimensionTypeEntry = value.wrapperContained; }

// public yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.chunkGenerator); }
// public void chunkGenerator(yarnwrap.world.gen.chunk.ChunkGenerator value) { wrapperContained.chunkGenerator = value.wrapperContained; }
// public static yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(net.minecraft.world.dimension.DimensionOptions.chunkGenerator); }
// public static void chunkGenerator(yarnwrap.world.gen.chunk.ChunkGenerator value, ) { net.minecraft.world.dimension.DimensionOptions.chunkGenerator = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.dimension.DimensionOptions.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.dimension.DimensionOptions.CODEC = value; }

// public yarnwrap.registry.RegistryKey OVERWORLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.OVERWORLD); }
// public void OVERWORLD(yarnwrap.registry.RegistryKey value) { wrapperContained.OVERWORLD = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey OVERWORLD() { return new yarnwrap.registry.RegistryKey(net.minecraft.world.dimension.DimensionOptions.OVERWORLD); }
// public static void OVERWORLD(yarnwrap.registry.RegistryKey value, ) { net.minecraft.world.dimension.DimensionOptions.OVERWORLD = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey NETHER() { return new yarnwrap.registry.RegistryKey(wrapperContained.NETHER); }
// public void NETHER(yarnwrap.registry.RegistryKey value) { wrapperContained.NETHER = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey NETHER() { return new yarnwrap.registry.RegistryKey(net.minecraft.world.dimension.DimensionOptions.NETHER); }
// public static void NETHER(yarnwrap.registry.RegistryKey value, ) { net.minecraft.world.dimension.DimensionOptions.NETHER = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey END() { return new yarnwrap.registry.RegistryKey(wrapperContained.END); }
// public void END(yarnwrap.registry.RegistryKey value) { wrapperContained.END = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey END() { return new yarnwrap.registry.RegistryKey(net.minecraft.world.dimension.DimensionOptions.END); }
// public static void END(yarnwrap.registry.RegistryKey value, ) { net.minecraft.world.dimension.DimensionOptions.END = value.wrapperContained; }

public DimensionOptions(yarnwrap.registry.entry.RegistryEntry dimensionTypeEntry,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator) { this.wrapperContained = new net.minecraft.world.dimension.DimensionOptions(dimensionTypeEntry.wrapperContained,chunkGenerator.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry dimensionTypeEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.dimensionTypeEntry()); }
// // public static yarnwrap.registry.entry.RegistryEntry dimensionTypeEntry() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.dimension.DimensionOptions.dimensionTypeEntry()); }
// public yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.chunkGenerator()); }
// // public static yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(net.minecraft.world.dimension.DimensionOptions.chunkGenerator()); }
// public com.mojang.datafixers.kinds.App method_29568(Object instance) { return wrapperContained.method_29568(instance); }
// public static com.mojang.datafixers.kinds.App method_29568(Object instance, ) { return net.minecraft.world.dimension.DimensionOptions.method_29568(instance); }

}