package yarnwrap.server;
public class WorldGenerationProgressListener { public net.minecraft.server.WorldGenerationProgressListener wrapperContained; public WorldGenerationProgressListener(net.minecraft.server.WorldGenerationProgressListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void start(yarnwrap.util.math.ChunkPos spawnPos) { wrapperContained.start(spawnPos.wrapperContained); }
// public static void start(yarnwrap.util.math.ChunkPos spawnPos, ) { net.minecraft.server.WorldGenerationProgressListener.start(spawnPos.wrapperContained); }
public void setChunkStatus(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.chunk.ChunkStatus status) { wrapperContained.setChunkStatus(pos.wrapperContained,status.wrapperContained); }
// public static void setChunkStatus(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.chunk.ChunkStatus status, ) { net.minecraft.server.WorldGenerationProgressListener.setChunkStatus(pos.wrapperContained,status.wrapperContained); }
public void stop() { wrapperContained.stop(); }
// public static void stop() { net.minecraft.server.WorldGenerationProgressListener.stop(); }
public void start() { wrapperContained.start(); }
// public static void start() { net.minecraft.server.WorldGenerationProgressListener.start(); }
// public int getStartRegionSize(int spawnChunkRadius) { return wrapperContained.getStartRegionSize(spawnChunkRadius); }
// public static int getStartRegionSize(int spawnChunkRadius, ) { return net.minecraft.server.WorldGenerationProgressListener.getStartRegionSize(spawnChunkRadius); }

}