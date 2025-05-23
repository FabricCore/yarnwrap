package yarnwrap.client.texture;
public class GlTexture { public net.minecraft.client.texture.GlTexture wrapperContained; public GlTexture(net.minecraft.client.texture.GlTexture wrapperContained) { this.wrapperContained = wrapperContained; }

// public int glId() { return wrapperContained.glId; }
// public void glId(int value) { wrapperContained.glId = value; }
// public static int glId() { return net.minecraft.client.texture.GlTexture.glId; }
// public static void glId(int value, ) { net.minecraft.client.texture.GlTexture.glId = value; }

// public boolean closed() { return wrapperContained.closed; }
// public void closed(boolean value) { wrapperContained.closed = value; }
// public static boolean closed() { return net.minecraft.client.texture.GlTexture.closed; }
// public static void closed(boolean value, ) { net.minecraft.client.texture.GlTexture.closed = value; }

// public boolean needsReinit() { return wrapperContained.needsReinit; }
// public void needsReinit(boolean value) { wrapperContained.needsReinit = value; }
// public static boolean needsReinit() { return net.minecraft.client.texture.GlTexture.needsReinit; }
// public static void needsReinit(boolean value, ) { net.minecraft.client.texture.GlTexture.needsReinit = value; }

// public it.unimi.dsi.fastutil.ints.Int2IntMap depthTexToFramebufferIdCache() { return wrapperContained.depthTexToFramebufferIdCache; }
// public void depthTexToFramebufferIdCache(it.unimi.dsi.fastutil.ints.Int2IntMap value) { wrapperContained.depthTexToFramebufferIdCache = value; }
// public static it.unimi.dsi.fastutil.ints.Int2IntMap depthTexToFramebufferIdCache() { return net.minecraft.client.texture.GlTexture.depthTexToFramebufferIdCache; }
// public static void depthTexToFramebufferIdCache(it.unimi.dsi.fastutil.ints.Int2IntMap value, ) { net.minecraft.client.texture.GlTexture.depthTexToFramebufferIdCache = value; }

// public int refCount() { return wrapperContained.refCount; }
// public void refCount(int value) { wrapperContained.refCount = value; }
// public static int refCount() { return net.minecraft.client.texture.GlTexture.refCount; }
// public static void refCount(int value, ) { net.minecraft.client.texture.GlTexture.refCount = value; }

// public GlTexture(int usage,java.lang.String label,com.mojang.blaze3d.textures.TextureFormat format,int width,int height,int depthOrLayers,int mipLevels,int glId) { this.wrapperContained = new net.minecraft.client.texture.GlTexture(usage,label,format,width,height,depthOrLayers,mipLevels,glId); }
// public void checkDirty(int target) { wrapperContained.checkDirty(target); }
// public static void checkDirty(int target, ) { net.minecraft.client.texture.GlTexture.checkDirty(target); }
// public int method_68425(yarnwrap.client.gl.BufferManager unused) { return wrapperContained.method_68425(unused.wrapperContained); }
// public static int method_68425(yarnwrap.client.gl.BufferManager unused, ) { return net.minecraft.client.texture.GlTexture.method_68425(unused.wrapperContained); }
// public int getOrCreateFramebuffer(yarnwrap.client.gl.BufferManager manager,com.mojang.blaze3d.textures.GpuTexture depthTexture) { return wrapperContained.getOrCreateFramebuffer(manager.wrapperContained,depthTexture); }
// public static int getOrCreateFramebuffer(yarnwrap.client.gl.BufferManager manager,com.mojang.blaze3d.textures.GpuTexture depthTexture, ) { return net.minecraft.client.texture.GlTexture.getOrCreateFramebuffer(manager.wrapperContained,depthTexture); }
public int getGlId() { return wrapperContained.getGlId(); }
// public static int getGlId() { return net.minecraft.client.texture.GlTexture.getGlId(); }
// public void incrementRefCount() { wrapperContained.incrementRefCount(); }
// public static void incrementRefCount() { net.minecraft.client.texture.GlTexture.incrementRefCount(); }
// public void decrementRefCount() { wrapperContained.decrementRefCount(); }
// public static void decrementRefCount() { net.minecraft.client.texture.GlTexture.decrementRefCount(); }
// public void free() { wrapperContained.free(); }
// public static void free() { net.minecraft.client.texture.GlTexture.free(); }

}