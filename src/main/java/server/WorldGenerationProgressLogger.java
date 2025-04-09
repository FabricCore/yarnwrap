package yarnwrap.server;
public class WorldGenerationProgressLogger { public net.minecraft.server.WorldGenerationProgressLogger wrapperContained; public WorldGenerationProgressLogger(net.minecraft.server.WorldGenerationProgressLogger wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int totalCount() { return wrapperContained.totalCount; }
// public int generatedCount() { return wrapperContained.generatedCount; }
// public long startTime() { return wrapperContained.startTime; }
// public long nextMessageTime() { return wrapperContained.nextMessageTime; }
public int getProgressPercentage() { return wrapperContained.getProgressPercentage(); }
public yarnwrap.server.WorldGenerationProgressLogger create(int spawnChunkRadius) { return new yarnwrap.server.WorldGenerationProgressLogger(wrapperContained.create(spawnChunkRadius)); }
public yarnwrap.server.WorldGenerationProgressLogger noSpawnChunks() { return new yarnwrap.server.WorldGenerationProgressLogger(wrapperContained.noSpawnChunks()); }
public yarnwrap.server.WorldGenerationProgressLogger forSpawnChunks(int spawnChunkRadius) { return new yarnwrap.server.WorldGenerationProgressLogger(wrapperContained.forSpawnChunks(spawnChunkRadius)); }

}