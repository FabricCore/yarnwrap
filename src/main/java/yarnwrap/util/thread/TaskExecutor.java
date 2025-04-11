package yarnwrap.util.thread;
public class TaskExecutor { public net.minecraft.util.thread.TaskExecutor wrapperContained; public TaskExecutor(net.minecraft.util.thread.TaskExecutor wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.thread.TaskQueue queue() { return new yarnwrap.util.thread.TaskQueue(wrapperContained.queue); }
// public void queue(yarnwrap.util.thread.TaskQueue value) { wrapperContained.queue = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.concurrent.atomic.AtomicInteger stateFlags() { return wrapperContained.stateFlags; }
// public void stateFlags(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.stateFlags = value; }
// public java.util.concurrent.Executor executor() { return wrapperContained.executor; }
// public void executor(java.util.concurrent.Executor value) { wrapperContained.executor = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public TaskExecutor(yarnwrap.util.thread.TaskQueue queue,java.util.concurrent.Executor executor,java.lang.String name) { this.wrapperContained = new net.minecraft.util.thread.TaskExecutor(queue.wrapperContained,executor,name); }
// public boolean method_16899(int runCount) { return wrapperContained.method_16899(runCount); }
// public int runWhile(it.unimi.dsi.fastutil.ints.Int2BooleanFunction condition) { return wrapperContained.runWhile(condition); }
public yarnwrap.util.thread.TaskExecutor create(java.util.concurrent.Executor executor,java.lang.String name) { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.create(executor,name)); }
// public boolean unpause() { return wrapperContained.unpause(); }
// public void pause() { wrapperContained.pause(); }
// public boolean hasMessages() { return wrapperContained.hasMessages(); }
// public boolean isUnpaused() { return wrapperContained.isUnpaused(); }
// public boolean runNext() { return wrapperContained.runNext(); }
// public void execute() { wrapperContained.execute(); }
public int getQueueSize() { return wrapperContained.getQueueSize(); }
public void awaitAll() { wrapperContained.awaitAll(); }
// public boolean method_37478(int runCount) { return wrapperContained.method_37478(runCount); }
public boolean hasQueuedTasks() { return wrapperContained.hasQueuedTasks(); }

}