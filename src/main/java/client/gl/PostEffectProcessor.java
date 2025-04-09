package yarnwrap.client.gl;
public class PostEffectProcessor { public net.minecraft.client.gl.PostEffectProcessor wrapperContained; public PostEffectProcessor(net.minecraft.client.gl.PostEffectProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public int height() { return wrapperContained.height; }
// public int width() { return wrapperContained.width; }
// public java.lang.String name() { return wrapperContained.name; }
// public java.util.Map targetsByName() { return wrapperContained.targetsByName; }
// public java.util.List defaultSizedTargets() { return wrapperContained.defaultSizedTargets; }
// public java.util.List passes() { return wrapperContained.passes; }
// public org.joml.Matrix4f projectionMatrix() { return wrapperContained.projectionMatrix; }
// public yarnwrap.client.gl.Framebuffer mainTarget() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.mainTarget); }
// public float lastTickDelta() { return wrapperContained.lastTickDelta; }
// public float time() { return wrapperContained.time; }
// public java.lang.String MAIN_TARGET_NAME() { return wrapperContained.MAIN_TARGET_NAME; }
// public yarnwrap.resource.ResourceFactory resourceFactory() { return new yarnwrap.resource.ResourceFactory(wrapperContained.resourceFactory); }
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