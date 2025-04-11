package yarnwrap.client.util;
public class Window { public net.minecraft.client.util.Window wrapperContained; public Window(net.minecraft.client.util.Window wrapperContained) { this.wrapperContained = wrapperContained; }

// public int framerateLimit() { return wrapperContained.framerateLimit; }
// public void framerateLimit(int value) { wrapperContained.framerateLimit = value; }
// public boolean vsync() { return wrapperContained.vsync; }
// public void vsync(boolean value) { wrapperContained.vsync = value; }
// public int windowedWidth() { return wrapperContained.windowedWidth; }
// public void windowedWidth(int value) { wrapperContained.windowedWidth = value; }
// public int windowedX() { return wrapperContained.windowedX; }
// public void windowedX(int value) { wrapperContained.windowedX = value; }
// public yarnwrap.client.WindowEventHandler eventHandler() { return new yarnwrap.client.WindowEventHandler(wrapperContained.eventHandler); }
// public void eventHandler(yarnwrap.client.WindowEventHandler value) { wrapperContained.eventHandler = value.wrapperContained; }
// public boolean currentFullscreen() { return wrapperContained.currentFullscreen; }
// public void currentFullscreen(boolean value) { wrapperContained.currentFullscreen = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public double scaleFactor() { return wrapperContained.scaleFactor; }
// public void scaleFactor(double value) { wrapperContained.scaleFactor = value; }
// public int scaledWidth() { return wrapperContained.scaledWidth; }
// public void scaledWidth(int value) { wrapperContained.scaledWidth = value; }
// public int framebufferWidth() { return wrapperContained.framebufferWidth; }
// public void framebufferWidth(int value) { wrapperContained.framebufferWidth = value; }
// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public int windowedHeight() { return wrapperContained.windowedHeight; }
// public void windowedHeight(int value) { wrapperContained.windowedHeight = value; }
// public int windowedY() { return wrapperContained.windowedY; }
// public void windowedY(int value) { wrapperContained.windowedY = value; }
// public boolean fullscreenVideoModeDirty() { return wrapperContained.fullscreenVideoModeDirty; }
// public void fullscreenVideoModeDirty(boolean value) { wrapperContained.fullscreenVideoModeDirty = value; }
// public long handle() { return wrapperContained.handle; }
// public void handle(long value) { wrapperContained.handle = value; }
// public org.lwjgl.glfw.GLFWErrorCallback errorCallback() { return wrapperContained.errorCallback; }
// public void errorCallback(org.lwjgl.glfw.GLFWErrorCallback value) { wrapperContained.errorCallback = value; }
// public boolean fullscreen() { return wrapperContained.fullscreen; }
// public void fullscreen(boolean value) { wrapperContained.fullscreen = value; }
// public java.lang.String phase() { return wrapperContained.phase; }
// public void phase(java.lang.String value) { wrapperContained.phase = value; }
// public java.util.Optional fullscreenVideoMode() { return wrapperContained.fullscreenVideoMode; }
// public void fullscreenVideoMode(java.util.Optional value) { wrapperContained.fullscreenVideoMode = value; }
// public int scaledHeight() { return wrapperContained.scaledHeight; }
// public void scaledHeight(int value) { wrapperContained.scaledHeight = value; }
// public yarnwrap.client.util.MonitorTracker monitorTracker() { return new yarnwrap.client.util.MonitorTracker(wrapperContained.monitorTracker); }
// public void monitorTracker(yarnwrap.client.util.MonitorTracker value) { wrapperContained.monitorTracker = value.wrapperContained; }
// public int framebufferHeight() { return wrapperContained.framebufferHeight; }
// public void framebufferHeight(int value) { wrapperContained.framebufferHeight = value; }
// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
public Window(yarnwrap.client.WindowEventHandler eventHandler,yarnwrap.client.util.MonitorTracker monitorTracker,yarnwrap.client.WindowSettings settings,java.lang.String fullscreenVideoMode,java.lang.String title) { this.wrapperContained = new net.minecraft.client.util.Window(eventHandler.wrapperContained,monitorTracker.wrapperContained,settings.wrapperContained,fullscreenVideoMode,title); }
public void setScaleFactor(double scaleFactor) { wrapperContained.setScaleFactor(scaleFactor); }
public void swapBuffers() { wrapperContained.swapBuffers(); }
public void setFramerateLimit(int framerateLimit) { wrapperContained.setFramerateLimit(framerateLimit); }
public int getFramerateLimit() { return wrapperContained.getFramerateLimit(); }
public yarnwrap.client.util.Monitor getMonitor() { return new yarnwrap.client.util.Monitor(wrapperContained.getMonitor()); }
public void setRawMouseMotion(boolean rawMouseMotion) { wrapperContained.setRawMouseMotion(rawMouseMotion); }
public int getRefreshRate() { return wrapperContained.getRefreshRate(); }
public boolean shouldClose() { return wrapperContained.shouldClose(); }
public void setTitle(java.lang.String title) { wrapperContained.setTitle(title); }
// public void onCursorEnterChanged(long window,boolean entered) { wrapperContained.onCursorEnterChanged(window,entered); }
public void setFramebufferWidth(int framebufferWidth) { wrapperContained.setFramebufferWidth(framebufferWidth); }
public void setFramebufferHeight(int framebufferHeight) { wrapperContained.setFramebufferHeight(framebufferHeight); }
public void setWindowedSize(int width,int height) { wrapperContained.setWindowedSize(width,height); }
public void setPhase(java.lang.String phase) { wrapperContained.setPhase(phase); }
public void applyFullscreenVideoMode() { wrapperContained.applyFullscreenVideoMode(); }
public int calculateScaleFactor(int guiScale,boolean forceUnicodeFont) { return wrapperContained.calculateScaleFactor(guiScale,forceUnicodeFont); }
public int getY() { return wrapperContained.getY(); }
// public void onWindowPosChanged(long window,int x,int y) { wrapperContained.onWindowPosChanged(window,x,y); }
// public void updateWindowRegion() { wrapperContained.updateWindowRegion(); }
public int getWidth() { return wrapperContained.getWidth(); }
// public void throwOnGlError() { wrapperContained.throwOnGlError(); }
public void logGlError(int error,long description) { wrapperContained.logGlError(error,description); }
// public void updateFramebufferSize() { wrapperContained.updateFramebufferSize(); }
// public void updateFullscreen(boolean vsync) { wrapperContained.updateFullscreen(vsync); }
public int getScaledWidth() { return wrapperContained.getScaledWidth(); }
// public void onWindowSizeChanged(long window,int width,int height) { wrapperContained.onWindowSizeChanged(window,width,height); }
public int getFramebufferWidth() { return wrapperContained.getFramebufferWidth(); }
public long getHandle() { return wrapperContained.getHandle(); }
// public void setIcon(yarnwrap.resource.ResourcePack resourcePack,yarnwrap.client.util.Icons icons) { wrapperContained.setIcon(resourcePack.wrapperContained,icons.wrapperContained); }
public void acceptError(java.util.function.BiConsumer consumer) { wrapperContained.acceptError(consumer); }
// public void onWindowFocusChanged(long window,boolean focused) { wrapperContained.onWindowFocusChanged(window,focused); }
public double getScaleFactor() { return wrapperContained.getScaleFactor(); }
public void setVsync(boolean vsync) { wrapperContained.setVsync(vsync); }
public boolean isFullscreen() { return wrapperContained.isFullscreen(); }
public int getX() { return wrapperContained.getX(); }
public void toggleFullscreen() { wrapperContained.toggleFullscreen(); }
// public void throwGlError(int error,long description) { wrapperContained.throwGlError(error,description); }
public int getScaledHeight() { return wrapperContained.getScaledHeight(); }
// public void onFramebufferSizeChanged(long window,int width,int height) { wrapperContained.onFramebufferSizeChanged(window,width,height); }
public void setFullscreenVideoMode(java.util.Optional fullscreenVideoMode) { wrapperContained.setFullscreenVideoMode(fullscreenVideoMode); }
public int getFramebufferHeight() { return wrapperContained.getFramebufferHeight(); }
public int getHeight() { return wrapperContained.getHeight(); }
public java.util.Optional getFullscreenVideoMode() { return wrapperContained.getFullscreenVideoMode(); }
public void logOnGlError() { wrapperContained.logOnGlError(); }
public java.lang.String getGlfwPlatform() { return wrapperContained.getGlfwPlatform(); }

}