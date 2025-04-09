package yarnwrap.client.render.chunk;
public class ChunkBuilder { public net.minecraft.client.render.chunk.ChunkBuilder wrapperContained; public ChunkBuilder(net.minecraft.client.render.chunk.ChunkBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d cameraPosition() { return new yarnwrap.util.math.Vec3d(wrapperContained.cameraPosition); }
// public yarnwrap.client.render.chunk.BlockBufferAllocatorStorage buffers() { return new yarnwrap.client.render.chunk.BlockBufferAllocatorStorage(wrapperContained.buffers); }
// public yarnwrap.util.thread.TaskExecutor mailbox() { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.mailbox); }
// public java.util.concurrent.Executor executor() { return wrapperContained.executor; }
// public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public yarnwrap.client.render.WorldRenderer worldRenderer() { return new yarnwrap.client.render.WorldRenderer(wrapperContained.worldRenderer); }
// public int queuedTaskCount() { return wrapperContained.queuedTaskCount; }
// public java.util.concurrent.PriorityBlockingQueue prioritizedTaskQueue() { return wrapperContained.prioritizedTaskQueue; }
// public java.util.Queue taskQueue() { return wrapperContained.taskQueue; }
// public int processablePrioritizedTaskCount() { return wrapperContained.processablePrioritizedTaskCount; }
// public java.util.Queue uploadQueue() { return wrapperContained.uploadQueue; }
// public yarnwrap.client.render.chunk.BlockBufferBuilderPool buffersPool() { return new yarnwrap.client.render.chunk.BlockBufferBuilderPool(wrapperContained.buffersPool); }
// public boolean stopped() { return wrapperContained.stopped; }
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