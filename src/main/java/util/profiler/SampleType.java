package yarnwrap.util.profiler;
public class SampleType { public net.minecraft.util.profiler.SampleType wrapperContained; public SampleType(net.minecraft.util.profiler.SampleType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
public java.lang.String getName() { return wrapperContained.getName(); }

}