package yarnwrap.server;
public class WorldGenerationProgressListener { public net.minecraft.server.WorldGenerationProgressListener wrapperContained; public WorldGenerationProgressListener(net.minecraft.server.WorldGenerationProgressListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void start(yarnwrap.util.math.ChunkPos spawnPos) { wrapperContained.start(spawnPos.wrapperContained); }
public void setChunkStatus(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.chunk.ChunkStatus status) { wrapperContained.setChunkStatus(pos.wrapperContained,status.wrapperContained); }
public void stop() { wrapperContained.stop(); }
public void start() { wrapperContained.start(); }
// public int getStartRegionSize(int spawnChunkRadius) { return wrapperContained.getStartRegionSize(spawnChunkRadius); }

}