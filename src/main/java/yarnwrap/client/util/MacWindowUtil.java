package yarnwrap.client.util;
public class MacWindowUtil { public net.minecraft.client.util.MacWindowUtil wrapperContained; public MacWindowUtil(net.minecraft.client.util.MacWindowUtil wrapperContained) { this.wrapperContained = wrapperContained; }

// public int FULLSCREEN_MASK() { return wrapperContained.FULLSCREEN_MASK; }
// public void FULLSCREEN_MASK(int value) { wrapperContained.FULLSCREEN_MASK = value; }
// public void toggleFullscreen(long handle) { wrapperContained.toggleFullscreen(handle); }
// public boolean isFullscreen(ca.weblite.objc.NSObject handle) { return wrapperContained.isFullscreen(handle); }
// public java.util.Optional getCocoaWindow(long handle) { return wrapperContained.getCocoaWindow(handle); }
// public void toggleFullscreen(ca.weblite.objc.NSObject handle) { wrapperContained.toggleFullscreen(handle); }
// public void setApplicationIconImage(yarnwrap.resource.InputSupplier iconSupplier) { wrapperContained.setApplicationIconImage(iconSupplier.wrapperContained); }
public void fixStyleMask(long handle) { wrapperContained.fixStyleMask(handle); }
// public long getStyleMask(ca.weblite.objc.NSObject handle) { return wrapperContained.getStyleMask(handle); }
// public void method_54103(ca.weblite.objc.NSObject windowHandle) { wrapperContained.method_54103(windowHandle); }

}