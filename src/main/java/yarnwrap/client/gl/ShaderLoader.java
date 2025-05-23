package yarnwrap.client.gl;
public class ShaderLoader { public net.minecraft.client.gl.ShaderLoader wrapperContained; public ShaderLoader(net.minecraft.client.gl.ShaderLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String SHADERS_PATH() { return wrapperContained.SHADERS_PATH; }
// public void SHADERS_PATH(java.lang.String value) { wrapperContained.SHADERS_PATH = value; }
public static java.lang.String SHADERS_PATH() { return net.minecraft.client.gl.ShaderLoader.SHADERS_PATH; }
// public static void SHADERS_PATH(java.lang.String value, ) { net.minecraft.client.gl.ShaderLoader.SHADERS_PATH = value; }

// public java.lang.String INCLUDE_PATH() { return wrapperContained.INCLUDE_PATH; }
// public void INCLUDE_PATH(java.lang.String value) { wrapperContained.INCLUDE_PATH = value; }
// public static java.lang.String INCLUDE_PATH() { return net.minecraft.client.gl.ShaderLoader.INCLUDE_PATH; }
// public static void INCLUDE_PATH(java.lang.String value, ) { net.minecraft.client.gl.ShaderLoader.INCLUDE_PATH = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.gl.ShaderLoader.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.gl.ShaderLoader.LOGGER = value; }

// public yarnwrap.resource.ResourceFinder POST_EFFECT_FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.POST_EFFECT_FINDER); }
// public void POST_EFFECT_FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.POST_EFFECT_FINDER = value.wrapperContained; }
// public static yarnwrap.resource.ResourceFinder POST_EFFECT_FINDER() { return new yarnwrap.resource.ResourceFinder(net.minecraft.client.gl.ShaderLoader.POST_EFFECT_FINDER); }
// public static void POST_EFFECT_FINDER(yarnwrap.resource.ResourceFinder value, ) { net.minecraft.client.gl.ShaderLoader.POST_EFFECT_FINDER = value.wrapperContained; }

// public yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.textureManager); }
// public void textureManager(yarnwrap.client.texture.TextureManager value) { wrapperContained.textureManager = value.wrapperContained; }
// public static yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(net.minecraft.client.gl.ShaderLoader.textureManager); }
// public static void textureManager(yarnwrap.client.texture.TextureManager value, ) { net.minecraft.client.gl.ShaderLoader.textureManager = value.wrapperContained; }

// public java.util.function.Consumer onError() { return wrapperContained.onError; }
// public void onError(java.util.function.Consumer value) { wrapperContained.onError = value; }
// public static java.util.function.Consumer onError() { return net.minecraft.client.gl.ShaderLoader.onError; }
// public static void onError(java.util.function.Consumer value, ) { net.minecraft.client.gl.ShaderLoader.onError = value; }

// public Object cache() { return wrapperContained.cache; }
// // public void cache(Object value) { wrapperContained.cache = value; }
// // public static Object cache() { return net.minecraft.client.gl.ShaderLoader.cache; }
// // public static void cache(Object value, ) { net.minecraft.client.gl.ShaderLoader.cache = value; }

// public yarnwrap.client.render.ProjectionMatrix2 projectionMatrix() { return new yarnwrap.client.render.ProjectionMatrix2(wrapperContained.projectionMatrix); }
// public void projectionMatrix(yarnwrap.client.render.ProjectionMatrix2 value) { wrapperContained.projectionMatrix = value.wrapperContained; }
// public static yarnwrap.client.render.ProjectionMatrix2 projectionMatrix() { return new yarnwrap.client.render.ProjectionMatrix2(net.minecraft.client.gl.ShaderLoader.projectionMatrix); }
// public static void projectionMatrix(yarnwrap.client.render.ProjectionMatrix2 value, ) { net.minecraft.client.gl.ShaderLoader.projectionMatrix = value.wrapperContained; }

public ShaderLoader(yarnwrap.client.texture.TextureManager textureManager,java.util.function.Consumer onError) { this.wrapperContained = new net.minecraft.client.gl.ShaderLoader(textureManager.wrapperContained,onError); }
// public void loadShaderSource(yarnwrap.util.Identifier id,yarnwrap.resource.Resource resource,com.mojang.blaze3d.shaders.ShaderType type,java.util.Map allResources,Object builder) { wrapperContained.loadShaderSource(id.wrapperContained,resource.wrapperContained,type,allResources,builder); }
// public static void loadShaderSource(yarnwrap.util.Identifier id,yarnwrap.resource.Resource resource,com.mojang.blaze3d.shaders.ShaderType type,java.util.Map allResources,Object builder, ) { net.minecraft.client.gl.ShaderLoader.loadShaderSource(id.wrapperContained,resource.wrapperContained,type,allResources,builder); }
public yarnwrap.client.gl.PostEffectProcessor loadPostEffect(yarnwrap.util.Identifier id,java.util.Set availableExternalTargets) { return new yarnwrap.client.gl.PostEffectProcessor(wrapperContained.loadPostEffect(id.wrapperContained,availableExternalTargets)); }
// public static yarnwrap.client.gl.PostEffectProcessor loadPostEffect(yarnwrap.util.Identifier id,java.util.Set availableExternalTargets, ) { return new yarnwrap.client.gl.PostEffectProcessor(net.minecraft.client.gl.ShaderLoader.loadPostEffect(id.wrapperContained,availableExternalTargets)); }
// public yarnwrap.client.gl.GlImportProcessor createImportProcessor(java.util.Map allResources,yarnwrap.util.Identifier id) { return new yarnwrap.client.gl.GlImportProcessor(wrapperContained.createImportProcessor(allResources,id.wrapperContained)); }
// public static yarnwrap.client.gl.GlImportProcessor createImportProcessor(java.util.Map allResources,yarnwrap.util.Identifier id, ) { return new yarnwrap.client.gl.GlImportProcessor(net.minecraft.client.gl.ShaderLoader.createImportProcessor(allResources,id.wrapperContained)); }
// public boolean isShaderSource(yarnwrap.util.Identifier id) { return wrapperContained.isShaderSource(id.wrapperContained); }
// public static boolean isShaderSource(yarnwrap.util.Identifier id, ) { return net.minecraft.client.gl.ShaderLoader.isShaderSource(id.wrapperContained); }
// public void loadPostEffect(yarnwrap.util.Identifier id,yarnwrap.resource.Resource resource,Object builder) { wrapperContained.loadPostEffect(id.wrapperContained,resource.wrapperContained,builder); }
// public static void loadPostEffect(yarnwrap.util.Identifier id,yarnwrap.resource.Resource resource,Object builder, ) { net.minecraft.client.gl.ShaderLoader.loadPostEffect(id.wrapperContained,resource.wrapperContained,builder); }
// public void handleError(java.lang.Exception exception) { wrapperContained.handleError(exception); }
// public static void handleError(java.lang.Exception exception, ) { net.minecraft.client.gl.ShaderLoader.handleError(exception); }
public java.lang.String getSource(yarnwrap.util.Identifier id,com.mojang.blaze3d.shaders.ShaderType type) { return wrapperContained.getSource(id.wrapperContained,type); }
// public static java.lang.String getSource(yarnwrap.util.Identifier id,com.mojang.blaze3d.shaders.ShaderType type, ) { return net.minecraft.client.gl.ShaderLoader.getSource(id.wrapperContained,type); }

}