package yarnwrap.server.world;
public class ServerLightingProvider { public net.minecraft.server.world.ServerLightingProvider wrapperContained; public ServerLightingProvider(net.minecraft.server.world.ServerLightingProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.world.ServerLightingProvider.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.world.ServerLightingProvider.LOGGER = value; }

// public it.unimi.dsi.fastutil.objects.ObjectList pendingTasks() { return wrapperContained.pendingTasks; }
// public void pendingTasks(it.unimi.dsi.fastutil.objects.ObjectList value) { wrapperContained.pendingTasks = value; }
// public static it.unimi.dsi.fastutil.objects.ObjectList pendingTasks() { return net.minecraft.server.world.ServerLightingProvider.pendingTasks; }
// public static void pendingTasks(it.unimi.dsi.fastutil.objects.ObjectList value, ) { net.minecraft.server.world.ServerLightingProvider.pendingTasks = value; }

// public yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager() { return new yarnwrap.server.world.ServerChunkLoadingManager(wrapperContained.chunkLoadingManager); }
// public void chunkLoadingManager(yarnwrap.server.world.ServerChunkLoadingManager value) { wrapperContained.chunkLoadingManager = value.wrapperContained; }
// public static yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager() { return new yarnwrap.server.world.ServerChunkLoadingManager(net.minecraft.server.world.ServerLightingProvider.chunkLoadingManager); }
// public static void chunkLoadingManager(yarnwrap.server.world.ServerChunkLoadingManager value, ) { net.minecraft.server.world.ServerLightingProvider.chunkLoadingManager = value.wrapperContained; }

// public int taskBatchSize() { return wrapperContained.taskBatchSize; }
// public void taskBatchSize(int value) { wrapperContained.taskBatchSize = value; }
// public static int taskBatchSize() { return net.minecraft.server.world.ServerLightingProvider.taskBatchSize; }
// public static void taskBatchSize(int value, ) { net.minecraft.server.world.ServerLightingProvider.taskBatchSize = value; }

// public java.util.concurrent.atomic.AtomicBoolean ticking() { return wrapperContained.ticking; }
// public void ticking(java.util.concurrent.atomic.AtomicBoolean value) { wrapperContained.ticking = value; }
// public static java.util.concurrent.atomic.AtomicBoolean ticking() { return net.minecraft.server.world.ServerLightingProvider.ticking; }
// public static void ticking(java.util.concurrent.atomic.AtomicBoolean value, ) { net.minecraft.server.world.ServerLightingProvider.ticking = value; }

// public yarnwrap.util.thread.SimpleConsecutiveExecutor processor() { return new yarnwrap.util.thread.SimpleConsecutiveExecutor(wrapperContained.processor); }
// public void processor(yarnwrap.util.thread.SimpleConsecutiveExecutor value) { wrapperContained.processor = value.wrapperContained; }
// public static yarnwrap.util.thread.SimpleConsecutiveExecutor processor() { return new yarnwrap.util.thread.SimpleConsecutiveExecutor(net.minecraft.server.world.ServerLightingProvider.processor); }
// public static void processor(yarnwrap.util.thread.SimpleConsecutiveExecutor value, ) { net.minecraft.server.world.ServerLightingProvider.processor = value.wrapperContained; }

// public yarnwrap.server.world.ChunkTaskScheduler executor() { return new yarnwrap.server.world.ChunkTaskScheduler(wrapperContained.executor); }
// public void executor(yarnwrap.server.world.ChunkTaskScheduler value) { wrapperContained.executor = value.wrapperContained; }
// public static yarnwrap.server.world.ChunkTaskScheduler executor() { return new yarnwrap.server.world.ChunkTaskScheduler(net.minecraft.server.world.ServerLightingProvider.executor); }
// public static void executor(yarnwrap.server.world.ChunkTaskScheduler value, ) { net.minecraft.server.world.ServerLightingProvider.executor = value.wrapperContained; }

public ServerLightingProvider(yarnwrap.world.chunk.ChunkProvider chunkProvider,yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,boolean hasBlockLight,yarnwrap.util.thread.SimpleConsecutiveExecutor processor,yarnwrap.server.world.ChunkTaskScheduler executor) { this.wrapperContained = new net.minecraft.server.world.ServerLightingProvider(chunkProvider.wrapperContained,chunkLoadingManager.wrapperContained,hasBlockLight,processor.wrapperContained,executor.wrapperContained); }
// public void runTasks() { wrapperContained.runTasks(); }
// public static void runTasks() { net.minecraft.server.world.ServerLightingProvider.runTasks(); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.server.world.ServerLightingProvider.tick(); }
// public void method_17306(yarnwrap.util.math.ChunkPos task) { wrapperContained.method_17306(task.wrapperContained); }
// public static void method_17306(yarnwrap.util.math.ChunkPos task, ) { net.minecraft.server.world.ServerLightingProvider.method_17306(task.wrapperContained); }
// public void enqueue(int x,int z,java.util.function.IntSupplier completedLevelSupplier,Object stage,java.lang.Runnable task) { wrapperContained.enqueue(x,z,completedLevelSupplier,stage,task); }
// public static void enqueue(int x,int z,java.util.function.IntSupplier completedLevelSupplier,Object stage,java.lang.Runnable task, ) { net.minecraft.server.world.ServerLightingProvider.enqueue(x,z,completedLevelSupplier,stage,task); }
// public void enqueue(int x,int z,Object stage,java.lang.Runnable task) { wrapperContained.enqueue(x,z,stage,task); }
// public static void enqueue(int x,int z,Object stage,java.lang.Runnable task, ) { net.minecraft.server.world.ServerLightingProvider.enqueue(x,z,stage,task); }
public java.util.concurrent.CompletableFuture light(yarnwrap.world.chunk.Chunk chunk,boolean excludeBlocks) { return wrapperContained.light(chunk.wrapperContained,excludeBlocks); }
// public static java.util.concurrent.CompletableFuture light(yarnwrap.world.chunk.Chunk chunk,boolean excludeBlocks, ) { return net.minecraft.server.world.ServerLightingProvider.light(chunk.wrapperContained,excludeBlocks); }
// public void updateChunkStatus(yarnwrap.util.math.ChunkPos pos) { wrapperContained.updateChunkStatus(pos.wrapperContained); }
// public static void updateChunkStatus(yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.server.world.ServerLightingProvider.updateChunkStatus(pos.wrapperContained); }
// public java.util.concurrent.CompletableFuture initializeLight(yarnwrap.world.chunk.Chunk chunk) { return wrapperContained.initializeLight(chunk.wrapperContained); }
// public static java.util.concurrent.CompletableFuture initializeLight(yarnwrap.world.chunk.Chunk chunk, ) { return net.minecraft.server.world.ServerLightingProvider.initializeLight(chunk.wrapperContained); }
// public void method_51287(yarnwrap.util.math.ChunkPos task) { wrapperContained.method_51287(task.wrapperContained); }
// public static void method_51287(yarnwrap.util.math.ChunkPos task, ) { net.minecraft.server.world.ServerLightingProvider.method_51287(task.wrapperContained); }
public java.util.concurrent.CompletableFuture enqueue(int x,int z) { return wrapperContained.enqueue(x,z); }
// public static java.util.concurrent.CompletableFuture enqueue(int x,int z, ) { return net.minecraft.server.world.ServerLightingProvider.enqueue(x,z); }
// public void method_53695(int callback) { wrapperContained.method_53695(callback); }
// public static void method_53695(int callback, ) { net.minecraft.server.world.ServerLightingProvider.method_53695(callback); }

}