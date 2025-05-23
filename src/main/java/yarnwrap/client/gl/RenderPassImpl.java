package yarnwrap.client.gl;
public class RenderPassImpl { public net.minecraft.client.gl.RenderPassImpl wrapperContained; public RenderPassImpl(net.minecraft.client.gl.RenderPassImpl wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean IS_DEVELOPMENT() { return wrapperContained.IS_DEVELOPMENT; }
// public void IS_DEVELOPMENT(boolean value) { wrapperContained.IS_DEVELOPMENT = value; }
public static boolean IS_DEVELOPMENT() { return net.minecraft.client.gl.RenderPassImpl.IS_DEVELOPMENT; }
// public static void IS_DEVELOPMENT(boolean value, ) { net.minecraft.client.gl.RenderPassImpl.IS_DEVELOPMENT = value; }

// public yarnwrap.client.gl.CompiledShaderPipeline pipeline() { return new yarnwrap.client.gl.CompiledShaderPipeline(wrapperContained.pipeline); }
// public void pipeline(yarnwrap.client.gl.CompiledShaderPipeline value) { wrapperContained.pipeline = value.wrapperContained; }
// public static yarnwrap.client.gl.CompiledShaderPipeline pipeline() { return new yarnwrap.client.gl.CompiledShaderPipeline(net.minecraft.client.gl.RenderPassImpl.pipeline); }
// public static void pipeline(yarnwrap.client.gl.CompiledShaderPipeline value, ) { net.minecraft.client.gl.RenderPassImpl.pipeline = value.wrapperContained; }

// public com.mojang.blaze3d.buffers.GpuBuffer[] vertexBuffers() { return wrapperContained.vertexBuffers; }
// public void vertexBuffers(com.mojang.blaze3d.buffers.GpuBuffer[] value) { wrapperContained.vertexBuffers = value; }
// public static com.mojang.blaze3d.buffers.GpuBuffer[] vertexBuffers() { return net.minecraft.client.gl.RenderPassImpl.vertexBuffers; }
// public static void vertexBuffers(com.mojang.blaze3d.buffers.GpuBuffer[] value, ) { net.minecraft.client.gl.RenderPassImpl.vertexBuffers = value; }

// public com.mojang.blaze3d.buffers.GpuBuffer indexBuffer() { return wrapperContained.indexBuffer; }
// public void indexBuffer(com.mojang.blaze3d.buffers.GpuBuffer value) { wrapperContained.indexBuffer = value; }
// public static com.mojang.blaze3d.buffers.GpuBuffer indexBuffer() { return net.minecraft.client.gl.RenderPassImpl.indexBuffer; }
// public static void indexBuffer(com.mojang.blaze3d.buffers.GpuBuffer value, ) { net.minecraft.client.gl.RenderPassImpl.indexBuffer = value; }

// public Object indexType() { return wrapperContained.indexType; }
// // public void indexType(Object value) { wrapperContained.indexType = value; }
// // public static Object indexType() { return net.minecraft.client.gl.RenderPassImpl.indexType; }
// // public static void indexType(Object value, ) { net.minecraft.client.gl.RenderPassImpl.indexType = value; }

// public Object scissorState() { return wrapperContained.scissorState; }
// // public void scissorState(Object value) { wrapperContained.scissorState = value; }
// // public static Object scissorState() { return net.minecraft.client.gl.RenderPassImpl.scissorState; }
// // public static void scissorState(Object value, ) { net.minecraft.client.gl.RenderPassImpl.scissorState = value; }

// public java.util.HashMap simpleUniforms() { return wrapperContained.simpleUniforms; }
// public void simpleUniforms(java.util.HashMap value) { wrapperContained.simpleUniforms = value; }
// public static java.util.HashMap simpleUniforms() { return net.minecraft.client.gl.RenderPassImpl.simpleUniforms; }
// public static void simpleUniforms(java.util.HashMap value, ) { net.minecraft.client.gl.RenderPassImpl.simpleUniforms = value; }

// public java.util.HashMap samplerUniforms() { return wrapperContained.samplerUniforms; }
// public void samplerUniforms(java.util.HashMap value) { wrapperContained.samplerUniforms = value; }
// public static java.util.HashMap samplerUniforms() { return net.minecraft.client.gl.RenderPassImpl.samplerUniforms; }
// public static void samplerUniforms(java.util.HashMap value, ) { net.minecraft.client.gl.RenderPassImpl.samplerUniforms = value; }

// public java.util.Set setSimpleUniforms() { return wrapperContained.setSimpleUniforms; }
// public void setSimpleUniforms(java.util.Set value) { wrapperContained.setSimpleUniforms = value; }
// public static java.util.Set setSimpleUniforms() { return net.minecraft.client.gl.RenderPassImpl.setSimpleUniforms; }
// public static void setSimpleUniforms(java.util.Set value, ) { net.minecraft.client.gl.RenderPassImpl.setSimpleUniforms = value; }

// public yarnwrap.client.gl.GlCommandEncoder resourceManager() { return new yarnwrap.client.gl.GlCommandEncoder(wrapperContained.resourceManager); }
// public void resourceManager(yarnwrap.client.gl.GlCommandEncoder value) { wrapperContained.resourceManager = value.wrapperContained; }
// public static yarnwrap.client.gl.GlCommandEncoder resourceManager() { return new yarnwrap.client.gl.GlCommandEncoder(net.minecraft.client.gl.RenderPassImpl.resourceManager); }
// public static void resourceManager(yarnwrap.client.gl.GlCommandEncoder value, ) { net.minecraft.client.gl.RenderPassImpl.resourceManager = value.wrapperContained; }

// public boolean hasDepth() { return wrapperContained.hasDepth; }
// public void hasDepth(boolean value) { wrapperContained.hasDepth = value; }
// public static boolean hasDepth() { return net.minecraft.client.gl.RenderPassImpl.hasDepth; }
// public static void hasDepth(boolean value, ) { net.minecraft.client.gl.RenderPassImpl.hasDepth = value; }

// public boolean closed() { return wrapperContained.closed; }
// public void closed(boolean value) { wrapperContained.closed = value; }
// public static boolean closed() { return net.minecraft.client.gl.RenderPassImpl.closed; }
// public static void closed(boolean value, ) { net.minecraft.client.gl.RenderPassImpl.closed = value; }

// public int debugGroupPushCount() { return wrapperContained.debugGroupPushCount; }
// public void debugGroupPushCount(int value) { wrapperContained.debugGroupPushCount = value; }
// public static int debugGroupPushCount() { return net.minecraft.client.gl.RenderPassImpl.debugGroupPushCount; }
// public static void debugGroupPushCount(int value, ) { net.minecraft.client.gl.RenderPassImpl.debugGroupPushCount = value; }

// public RenderPassImpl(yarnwrap.client.gl.GlCommandEncoder resourceManager,boolean hasDepth) { this.wrapperContained = new net.minecraft.client.gl.RenderPassImpl(resourceManager.wrapperContained,hasDepth); }
// public boolean hasDepth() { return wrapperContained.hasDepth(); }
// // public static boolean hasDepth() { return net.minecraft.client.gl.RenderPassImpl.hasDepth(); }
// public boolean isScissorEnabled() { return wrapperContained.isScissorEnabled(); }
// public static boolean isScissorEnabled() { return net.minecraft.client.gl.RenderPassImpl.isScissorEnabled(); }
// public int getScissorX() { return wrapperContained.getScissorX(); }
// public static int getScissorX() { return net.minecraft.client.gl.RenderPassImpl.getScissorX(); }
// public int getScissorY() { return wrapperContained.getScissorY(); }
// public static int getScissorY() { return net.minecraft.client.gl.RenderPassImpl.getScissorY(); }
// public int getScissorWidth() { return wrapperContained.getScissorWidth(); }
// public static int getScissorWidth() { return net.minecraft.client.gl.RenderPassImpl.getScissorWidth(); }
// public int getScissorHeight() { return wrapperContained.getScissorHeight(); }
// public static int getScissorHeight() { return net.minecraft.client.gl.RenderPassImpl.getScissorHeight(); }

}