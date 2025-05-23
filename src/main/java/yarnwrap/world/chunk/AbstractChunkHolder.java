package yarnwrap.world.chunk;
public class AbstractChunkHolder { public net.minecraft.world.chunk.AbstractChunkHolder wrapperContained; public AbstractChunkHolder(net.minecraft.world.chunk.AbstractChunkHolder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List STATUSES() { return wrapperContained.STATUSES; }
// public void STATUSES(java.util.List value) { wrapperContained.STATUSES = value; }
// public static java.util.List STATUSES() { return net.minecraft.world.chunk.AbstractChunkHolder.STATUSES; }
// public static void STATUSES(java.util.List value, ) { net.minecraft.world.chunk.AbstractChunkHolder.STATUSES = value; }

// public yarnwrap.server.world.OptionalChunk UNLOADED() { return new yarnwrap.server.world.OptionalChunk(wrapperContained.UNLOADED); }
// public void UNLOADED(yarnwrap.server.world.OptionalChunk value) { wrapperContained.UNLOADED = value.wrapperContained; }
public static yarnwrap.server.world.OptionalChunk UNLOADED() { return new yarnwrap.server.world.OptionalChunk(net.minecraft.world.chunk.AbstractChunkHolder.UNLOADED); }
// public static void UNLOADED(yarnwrap.server.world.OptionalChunk value, ) { net.minecraft.world.chunk.AbstractChunkHolder.UNLOADED = value.wrapperContained; }

// public java.util.concurrent.CompletableFuture UNLOADED_FUTURE() { return wrapperContained.UNLOADED_FUTURE; }
// public void UNLOADED_FUTURE(java.util.concurrent.CompletableFuture value) { wrapperContained.UNLOADED_FUTURE = value; }
public static java.util.concurrent.CompletableFuture UNLOADED_FUTURE() { return net.minecraft.world.chunk.AbstractChunkHolder.UNLOADED_FUTURE; }
// public static void UNLOADED_FUTURE(java.util.concurrent.CompletableFuture value, ) { net.minecraft.world.chunk.AbstractChunkHolder.UNLOADED_FUTURE = value; }

// public yarnwrap.util.math.ChunkPos pos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.ChunkPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.ChunkPos pos() { return new yarnwrap.util.math.ChunkPos(net.minecraft.world.chunk.AbstractChunkHolder.pos); }
// public static void pos(yarnwrap.util.math.ChunkPos value, ) { net.minecraft.world.chunk.AbstractChunkHolder.pos = value.wrapperContained; }

// public yarnwrap.server.world.OptionalChunk NOT_DONE() { return new yarnwrap.server.world.OptionalChunk(wrapperContained.NOT_DONE); }
// public void NOT_DONE(yarnwrap.server.world.OptionalChunk value) { wrapperContained.NOT_DONE = value.wrapperContained; }
// public static yarnwrap.server.world.OptionalChunk NOT_DONE() { return new yarnwrap.server.world.OptionalChunk(net.minecraft.world.chunk.AbstractChunkHolder.NOT_DONE); }
// public static void NOT_DONE(yarnwrap.server.world.OptionalChunk value, ) { net.minecraft.world.chunk.AbstractChunkHolder.NOT_DONE = value.wrapperContained; }

// public yarnwrap.world.chunk.ChunkStatus status() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.status); }
// public void status(yarnwrap.world.chunk.ChunkStatus value) { wrapperContained.status = value.wrapperContained; }
// public static yarnwrap.world.chunk.ChunkStatus status() { return new yarnwrap.world.chunk.ChunkStatus(net.minecraft.world.chunk.AbstractChunkHolder.status); }
// public static void status(yarnwrap.world.chunk.ChunkStatus value, ) { net.minecraft.world.chunk.AbstractChunkHolder.status = value.wrapperContained; }

// public java.util.concurrent.atomic.AtomicReference currentStatus() { return wrapperContained.currentStatus; }
// public void currentStatus(java.util.concurrent.atomic.AtomicReference value) { wrapperContained.currentStatus = value; }
// public static java.util.concurrent.atomic.AtomicReference currentStatus() { return net.minecraft.world.chunk.AbstractChunkHolder.currentStatus; }
// public static void currentStatus(java.util.concurrent.atomic.AtomicReference value, ) { net.minecraft.world.chunk.AbstractChunkHolder.currentStatus = value; }

// public java.util.concurrent.atomic.AtomicReferenceArray chunkFuturesByStatus() { return wrapperContained.chunkFuturesByStatus; }
// public void chunkFuturesByStatus(java.util.concurrent.atomic.AtomicReferenceArray value) { wrapperContained.chunkFuturesByStatus = value; }
// public static java.util.concurrent.atomic.AtomicReferenceArray chunkFuturesByStatus() { return net.minecraft.world.chunk.AbstractChunkHolder.chunkFuturesByStatus; }
// public static void chunkFuturesByStatus(java.util.concurrent.atomic.AtomicReferenceArray value, ) { net.minecraft.world.chunk.AbstractChunkHolder.chunkFuturesByStatus = value; }

// public java.util.concurrent.atomic.AtomicReference chunkLoader() { return wrapperContained.chunkLoader; }
// public void chunkLoader(java.util.concurrent.atomic.AtomicReference value) { wrapperContained.chunkLoader = value; }
// public static java.util.concurrent.atomic.AtomicReference chunkLoader() { return net.minecraft.world.chunk.AbstractChunkHolder.chunkLoader; }
// public static void chunkLoader(java.util.concurrent.atomic.AtomicReference value, ) { net.minecraft.world.chunk.AbstractChunkHolder.chunkLoader = value; }

// public java.util.concurrent.atomic.AtomicInteger refCount() { return wrapperContained.refCount; }
// public void refCount(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.refCount = value; }
// public static java.util.concurrent.atomic.AtomicInteger refCount() { return net.minecraft.world.chunk.AbstractChunkHolder.refCount; }
// public static void refCount(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.world.chunk.AbstractChunkHolder.refCount = value; }

// public java.util.concurrent.CompletableFuture referenceFuture() { return wrapperContained.referenceFuture; }
// public void referenceFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.referenceFuture = value; }
// public static java.util.concurrent.CompletableFuture referenceFuture() { return net.minecraft.world.chunk.AbstractChunkHolder.referenceFuture; }
// public static void referenceFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.world.chunk.AbstractChunkHolder.referenceFuture = value; }

// public AbstractChunkHolder(yarnwrap.util.math.ChunkPos pos) { this.wrapperContained = new net.minecraft.world.chunk.AbstractChunkHolder(pos.wrapperContained); }
public int getLevel() { return wrapperContained.getLevel(); }
// public static int getLevel() { return net.minecraft.world.chunk.AbstractChunkHolder.getLevel(); }
public int getCompletedLevel() { return wrapperContained.getCompletedLevel(); }
// public static int getCompletedLevel() { return net.minecraft.world.chunk.AbstractChunkHolder.getCompletedLevel(); }
// public void combineSavingFuture(java.util.concurrent.CompletableFuture savingFuture) { wrapperContained.combineSavingFuture(savingFuture); }
// public static void combineSavingFuture(java.util.concurrent.CompletableFuture savingFuture, ) { net.minecraft.world.chunk.AbstractChunkHolder.combineSavingFuture(savingFuture); }
// public void unload(int statusIndex,java.util.concurrent.CompletableFuture previousFuture) { wrapperContained.unload(statusIndex,previousFuture); }
// public static void unload(int statusIndex,java.util.concurrent.CompletableFuture previousFuture, ) { net.minecraft.world.chunk.AbstractChunkHolder.unload(statusIndex,previousFuture); }
// public void clearLoader(yarnwrap.world.chunk.ChunkLoader loader) { wrapperContained.clearLoader(loader.wrapperContained); }
// public static void clearLoader(yarnwrap.world.chunk.ChunkLoader loader, ) { net.minecraft.world.chunk.AbstractChunkHolder.clearLoader(loader.wrapperContained); }
// public void updateStatus(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager) { wrapperContained.updateStatus(chunkLoadingManager.wrapperContained); }
// public static void updateStatus(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager, ) { net.minecraft.world.chunk.AbstractChunkHolder.updateStatus(chunkLoadingManager.wrapperContained); }
// public void createLoader(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,yarnwrap.world.chunk.ChunkStatus requestedStatus) { wrapperContained.createLoader(chunkLoadingManager.wrapperContained,requestedStatus.wrapperContained); }
// public static void createLoader(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,yarnwrap.world.chunk.ChunkStatus requestedStatus, ) { net.minecraft.world.chunk.AbstractChunkHolder.createLoader(chunkLoadingManager.wrapperContained,requestedStatus.wrapperContained); }
public void replaceWith(yarnwrap.world.chunk.WrapperProtoChunk chunk) { wrapperContained.replaceWith(chunk.wrapperContained); }
// public static void replaceWith(yarnwrap.world.chunk.WrapperProtoChunk chunk, ) { net.minecraft.world.chunk.AbstractChunkHolder.replaceWith(chunk.wrapperContained); }
public yarnwrap.world.chunk.Chunk getUncheckedOrNull(yarnwrap.world.chunk.ChunkStatus requestedStatus) { return new yarnwrap.world.chunk.Chunk(wrapperContained.getUncheckedOrNull(requestedStatus.wrapperContained)); }
// public static yarnwrap.world.chunk.Chunk getUncheckedOrNull(yarnwrap.world.chunk.ChunkStatus requestedStatus, ) { return new yarnwrap.world.chunk.Chunk(net.minecraft.world.chunk.AbstractChunkHolder.getUncheckedOrNull(requestedStatus.wrapperContained)); }
public java.util.concurrent.CompletableFuture load(yarnwrap.world.chunk.ChunkStatus requestedStatus,yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager) { return wrapperContained.load(requestedStatus.wrapperContained,chunkLoadingManager.wrapperContained); }
// public static java.util.concurrent.CompletableFuture load(yarnwrap.world.chunk.ChunkStatus requestedStatus,yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager, ) { return net.minecraft.world.chunk.AbstractChunkHolder.load(requestedStatus.wrapperContained,chunkLoadingManager.wrapperContained); }
// public void completeChunkFuture(yarnwrap.world.chunk.ChunkStatus status,yarnwrap.world.chunk.Chunk chunk) { wrapperContained.completeChunkFuture(status.wrapperContained,chunk.wrapperContained); }
// public static void completeChunkFuture(yarnwrap.world.chunk.ChunkStatus status,yarnwrap.world.chunk.Chunk chunk, ) { net.minecraft.world.chunk.AbstractChunkHolder.completeChunkFuture(status.wrapperContained,chunk.wrapperContained); }
// public void unload(yarnwrap.world.chunk.ChunkStatus from,yarnwrap.world.chunk.ChunkStatus to) { wrapperContained.unload(from.wrapperContained,to.wrapperContained); }
// public static void unload(yarnwrap.world.chunk.ChunkStatus from,yarnwrap.world.chunk.ChunkStatus to, ) { net.minecraft.world.chunk.AbstractChunkHolder.unload(from.wrapperContained,to.wrapperContained); }
// public java.util.concurrent.CompletableFuture generate(yarnwrap.world.chunk.ChunkGenerationStep step,yarnwrap.world.ChunkLoadingManager chunkLoadingManager,yarnwrap.util.collection.BoundedRegionArray chunks) { return wrapperContained.generate(step.wrapperContained,chunkLoadingManager.wrapperContained,chunks.wrapperContained); }
// public static java.util.concurrent.CompletableFuture generate(yarnwrap.world.chunk.ChunkGenerationStep step,yarnwrap.world.ChunkLoadingManager chunkLoadingManager,yarnwrap.util.collection.BoundedRegionArray chunks, ) { return net.minecraft.world.chunk.AbstractChunkHolder.generate(step.wrapperContained,chunkLoadingManager.wrapperContained,chunks.wrapperContained); }
// public yarnwrap.server.world.OptionalChunk method_60462(yarnwrap.world.chunk.ChunkGenerationStep chunk,yarnwrap.world.chunk.Chunk throwable) { return new yarnwrap.server.world.OptionalChunk(wrapperContained.method_60462(chunk.wrapperContained,throwable.wrapperContained)); }
// public static yarnwrap.server.world.OptionalChunk method_60462(yarnwrap.world.chunk.ChunkGenerationStep chunk,yarnwrap.world.chunk.Chunk throwable, ) { return new yarnwrap.server.world.OptionalChunk(net.minecraft.world.chunk.AbstractChunkHolder.method_60462(chunk.wrapperContained,throwable.wrapperContained)); }
public yarnwrap.world.chunk.Chunk getOrNull(yarnwrap.world.chunk.ChunkStatus requestedStatus) { return new yarnwrap.world.chunk.Chunk(wrapperContained.getOrNull(requestedStatus.wrapperContained)); }
// public static yarnwrap.world.chunk.Chunk getOrNull(yarnwrap.world.chunk.ChunkStatus requestedStatus, ) { return new yarnwrap.world.chunk.Chunk(net.minecraft.world.chunk.AbstractChunkHolder.getOrNull(requestedStatus.wrapperContained)); }
// public java.util.concurrent.CompletableFuture getOrCreateFuture(yarnwrap.world.chunk.ChunkStatus status) { return wrapperContained.getOrCreateFuture(status.wrapperContained); }
// public static java.util.concurrent.CompletableFuture getOrCreateFuture(yarnwrap.world.chunk.ChunkStatus status, ) { return net.minecraft.world.chunk.AbstractChunkHolder.getOrCreateFuture(status.wrapperContained); }
// public yarnwrap.world.chunk.ChunkStatus getMaxPendingStatus(yarnwrap.world.chunk.ChunkStatus checkUpperBound) { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.getMaxPendingStatus(checkUpperBound.wrapperContained)); }
// public static yarnwrap.world.chunk.ChunkStatus getMaxPendingStatus(yarnwrap.world.chunk.ChunkStatus checkUpperBound, ) { return new yarnwrap.world.chunk.ChunkStatus(net.minecraft.world.chunk.AbstractChunkHolder.getMaxPendingStatus(checkUpperBound.wrapperContained)); }
// public boolean progressStatus(yarnwrap.world.chunk.ChunkStatus nextStatus) { return wrapperContained.progressStatus(nextStatus.wrapperContained); }
// public static boolean progressStatus(yarnwrap.world.chunk.ChunkStatus nextStatus, ) { return net.minecraft.world.chunk.AbstractChunkHolder.progressStatus(nextStatus.wrapperContained); }
// public boolean cannotBeLoaded(yarnwrap.world.chunk.ChunkStatus status) { return wrapperContained.cannotBeLoaded(status.wrapperContained); }
// public static boolean cannotBeLoaded(yarnwrap.world.chunk.ChunkStatus status, ) { return net.minecraft.world.chunk.AbstractChunkHolder.cannotBeLoaded(status.wrapperContained); }
public void incrementRefCount() { wrapperContained.incrementRefCount(); }
// public static void incrementRefCount() { net.minecraft.world.chunk.AbstractChunkHolder.incrementRefCount(); }
public void decrementRefCount() { wrapperContained.decrementRefCount(); }
// public static void decrementRefCount() { net.minecraft.world.chunk.AbstractChunkHolder.decrementRefCount(); }
public yarnwrap.world.chunk.Chunk getLatest() { return new yarnwrap.world.chunk.Chunk(wrapperContained.getLatest()); }
// public static yarnwrap.world.chunk.Chunk getLatest() { return new yarnwrap.world.chunk.Chunk(net.minecraft.world.chunk.AbstractChunkHolder.getLatest()); }
public yarnwrap.world.chunk.ChunkStatus getActualStatus() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.getActualStatus()); }
// public static yarnwrap.world.chunk.ChunkStatus getActualStatus() { return new yarnwrap.world.chunk.ChunkStatus(net.minecraft.world.chunk.AbstractChunkHolder.getActualStatus()); }
public yarnwrap.util.math.ChunkPos getPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.ChunkPos getPos() { return new yarnwrap.util.math.ChunkPos(net.minecraft.world.chunk.AbstractChunkHolder.getPos()); }
public yarnwrap.server.world.ChunkLevelType getLevelType() { return new yarnwrap.server.world.ChunkLevelType(wrapperContained.getLevelType()); }
// public static yarnwrap.server.world.ChunkLevelType getLevelType() { return new yarnwrap.server.world.ChunkLevelType(net.minecraft.world.chunk.AbstractChunkHolder.getLevelType()); }
public java.util.List enumerateFutures() { return wrapperContained.enumerateFutures(); }
// public static java.util.List enumerateFutures() { return net.minecraft.world.chunk.AbstractChunkHolder.enumerateFutures(); }
public yarnwrap.world.chunk.ChunkStatus getLatestStatus() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.getLatestStatus()); }
// public static yarnwrap.world.chunk.ChunkStatus getLatestStatus() { return new yarnwrap.world.chunk.ChunkStatus(net.minecraft.world.chunk.AbstractChunkHolder.getLatestStatus()); }

}