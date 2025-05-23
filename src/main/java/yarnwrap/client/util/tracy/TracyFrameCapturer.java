package yarnwrap.client.util.tracy;
public class TracyFrameCapturer { public net.minecraft.client.util.tracy.TracyFrameCapturer wrapperContained; public TracyFrameCapturer(net.minecraft.client.util.tracy.TracyFrameCapturer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_WIDTH() { return wrapperContained.MAX_WIDTH; }
// public void MAX_WIDTH(int value) { wrapperContained.MAX_WIDTH = value; }
// public static int MAX_WIDTH() { return net.minecraft.client.util.tracy.TracyFrameCapturer.MAX_WIDTH; }
// public static void MAX_WIDTH(int value, ) { net.minecraft.client.util.tracy.TracyFrameCapturer.MAX_WIDTH = value; }

// public int MAX_HEIGHT() { return wrapperContained.MAX_HEIGHT; }
// public void MAX_HEIGHT(int value) { wrapperContained.MAX_HEIGHT = value; }
// public static int MAX_HEIGHT() { return net.minecraft.client.util.tracy.TracyFrameCapturer.MAX_HEIGHT; }
// public static void MAX_HEIGHT(int value, ) { net.minecraft.client.util.tracy.TracyFrameCapturer.MAX_HEIGHT = value; }

// public int framebufferWidth() { return wrapperContained.framebufferWidth; }
// public void framebufferWidth(int value) { wrapperContained.framebufferWidth = value; }
// public static int framebufferWidth() { return net.minecraft.client.util.tracy.TracyFrameCapturer.framebufferWidth; }
// public static void framebufferWidth(int value, ) { net.minecraft.client.util.tracy.TracyFrameCapturer.framebufferWidth = value; }

// public int framebufferHeight() { return wrapperContained.framebufferHeight; }
// public void framebufferHeight(int value) { wrapperContained.framebufferHeight = value; }
// public static int framebufferHeight() { return net.minecraft.client.util.tracy.TracyFrameCapturer.framebufferHeight; }
// public static void framebufferHeight(int value, ) { net.minecraft.client.util.tracy.TracyFrameCapturer.framebufferHeight = value; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.client.util.tracy.TracyFrameCapturer.width; }
// public static void width(int value, ) { net.minecraft.client.util.tracy.TracyFrameCapturer.width = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.client.util.tracy.TracyFrameCapturer.height; }
// public static void height(int value, ) { net.minecraft.client.util.tracy.TracyFrameCapturer.height = value; }

// public com.mojang.blaze3d.textures.GpuTexture texture() { return wrapperContained.texture; }
// public void texture(com.mojang.blaze3d.textures.GpuTexture value) { wrapperContained.texture = value; }
// public static com.mojang.blaze3d.textures.GpuTexture texture() { return net.minecraft.client.util.tracy.TracyFrameCapturer.texture; }
// public static void texture(com.mojang.blaze3d.textures.GpuTexture value, ) { net.minecraft.client.util.tracy.TracyFrameCapturer.texture = value; }

// public com.mojang.blaze3d.buffers.GpuBuffer buffer() { return wrapperContained.buffer; }
// public void buffer(com.mojang.blaze3d.buffers.GpuBuffer value) { wrapperContained.buffer = value; }
// public static com.mojang.blaze3d.buffers.GpuBuffer buffer() { return net.minecraft.client.util.tracy.TracyFrameCapturer.buffer; }
// public static void buffer(com.mojang.blaze3d.buffers.GpuBuffer value, ) { net.minecraft.client.util.tracy.TracyFrameCapturer.buffer = value; }

// public int offset() { return wrapperContained.offset; }
// public void offset(int value) { wrapperContained.offset = value; }
// public static int offset() { return net.minecraft.client.util.tracy.TracyFrameCapturer.offset; }
// public static void offset(int value, ) { net.minecraft.client.util.tracy.TracyFrameCapturer.offset = value; }

// public boolean captured() { return wrapperContained.captured; }
// public void captured(boolean value) { wrapperContained.captured = value; }
// public static boolean captured() { return net.minecraft.client.util.tracy.TracyFrameCapturer.captured; }
// public static void captured(boolean value, ) { net.minecraft.client.util.tracy.TracyFrameCapturer.captured = value; }

// public Object status() { return wrapperContained.status; }
// // public void status(Object value) { wrapperContained.status = value; }
// // public static Object status() { return net.minecraft.client.util.tracy.TracyFrameCapturer.status; }
// // public static void status(Object value, ) { net.minecraft.client.util.tracy.TracyFrameCapturer.status = value; }

// // public com.mojang.blaze3d.textures.GpuTextureView textureView() { return wrapperContained.textureView; }
// // public void textureView(com.mojang.blaze3d.textures.GpuTextureView value) { wrapperContained.textureView = value; }
// // public static com.mojang.blaze3d.textures.GpuTextureView textureView() { return net.minecraft.client.util.tracy.TracyFrameCapturer.textureView; }
// // public static void textureView(com.mojang.blaze3d.textures.GpuTextureView value, ) { net.minecraft.client.util.tracy.TracyFrameCapturer.textureView = value; }

public void upload() { wrapperContained.upload(); }
// public static void upload() { net.minecraft.client.util.tracy.TracyFrameCapturer.upload(); }
// public void resize(int framebufferWidth,int framebufferHeight) { wrapperContained.resize(framebufferWidth,framebufferHeight); }
// public static void resize(int framebufferWidth,int framebufferHeight, ) { net.minecraft.client.util.tracy.TracyFrameCapturer.resize(framebufferWidth,framebufferHeight); }
public void capture(yarnwrap.client.gl.Framebuffer framebuffer) { wrapperContained.capture(framebuffer.wrapperContained); }
// public static void capture(yarnwrap.client.gl.Framebuffer framebuffer, ) { net.minecraft.client.util.tracy.TracyFrameCapturer.capture(framebuffer.wrapperContained); }
public void markFrame() { wrapperContained.markFrame(); }
// public static void markFrame() { net.minecraft.client.util.tracy.TracyFrameCapturer.markFrame(); }

}