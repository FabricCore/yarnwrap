package yarnwrap.util.profiler;
public class SamplerFactory { public net.minecraft.util.profiler.SamplerFactory wrapperContained; public SamplerFactory(net.minecraft.util.profiler.SamplerFactory wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set sampledFullPaths() { return wrapperContained.sampledFullPaths; }
// public void sampledFullPaths(java.util.Set value) { wrapperContained.sampledFullPaths = value; }
// public static java.util.Set sampledFullPaths() { return net.minecraft.util.profiler.SamplerFactory.sampledFullPaths; }
// public static void sampledFullPaths(java.util.Set value, ) { net.minecraft.util.profiler.SamplerFactory.sampledFullPaths = value; }

public java.util.Set createSamplers(java.util.function.Supplier profilerSupplier) { return wrapperContained.createSamplers(profilerSupplier); }
// public static java.util.Set createSamplers(java.util.function.Supplier profilerSupplier, ) { return net.minecraft.util.profiler.SamplerFactory.createSamplers(profilerSupplier); }
// public yarnwrap.util.profiler.Sampler createSampler(java.util.function.Supplier profilerSupplier,java.lang.String id,yarnwrap.util.profiler.SampleType type) { return new yarnwrap.util.profiler.Sampler(wrapperContained.createSampler(profilerSupplier,id,type.wrapperContained)); }
// public static yarnwrap.util.profiler.Sampler createSampler(java.util.function.Supplier profilerSupplier,java.lang.String id,yarnwrap.util.profiler.SampleType type, ) { return new yarnwrap.util.profiler.Sampler(net.minecraft.util.profiler.SamplerFactory.createSampler(profilerSupplier,id,type.wrapperContained)); }
// public yarnwrap.util.profiler.Sampler method_37197(java.util.function.Supplier target) { return new yarnwrap.util.profiler.Sampler(wrapperContained.method_37197(target)); }
// public static yarnwrap.util.profiler.Sampler method_37197(java.util.function.Supplier target, ) { return new yarnwrap.util.profiler.Sampler(net.minecraft.util.profiler.SamplerFactory.method_37197(target)); }
// public boolean method_37198(org.apache.commons.lang3.tuple.Pair target) { return wrapperContained.method_37198(target); }
// public static boolean method_37198(org.apache.commons.lang3.tuple.Pair target, ) { return net.minecraft.util.profiler.SamplerFactory.method_37198(target); }

}