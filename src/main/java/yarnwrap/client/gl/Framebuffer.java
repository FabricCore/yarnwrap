package yarnwrap.client.gl;
public class Framebuffer { public net.minecraft.client.gl.Framebuffer wrapperContained; public Framebuffer(net.minecraft.client.gl.Framebuffer wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.blaze3d.textures.GpuTexture colorAttachment() { return wrapperContained.colorAttachment; }
// public void colorAttachment(com.mojang.blaze3d.textures.GpuTexture value) { wrapperContained.colorAttachment = value; }
// public static com.mojang.blaze3d.textures.GpuTexture colorAttachment() { return net.minecraft.client.gl.Framebuffer.colorAttachment; }
// public static void colorAttachment(com.mojang.blaze3d.textures.GpuTexture value, ) { net.minecraft.client.gl.Framebuffer.colorAttachment = value; }

public int viewportHeight() { return wrapperContained.viewportHeight; }
public void viewportHeight(int value) { wrapperContained.viewportHeight = value; }
// public static int viewportHeight() { return net.minecraft.client.gl.Framebuffer.viewportHeight; }
// public static void viewportHeight(int value, ) { net.minecraft.client.gl.Framebuffer.viewportHeight = value; }

public boolean useDepthAttachment() { return wrapperContained.useDepthAttachment; }
// public void useDepthAttachment(boolean value) { wrapperContained.useDepthAttachment = value; }
// public static boolean useDepthAttachment() { return net.minecraft.client.gl.Framebuffer.useDepthAttachment; }
// public static void useDepthAttachment(boolean value, ) { net.minecraft.client.gl.Framebuffer.useDepthAttachment = value; }

public int viewportWidth() { return wrapperContained.viewportWidth; }
public void viewportWidth(int value) { wrapperContained.viewportWidth = value; }
// public static int viewportWidth() { return net.minecraft.client.gl.Framebuffer.viewportWidth; }
// public static void viewportWidth(int value, ) { net.minecraft.client.gl.Framebuffer.viewportWidth = value; }

public int textureHeight() { return wrapperContained.textureHeight; }
public void textureHeight(int value) { wrapperContained.textureHeight = value; }
// public static int textureHeight() { return net.minecraft.client.gl.Framebuffer.textureHeight; }
// public static void textureHeight(int value, ) { net.minecraft.client.gl.Framebuffer.textureHeight = value; }

public int textureWidth() { return wrapperContained.textureWidth; }
public void textureWidth(int value) { wrapperContained.textureWidth = value; }
// public static int textureWidth() { return net.minecraft.client.gl.Framebuffer.textureWidth; }
// public static void textureWidth(int value, ) { net.minecraft.client.gl.Framebuffer.textureWidth = value; }

public com.mojang.blaze3d.textures.FilterMode filterMode() { return wrapperContained.filterMode; }
public void filterMode(com.mojang.blaze3d.textures.FilterMode value) { wrapperContained.filterMode = value; }
// public static com.mojang.blaze3d.textures.FilterMode filterMode() { return net.minecraft.client.gl.Framebuffer.filterMode; }
// public static void filterMode(com.mojang.blaze3d.textures.FilterMode value, ) { net.minecraft.client.gl.Framebuffer.filterMode = value; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.client.gl.Framebuffer.index; }
// public static void index(int value, ) { net.minecraft.client.gl.Framebuffer.index = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.client.gl.Framebuffer.name; }
// public static void name(java.lang.String value, ) { net.minecraft.client.gl.Framebuffer.name = value; }

// public com.mojang.blaze3d.textures.GpuTexture depthAttachment() { return wrapperContained.depthAttachment; }
// public void depthAttachment(com.mojang.blaze3d.textures.GpuTexture value) { wrapperContained.depthAttachment = value; }
// public static com.mojang.blaze3d.textures.GpuTexture depthAttachment() { return net.minecraft.client.gl.Framebuffer.depthAttachment; }
// public static void depthAttachment(com.mojang.blaze3d.textures.GpuTexture value, ) { net.minecraft.client.gl.Framebuffer.depthAttachment = value; }

// // public com.mojang.blaze3d.textures.GpuTextureView colorAttachmentView() { return wrapperContained.colorAttachmentView; }
// // public void colorAttachmentView(com.mojang.blaze3d.textures.GpuTextureView value) { wrapperContained.colorAttachmentView = value; }
// // public static com.mojang.blaze3d.textures.GpuTextureView colorAttachmentView() { return net.minecraft.client.gl.Framebuffer.colorAttachmentView; }
// // public static void colorAttachmentView(com.mojang.blaze3d.textures.GpuTextureView value, ) { net.minecraft.client.gl.Framebuffer.colorAttachmentView = value; }

// // public com.mojang.blaze3d.textures.GpuTextureView depthAttachmentView() { return wrapperContained.depthAttachmentView; }
// // public void depthAttachmentView(com.mojang.blaze3d.textures.GpuTextureView value) { wrapperContained.depthAttachmentView = value; }
// // public static com.mojang.blaze3d.textures.GpuTextureView depthAttachmentView() { return net.minecraft.client.gl.Framebuffer.depthAttachmentView; }
// // public static void depthAttachmentView(com.mojang.blaze3d.textures.GpuTextureView value, ) { net.minecraft.client.gl.Framebuffer.depthAttachmentView = value; }

// public Framebuffer(java.lang.String name,boolean useDepthAttachment) { this.wrapperContained = new net.minecraft.client.gl.Framebuffer(name,useDepthAttachment); }
public void initFbo(int width,int height) { wrapperContained.initFbo(width,height); }
// public static void initFbo(int width,int height, ) { net.minecraft.client.gl.Framebuffer.initFbo(width,height); }
// public void setFilter(com.mojang.blaze3d.textures.FilterMode filter,boolean force) { wrapperContained.setFilter(filter,force); }
// public static void setFilter(com.mojang.blaze3d.textures.FilterMode filter,boolean force, ) { net.minecraft.client.gl.Framebuffer.setFilter(filter,force); }
public void resize(int width,int height) { wrapperContained.resize(width,height); }
// public static void resize(int width,int height, ) { net.minecraft.client.gl.Framebuffer.resize(width,height); }
public void blitToScreen() { wrapperContained.blitToScreen(); }
// public static void blitToScreen() { net.minecraft.client.gl.Framebuffer.blitToScreen(); }
public void delete() { wrapperContained.delete(); }
// public static void delete() { net.minecraft.client.gl.Framebuffer.delete(); }
public void copyDepthFrom(yarnwrap.client.gl.Framebuffer framebuffer) { wrapperContained.copyDepthFrom(framebuffer.wrapperContained); }
// public static void copyDepthFrom(yarnwrap.client.gl.Framebuffer framebuffer, ) { net.minecraft.client.gl.Framebuffer.copyDepthFrom(framebuffer.wrapperContained); }
public com.mojang.blaze3d.textures.GpuTexture getColorAttachment() { return wrapperContained.getColorAttachment(); }
// public static com.mojang.blaze3d.textures.GpuTexture getColorAttachment() { return net.minecraft.client.gl.Framebuffer.getColorAttachment(); }
public com.mojang.blaze3d.textures.GpuTexture getDepthAttachment() { return wrapperContained.getDepthAttachment(); }
// public static com.mojang.blaze3d.textures.GpuTexture getDepthAttachment() { return net.minecraft.client.gl.Framebuffer.getDepthAttachment(); }
public void setFilter(com.mojang.blaze3d.textures.FilterMode filter) { wrapperContained.setFilter(filter); }
// public static void setFilter(com.mojang.blaze3d.textures.FilterMode filter, ) { net.minecraft.client.gl.Framebuffer.setFilter(filter); }
// public void drawBlit(com.mojang.blaze3d.textures.GpuTextureView texture) { wrapperContained.drawBlit(texture); }
// // public static void drawBlit(com.mojang.blaze3d.textures.GpuTextureView texture, ) { net.minecraft.client.gl.Framebuffer.drawBlit(texture); }
// // public com.mojang.blaze3d.textures.GpuTextureView getColorAttachmentView() { return wrapperContained.getColorAttachmentView(); }
// // public static com.mojang.blaze3d.textures.GpuTextureView getColorAttachmentView() { return net.minecraft.client.gl.Framebuffer.getColorAttachmentView(); }
// // public com.mojang.blaze3d.textures.GpuTextureView getDepthAttachmentView() { return wrapperContained.getDepthAttachmentView(); }
// // public static com.mojang.blaze3d.textures.GpuTextureView getDepthAttachmentView() { return net.minecraft.client.gl.Framebuffer.getDepthAttachmentView(); }

}