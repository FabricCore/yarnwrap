package yarnwrap.client.util;
public class ClientSamplerSource { public net.minecraft.client.util.ClientSamplerSource wrapperContained; public ClientSamplerSource(net.minecraft.client.util.ClientSamplerSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.WorldRenderer renderer() { return new yarnwrap.client.render.WorldRenderer(wrapperContained.renderer); }
// public void renderer(yarnwrap.client.render.WorldRenderer value) { wrapperContained.renderer = value.wrapperContained; }
// public static yarnwrap.client.render.WorldRenderer renderer() { return new yarnwrap.client.render.WorldRenderer(net.minecraft.client.util.ClientSamplerSource.renderer); }
// public static void renderer(yarnwrap.client.render.WorldRenderer value, ) { net.minecraft.client.util.ClientSamplerSource.renderer = value.wrapperContained; }

// public java.util.Set samplers() { return wrapperContained.samplers; }
// public void samplers(java.util.Set value) { wrapperContained.samplers = value; }
// public static java.util.Set samplers() { return net.minecraft.client.util.ClientSamplerSource.samplers; }
// public static void samplers(java.util.Set value, ) { net.minecraft.client.util.ClientSamplerSource.samplers = value; }

// public yarnwrap.util.profiler.SamplerFactory factory() { return new yarnwrap.util.profiler.SamplerFactory(wrapperContained.factory); }
// public void factory(yarnwrap.util.profiler.SamplerFactory value) { wrapperContained.factory = value.wrapperContained; }
// public static yarnwrap.util.profiler.SamplerFactory factory() { return new yarnwrap.util.profiler.SamplerFactory(net.minecraft.client.util.ClientSamplerSource.factory); }
// public static void factory(yarnwrap.util.profiler.SamplerFactory value, ) { net.minecraft.client.util.ClientSamplerSource.factory = value.wrapperContained; }

public ClientSamplerSource(java.util.function.LongSupplier nanoTimeSupplier,yarnwrap.client.render.WorldRenderer renderer) { this.wrapperContained = new net.minecraft.client.util.ClientSamplerSource(nanoTimeSupplier,renderer.wrapperContained); }
// public void addInfoSamplers() { wrapperContained.addInfoSamplers(); }
// public static void addInfoSamplers() { net.minecraft.client.util.ClientSamplerSource.addInfoSamplers(); }

}