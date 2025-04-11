package yarnwrap.client.util;
public class Monitor { public net.minecraft.client.util.Monitor wrapperContained; public Monitor(net.minecraft.client.util.Monitor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List videoModes() { return wrapperContained.videoModes; }
// public void videoModes(java.util.List value) { wrapperContained.videoModes = value; }
// public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
// public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public long handle() { return wrapperContained.handle; }
// public void handle(long value) { wrapperContained.handle = value; }
// public yarnwrap.client.util.VideoMode currentVideoMode() { return new yarnwrap.client.util.VideoMode(wrapperContained.currentVideoMode); }
// public void currentVideoMode(yarnwrap.client.util.VideoMode value) { wrapperContained.currentVideoMode = value.wrapperContained; }
public yarnwrap.client.util.VideoMode findClosestVideoMode(java.util.Optional videoMode) { return new yarnwrap.client.util.VideoMode(wrapperContained.findClosestVideoMode(videoMode)); }
public void populateVideoModes() { wrapperContained.populateVideoModes(); }
public int getViewportX() { return wrapperContained.getViewportX(); }
public yarnwrap.client.util.VideoMode getCurrentVideoMode() { return new yarnwrap.client.util.VideoMode(wrapperContained.getCurrentVideoMode()); }
public int getViewportY() { return wrapperContained.getViewportY(); }
public int findClosestVideoModeIndex(yarnwrap.client.util.VideoMode videoMode) { return wrapperContained.findClosestVideoModeIndex(videoMode.wrapperContained); }
public yarnwrap.client.util.VideoMode getVideoMode(int index) { return new yarnwrap.client.util.VideoMode(wrapperContained.getVideoMode(index)); }
public int getVideoModeCount() { return wrapperContained.getVideoModeCount(); }
public long getHandle() { return wrapperContained.getHandle(); }

}