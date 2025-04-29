package yarnwrap.util.profiler;
public class ServerSamplerSource { public net.minecraft.util.profiler.ServerSamplerSource wrapperContained; public ServerSamplerSource(net.minecraft.util.profiler.ServerSamplerSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set samplers() { return wrapperContained.samplers; }
// public void samplers(java.util.Set value) { wrapperContained.samplers = value; }
// public static java.util.Set samplers() { return net.minecraft.util.profiler.ServerSamplerSource.samplers; }
// public static void samplers(java.util.Set value, ) { net.minecraft.util.profiler.ServerSamplerSource.samplers = value; }

// public yarnwrap.util.profiler.SamplerFactory factory() { return new yarnwrap.util.profiler.SamplerFactory(wrapperContained.factory); }
// public void factory(yarnwrap.util.profiler.SamplerFactory value) { wrapperContained.factory = value.wrapperContained; }
// public static yarnwrap.util.profiler.SamplerFactory factory() { return new yarnwrap.util.profiler.SamplerFactory(net.minecraft.util.profiler.ServerSamplerSource.factory); }
// public static void factory(yarnwrap.util.profiler.SamplerFactory value, ) { net.minecraft.util.profiler.ServerSamplerSource.factory = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.profiler.ServerSamplerSource.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.profiler.ServerSamplerSource.LOGGER = value; }

public ServerSamplerSource(java.util.function.LongSupplier nanoTimeSupplier,boolean includeSystem) { this.wrapperContained = new net.minecraft.util.profiler.ServerSamplerSource(nanoTimeSupplier,includeSystem); }
// public java.util.Set createSystemSamplers() { return wrapperContained.createSystemSamplers(); }
public static java.util.Set createSystemSamplers() { return net.minecraft.util.profiler.ServerSamplerSource.createSystemSamplers(); }
// public yarnwrap.util.profiler.Sampler method_37200(Object index) { return new yarnwrap.util.profiler.Sampler(wrapperContained.method_37200(index)); }
// public static yarnwrap.util.profiler.Sampler method_37200(Object index, ) { return new yarnwrap.util.profiler.Sampler(net.minecraft.util.profiler.ServerSamplerSource.method_37200(index)); }
// public double method_37201(com.google.common.base.Stopwatch watch) { return wrapperContained.method_37201(watch); }
// public static double method_37201(com.google.common.base.Stopwatch watch, ) { return net.minecraft.util.profiler.ServerSamplerSource.method_37201(watch); }
// public yarnwrap.util.profiler.Sampler createTickTimeTracker(java.util.function.LongSupplier nanoTimeSupplier) { return new yarnwrap.util.profiler.Sampler(wrapperContained.createTickTimeTracker(nanoTimeSupplier)); }
// public static yarnwrap.util.profiler.Sampler createTickTimeTracker(java.util.function.LongSupplier nanoTimeSupplier, ) { return new yarnwrap.util.profiler.Sampler(net.minecraft.util.profiler.ServerSamplerSource.createTickTimeTracker(nanoTimeSupplier)); }

}