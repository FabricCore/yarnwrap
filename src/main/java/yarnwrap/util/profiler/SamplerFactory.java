package yarnwrap.util.profiler;
public class SamplerFactory { public net.minecraft.util.profiler.SamplerFactory wrapperContained; public SamplerFactory(net.minecraft.util.profiler.SamplerFactory wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set sampledFullPaths() { return wrapperContained.sampledFullPaths; }
// public void sampledFullPaths(java.util.Set value) { wrapperContained.sampledFullPaths = value; }
public java.util.Set createSamplers(java.util.function.Supplier profilerSupplier) { return wrapperContained.createSamplers(profilerSupplier); }
// public yarnwrap.util.profiler.Sampler createSampler(java.util.function.Supplier profilerSupplier,java.lang.String id,yarnwrap.util.profiler.SampleType type) { return new yarnwrap.util.profiler.Sampler(wrapperContained.createSampler(profilerSupplier,id,type.wrapperContained)); }
// public yarnwrap.util.profiler.Sampler method_37197(java.util.function.Supplier target) { return new yarnwrap.util.profiler.Sampler(wrapperContained.method_37197(target)); }
// public boolean method_37198(org.apache.commons.lang3.tuple.Pair target) { return wrapperContained.method_37198(target); }

}