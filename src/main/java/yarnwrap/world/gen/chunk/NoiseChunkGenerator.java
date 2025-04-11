package yarnwrap.world.gen.chunk;
public class NoiseChunkGenerator { public net.minecraft.world.gen.chunk.NoiseChunkGenerator wrapperContained; public NoiseChunkGenerator(net.minecraft.world.gen.chunk.NoiseChunkGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState AIR() { return new yarnwrap.block.BlockState(wrapperContained.AIR); }
// public void AIR(yarnwrap.block.BlockState value) { wrapperContained.AIR = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.registry.entry.RegistryEntry settings() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.settings); }
// public void settings(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.settings = value.wrapperContained; }
// public java.util.function.Supplier fluidLevelSampler() { return wrapperContained.fluidLevelSampler; }
// public void fluidLevelSampler(java.util.function.Supplier value) { wrapperContained.fluidLevelSampler = value; }
// public java.util.OptionalInt sampleHeightmap(yarnwrap.world.HeightLimitView world,yarnwrap.world.gen.noise.NoiseConfig noiseConfig,int x,int z,org.apache.commons.lang3.mutable.MutableObject columnSample,java.util.function.Predicate stopPredicate) { return wrapperContained.sampleHeightmap(world.wrapperContained,noiseConfig.wrapperContained,x,z,columnSample,stopPredicate); }
public boolean matchesSettings(yarnwrap.registry.RegistryKey settings) { return wrapperContained.matchesSettings(settings.wrapperContained); }
// public yarnwrap.world.chunk.Chunk populateNoise(yarnwrap.world.gen.chunk.Blender blender,yarnwrap.world.gen.StructureAccessor structureAccessor,yarnwrap.world.gen.noise.NoiseConfig noiseConfig,yarnwrap.world.chunk.Chunk chunk,int minimumCellY,int cellHeight) { return new yarnwrap.world.chunk.Chunk(wrapperContained.populateNoise(blender.wrapperContained,structureAccessor.wrapperContained,noiseConfig.wrapperContained,chunk.wrapperContained,minimumCellY,cellHeight)); }
// public yarnwrap.block.BlockState getBlockState(yarnwrap.world.gen.chunk.ChunkNoiseSampler chunkNoiseSampler,int x,int y,int z,yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.getBlockState(chunkNoiseSampler.wrapperContained,x,y,z,state.wrapperContained)); }
// public void populateBiomes(yarnwrap.world.gen.chunk.Blender blender,yarnwrap.world.gen.noise.NoiseConfig noiseConfig,yarnwrap.world.gen.StructureAccessor structureAccessor,yarnwrap.world.chunk.Chunk chunk) { wrapperContained.populateBiomes(blender.wrapperContained,noiseConfig.wrapperContained,structureAccessor.wrapperContained,chunk.wrapperContained); }
// public yarnwrap.world.gen.chunk.ChunkNoiseSampler createChunkNoiseSampler(yarnwrap.world.chunk.Chunk chunk,yarnwrap.world.gen.StructureAccessor world,yarnwrap.world.gen.chunk.Blender blender,yarnwrap.world.gen.noise.NoiseConfig noiseConfig) { return new yarnwrap.world.gen.chunk.ChunkNoiseSampler(wrapperContained.createChunkNoiseSampler(chunk.wrapperContained,world.wrapperContained,blender.wrapperContained,noiseConfig.wrapperContained)); }
public void buildSurface(yarnwrap.world.chunk.Chunk chunk,yarnwrap.world.gen.HeightContext heightContext,yarnwrap.world.gen.noise.NoiseConfig noiseConfig,yarnwrap.world.gen.StructureAccessor structureAccessor,yarnwrap.world.biome.source.BiomeAccess biomeAccess,yarnwrap.registry.Registry biomeRegistry,yarnwrap.world.gen.chunk.Blender blender) { wrapperContained.buildSurface(chunk.wrapperContained,heightContext.wrapperContained,noiseConfig.wrapperContained,structureAccessor.wrapperContained,biomeAccess.wrapperContained,biomeRegistry.wrapperContained,blender.wrapperContained); }
public yarnwrap.registry.entry.RegistryEntry getSettings() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSettings()); }
// public Object createFluidLevelSampler(yarnwrap.world.gen.chunk.ChunkGeneratorSettings settings) { return wrapperContained.createFluidLevelSampler(settings.wrapperContained); }

}