package yarnwrap.client.util;
public class WindowProvider { public net.minecraft.client.util.WindowProvider wrapperContained; public WindowProvider(net.minecraft.client.util.WindowProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.util.MonitorTracker monitorTracker() { return new yarnwrap.client.util.MonitorTracker(wrapperContained.monitorTracker); }
// public void monitorTracker(yarnwrap.client.util.MonitorTracker value) { wrapperContained.monitorTracker = value.wrapperContained; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
public WindowProvider(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.util.WindowProvider(client.wrapperContained); }
public yarnwrap.client.util.Window createWindow(yarnwrap.client.WindowSettings settings,java.lang.String videoMode,java.lang.String title) { return new yarnwrap.client.util.Window(wrapperContained.createWindow(settings.wrapperContained,videoMode,title)); }

}