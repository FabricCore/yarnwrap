package yarnwrap.client.util;
public class WindowProvider { public net.minecraft.client.util.WindowProvider wrapperContained; public WindowProvider(net.minecraft.client.util.WindowProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.util.MonitorTracker monitorTracker() { return new yarnwrap.client.util.MonitorTracker(wrapperContained.monitorTracker); }
// public void monitorTracker(yarnwrap.client.util.MonitorTracker value) { wrapperContained.monitorTracker = value.wrapperContained; }
// public static yarnwrap.client.util.MonitorTracker monitorTracker() { return new yarnwrap.client.util.MonitorTracker(net.minecraft.client.util.WindowProvider.monitorTracker); }
// public static void monitorTracker(yarnwrap.client.util.MonitorTracker value, ) { net.minecraft.client.util.WindowProvider.monitorTracker = value.wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.util.WindowProvider.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.util.WindowProvider.client = value.wrapperContained; }

public WindowProvider(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.util.WindowProvider(client.wrapperContained); }
public yarnwrap.client.util.Window createWindow(yarnwrap.client.WindowSettings settings,java.lang.String videoMode,java.lang.String title) { return new yarnwrap.client.util.Window(wrapperContained.createWindow(settings.wrapperContained,videoMode,title)); }
// public static yarnwrap.client.util.Window createWindow(yarnwrap.client.WindowSettings settings,java.lang.String videoMode,java.lang.String title, ) { return new yarnwrap.client.util.Window(net.minecraft.client.util.WindowProvider.createWindow(settings.wrapperContained,videoMode,title)); }

}