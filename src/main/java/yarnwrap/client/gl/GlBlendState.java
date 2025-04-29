package yarnwrap.client.gl;
public class GlBlendState { public net.minecraft.client.gl.GlBlendState wrapperContained; public GlBlendState(net.minecraft.client.gl.GlBlendState wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gl.GlBlendState activeBlendState() { return new yarnwrap.client.gl.GlBlendState(wrapperContained.activeBlendState); }
// public void activeBlendState(yarnwrap.client.gl.GlBlendState value) { wrapperContained.activeBlendState = value.wrapperContained; }
// public static yarnwrap.client.gl.GlBlendState activeBlendState() { return new yarnwrap.client.gl.GlBlendState(net.minecraft.client.gl.GlBlendState.activeBlendState); }
// public static void activeBlendState(yarnwrap.client.gl.GlBlendState value, ) { net.minecraft.client.gl.GlBlendState.activeBlendState = value.wrapperContained; }

// public boolean blendDisabled() { return wrapperContained.blendDisabled; }
// public void blendDisabled(boolean value) { wrapperContained.blendDisabled = value; }
// public static boolean blendDisabled() { return net.minecraft.client.gl.GlBlendState.blendDisabled; }
// public static void blendDisabled(boolean value, ) { net.minecraft.client.gl.GlBlendState.blendDisabled = value; }

// public int mode() { return wrapperContained.mode; }
// public void mode(int value) { wrapperContained.mode = value; }
// public static int mode() { return net.minecraft.client.gl.GlBlendState.mode; }
// public static void mode(int value, ) { net.minecraft.client.gl.GlBlendState.mode = value; }

// public boolean separateBlend() { return wrapperContained.separateBlend; }
// public void separateBlend(boolean value) { wrapperContained.separateBlend = value; }
// public static boolean separateBlend() { return net.minecraft.client.gl.GlBlendState.separateBlend; }
// public static void separateBlend(boolean value, ) { net.minecraft.client.gl.GlBlendState.separateBlend = value; }

// public int dstAlpha() { return wrapperContained.dstAlpha; }
// public void dstAlpha(int value) { wrapperContained.dstAlpha = value; }
// public static int dstAlpha() { return net.minecraft.client.gl.GlBlendState.dstAlpha; }
// public static void dstAlpha(int value, ) { net.minecraft.client.gl.GlBlendState.dstAlpha = value; }

// public int dstRgb() { return wrapperContained.dstRgb; }
// public void dstRgb(int value) { wrapperContained.dstRgb = value; }
// public static int dstRgb() { return net.minecraft.client.gl.GlBlendState.dstRgb; }
// public static void dstRgb(int value, ) { net.minecraft.client.gl.GlBlendState.dstRgb = value; }

// public int srcAlpha() { return wrapperContained.srcAlpha; }
// public void srcAlpha(int value) { wrapperContained.srcAlpha = value; }
// public static int srcAlpha() { return net.minecraft.client.gl.GlBlendState.srcAlpha; }
// public static void srcAlpha(int value, ) { net.minecraft.client.gl.GlBlendState.srcAlpha = value; }

// public int srcRgb() { return wrapperContained.srcRgb; }
// public void srcRgb(int value) { wrapperContained.srcRgb = value; }
// public static int srcRgb() { return net.minecraft.client.gl.GlBlendState.srcRgb; }
// public static void srcRgb(int value, ) { net.minecraft.client.gl.GlBlendState.srcRgb = value; }

public GlBlendState(int srcRgb,int dstRgb,int func) { this.wrapperContained = new net.minecraft.client.gl.GlBlendState(srcRgb,dstRgb,func); }
public GlBlendState(int srcRgb,int dstRgb,int srcAlpha,int dstAlpha,int func) { this.wrapperContained = new net.minecraft.client.gl.GlBlendState(srcRgb,dstRgb,srcAlpha,dstAlpha,func); }
// public GlBlendState(boolean separateBlend,boolean blendDisabled,int srcRgb,int dstRgb,int srcAlpha,int dstAlpha,int mode) { this.wrapperContained = new net.minecraft.client.gl.GlBlendState(separateBlend,blendDisabled,srcRgb,dstRgb,srcAlpha,dstAlpha,mode); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.gl.GlBlendState.equals(o); }
// public int getFactorFromString(java.lang.String expression) { return wrapperContained.getFactorFromString(expression); }
// public static int getFactorFromString(java.lang.String expression, ) { return net.minecraft.client.gl.GlBlendState.getFactorFromString(expression); }
public void enable() { wrapperContained.enable(); }
// public static void enable() { net.minecraft.client.gl.GlBlendState.enable(); }
public boolean isBlendDisabled() { return wrapperContained.isBlendDisabled(); }
// public static boolean isBlendDisabled() { return net.minecraft.client.gl.GlBlendState.isBlendDisabled(); }
// public int getModeFromString(java.lang.String name) { return wrapperContained.getModeFromString(name); }
// public static int getModeFromString(java.lang.String name, ) { return net.minecraft.client.gl.GlBlendState.getModeFromString(name); }

}