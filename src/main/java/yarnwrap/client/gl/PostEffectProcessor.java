package yarnwrap.client.gl;
public class PostEffectProcessor { public net.minecraft.client.gl.PostEffectProcessor wrapperContained; public PostEffectProcessor(net.minecraft.client.gl.PostEffectProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.client.gl.PostEffectProcessor.height; }
// public static void height(int value, ) { net.minecraft.client.gl.PostEffectProcessor.height = value; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.client.gl.PostEffectProcessor.width; }
// public static void width(int value, ) { net.minecraft.client.gl.PostEffectProcessor.width = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.client.gl.PostEffectProcessor.name; }
// public static void name(java.lang.String value, ) { net.minecraft.client.gl.PostEffectProcessor.name = value; }

// public java.util.Map targetsByName() { return wrapperContained.targetsByName; }
// public void targetsByName(java.util.Map value) { wrapperContained.targetsByName = value; }
// public static java.util.Map targetsByName() { return net.minecraft.client.gl.PostEffectProcessor.targetsByName; }
// public static void targetsByName(java.util.Map value, ) { net.minecraft.client.gl.PostEffectProcessor.targetsByName = value; }

// public java.util.List defaultSizedTargets() { return wrapperContained.defaultSizedTargets; }
// public void defaultSizedTargets(java.util.List value) { wrapperContained.defaultSizedTargets = value; }
// public static java.util.List defaultSizedTargets() { return net.minecraft.client.gl.PostEffectProcessor.defaultSizedTargets; }
// public static void defaultSizedTargets(java.util.List value, ) { net.minecraft.client.gl.PostEffectProcessor.defaultSizedTargets = value; }

// public java.util.List passes() { return wrapperContained.passes; }
// public void passes(java.util.List value) { wrapperContained.passes = value; }
// public static java.util.List passes() { return net.minecraft.client.gl.PostEffectProcessor.passes; }
// public static void passes(java.util.List value, ) { net.minecraft.client.gl.PostEffectProcessor.passes = value; }

// public org.joml.Matrix4f projectionMatrix() { return wrapperContained.projectionMatrix; }
// public void projectionMatrix(org.joml.Matrix4f value) { wrapperContained.projectionMatrix = value; }
// public static org.joml.Matrix4f projectionMatrix() { return net.minecraft.client.gl.PostEffectProcessor.projectionMatrix; }
// public static void projectionMatrix(org.joml.Matrix4f value, ) { net.minecraft.client.gl.PostEffectProcessor.projectionMatrix = value; }

// public yarnwrap.client.gl.Framebuffer mainTarget() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.mainTarget); }
// public void mainTarget(yarnwrap.client.gl.Framebuffer value) { wrapperContained.mainTarget = value.wrapperContained; }
// public static yarnwrap.client.gl.Framebuffer mainTarget() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.gl.PostEffectProcessor.mainTarget); }
// public static void mainTarget(yarnwrap.client.gl.Framebuffer value, ) { net.minecraft.client.gl.PostEffectProcessor.mainTarget = value.wrapperContained; }

// public float lastTickDelta() { return wrapperContained.lastTickDelta; }
// public void lastTickDelta(float value) { wrapperContained.lastTickDelta = value; }
// public static float lastTickDelta() { return net.minecraft.client.gl.PostEffectProcessor.lastTickDelta; }
// public static void lastTickDelta(float value, ) { net.minecraft.client.gl.PostEffectProcessor.lastTickDelta = value; }

// public float time() { return wrapperContained.time; }
// public void time(float value) { wrapperContained.time = value; }
// public static float time() { return net.minecraft.client.gl.PostEffectProcessor.time; }
// public static void time(float value, ) { net.minecraft.client.gl.PostEffectProcessor.time = value; }

// public java.lang.String MAIN_TARGET_NAME() { return wrapperContained.MAIN_TARGET_NAME; }
// public void MAIN_TARGET_NAME(java.lang.String value) { wrapperContained.MAIN_TARGET_NAME = value; }
// public static java.lang.String MAIN_TARGET_NAME() { return net.minecraft.client.gl.PostEffectProcessor.MAIN_TARGET_NAME; }
// public static void MAIN_TARGET_NAME(java.lang.String value, ) { net.minecraft.client.gl.PostEffectProcessor.MAIN_TARGET_NAME = value; }

// public yarnwrap.resource.ResourceFactory resourceFactory() { return new yarnwrap.resource.ResourceFactory(wrapperContained.resourceFactory); }
// public void resourceFactory(yarnwrap.resource.ResourceFactory value) { wrapperContained.resourceFactory = value.wrapperContained; }
// public static yarnwrap.resource.ResourceFactory resourceFactory() { return new yarnwrap.resource.ResourceFactory(net.minecraft.client.gl.PostEffectProcessor.resourceFactory); }
// public static void resourceFactory(yarnwrap.resource.ResourceFactory value, ) { net.minecraft.client.gl.PostEffectProcessor.resourceFactory = value.wrapperContained; }

// public PostEffectProcessor(yarnwrap.client.texture.TextureManager textureManager,yarnwrap.resource.ResourceFactory resourceFactory,yarnwrap.client.gl.Framebuffer framebuffer,yarnwrap.util.Identifier id) { this.wrapperContained = new net.minecraft.client.gl.PostEffectProcessor(textureManager.wrapperContained,resourceFactory.wrapperContained,framebuffer.wrapperContained,id.wrapperContained); }
// public void parseEffect(yarnwrap.client.texture.TextureManager textureManager,yarnwrap.util.Identifier id) { wrapperContained.parseEffect(textureManager.wrapperContained,id.wrapperContained); }
// public static void parseEffect(yarnwrap.client.texture.TextureManager textureManager,yarnwrap.util.Identifier id, ) { net.minecraft.client.gl.PostEffectProcessor.parseEffect(textureManager.wrapperContained,id.wrapperContained); }
// public void parsePass(yarnwrap.client.texture.TextureManager textureManager,com.google.gson.JsonElement jsonPass) { wrapperContained.parsePass(textureManager.wrapperContained,jsonPass); }
// public static void parsePass(yarnwrap.client.texture.TextureManager textureManager,com.google.gson.JsonElement jsonPass, ) { net.minecraft.client.gl.PostEffectProcessor.parsePass(textureManager.wrapperContained,jsonPass); }
public void render(float tickDelta) { wrapperContained.render(tickDelta); }
// public static void render(float tickDelta, ) { net.minecraft.client.gl.PostEffectProcessor.render(tickDelta); }
public void setupDimensions(int targetsWidth,int targetsHeight) { wrapperContained.setupDimensions(targetsWidth,targetsHeight); }
// public static void setupDimensions(int targetsWidth,int targetsHeight, ) { net.minecraft.client.gl.PostEffectProcessor.setupDimensions(targetsWidth,targetsHeight); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.client.gl.PostEffectProcessor.getName(); }
public void addTarget(java.lang.String name,int width,int height) { wrapperContained.addTarget(name,width,height); }
// public static void addTarget(java.lang.String name,int width,int height, ) { net.minecraft.client.gl.PostEffectProcessor.addTarget(name,width,height); }
// public yarnwrap.client.gl.PostEffectPass addPass(java.lang.String programName,yarnwrap.client.gl.Framebuffer source,yarnwrap.client.gl.Framebuffer dest,boolean linear) { return new yarnwrap.client.gl.PostEffectPass(wrapperContained.addPass(programName,source.wrapperContained,dest.wrapperContained,linear)); }
// public static yarnwrap.client.gl.PostEffectPass addPass(java.lang.String programName,yarnwrap.client.gl.Framebuffer source,yarnwrap.client.gl.Framebuffer dest,boolean linear, ) { return new yarnwrap.client.gl.PostEffectPass(net.minecraft.client.gl.PostEffectProcessor.addPass(programName,source.wrapperContained,dest.wrapperContained,linear)); }
// public void parseUniform(com.google.gson.JsonElement jsonUniform) { wrapperContained.parseUniform(jsonUniform); }
// public static void parseUniform(com.google.gson.JsonElement jsonUniform, ) { net.minecraft.client.gl.PostEffectProcessor.parseUniform(jsonUniform); }
public yarnwrap.client.gl.Framebuffer getSecondaryTarget(java.lang.String name) { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getSecondaryTarget(name)); }
// public static yarnwrap.client.gl.Framebuffer getSecondaryTarget(java.lang.String name, ) { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.gl.PostEffectProcessor.getSecondaryTarget(name)); }
// public void parseTarget(com.google.gson.JsonElement jsonTarget) { wrapperContained.parseTarget(jsonTarget); }
// public static void parseTarget(com.google.gson.JsonElement jsonTarget, ) { net.minecraft.client.gl.PostEffectProcessor.parseTarget(jsonTarget); }
// public yarnwrap.client.gl.Framebuffer getTarget(java.lang.String name) { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getTarget(name)); }
// public static yarnwrap.client.gl.Framebuffer getTarget(java.lang.String name, ) { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.gl.PostEffectProcessor.getTarget(name)); }
// public void setupProjectionMatrix() { wrapperContained.setupProjectionMatrix(); }
// public static void setupProjectionMatrix() { net.minecraft.client.gl.PostEffectProcessor.setupProjectionMatrix(); }
public void setUniforms(java.lang.String name,float value) { wrapperContained.setUniforms(name,value); }
// public static void setUniforms(java.lang.String name,float value, ) { net.minecraft.client.gl.PostEffectProcessor.setUniforms(name,value); }
// public void setTexFilter(int texFilter) { wrapperContained.setTexFilter(texFilter); }
// public static void setTexFilter(int texFilter, ) { net.minecraft.client.gl.PostEffectProcessor.setTexFilter(texFilter); }

}