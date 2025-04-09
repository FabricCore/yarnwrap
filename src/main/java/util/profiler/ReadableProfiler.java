package yarnwrap.util.profiler;
public class ReadableProfiler { public net.minecraft.util.profiler.ReadableProfiler wrapperContained; public ReadableProfiler(net.minecraft.util.profiler.ReadableProfiler wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.profiler.ProfileResult getResult() { return new yarnwrap.util.profiler.ProfileResult(wrapperContained.getResult()); }
public Object getInfo(java.lang.String name) { return wrapperContained.getInfo(name); }
public java.util.Set getSampleTargets() { return wrapperContained.getSampleTargets(); }

}