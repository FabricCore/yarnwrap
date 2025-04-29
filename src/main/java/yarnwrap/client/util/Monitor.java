package yarnwrap.client.util;
public class Monitor { public net.minecraft.client.util.Monitor wrapperContained; public Monitor(net.minecraft.client.util.Monitor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List videoModes() { return wrapperContained.videoModes; }
// public void videoModes(java.util.List value) { wrapperContained.videoModes = value; }
// public static java.util.List videoModes() { return net.minecraft.client.util.Monitor.videoModes; }
// public static void videoModes(java.util.List value, ) { net.minecraft.client.util.Monitor.videoModes = value; }

// public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
// public static int y() { return net.minecraft.client.util.Monitor.y; }
// public static void y(int value, ) { net.minecraft.client.util.Monitor.y = value; }

// public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public static int x() { return net.minecraft.client.util.Monitor.x; }
// public static void x(int value, ) { net.minecraft.client.util.Monitor.x = value; }

// public long handle() { return wrapperContained.handle; }
// public void handle(long value) { wrapperContained.handle = value; }
// public static long handle() { return net.minecraft.client.util.Monitor.handle; }
// public static void handle(long value, ) { net.minecraft.client.util.Monitor.handle = value; }

// public yarnwrap.client.util.VideoMode currentVideoMode() { return new yarnwrap.client.util.VideoMode(wrapperContained.currentVideoMode); }
// public void currentVideoMode(yarnwrap.client.util.VideoMode value) { wrapperContained.currentVideoMode = value.wrapperContained; }
// public static yarnwrap.client.util.VideoMode currentVideoMode() { return new yarnwrap.client.util.VideoMode(net.minecraft.client.util.Monitor.currentVideoMode); }
// public static void currentVideoMode(yarnwrap.client.util.VideoMode value, ) { net.minecraft.client.util.Monitor.currentVideoMode = value.wrapperContained; }

public Monitor(long handle) { this.wrapperContained = new net.minecraft.client.util.Monitor(handle); }
public yarnwrap.client.util.VideoMode findClosestVideoMode(java.util.Optional videoMode) { return new yarnwrap.client.util.VideoMode(wrapperContained.findClosestVideoMode(videoMode)); }
// public static yarnwrap.client.util.VideoMode findClosestVideoMode(java.util.Optional videoMode, ) { return new yarnwrap.client.util.VideoMode(net.minecraft.client.util.Monitor.findClosestVideoMode(videoMode)); }
public void populateVideoModes() { wrapperContained.populateVideoModes(); }
// public static void populateVideoModes() { net.minecraft.client.util.Monitor.populateVideoModes(); }
public int getViewportX() { return wrapperContained.getViewportX(); }
// public static int getViewportX() { return net.minecraft.client.util.Monitor.getViewportX(); }
public yarnwrap.client.util.VideoMode getCurrentVideoMode() { return new yarnwrap.client.util.VideoMode(wrapperContained.getCurrentVideoMode()); }
// public static yarnwrap.client.util.VideoMode getCurrentVideoMode() { return new yarnwrap.client.util.VideoMode(net.minecraft.client.util.Monitor.getCurrentVideoMode()); }
public int getViewportY() { return wrapperContained.getViewportY(); }
// public static int getViewportY() { return net.minecraft.client.util.Monitor.getViewportY(); }
public int findClosestVideoModeIndex(yarnwrap.client.util.VideoMode videoMode) { return wrapperContained.findClosestVideoModeIndex(videoMode.wrapperContained); }
// public static int findClosestVideoModeIndex(yarnwrap.client.util.VideoMode videoMode, ) { return net.minecraft.client.util.Monitor.findClosestVideoModeIndex(videoMode.wrapperContained); }
public yarnwrap.client.util.VideoMode getVideoMode(int index) { return new yarnwrap.client.util.VideoMode(wrapperContained.getVideoMode(index)); }
// public static yarnwrap.client.util.VideoMode getVideoMode(int index, ) { return new yarnwrap.client.util.VideoMode(net.minecraft.client.util.Monitor.getVideoMode(index)); }
public int getVideoModeCount() { return wrapperContained.getVideoModeCount(); }
// public static int getVideoModeCount() { return net.minecraft.client.util.Monitor.getVideoModeCount(); }
public long getHandle() { return wrapperContained.getHandle(); }
// public static long getHandle() { return net.minecraft.client.util.Monitor.getHandle(); }

}