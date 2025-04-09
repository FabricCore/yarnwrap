package yarnwrap.client;
public class WindowSettings { public net.minecraft.client.WindowSettings wrapperContained; public WindowSettings(net.minecraft.client.WindowSettings wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.OptionalInt fullscreenWidth() { return wrapperContained.fullscreenWidth; }
public boolean fullscreen() { return wrapperContained.fullscreen; }
public int height() { return wrapperContained.height; }
public int width() { return wrapperContained.width; }
public java.util.OptionalInt fullscreenHeight() { return wrapperContained.fullscreenHeight; }

}