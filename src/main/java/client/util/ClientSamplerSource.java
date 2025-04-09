package yarnwrap.client.util;
public class ClientSamplerSource { public net.minecraft.client.util.ClientSamplerSource wrapperContained; public ClientSamplerSource(net.minecraft.client.util.ClientSamplerSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.WorldRenderer renderer() { return new yarnwrap.client.render.WorldRenderer(wrapperContained.renderer); }
// public java.util.Set samplers() { return wrapperContained.samplers; }
// public yarnwrap.util.profiler.SamplerFactory factory() { return new yarnwrap.util.profiler.SamplerFactory(wrapperContained.factory); }
// public void addInfoSamplers() { wrapperContained.addInfoSamplers(); }

}