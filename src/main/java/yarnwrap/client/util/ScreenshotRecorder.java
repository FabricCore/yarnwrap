package yarnwrap.client.util;
public class ScreenshotRecorder { public net.minecraft.client.util.ScreenshotRecorder wrapperContained; public ScreenshotRecorder(net.minecraft.client.util.ScreenshotRecorder wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int unitHeight() { return wrapperContained.unitHeight; }
// public void unitHeight(int value) { wrapperContained.unitHeight = value; }
// public java.io.DataOutputStream stream() { return wrapperContained.stream; }
// public void stream(java.io.DataOutputStream value) { wrapperContained.stream = value; }
// public byte[] buffer() { return wrapperContained.buffer; }
// public void buffer(byte[] value) { wrapperContained.buffer = value; }
// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public java.io.File file() { return wrapperContained.file; }
// public void file(java.io.File value) { wrapperContained.file = value; }
public java.lang.String SCREENSHOTS_DIRECTORY() { return wrapperContained.SCREENSHOTS_DIRECTORY; }
// public void SCREENSHOTS_DIRECTORY(java.lang.String value) { wrapperContained.SCREENSHOTS_DIRECTORY = value; }
public void saveScreenshot(java.io.File gameDirectory,yarnwrap.client.gl.Framebuffer framebuffer,java.util.function.Consumer messageReceiver) { wrapperContained.saveScreenshot(gameDirectory,framebuffer.wrapperContained,messageReceiver); }
// public java.io.File getScreenshotFilename(java.io.File directory) { return wrapperContained.getScreenshotFilename(directory); }
// public void saveScreenshotInner(java.io.File gameDirectory,java.lang.String fileName,yarnwrap.client.gl.Framebuffer framebuffer,java.util.function.Consumer messageReceiver) { wrapperContained.saveScreenshotInner(gameDirectory,fileName,framebuffer.wrapperContained,messageReceiver); }
public yarnwrap.client.texture.NativeImage takeScreenshot(yarnwrap.client.gl.Framebuffer framebuffer) { return new yarnwrap.client.texture.NativeImage(wrapperContained.takeScreenshot(framebuffer.wrapperContained)); }
public void saveScreenshot(java.io.File gameDirectory,java.lang.String fileName,yarnwrap.client.gl.Framebuffer framebuffer,java.util.function.Consumer messageReceiver) { wrapperContained.saveScreenshot(gameDirectory,fileName,framebuffer.wrapperContained,messageReceiver); }
// public void writeToStream() { wrapperContained.writeToStream(); }
public void getIntoBuffer(java.nio.ByteBuffer data,int startWidth,int startHeight,int unitWidth,int unitHeight) { wrapperContained.getIntoBuffer(data,startWidth,startHeight,unitWidth,unitHeight); }
// public java.io.File finish() { return wrapperContained.finish(); }

}