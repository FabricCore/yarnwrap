package yarnwrap.world;
public class ChunkLoadingManager { public net.minecraft.world.ChunkLoadingManager wrapperContained; public ChunkLoadingManager(net.minecraft.world.ChunkLoadingManager wrapperContained) { this.wrapperContained = wrapperContained; }

public void release(yarnwrap.world.chunk.AbstractChunkHolder chunkHolder) { wrapperContained.release(chunkHolder.wrapperContained); }
// public static void release(yarnwrap.world.chunk.AbstractChunkHolder chunkHolder, ) { net.minecraft.world.ChunkLoadingManager.release(chunkHolder.wrapperContained); }
public java.util.concurrent.CompletableFuture generate(yarnwrap.world.chunk.AbstractChunkHolder chunkHolder,yarnwrap.world.chunk.ChunkGenerationStep step,yarnwrap.util.collection.BoundedRegionArray chunks) { return wrapperContained.generate(chunkHolder.wrapperContained,step.wrapperContained,chunks.wrapperContained); }
// public static java.util.concurrent.CompletableFuture generate(yarnwrap.world.chunk.AbstractChunkHolder chunkHolder,yarnwrap.world.chunk.ChunkGenerationStep step,yarnwrap.util.collection.BoundedRegionArray chunks, ) { return net.minecraft.world.ChunkLoadingManager.generate(chunkHolder.wrapperContained,step.wrapperContained,chunks.wrapperContained); }
public yarnwrap.world.chunk.ChunkLoader createLoader(yarnwrap.world.chunk.ChunkStatus requestedStatus,yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.world.chunk.ChunkLoader(wrapperContained.createLoader(requestedStatus.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.world.chunk.ChunkLoader createLoader(yarnwrap.world.chunk.ChunkStatus requestedStatus,yarnwrap.util.math.ChunkPos pos, ) { return new yarnwrap.world.chunk.ChunkLoader(net.minecraft.world.ChunkLoadingManager.createLoader(requestedStatus.wrapperContained,pos.wrapperContained)); }
public yarnwrap.world.chunk.AbstractChunkHolder acquire(long pos) { return new yarnwrap.world.chunk.AbstractChunkHolder(wrapperContained.acquire(pos)); }
// public static yarnwrap.world.chunk.AbstractChunkHolder acquire(long pos, ) { return new yarnwrap.world.chunk.AbstractChunkHolder(net.minecraft.world.ChunkLoadingManager.acquire(pos)); }
public void updateChunks() { wrapperContained.updateChunks(); }
// public static void updateChunks() { net.minecraft.world.ChunkLoadingManager.updateChunks(); }

}