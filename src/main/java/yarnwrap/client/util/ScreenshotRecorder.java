package yarnwrap.client.util;
public class ScreenshotRecorder { public net.minecraft.client.util.ScreenshotRecorder wrapperContained; public ScreenshotRecorder(net.minecraft.client.util.ScreenshotRecorder wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.util.ScreenshotRecorder.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.util.ScreenshotRecorder.LOGGER = value; }

// public int unitHeight() { return wrapperContained.unitHeight; }
// public void unitHeight(int value) { wrapperContained.unitHeight = value; }
// public static int unitHeight() { return net.minecraft.client.util.ScreenshotRecorder.unitHeight; }
// public static void unitHeight(int value, ) { net.minecraft.client.util.ScreenshotRecorder.unitHeight = value; }

// public java.io.DataOutputStream stream() { return wrapperContained.stream; }
// public void stream(java.io.DataOutputStream value) { wrapperContained.stream = value; }
// public static java.io.DataOutputStream stream() { return net.minecraft.client.util.ScreenshotRecorder.stream; }
// public static void stream(java.io.DataOutputStream value, ) { net.minecraft.client.util.ScreenshotRecorder.stream = value; }

// public byte[] buffer() { return wrapperContained.buffer; }
// public void buffer(byte[] value) { wrapperContained.buffer = value; }
// public static byte[] buffer() { return net.minecraft.client.util.ScreenshotRecorder.buffer; }
// public static void buffer(byte[] value, ) { net.minecraft.client.util.ScreenshotRecorder.buffer = value; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.client.util.ScreenshotRecorder.width; }
// public static void width(int value, ) { net.minecraft.client.util.ScreenshotRecorder.width = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.client.util.ScreenshotRecorder.height; }
// public static void height(int value, ) { net.minecraft.client.util.ScreenshotRecorder.height = value; }

// public java.io.File file() { return wrapperContained.file; }
// public void file(java.io.File value) { wrapperContained.file = value; }
// public static java.io.File file() { return net.minecraft.client.util.ScreenshotRecorder.file; }
// public static void file(java.io.File value, ) { net.minecraft.client.util.ScreenshotRecorder.file = value; }

// public java.lang.String SCREENSHOTS_DIRECTORY() { return wrapperContained.SCREENSHOTS_DIRECTORY; }
// public void SCREENSHOTS_DIRECTORY(java.lang.String value) { wrapperContained.SCREENSHOTS_DIRECTORY = value; }
public static java.lang.String SCREENSHOTS_DIRECTORY() { return net.minecraft.client.util.ScreenshotRecorder.SCREENSHOTS_DIRECTORY; }
// public static void SCREENSHOTS_DIRECTORY(java.lang.String value, ) { net.minecraft.client.util.ScreenshotRecorder.SCREENSHOTS_DIRECTORY = value; }

// public ScreenshotRecorder(java.io.File gameDirectory,int width,int height,int unitHeight) { this.wrapperContained = new net.minecraft.client.util.ScreenshotRecorder(gameDirectory,width,height,unitHeight); }
// public void saveScreenshot(java.io.File gameDirectory,yarnwrap.client.gl.Framebuffer framebuffer,java.util.function.Consumer messageReceiver) { wrapperContained.saveScreenshot(gameDirectory,framebuffer.wrapperContained,messageReceiver); }
// public static void saveScreenshot(java.io.File gameDirectory,yarnwrap.client.gl.Framebuffer framebuffer,java.util.function.Consumer messageReceiver, ) { net.minecraft.client.util.ScreenshotRecorder.saveScreenshot(gameDirectory,framebuffer.wrapperContained,messageReceiver); }
// public java.io.File getScreenshotFilename(java.io.File directory) { return wrapperContained.getScreenshotFilename(directory); }
// public static java.io.File getScreenshotFilename(java.io.File directory, ) { return net.minecraft.client.util.ScreenshotRecorder.getScreenshotFilename(directory); }
// public void saveScreenshotInner(java.io.File gameDirectory,java.lang.String fileName,yarnwrap.client.gl.Framebuffer framebuffer,java.util.function.Consumer messageReceiver) { wrapperContained.saveScreenshotInner(gameDirectory,fileName,framebuffer.wrapperContained,messageReceiver); }
// public static void saveScreenshotInner(java.io.File gameDirectory,java.lang.String fileName,yarnwrap.client.gl.Framebuffer framebuffer,java.util.function.Consumer messageReceiver, ) { net.minecraft.client.util.ScreenshotRecorder.saveScreenshotInner(gameDirectory,fileName,framebuffer.wrapperContained,messageReceiver); }
// public yarnwrap.client.texture.NativeImage takeScreenshot(yarnwrap.client.gl.Framebuffer framebuffer) { return new yarnwrap.client.texture.NativeImage(wrapperContained.takeScreenshot(framebuffer.wrapperContained)); }
// public static yarnwrap.client.texture.NativeImage takeScreenshot(yarnwrap.client.gl.Framebuffer framebuffer, ) { return new yarnwrap.client.texture.NativeImage(net.minecraft.client.util.ScreenshotRecorder.takeScreenshot(framebuffer.wrapperContained)); }
// public yarnwrap.text.Style method_1664(java.io.File style) { return new yarnwrap.text.Style(wrapperContained.method_1664(style)); }
// public static yarnwrap.text.Style method_1664(java.io.File style, ) { return new yarnwrap.text.Style(net.minecraft.client.util.ScreenshotRecorder.method_1664(style)); }
// public void saveScreenshot(java.io.File gameDirectory,java.lang.String fileName,yarnwrap.client.gl.Framebuffer framebuffer,java.util.function.Consumer messageReceiver) { wrapperContained.saveScreenshot(gameDirectory,fileName,framebuffer.wrapperContained,messageReceiver); }
// public static void saveScreenshot(java.io.File gameDirectory,java.lang.String fileName,yarnwrap.client.gl.Framebuffer framebuffer,java.util.function.Consumer messageReceiver, ) { net.minecraft.client.util.ScreenshotRecorder.saveScreenshot(gameDirectory,fileName,framebuffer.wrapperContained,messageReceiver); }
// public void writeToStream() { wrapperContained.writeToStream(); }
// public static void writeToStream() { net.minecraft.client.util.ScreenshotRecorder.writeToStream(); }
public void getIntoBuffer(java.nio.ByteBuffer data,int startWidth,int startHeight,int unitWidth,int unitHeight) { wrapperContained.getIntoBuffer(data,startWidth,startHeight,unitWidth,unitHeight); }
// public static void getIntoBuffer(java.nio.ByteBuffer data,int startWidth,int startHeight,int unitWidth,int unitHeight, ) { net.minecraft.client.util.ScreenshotRecorder.getIntoBuffer(data,startWidth,startHeight,unitWidth,unitHeight); }
// public java.io.File finish() { return wrapperContained.finish(); }
// public static java.io.File finish() { return net.minecraft.client.util.ScreenshotRecorder.finish(); }

}