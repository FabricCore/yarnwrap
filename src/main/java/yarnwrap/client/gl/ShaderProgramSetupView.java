package yarnwrap.client.gl;
public class ShaderProgramSetupView { public net.minecraft.client.gl.ShaderProgramSetupView wrapperContained; public ShaderProgramSetupView(net.minecraft.client.gl.ShaderProgramSetupView wrapperContained) { this.wrapperContained = wrapperContained; }

public int getGlRef() { return wrapperContained.getGlRef(); }
// public static int getGlRef() { return net.minecraft.client.gl.ShaderProgramSetupView.getGlRef(); }
public yarnwrap.client.gl.ShaderStage getVertexShader() { return new yarnwrap.client.gl.ShaderStage(wrapperContained.getVertexShader()); }
// public static yarnwrap.client.gl.ShaderStage getVertexShader() { return new yarnwrap.client.gl.ShaderStage(net.minecraft.client.gl.ShaderProgramSetupView.getVertexShader()); }
public yarnwrap.client.gl.ShaderStage getFragmentShader() { return new yarnwrap.client.gl.ShaderStage(wrapperContained.getFragmentShader()); }
// public static yarnwrap.client.gl.ShaderStage getFragmentShader() { return new yarnwrap.client.gl.ShaderStage(net.minecraft.client.gl.ShaderProgramSetupView.getFragmentShader()); }
public void markUniformsDirty() { wrapperContained.markUniformsDirty(); }
// public static void markUniformsDirty() { net.minecraft.client.gl.ShaderProgramSetupView.markUniformsDirty(); }
public void attachReferencedShaders() { wrapperContained.attachReferencedShaders(); }
// public static void attachReferencedShaders() { net.minecraft.client.gl.ShaderProgramSetupView.attachReferencedShaders(); }

}