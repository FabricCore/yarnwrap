package yarnwrap.client.util;
public class ClientSamplerSource { public net.minecraft.client.util.ClientSamplerSource wrapperContained; public ClientSamplerSource(net.minecraft.client.util.ClientSamplerSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.WorldRenderer renderer() { return new yarnwrap.client.render.WorldRenderer(wrapperContained.renderer); }
// public void renderer(yarnwrap.client.render.WorldRenderer value) { wrapperContained.renderer = value.wrapperContained; }
// public java.util.Set samplers() { return wrapperContained.samplers; }
// public void samplers(java.util.Set value) { wrapperContained.samplers = value; }
// public yarnwrap.util.profiler.SamplerFactory factory() { return new yarnwrap.util.profiler.SamplerFactory(wrapperContained.factory); }
// public void factory(yarnwrap.util.profiler.SamplerFactory value) { wrapperContained.factory = value.wrapperContained; }
// public void addInfoSamplers() { wrapperContained.addInfoSamplers(); }

}