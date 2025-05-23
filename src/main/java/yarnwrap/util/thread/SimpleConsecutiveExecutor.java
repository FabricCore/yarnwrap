package yarnwrap.util.thread;
public class SimpleConsecutiveExecutor { public net.minecraft.util.thread.SimpleConsecutiveExecutor wrapperContained; public SimpleConsecutiveExecutor(net.minecraft.util.thread.SimpleConsecutiveExecutor wrapperContained) { this.wrapperContained = wrapperContained; }

public SimpleConsecutiveExecutor(java.util.concurrent.Executor executor,java.lang.String name) { this.wrapperContained = new net.minecraft.util.thread.SimpleConsecutiveExecutor(executor,name); }

}