package yarnwrap.server.world;
public class ServerLightingProvider { public net.minecraft.server.world.ServerLightingProvider wrapperContained; public ServerLightingProvider(net.minecraft.server.world.ServerLightingProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.util.thread.TaskExecutor processor() { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.processor); }
// public void processor(yarnwrap.util.thread.TaskExecutor value) { wrapperContained.processor = value.wrapperContained; }
// public it.unimi.dsi.fastutil.objects.ObjectList pendingTasks() { return wrapperContained.pendingTasks; }
// public void pendingTasks(it.unimi.dsi.fastutil.objects.ObjectList value) { wrapperContained.pendingTasks = value; }
// public yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager() { return new yarnwrap.server.world.ServerChunkLoadingManager(wrapperContained.chunkLoadingManager); }
// public void chunkLoadingManager(yarnwrap.server.world.ServerChunkLoadingManager value) { wrapperContained.chunkLoadingManager = value.wrapperContained; }
// public yarnwrap.util.thread.MessageListener executor() { return new yarnwrap.util.thread.MessageListener(wrapperContained.executor); }
// public void executor(yarnwrap.util.thread.MessageListener value) { wrapperContained.executor = value.wrapperContained; }
// public int taskBatchSize() { return wrapperContained.taskBatchSize; }
// public void taskBatchSize(int value) { wrapperContained.taskBatchSize = value; }
// public java.util.concurrent.atomic.AtomicBoolean ticking() { return wrapperContained.ticking; }
// public void ticking(java.util.concurrent.atomic.AtomicBoolean value) { wrapperContained.ticking = value; }
public ServerLightingProvider(yarnwrap.world.chunk.ChunkProvider chunkProvider,yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,boolean hasBlockLight,yarnwrap.util.thread.TaskExecutor processor,yarnwrap.util.thread.MessageListener executor) { this.wrapperContained = new net.minecraft.server.world.ServerLightingProvider(chunkProvider.wrapperContained,chunkLoadingManager.wrapperContained,hasBlockLight,processor.wrapperContained,executor.wrapperContained); }
// public void runTasks() { wrapperContained.runTasks(); }
public void tick() { wrapperContained.tick(); }
// public void method_17306(yarnwrap.util.math.ChunkPos task) { wrapperContained.method_17306(task.wrapperContained); }
// public void enqueue(int x,int z,java.util.function.IntSupplier completedLevelSupplier,Object stage,java.lang.Runnable task) { wrapperContained.enqueue(x,z,completedLevelSupplier,stage,task); }
// public void enqueue(int x,int z,Object stage,java.lang.Runnable task) { wrapperContained.enqueue(x,z,stage,task); }
public java.util.concurrent.CompletableFuture light(yarnwrap.world.chunk.Chunk chunk,boolean excludeBlocks) { return wrapperContained.light(chunk.wrapperContained,excludeBlocks); }
// public void updateChunkStatus(yarnwrap.util.math.ChunkPos pos) { wrapperContained.updateChunkStatus(pos.wrapperContained); }
// public java.util.concurrent.CompletableFuture initializeLight(yarnwrap.world.chunk.Chunk chunk) { return wrapperContained.initializeLight(chunk.wrapperContained); }
// public void method_51287(yarnwrap.util.math.ChunkPos task) { wrapperContained.method_51287(task.wrapperContained); }
public java.util.concurrent.CompletableFuture enqueue(int x,int z) { return wrapperContained.enqueue(x,z); }
// public void method_53695(int callback) { wrapperContained.method_53695(callback); }

}