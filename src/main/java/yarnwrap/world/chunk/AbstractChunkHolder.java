package yarnwrap.world.chunk;
public class AbstractChunkHolder { public net.minecraft.world.chunk.AbstractChunkHolder wrapperContained; public AbstractChunkHolder(net.minecraft.world.chunk.AbstractChunkHolder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List STATUSES() { return wrapperContained.STATUSES; }
// public void STATUSES(java.util.List value) { wrapperContained.STATUSES = value; }
public yarnwrap.server.world.OptionalChunk UNLOADED() { return new yarnwrap.server.world.OptionalChunk(wrapperContained.UNLOADED); }
// public void UNLOADED(yarnwrap.server.world.OptionalChunk value) { wrapperContained.UNLOADED = value.wrapperContained; }
public java.util.concurrent.CompletableFuture UNLOADED_FUTURE() { return wrapperContained.UNLOADED_FUTURE; }
// public void UNLOADED_FUTURE(java.util.concurrent.CompletableFuture value) { wrapperContained.UNLOADED_FUTURE = value; }
// public yarnwrap.util.math.ChunkPos pos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.ChunkPos value) { wrapperContained.pos = value.wrapperContained; }
// public yarnwrap.server.world.OptionalChunk NOT_DONE() { return new yarnwrap.server.world.OptionalChunk(wrapperContained.NOT_DONE); }
// public void NOT_DONE(yarnwrap.server.world.OptionalChunk value) { wrapperContained.NOT_DONE = value.wrapperContained; }
// public yarnwrap.world.chunk.ChunkStatus status() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.status); }
// public void status(yarnwrap.world.chunk.ChunkStatus value) { wrapperContained.status = value.wrapperContained; }
// public java.util.concurrent.atomic.AtomicReference currentStatus() { return wrapperContained.currentStatus; }
// public void currentStatus(java.util.concurrent.atomic.AtomicReference value) { wrapperContained.currentStatus = value; }
// public java.util.concurrent.atomic.AtomicReferenceArray chunkFuturesByStatus() { return wrapperContained.chunkFuturesByStatus; }
// public void chunkFuturesByStatus(java.util.concurrent.atomic.AtomicReferenceArray value) { wrapperContained.chunkFuturesByStatus = value; }
// public java.util.concurrent.atomic.AtomicReference chunkLoader() { return wrapperContained.chunkLoader; }
// public void chunkLoader(java.util.concurrent.atomic.AtomicReference value) { wrapperContained.chunkLoader = value; }
// public java.util.concurrent.atomic.AtomicInteger refCount() { return wrapperContained.refCount; }
// public void refCount(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.refCount = value; }
// public AbstractChunkHolder(yarnwrap.util.math.ChunkPos pos) { this.wrapperContained = new net.minecraft.world.chunk.AbstractChunkHolder(pos.wrapperContained); }
public int getLevel() { return wrapperContained.getLevel(); }
public int getCompletedLevel() { return wrapperContained.getCompletedLevel(); }
// public void unload(int statusIndex,java.util.concurrent.CompletableFuture previousFuture) { wrapperContained.unload(statusIndex,previousFuture); }
// public void clearLoader(yarnwrap.world.chunk.ChunkLoader loader) { wrapperContained.clearLoader(loader.wrapperContained); }
// public void updateStatus(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager) { wrapperContained.updateStatus(chunkLoadingManager.wrapperContained); }
// public void createLoader(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,yarnwrap.world.chunk.ChunkStatus requestedStatus) { wrapperContained.createLoader(chunkLoadingManager.wrapperContained,requestedStatus.wrapperContained); }
public void replaceWith(yarnwrap.world.chunk.WrapperProtoChunk chunk) { wrapperContained.replaceWith(chunk.wrapperContained); }
public yarnwrap.world.chunk.Chunk getUncheckedOrNull(yarnwrap.world.chunk.ChunkStatus requestedStatus) { return new yarnwrap.world.chunk.Chunk(wrapperContained.getUncheckedOrNull(requestedStatus.wrapperContained)); }
public java.util.concurrent.CompletableFuture load(yarnwrap.world.chunk.ChunkStatus requestedStatus,yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager) { return wrapperContained.load(requestedStatus.wrapperContained,chunkLoadingManager.wrapperContained); }
// public void completeChunkFuture(yarnwrap.world.chunk.ChunkStatus status,yarnwrap.world.chunk.Chunk chunk) { wrapperContained.completeChunkFuture(status.wrapperContained,chunk.wrapperContained); }
// public void unload(yarnwrap.world.chunk.ChunkStatus from,yarnwrap.world.chunk.ChunkStatus to) { wrapperContained.unload(from.wrapperContained,to.wrapperContained); }
// public java.util.concurrent.CompletableFuture generate(yarnwrap.world.chunk.ChunkGenerationStep step,yarnwrap.world.ChunkLoadingManager chunkLoadingManager,yarnwrap.util.collection.BoundedRegionArray chunks) { return wrapperContained.generate(step.wrapperContained,chunkLoadingManager.wrapperContained,chunks.wrapperContained); }
// public yarnwrap.server.world.OptionalChunk method_60462(yarnwrap.world.chunk.ChunkGenerationStep chunk,yarnwrap.world.chunk.Chunk throwable) { return new yarnwrap.server.world.OptionalChunk(wrapperContained.method_60462(chunk.wrapperContained,throwable.wrapperContained)); }
public yarnwrap.world.chunk.Chunk getOrNull(yarnwrap.world.chunk.ChunkStatus requestedStatus) { return new yarnwrap.world.chunk.Chunk(wrapperContained.getOrNull(requestedStatus.wrapperContained)); }
// public java.util.concurrent.CompletableFuture getOrCreateFuture(yarnwrap.world.chunk.ChunkStatus status) { return wrapperContained.getOrCreateFuture(status.wrapperContained); }
// public yarnwrap.world.chunk.ChunkStatus getMaxPendingStatus(yarnwrap.world.chunk.ChunkStatus checkUpperBound) { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.getMaxPendingStatus(checkUpperBound.wrapperContained)); }
// public boolean progressStatus(yarnwrap.world.chunk.ChunkStatus nextStatus) { return wrapperContained.progressStatus(nextStatus.wrapperContained); }
// public boolean cannotBeLoaded(yarnwrap.world.chunk.ChunkStatus status) { return wrapperContained.cannotBeLoaded(status.wrapperContained); }
public void incrementRefCount() { wrapperContained.incrementRefCount(); }
public void decrementRefCount() { wrapperContained.decrementRefCount(); }
public int getRefCount() { return wrapperContained.getRefCount(); }
public yarnwrap.world.chunk.Chunk getLatest() { return new yarnwrap.world.chunk.Chunk(wrapperContained.getLatest()); }
public yarnwrap.world.chunk.ChunkStatus getActualStatus() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.getActualStatus()); }
public yarnwrap.util.math.ChunkPos getPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.getPos()); }
public yarnwrap.server.world.ChunkLevelType getLevelType() { return new yarnwrap.server.world.ChunkLevelType(wrapperContained.getLevelType()); }
public java.util.List enumerateFutures() { return wrapperContained.enumerateFutures(); }
public yarnwrap.world.chunk.ChunkStatus getLatestStatus() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.getLatestStatus()); }

}