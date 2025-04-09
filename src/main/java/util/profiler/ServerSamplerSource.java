package yarnwrap.util.profiler;
public class ServerSamplerSource { public net.minecraft.util.profiler.ServerSamplerSource wrapperContained; public ServerSamplerSource(net.minecraft.util.profiler.ServerSamplerSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set samplers() { return wrapperContained.samplers; }
// public yarnwrap.util.profiler.SamplerFactory factory() { return new yarnwrap.util.profiler.SamplerFactory(wrapperContained.factory); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public java.util.Set createSystemSamplers() { return wrapperContained.createSystemSamplers(); }
public yarnwrap.util.profiler.Sampler createTickTimeTracker(java.util.function.LongSupplier nanoTimeSupplier) { return new yarnwrap.util.profiler.Sampler(wrapperContained.createTickTimeTracker(nanoTimeSupplier)); }

}