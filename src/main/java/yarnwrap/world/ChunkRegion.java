package yarnwrap.world;
public class ChunkRegion { public net.minecraft.world.ChunkRegion wrapperContained; public ChunkRegion(net.minecraft.world.ChunkRegion wrapperContained) { this.wrapperContained = wrapperContained; }

// public long seed() { return wrapperContained.seed; }
// public void seed(long value) { wrapperContained.seed = value; }
// public static long seed() { return net.minecraft.world.ChunkRegion.seed; }
// public static void seed(long value, ) { net.minecraft.world.ChunkRegion.seed = value; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.world.ChunkRegion.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.world.ChunkRegion.random = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.ChunkRegion.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.ChunkRegion.LOGGER = value; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.world.ChunkRegion.world); }
// public static void world(yarnwrap.server.world.ServerWorld value, ) { net.minecraft.world.ChunkRegion.world = value.wrapperContained; }

// public yarnwrap.world.tick.MultiTickScheduler fluidTickScheduler() { return new yarnwrap.world.tick.MultiTickScheduler(wrapperContained.fluidTickScheduler); }
// public void fluidTickScheduler(yarnwrap.world.tick.MultiTickScheduler value) { wrapperContained.fluidTickScheduler = value.wrapperContained; }
// public static yarnwrap.world.tick.MultiTickScheduler fluidTickScheduler() { return new yarnwrap.world.tick.MultiTickScheduler(net.minecraft.world.ChunkRegion.fluidTickScheduler); }
// public static void fluidTickScheduler(yarnwrap.world.tick.MultiTickScheduler value, ) { net.minecraft.world.ChunkRegion.fluidTickScheduler = value.wrapperContained; }

// public yarnwrap.world.dimension.DimensionType dimension() { return new yarnwrap.world.dimension.DimensionType(wrapperContained.dimension); }
// public void dimension(yarnwrap.world.dimension.DimensionType value) { wrapperContained.dimension = value.wrapperContained; }
// public static yarnwrap.world.dimension.DimensionType dimension() { return new yarnwrap.world.dimension.DimensionType(net.minecraft.world.ChunkRegion.dimension); }
// public static void dimension(yarnwrap.world.dimension.DimensionType value, ) { net.minecraft.world.ChunkRegion.dimension = value.wrapperContained; }

// public yarnwrap.world.WorldProperties levelProperties() { return new yarnwrap.world.WorldProperties(wrapperContained.levelProperties); }
// public void levelProperties(yarnwrap.world.WorldProperties value) { wrapperContained.levelProperties = value.wrapperContained; }
// public static yarnwrap.world.WorldProperties levelProperties() { return new yarnwrap.world.WorldProperties(net.minecraft.world.ChunkRegion.levelProperties); }
// public static void levelProperties(yarnwrap.world.WorldProperties value, ) { net.minecraft.world.ChunkRegion.levelProperties = value.wrapperContained; }

// public yarnwrap.util.collection.BoundedRegionArray chunks() { return new yarnwrap.util.collection.BoundedRegionArray(wrapperContained.chunks); }
// public void chunks(yarnwrap.util.collection.BoundedRegionArray value) { wrapperContained.chunks = value.wrapperContained; }
// public static yarnwrap.util.collection.BoundedRegionArray chunks() { return new yarnwrap.util.collection.BoundedRegionArray(net.minecraft.world.ChunkRegion.chunks); }
// public static void chunks(yarnwrap.util.collection.BoundedRegionArray value, ) { net.minecraft.world.ChunkRegion.chunks = value.wrapperContained; }

// public yarnwrap.world.tick.MultiTickScheduler blockTickScheduler() { return new yarnwrap.world.tick.MultiTickScheduler(wrapperContained.blockTickScheduler); }
// public void blockTickScheduler(yarnwrap.world.tick.MultiTickScheduler value) { wrapperContained.blockTickScheduler = value.wrapperContained; }
// public static yarnwrap.world.tick.MultiTickScheduler blockTickScheduler() { return new yarnwrap.world.tick.MultiTickScheduler(net.minecraft.world.ChunkRegion.blockTickScheduler); }
// public static void blockTickScheduler(yarnwrap.world.tick.MultiTickScheduler value, ) { net.minecraft.world.ChunkRegion.blockTickScheduler = value.wrapperContained; }

// public yarnwrap.world.biome.source.BiomeAccess biomeAccess() { return new yarnwrap.world.biome.source.BiomeAccess(wrapperContained.biomeAccess); }
// public void biomeAccess(yarnwrap.world.biome.source.BiomeAccess value) { wrapperContained.biomeAccess = value.wrapperContained; }
// public static yarnwrap.world.biome.source.BiomeAccess biomeAccess() { return new yarnwrap.world.biome.source.BiomeAccess(net.minecraft.world.ChunkRegion.biomeAccess); }
// public static void biomeAccess(yarnwrap.world.biome.source.BiomeAccess value, ) { net.minecraft.world.ChunkRegion.biomeAccess = value.wrapperContained; }

// public yarnwrap.world.chunk.Chunk centerPos() { return new yarnwrap.world.chunk.Chunk(wrapperContained.centerPos); }
// public void centerPos(yarnwrap.world.chunk.Chunk value) { wrapperContained.centerPos = value.wrapperContained; }
// public static yarnwrap.world.chunk.Chunk centerPos() { return new yarnwrap.world.chunk.Chunk(net.minecraft.world.ChunkRegion.centerPos); }
// public static void centerPos(yarnwrap.world.chunk.Chunk value, ) { net.minecraft.world.ChunkRegion.centerPos = value.wrapperContained; }

// public java.util.function.Supplier currentlyGeneratingStructureName() { return wrapperContained.currentlyGeneratingStructureName; }
// public void currentlyGeneratingStructureName(java.util.function.Supplier value) { wrapperContained.currentlyGeneratingStructureName = value; }
// public static java.util.function.Supplier currentlyGeneratingStructureName() { return net.minecraft.world.ChunkRegion.currentlyGeneratingStructureName; }
// public static void currentlyGeneratingStructureName(java.util.function.Supplier value, ) { net.minecraft.world.ChunkRegion.currentlyGeneratingStructureName = value; }

// public java.util.concurrent.atomic.AtomicLong tickOrder() { return wrapperContained.tickOrder; }
// public void tickOrder(java.util.concurrent.atomic.AtomicLong value) { wrapperContained.tickOrder = value; }
// public static java.util.concurrent.atomic.AtomicLong tickOrder() { return net.minecraft.world.ChunkRegion.tickOrder; }
// public static void tickOrder(java.util.concurrent.atomic.AtomicLong value, ) { net.minecraft.world.ChunkRegion.tickOrder = value; }

// public yarnwrap.util.Identifier WORLDGEN_REGION_RANDOM_ID() { return new yarnwrap.util.Identifier(wrapperContained.WORLDGEN_REGION_RANDOM_ID); }
// public void WORLDGEN_REGION_RANDOM_ID(yarnwrap.util.Identifier value) { wrapperContained.WORLDGEN_REGION_RANDOM_ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier WORLDGEN_REGION_RANDOM_ID() { return new yarnwrap.util.Identifier(net.minecraft.world.ChunkRegion.WORLDGEN_REGION_RANDOM_ID); }
// public static void WORLDGEN_REGION_RANDOM_ID(yarnwrap.util.Identifier value, ) { net.minecraft.world.ChunkRegion.WORLDGEN_REGION_RANDOM_ID = value.wrapperContained; }

// public yarnwrap.world.chunk.ChunkGenerationStep generationStep() { return new yarnwrap.world.chunk.ChunkGenerationStep(wrapperContained.generationStep); }
// public void generationStep(yarnwrap.world.chunk.ChunkGenerationStep value) { wrapperContained.generationStep = value.wrapperContained; }
// public static yarnwrap.world.chunk.ChunkGenerationStep generationStep() { return new yarnwrap.world.chunk.ChunkGenerationStep(net.minecraft.world.ChunkRegion.generationStep); }
// public static void generationStep(yarnwrap.world.chunk.ChunkGenerationStep value, ) { net.minecraft.world.ChunkRegion.generationStep = value.wrapperContained; }

public ChunkRegion(yarnwrap.server.world.ServerWorld world,yarnwrap.util.collection.BoundedRegionArray chunks,yarnwrap.world.chunk.ChunkGenerationStep generationStep,yarnwrap.world.chunk.Chunk centerPos) { this.wrapperContained = new net.minecraft.world.ChunkRegion(world.wrapperContained,chunks.wrapperContained,generationStep.wrapperContained,centerPos.wrapperContained); }
// public yarnwrap.world.tick.BasicTickScheduler method_14337(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.world.tick.BasicTickScheduler(wrapperContained.method_14337(pos.wrapperContained)); }
// public static yarnwrap.world.tick.BasicTickScheduler method_14337(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.world.tick.BasicTickScheduler(net.minecraft.world.ChunkRegion.method_14337(pos.wrapperContained)); }
// public void markBlockForPostProcessing(yarnwrap.util.math.BlockPos pos) { wrapperContained.markBlockForPostProcessing(pos.wrapperContained); }
// public static void markBlockForPostProcessing(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.world.ChunkRegion.markBlockForPostProcessing(pos.wrapperContained); }
// public yarnwrap.world.tick.BasicTickScheduler method_14340(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.world.tick.BasicTickScheduler(wrapperContained.method_14340(pos.wrapperContained)); }
// public static yarnwrap.world.tick.BasicTickScheduler method_14340(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.world.tick.BasicTickScheduler(net.minecraft.world.ChunkRegion.method_14340(pos.wrapperContained)); }
public yarnwrap.util.math.ChunkPos getCenterPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.getCenterPos()); }
// public static yarnwrap.util.math.ChunkPos getCenterPos() { return new yarnwrap.util.math.ChunkPos(net.minecraft.world.ChunkRegion.getCenterPos()); }
public boolean needsBlending(yarnwrap.util.math.ChunkPos chunkPos,int checkRadius) { return wrapperContained.needsBlending(chunkPos.wrapperContained,checkRadius); }
// public static boolean needsBlending(yarnwrap.util.math.ChunkPos chunkPos,int checkRadius, ) { return net.minecraft.world.ChunkRegion.needsBlending(chunkPos.wrapperContained,checkRadius); }

}