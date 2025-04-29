package yarnwrap.world.gen.carver;
public class CarverContext { public net.minecraft.world.gen.carver.CarverContext wrapperContained; public CarverContext(net.minecraft.world.gen.carver.CarverContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
// public void registryManager(yarnwrap.registry.DynamicRegistryManager value) { wrapperContained.registryManager = value.wrapperContained; }
// public static yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(net.minecraft.world.gen.carver.CarverContext.registryManager); }
// public static void registryManager(yarnwrap.registry.DynamicRegistryManager value, ) { net.minecraft.world.gen.carver.CarverContext.registryManager = value.wrapperContained; }

// public yarnwrap.world.gen.chunk.ChunkNoiseSampler chunkNoiseSampler() { return new yarnwrap.world.gen.chunk.ChunkNoiseSampler(wrapperContained.chunkNoiseSampler); }
// public void chunkNoiseSampler(yarnwrap.world.gen.chunk.ChunkNoiseSampler value) { wrapperContained.chunkNoiseSampler = value.wrapperContained; }
// public static yarnwrap.world.gen.chunk.ChunkNoiseSampler chunkNoiseSampler() { return new yarnwrap.world.gen.chunk.ChunkNoiseSampler(net.minecraft.world.gen.carver.CarverContext.chunkNoiseSampler); }
// public static void chunkNoiseSampler(yarnwrap.world.gen.chunk.ChunkNoiseSampler value, ) { net.minecraft.world.gen.carver.CarverContext.chunkNoiseSampler = value.wrapperContained; }

// public yarnwrap.world.gen.noise.NoiseConfig noiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.noiseConfig); }
// public void noiseConfig(yarnwrap.world.gen.noise.NoiseConfig value) { wrapperContained.noiseConfig = value.wrapperContained; }
// public static yarnwrap.world.gen.noise.NoiseConfig noiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(net.minecraft.world.gen.carver.CarverContext.noiseConfig); }
// public static void noiseConfig(yarnwrap.world.gen.noise.NoiseConfig value, ) { net.minecraft.world.gen.carver.CarverContext.noiseConfig = value.wrapperContained; }

// public Object materialRule() { return wrapperContained.materialRule; }
// // public void materialRule(Object value) { wrapperContained.materialRule = value; }
// // public static Object materialRule() { return net.minecraft.world.gen.carver.CarverContext.materialRule; }
// // public static void materialRule(Object value, ) { net.minecraft.world.gen.carver.CarverContext.materialRule = value; }

// public CarverContext(yarnwrap.world.gen.chunk.NoiseChunkGenerator noiseChunkGenerator,yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.world.HeightLimitView heightLimitView,yarnwrap.world.gen.chunk.ChunkNoiseSampler chunkNoiseSampler,yarnwrap.world.gen.noise.NoiseConfig noiseConfig,Object materialRule) { this.wrapperContained = new net.minecraft.world.gen.carver.CarverContext(noiseChunkGenerator.wrapperContained,registryManager.wrapperContained,heightLimitView.wrapperContained,chunkNoiseSampler.wrapperContained,noiseConfig.wrapperContained,materialRule); }
public java.util.Optional applyMaterialRule(java.util.function.Function posToBiome,yarnwrap.world.chunk.Chunk chunk,yarnwrap.util.math.BlockPos pos,boolean hasFluid) { return wrapperContained.applyMaterialRule(posToBiome,chunk.wrapperContained,pos.wrapperContained,hasFluid); }
// public static java.util.Optional applyMaterialRule(java.util.function.Function posToBiome,yarnwrap.world.chunk.Chunk chunk,yarnwrap.util.math.BlockPos pos,boolean hasFluid, ) { return net.minecraft.world.gen.carver.CarverContext.applyMaterialRule(posToBiome,chunk.wrapperContained,pos.wrapperContained,hasFluid); }
public yarnwrap.registry.DynamicRegistryManager getRegistryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.getRegistryManager()); }
// public static yarnwrap.registry.DynamicRegistryManager getRegistryManager() { return new yarnwrap.registry.DynamicRegistryManager(net.minecraft.world.gen.carver.CarverContext.getRegistryManager()); }
public yarnwrap.world.gen.noise.NoiseConfig getNoiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.getNoiseConfig()); }
// public static yarnwrap.world.gen.noise.NoiseConfig getNoiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(net.minecraft.world.gen.carver.CarverContext.getNoiseConfig()); }

}