package yarnwrap.util.thread;
public class TaskExecutor { public net.minecraft.util.thread.TaskExecutor wrapperContained; public TaskExecutor(net.minecraft.util.thread.TaskExecutor wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.Runnable createTask(java.lang.Runnable runnable) { return wrapperContained.createTask(runnable); }
// public static java.lang.Runnable createTask(java.lang.Runnable runnable, ) { return net.minecraft.util.thread.TaskExecutor.createTask(runnable); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.util.thread.TaskExecutor.getName(); }
public void send(java.lang.Runnable runnable) { wrapperContained.send(runnable); }
// public static void send(java.lang.Runnable runnable, ) { net.minecraft.util.thread.TaskExecutor.send(runnable); }
// public yarnwrap.util.thread.TaskExecutor of(java.lang.String name,java.util.concurrent.Executor executor) { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.of(name,executor)); }
// public static yarnwrap.util.thread.TaskExecutor of(java.lang.String name,java.util.concurrent.Executor executor, ) { return new yarnwrap.util.thread.TaskExecutor(net.minecraft.util.thread.TaskExecutor.of(name,executor)); }
public java.util.concurrent.CompletableFuture executeAsync(java.util.function.Consumer future) { return wrapperContained.executeAsync(future); }
// public static java.util.concurrent.CompletableFuture executeAsync(java.util.function.Consumer future, ) { return net.minecraft.util.thread.TaskExecutor.executeAsync(future); }

}