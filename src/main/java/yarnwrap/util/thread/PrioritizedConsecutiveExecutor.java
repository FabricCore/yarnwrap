package yarnwrap.util.thread;
public class PrioritizedConsecutiveExecutor { public net.minecraft.util.thread.PrioritizedConsecutiveExecutor wrapperContained; public PrioritizedConsecutiveExecutor(net.minecraft.util.thread.PrioritizedConsecutiveExecutor wrapperContained) { this.wrapperContained = wrapperContained; }

public PrioritizedConsecutiveExecutor(int priorityCount,java.util.concurrent.Executor executor,java.lang.String name) { this.wrapperContained = new net.minecraft.util.thread.PrioritizedConsecutiveExecutor(priorityCount,executor,name); }
public java.util.concurrent.CompletableFuture executeAsync(int priority,java.util.function.Consumer future) { return wrapperContained.executeAsync(priority,future); }
// public static java.util.concurrent.CompletableFuture executeAsync(int priority,java.util.function.Consumer future, ) { return net.minecraft.util.thread.PrioritizedConsecutiveExecutor.executeAsync(priority,future); }

}