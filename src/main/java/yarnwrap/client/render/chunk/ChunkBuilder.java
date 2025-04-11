package yarnwrap.client.render.chunk;
public class ChunkBuilder { public net.minecraft.client.render.chunk.ChunkBuilder wrapperContained; public ChunkBuilder(net.minecraft.client.render.chunk.ChunkBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d cameraPosition() { return new yarnwrap.util.math.Vec3d(wrapperContained.cameraPosition); }
// public void cameraPosition(yarnwrap.util.math.Vec3d value) { wrapperContained.cameraPosition = value.wrapperContained; }
// public yarnwrap.client.render.chunk.BlockBufferAllocatorStorage buffers() { return new yarnwrap.client.render.chunk.BlockBufferAllocatorStorage(wrapperContained.buffers); }
// public void buffers(yarnwrap.client.render.chunk.BlockBufferAllocatorStorage value) { wrapperContained.buffers = value.wrapperContained; }
// public yarnwrap.util.thread.TaskExecutor mailbox() { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.mailbox); }
// public void mailbox(yarnwrap.util.thread.TaskExecutor value) { wrapperContained.mailbox = value.wrapperContained; }
// public java.util.concurrent.Executor executor() { return wrapperContained.executor; }
// public void executor(java.util.concurrent.Executor value) { wrapperContained.executor = value; }
// public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public void world(yarnwrap.client.world.ClientWorld value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.client.render.WorldRenderer worldRenderer() { return new yarnwrap.client.render.WorldRenderer(wrapperContained.worldRenderer); }
// public void worldRenderer(yarnwrap.client.render.WorldRenderer value) { wrapperContained.worldRenderer = value.wrapperContained; }
// public int queuedTaskCount() { return wrapperContained.queuedTaskCount; }
// public void queuedTaskCount(int value) { wrapperContained.queuedTaskCount = value; }
// public java.util.concurrent.PriorityBlockingQueue prioritizedTaskQueue() { return wrapperContained.prioritizedTaskQueue; }
// public void prioritizedTaskQueue(java.util.concurrent.PriorityBlockingQueue value) { wrapperContained.prioritizedTaskQueue = value; }
// public java.util.Queue taskQueue() { return wrapperContained.taskQueue; }
// public void taskQueue(java.util.Queue value) { wrapperContained.taskQueue = value; }
// public int processablePrioritizedTaskCount() { return wrapperContained.processablePrioritizedTaskCount; }
// public void processablePrioritizedTaskCount(int value) { wrapperContained.processablePrioritizedTaskCount = value; }
// public java.util.Queue uploadQueue() { return wrapperContained.uploadQueue; }
// public void uploadQueue(java.util.Queue value) { wrapperContained.uploadQueue = value; }
// public yarnwrap.client.render.chunk.BlockBufferBuilderPool buffersPool() { return new yarnwrap.client.render.chunk.BlockBufferBuilderPool(wrapperContained.buffersPool); }
// public void buffersPool(yarnwrap.client.render.chunk.BlockBufferBuilderPool value) { wrapperContained.buffersPool = value.wrapperContained; }
// public boolean stopped() { return wrapperContained.stopped; }
// public void stopped(boolean value) { wrapperContained.stopped = value; }
public void setCameraPosition(yarnwrap.util.math.Vec3d cameraPosition) { wrapperContained.setCameraPosition(cameraPosition.wrapperContained); }
public yarnwrap.util.math.Vec3d getCameraPosition() { return new yarnwrap.util.math.Vec3d(wrapperContained.getCameraPosition()); }
public void setWorld(yarnwrap.client.world.ClientWorld world) { wrapperContained.setWorld(world.wrapperContained); }
// public void send(Object task) { wrapperContained.send(task); }
public void upload() { wrapperContained.upload(); }
// public void scheduleRunTasks() { wrapperContained.scheduleRunTasks(); }
public int getToBatchCount() { return wrapperContained.getToBatchCount(); }
public int getChunksToUpload() { return wrapperContained.getChunksToUpload(); }
public int getFreeBufferCount() { return wrapperContained.getFreeBufferCount(); }
public void stop() { wrapperContained.stop(); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
// public void rebuild(Object chunk,yarnwrap.client.render.chunk.ChunkRendererRegionBuilder builder) { wrapperContained.rebuild(chunk,builder.wrapperContained); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public void reset() { wrapperContained.reset(); }
// public void clear() { wrapperContained.clear(); }
public java.util.concurrent.CompletableFuture scheduleUpload(yarnwrap.client.render.BuiltBuffer builtBuffer,yarnwrap.client.gl.VertexBuffer glBuffer) { return wrapperContained.scheduleUpload(builtBuffer.wrapperContained,glBuffer.wrapperContained); }
// public Object pollTask() { return wrapperContained.pollTask(); }

}