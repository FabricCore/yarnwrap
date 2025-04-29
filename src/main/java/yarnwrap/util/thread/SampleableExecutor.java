package yarnwrap.util.thread;
public class SampleableExecutor { public net.minecraft.util.thread.SampleableExecutor wrapperContained; public SampleableExecutor(net.minecraft.util.thread.SampleableExecutor wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List createSamplers() { return wrapperContained.createSamplers(); }
// public static java.util.List createSamplers() { return net.minecraft.util.thread.SampleableExecutor.createSamplers(); }

}