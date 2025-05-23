package yarnwrap.client.util;
public class MonitorTracker { public net.minecraft.client.util.MonitorTracker wrapperContained; public MonitorTracker(net.minecraft.client.util.MonitorTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.util.MonitorFactory monitorFactory() { return new yarnwrap.client.util.MonitorFactory(wrapperContained.monitorFactory); }
// public void monitorFactory(yarnwrap.client.util.MonitorFactory value) { wrapperContained.monitorFactory = value.wrapperContained; }
// public static yarnwrap.client.util.MonitorFactory monitorFactory() { return new yarnwrap.client.util.MonitorFactory(net.minecraft.client.util.MonitorTracker.monitorFactory); }
// public static void monitorFactory(yarnwrap.client.util.MonitorFactory value, ) { net.minecraft.client.util.MonitorTracker.monitorFactory = value.wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap pointerToMonitorMap() { return wrapperContained.pointerToMonitorMap; }
// public void pointerToMonitorMap(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.pointerToMonitorMap = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap pointerToMonitorMap() { return net.minecraft.client.util.MonitorTracker.pointerToMonitorMap; }
// public static void pointerToMonitorMap(it.unimi.dsi.fastutil.longs.Long2ObjectMap value, ) { net.minecraft.client.util.MonitorTracker.pointerToMonitorMap = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.util.MonitorTracker.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.util.MonitorTracker.LOGGER = value; }

public MonitorTracker(yarnwrap.client.util.MonitorFactory monitorFactory) { this.wrapperContained = new net.minecraft.client.util.MonitorTracker(monitorFactory.wrapperContained); }
public yarnwrap.client.util.Monitor getMonitor(long pointer) { return new yarnwrap.client.util.Monitor(wrapperContained.getMonitor(pointer)); }
// public static yarnwrap.client.util.Monitor getMonitor(long pointer, ) { return new yarnwrap.client.util.Monitor(net.minecraft.client.util.MonitorTracker.getMonitor(pointer)); }
public yarnwrap.client.util.Monitor getMonitor(yarnwrap.client.util.Window window) { return new yarnwrap.client.util.Monitor(wrapperContained.getMonitor(window.wrapperContained)); }
// public static yarnwrap.client.util.Monitor getMonitor(yarnwrap.client.util.Window window, ) { return new yarnwrap.client.util.Monitor(net.minecraft.client.util.MonitorTracker.getMonitor(window.wrapperContained)); }
// public void handleMonitorEvent(long monitor,int event) { wrapperContained.handleMonitorEvent(monitor,event); }
// public static void handleMonitorEvent(long monitor,int event, ) { net.minecraft.client.util.MonitorTracker.handleMonitorEvent(monitor,event); }
// public int clamp(int value,int min,int max) { return wrapperContained.clamp(value,min,max); }
// public static int clamp(int value,int min,int max, ) { return net.minecraft.client.util.MonitorTracker.clamp(value,min,max); }
public void stop() { wrapperContained.stop(); }
// public static void stop() { net.minecraft.client.util.MonitorTracker.stop(); }

}