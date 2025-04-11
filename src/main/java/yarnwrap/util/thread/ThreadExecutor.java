package yarnwrap.util.thread;
public class ThreadExecutor { public net.minecraft.util.thread.ThreadExecutor wrapperContained; public ThreadExecutor(net.minecraft.util.thread.ThreadExecutor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public int executionsInProgress() { return wrapperContained.executionsInProgress; }
// public void executionsInProgress(int value) { wrapperContained.executionsInProgress = value; }
// public java.util.Queue tasks() { return wrapperContained.tasks; }
// public void tasks(java.util.Queue value) { wrapperContained.tasks = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public ThreadExecutor(java.lang.String name) { this.wrapperContained = new net.minecraft.util.thread.ThreadExecutor(name); }
public void execute(java.lang.Runnable runnable) { wrapperContained.execute(runnable); }
public boolean runTask() { return wrapperContained.runTask(); }
// public java.lang.Runnable createTask(java.lang.Runnable runnable) { return wrapperContained.createTask(runnable); }
public boolean isOnThread() { return wrapperContained.isOnThread(); }
// public void cancelTasks() { wrapperContained.cancelTasks(); }
// public boolean canExecute(java.lang.Runnable task) { return wrapperContained.canExecute(task); }
public void runTasks(java.util.function.BooleanSupplier stopCondition) { wrapperContained.runTasks(stopCondition); }
// public void executeTask(java.lang.Runnable task) { wrapperContained.executeTask(task); }
public void submitAndJoin(java.lang.Runnable runnable) { wrapperContained.submitAndJoin(runnable); }
public java.util.concurrent.CompletableFuture submit(java.lang.Runnable task) { return wrapperContained.submit(task); }
public void waitForTasks() { wrapperContained.waitForTasks(); }
public int getTaskCount() { return wrapperContained.getTaskCount(); }
// public java.lang.Thread getThread() { return wrapperContained.getThread(); }
public void executeSync(java.lang.Runnable runnable) { wrapperContained.executeSync(runnable); }
// public java.util.concurrent.CompletableFuture submitAsync(java.lang.Runnable runnable) { return wrapperContained.submitAsync(runnable); }
// public void runTasks() { wrapperContained.runTasks(); }
// public boolean shouldExecuteAsync() { return wrapperContained.shouldExecuteAsync(); }
public java.util.concurrent.CompletableFuture submit(java.util.function.Supplier task) { return wrapperContained.submit(task); }

}