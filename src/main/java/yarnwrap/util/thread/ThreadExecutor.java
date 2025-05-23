package yarnwrap.util.thread;
public class ThreadExecutor { public net.minecraft.util.thread.ThreadExecutor wrapperContained; public ThreadExecutor(net.minecraft.util.thread.ThreadExecutor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Queue tasks() { return wrapperContained.tasks; }
// public void tasks(java.util.Queue value) { wrapperContained.tasks = value; }
// public static java.util.Queue tasks() { return net.minecraft.util.thread.ThreadExecutor.tasks; }
// public static void tasks(java.util.Queue value, ) { net.minecraft.util.thread.ThreadExecutor.tasks = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.thread.ThreadExecutor.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.thread.ThreadExecutor.LOGGER = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.util.thread.ThreadExecutor.name; }
// public static void name(java.lang.String value, ) { net.minecraft.util.thread.ThreadExecutor.name = value; }

// public int executionsInProgress() { return wrapperContained.executionsInProgress; }
// public void executionsInProgress(int value) { wrapperContained.executionsInProgress = value; }
// public static int executionsInProgress() { return net.minecraft.util.thread.ThreadExecutor.executionsInProgress; }
// public static void executionsInProgress(int value, ) { net.minecraft.util.thread.ThreadExecutor.executionsInProgress = value; }

// public ThreadExecutor(java.lang.String name) { this.wrapperContained = new net.minecraft.util.thread.ThreadExecutor(name); }
public void execute(java.lang.Runnable runnable) { wrapperContained.execute(runnable); }
// public static void execute(java.lang.Runnable runnable, ) { net.minecraft.util.thread.ThreadExecutor.execute(runnable); }
// public java.lang.Thread getThread() { return wrapperContained.getThread(); }
// public static java.lang.Thread getThread() { return net.minecraft.util.thread.ThreadExecutor.getThread(); }
// public java.util.concurrent.CompletableFuture submitAsync(java.lang.Runnable runnable) { return wrapperContained.submitAsync(runnable); }
// public static java.util.concurrent.CompletableFuture submitAsync(java.lang.Runnable runnable, ) { return net.minecraft.util.thread.ThreadExecutor.submitAsync(runnable); }
// public void runTasks() { wrapperContained.runTasks(); }
// public static void runTasks() { net.minecraft.util.thread.ThreadExecutor.runTasks(); }
// public boolean shouldExecuteAsync() { return wrapperContained.shouldExecuteAsync(); }
// public static boolean shouldExecuteAsync() { return net.minecraft.util.thread.ThreadExecutor.shouldExecuteAsync(); }
public java.util.concurrent.CompletableFuture submit(java.util.function.Supplier task) { return wrapperContained.submit(task); }
// public static java.util.concurrent.CompletableFuture submit(java.util.function.Supplier task, ) { return net.minecraft.util.thread.ThreadExecutor.submit(task); }
public boolean runTask() { return wrapperContained.runTask(); }
// public static boolean runTask() { return net.minecraft.util.thread.ThreadExecutor.runTask(); }
public boolean isOnThread() { return wrapperContained.isOnThread(); }
// public static boolean isOnThread() { return net.minecraft.util.thread.ThreadExecutor.isOnThread(); }
// public void cancelTasks() { wrapperContained.cancelTasks(); }
// public static void cancelTasks() { net.minecraft.util.thread.ThreadExecutor.cancelTasks(); }
// public boolean canExecute(java.lang.Runnable task) { return wrapperContained.canExecute(task); }
// public static boolean canExecute(java.lang.Runnable task, ) { return net.minecraft.util.thread.ThreadExecutor.canExecute(task); }
public void runTasks(java.util.function.BooleanSupplier stopCondition) { wrapperContained.runTasks(stopCondition); }
// public static void runTasks(java.util.function.BooleanSupplier stopCondition, ) { net.minecraft.util.thread.ThreadExecutor.runTasks(stopCondition); }
// public void executeTask(java.lang.Runnable task) { wrapperContained.executeTask(task); }
// public static void executeTask(java.lang.Runnable task, ) { net.minecraft.util.thread.ThreadExecutor.executeTask(task); }
public void submitAndJoin(java.lang.Runnable runnable) { wrapperContained.submitAndJoin(runnable); }
// public static void submitAndJoin(java.lang.Runnable runnable, ) { net.minecraft.util.thread.ThreadExecutor.submitAndJoin(runnable); }
public java.util.concurrent.CompletableFuture submit(java.lang.Runnable task) { return wrapperContained.submit(task); }
// public static java.util.concurrent.CompletableFuture submit(java.lang.Runnable task, ) { return net.minecraft.util.thread.ThreadExecutor.submit(task); }
// public void waitForTasks() { wrapperContained.waitForTasks(); }
// public static void waitForTasks() { net.minecraft.util.thread.ThreadExecutor.waitForTasks(); }
public int getTaskCount() { return wrapperContained.getTaskCount(); }
// public static int getTaskCount() { return net.minecraft.util.thread.ThreadExecutor.getTaskCount(); }
public void executeSync(java.lang.Runnable runnable) { wrapperContained.executeSync(runnable); }
// public static void executeSync(java.lang.Runnable runnable, ) { net.minecraft.util.thread.ThreadExecutor.executeSync(runnable); }
// public boolean isMemoryError(java.lang.Throwable exception) { return wrapperContained.isMemoryError(exception); }
// public static boolean isMemoryError(java.lang.Throwable exception, ) { return net.minecraft.util.thread.ThreadExecutor.isMemoryError(exception); }

}