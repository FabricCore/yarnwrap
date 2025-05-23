package yarnwrap.client.render.chunk;
public class ChunkRenderTaskScheduler { public net.minecraft.client.render.chunk.ChunkRenderTaskScheduler wrapperContained; public ChunkRenderTaskScheduler(net.minecraft.client.render.chunk.ChunkRenderTaskScheduler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int remainingPrioritizableTasks() { return wrapperContained.remainingPrioritizableTasks; }
// public void remainingPrioritizableTasks(int value) { wrapperContained.remainingPrioritizableTasks = value; }
// public static int remainingPrioritizableTasks() { return net.minecraft.client.render.chunk.ChunkRenderTaskScheduler.remainingPrioritizableTasks; }
// public static void remainingPrioritizableTasks(int value, ) { net.minecraft.client.render.chunk.ChunkRenderTaskScheduler.remainingPrioritizableTasks = value; }

// public java.util.List queue() { return wrapperContained.queue; }
// public void queue(java.util.List value) { wrapperContained.queue = value; }
// public static java.util.List queue() { return net.minecraft.client.render.chunk.ChunkRenderTaskScheduler.queue; }
// public static void queue(java.util.List value, ) { net.minecraft.client.render.chunk.ChunkRenderTaskScheduler.queue = value; }

public int size() { return wrapperContained.size(); }
// public static int size() { return net.minecraft.client.render.chunk.ChunkRenderTaskScheduler.size(); }
// public Object remove(int index) { return wrapperContained.remove(index); }
// public static Object remove(int index, ) { return net.minecraft.client.render.chunk.ChunkRenderTaskScheduler.remove(index); }
public Object dequeueNearest(yarnwrap.util.math.Vec3d pos) { return wrapperContained.dequeueNearest(pos.wrapperContained); }
// public static Object dequeueNearest(yarnwrap.util.math.Vec3d pos, ) { return net.minecraft.client.render.chunk.ChunkRenderTaskScheduler.dequeueNearest(pos.wrapperContained); }
// public void enqueue(Object task) { wrapperContained.enqueue(task); }
// public static void enqueue(Object task, ) { net.minecraft.client.render.chunk.ChunkRenderTaskScheduler.enqueue(task); }
public void cancelAll() { wrapperContained.cancelAll(); }
// public static void cancelAll() { net.minecraft.client.render.chunk.ChunkRenderTaskScheduler.cancelAll(); }

}