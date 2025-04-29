package yarnwrap.client.resource;
public class ResourceReloadLogger { public net.minecraft.client.resource.ResourceReloadLogger wrapperContained; public ResourceReloadLogger(net.minecraft.client.resource.ResourceReloadLogger wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.resource.ResourceReloadLogger.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.resource.ResourceReloadLogger.LOGGER = value; }

// public Object reloadState() { return wrapperContained.reloadState; }
// // public void reloadState(Object value) { wrapperContained.reloadState = value; }
// // public static Object reloadState() { return net.minecraft.client.resource.ResourceReloadLogger.reloadState; }
// // public static void reloadState(Object value, ) { net.minecraft.client.resource.ResourceReloadLogger.reloadState = value; }

// public int reloadCount() { return wrapperContained.reloadCount; }
// public void reloadCount(int value) { wrapperContained.reloadCount = value; }
// public static int reloadCount() { return net.minecraft.client.resource.ResourceReloadLogger.reloadCount; }
// public static void reloadCount(int value, ) { net.minecraft.client.resource.ResourceReloadLogger.reloadCount = value; }

public void finish() { wrapperContained.finish(); }
// public static void finish() { net.minecraft.client.resource.ResourceReloadLogger.finish(); }
// public void reload(Object reason,java.util.List packs) { wrapperContained.reload(reason,packs); }
// public static void reload(Object reason,java.util.List packs, ) { net.minecraft.client.resource.ResourceReloadLogger.reload(reason,packs); }
public void recover(java.lang.Throwable throwable) { wrapperContained.recover(throwable); }
// public static void recover(java.lang.Throwable throwable, ) { net.minecraft.client.resource.ResourceReloadLogger.recover(throwable); }
public void addReloadSection(yarnwrap.util.crash.CrashReport report) { wrapperContained.addReloadSection(report.wrapperContained); }
// public static void addReloadSection(yarnwrap.util.crash.CrashReport report, ) { net.minecraft.client.resource.ResourceReloadLogger.addReloadSection(report.wrapperContained); }

}