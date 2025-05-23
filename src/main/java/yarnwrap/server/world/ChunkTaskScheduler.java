package yarnwrap.server.world;
public class ChunkTaskScheduler { public net.minecraft.server.world.ChunkTaskScheduler wrapperContained; public ChunkTaskScheduler(net.minecraft.server.world.ChunkTaskScheduler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int LEVELS() { return wrapperContained.LEVELS; }
// public void LEVELS(int value) { wrapperContained.LEVELS = value; }
public static int LEVELS() { return net.minecraft.server.world.ChunkTaskScheduler.LEVELS; }
// public static void LEVELS(int value, ) { net.minecraft.server.world.ChunkTaskScheduler.LEVELS = value; }

// public boolean pollOnUpdate() { return wrapperContained.pollOnUpdate; }
// public void pollOnUpdate(boolean value) { wrapperContained.pollOnUpdate = value; }
// public static boolean pollOnUpdate() { return net.minecraft.server.world.ChunkTaskScheduler.pollOnUpdate; }
// public static void pollOnUpdate(boolean value, ) { net.minecraft.server.world.ChunkTaskScheduler.pollOnUpdate = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.world.ChunkTaskScheduler.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.world.ChunkTaskScheduler.LOGGER = value; }

// public yarnwrap.server.world.LevelPrioritizedQueue queue() { return new yarnwrap.server.world.LevelPrioritizedQueue(wrapperContained.queue); }
// public void queue(yarnwrap.server.world.LevelPrioritizedQueue value) { wrapperContained.queue = value.wrapperContained; }
// public static yarnwrap.server.world.LevelPrioritizedQueue queue() { return new yarnwrap.server.world.LevelPrioritizedQueue(net.minecraft.server.world.ChunkTaskScheduler.queue); }
// public static void queue(yarnwrap.server.world.LevelPrioritizedQueue value, ) { net.minecraft.server.world.ChunkTaskScheduler.queue = value.wrapperContained; }

// public yarnwrap.util.thread.TaskExecutor executor() { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.executor); }
// public void executor(yarnwrap.util.thread.TaskExecutor value) { wrapperContained.executor = value.wrapperContained; }
// public static yarnwrap.util.thread.TaskExecutor executor() { return new yarnwrap.util.thread.TaskExecutor(net.minecraft.server.world.ChunkTaskScheduler.executor); }
// public static void executor(yarnwrap.util.thread.TaskExecutor value, ) { net.minecraft.server.world.ChunkTaskScheduler.executor = value.wrapperContained; }

// public yarnwrap.util.thread.PrioritizedConsecutiveExecutor dispatcher() { return new yarnwrap.util.thread.PrioritizedConsecutiveExecutor(wrapperContained.dispatcher); }
// public void dispatcher(yarnwrap.util.thread.PrioritizedConsecutiveExecutor value) { wrapperContained.dispatcher = value.wrapperContained; }
// public static yarnwrap.util.thread.PrioritizedConsecutiveExecutor dispatcher() { return new yarnwrap.util.thread.PrioritizedConsecutiveExecutor(net.minecraft.server.world.ChunkTaskScheduler.dispatcher); }
// public static void dispatcher(yarnwrap.util.thread.PrioritizedConsecutiveExecutor value, ) { net.minecraft.server.world.ChunkTaskScheduler.dispatcher = value.wrapperContained; }

public ChunkTaskScheduler(yarnwrap.util.thread.TaskExecutor executor,java.util.concurrent.Executor dispatchExecutor) { this.wrapperContained = new net.minecraft.server.world.ChunkTaskScheduler(executor.wrapperContained,dispatchExecutor); }
public boolean shouldDelayShutdown() { return wrapperContained.shouldDelayShutdown(); }
// public static boolean shouldDelayShutdown() { return net.minecraft.server.world.ChunkTaskScheduler.shouldDelayShutdown(); }
// public void onRemove(long chunkPos) { wrapperContained.onRemove(chunkPos); }
// public static void onRemove(long chunkPos, ) { net.minecraft.server.world.ChunkTaskScheduler.onRemove(chunkPos); }
public void remove(long pos,java.lang.Runnable callback,boolean removeElement) { wrapperContained.remove(pos,callback,removeElement); }
// public static void remove(long pos,java.lang.Runnable callback,boolean removeElement, ) { net.minecraft.server.world.ChunkTaskScheduler.remove(pos,callback,removeElement); }
// public void schedule(Object entry) { wrapperContained.schedule(entry); }
// public static void schedule(Object entry, ) { net.minecraft.server.world.ChunkTaskScheduler.schedule(entry); }
// public java.util.concurrent.CompletableFuture method_63552(java.lang.Runnable runnable) { return wrapperContained.method_63552(runnable); }
// public static java.util.concurrent.CompletableFuture method_63552(java.lang.Runnable runnable, ) { return net.minecraft.server.world.ChunkTaskScheduler.method_63552(runnable); }
public void add(java.lang.Runnable runnable,long pos,java.util.function.IntSupplier levelGetter) { wrapperContained.add(runnable,pos,levelGetter); }
// public static void add(java.lang.Runnable runnable,long pos,java.util.function.IntSupplier levelGetter, ) { net.minecraft.server.world.ChunkTaskScheduler.add(runnable,pos,levelGetter); }
// public void method_63554(java.lang.Runnable future) { wrapperContained.method_63554(future); }
// public static void method_63554(java.lang.Runnable future, ) { net.minecraft.server.world.ChunkTaskScheduler.method_63554(future); }
// public void method_63555(java.lang.Void v) { wrapperContained.method_63555(v); }
// public static void method_63555(java.lang.Void v, ) { net.minecraft.server.world.ChunkTaskScheduler.method_63555(v); }
// public void pollTask() { wrapperContained.pollTask(); }
// public static void pollTask() { net.minecraft.server.world.ChunkTaskScheduler.pollTask(); }
// public Object poll() { return wrapperContained.poll(); }
// public static Object poll() { return net.minecraft.server.world.ChunkTaskScheduler.poll(); }

}