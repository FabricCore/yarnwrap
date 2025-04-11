package yarnwrap.client.gl;
public class PostEffectPass { public net.minecraft.client.gl.PostEffectPass wrapperContained; public PostEffectPass(net.minecraft.client.gl.PostEffectPass wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List samplerWidths() { return wrapperContained.samplerWidths; }
// public void samplerWidths(java.util.List value) { wrapperContained.samplerWidths = value; }
// public java.util.List samplerValues() { return wrapperContained.samplerValues; }
// public void samplerValues(java.util.List value) { wrapperContained.samplerValues = value; }
// public org.joml.Matrix4f projectionMatrix() { return wrapperContained.projectionMatrix; }
// public void projectionMatrix(org.joml.Matrix4f value) { wrapperContained.projectionMatrix = value; }
public yarnwrap.client.gl.Framebuffer input() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.input); }
// public void input(yarnwrap.client.gl.Framebuffer value) { wrapperContained.input = value.wrapperContained; }
// public java.util.List samplerHeights() { return wrapperContained.samplerHeights; }
// public void samplerHeights(java.util.List value) { wrapperContained.samplerHeights = value; }
public yarnwrap.client.gl.Framebuffer output() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.output); }
// public void output(yarnwrap.client.gl.Framebuffer value) { wrapperContained.output = value.wrapperContained; }
// public java.util.List samplerNames() { return wrapperContained.samplerNames; }
// public void samplerNames(java.util.List value) { wrapperContained.samplerNames = value; }
// public yarnwrap.client.gl.JsonEffectShaderProgram program() { return new yarnwrap.client.gl.JsonEffectShaderProgram(wrapperContained.program); }
// public void program(yarnwrap.client.gl.JsonEffectShaderProgram value) { wrapperContained.program = value.wrapperContained; }
// public int texFilter() { return wrapperContained.texFilter; }
// public void texFilter(int value) { wrapperContained.texFilter = value; }
// public PostEffectPass(yarnwrap.resource.ResourceFactory resourceFactory,java.lang.String programName,yarnwrap.client.gl.Framebuffer input,yarnwrap.client.gl.Framebuffer output,boolean linear) { this.wrapperContained = new net.minecraft.client.gl.PostEffectPass(resourceFactory.wrapperContained,programName,input.wrapperContained,output.wrapperContained,linear); }
public void setProjectionMatrix(org.joml.Matrix4f projectionMatrix) { wrapperContained.setProjectionMatrix(projectionMatrix); }
public void addAuxTarget(java.lang.String name,java.util.function.IntSupplier valueSupplier,int width,int height) { wrapperContained.addAuxTarget(name,valueSupplier,width,height); }
public void render(float time) { wrapperContained.render(time); }
public yarnwrap.client.gl.JsonEffectShaderProgram getProgram() { return new yarnwrap.client.gl.JsonEffectShaderProgram(wrapperContained.getProgram()); }
public java.lang.String getName() { return wrapperContained.getName(); }
public int getTexFilter() { return wrapperContained.getTexFilter(); }

}