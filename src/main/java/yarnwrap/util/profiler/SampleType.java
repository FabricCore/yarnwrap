package yarnwrap.util.profiler;
public class SampleType { public net.minecraft.util.profiler.SampleType wrapperContained; public SampleType(net.minecraft.util.profiler.SampleType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public SampleType(java.lang.String name) { this.wrapperContained = new net.minecraft.util.profiler.SampleType(name); }
public java.lang.String getName() { return wrapperContained.getName(); }

}