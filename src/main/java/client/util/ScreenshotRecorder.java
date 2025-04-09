package yarnwrap.client.util;
public class ScreenshotRecorder { public net.minecraft.client.util.ScreenshotRecorder wrapperContained; public ScreenshotRecorder(net.minecraft.client.util.ScreenshotRecorder wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int unitHeight() { return wrapperContained.unitHeight; }
// public java.io.DataOutputStream stream() { return wrapperContained.stream; }
// public byte[] buffer() { return wrapperContained.buffer; }
// public int width() { return wrapperContained.width; }
// public int height() { return wrapperContained.height; }
// public java.io.File file() { return wrapperContained.file; }
public java.lang.String SCREENSHOTS_DIRECTORY() { return wrapperContained.SCREENSHOTS_DIRECTORY; }
public void saveScreenshot(java.io.File gameDirectory,yarnwrap.client.gl.Framebuffer framebuffer,java.util.function.Consumer messageReceiver) { wrapperContained.saveScreenshot(gameDirectory,framebuffer.wrapperContained,messageReceiver); }
// public java.io.File getScreenshotFilename(java.io.File directory) { return wrapperContained.getScreenshotFilename(directory); }
// public void saveScreenshotInner(java.io.File gameDirectory,java.lang.String fileName,yarnwrap.client.gl.Framebuffer framebuffer,java.util.function.Consumer messageReceiver) { wrapperContained.saveScreenshotInner(gameDirectory,fileName,framebuffer.wrapperContained,messageReceiver); }
public yarnwrap.client.texture.NativeImage takeScreenshot(yarnwrap.client.gl.Framebuffer framebuffer) { return new yarnwrap.client.texture.NativeImage(wrapperContained.takeScreenshot(framebuffer.wrapperContained)); }
public void saveScreenshot(java.io.File gameDirectory,java.lang.String fileName,yarnwrap.client.gl.Framebuffer framebuffer,java.util.function.Consumer messageReceiver) { wrapperContained.saveScreenshot(gameDirectory,fileName,framebuffer.wrapperContained,messageReceiver); }
// public void writeToStream() { wrapperContained.writeToStream(); }
public void getIntoBuffer(java.nio.ByteBuffer data,int startWidth,int startHeight,int unitWidth,int unitHeight) { wrapperContained.getIntoBuffer(data,startWidth,startHeight,unitWidth,unitHeight); }
// public java.io.File finish() { return wrapperContained.finish(); }

}