package yarnwrap.world.gen.surfacebuilder;
public class SurfaceBuilder { public net.minecraft.world.gen.surfacebuilder.SurfaceBuilder wrapperContained; public SurfaceBuilder(net.minecraft.world.gen.surfacebuilder.SurfaceBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState WHITE_TERRACOTTA() { return new yarnwrap.block.BlockState(wrapperContained.WHITE_TERRACOTTA); }
// public yarnwrap.block.BlockState ORANGE_TERRACOTTA() { return new yarnwrap.block.BlockState(wrapperContained.ORANGE_TERRACOTTA); }
// public yarnwrap.block.BlockState TERRACOTTA() { return new yarnwrap.block.BlockState(wrapperContained.TERRACOTTA); }
// public yarnwrap.block.BlockState YELLOW_TERRACOTTA() { return new yarnwrap.block.BlockState(wrapperContained.YELLOW_TERRACOTTA); }
// public yarnwrap.block.BlockState BROWN_TERRACOTTA() { return new yarnwrap.block.BlockState(wrapperContained.BROWN_TERRACOTTA); }
// public yarnwrap.block.BlockState RED_TERRACOTTA() { return new yarnwrap.block.BlockState(wrapperContained.RED_TERRACOTTA); }
// public yarnwrap.block.BlockState LIGHT_GRAY_TERRACOTTA() { return new yarnwrap.block.BlockState(wrapperContained.LIGHT_GRAY_TERRACOTTA); }
// public yarnwrap.block.BlockState PACKED_ICE() { return new yarnwrap.block.BlockState(wrapperContained.PACKED_ICE); }
// public yarnwrap.block.BlockState SNOW_BLOCK() { return new yarnwrap.block.BlockState(wrapperContained.SNOW_BLOCK); }
// public yarnwrap.block.BlockState defaultState() { return new yarnwrap.block.BlockState(wrapperContained.defaultState); }
// public int seaLevel() { return wrapperContained.seaLevel; }
// public net.minecraft.block.BlockState[] terracottaBands() { return wrapperContained.terracottaBands; }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler terracottaBandsOffsetNoise() { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.terracottaBandsOffsetNoise); }
// public yarnwrap.util.math.random.RandomSplitter randomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.randomDeriver); }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler surfaceNoise() { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.surfaceNoise); }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler badlandsPillarNoise() { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.badlandsPillarNoise); }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler badlandsPillarRoofNoise() { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.badlandsPillarRoofNoise); }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler badlandsSurfaceNoise() { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.badlandsSurfaceNoise); }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler icebergPillarNoise() { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.icebergPillarNoise); }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler icebergPillarRoofNoise() { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.icebergPillarRoofNoise); }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler icebergSurfaceNoise() { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.icebergSurfaceNoise); }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler surfaceSecondaryNoise() { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.surfaceSecondaryNoise); }
// public void placeBadlandsPillar(yarnwrap.world.gen.chunk.BlockColumn column,int x,int z,int surfaceY,yarnwrap.world.HeightLimitView chunk) { wrapperContained.placeBadlandsPillar(column.wrapperContained,x,z,surfaceY,chunk.wrapperContained); }
// public yarnwrap.block.BlockState getTerracottaBlock(int x,int y,int z) { return new yarnwrap.block.BlockState(wrapperContained.getTerracottaBlock(x,y,z)); }
// public void placeIceberg(int minY,yarnwrap.world.biome.Biome biome,yarnwrap.world.gen.chunk.BlockColumn column,Object mutablePos,int x,int z,int surfaceY) { wrapperContained.placeIceberg(minY,biome.wrapperContained,column.wrapperContained,mutablePos,x,z,surfaceY); }
// public void buildSurface(yarnwrap.world.gen.noise.NoiseConfig noiseConfig,yarnwrap.world.biome.source.BiomeAccess biomeAccess,yarnwrap.registry.Registry biomeRegistry,boolean useLegacyRandom,yarnwrap.world.gen.HeightContext heightContext,yarnwrap.world.chunk.Chunk chunk,yarnwrap.world.gen.chunk.ChunkNoiseSampler chunkNoiseSampler,Object materialRule) { wrapperContained.buildSurface(noiseConfig.wrapperContained,biomeAccess.wrapperContained,biomeRegistry.wrapperContained,useLegacyRandom,heightContext.wrapperContained,chunk.wrapperContained,chunkNoiseSampler.wrapperContained,materialRule); }
// public net.minecraft.block.BlockState[] createTerracottaBands(yarnwrap.util.math.random.Random random) { return wrapperContained.createTerracottaBands(random.wrapperContained); }
// public void addTerracottaBands(yarnwrap.util.math.random.Random random,net.minecraft.block.BlockState[] terracottaBands,int minBandSize,yarnwrap.block.BlockState state) { wrapperContained.addTerracottaBands(random.wrapperContained,terracottaBands,minBandSize,state.wrapperContained); }
// public java.util.Optional applyMaterialRule(Object rule,yarnwrap.world.gen.carver.CarverContext context,java.util.function.Function posToBiome,yarnwrap.world.chunk.Chunk chunk,yarnwrap.world.gen.chunk.ChunkNoiseSampler chunkNoiseSampler,yarnwrap.util.math.BlockPos pos,boolean hasFluid) { return wrapperContained.applyMaterialRule(rule,context.wrapperContained,posToBiome,chunk.wrapperContained,chunkNoiseSampler.wrapperContained,pos.wrapperContained,hasFluid); }
// public boolean isDefaultBlock(yarnwrap.block.BlockState state) { return wrapperContained.isDefaultBlock(state.wrapperContained); }
// public int sampleRunDepth(int blockX,int blockZ) { return wrapperContained.sampleRunDepth(blockX,blockZ); }
// public double sampleSecondaryDepth(int blockX,int blockZ) { return wrapperContained.sampleSecondaryDepth(blockX,blockZ); }

}