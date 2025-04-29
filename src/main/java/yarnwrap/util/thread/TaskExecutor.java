package yarnwrap.util.thread;
public class TaskExecutor { public net.minecraft.util.thread.TaskExecutor wrapperContained; public TaskExecutor(net.minecraft.util.thread.TaskExecutor wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.thread.TaskQueue queue() { return new yarnwrap.util.thread.TaskQueue(wrapperContained.queue); }
// public void queue(yarnwrap.util.thread.TaskQueue value) { wrapperContained.queue = value.wrapperContained; }
// public static yarnwrap.util.thread.TaskQueue queue() { return new yarnwrap.util.thread.TaskQueue(net.minecraft.util.thread.TaskExecutor.queue); }
// public static void queue(yarnwrap.util.thread.TaskQueue value, ) { net.minecraft.util.thread.TaskExecutor.queue = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.thread.TaskExecutor.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.thread.TaskExecutor.LOGGER = value; }

// public java.util.concurrent.atomic.AtomicInteger stateFlags() { return wrapperContained.stateFlags; }
// public void stateFlags(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.stateFlags = value; }
// public static java.util.concurrent.atomic.AtomicInteger stateFlags() { return net.minecraft.util.thread.TaskExecutor.stateFlags; }
// public static void stateFlags(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.util.thread.TaskExecutor.stateFlags = value; }

// public java.util.concurrent.Executor executor() { return wrapperContained.executor; }
// public void executor(java.util.concurrent.Executor value) { wrapperContained.executor = value; }
// public static java.util.concurrent.Executor executor() { return net.minecraft.util.thread.TaskExecutor.executor; }
// public static void executor(java.util.concurrent.Executor value, ) { net.minecraft.util.thread.TaskExecutor.executor = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.util.thread.TaskExecutor.name; }
// public static void name(java.lang.String value, ) { net.minecraft.util.thread.TaskExecutor.name = value; }

public TaskExecutor(yarnwrap.util.thread.TaskQueue queue,java.util.concurrent.Executor executor,java.lang.String name) { this.wrapperContained = new net.minecraft.util.thread.TaskExecutor(queue.wrapperContained,executor,name); }
// public boolean method_16899(int runCount) { return wrapperContained.method_16899(runCount); }
// public static boolean method_16899(int runCount, ) { return net.minecraft.util.thread.TaskExecutor.method_16899(runCount); }
// public int runWhile(it.unimi.dsi.fastutil.ints.Int2BooleanFunction condition) { return wrapperContained.runWhile(condition); }
// public static int runWhile(it.unimi.dsi.fastutil.ints.Int2BooleanFunction condition, ) { return net.minecraft.util.thread.TaskExecutor.runWhile(condition); }
// public yarnwrap.util.thread.TaskExecutor create(java.util.concurrent.Executor executor,java.lang.String name) { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.create(executor,name)); }
// public static yarnwrap.util.thread.TaskExecutor create(java.util.concurrent.Executor executor,java.lang.String name, ) { return new yarnwrap.util.thread.TaskExecutor(net.minecraft.util.thread.TaskExecutor.create(executor,name)); }
// public boolean unpause() { return wrapperContained.unpause(); }
// public static boolean unpause() { return net.minecraft.util.thread.TaskExecutor.unpause(); }
// public void pause() { wrapperContained.pause(); }
// public static void pause() { net.minecraft.util.thread.TaskExecutor.pause(); }
// public boolean hasMessages() { return wrapperContained.hasMessages(); }
// public static boolean hasMessages() { return net.minecraft.util.thread.TaskExecutor.hasMessages(); }
// public boolean isUnpaused() { return wrapperContained.isUnpaused(); }
// public static boolean isUnpaused() { return net.minecraft.util.thread.TaskExecutor.isUnpaused(); }
// public boolean runNext() { return wrapperContained.runNext(); }
// public static boolean runNext() { return net.minecraft.util.thread.TaskExecutor.runNext(); }
// public void execute() { wrapperContained.execute(); }
// public static void execute() { net.minecraft.util.thread.TaskExecutor.execute(); }
public int getQueueSize() { return wrapperContained.getQueueSize(); }
// public static int getQueueSize() { return net.minecraft.util.thread.TaskExecutor.getQueueSize(); }
public void awaitAll() { wrapperContained.awaitAll(); }
// public static void awaitAll() { net.minecraft.util.thread.TaskExecutor.awaitAll(); }
// public boolean method_37478(int runCount) { return wrapperContained.method_37478(runCount); }
// public static boolean method_37478(int runCount, ) { return net.minecraft.util.thread.TaskExecutor.method_37478(runCount); }
public boolean hasQueuedTasks() { return wrapperContained.hasQueuedTasks(); }
// public static boolean hasQueuedTasks() { return net.minecraft.util.thread.TaskExecutor.hasQueuedTasks(); }

}