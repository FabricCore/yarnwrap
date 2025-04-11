package yarnwrap.client;
public class WindowSettings { public net.minecraft.client.WindowSettings wrapperContained; public WindowSettings(net.minecraft.client.WindowSettings wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.OptionalInt fullscreenWidth() { return wrapperContained.fullscreenWidth; }
// public void fullscreenWidth(java.util.OptionalInt value) { wrapperContained.fullscreenWidth = value; }
public boolean fullscreen() { return wrapperContained.fullscreen; }
// public void fullscreen(boolean value) { wrapperContained.fullscreen = value; }
public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
public java.util.OptionalInt fullscreenHeight() { return wrapperContained.fullscreenHeight; }
// public void fullscreenHeight(java.util.OptionalInt value) { wrapperContained.fullscreenHeight = value; }
public WindowSettings(int width,int height,java.util.OptionalInt fullscreenWidth,java.util.OptionalInt fullscreenHeight,boolean fullscreen) { this.wrapperContained = new net.minecraft.client.WindowSettings(width,height,fullscreenWidth,fullscreenHeight,fullscreen); }

}