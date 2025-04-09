package yarnwrap.client.gl;
public class ShaderProgramSetupView { public net.minecraft.client.gl.ShaderProgramSetupView wrapperContained; public ShaderProgramSetupView(net.minecraft.client.gl.ShaderProgramSetupView wrapperContained) { this.wrapperContained = wrapperContained; }

public int getGlRef() { return wrapperContained.getGlRef(); }
public yarnwrap.client.gl.ShaderStage getVertexShader() { return new yarnwrap.client.gl.ShaderStage(wrapperContained.getVertexShader()); }
public yarnwrap.client.gl.ShaderStage getFragmentShader() { return new yarnwrap.client.gl.ShaderStage(wrapperContained.getFragmentShader()); }
public void markUniformsDirty() { wrapperContained.markUniformsDirty(); }
public void attachReferencedShaders() { wrapperContained.attachReferencedShaders(); }

}