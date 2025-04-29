package yarnwrap.client.render.chunk;
public class ChunkBuilder { public net.minecraft.client.render.chunk.ChunkBuilder wrapperContained; public ChunkBuilder(net.minecraft.client.render.chunk.ChunkBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d cameraPosition() { return new yarnwrap.util.math.Vec3d(wrapperContained.cameraPosition); }
// public void cameraPosition(yarnwrap.util.math.Vec3d value) { wrapperContained.cameraPosition = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d cameraPosition() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.chunk.ChunkBuilder.cameraPosition); }
// public static void cameraPosition(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.render.chunk.ChunkBuilder.cameraPosition = value.wrapperContained; }

// public yarnwrap.client.render.chunk.BlockBufferAllocatorStorage buffers() { return new yarnwrap.client.render.chunk.BlockBufferAllocatorStorage(wrapperContained.buffers); }
// public void buffers(yarnwrap.client.render.chunk.BlockBufferAllocatorStorage value) { wrapperContained.buffers = value.wrapperContained; }
// public static yarnwrap.client.render.chunk.BlockBufferAllocatorStorage buffers() { return new yarnwrap.client.render.chunk.BlockBufferAllocatorStorage(net.minecraft.client.render.chunk.ChunkBuilder.buffers); }
// public static void buffers(yarnwrap.client.render.chunk.BlockBufferAllocatorStorage value, ) { net.minecraft.client.render.chunk.ChunkBuilder.buffers = value.wrapperContained; }

// public yarnwrap.util.thread.TaskExecutor mailbox() { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.mailbox); }
// public void mailbox(yarnwrap.util.thread.TaskExecutor value) { wrapperContained.mailbox = value.wrapperContained; }
// public static yarnwrap.util.thread.TaskExecutor mailbox() { return new yarnwrap.util.thread.TaskExecutor(net.minecraft.client.render.chunk.ChunkBuilder.mailbox); }
// public static void mailbox(yarnwrap.util.thread.TaskExecutor value, ) { net.minecraft.client.render.chunk.ChunkBuilder.mailbox = value.wrapperContained; }

// public java.util.concurrent.Executor executor() { return wrapperContained.executor; }
// public void executor(java.util.concurrent.Executor value) { wrapperContained.executor = value; }
// public static java.util.concurrent.Executor executor() { return net.minecraft.client.render.chunk.ChunkBuilder.executor; }
// public static void executor(java.util.concurrent.Executor value, ) { net.minecraft.client.render.chunk.ChunkBuilder.executor = value; }

// public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public void world(yarnwrap.client.world.ClientWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(net.minecraft.client.render.chunk.ChunkBuilder.world); }
// public static void world(yarnwrap.client.world.ClientWorld value, ) { net.minecraft.client.render.chunk.ChunkBuilder.world = value.wrapperContained; }

// public yarnwrap.client.render.WorldRenderer worldRenderer() { return new yarnwrap.client.render.WorldRenderer(wrapperContained.worldRenderer); }
// public void worldRenderer(yarnwrap.client.render.WorldRenderer value) { wrapperContained.worldRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.WorldRenderer worldRenderer() { return new yarnwrap.client.render.WorldRenderer(net.minecraft.client.render.chunk.ChunkBuilder.worldRenderer); }
// public static void worldRenderer(yarnwrap.client.render.WorldRenderer value, ) { net.minecraft.client.render.chunk.ChunkBuilder.worldRenderer = value.wrapperContained; }

// public int queuedTaskCount() { return wrapperContained.queuedTaskCount; }
// public void queuedTaskCount(int value) { wrapperContained.queuedTaskCount = value; }
// public static int queuedTaskCount() { return net.minecraft.client.render.chunk.ChunkBuilder.queuedTaskCount; }
// public static void queuedTaskCount(int value, ) { net.minecraft.client.render.chunk.ChunkBuilder.queuedTaskCount = value; }

// public java.util.concurrent.PriorityBlockingQueue prioritizedTaskQueue() { return wrapperContained.prioritizedTaskQueue; }
// public void prioritizedTaskQueue(java.util.concurrent.PriorityBlockingQueue value) { wrapperContained.prioritizedTaskQueue = value; }
// public static java.util.concurrent.PriorityBlockingQueue prioritizedTaskQueue() { return net.minecraft.client.render.chunk.ChunkBuilder.prioritizedTaskQueue; }
// public static void prioritizedTaskQueue(java.util.concurrent.PriorityBlockingQueue value, ) { net.minecraft.client.render.chunk.ChunkBuilder.prioritizedTaskQueue = value; }

// public java.util.Queue taskQueue() { return wrapperContained.taskQueue; }
// public void taskQueue(java.util.Queue value) { wrapperContained.taskQueue = value; }
// public static java.util.Queue taskQueue() { return net.minecraft.client.render.chunk.ChunkBuilder.taskQueue; }
// public static void taskQueue(java.util.Queue value, ) { net.minecraft.client.render.chunk.ChunkBuilder.taskQueue = value; }

// public int processablePrioritizedTaskCount() { return wrapperContained.processablePrioritizedTaskCount; }
// public void processablePrioritizedTaskCount(int value) { wrapperContained.processablePrioritizedTaskCount = value; }
// public static int processablePrioritizedTaskCount() { return net.minecraft.client.render.chunk.ChunkBuilder.processablePrioritizedTaskCount; }
// public static void processablePrioritizedTaskCount(int value, ) { net.minecraft.client.render.chunk.ChunkBuilder.processablePrioritizedTaskCount = value; }

// public java.util.Queue uploadQueue() { return wrapperContained.uploadQueue; }
// public void uploadQueue(java.util.Queue value) { wrapperContained.uploadQueue = value; }
// public static java.util.Queue uploadQueue() { return net.minecraft.client.render.chunk.ChunkBuilder.uploadQueue; }
// public static void uploadQueue(java.util.Queue value, ) { net.minecraft.client.render.chunk.ChunkBuilder.uploadQueue = value; }

// public yarnwrap.client.render.chunk.BlockBufferBuilderPool buffersPool() { return new yarnwrap.client.render.chunk.BlockBufferBuilderPool(wrapperContained.buffersPool); }
// public void buffersPool(yarnwrap.client.render.chunk.BlockBufferBuilderPool value) { wrapperContained.buffersPool = value.wrapperContained; }
// public static yarnwrap.client.render.chunk.BlockBufferBuilderPool buffersPool() { return new yarnwrap.client.render.chunk.BlockBufferBuilderPool(net.minecraft.client.render.chunk.ChunkBuilder.buffersPool); }
// public static void buffersPool(yarnwrap.client.render.chunk.BlockBufferBuilderPool value, ) { net.minecraft.client.render.chunk.ChunkBuilder.buffersPool = value.wrapperContained; }

// public boolean stopped() { return wrapperContained.stopped; }
// public void stopped(boolean value) { wrapperContained.stopped = value; }
// public static boolean stopped() { return net.minecraft.client.render.chunk.ChunkBuilder.stopped; }
// public static void stopped(boolean value, ) { net.minecraft.client.render.chunk.ChunkBuilder.stopped = value; }

// public ChunkBuilder(yarnwrap.client.world.ClientWorld world,yarnwrap.client.render.WorldRenderer worldRenderer,java.util.concurrent.Executor executor,yarnwrap.client.render.BufferBuilderStorage bufferBuilderStorage) { this.wrapperContained = new net.minecraft.client.render.chunk.ChunkBuilder(world.wrapperContained,worldRenderer.wrapperContained,executor,bufferBuilderStorage.wrapperContained); }
public void setCameraPosition(yarnwrap.util.math.Vec3d cameraPosition) { wrapperContained.setCameraPosition(cameraPosition.wrapperContained); }
// public static void setCameraPosition(yarnwrap.util.math.Vec3d cameraPosition, ) { net.minecraft.client.render.chunk.ChunkBuilder.setCameraPosition(cameraPosition.wrapperContained); }
public yarnwrap.util.math.Vec3d getCameraPosition() { return new yarnwrap.util.math.Vec3d(wrapperContained.getCameraPosition()); }
// public static yarnwrap.util.math.Vec3d getCameraPosition() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.chunk.ChunkBuilder.getCameraPosition()); }
public void setWorld(yarnwrap.client.world.ClientWorld world) { wrapperContained.setWorld(world.wrapperContained); }
// public static void setWorld(yarnwrap.client.world.ClientWorld world, ) { net.minecraft.client.render.chunk.ChunkBuilder.setWorld(world.wrapperContained); }
// public void method_22755(yarnwrap.client.render.chunk.BlockBufferAllocatorStorage result,Object throwable) { wrapperContained.method_22755(result.wrapperContained,throwable); }
// public static void method_22755(yarnwrap.client.render.chunk.BlockBufferAllocatorStorage result,Object throwable, ) { net.minecraft.client.render.chunk.ChunkBuilder.method_22755(result.wrapperContained,throwable); }
// public void send(Object task) { wrapperContained.send(task); }
// public static void send(Object task, ) { net.minecraft.client.render.chunk.ChunkBuilder.send(task); }
public void upload() { wrapperContained.upload(); }
// public static void upload() { net.minecraft.client.render.chunk.ChunkBuilder.upload(); }
// public void scheduleRunTasks() { wrapperContained.scheduleRunTasks(); }
// public static void scheduleRunTasks() { net.minecraft.client.render.chunk.ChunkBuilder.scheduleRunTasks(); }
public int getToBatchCount() { return wrapperContained.getToBatchCount(); }
// public static int getToBatchCount() { return net.minecraft.client.render.chunk.ChunkBuilder.getToBatchCount(); }
public int getChunksToUpload() { return wrapperContained.getChunksToUpload(); }
// public static int getChunksToUpload() { return net.minecraft.client.render.chunk.ChunkBuilder.getChunksToUpload(); }
public int getFreeBufferCount() { return wrapperContained.getFreeBufferCount(); }
// public static int getFreeBufferCount() { return net.minecraft.client.render.chunk.ChunkBuilder.getFreeBufferCount(); }
public void stop() { wrapperContained.stop(); }
// public static void stop() { net.minecraft.client.render.chunk.ChunkBuilder.stop(); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
// public static java.lang.String getDebugString() { return net.minecraft.client.render.chunk.ChunkBuilder.getDebugString(); }
// public void rebuild(Object chunk,yarnwrap.client.render.chunk.ChunkRendererRegionBuilder builder) { wrapperContained.rebuild(chunk,builder.wrapperContained); }
// public static void rebuild(Object chunk,yarnwrap.client.render.chunk.ChunkRendererRegionBuilder builder, ) { net.minecraft.client.render.chunk.ChunkBuilder.rebuild(chunk,builder.wrapperContained); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.client.render.chunk.ChunkBuilder.isEmpty(); }
public void reset() { wrapperContained.reset(); }
// public static void reset() { net.minecraft.client.render.chunk.ChunkBuilder.reset(); }
// public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.render.chunk.ChunkBuilder.clear(); }
public java.util.concurrent.CompletableFuture scheduleUpload(yarnwrap.client.render.BuiltBuffer builtBuffer,yarnwrap.client.gl.VertexBuffer glBuffer) { return wrapperContained.scheduleUpload(builtBuffer.wrapperContained,glBuffer.wrapperContained); }
// public static java.util.concurrent.CompletableFuture scheduleUpload(yarnwrap.client.render.BuiltBuffer builtBuffer,yarnwrap.client.gl.VertexBuffer glBuffer, ) { return net.minecraft.client.render.chunk.ChunkBuilder.scheduleUpload(builtBuffer.wrapperContained,glBuffer.wrapperContained); }
// public java.util.concurrent.CompletionStage method_38555(java.util.concurrent.CompletableFuture future) { return wrapperContained.method_38555(future); }
// public static java.util.concurrent.CompletionStage method_38555(java.util.concurrent.CompletableFuture future, ) { return net.minecraft.client.render.chunk.ChunkBuilder.method_38555(future); }
// public Object pollTask() { return wrapperContained.pollTask(); }
// public static Object pollTask() { return net.minecraft.client.render.chunk.ChunkBuilder.pollTask(); }

}