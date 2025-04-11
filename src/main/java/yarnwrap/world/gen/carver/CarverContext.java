package yarnwrap.world.gen.carver;
public class CarverContext { public net.minecraft.world.gen.carver.CarverContext wrapperContained; public CarverContext(net.minecraft.world.gen.carver.CarverContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
// public void registryManager(yarnwrap.registry.DynamicRegistryManager value) { wrapperContained.registryManager = value.wrapperContained; }
// public yarnwrap.world.gen.chunk.ChunkNoiseSampler chunkNoiseSampler() { return new yarnwrap.world.gen.chunk.ChunkNoiseSampler(wrapperContained.chunkNoiseSampler); }
// public void chunkNoiseSampler(yarnwrap.world.gen.chunk.ChunkNoiseSampler value) { wrapperContained.chunkNoiseSampler = value.wrapperContained; }
// public yarnwrap.world.gen.noise.NoiseConfig noiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.noiseConfig); }
// public void noiseConfig(yarnwrap.world.gen.noise.NoiseConfig value) { wrapperContained.noiseConfig = value.wrapperContained; }
// public Object materialRule() { return wrapperContained.materialRule; }
// // public void materialRule(Object value) { wrapperContained.materialRule = value; }
public java.util.Optional applyMaterialRule(java.util.function.Function posToBiome,yarnwrap.world.chunk.Chunk chunk,yarnwrap.util.math.BlockPos pos,boolean hasFluid) { return wrapperContained.applyMaterialRule(posToBiome,chunk.wrapperContained,pos.wrapperContained,hasFluid); }
public yarnwrap.registry.DynamicRegistryManager getRegistryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.getRegistryManager()); }
public yarnwrap.world.gen.noise.NoiseConfig getNoiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.getNoiseConfig()); }

}