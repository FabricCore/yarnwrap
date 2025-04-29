package yarnwrap.client;
public class WindowEventHandler { public net.minecraft.client.WindowEventHandler wrapperContained; public WindowEventHandler(net.minecraft.client.WindowEventHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public void onResolutionChanged() { wrapperContained.onResolutionChanged(); }
// public static void onResolutionChanged() { net.minecraft.client.WindowEventHandler.onResolutionChanged(); }
public void onWindowFocusChanged(boolean focused) { wrapperContained.onWindowFocusChanged(focused); }
// public static void onWindowFocusChanged(boolean focused, ) { net.minecraft.client.WindowEventHandler.onWindowFocusChanged(focused); }
public void onCursorEnterChanged() { wrapperContained.onCursorEnterChanged(); }
// public static void onCursorEnterChanged() { net.minecraft.client.WindowEventHandler.onCursorEnterChanged(); }

}