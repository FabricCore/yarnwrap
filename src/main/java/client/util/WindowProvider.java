package yarnwrap.client.util;
public class WindowProvider { public net.minecraft.client.util.WindowProvider wrapperContained; public WindowProvider(net.minecraft.client.util.WindowProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.util.MonitorTracker monitorTracker() { return new yarnwrap.client.util.MonitorTracker(wrapperContained.monitorTracker); }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
public yarnwrap.client.util.Window createWindow(yarnwrap.client.WindowSettings settings,java.lang.String videoMode,java.lang.String title) { return new yarnwrap.client.util.Window(wrapperContained.createWindow(settings.wrapperContained,videoMode,title)); }

}