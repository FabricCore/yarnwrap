package yarnwrap.client.gl;
public class DebugLabelManager { public net.minecraft.client.gl.DebugLabelManager wrapperContained; public DebugLabelManager(net.minecraft.client.gl.DebugLabelManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.gl.DebugLabelManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.gl.DebugLabelManager.LOGGER = value; }

public boolean isUsable() { return wrapperContained.isUsable(); }
// public static boolean isUsable() { return net.minecraft.client.gl.DebugLabelManager.isUsable(); }
public void labelGlGpuBuffer(yarnwrap.client.gl.GlGpuBuffer buffer) { wrapperContained.labelGlGpuBuffer(buffer.wrapperContained); }
// public static void labelGlGpuBuffer(yarnwrap.client.gl.GlGpuBuffer buffer, ) { net.minecraft.client.gl.DebugLabelManager.labelGlGpuBuffer(buffer.wrapperContained); }
public void labelShaderProgram(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.labelShaderProgram(program.wrapperContained); }
// public static void labelShaderProgram(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.gl.DebugLabelManager.labelShaderProgram(program.wrapperContained); }
public void labelCompiledShader(yarnwrap.client.gl.CompiledShader shader) { wrapperContained.labelCompiledShader(shader.wrapperContained); }
// public static void labelCompiledShader(yarnwrap.client.gl.CompiledShader shader, ) { net.minecraft.client.gl.DebugLabelManager.labelCompiledShader(shader.wrapperContained); }
public void labelGlTexture(yarnwrap.client.texture.GlTexture texture) { wrapperContained.labelGlTexture(texture.wrapperContained); }
// public static void labelGlTexture(yarnwrap.client.texture.GlTexture texture, ) { net.minecraft.client.gl.DebugLabelManager.labelGlTexture(texture.wrapperContained); }
// public void labelAllocatedBuffer(Object buffer) { wrapperContained.labelAllocatedBuffer(buffer); }
// public static void labelAllocatedBuffer(Object buffer, ) { net.minecraft.client.gl.DebugLabelManager.labelAllocatedBuffer(buffer); }
// public yarnwrap.client.gl.DebugLabelManager create(org.lwjgl.opengl.GLCapabilities capabilities,boolean debugEnabled,java.util.Set usedCapabilities) { return new yarnwrap.client.gl.DebugLabelManager(wrapperContained.create(capabilities,debugEnabled,usedCapabilities)); }
// public static yarnwrap.client.gl.DebugLabelManager create(org.lwjgl.opengl.GLCapabilities capabilities,boolean debugEnabled,java.util.Set usedCapabilities, ) { return new yarnwrap.client.gl.DebugLabelManager(net.minecraft.client.gl.DebugLabelManager.create(capabilities,debugEnabled,usedCapabilities)); }
// public void popDebugGroup() { wrapperContained.popDebugGroup(); }
// public static void popDebugGroup() { net.minecraft.client.gl.DebugLabelManager.popDebugGroup(); }
// public void pushDebugGroup(java.util.function.Supplier labelGetter) { wrapperContained.pushDebugGroup(labelGetter); }
// public static void pushDebugGroup(java.util.function.Supplier labelGetter, ) { net.minecraft.client.gl.DebugLabelManager.pushDebugGroup(labelGetter); }

}