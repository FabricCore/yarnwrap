package yarnwrap.world;
public class ChunkRegion { public net.minecraft.world.ChunkRegion wrapperContained; public ChunkRegion(net.minecraft.world.ChunkRegion wrapperContained) { this.wrapperContained = wrapperContained; }

// public long seed() { return wrapperContained.seed; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public yarnwrap.world.tick.MultiTickScheduler fluidTickScheduler() { return new yarnwrap.world.tick.MultiTickScheduler(wrapperContained.fluidTickScheduler); }
// public yarnwrap.world.dimension.DimensionType dimension() { return new yarnwrap.world.dimension.DimensionType(wrapperContained.dimension); }
// public yarnwrap.world.WorldProperties levelProperties() { return new yarnwrap.world.WorldProperties(wrapperContained.levelProperties); }
// public yarnwrap.util.collection.BoundedRegionArray chunks() { return new yarnwrap.util.collection.BoundedRegionArray(wrapperContained.chunks); }
// public yarnwrap.world.tick.MultiTickScheduler blockTickScheduler() { return new yarnwrap.world.tick.MultiTickScheduler(wrapperContained.blockTickScheduler); }
// public yarnwrap.world.biome.source.BiomeAccess biomeAccess() { return new yarnwrap.world.biome.source.BiomeAccess(wrapperContained.biomeAccess); }
// public yarnwrap.world.chunk.Chunk centerPos() { return new yarnwrap.world.chunk.Chunk(wrapperContained.centerPos); }
// public java.util.function.Supplier currentlyGeneratingStructureName() { return wrapperContained.currentlyGeneratingStructureName; }
// public java.util.concurrent.atomic.AtomicLong tickOrder() { return wrapperContained.tickOrder; }
// public yarnwrap.util.Identifier WORLDGEN_REGION_RANDOM_ID() { return new yarnwrap.util.Identifier(wrapperContained.WORLDGEN_REGION_RANDOM_ID); }
// public yarnwrap.world.chunk.ChunkGenerationStep generationStep() { return new yarnwrap.world.chunk.ChunkGenerationStep(wrapperContained.generationStep); }
// public void markBlockForPostProcessing(yarnwrap.util.math.BlockPos pos) { wrapperContained.markBlockForPostProcessing(pos.wrapperContained); }
public yarnwrap.util.math.ChunkPos getCenterPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.getCenterPos()); }
public boolean needsBlending(yarnwrap.util.math.ChunkPos chunkPos,int checkRadius) { return wrapperContained.needsBlending(chunkPos.wrapperContained,checkRadius); }

}