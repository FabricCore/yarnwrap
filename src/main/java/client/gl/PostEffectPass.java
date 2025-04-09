package yarnwrap.client.gl;
public class PostEffectPass { public net.minecraft.client.gl.PostEffectPass wrapperContained; public PostEffectPass(net.minecraft.client.gl.PostEffectPass wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List samplerWidths() { return wrapperContained.samplerWidths; }
// public java.util.List samplerValues() { return wrapperContained.samplerValues; }
// public org.joml.Matrix4f projectionMatrix() { return wrapperContained.projectionMatrix; }
public yarnwrap.client.gl.Framebuffer input() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.input); }
// public java.util.List samplerHeights() { return wrapperContained.samplerHeights; }
public yarnwrap.client.gl.Framebuffer output() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.output); }
// public java.util.List samplerNames() { return wrapperContained.samplerNames; }
// public yarnwrap.client.gl.JsonEffectShaderProgram program() { return new yarnwrap.client.gl.JsonEffectShaderProgram(wrapperContained.program); }
// public int texFilter() { return wrapperContained.texFilter; }
public void setProjectionMatrix(org.joml.Matrix4f projectionMatrix) { wrapperContained.setProjectionMatrix(projectionMatrix); }
public void addAuxTarget(java.lang.String name,java.util.function.IntSupplier valueSupplier,int width,int height) { wrapperContained.addAuxTarget(name,valueSupplier,width,height); }
public void render(float time) { wrapperContained.render(time); }
public yarnwrap.client.gl.JsonEffectShaderProgram getProgram() { return new yarnwrap.client.gl.JsonEffectShaderProgram(wrapperContained.getProgram()); }
public java.lang.String getName() { return wrapperContained.getName(); }
public int getTexFilter() { return wrapperContained.getTexFilter(); }

}