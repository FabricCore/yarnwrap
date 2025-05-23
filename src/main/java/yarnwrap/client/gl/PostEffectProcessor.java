package yarnwrap.client.gl;
public class PostEffectProcessor { public net.minecraft.client.gl.PostEffectProcessor wrapperContained; public PostEffectProcessor(net.minecraft.client.gl.PostEffectProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List passes() { return wrapperContained.passes; }
// public void passes(java.util.List value) { wrapperContained.passes = value; }
// public static java.util.List passes() { return net.minecraft.client.gl.PostEffectProcessor.passes; }
// public static void passes(java.util.List value, ) { net.minecraft.client.gl.PostEffectProcessor.passes = value; }

// public yarnwrap.util.Identifier MAIN() { return new yarnwrap.util.Identifier(wrapperContained.MAIN); }
// public void MAIN(yarnwrap.util.Identifier value) { wrapperContained.MAIN = value.wrapperContained; }
public static yarnwrap.util.Identifier MAIN() { return new yarnwrap.util.Identifier(net.minecraft.client.gl.PostEffectProcessor.MAIN); }
// public static void MAIN(yarnwrap.util.Identifier value, ) { net.minecraft.client.gl.PostEffectProcessor.MAIN = value.wrapperContained; }

// public java.util.Map internalTargets() { return wrapperContained.internalTargets; }
// public void internalTargets(java.util.Map value) { wrapperContained.internalTargets = value; }
// public static java.util.Map internalTargets() { return net.minecraft.client.gl.PostEffectProcessor.internalTargets; }
// public static void internalTargets(java.util.Map value, ) { net.minecraft.client.gl.PostEffectProcessor.internalTargets = value; }

// public java.util.Set externalTargets() { return wrapperContained.externalTargets; }
// public void externalTargets(java.util.Set value) { wrapperContained.externalTargets = value; }
// public static java.util.Set externalTargets() { return net.minecraft.client.gl.PostEffectProcessor.externalTargets; }
// public static void externalTargets(java.util.Set value, ) { net.minecraft.client.gl.PostEffectProcessor.externalTargets = value; }

// public java.util.Map framebuffers() { return wrapperContained.framebuffers; }
// public void framebuffers(java.util.Map value) { wrapperContained.framebuffers = value; }
// public static java.util.Map framebuffers() { return net.minecraft.client.gl.PostEffectProcessor.framebuffers; }
// public static void framebuffers(java.util.Map value, ) { net.minecraft.client.gl.PostEffectProcessor.framebuffers = value; }

// public yarnwrap.client.render.ProjectionMatrix2 projectionMatrix() { return new yarnwrap.client.render.ProjectionMatrix2(wrapperContained.projectionMatrix); }
// public void projectionMatrix(yarnwrap.client.render.ProjectionMatrix2 value) { wrapperContained.projectionMatrix = value.wrapperContained; }
// public static yarnwrap.client.render.ProjectionMatrix2 projectionMatrix() { return new yarnwrap.client.render.ProjectionMatrix2(net.minecraft.client.gl.PostEffectProcessor.projectionMatrix); }
// public static void projectionMatrix(yarnwrap.client.render.ProjectionMatrix2 value, ) { net.minecraft.client.gl.PostEffectProcessor.projectionMatrix = value.wrapperContained; }

// public PostEffectProcessor(java.util.List passes,java.util.Map internalTargets,java.util.Set externalTargets,yarnwrap.client.render.ProjectionMatrix2 projectionMatrix) { this.wrapperContained = new net.minecraft.client.gl.PostEffectProcessor(passes,internalTargets,externalTargets,projectionMatrix.wrapperContained); }
// public yarnwrap.client.gl.PostEffectProcessor parseEffect(yarnwrap.client.gl.PostEffectPipeline pipeline,yarnwrap.client.texture.TextureManager textureManager,java.util.Set availableExternalTargets,yarnwrap.util.Identifier id,yarnwrap.client.render.ProjectionMatrix2 projectionMatrix) { return new yarnwrap.client.gl.PostEffectProcessor(wrapperContained.parseEffect(pipeline.wrapperContained,textureManager.wrapperContained,availableExternalTargets,id.wrapperContained,projectionMatrix.wrapperContained)); }
// public static yarnwrap.client.gl.PostEffectProcessor parseEffect(yarnwrap.client.gl.PostEffectPipeline pipeline,yarnwrap.client.texture.TextureManager textureManager,java.util.Set availableExternalTargets,yarnwrap.util.Identifier id,yarnwrap.client.render.ProjectionMatrix2 projectionMatrix, ) { return new yarnwrap.client.gl.PostEffectProcessor(net.minecraft.client.gl.PostEffectProcessor.parseEffect(pipeline.wrapperContained,textureManager.wrapperContained,availableExternalTargets,id.wrapperContained,projectionMatrix.wrapperContained)); }
// public void render(yarnwrap.client.gl.Framebuffer framebuffer,yarnwrap.client.util.ObjectAllocator objectAllocator) { wrapperContained.render(framebuffer.wrapperContained,objectAllocator.wrapperContained); }
// public static void render(yarnwrap.client.gl.Framebuffer framebuffer,yarnwrap.client.util.ObjectAllocator objectAllocator, ) { net.minecraft.client.gl.PostEffectProcessor.render(framebuffer.wrapperContained,objectAllocator.wrapperContained); }
// public yarnwrap.client.gl.PostEffectPass parsePass(yarnwrap.client.texture.TextureManager textureManager,Object pass,yarnwrap.util.Identifier id) { return new yarnwrap.client.gl.PostEffectPass(wrapperContained.parsePass(textureManager.wrapperContained,pass,id.wrapperContained)); }
// public static yarnwrap.client.gl.PostEffectPass parsePass(yarnwrap.client.texture.TextureManager textureManager,Object pass,yarnwrap.util.Identifier id, ) { return new yarnwrap.client.gl.PostEffectPass(net.minecraft.client.gl.PostEffectProcessor.parsePass(textureManager.wrapperContained,pass,id.wrapperContained)); }
// public void render(yarnwrap.client.render.FrameGraphBuilder builder,int textureWidth,int textureHeight,Object framebufferSet) { wrapperContained.render(builder.wrapperContained,textureWidth,textureHeight,framebufferSet); }
// public static void render(yarnwrap.client.render.FrameGraphBuilder builder,int textureWidth,int textureHeight,Object framebufferSet, ) { net.minecraft.client.gl.PostEffectProcessor.render(builder.wrapperContained,textureWidth,textureHeight,framebufferSet); }
// public boolean method_62238(yarnwrap.client.gl.PostEffectPipeline target) { return wrapperContained.method_62238(target.wrapperContained); }
// public static boolean method_62238(yarnwrap.client.gl.PostEffectPipeline target, ) { return net.minecraft.client.gl.PostEffectProcessor.method_62238(target.wrapperContained); }
// public java.lang.String method_62239(java.lang.String name) { return wrapperContained.method_62239(name); }
// public static java.lang.String method_62239(java.lang.String name, ) { return net.minecraft.client.gl.PostEffectProcessor.method_62239(name); }
// public yarnwrap.client.gl.Framebuffer createFramebuffer(yarnwrap.util.Identifier id,yarnwrap.client.gl.SimpleFramebufferFactory factory) { return new yarnwrap.client.gl.Framebuffer(wrapperContained.createFramebuffer(id.wrapperContained,factory.wrapperContained)); }
// public static yarnwrap.client.gl.Framebuffer createFramebuffer(yarnwrap.util.Identifier id,yarnwrap.client.gl.SimpleFramebufferFactory factory, ) { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.gl.PostEffectProcessor.createFramebuffer(id.wrapperContained,factory.wrapperContained)); }

}