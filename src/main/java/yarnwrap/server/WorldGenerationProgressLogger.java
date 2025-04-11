package yarnwrap.server;
public class WorldGenerationProgressLogger { public net.minecraft.server.WorldGenerationProgressLogger wrapperContained; public WorldGenerationProgressLogger(net.minecraft.server.WorldGenerationProgressLogger wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int totalCount() { return wrapperContained.totalCount; }
// public void totalCount(int value) { wrapperContained.totalCount = value; }
// public int generatedCount() { return wrapperContained.generatedCount; }
// public void generatedCount(int value) { wrapperContained.generatedCount = value; }
// public long startTime() { return wrapperContained.startTime; }
// public void startTime(long value) { wrapperContained.startTime = value; }
// public long nextMessageTime() { return wrapperContained.nextMessageTime; }
// public void nextMessageTime(long value) { wrapperContained.nextMessageTime = value; }
// public WorldGenerationProgressLogger(int radius) { this.wrapperContained = new net.minecraft.server.WorldGenerationProgressLogger(radius); }
public int getProgressPercentage() { return wrapperContained.getProgressPercentage(); }
public yarnwrap.server.WorldGenerationProgressLogger create(int spawnChunkRadius) { return new yarnwrap.server.WorldGenerationProgressLogger(wrapperContained.create(spawnChunkRadius)); }
public yarnwrap.server.WorldGenerationProgressLogger noSpawnChunks() { return new yarnwrap.server.WorldGenerationProgressLogger(wrapperContained.noSpawnChunks()); }
public yarnwrap.server.WorldGenerationProgressLogger forSpawnChunks(int spawnChunkRadius) { return new yarnwrap.server.WorldGenerationProgressLogger(wrapperContained.forSpawnChunks(spawnChunkRadius)); }

}