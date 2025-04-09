package yarnwrap.world.gen.carver;
public class CarverContext { public net.minecraft.world.gen.carver.CarverContext wrapperContained; public CarverContext(net.minecraft.world.gen.carver.CarverContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
// public yarnwrap.world.gen.chunk.ChunkNoiseSampler chunkNoiseSampler() { return new yarnwrap.world.gen.chunk.ChunkNoiseSampler(wrapperContained.chunkNoiseSampler); }
// public yarnwrap.world.gen.noise.NoiseConfig noiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.noiseConfig); }
// public Object materialRule() { return wrapperContained.materialRule; }
public java.util.Optional applyMaterialRule(java.util.function.Function posToBiome,yarnwrap.world.chunk.Chunk chunk,yarnwrap.util.math.BlockPos pos,boolean hasFluid) { return wrapperContained.applyMaterialRule(posToBiome,chunk.wrapperContained,pos.wrapperContained,hasFluid); }
public yarnwrap.registry.DynamicRegistryManager getRegistryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.getRegistryManager()); }
public yarnwrap.world.gen.noise.NoiseConfig getNoiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.getNoiseConfig()); }

}