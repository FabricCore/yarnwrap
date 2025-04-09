package yarnwrap.client.gl;
public class GlBlendState { public net.minecraft.client.gl.GlBlendState wrapperContained; public GlBlendState(net.minecraft.client.gl.GlBlendState wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gl.GlBlendState activeBlendState() { return new yarnwrap.client.gl.GlBlendState(wrapperContained.activeBlendState); }
// public boolean blendDisabled() { return wrapperContained.blendDisabled; }
// public int mode() { return wrapperContained.mode; }
// public boolean separateBlend() { return wrapperContained.separateBlend; }
// public int dstAlpha() { return wrapperContained.dstAlpha; }
// public int dstRgb() { return wrapperContained.dstRgb; }
// public int srcAlpha() { return wrapperContained.srcAlpha; }
// public int srcRgb() { return wrapperContained.srcRgb; }
public int getFactorFromString(java.lang.String expression) { return wrapperContained.getFactorFromString(expression); }
public void enable() { wrapperContained.enable(); }
public boolean isBlendDisabled() { return wrapperContained.isBlendDisabled(); }
public int getModeFromString(java.lang.String name) { return wrapperContained.getModeFromString(name); }

}