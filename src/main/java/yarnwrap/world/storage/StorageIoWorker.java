package yarnwrap.world.storage;
public class StorageIoWorker { public net.minecraft.world.storage.StorageIoWorker wrapperContained; public StorageIoWorker(net.minecraft.world.storage.StorageIoWorker wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.storage.StorageIoWorker.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.storage.StorageIoWorker.LOGGER = value; }

// public java.util.concurrent.atomic.AtomicBoolean closed() { return wrapperContained.closed; }
// public void closed(java.util.concurrent.atomic.AtomicBoolean value) { wrapperContained.closed = value; }
// public static java.util.concurrent.atomic.AtomicBoolean closed() { return net.minecraft.world.storage.StorageIoWorker.closed; }
// public static void closed(java.util.concurrent.atomic.AtomicBoolean value, ) { net.minecraft.world.storage.StorageIoWorker.closed = value; }

// public yarnwrap.world.storage.RegionBasedStorage storage() { return new yarnwrap.world.storage.RegionBasedStorage(wrapperContained.storage); }
// public void storage(yarnwrap.world.storage.RegionBasedStorage value) { wrapperContained.storage = value.wrapperContained; }
// public static yarnwrap.world.storage.RegionBasedStorage storage() { return new yarnwrap.world.storage.RegionBasedStorage(net.minecraft.world.storage.StorageIoWorker.storage); }
// public static void storage(yarnwrap.world.storage.RegionBasedStorage value, ) { net.minecraft.world.storage.StorageIoWorker.storage = value.wrapperContained; }

// public java.util.SequencedMap results() { return wrapperContained.results; }
// public void results(java.util.SequencedMap value) { wrapperContained.results = value; }
// public static java.util.SequencedMap results() { return net.minecraft.world.storage.StorageIoWorker.results; }
// public static void results(java.util.SequencedMap value, ) { net.minecraft.world.storage.StorageIoWorker.results = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap blendingStatusCaches() { return wrapperContained.blendingStatusCaches; }
// public void blendingStatusCaches(it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap value) { wrapperContained.blendingStatusCaches = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap blendingStatusCaches() { return net.minecraft.world.storage.StorageIoWorker.blendingStatusCaches; }
// public static void blendingStatusCaches(it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap value, ) { net.minecraft.world.storage.StorageIoWorker.blendingStatusCaches = value; }

// public int MAX_CACHE_SIZE() { return wrapperContained.MAX_CACHE_SIZE; }
// public void MAX_CACHE_SIZE(int value) { wrapperContained.MAX_CACHE_SIZE = value; }
// public static int MAX_CACHE_SIZE() { return net.minecraft.world.storage.StorageIoWorker.MAX_CACHE_SIZE; }
// public static void MAX_CACHE_SIZE(int value, ) { net.minecraft.world.storage.StorageIoWorker.MAX_CACHE_SIZE = value; }

// public yarnwrap.util.thread.PrioritizedConsecutiveExecutor executor() { return new yarnwrap.util.thread.PrioritizedConsecutiveExecutor(wrapperContained.executor); }
// public void executor(yarnwrap.util.thread.PrioritizedConsecutiveExecutor value) { wrapperContained.executor = value.wrapperContained; }
// public static yarnwrap.util.thread.PrioritizedConsecutiveExecutor executor() { return new yarnwrap.util.thread.PrioritizedConsecutiveExecutor(net.minecraft.world.storage.StorageIoWorker.executor); }
// public static void executor(yarnwrap.util.thread.PrioritizedConsecutiveExecutor value, ) { net.minecraft.world.storage.StorageIoWorker.executor = value.wrapperContained; }

// public StorageIoWorker(yarnwrap.world.storage.StorageKey storageKey,java.nio.file.Path directory,boolean dsync) { this.wrapperContained = new net.minecraft.world.storage.StorageIoWorker(storageKey.wrapperContained,directory,dsync); }
public java.util.concurrent.CompletableFuture completeAll(boolean sync) { return wrapperContained.completeAll(sync); }
// public static java.util.concurrent.CompletableFuture completeAll(boolean sync, ) { return net.minecraft.world.storage.StorageIoWorker.completeAll(sync); }
// public void write(yarnwrap.util.math.ChunkPos pos,Object result) { wrapperContained.write(pos.wrapperContained,result); }
// public static void write(yarnwrap.util.math.ChunkPos pos,Object result, ) { net.minecraft.world.storage.StorageIoWorker.write(pos.wrapperContained,result); }
public java.util.concurrent.CompletableFuture setResult(yarnwrap.util.math.ChunkPos pos,yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.setResult(pos.wrapperContained,nbt.wrapperContained); }
// public static java.util.concurrent.CompletableFuture setResult(yarnwrap.util.math.ChunkPos pos,yarnwrap.nbt.NbtCompound nbt, ) { return net.minecraft.world.storage.StorageIoWorker.setResult(pos.wrapperContained,nbt.wrapperContained); }
// public java.util.concurrent.CompletableFuture method_23705(Object result) { return wrapperContained.method_23705(result); }
// public static java.util.concurrent.CompletableFuture method_23705(Object result, ) { return net.minecraft.world.storage.StorageIoWorker.method_23705(result); }
// public java.util.concurrent.CompletableFuture run(java.util.function.Supplier task) { return wrapperContained.run(task); }
// public static java.util.concurrent.CompletableFuture run(java.util.function.Supplier task, ) { return net.minecraft.world.storage.StorageIoWorker.run(task); }
// public Object method_23711(yarnwrap.nbt.NbtCompound pos2) { return wrapperContained.method_23711(pos2.wrapperContained); }
// public static Object method_23711(yarnwrap.nbt.NbtCompound pos2, ) { return net.minecraft.world.storage.StorageIoWorker.method_23711(pos2.wrapperContained); }
// public void writeResult() { wrapperContained.writeResult(); }
// public static void writeResult() { net.minecraft.world.storage.StorageIoWorker.writeResult(); }
// public java.util.concurrent.CompletionStage method_27940(java.lang.Void void_) { return wrapperContained.method_27940(void_); }
// public static java.util.concurrent.CompletionStage method_27940(java.lang.Void void_, ) { return net.minecraft.world.storage.StorageIoWorker.method_27940(void_); }
// public void writeRemainingResults() { wrapperContained.writeRemainingResults(); }
// public static void writeRemainingResults() { net.minecraft.world.storage.StorageIoWorker.writeRemainingResults(); }
public java.util.concurrent.CompletableFuture readChunkData(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.readChunkData(pos.wrapperContained); }
// public static java.util.concurrent.CompletableFuture readChunkData(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.world.storage.StorageIoWorker.readChunkData(pos.wrapperContained); }
// public java.util.concurrent.CompletionStage method_37479(java.lang.Void void_) { return wrapperContained.method_37479(void_); }
// public static java.util.concurrent.CompletionStage method_37479(java.lang.Void void_, ) { return net.minecraft.world.storage.StorageIoWorker.method_37479(void_); }
// public java.util.concurrent.CompletableFuture getOrComputeBlendingStatus(int chunkX,int chunkZ) { return wrapperContained.getOrComputeBlendingStatus(chunkX,chunkZ); }
// public static java.util.concurrent.CompletableFuture getOrComputeBlendingStatus(int chunkX,int chunkZ, ) { return net.minecraft.world.storage.StorageIoWorker.getOrComputeBlendingStatus(chunkX,chunkZ); }
public boolean needsBlending(yarnwrap.util.math.ChunkPos chunkPos,int checkRadius) { return wrapperContained.needsBlending(chunkPos.wrapperContained,checkRadius); }
// public static boolean needsBlending(yarnwrap.util.math.ChunkPos chunkPos,int checkRadius, ) { return net.minecraft.world.storage.StorageIoWorker.needsBlending(chunkPos.wrapperContained,checkRadius); }
// public void method_42331(java.util.BitSet chunkPos) { wrapperContained.method_42331(chunkPos); }
// public static void method_42331(java.util.BitSet chunkPos, ) { net.minecraft.world.storage.StorageIoWorker.method_42331(chunkPos); }
// public boolean needsBlending(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.needsBlending(nbt.wrapperContained); }
// public static boolean needsBlending(yarnwrap.nbt.NbtCompound nbt, ) { return net.minecraft.world.storage.StorageIoWorker.needsBlending(nbt.wrapperContained); }
// public java.util.concurrent.CompletableFuture computeBlendingStatus(int chunkX,int chunkZ) { return wrapperContained.computeBlendingStatus(chunkX,chunkZ); }
// public static java.util.concurrent.CompletableFuture computeBlendingStatus(int chunkX,int chunkZ, ) { return net.minecraft.world.storage.StorageIoWorker.computeBlendingStatus(chunkX,chunkZ); }
public yarnwrap.world.storage.StorageKey getStorageKey() { return new yarnwrap.world.storage.StorageKey(wrapperContained.getStorageKey()); }
// public static yarnwrap.world.storage.StorageKey getStorageKey() { return new yarnwrap.world.storage.StorageKey(net.minecraft.world.storage.StorageIoWorker.getStorageKey()); }
public java.util.concurrent.CompletableFuture setResult(yarnwrap.util.math.ChunkPos pos,java.util.function.Supplier nbtSupplier) { return wrapperContained.setResult(pos.wrapperContained,nbtSupplier); }
// public static java.util.concurrent.CompletableFuture setResult(yarnwrap.util.math.ChunkPos pos,java.util.function.Supplier nbtSupplier, ) { return net.minecraft.world.storage.StorageIoWorker.setResult(pos.wrapperContained,nbtSupplier); }
// public java.util.concurrent.CompletableFuture run(Object task) { return wrapperContained.run(task); }
// public static java.util.concurrent.CompletableFuture run(Object task, ) { return net.minecraft.world.storage.StorageIoWorker.run(task); }
// public void method_64027(Object future) { wrapperContained.method_64027(future); }
// public static void method_64027(Object future, ) { net.minecraft.world.storage.StorageIoWorker.method_64027(future); }
// public void method_64028(java.util.concurrent.CompletableFuture future) { wrapperContained.method_64028(future); }
// public static void method_64028(java.util.concurrent.CompletableFuture future, ) { net.minecraft.world.storage.StorageIoWorker.method_64028(future); }
// public void runRemainingTasks() { wrapperContained.runRemainingTasks(); }
// public static void runRemainingTasks() { net.minecraft.world.storage.StorageIoWorker.runRemainingTasks(); }

}