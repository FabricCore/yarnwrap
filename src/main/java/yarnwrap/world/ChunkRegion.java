package yarnwrap.world;
public class ChunkRegion { public net.minecraft.world.ChunkRegion wrapperContained; public ChunkRegion(net.minecraft.world.ChunkRegion wrapperContained) { this.wrapperContained = wrapperContained; }

// public long seed() { return wrapperContained.seed; }
// public void seed(long value) { wrapperContained.seed = value; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.world.tick.MultiTickScheduler fluidTickScheduler() { return new yarnwrap.world.tick.MultiTickScheduler(wrapperContained.fluidTickScheduler); }
// public void fluidTickScheduler(yarnwrap.world.tick.MultiTickScheduler value) { wrapperContained.fluidTickScheduler = value.wrapperContained; }
// public yarnwrap.world.dimension.DimensionType dimension() { return new yarnwrap.world.dimension.DimensionType(wrapperContained.dimension); }
// public void dimension(yarnwrap.world.dimension.DimensionType value) { wrapperContained.dimension = value.wrapperContained; }
// public yarnwrap.world.WorldProperties levelProperties() { return new yarnwrap.world.WorldProperties(wrapperContained.levelProperties); }
// public void levelProperties(yarnwrap.world.WorldProperties value) { wrapperContained.levelProperties = value.wrapperContained; }
// public yarnwrap.util.collection.BoundedRegionArray chunks() { return new yarnwrap.util.collection.BoundedRegionArray(wrapperContained.chunks); }
// public void chunks(yarnwrap.util.collection.BoundedRegionArray value) { wrapperContained.chunks = value.wrapperContained; }
// public yarnwrap.world.tick.MultiTickScheduler blockTickScheduler() { return new yarnwrap.world.tick.MultiTickScheduler(wrapperContained.blockTickScheduler); }
// public void blockTickScheduler(yarnwrap.world.tick.MultiTickScheduler value) { wrapperContained.blockTickScheduler = value.wrapperContained; }
// public yarnwrap.world.biome.source.BiomeAccess biomeAccess() { return new yarnwrap.world.biome.source.BiomeAccess(wrapperContained.biomeAccess); }
// public void biomeAccess(yarnwrap.world.biome.source.BiomeAccess value) { wrapperContained.biomeAccess = value.wrapperContained; }
// public yarnwrap.world.chunk.Chunk centerPos() { return new yarnwrap.world.chunk.Chunk(wrapperContained.centerPos); }
// public void centerPos(yarnwrap.world.chunk.Chunk value) { wrapperContained.centerPos = value.wrapperContained; }
// public java.util.function.Supplier currentlyGeneratingStructureName() { return wrapperContained.currentlyGeneratingStructureName; }
// public void currentlyGeneratingStructureName(java.util.function.Supplier value) { wrapperContained.currentlyGeneratingStructureName = value; }
// public java.util.concurrent.atomic.AtomicLong tickOrder() { return wrapperContained.tickOrder; }
// public void tickOrder(java.util.concurrent.atomic.AtomicLong value) { wrapperContained.tickOrder = value; }
// public yarnwrap.util.Identifier WORLDGEN_REGION_RANDOM_ID() { return new yarnwrap.util.Identifier(wrapperContained.WORLDGEN_REGION_RANDOM_ID); }
// public void WORLDGEN_REGION_RANDOM_ID(yarnwrap.util.Identifier value) { wrapperContained.WORLDGEN_REGION_RANDOM_ID = value.wrapperContained; }
// public yarnwrap.world.chunk.ChunkGenerationStep generationStep() { return new yarnwrap.world.chunk.ChunkGenerationStep(wrapperContained.generationStep); }
// public void generationStep(yarnwrap.world.chunk.ChunkGenerationStep value) { wrapperContained.generationStep = value.wrapperContained; }
// public void markBlockForPostProcessing(yarnwrap.util.math.BlockPos pos) { wrapperContained.markBlockForPostProcessing(pos.wrapperContained); }
public yarnwrap.util.math.ChunkPos getCenterPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.getCenterPos()); }
public boolean needsBlending(yarnwrap.util.math.ChunkPos chunkPos,int checkRadius) { return wrapperContained.needsBlending(chunkPos.wrapperContained,checkRadius); }

}