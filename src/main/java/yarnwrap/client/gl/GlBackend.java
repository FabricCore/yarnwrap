package yarnwrap.client.gl;
public class GlBackend { public net.minecraft.client.gl.GlBackend wrapperContained; public GlBackend(net.minecraft.client.gl.GlBackend wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.gl.GlBackend.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.gl.GlBackend.LOGGER = value; }

// public com.mojang.blaze3d.systems.CommandEncoder commandEncoder() { return wrapperContained.commandEncoder; }
// public void commandEncoder(com.mojang.blaze3d.systems.CommandEncoder value) { wrapperContained.commandEncoder = value; }
// public static com.mojang.blaze3d.systems.CommandEncoder commandEncoder() { return net.minecraft.client.gl.GlBackend.commandEncoder; }
// public static void commandEncoder(com.mojang.blaze3d.systems.CommandEncoder value, ) { net.minecraft.client.gl.GlBackend.commandEncoder = value; }

// public yarnwrap.client.gl.GlDebug glDebug() { return new yarnwrap.client.gl.GlDebug(wrapperContained.glDebug); }
// public void glDebug(yarnwrap.client.gl.GlDebug value) { wrapperContained.glDebug = value.wrapperContained; }
// public static yarnwrap.client.gl.GlDebug glDebug() { return new yarnwrap.client.gl.GlDebug(net.minecraft.client.gl.GlBackend.glDebug); }
// public static void glDebug(yarnwrap.client.gl.GlDebug value, ) { net.minecraft.client.gl.GlBackend.glDebug = value.wrapperContained; }

// public yarnwrap.client.gl.DebugLabelManager debugLabelManager() { return new yarnwrap.client.gl.DebugLabelManager(wrapperContained.debugLabelManager); }
// public void debugLabelManager(yarnwrap.client.gl.DebugLabelManager value) { wrapperContained.debugLabelManager = value.wrapperContained; }
// public static yarnwrap.client.gl.DebugLabelManager debugLabelManager() { return new yarnwrap.client.gl.DebugLabelManager(net.minecraft.client.gl.GlBackend.debugLabelManager); }
// public static void debugLabelManager(yarnwrap.client.gl.DebugLabelManager value, ) { net.minecraft.client.gl.GlBackend.debugLabelManager = value.wrapperContained; }

// public int maxTextureSize() { return wrapperContained.maxTextureSize; }
// public void maxTextureSize(int value) { wrapperContained.maxTextureSize = value; }
// public static int maxTextureSize() { return net.minecraft.client.gl.GlBackend.maxTextureSize; }
// public static void maxTextureSize(int value, ) { net.minecraft.client.gl.GlBackend.maxTextureSize = value; }

// public yarnwrap.client.gl.BufferManager bufferManager() { return new yarnwrap.client.gl.BufferManager(wrapperContained.bufferManager); }
// public void bufferManager(yarnwrap.client.gl.BufferManager value) { wrapperContained.bufferManager = value.wrapperContained; }
// public static yarnwrap.client.gl.BufferManager bufferManager() { return new yarnwrap.client.gl.BufferManager(net.minecraft.client.gl.GlBackend.bufferManager); }
// public static void bufferManager(yarnwrap.client.gl.BufferManager value, ) { net.minecraft.client.gl.GlBackend.bufferManager = value.wrapperContained; }

// public java.util.function.BiFunction defaultShaderSourceGetter() { return wrapperContained.defaultShaderSourceGetter; }
// public void defaultShaderSourceGetter(java.util.function.BiFunction value) { wrapperContained.defaultShaderSourceGetter = value; }
// public static java.util.function.BiFunction defaultShaderSourceGetter() { return net.minecraft.client.gl.GlBackend.defaultShaderSourceGetter; }
// public static void defaultShaderSourceGetter(java.util.function.BiFunction value, ) { net.minecraft.client.gl.GlBackend.defaultShaderSourceGetter = value; }

// public java.util.Map pipelineCompileCache() { return wrapperContained.pipelineCompileCache; }
// public void pipelineCompileCache(java.util.Map value) { wrapperContained.pipelineCompileCache = value; }
// public static java.util.Map pipelineCompileCache() { return net.minecraft.client.gl.GlBackend.pipelineCompileCache; }
// public static void pipelineCompileCache(java.util.Map value, ) { net.minecraft.client.gl.GlBackend.pipelineCompileCache = value; }

// public java.util.Map shaderCompileCache() { return wrapperContained.shaderCompileCache; }
// public void shaderCompileCache(java.util.Map value) { wrapperContained.shaderCompileCache = value; }
// public static java.util.Map shaderCompileCache() { return net.minecraft.client.gl.GlBackend.shaderCompileCache; }
// public static void shaderCompileCache(java.util.Map value, ) { net.minecraft.client.gl.GlBackend.shaderCompileCache = value; }

// public yarnwrap.client.gl.VertexBufferManager vertexBufferManager() { return new yarnwrap.client.gl.VertexBufferManager(wrapperContained.vertexBufferManager); }
// public void vertexBufferManager(yarnwrap.client.gl.VertexBufferManager value) { wrapperContained.vertexBufferManager = value.wrapperContained; }
// public static yarnwrap.client.gl.VertexBufferManager vertexBufferManager() { return new yarnwrap.client.gl.VertexBufferManager(net.minecraft.client.gl.GlBackend.vertexBufferManager); }
// public static void vertexBufferManager(yarnwrap.client.gl.VertexBufferManager value, ) { net.minecraft.client.gl.GlBackend.vertexBufferManager = value.wrapperContained; }

// public boolean allowGlArbVABinding() { return wrapperContained.allowGlArbVABinding; }
// public void allowGlArbVABinding(boolean value) { wrapperContained.allowGlArbVABinding = value; }
// public static boolean allowGlArbVABinding() { return net.minecraft.client.gl.GlBackend.allowGlArbVABinding; }
// public static void allowGlArbVABinding(boolean value, ) { net.minecraft.client.gl.GlBackend.allowGlArbVABinding = value; }

// public boolean allowGlKhrDebug() { return wrapperContained.allowGlKhrDebug; }
// public void allowGlKhrDebug(boolean value) { wrapperContained.allowGlKhrDebug = value; }
// public static boolean allowGlKhrDebug() { return net.minecraft.client.gl.GlBackend.allowGlKhrDebug; }
// public static void allowGlKhrDebug(boolean value, ) { net.minecraft.client.gl.GlBackend.allowGlKhrDebug = value; }

// public boolean allowExtDebugLabel() { return wrapperContained.allowExtDebugLabel; }
// public void allowExtDebugLabel(boolean value) { wrapperContained.allowExtDebugLabel = value; }
// public static boolean allowExtDebugLabel() { return net.minecraft.client.gl.GlBackend.allowExtDebugLabel; }
// public static void allowExtDebugLabel(boolean value, ) { net.minecraft.client.gl.GlBackend.allowExtDebugLabel = value; }

// public boolean allowGlArbDebugOutput() { return wrapperContained.allowGlArbDebugOutput; }
// public void allowGlArbDebugOutput(boolean value) { wrapperContained.allowGlArbDebugOutput = value; }
// public static boolean allowGlArbDebugOutput() { return net.minecraft.client.gl.GlBackend.allowGlArbDebugOutput; }
// public static void allowGlArbDebugOutput(boolean value, ) { net.minecraft.client.gl.GlBackend.allowGlArbDebugOutput = value; }

// public boolean allowGlArbDirectAccess() { return wrapperContained.allowGlArbDirectAccess; }
// public void allowGlArbDirectAccess(boolean value) { wrapperContained.allowGlArbDirectAccess = value; }
// public static boolean allowGlArbDirectAccess() { return net.minecraft.client.gl.GlBackend.allowGlArbDirectAccess; }
// public static void allowGlArbDirectAccess(boolean value, ) { net.minecraft.client.gl.GlBackend.allowGlArbDirectAccess = value; }

// public java.util.Set usedGlCapabilities() { return wrapperContained.usedGlCapabilities; }
// public void usedGlCapabilities(java.util.Set value) { wrapperContained.usedGlCapabilities = value; }
// public static java.util.Set usedGlCapabilities() { return net.minecraft.client.gl.GlBackend.usedGlCapabilities; }
// public static void usedGlCapabilities(java.util.Set value, ) { net.minecraft.client.gl.GlBackend.usedGlCapabilities = value; }

// public boolean allowGlBufferStorage() { return wrapperContained.allowGlBufferStorage; }
// public void allowGlBufferStorage(boolean value) { wrapperContained.allowGlBufferStorage = value; }
// public static boolean allowGlBufferStorage() { return net.minecraft.client.gl.GlBackend.allowGlBufferStorage; }
// public static void allowGlBufferStorage(boolean value, ) { net.minecraft.client.gl.GlBackend.allowGlBufferStorage = value; }

// public yarnwrap.client.gl.GpuBufferManager gpuBufferManager() { return new yarnwrap.client.gl.GpuBufferManager(wrapperContained.gpuBufferManager); }
// public void gpuBufferManager(yarnwrap.client.gl.GpuBufferManager value) { wrapperContained.gpuBufferManager = value.wrapperContained; }
// public static yarnwrap.client.gl.GpuBufferManager gpuBufferManager() { return new yarnwrap.client.gl.GpuBufferManager(net.minecraft.client.gl.GlBackend.gpuBufferManager); }
// public static void gpuBufferManager(yarnwrap.client.gl.GpuBufferManager value, ) { net.minecraft.client.gl.GlBackend.gpuBufferManager = value.wrapperContained; }

// public int uniformOffsetAlignment() { return wrapperContained.uniformOffsetAlignment; }
// public void uniformOffsetAlignment(int value) { wrapperContained.uniformOffsetAlignment = value; }
// public static int uniformOffsetAlignment() { return net.minecraft.client.gl.GlBackend.uniformOffsetAlignment; }
// public static void uniformOffsetAlignment(int value, ) { net.minecraft.client.gl.GlBackend.uniformOffsetAlignment = value; }

public GlBackend(long contextId,int debugVerbosity,boolean sync,java.util.function.BiFunction shaderSourceGetter,boolean renderDebugLabels) { this.wrapperContained = new net.minecraft.client.gl.GlBackend(contextId,debugVerbosity,sync,shaderSourceGetter,renderDebugLabels); }
public yarnwrap.client.gl.DebugLabelManager getDebugLabelManager() { return new yarnwrap.client.gl.DebugLabelManager(wrapperContained.getDebugLabelManager()); }
// public static yarnwrap.client.gl.DebugLabelManager getDebugLabelManager() { return new yarnwrap.client.gl.DebugLabelManager(net.minecraft.client.gl.GlBackend.getDebugLabelManager()); }
// public yarnwrap.client.gl.CompiledShader compileShader(yarnwrap.util.Identifier id,com.mojang.blaze3d.shaders.ShaderType type,yarnwrap.client.gl.Defines defines,java.util.function.BiFunction sourceRetriever) { return new yarnwrap.client.gl.CompiledShader(wrapperContained.compileShader(id.wrapperContained,type,defines.wrapperContained,sourceRetriever)); }
// public static yarnwrap.client.gl.CompiledShader compileShader(yarnwrap.util.Identifier id,com.mojang.blaze3d.shaders.ShaderType type,yarnwrap.client.gl.Defines defines,java.util.function.BiFunction sourceRetriever, ) { return new yarnwrap.client.gl.CompiledShader(net.minecraft.client.gl.GlBackend.compileShader(id.wrapperContained,type,defines.wrapperContained,sourceRetriever)); }
// public yarnwrap.client.gl.CompiledShader compileShader(Object key,java.util.function.BiFunction sourceRetriever) { return new yarnwrap.client.gl.CompiledShader(wrapperContained.compileShader(key,sourceRetriever)); }
// public static yarnwrap.client.gl.CompiledShader compileShader(Object key,java.util.function.BiFunction sourceRetriever, ) { return new yarnwrap.client.gl.CompiledShader(net.minecraft.client.gl.GlBackend.compileShader(key,sourceRetriever)); }
// public yarnwrap.client.gl.CompiledShader method_68380(Object key) { return new yarnwrap.client.gl.CompiledShader(wrapperContained.method_68380(key)); }
// public static yarnwrap.client.gl.CompiledShader method_68380(Object key, ) { return new yarnwrap.client.gl.CompiledShader(net.minecraft.client.gl.GlBackend.method_68380(key)); }
// public yarnwrap.client.gl.CompiledShaderPipeline compilePipelineCached(com.mojang.blaze3d.pipeline.RenderPipeline pipeline) { return new yarnwrap.client.gl.CompiledShaderPipeline(wrapperContained.compilePipelineCached(pipeline)); }
// public static yarnwrap.client.gl.CompiledShaderPipeline compilePipelineCached(com.mojang.blaze3d.pipeline.RenderPipeline pipeline, ) { return new yarnwrap.client.gl.CompiledShaderPipeline(net.minecraft.client.gl.GlBackend.compilePipelineCached(pipeline)); }
// public yarnwrap.client.gl.CompiledShaderPipeline method_68382(com.mojang.blaze3d.pipeline.RenderPipeline p) { return new yarnwrap.client.gl.CompiledShaderPipeline(wrapperContained.method_68382(p)); }
// public static yarnwrap.client.gl.CompiledShaderPipeline method_68382(com.mojang.blaze3d.pipeline.RenderPipeline p, ) { return new yarnwrap.client.gl.CompiledShaderPipeline(net.minecraft.client.gl.GlBackend.method_68382(p)); }
// public yarnwrap.client.gl.CompiledShaderPipeline compileRenderPipeline(com.mojang.blaze3d.pipeline.RenderPipeline pipeline,java.util.function.BiFunction sourceRetriever) { return new yarnwrap.client.gl.CompiledShaderPipeline(wrapperContained.compileRenderPipeline(pipeline,sourceRetriever)); }
// public static yarnwrap.client.gl.CompiledShaderPipeline compileRenderPipeline(com.mojang.blaze3d.pipeline.RenderPipeline pipeline,java.util.function.BiFunction sourceRetriever, ) { return new yarnwrap.client.gl.CompiledShaderPipeline(net.minecraft.client.gl.GlBackend.compileRenderPipeline(pipeline,sourceRetriever)); }
public yarnwrap.client.gl.BufferManager getBufferManager() { return new yarnwrap.client.gl.BufferManager(wrapperContained.getBufferManager()); }
// public static yarnwrap.client.gl.BufferManager getBufferManager() { return new yarnwrap.client.gl.BufferManager(net.minecraft.client.gl.GlBackend.getBufferManager()); }
// public yarnwrap.client.gl.VertexBufferManager getVertexBufferManager() { return new yarnwrap.client.gl.VertexBufferManager(wrapperContained.getVertexBufferManager()); }
// public static yarnwrap.client.gl.VertexBufferManager getVertexBufferManager() { return new yarnwrap.client.gl.VertexBufferManager(net.minecraft.client.gl.GlBackend.getVertexBufferManager()); }
// public int determineMaxTextureSize() { return wrapperContained.determineMaxTextureSize(); }
// public static int determineMaxTextureSize() { return net.minecraft.client.gl.GlBackend.determineMaxTextureSize(); }
// public yarnwrap.client.gl.GpuBufferManager getGpuBufferManager() { return new yarnwrap.client.gl.GpuBufferManager(wrapperContained.getGpuBufferManager()); }
// public static yarnwrap.client.gl.GpuBufferManager getGpuBufferManager() { return new yarnwrap.client.gl.GpuBufferManager(net.minecraft.client.gl.GlBackend.getGpuBufferManager()); }

}