package yarnwrap.util.thread;
public class ExecutorSampling { public net.minecraft.util.thread.ExecutorSampling wrapperContained; public ExecutorSampling(net.minecraft.util.thread.ExecutorSampling wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.thread.ExecutorSampling INSTANCE() { return new yarnwrap.util.thread.ExecutorSampling(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.util.thread.ExecutorSampling value) { wrapperContained.INSTANCE = value.wrapperContained; }
// public java.util.WeakHashMap activeExecutors() { return wrapperContained.activeExecutors; }
// public void activeExecutors(java.util.WeakHashMap value) { wrapperContained.activeExecutors = value; }
public void add(yarnwrap.util.thread.SampleableExecutor executor) { wrapperContained.add(executor.wrapperContained); }
public java.util.List createSamplers() { return wrapperContained.createSamplers(); }
// public java.util.List mergeSimilarSamplers(java.util.Map samplers) { return wrapperContained.mergeSimilarSamplers(samplers); }

}