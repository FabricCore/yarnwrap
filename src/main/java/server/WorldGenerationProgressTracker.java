package yarnwrap.server;
public class WorldGenerationProgressTracker { public net.minecraft.server.WorldGenerationProgressTracker wrapperContained; public WorldGenerationProgressTracker(net.minecraft.server.WorldGenerationProgressTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.WorldGenerationProgressLogger progressLogger() { return new yarnwrap.server.WorldGenerationProgressLogger(wrapperContained.progressLogger); }
// public it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap chunkStatuses() { return wrapperContained.chunkStatuses; }
// public yarnwrap.util.math.ChunkPos spawnPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.spawnPos); }
// public int centerSize() { return wrapperContained.centerSize; }
// public int radius() { return wrapperContained.radius; }
// public int size() { return wrapperContained.size; }
// public boolean running() { return wrapperContained.running; }
public yarnwrap.world.chunk.ChunkStatus getChunkStatus(int x,int z) { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.getChunkStatus(x,z)); }
public int getCenterSize() { return wrapperContained.getCenterSize(); }
public int getSize() { return wrapperContained.getSize(); }
public int getProgressPercentage() { return wrapperContained.getProgressPercentage(); }
public yarnwrap.server.WorldGenerationProgressTracker create(int spawnChunkRadius) { return new yarnwrap.server.WorldGenerationProgressTracker(wrapperContained.create(spawnChunkRadius)); }
public yarnwrap.server.WorldGenerationProgressTracker noSpawnChunks() { return new yarnwrap.server.WorldGenerationProgressTracker(wrapperContained.noSpawnChunks()); }
public yarnwrap.server.WorldGenerationProgressTracker forSpawnChunks(int spawnChunkRadius) { return new yarnwrap.server.WorldGenerationProgressTracker(wrapperContained.forSpawnChunks(spawnChunkRadius)); }

}