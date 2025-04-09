package yarnwrap.world.dimension;
public class DimensionOptions { public net.minecraft.world.dimension.DimensionOptions wrapperContained; public DimensionOptions(net.minecraft.world.dimension.DimensionOptions wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry dimensionTypeEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.dimensionTypeEntry); }
// public yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.chunkGenerator); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.registry.RegistryKey OVERWORLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.OVERWORLD); }
public yarnwrap.registry.RegistryKey NETHER() { return new yarnwrap.registry.RegistryKey(wrapperContained.NETHER); }
public yarnwrap.registry.RegistryKey END() { return new yarnwrap.registry.RegistryKey(wrapperContained.END); }
// public yarnwrap.registry.entry.RegistryEntry dimensionTypeEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.dimensionTypeEntry()); }
// public yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.chunkGenerator()); }

}