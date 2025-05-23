package yarnwrap.server.world;
public class ThrottledChunkTaskScheduler { public net.minecraft.server.world.ThrottledChunkTaskScheduler wrapperContained; public ThrottledChunkTaskScheduler(net.minecraft.server.world.ThrottledChunkTaskScheduler wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.longs.LongSet chunks() { return wrapperContained.chunks; }
// public void chunks(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.chunks = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet chunks() { return net.minecraft.server.world.ThrottledChunkTaskScheduler.chunks; }
// public static void chunks(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.server.world.ThrottledChunkTaskScheduler.chunks = value; }

// public int maxConcurrentChunks() { return wrapperContained.maxConcurrentChunks; }
// public void maxConcurrentChunks(int value) { wrapperContained.maxConcurrentChunks = value; }
// public static int maxConcurrentChunks() { return net.minecraft.server.world.ThrottledChunkTaskScheduler.maxConcurrentChunks; }
// public static void maxConcurrentChunks(int value, ) { net.minecraft.server.world.ThrottledChunkTaskScheduler.maxConcurrentChunks = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.server.world.ThrottledChunkTaskScheduler.name; }
// public static void name(java.lang.String value, ) { net.minecraft.server.world.ThrottledChunkTaskScheduler.name = value; }

public ThrottledChunkTaskScheduler(yarnwrap.util.thread.TaskExecutor executor,java.util.concurrent.Executor dispatchExecutor,int maxConcurrentChunks) { this.wrapperContained = new net.minecraft.server.world.ThrottledChunkTaskScheduler(executor.wrapperContained,dispatchExecutor,maxConcurrentChunks); }
// public java.lang.String method_63564(long chunkPos) { return wrapperContained.method_63564(chunkPos); }
// public static java.lang.String method_63564(long chunkPos, ) { return net.minecraft.server.world.ThrottledChunkTaskScheduler.method_63564(chunkPos); }
public java.lang.String toDumpString() { return wrapperContained.toDumpString(); }
// public static java.lang.String toDumpString() { return net.minecraft.server.world.ThrottledChunkTaskScheduler.toDumpString(); }

}