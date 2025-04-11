package yarnwrap.client.gl;
public class GlBlendState { public net.minecraft.client.gl.GlBlendState wrapperContained; public GlBlendState(net.minecraft.client.gl.GlBlendState wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gl.GlBlendState activeBlendState() { return new yarnwrap.client.gl.GlBlendState(wrapperContained.activeBlendState); }
// public void activeBlendState(yarnwrap.client.gl.GlBlendState value) { wrapperContained.activeBlendState = value.wrapperContained; }
// public boolean blendDisabled() { return wrapperContained.blendDisabled; }
// public void blendDisabled(boolean value) { wrapperContained.blendDisabled = value; }
// public int mode() { return wrapperContained.mode; }
// public void mode(int value) { wrapperContained.mode = value; }
// public boolean separateBlend() { return wrapperContained.separateBlend; }
// public void separateBlend(boolean value) { wrapperContained.separateBlend = value; }
// public int dstAlpha() { return wrapperContained.dstAlpha; }
// public void dstAlpha(int value) { wrapperContained.dstAlpha = value; }
// public int dstRgb() { return wrapperContained.dstRgb; }
// public void dstRgb(int value) { wrapperContained.dstRgb = value; }
// public int srcAlpha() { return wrapperContained.srcAlpha; }
// public void srcAlpha(int value) { wrapperContained.srcAlpha = value; }
// public int srcRgb() { return wrapperContained.srcRgb; }
// public void srcRgb(int value) { wrapperContained.srcRgb = value; }
public GlBlendState(int srcRgb,int dstRgb,int func) { this.wrapperContained = new net.minecraft.client.gl.GlBlendState(srcRgb,dstRgb,func); }
public GlBlendState(int srcRgb,int dstRgb,int srcAlpha,int dstAlpha,int func) { this.wrapperContained = new net.minecraft.client.gl.GlBlendState(srcRgb,dstRgb,srcAlpha,dstAlpha,func); }
// public GlBlendState(boolean separateBlend,boolean blendDisabled,int srcRgb,int dstRgb,int srcAlpha,int dstAlpha,int mode) { this.wrapperContained = new net.minecraft.client.gl.GlBlendState(separateBlend,blendDisabled,srcRgb,dstRgb,srcAlpha,dstAlpha,mode); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public int getFactorFromString(java.lang.String expression) { return wrapperContained.getFactorFromString(expression); }
public void enable() { wrapperContained.enable(); }
public boolean isBlendDisabled() { return wrapperContained.isBlendDisabled(); }
public int getModeFromString(java.lang.String name) { return wrapperContained.getModeFromString(name); }

}