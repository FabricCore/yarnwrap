package yarnwrap.server;
public class WorldGenerationProgressLogger { public net.minecraft.server.WorldGenerationProgressLogger wrapperContained; public WorldGenerationProgressLogger(net.minecraft.server.WorldGenerationProgressLogger wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.WorldGenerationProgressLogger.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.WorldGenerationProgressLogger.LOGGER = value; }

// public int totalCount() { return wrapperContained.totalCount; }
// public void totalCount(int value) { wrapperContained.totalCount = value; }
// public static int totalCount() { return net.minecraft.server.WorldGenerationProgressLogger.totalCount; }
// public static void totalCount(int value, ) { net.minecraft.server.WorldGenerationProgressLogger.totalCount = value; }

// public int generatedCount() { return wrapperContained.generatedCount; }
// public void generatedCount(int value) { wrapperContained.generatedCount = value; }
// public static int generatedCount() { return net.minecraft.server.WorldGenerationProgressLogger.generatedCount; }
// public static void generatedCount(int value, ) { net.minecraft.server.WorldGenerationProgressLogger.generatedCount = value; }

// public long startTime() { return wrapperContained.startTime; }
// public void startTime(long value) { wrapperContained.startTime = value; }
// public static long startTime() { return net.minecraft.server.WorldGenerationProgressLogger.startTime; }
// public static void startTime(long value, ) { net.minecraft.server.WorldGenerationProgressLogger.startTime = value; }

// public long nextMessageTime() { return wrapperContained.nextMessageTime; }
// public void nextMessageTime(long value) { wrapperContained.nextMessageTime = value; }
// public static long nextMessageTime() { return net.minecraft.server.WorldGenerationProgressLogger.nextMessageTime; }
// public static void nextMessageTime(long value, ) { net.minecraft.server.WorldGenerationProgressLogger.nextMessageTime = value; }

// public WorldGenerationProgressLogger(int radius) { this.wrapperContained = new net.minecraft.server.WorldGenerationProgressLogger(radius); }
public int getProgressPercentage() { return wrapperContained.getProgressPercentage(); }
// public static int getProgressPercentage() { return net.minecraft.server.WorldGenerationProgressLogger.getProgressPercentage(); }
// public yarnwrap.server.WorldGenerationProgressLogger create(int spawnChunkRadius) { return new yarnwrap.server.WorldGenerationProgressLogger(wrapperContained.create(spawnChunkRadius)); }
// public static yarnwrap.server.WorldGenerationProgressLogger create(int spawnChunkRadius, ) { return new yarnwrap.server.WorldGenerationProgressLogger(net.minecraft.server.WorldGenerationProgressLogger.create(spawnChunkRadius)); }
// public yarnwrap.server.WorldGenerationProgressLogger noSpawnChunks() { return new yarnwrap.server.WorldGenerationProgressLogger(wrapperContained.noSpawnChunks()); }
public static yarnwrap.server.WorldGenerationProgressLogger noSpawnChunks() { return new yarnwrap.server.WorldGenerationProgressLogger(net.minecraft.server.WorldGenerationProgressLogger.noSpawnChunks()); }
// public yarnwrap.server.WorldGenerationProgressLogger forSpawnChunks(int spawnChunkRadius) { return new yarnwrap.server.WorldGenerationProgressLogger(wrapperContained.forSpawnChunks(spawnChunkRadius)); }
// public static yarnwrap.server.WorldGenerationProgressLogger forSpawnChunks(int spawnChunkRadius, ) { return new yarnwrap.server.WorldGenerationProgressLogger(net.minecraft.server.WorldGenerationProgressLogger.forSpawnChunks(spawnChunkRadius)); }

}