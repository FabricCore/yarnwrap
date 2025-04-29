package yarnwrap.util.thread;
public class ExecutorSampling { public net.minecraft.util.thread.ExecutorSampling wrapperContained; public ExecutorSampling(net.minecraft.util.thread.ExecutorSampling wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.thread.ExecutorSampling INSTANCE() { return new yarnwrap.util.thread.ExecutorSampling(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.util.thread.ExecutorSampling value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.util.thread.ExecutorSampling INSTANCE() { return new yarnwrap.util.thread.ExecutorSampling(net.minecraft.util.thread.ExecutorSampling.INSTANCE); }
// public static void INSTANCE(yarnwrap.util.thread.ExecutorSampling value, ) { net.minecraft.util.thread.ExecutorSampling.INSTANCE = value.wrapperContained; }

// public java.util.WeakHashMap activeExecutors() { return wrapperContained.activeExecutors; }
// public void activeExecutors(java.util.WeakHashMap value) { wrapperContained.activeExecutors = value; }
// public static java.util.WeakHashMap activeExecutors() { return net.minecraft.util.thread.ExecutorSampling.activeExecutors; }
// public static void activeExecutors(java.util.WeakHashMap value, ) { net.minecraft.util.thread.ExecutorSampling.activeExecutors = value; }

public void add(yarnwrap.util.thread.SampleableExecutor executor) { wrapperContained.add(executor.wrapperContained); }
// public static void add(yarnwrap.util.thread.SampleableExecutor executor, ) { net.minecraft.util.thread.ExecutorSampling.add(executor.wrapperContained); }
public java.util.List createSamplers() { return wrapperContained.createSamplers(); }
// public static java.util.List createSamplers() { return net.minecraft.util.thread.ExecutorSampling.createSamplers(); }
// public yarnwrap.util.profiler.Sampler method_37179(Object entry) { return new yarnwrap.util.profiler.Sampler(wrapperContained.method_37179(entry)); }
// public static yarnwrap.util.profiler.Sampler method_37179(Object entry, ) { return new yarnwrap.util.profiler.Sampler(net.minecraft.util.thread.ExecutorSampling.method_37179(entry)); }
// public java.util.List mergeSimilarSamplers(java.util.Map samplers) { return wrapperContained.mergeSimilarSamplers(samplers); }
// public static java.util.List mergeSimilarSamplers(java.util.Map samplers, ) { return net.minecraft.util.thread.ExecutorSampling.mergeSimilarSamplers(samplers); }
// public java.util.stream.Stream method_37181(yarnwrap.util.thread.SampleableExecutor executor) { return wrapperContained.method_37181(executor.wrapperContained); }
// public static java.util.stream.Stream method_37181(yarnwrap.util.thread.SampleableExecutor executor, ) { return net.minecraft.util.thread.ExecutorSampling.method_37181(executor.wrapperContained); }

}