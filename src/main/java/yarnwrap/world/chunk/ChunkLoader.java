package yarnwrap.world.chunk;
public class ChunkLoader { public net.minecraft.world.chunk.ChunkLoader wrapperContained; public ChunkLoader(net.minecraft.world.chunk.ChunkLoader wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.chunk.ChunkStatus targetStatus() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.targetStatus); }
// public void targetStatus(yarnwrap.world.chunk.ChunkStatus value) { wrapperContained.targetStatus = value.wrapperContained; }
// public static yarnwrap.world.chunk.ChunkStatus targetStatus() { return new yarnwrap.world.chunk.ChunkStatus(net.minecraft.world.chunk.ChunkLoader.targetStatus); }
// public static void targetStatus(yarnwrap.world.chunk.ChunkStatus value, ) { net.minecraft.world.chunk.ChunkLoader.targetStatus = value.wrapperContained; }

// public yarnwrap.world.ChunkLoadingManager chunkLoadingManager() { return new yarnwrap.world.ChunkLoadingManager(wrapperContained.chunkLoadingManager); }
// public void chunkLoadingManager(yarnwrap.world.ChunkLoadingManager value) { wrapperContained.chunkLoadingManager = value.wrapperContained; }
// public static yarnwrap.world.ChunkLoadingManager chunkLoadingManager() { return new yarnwrap.world.ChunkLoadingManager(net.minecraft.world.chunk.ChunkLoader.chunkLoadingManager); }
// public static void chunkLoadingManager(yarnwrap.world.ChunkLoadingManager value, ) { net.minecraft.world.chunk.ChunkLoader.chunkLoadingManager = value.wrapperContained; }

// public yarnwrap.util.math.ChunkPos pos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.ChunkPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.ChunkPos pos() { return new yarnwrap.util.math.ChunkPos(net.minecraft.world.chunk.ChunkLoader.pos); }
// public static void pos(yarnwrap.util.math.ChunkPos value, ) { net.minecraft.world.chunk.ChunkLoader.pos = value.wrapperContained; }

// public yarnwrap.world.chunk.ChunkStatus currentlyLoadingStatus() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.currentlyLoadingStatus); }
// public void currentlyLoadingStatus(yarnwrap.world.chunk.ChunkStatus value) { wrapperContained.currentlyLoadingStatus = value.wrapperContained; }
// public static yarnwrap.world.chunk.ChunkStatus currentlyLoadingStatus() { return new yarnwrap.world.chunk.ChunkStatus(net.minecraft.world.chunk.ChunkLoader.currentlyLoadingStatus); }
// public static void currentlyLoadingStatus(yarnwrap.world.chunk.ChunkStatus value, ) { net.minecraft.world.chunk.ChunkLoader.currentlyLoadingStatus = value.wrapperContained; }

// public boolean pendingDisposal() { return wrapperContained.pendingDisposal; }
// public void pendingDisposal(boolean value) { wrapperContained.pendingDisposal = value; }
// public static boolean pendingDisposal() { return net.minecraft.world.chunk.ChunkLoader.pendingDisposal; }
// public static void pendingDisposal(boolean value, ) { net.minecraft.world.chunk.ChunkLoader.pendingDisposal = value; }

// public java.util.List futures() { return wrapperContained.futures; }
// public void futures(java.util.List value) { wrapperContained.futures = value; }
// public static java.util.List futures() { return net.minecraft.world.chunk.ChunkLoader.futures; }
// public static void futures(java.util.List value, ) { net.minecraft.world.chunk.ChunkLoader.futures = value; }

// public yarnwrap.util.collection.BoundedRegionArray chunks() { return new yarnwrap.util.collection.BoundedRegionArray(wrapperContained.chunks); }
// public void chunks(yarnwrap.util.collection.BoundedRegionArray value) { wrapperContained.chunks = value.wrapperContained; }
// public static yarnwrap.util.collection.BoundedRegionArray chunks() { return new yarnwrap.util.collection.BoundedRegionArray(net.minecraft.world.chunk.ChunkLoader.chunks); }
// public static void chunks(yarnwrap.util.collection.BoundedRegionArray value, ) { net.minecraft.world.chunk.ChunkLoader.chunks = value.wrapperContained; }

// public boolean allowGeneration() { return wrapperContained.allowGeneration; }
// public void allowGeneration(boolean value) { wrapperContained.allowGeneration = value; }
// public static boolean allowGeneration() { return net.minecraft.world.chunk.ChunkLoader.allowGeneration; }
// public static void allowGeneration(boolean value, ) { net.minecraft.world.chunk.ChunkLoader.allowGeneration = value; }

// public ChunkLoader(yarnwrap.world.ChunkLoadingManager chunkLoadingManager,yarnwrap.world.chunk.ChunkStatus targetStatus,yarnwrap.util.math.ChunkPos pos,yarnwrap.util.collection.BoundedRegionArray chunks) { this.wrapperContained = new net.minecraft.world.chunk.ChunkLoader(chunkLoadingManager.wrapperContained,targetStatus.wrapperContained,pos.wrapperContained,chunks.wrapperContained); }
public java.util.concurrent.CompletableFuture run() { return wrapperContained.run(); }
// public static java.util.concurrent.CompletableFuture run() { return net.minecraft.world.chunk.ChunkLoader.run(); }
// public yarnwrap.world.chunk.AbstractChunkHolder method_60425(yarnwrap.world.ChunkLoadingManager x,int z) { return new yarnwrap.world.chunk.AbstractChunkHolder(wrapperContained.method_60425(x.wrapperContained,z)); }
// public static yarnwrap.world.chunk.AbstractChunkHolder method_60425(yarnwrap.world.ChunkLoadingManager x,int z, ) { return new yarnwrap.world.chunk.AbstractChunkHolder(net.minecraft.world.chunk.ChunkLoader.method_60425(x.wrapperContained,z)); }
// public yarnwrap.world.chunk.ChunkLoader create(yarnwrap.world.ChunkLoadingManager chunkLoadingManager,yarnwrap.world.chunk.ChunkStatus targetStatus,yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.world.chunk.ChunkLoader(wrapperContained.create(chunkLoadingManager.wrapperContained,targetStatus.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.world.chunk.ChunkLoader create(yarnwrap.world.ChunkLoadingManager chunkLoadingManager,yarnwrap.world.chunk.ChunkStatus targetStatus,yarnwrap.util.math.ChunkPos pos, ) { return new yarnwrap.world.chunk.ChunkLoader(net.minecraft.world.chunk.ChunkLoader.create(chunkLoadingManager.wrapperContained,targetStatus.wrapperContained,pos.wrapperContained)); }
// public void loadAll(yarnwrap.world.chunk.ChunkStatus targetStatus,boolean allowGeneration) { wrapperContained.loadAll(targetStatus.wrapperContained,allowGeneration); }
// public static void loadAll(yarnwrap.world.chunk.ChunkStatus targetStatus,boolean allowGeneration, ) { net.minecraft.world.chunk.ChunkLoader.loadAll(targetStatus.wrapperContained,allowGeneration); }
// public boolean load(yarnwrap.world.chunk.ChunkStatus targetStatus,boolean allowGeneration,yarnwrap.world.chunk.AbstractChunkHolder chunkHolder) { return wrapperContained.load(targetStatus.wrapperContained,allowGeneration,chunkHolder.wrapperContained); }
// public static boolean load(yarnwrap.world.chunk.ChunkStatus targetStatus,boolean allowGeneration,yarnwrap.world.chunk.AbstractChunkHolder chunkHolder, ) { return net.minecraft.world.chunk.ChunkLoader.load(targetStatus.wrapperContained,allowGeneration,chunkHolder.wrapperContained); }
public void markPendingDisposal() { wrapperContained.markPendingDisposal(); }
// public static void markPendingDisposal() { net.minecraft.world.chunk.ChunkLoader.markPendingDisposal(); }
// public int getAdditionalLevel(yarnwrap.world.chunk.ChunkStatus status,boolean generate) { return wrapperContained.getAdditionalLevel(status.wrapperContained,generate); }
// public static int getAdditionalLevel(yarnwrap.world.chunk.ChunkStatus status,boolean generate, ) { return net.minecraft.world.chunk.ChunkLoader.getAdditionalLevel(status.wrapperContained,generate); }
public yarnwrap.world.chunk.AbstractChunkHolder getHolder() { return new yarnwrap.world.chunk.AbstractChunkHolder(wrapperContained.getHolder()); }
// public static yarnwrap.world.chunk.AbstractChunkHolder getHolder() { return new yarnwrap.world.chunk.AbstractChunkHolder(net.minecraft.world.chunk.ChunkLoader.getHolder()); }
// public void loadNextStatus() { wrapperContained.loadNextStatus(); }
// public static void loadNextStatus() { net.minecraft.world.chunk.ChunkLoader.loadNextStatus(); }
// public void dispose() { wrapperContained.dispose(); }
// public static void dispose() { net.minecraft.world.chunk.ChunkLoader.dispose(); }
// public boolean isGenerationUnnecessary() { return wrapperContained.isGenerationUnnecessary(); }
// public static boolean isGenerationUnnecessary() { return net.minecraft.world.chunk.ChunkLoader.isGenerationUnnecessary(); }
// public java.util.concurrent.CompletableFuture getLatestPendingFuture() { return wrapperContained.getLatestPendingFuture(); }
// public static java.util.concurrent.CompletableFuture getLatestPendingFuture() { return net.minecraft.world.chunk.ChunkLoader.getLatestPendingFuture(); }

}