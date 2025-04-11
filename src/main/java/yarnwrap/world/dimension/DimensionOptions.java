package yarnwrap.world.dimension;
public class DimensionOptions { public net.minecraft.world.dimension.DimensionOptions wrapperContained; public DimensionOptions(net.minecraft.world.dimension.DimensionOptions wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry dimensionTypeEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.dimensionTypeEntry); }
// public void dimensionTypeEntry(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.dimensionTypeEntry = value.wrapperContained; }
// public yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.chunkGenerator); }
// public void chunkGenerator(yarnwrap.world.gen.chunk.ChunkGenerator value) { wrapperContained.chunkGenerator = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.registry.RegistryKey OVERWORLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.OVERWORLD); }
// public void OVERWORLD(yarnwrap.registry.RegistryKey value) { wrapperContained.OVERWORLD = value.wrapperContained; }
public yarnwrap.registry.RegistryKey NETHER() { return new yarnwrap.registry.RegistryKey(wrapperContained.NETHER); }
// public void NETHER(yarnwrap.registry.RegistryKey value) { wrapperContained.NETHER = value.wrapperContained; }
public yarnwrap.registry.RegistryKey END() { return new yarnwrap.registry.RegistryKey(wrapperContained.END); }
// public void END(yarnwrap.registry.RegistryKey value) { wrapperContained.END = value.wrapperContained; }
// public yarnwrap.registry.entry.RegistryEntry dimensionTypeEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.dimensionTypeEntry()); }
// public yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.chunkGenerator()); }

}