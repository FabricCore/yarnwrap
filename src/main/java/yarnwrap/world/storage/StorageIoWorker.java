package yarnwrap.world.storage;
public class StorageIoWorker { public net.minecraft.world.storage.StorageIoWorker wrapperContained; public StorageIoWorker(net.minecraft.world.storage.StorageIoWorker wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.concurrent.atomic.AtomicBoolean closed() { return wrapperContained.closed; }
// public void closed(java.util.concurrent.atomic.AtomicBoolean value) { wrapperContained.closed = value; }
// public yarnwrap.world.storage.RegionBasedStorage storage() { return new yarnwrap.world.storage.RegionBasedStorage(wrapperContained.storage); }
// public void storage(yarnwrap.world.storage.RegionBasedStorage value) { wrapperContained.storage = value.wrapperContained; }
// public java.util.Map results() { return wrapperContained.results; }
// public void results(java.util.Map value) { wrapperContained.results = value; }
// public yarnwrap.util.thread.TaskExecutor executor() { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.executor); }
// public void executor(yarnwrap.util.thread.TaskExecutor value) { wrapperContained.executor = value.wrapperContained; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap blendingStatusCaches() { return wrapperContained.blendingStatusCaches; }
// public void blendingStatusCaches(it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap value) { wrapperContained.blendingStatusCaches = value; }
// public int MAX_CACHE_SIZE() { return wrapperContained.MAX_CACHE_SIZE; }
// public void MAX_CACHE_SIZE(int value) { wrapperContained.MAX_CACHE_SIZE = value; }
public java.util.concurrent.CompletableFuture completeAll(boolean sync) { return wrapperContained.completeAll(sync); }
// public void write(yarnwrap.util.math.ChunkPos pos,Object result) { wrapperContained.write(pos.wrapperContained,result); }
public java.util.concurrent.CompletableFuture setResult(yarnwrap.util.math.ChunkPos pos,yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.setResult(pos.wrapperContained,nbt.wrapperContained); }
// public java.util.concurrent.CompletableFuture run(java.util.function.Supplier task) { return wrapperContained.run(task); }
// public void writeResult() { wrapperContained.writeResult(); }
// public void writeRemainingResults() { wrapperContained.writeRemainingResults(); }
public java.util.concurrent.CompletableFuture readChunkData(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.readChunkData(pos.wrapperContained); }
// public java.util.concurrent.CompletableFuture getOrComputeBlendingStatus(int chunkX,int chunkZ) { return wrapperContained.getOrComputeBlendingStatus(chunkX,chunkZ); }
public boolean needsBlending(yarnwrap.util.math.ChunkPos chunkPos,int checkRadius) { return wrapperContained.needsBlending(chunkPos.wrapperContained,checkRadius); }
// public boolean needsBlending(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.needsBlending(nbt.wrapperContained); }
// public java.util.concurrent.CompletableFuture computeBlendingStatus(int chunkX,int chunkZ) { return wrapperContained.computeBlendingStatus(chunkX,chunkZ); }
public yarnwrap.world.storage.StorageKey getStorageKey() { return new yarnwrap.world.storage.StorageKey(wrapperContained.getStorageKey()); }

}