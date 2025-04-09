package yarnwrap.world.gen.chunk;
public class ChunkNoiseSampler { public net.minecraft.world.gen.chunk.ChunkNoiseSampler wrapperContained; public ChunkNoiseSampler(net.minecraft.world.gen.chunk.ChunkNoiseSampler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int verticalCellCount() { return wrapperContained.verticalCellCount; }
// public int horizontalCellCount() { return wrapperContained.horizontalCellCount; }
// public int minimumCellY() { return wrapperContained.minimumCellY; }
// public int startCellX() { return wrapperContained.startCellX; }
// public int startCellZ() { return wrapperContained.startCellZ; }
// public int startBiomeX() { return wrapperContained.startBiomeX; }
// public int startBiomeZ() { return wrapperContained.startBiomeZ; }
// public java.util.List interpolators() { return wrapperContained.interpolators; }
// public yarnwrap.world.gen.chunk.AquiferSampler aquiferSampler() { return new yarnwrap.world.gen.chunk.AquiferSampler(wrapperContained.aquiferSampler); }
// public yarnwrap.world.gen.chunk.Blender blender() { return new yarnwrap.world.gen.chunk.Blender(wrapperContained.blender); }
// public yarnwrap.world.gen.chunk.GenerationShapeConfig generationShapeConfig() { return new yarnwrap.world.gen.chunk.GenerationShapeConfig(wrapperContained.generationShapeConfig); }
// public it.unimi.dsi.fastutil.longs.Long2IntMap surfaceHeightEstimateCache() { return wrapperContained.surfaceHeightEstimateCache; }
// public int startBlockY() { return wrapperContained.startBlockY; }
// public int startBlockZ() { return wrapperContained.startBlockZ; }
// public int cellBlockX() { return wrapperContained.cellBlockX; }
// public int cellBlockY() { return wrapperContained.cellBlockY; }
// public int cellBlockZ() { return wrapperContained.cellBlockZ; }
// public long sampleUniqueIndex() { return wrapperContained.sampleUniqueIndex; }
// public long cacheOnceUniqueIndex() { return wrapperContained.cacheOnceUniqueIndex; }
// public int index() { return wrapperContained.index; }
// public Object interpolationEachApplier() { return wrapperContained.interpolationEachApplier; }
// public java.util.List caches() { return wrapperContained.caches; }
// public java.util.Map actualDensityFunctionCache() { return wrapperContained.actualDensityFunctionCache; }
// public yarnwrap.world.gen.densityfunction.DensityFunction initialDensityWithoutJaggedness() { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.initialDensityWithoutJaggedness); }
// public Object blockStateSampler() { return wrapperContained.blockStateSampler; }
// public Object cachedBlendAlphaDensityFunction() { return wrapperContained.cachedBlendAlphaDensityFunction; }
// public Object cachedBlendOffsetDensityFunction() { return wrapperContained.cachedBlendOffsetDensityFunction; }
// public long lastBlendingColumnPos() { return wrapperContained.lastBlendingColumnPos; }
// public Object lastBlendingResult() { return wrapperContained.lastBlendingResult; }
// public int horizontalBiomeEnd() { return wrapperContained.horizontalBiomeEnd; }
// public int horizontalCellBlockCount() { return wrapperContained.horizontalCellBlockCount; }
// public int verticalCellBlockCount() { return wrapperContained.verticalCellBlockCount; }
// public boolean isInInterpolationLoop() { return wrapperContained.isInInterpolationLoop; }
// public boolean isSamplingForCaches() { return wrapperContained.isSamplingForCaches; }
// public int startBlockX() { return wrapperContained.startBlockX; }
// public Object beardifying() { return wrapperContained.beardifying; }
public void sampleStartDensity() { wrapperContained.sampleStartDensity(); }
public void interpolateY(int blockY,double deltaY) { wrapperContained.interpolateY(blockY,deltaY); }
public void sampleEndDensity(int cellX) { wrapperContained.sampleEndDensity(cellX); }
public void swapBuffers() { wrapperContained.swapBuffers(); }
public void interpolateX(int blockX,double deltaX) { wrapperContained.interpolateX(blockX,deltaX); }
public yarnwrap.world.gen.chunk.AquiferSampler getAquiferSampler() { return new yarnwrap.world.gen.chunk.AquiferSampler(wrapperContained.getAquiferSampler()); }
public void interpolateZ(int blockZ,double deltaZ) { wrapperContained.interpolateZ(blockZ,deltaZ); }
public void onSampledCellCorners(int cellY,int cellZ) { wrapperContained.onSampledCellCorners(cellY,cellZ); }
// public yarnwrap.world.gen.chunk.ChunkNoiseSampler create(yarnwrap.world.chunk.Chunk chunk,yarnwrap.world.gen.noise.NoiseConfig noiseConfig,Object beardifying,yarnwrap.world.gen.chunk.ChunkGeneratorSettings chunkGeneratorSettings,Object fluidLevelSampler,yarnwrap.world.gen.chunk.Blender blender) { return new yarnwrap.world.gen.chunk.ChunkNoiseSampler(wrapperContained.create(chunk.wrapperContained,noiseConfig.wrapperContained,beardifying,chunkGeneratorSettings.wrapperContained,fluidLevelSampler,blender.wrapperContained)); }
// public int calculateSurfaceHeightEstimate(long columnPos) { return wrapperContained.calculateSurfaceHeightEstimate(columnPos); }
public int estimateSurfaceHeight(int blockX,int blockZ) { return wrapperContained.estimateSurfaceHeight(blockX,blockZ); }
// public yarnwrap.world.gen.densityfunction.DensityFunction getActualDensityFunction(yarnwrap.world.gen.densityfunction.DensityFunction function) { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.getActualDensityFunction(function.wrapperContained)); }
// public Object createMultiNoiseSampler(yarnwrap.world.gen.noise.NoiseRouter noiseRouter,java.util.List spawnTarget) { return wrapperContained.createMultiNoiseSampler(noiseRouter.wrapperContained,spawnTarget); }
// public void sampleDensity(boolean start,int cellX) { wrapperContained.sampleDensity(start,cellX); }
// public yarnwrap.world.gen.densityfunction.DensityFunction getActualDensityFunctionImpl(yarnwrap.world.gen.densityfunction.DensityFunction function) { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.getActualDensityFunctionImpl(function.wrapperContained)); }
// public Object calculateBlendResult(int blockX,int blockZ) { return wrapperContained.calculateBlendResult(blockX,blockZ); }
// public yarnwrap.block.BlockState sampleBlockState() { return new yarnwrap.block.BlockState(wrapperContained.sampleBlockState()); }
public void stopInterpolation() { wrapperContained.stopInterpolation(); }
// public int getHorizontalCellBlockCount() { return wrapperContained.getHorizontalCellBlockCount(); }
// public int getVerticalCellBlockCount() { return wrapperContained.getVerticalCellBlockCount(); }

}