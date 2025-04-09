package yarnwrap.server.world;
public class ServerLightingProvider { public net.minecraft.server.world.ServerLightingProvider wrapperContained; public ServerLightingProvider(net.minecraft.server.world.ServerLightingProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.util.thread.TaskExecutor processor() { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.processor); }
// public it.unimi.dsi.fastutil.objects.ObjectList pendingTasks() { return wrapperContained.pendingTasks; }
// public yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager() { return new yarnwrap.server.world.ServerChunkLoadingManager(wrapperContained.chunkLoadingManager); }
// public yarnwrap.util.thread.MessageListener executor() { return new yarnwrap.util.thread.MessageListener(wrapperContained.executor); }
// public int taskBatchSize() { return wrapperContained.taskBatchSize; }
// public java.util.concurrent.atomic.AtomicBoolean ticking() { return wrapperContained.ticking; }
// public void runTasks() { wrapperContained.runTasks(); }
public void tick() { wrapperContained.tick(); }
// public void enqueue(int x,int z,java.util.function.IntSupplier completedLevelSupplier,Object stage,java.lang.Runnable task) { wrapperContained.enqueue(x,z,completedLevelSupplier,stage,task); }
// public void enqueue(int x,int z,Object stage,java.lang.Runnable task) { wrapperContained.enqueue(x,z,stage,task); }
public java.util.concurrent.CompletableFuture light(yarnwrap.world.chunk.Chunk chunk,boolean excludeBlocks) { return wrapperContained.light(chunk.wrapperContained,excludeBlocks); }
// public void updateChunkStatus(yarnwrap.util.math.ChunkPos pos) { wrapperContained.updateChunkStatus(pos.wrapperContained); }
// public java.util.concurrent.CompletableFuture initializeLight(yarnwrap.world.chunk.Chunk chunk) { return wrapperContained.initializeLight(chunk.wrapperContained); }
public java.util.concurrent.CompletableFuture enqueue(int x,int z) { return wrapperContained.enqueue(x,z); }

}