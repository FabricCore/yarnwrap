package yarnwrap.util.profiler;
public class SamplerSource { public net.minecraft.util.profiler.SamplerSource wrapperContained; public SamplerSource(net.minecraft.util.profiler.SamplerSource wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Set getSamplers(java.util.function.Supplier profilerSupplier) { return wrapperContained.getSamplers(profilerSupplier); }
// public static java.util.Set getSamplers(java.util.function.Supplier profilerSupplier, ) { return net.minecraft.util.profiler.SamplerSource.getSamplers(profilerSupplier); }

}