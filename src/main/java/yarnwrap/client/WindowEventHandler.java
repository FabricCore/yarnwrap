package yarnwrap.client;
public class WindowEventHandler { public net.minecraft.client.WindowEventHandler wrapperContained; public WindowEventHandler(net.minecraft.client.WindowEventHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public void onResolutionChanged() { wrapperContained.onResolutionChanged(); }
public void onWindowFocusChanged(boolean focused) { wrapperContained.onWindowFocusChanged(focused); }
public void onCursorEnterChanged() { wrapperContained.onCursorEnterChanged(); }

}