package yarnwrap.client.util;
public class Monitor { public net.minecraft.client.util.Monitor wrapperContained; public Monitor(net.minecraft.client.util.Monitor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List videoModes() { return wrapperContained.videoModes; }
// public int y() { return wrapperContained.y; }
// public int x() { return wrapperContained.x; }
// public long handle() { return wrapperContained.handle; }
// public yarnwrap.client.util.VideoMode currentVideoMode() { return new yarnwrap.client.util.VideoMode(wrapperContained.currentVideoMode); }
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