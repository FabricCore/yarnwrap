package yarnwrap.util.thread;
public class ConsecutiveExecutor { public net.minecraft.util.thread.ConsecutiveExecutor wrapperContained; public ConsecutiveExecutor(net.minecraft.util.thread.ConsecutiveExecutor wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.thread.ConsecutiveExecutor.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.thread.ConsecutiveExecutor.LOGGER = value; }

// public java.util.concurrent.atomic.AtomicReference status() { return wrapperContained.status; }
// public void status(java.util.concurrent.atomic.AtomicReference value) { wrapperContained.status = value; }
// public static java.util.concurrent.atomic.AtomicReference status() { return net.minecraft.util.thread.ConsecutiveExecutor.status; }
// public static void status(java.util.concurrent.atomic.AtomicReference value, ) { net.minecraft.util.thread.ConsecutiveExecutor.status = value; }

// public yarnwrap.util.thread.TaskQueue queue() { return new yarnwrap.util.thread.TaskQueue(wrapperContained.queue); }
// public void queue(yarnwrap.util.thread.TaskQueue value) { wrapperContained.queue = value.wrapperContained; }
// public static yarnwrap.util.thread.TaskQueue queue() { return new yarnwrap.util.thread.TaskQueue(net.minecraft.util.thread.ConsecutiveExecutor.queue); }
// public static void queue(yarnwrap.util.thread.TaskQueue value, ) { net.minecraft.util.thread.ConsecutiveExecutor.queue = value.wrapperContained; }

// public java.util.concurrent.Executor executor() { return wrapperContained.executor; }
// public void executor(java.util.concurrent.Executor value) { wrapperContained.executor = value; }
// public static java.util.concurrent.Executor executor() { return net.minecraft.util.thread.ConsecutiveExecutor.executor; }
// public static void executor(java.util.concurrent.Executor value, ) { net.minecraft.util.thread.ConsecutiveExecutor.executor = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.util.thread.ConsecutiveExecutor.name; }
// public static void name(java.lang.String value, ) { net.minecraft.util.thread.ConsecutiveExecutor.name = value; }

// public ConsecutiveExecutor(yarnwrap.util.thread.TaskQueue queue,java.util.concurrent.Executor executor,java.lang.String name) { this.wrapperContained = new net.minecraft.util.thread.ConsecutiveExecutor(queue.wrapperContained,executor,name); }
public void runAll() { wrapperContained.runAll(); }
// public static void runAll() { net.minecraft.util.thread.ConsecutiveExecutor.runAll(); }
public int queueSize() { return wrapperContained.queueSize(); }
// public static int queueSize() { return net.minecraft.util.thread.ConsecutiveExecutor.queueSize(); }
public boolean hasQueuedTasks() { return wrapperContained.hasQueuedTasks(); }
// public static boolean hasQueuedTasks() { return net.minecraft.util.thread.ConsecutiveExecutor.hasQueuedTasks(); }
// public boolean canRun() { return wrapperContained.canRun(); }
// public static boolean canRun() { return net.minecraft.util.thread.ConsecutiveExecutor.canRun(); }
// public boolean runOnce() { return wrapperContained.runOnce(); }
// public static boolean runOnce() { return net.minecraft.util.thread.ConsecutiveExecutor.runOnce(); }
// public void scheduleSelf() { wrapperContained.scheduleSelf(); }
// public static void scheduleSelf() { net.minecraft.util.thread.ConsecutiveExecutor.scheduleSelf(); }
// public boolean wakeUp() { return wrapperContained.wakeUp(); }
// public static boolean wakeUp() { return net.minecraft.util.thread.ConsecutiveExecutor.wakeUp(); }
// public void sleep() { wrapperContained.sleep(); }
// public static void sleep() { net.minecraft.util.thread.ConsecutiveExecutor.sleep(); }
// public boolean isRunning() { return wrapperContained.isRunning(); }
// public static boolean isRunning() { return net.minecraft.util.thread.ConsecutiveExecutor.isRunning(); }
// public boolean isClosed() { return wrapperContained.isClosed(); }
// public static boolean isClosed() { return net.minecraft.util.thread.ConsecutiveExecutor.isClosed(); }

}