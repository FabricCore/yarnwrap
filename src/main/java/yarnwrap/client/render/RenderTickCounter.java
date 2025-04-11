package yarnwrap.client.render;
public class RenderTickCounter { public net.minecraft.client.render.RenderTickCounter wrapperContained; public RenderTickCounter(net.minecraft.client.render.RenderTickCounter wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.RenderTickCounter ZERO() { return new yarnwrap.client.render.RenderTickCounter(wrapperContained.ZERO); }
// public void ZERO(yarnwrap.client.render.RenderTickCounter value) { wrapperContained.ZERO = value.wrapperContained; }
public yarnwrap.client.render.RenderTickCounter ONE() { return new yarnwrap.client.render.RenderTickCounter(wrapperContained.ONE); }
// public void ONE(yarnwrap.client.render.RenderTickCounter value) { wrapperContained.ONE = value.wrapperContained; }
public float getLastFrameDuration() { return wrapperContained.getLastFrameDuration(); }
// public float getTickDelta() { return wrapperContained.getTickDelta(); }
public float getLastDuration() { return wrapperContained.getLastDuration(); }

}