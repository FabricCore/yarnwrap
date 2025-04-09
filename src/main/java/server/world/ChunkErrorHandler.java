package yarnwrap.server.world;
public class ChunkErrorHandler { public net.minecraft.server.world.ChunkErrorHandler wrapperContained; public ChunkErrorHandler(net.minecraft.server.world.ChunkErrorHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public void onChunkLoadFailure(java.lang.Throwable exception,yarnwrap.world.storage.StorageKey key,yarnwrap.util.math.ChunkPos chunkPos) { wrapperContained.onChunkLoadFailure(exception,key.wrapperContained,chunkPos.wrapperContained); }
public void onChunkSaveFailure(java.lang.Throwable exception,yarnwrap.world.storage.StorageKey key,yarnwrap.util.math.ChunkPos chunkPos) { wrapperContained.onChunkSaveFailure(exception,key.wrapperContained,chunkPos.wrapperContained); }
// public yarnwrap.util.crash.CrashException createMisplacementException(yarnwrap.util.math.ChunkPos actualPos,yarnwrap.util.math.ChunkPos expectedPos) { return new yarnwrap.util.crash.CrashException(wrapperContained.createMisplacementException(actualPos.wrapperContained,expectedPos.wrapperContained)); }
public void onChunkMisplacement(yarnwrap.util.math.ChunkPos actualPos,yarnwrap.util.math.ChunkPos expectedPos,yarnwrap.world.storage.StorageKey key) { wrapperContained.onChunkMisplacement(actualPos.wrapperContained,expectedPos.wrapperContained,key.wrapperContained); }

}