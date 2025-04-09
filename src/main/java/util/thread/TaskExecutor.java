package yarnwrap.util.thread;
public class TaskExecutor { public net.minecraft.util.thread.TaskExecutor wrapperContained; public TaskExecutor(net.minecraft.util.thread.TaskExecutor wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.thread.TaskQueue queue() { return new yarnwrap.util.thread.TaskQueue(wrapperContained.queue); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.concurrent.atomic.AtomicInteger stateFlags() { return wrapperContained.stateFlags; }
// public java.util.concurrent.Executor executor() { return wrapperContained.executor; }
// public java.lang.String name() { return wrapperContained.name; }
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
public boolean hasQueuedTasks() { return wrapperContained.hasQueuedTasks(); }

}