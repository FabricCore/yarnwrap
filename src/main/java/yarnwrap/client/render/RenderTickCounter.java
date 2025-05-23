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

public float getDynamicDeltaTicks() { return wrapperContained.getDynamicDeltaTicks(); }
// public static float getDynamicDeltaTicks() { return net.minecraft.client.render.RenderTickCounter.getDynamicDeltaTicks(); }
public float getTickProgress(boolean ignoreFreeze) { return wrapperContained.getTickProgress(ignoreFreeze); }
// public static float getTickProgress(boolean ignoreFreeze, ) { return net.minecraft.client.render.RenderTickCounter.getTickProgress(ignoreFreeze); }
public float getFixedDeltaTicks() { return wrapperContained.getFixedDeltaTicks(); }
// public static float getFixedDeltaTicks() { return net.minecraft.client.render.RenderTickCounter.getFixedDeltaTicks(); }

}