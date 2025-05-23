package yarnwrap.client.util;
public class ScreenshotRecorder { public net.minecraft.client.util.ScreenshotRecorder wrapperContained; public ScreenshotRecorder(net.minecraft.client.util.ScreenshotRecorder wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.util.ScreenshotRecorder.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.util.ScreenshotRecorder.LOGGER = value; }

// public java.lang.String SCREENSHOTS_DIRECTORY() { return wrapperContained.SCREENSHOTS_DIRECTORY; }
// public void SCREENSHOTS_DIRECTORY(java.lang.String value) { wrapperContained.SCREENSHOTS_DIRECTORY = value; }
public static java.lang.String SCREENSHOTS_DIRECTORY() { return net.minecraft.client.util.ScreenshotRecorder.SCREENSHOTS_DIRECTORY; }
// public static void SCREENSHOTS_DIRECTORY(java.lang.String value, ) { net.minecraft.client.util.ScreenshotRecorder.SCREENSHOTS_DIRECTORY = value; }

// public void saveScreenshot(java.io.File gameDirectory,yarnwrap.client.gl.Framebuffer framebuffer,java.util.function.Consumer messageReceiver) { wrapperContained.saveScreenshot(gameDirectory,framebuffer.wrapperContained,messageReceiver); }
// public static void saveScreenshot(java.io.File gameDirectory,yarnwrap.client.gl.Framebuffer framebuffer,java.util.function.Consumer messageReceiver, ) { net.minecraft.client.util.ScreenshotRecorder.saveScreenshot(gameDirectory,framebuffer.wrapperContained,messageReceiver); }
// public java.io.File getScreenshotFilename(java.io.File directory) { return wrapperContained.getScreenshotFilename(directory); }
// public static java.io.File getScreenshotFilename(java.io.File directory, ) { return net.minecraft.client.util.ScreenshotRecorder.getScreenshotFilename(directory); }
// public void takeScreenshot(yarnwrap.client.gl.Framebuffer framebuffer,java.util.function.Consumer callback) { wrapperContained.takeScreenshot(framebuffer.wrapperContained,callback); }
// public static void takeScreenshot(yarnwrap.client.gl.Framebuffer framebuffer,java.util.function.Consumer callback, ) { net.minecraft.client.util.ScreenshotRecorder.takeScreenshot(framebuffer.wrapperContained,callback); }
// public void saveScreenshot(java.io.File gameDirectory,java.lang.String fileName,yarnwrap.client.gl.Framebuffer framebuffer,int downscaleFactor,java.util.function.Consumer messageReceiver) { wrapperContained.saveScreenshot(gameDirectory,fileName,framebuffer.wrapperContained,downscaleFactor,messageReceiver); }
// public static void saveScreenshot(java.io.File gameDirectory,java.lang.String fileName,yarnwrap.client.gl.Framebuffer framebuffer,int downscaleFactor,java.util.function.Consumer messageReceiver, ) { net.minecraft.client.util.ScreenshotRecorder.saveScreenshot(gameDirectory,fileName,framebuffer.wrapperContained,downscaleFactor,messageReceiver); }
// public yarnwrap.text.Style method_67805(java.io.File style) { return new yarnwrap.text.Style(wrapperContained.method_67805(style)); }
// public static yarnwrap.text.Style method_67805(java.io.File style, ) { return new yarnwrap.text.Style(net.minecraft.client.util.ScreenshotRecorder.method_67805(style)); }
// public void method_68157(java.io.File image) { wrapperContained.method_68157(image); }
// public static void method_68157(java.io.File image, ) { net.minecraft.client.util.ScreenshotRecorder.method_68157(image); }
// public void takeScreenshot(yarnwrap.client.gl.Framebuffer framebuffer,int downscaleFactor,java.util.function.Consumer callback) { wrapperContained.takeScreenshot(framebuffer.wrapperContained,downscaleFactor,callback); }
// public static void takeScreenshot(yarnwrap.client.gl.Framebuffer framebuffer,int downscaleFactor,java.util.function.Consumer callback, ) { net.minecraft.client.util.ScreenshotRecorder.takeScreenshot(framebuffer.wrapperContained,downscaleFactor,callback); }

}