package yarnwrap.util.profiler;
public class ServerSamplerSource { public net.minecraft.util.profiler.ServerSamplerSource wrapperContained; public ServerSamplerSource(net.minecraft.util.profiler.ServerSamplerSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set samplers() { return wrapperContained.samplers; }
// public void samplers(java.util.Set value) { wrapperContained.samplers = value; }
// public yarnwrap.util.profiler.SamplerFactory factory() { return new yarnwrap.util.profiler.SamplerFactory(wrapperContained.factory); }
// public void factory(yarnwrap.util.profiler.SamplerFactory value) { wrapperContained.factory = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public ServerSamplerSource(java.util.function.LongSupplier nanoTimeSupplier,boolean includeSystem) { this.wrapperContained = new net.minecraft.util.profiler.ServerSamplerSource(nanoTimeSupplier,includeSystem); }
public java.util.Set createSystemSamplers() { return wrapperContained.createSystemSamplers(); }
// public yarnwrap.util.profiler.Sampler method_37200(Object index) { return new yarnwrap.util.profiler.Sampler(wrapperContained.method_37200(index)); }
// public double method_37201(com.google.common.base.Stopwatch watch) { return wrapperContained.method_37201(watch); }
public yarnwrap.util.profiler.Sampler createTickTimeTracker(java.util.function.LongSupplier nanoTimeSupplier) { return new yarnwrap.util.profiler.Sampler(wrapperContained.createTickTimeTracker(nanoTimeSupplier)); }

}