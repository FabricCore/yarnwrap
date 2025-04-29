package yarnwrap.client.gl;
public class PostEffectPass { public net.minecraft.client.gl.PostEffectPass wrapperContained; public PostEffectPass(net.minecraft.client.gl.PostEffectPass wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List samplerWidths() { return wrapperContained.samplerWidths; }
// public void samplerWidths(java.util.List value) { wrapperContained.samplerWidths = value; }
// public static java.util.List samplerWidths() { return net.minecraft.client.gl.PostEffectPass.samplerWidths; }
// public static void samplerWidths(java.util.List value, ) { net.minecraft.client.gl.PostEffectPass.samplerWidths = value; }

// public java.util.List samplerValues() { return wrapperContained.samplerValues; }
// public void samplerValues(java.util.List value) { wrapperContained.samplerValues = value; }
// public static java.util.List samplerValues() { return net.minecraft.client.gl.PostEffectPass.samplerValues; }
// public static void samplerValues(java.util.List value, ) { net.minecraft.client.gl.PostEffectPass.samplerValues = value; }

// public org.joml.Matrix4f projectionMatrix() { return wrapperContained.projectionMatrix; }
// public void projectionMatrix(org.joml.Matrix4f value) { wrapperContained.projectionMatrix = value; }
// public static org.joml.Matrix4f projectionMatrix() { return net.minecraft.client.gl.PostEffectPass.projectionMatrix; }
// public static void projectionMatrix(org.joml.Matrix4f value, ) { net.minecraft.client.gl.PostEffectPass.projectionMatrix = value; }

public yarnwrap.client.gl.Framebuffer input() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.input); }
// public void input(yarnwrap.client.gl.Framebuffer value) { wrapperContained.input = value.wrapperContained; }
// public static yarnwrap.client.gl.Framebuffer input() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.gl.PostEffectPass.input); }
// public static void input(yarnwrap.client.gl.Framebuffer value, ) { net.minecraft.client.gl.PostEffectPass.input = value.wrapperContained; }

// public java.util.List samplerHeights() { return wrapperContained.samplerHeights; }
// public void samplerHeights(java.util.List value) { wrapperContained.samplerHeights = value; }
// public static java.util.List samplerHeights() { return net.minecraft.client.gl.PostEffectPass.samplerHeights; }
// public static void samplerHeights(java.util.List value, ) { net.minecraft.client.gl.PostEffectPass.samplerHeights = value; }

public yarnwrap.client.gl.Framebuffer output() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.output); }
// public void output(yarnwrap.client.gl.Framebuffer value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.client.gl.Framebuffer output() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.gl.PostEffectPass.output); }
// public static void output(yarnwrap.client.gl.Framebuffer value, ) { net.minecraft.client.gl.PostEffectPass.output = value.wrapperContained; }

// public java.util.List samplerNames() { return wrapperContained.samplerNames; }
// public void samplerNames(java.util.List value) { wrapperContained.samplerNames = value; }
// public static java.util.List samplerNames() { return net.minecraft.client.gl.PostEffectPass.samplerNames; }
// public static void samplerNames(java.util.List value, ) { net.minecraft.client.gl.PostEffectPass.samplerNames = value; }

// public yarnwrap.client.gl.JsonEffectShaderProgram program() { return new yarnwrap.client.gl.JsonEffectShaderProgram(wrapperContained.program); }
// public void program(yarnwrap.client.gl.JsonEffectShaderProgram value) { wrapperContained.program = value.wrapperContained; }
// public static yarnwrap.client.gl.JsonEffectShaderProgram program() { return new yarnwrap.client.gl.JsonEffectShaderProgram(net.minecraft.client.gl.PostEffectPass.program); }
// public static void program(yarnwrap.client.gl.JsonEffectShaderProgram value, ) { net.minecraft.client.gl.PostEffectPass.program = value.wrapperContained; }

// public int texFilter() { return wrapperContained.texFilter; }
// public void texFilter(int value) { wrapperContained.texFilter = value; }
// public static int texFilter() { return net.minecraft.client.gl.PostEffectPass.texFilter; }
// public static void texFilter(int value, ) { net.minecraft.client.gl.PostEffectPass.texFilter = value; }

// public PostEffectPass(yarnwrap.resource.ResourceFactory resourceFactory,java.lang.String programName,yarnwrap.client.gl.Framebuffer input,yarnwrap.client.gl.Framebuffer output,boolean linear) { this.wrapperContained = new net.minecraft.client.gl.PostEffectPass(resourceFactory.wrapperContained,programName,input.wrapperContained,output.wrapperContained,linear); }
public void setProjectionMatrix(org.joml.Matrix4f projectionMatrix) { wrapperContained.setProjectionMatrix(projectionMatrix); }
// public static void setProjectionMatrix(org.joml.Matrix4f projectionMatrix, ) { net.minecraft.client.gl.PostEffectPass.setProjectionMatrix(projectionMatrix); }
public void addAuxTarget(java.lang.String name,java.util.function.IntSupplier valueSupplier,int width,int height) { wrapperContained.addAuxTarget(name,valueSupplier,width,height); }
// public static void addAuxTarget(java.lang.String name,java.util.function.IntSupplier valueSupplier,int width,int height, ) { net.minecraft.client.gl.PostEffectPass.addAuxTarget(name,valueSupplier,width,height); }
public void render(float time) { wrapperContained.render(time); }
// public static void render(float time, ) { net.minecraft.client.gl.PostEffectPass.render(time); }
public yarnwrap.client.gl.JsonEffectShaderProgram getProgram() { return new yarnwrap.client.gl.JsonEffectShaderProgram(wrapperContained.getProgram()); }
// public static yarnwrap.client.gl.JsonEffectShaderProgram getProgram() { return new yarnwrap.client.gl.JsonEffectShaderProgram(net.minecraft.client.gl.PostEffectPass.getProgram()); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.client.gl.PostEffectPass.getName(); }
public int getTexFilter() { return wrapperContained.getTexFilter(); }
// public static int getTexFilter() { return net.minecraft.client.gl.PostEffectPass.getTexFilter(); }

}