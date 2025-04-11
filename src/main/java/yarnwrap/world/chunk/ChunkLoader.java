package yarnwrap.world.chunk;
public class ChunkLoader { public net.minecraft.world.chunk.ChunkLoader wrapperContained; public ChunkLoader(net.minecraft.world.chunk.ChunkLoader wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.chunk.ChunkStatus targetStatus() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.targetStatus); }
// public void targetStatus(yarnwrap.world.chunk.ChunkStatus value) { wrapperContained.targetStatus = value.wrapperContained; }
// public yarnwrap.world.ChunkLoadingManager chunkLoadingManager() { return new yarnwrap.world.ChunkLoadingManager(wrapperContained.chunkLoadingManager); }
// public void chunkLoadingManager(yarnwrap.world.ChunkLoadingManager value) { wrapperContained.chunkLoadingManager = value.wrapperContained; }
// public yarnwrap.util.math.ChunkPos pos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.ChunkPos value) { wrapperContained.pos = value.wrapperContained; }
// public yarnwrap.world.chunk.ChunkStatus currentlyLoadingStatus() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.currentlyLoadingStatus); }
// public void currentlyLoadingStatus(yarnwrap.world.chunk.ChunkStatus value) { wrapperContained.currentlyLoadingStatus = value.wrapperContained; }
// public boolean pendingDisposal() { return wrapperContained.pendingDisposal; }
// public void pendingDisposal(boolean value) { wrapperContained.pendingDisposal = value; }
// public java.util.List futures() { return wrapperContained.futures; }
// public void futures(java.util.List value) { wrapperContained.futures = value; }
// public yarnwrap.util.collection.BoundedRegionArray chunks() { return new yarnwrap.util.collection.BoundedRegionArray(wrapperContained.chunks); }
// public void chunks(yarnwrap.util.collection.BoundedRegionArray value) { wrapperContained.chunks = value.wrapperContained; }
// public boolean allowGeneration() { return wrapperContained.allowGeneration; }
// public void allowGeneration(boolean value) { wrapperContained.allowGeneration = value; }
public java.util.concurrent.CompletableFuture run() { return wrapperContained.run(); }
public yarnwrap.world.chunk.ChunkLoader create(yarnwrap.world.ChunkLoadingManager chunkLoadingManager,yarnwrap.world.chunk.ChunkStatus targetStatus,yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.world.chunk.ChunkLoader(wrapperContained.create(chunkLoadingManager.wrapperContained,targetStatus.wrapperContained,pos.wrapperContained)); }
// public void loadAll(yarnwrap.world.chunk.ChunkStatus targetStatus,boolean allowGeneration) { wrapperContained.loadAll(targetStatus.wrapperContained,allowGeneration); }
// public boolean load(yarnwrap.world.chunk.ChunkStatus targetStatus,boolean allowGeneration,yarnwrap.world.chunk.AbstractChunkHolder chunkHolder) { return wrapperContained.load(targetStatus.wrapperContained,allowGeneration,chunkHolder.wrapperContained); }
public void markPendingDisposal() { wrapperContained.markPendingDisposal(); }
// public int getAdditionalLevel(yarnwrap.world.chunk.ChunkStatus status,boolean generate) { return wrapperContained.getAdditionalLevel(status.wrapperContained,generate); }
public yarnwrap.world.chunk.AbstractChunkHolder getHolder() { return new yarnwrap.world.chunk.AbstractChunkHolder(wrapperContained.getHolder()); }
// public void loadNextStatus() { wrapperContained.loadNextStatus(); }
// public void dispose() { wrapperContained.dispose(); }
// public boolean isGenerationUnnecessary() { return wrapperContained.isGenerationUnnecessary(); }
// public java.util.concurrent.CompletableFuture getLatestPendingFuture() { return wrapperContained.getLatestPendingFuture(); }

}