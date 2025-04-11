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
// public StorageIoWorker(yarnwrap.world.storage.StorageKey storageKey,java.nio.file.Path directory,boolean dsync) { this.wrapperContained = new net.minecraft.world.storage.StorageIoWorker(storageKey.wrapperContained,directory,dsync); }
public java.util.concurrent.CompletableFuture completeAll(boolean sync) { return wrapperContained.completeAll(sync); }
// public void write(yarnwrap.util.math.ChunkPos pos,Object result) { wrapperContained.write(pos.wrapperContained,result); }
public java.util.concurrent.CompletableFuture setResult(yarnwrap.util.math.ChunkPos pos,yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.setResult(pos.wrapperContained,nbt.wrapperContained); }
// public java.util.concurrent.CompletableFuture method_23705(Object result) { return wrapperContained.method_23705(result); }
// public java.util.concurrent.CompletableFuture run(java.util.function.Supplier task) { return wrapperContained.run(task); }
// public Object method_23711(yarnwrap.nbt.NbtCompound pos2) { return wrapperContained.method_23711(pos2.wrapperContained); }
// public void writeResult() { wrapperContained.writeResult(); }
// public Object method_27938(yarnwrap.util.thread.MessageListener listener) { return wrapperContained.method_27938(listener.wrapperContained); }
// public java.util.concurrent.CompletionStage method_27940(java.lang.Void void_) { return wrapperContained.method_27940(void_); }
// public Object method_27941(java.util.function.Supplier listener) { return wrapperContained.method_27941(listener); }
// public void writeRemainingResults() { wrapperContained.writeRemainingResults(); }
public java.util.concurrent.CompletableFuture readChunkData(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.readChunkData(pos.wrapperContained); }
// public java.util.concurrent.CompletionStage method_37479(java.lang.Void void_) { return wrapperContained.method_37479(void_); }
// public java.util.concurrent.CompletableFuture getOrComputeBlendingStatus(int chunkX,int chunkZ) { return wrapperContained.getOrComputeBlendingStatus(chunkX,chunkZ); }
public boolean needsBlending(yarnwrap.util.math.ChunkPos chunkPos,int checkRadius) { return wrapperContained.needsBlending(chunkPos.wrapperContained,checkRadius); }
// public void method_42331(java.util.BitSet chunkPos) { wrapperContained.method_42331(chunkPos); }
// public boolean needsBlending(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.needsBlending(nbt.wrapperContained); }
// public java.util.concurrent.CompletableFuture computeBlendingStatus(int chunkX,int chunkZ) { return wrapperContained.computeBlendingStatus(chunkX,chunkZ); }
public yarnwrap.world.storage.StorageKey getStorageKey() { return new yarnwrap.world.storage.StorageKey(wrapperContained.getStorageKey()); }

}