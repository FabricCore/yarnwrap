package yarnwrap.client;
public class WindowSettings { public net.minecraft.client.WindowSettings wrapperContained; public WindowSettings(net.minecraft.client.WindowSettings wrapperContained) { this.wrapperContained = wrapperContained; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.client.WindowSettings.width; }
// public static void width(int value, ) { net.minecraft.client.WindowSettings.width = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.client.WindowSettings.height; }
// public static void height(int value, ) { net.minecraft.client.WindowSettings.height = value; }

// public java.util.OptionalInt fullscreenWidth() { return wrapperContained.fullscreenWidth; }
// public void fullscreenWidth(java.util.OptionalInt value) { wrapperContained.fullscreenWidth = value; }
// public static java.util.OptionalInt fullscreenWidth() { return net.minecraft.client.WindowSettings.fullscreenWidth; }
// public static void fullscreenWidth(java.util.OptionalInt value, ) { net.minecraft.client.WindowSettings.fullscreenWidth = value; }

// public java.util.OptionalInt fullscreenHeight() { return wrapperContained.fullscreenHeight; }
// public void fullscreenHeight(java.util.OptionalInt value) { wrapperContained.fullscreenHeight = value; }
// public static java.util.OptionalInt fullscreenHeight() { return net.minecraft.client.WindowSettings.fullscreenHeight; }
// public static void fullscreenHeight(java.util.OptionalInt value, ) { net.minecraft.client.WindowSettings.fullscreenHeight = value; }

// public boolean fullscreen() { return wrapperContained.fullscreen; }
// public void fullscreen(boolean value) { wrapperContained.fullscreen = value; }
// public static boolean fullscreen() { return net.minecraft.client.WindowSettings.fullscreen; }
// public static void fullscreen(boolean value, ) { net.minecraft.client.WindowSettings.fullscreen = value; }

public WindowSettings(int width,int height,java.util.OptionalInt fullscreenWidth,java.util.OptionalInt fullscreenHeight,boolean fullscreen) { this.wrapperContained = new net.minecraft.client.WindowSettings(width,height,fullscreenWidth,fullscreenHeight,fullscreen); }
// public int width() { return wrapperContained.width(); }
// // public static int width() { return net.minecraft.client.WindowSettings.width(); }
// public int height() { return wrapperContained.height(); }
// // public static int height() { return net.minecraft.client.WindowSettings.height(); }
// public java.util.OptionalInt fullscreenWidth() { return wrapperContained.fullscreenWidth(); }
// // public static java.util.OptionalInt fullscreenWidth() { return net.minecraft.client.WindowSettings.fullscreenWidth(); }
// public java.util.OptionalInt fullscreenHeight() { return wrapperContained.fullscreenHeight(); }
// // public static java.util.OptionalInt fullscreenHeight() { return net.minecraft.client.WindowSettings.fullscreenHeight(); }
// public boolean fullscreen() { return wrapperContained.fullscreen(); }
// // public static boolean fullscreen() { return net.minecraft.client.WindowSettings.fullscreen(); }
public yarnwrap.client.WindowSettings withDimensions(int width,int height) { return new yarnwrap.client.WindowSettings(wrapperContained.withDimensions(width,height)); }
// public static yarnwrap.client.WindowSettings withDimensions(int width,int height, ) { return new yarnwrap.client.WindowSettings(net.minecraft.client.WindowSettings.withDimensions(width,height)); }
public yarnwrap.client.WindowSettings withFullscreen(boolean fullscreen) { return new yarnwrap.client.WindowSettings(wrapperContained.withFullscreen(fullscreen)); }
// public static yarnwrap.client.WindowSettings withFullscreen(boolean fullscreen, ) { return new yarnwrap.client.WindowSettings(net.minecraft.client.WindowSettings.withFullscreen(fullscreen)); }

}