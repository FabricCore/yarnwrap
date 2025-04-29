package yarnwrap.client.render;
public class RenderTickCounter { public net.minecraft.client.render.RenderTickCounter wrapperContained; public RenderTickCounter(net.minecraft.client.render.RenderTickCounter wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.RenderTickCounter ZERO() { return new yarnwrap.client.render.RenderTickCounter(wrapperContained.ZERO); }
// public void ZERO(yarnwrap.client.render.RenderTickCounter value) { wrapperContained.ZERO = value.wrapperContained; }
public static yarnwrap.client.render.RenderTickCounter ZERO() { return new yarnwrap.client.render.RenderTickCounter(net.minecraft.client.render.RenderTickCounter.ZERO); }
// public static void ZERO(yarnwrap.client.render.RenderTickCounter value, ) { net.minecraft.client.render.RenderTickCounter.ZERO = value.wrapperContained; }

// public yarnwrap.client.render.RenderTickCounter ONE() { return new yarnwrap.client.render.RenderTickCounter(wrapperContained.ONE); }
// public void ONE(yarnwrap.client.render.RenderTickCounter value) { wrapperContained.ONE = value.wrapperContained; }
public static yarnwrap.client.render.RenderTickCounter ONE() { return new yarnwrap.client.render.RenderTickCounter(net.minecraft.client.render.RenderTickCounter.ONE); }
// public static void ONE(yarnwrap.client.render.RenderTickCounter value, ) { net.minecraft.client.render.RenderTickCounter.ONE = value.wrapperContained; }

public float getLastFrameDuration() { return wrapperContained.getLastFrameDuration(); }
// public static float getLastFrameDuration() { return net.minecraft.client.render.RenderTickCounter.getLastFrameDuration(); }
// public float getTickDelta() { return wrapperContained.getTickDelta(); }
// public static float getTickDelta() { return net.minecraft.client.render.RenderTickCounter.getTickDelta(); }
public float getLastDuration() { return wrapperContained.getLastDuration(); }
// public static float getLastDuration() { return net.minecraft.client.render.RenderTickCounter.getLastDuration(); }

}