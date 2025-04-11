package yarnwrap.client.gl;
public class PostEffectProcessor { public net.minecraft.client.gl.PostEffectProcessor wrapperContained; public PostEffectProcessor(net.minecraft.client.gl.PostEffectProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public java.util.Map targetsByName() { return wrapperContained.targetsByName; }
// public void targetsByName(java.util.Map value) { wrapperContained.targetsByName = value; }
// public java.util.List defaultSizedTargets() { return wrapperContained.defaultSizedTargets; }
// public void defaultSizedTargets(java.util.List value) { wrapperContained.defaultSizedTargets = value; }
// public java.util.List passes() { return wrapperContained.passes; }
// public void passes(java.util.List value) { wrapperContained.passes = value; }
// public org.joml.Matrix4f projectionMatrix() { return wrapperContained.projectionMatrix; }
// public void projectionMatrix(org.joml.Matrix4f value) { wrapperContained.projectionMatrix = value; }
// public yarnwrap.client.gl.Framebuffer mainTarget() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.mainTarget); }
// public void mainTarget(yarnwrap.client.gl.Framebuffer value) { wrapperContained.mainTarget = value.wrapperContained; }
// public float lastTickDelta() { return wrapperContained.lastTickDelta; }
// public void lastTickDelta(float value) { wrapperContained.lastTickDelta = value; }
// public float time() { return wrapperContained.time; }
// public void time(float value) { wrapperContained.time = value; }
// public java.lang.String MAIN_TARGET_NAME() { return wrapperContained.MAIN_TARGET_NAME; }
// public void MAIN_TARGET_NAME(java.lang.String value) { wrapperContained.MAIN_TARGET_NAME = value; }
// public yarnwrap.resource.ResourceFactory resourceFactory() { return new yarnwrap.resource.ResourceFactory(wrapperContained.resourceFactory); }
// public void resourceFactory(yarnwrap.resource.ResourceFactory value) { wrapperContained.resourceFactory = value.wrapperContained; }
// public void parseEffect(yarnwrap.client.texture.TextureManager textureManager,yarnwrap.util.Identifier id) { wrapperContained.parseEffect(textureManager.wrapperContained,id.wrapperContained); }
// public void parsePass(yarnwrap.client.texture.TextureManager textureManager,com.google.gson.JsonElement jsonPass) { wrapperContained.parsePass(textureManager.wrapperContained,jsonPass); }
public void render(float tickDelta) { wrapperContained.render(tickDelta); }
public void setupDimensions(int targetsWidth,int targetsHeight) { wrapperContained.setupDimensions(targetsWidth,targetsHeight); }
public java.lang.String getName() { return wrapperContained.getName(); }
public void addTarget(java.lang.String name,int width,int height) { wrapperContained.addTarget(name,width,height); }
// public yarnwrap.client.gl.PostEffectPass addPass(java.lang.String programName,yarnwrap.client.gl.Framebuffer source,yarnwrap.client.gl.Framebuffer dest,boolean linear) { return new yarnwrap.client.gl.PostEffectPass(wrapperContained.addPass(programName,source.wrapperContained,dest.wrapperContained,linear)); }
// public void parseUniform(com.google.gson.JsonElement jsonUniform) { wrapperContained.parseUniform(jsonUniform); }
public yarnwrap.client.gl.Framebuffer getSecondaryTarget(java.lang.String name) { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getSecondaryTarget(name)); }
// public void parseTarget(com.google.gson.JsonElement jsonTarget) { wrapperContained.parseTarget(jsonTarget); }
// public yarnwrap.client.gl.Framebuffer getTarget(java.lang.String name) { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getTarget(name)); }
// public void setupProjectionMatrix() { wrapperContained.setupProjectionMatrix(); }
public void setUniforms(java.lang.String name,float value) { wrapperContained.setUniforms(name,value); }
// public void setTexFilter(int texFilter) { wrapperContained.setTexFilter(texFilter); }

}