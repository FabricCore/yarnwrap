package yarnwrap.server;
public class WorldGenerationProgressTracker { public net.minecraft.server.WorldGenerationProgressTracker wrapperContained; public WorldGenerationProgressTracker(net.minecraft.server.WorldGenerationProgressTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.WorldGenerationProgressLogger progressLogger() { return new yarnwrap.server.WorldGenerationProgressLogger(wrapperContained.progressLogger); }
// public void progressLogger(yarnwrap.server.WorldGenerationProgressLogger value) { wrapperContained.progressLogger = value.wrapperContained; }
// public static yarnwrap.server.WorldGenerationProgressLogger progressLogger() { return new yarnwrap.server.WorldGenerationProgressLogger(net.minecraft.server.WorldGenerationProgressTracker.progressLogger); }
// public static void progressLogger(yarnwrap.server.WorldGenerationProgressLogger value, ) { net.minecraft.server.WorldGenerationProgressTracker.progressLogger = value.wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap chunkStatuses() { return wrapperContained.chunkStatuses; }
// public void chunkStatuses(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value) { wrapperContained.chunkStatuses = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap chunkStatuses() { return net.minecraft.server.WorldGenerationProgressTracker.chunkStatuses; }
// public static void chunkStatuses(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value, ) { net.minecraft.server.WorldGenerationProgressTracker.chunkStatuses = value; }

// public yarnwrap.util.math.ChunkPos spawnPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.spawnPos); }
// public void spawnPos(yarnwrap.util.math.ChunkPos value) { wrapperContained.spawnPos = value.wrapperContained; }
// public static yarnwrap.util.math.ChunkPos spawnPos() { return new yarnwrap.util.math.ChunkPos(net.minecraft.server.WorldGenerationProgressTracker.spawnPos); }
// public static void spawnPos(yarnwrap.util.math.ChunkPos value, ) { net.minecraft.server.WorldGenerationProgressTracker.spawnPos = value.wrapperContained; }

// public int centerSize() { return wrapperContained.centerSize; }
// public void centerSize(int value) { wrapperContained.centerSize = value; }
// public static int centerSize() { return net.minecraft.server.WorldGenerationProgressTracker.centerSize; }
// public static void centerSize(int value, ) { net.minecraft.server.WorldGenerationProgressTracker.centerSize = value; }

// public int radius() { return wrapperContained.radius; }
// public void radius(int value) { wrapperContained.radius = value; }
// public static int radius() { return net.minecraft.server.WorldGenerationProgressTracker.radius; }
// public static void radius(int value, ) { net.minecraft.server.WorldGenerationProgressTracker.radius = value; }

// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
// public static int size() { return net.minecraft.server.WorldGenerationProgressTracker.size; }
// public static void size(int value, ) { net.minecraft.server.WorldGenerationProgressTracker.size = value; }

// public boolean running() { return wrapperContained.running; }
// public void running(boolean value) { wrapperContained.running = value; }
// public static boolean running() { return net.minecraft.server.WorldGenerationProgressTracker.running; }
// public static void running(boolean value, ) { net.minecraft.server.WorldGenerationProgressTracker.running = value; }

// public WorldGenerationProgressTracker(yarnwrap.server.WorldGenerationProgressLogger progressLogger,int centerSize,int radius,int size) { this.wrapperContained = new net.minecraft.server.WorldGenerationProgressTracker(progressLogger.wrapperContained,centerSize,radius,size); }
public yarnwrap.world.chunk.ChunkStatus getChunkStatus(int x,int z) { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.getChunkStatus(x,z)); }
// public static yarnwrap.world.chunk.ChunkStatus getChunkStatus(int x,int z, ) { return new yarnwrap.world.chunk.ChunkStatus(net.minecraft.server.WorldGenerationProgressTracker.getChunkStatus(x,z)); }
public int getCenterSize() { return wrapperContained.getCenterSize(); }
// public static int getCenterSize() { return net.minecraft.server.WorldGenerationProgressTracker.getCenterSize(); }
public int getSize() { return wrapperContained.getSize(); }
// public static int getSize() { return net.minecraft.server.WorldGenerationProgressTracker.getSize(); }
public int getProgressPercentage() { return wrapperContained.getProgressPercentage(); }
// public static int getProgressPercentage() { return net.minecraft.server.WorldGenerationProgressTracker.getProgressPercentage(); }
// public yarnwrap.server.WorldGenerationProgressTracker create(int spawnChunkRadius) { return new yarnwrap.server.WorldGenerationProgressTracker(wrapperContained.create(spawnChunkRadius)); }
// public static yarnwrap.server.WorldGenerationProgressTracker create(int spawnChunkRadius, ) { return new yarnwrap.server.WorldGenerationProgressTracker(net.minecraft.server.WorldGenerationProgressTracker.create(spawnChunkRadius)); }
// public yarnwrap.server.WorldGenerationProgressTracker noSpawnChunks() { return new yarnwrap.server.WorldGenerationProgressTracker(wrapperContained.noSpawnChunks()); }
public static yarnwrap.server.WorldGenerationProgressTracker noSpawnChunks() { return new yarnwrap.server.WorldGenerationProgressTracker(net.minecraft.server.WorldGenerationProgressTracker.noSpawnChunks()); }
// public yarnwrap.server.WorldGenerationProgressTracker forSpawnChunks(int spawnChunkRadius) { return new yarnwrap.server.WorldGenerationProgressTracker(wrapperContained.forSpawnChunks(spawnChunkRadius)); }
// public static yarnwrap.server.WorldGenerationProgressTracker forSpawnChunks(int spawnChunkRadius, ) { return new yarnwrap.server.WorldGenerationProgressTracker(net.minecraft.server.WorldGenerationProgressTracker.forSpawnChunks(spawnChunkRadius)); }

}