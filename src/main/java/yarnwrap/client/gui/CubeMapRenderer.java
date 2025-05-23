package yarnwrap.client.gui;
public class CubeMapRenderer { public net.minecraft.client.gui.CubeMapRenderer wrapperContained; public CubeMapRenderer(net.minecraft.client.gui.CubeMapRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int FACES_COUNT() { return wrapperContained.FACES_COUNT; }
// public void FACES_COUNT(int value) { wrapperContained.FACES_COUNT = value; }
// public static int FACES_COUNT() { return net.minecraft.client.gui.CubeMapRenderer.FACES_COUNT; }
// public static void FACES_COUNT(int value, ) { net.minecraft.client.gui.CubeMapRenderer.FACES_COUNT = value; }

// public com.mojang.blaze3d.buffers.GpuBuffer buffer() { return wrapperContained.buffer; }
// public void buffer(com.mojang.blaze3d.buffers.GpuBuffer value) { wrapperContained.buffer = value; }
// public static com.mojang.blaze3d.buffers.GpuBuffer buffer() { return net.minecraft.client.gui.CubeMapRenderer.buffer; }
// public static void buffer(com.mojang.blaze3d.buffers.GpuBuffer value, ) { net.minecraft.client.gui.CubeMapRenderer.buffer = value; }

// public yarnwrap.client.render.ProjectionMatrix3 projectionMatrix() { return new yarnwrap.client.render.ProjectionMatrix3(wrapperContained.projectionMatrix); }
// public void projectionMatrix(yarnwrap.client.render.ProjectionMatrix3 value) { wrapperContained.projectionMatrix = value.wrapperContained; }
// public static yarnwrap.client.render.ProjectionMatrix3 projectionMatrix() { return new yarnwrap.client.render.ProjectionMatrix3(net.minecraft.client.gui.CubeMapRenderer.projectionMatrix); }
// public static void projectionMatrix(yarnwrap.client.render.ProjectionMatrix3 value, ) { net.minecraft.client.gui.CubeMapRenderer.projectionMatrix = value.wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.CubeMapRenderer.id); }
// public static void id(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.CubeMapRenderer.id = value.wrapperContained; }

public CubeMapRenderer(yarnwrap.util.Identifier id) { this.wrapperContained = new net.minecraft.client.gui.CubeMapRenderer(id.wrapperContained); }
// public void draw(yarnwrap.client.MinecraftClient client,float x,float y) { wrapperContained.draw(client.wrapperContained,x,y); }
// public static void draw(yarnwrap.client.MinecraftClient client,float x,float y, ) { net.minecraft.client.gui.CubeMapRenderer.draw(client.wrapperContained,x,y); }
public void registerTextures(yarnwrap.client.texture.TextureManager textureManager) { wrapperContained.registerTextures(textureManager.wrapperContained); }
// public static void registerTextures(yarnwrap.client.texture.TextureManager textureManager, ) { net.minecraft.client.gui.CubeMapRenderer.registerTextures(textureManager.wrapperContained); }
// // public com.mojang.blaze3d.buffers.GpuBuffer upload() { return wrapperContained.upload(); }
// // public static com.mojang.blaze3d.buffers.GpuBuffer upload() { return net.minecraft.client.gui.CubeMapRenderer.upload(); }

}