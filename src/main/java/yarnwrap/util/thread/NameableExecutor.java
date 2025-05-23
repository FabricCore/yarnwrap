package yarnwrap.util.thread;
public class NameableExecutor { public net.minecraft.util.thread.NameableExecutor wrapperContained; public NameableExecutor(net.minecraft.util.thread.NameableExecutor wrapperContained) { this.wrapperContained = wrapperContained; }

public void execute(java.lang.Runnable runnable) { wrapperContained.execute(runnable); }
// public static void execute(java.lang.Runnable runnable, ) { net.minecraft.util.thread.NameableExecutor.execute(runnable); }
public void shutdown(long time,java.util.concurrent.TimeUnit unit) { wrapperContained.shutdown(time,unit); }
// public static void shutdown(long time,java.util.concurrent.TimeUnit unit, ) { net.minecraft.util.thread.NameableExecutor.shutdown(time,unit); }
// public java.lang.Runnable wrapForTracy(java.lang.Runnable runnable) { return wrapperContained.wrapForTracy(runnable); }
// public static java.lang.Runnable wrapForTracy(java.lang.Runnable runnable, ) { return net.minecraft.util.thread.NameableExecutor.wrapForTracy(runnable); }
public java.util.concurrent.Executor named(java.lang.String name) { return wrapperContained.named(name); }
// public static java.util.concurrent.Executor named(java.lang.String name, ) { return net.minecraft.util.thread.NameableExecutor.named(name); }
// public void method_64117(java.lang.String runnable) { wrapperContained.method_64117(runnable); }
// public static void method_64117(java.lang.String runnable, ) { net.minecraft.util.thread.NameableExecutor.method_64117(runnable); }
// public void method_64120(java.lang.String runnable) { wrapperContained.method_64120(runnable); }
// public static void method_64120(java.lang.String runnable, ) { net.minecraft.util.thread.NameableExecutor.method_64120(runnable); }

}