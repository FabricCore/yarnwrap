package yarnwrap.client.resource;
public class ResourceReloadLogger { public net.minecraft.client.resource.ResourceReloadLogger wrapperContained; public ResourceReloadLogger(net.minecraft.client.resource.ResourceReloadLogger wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public Object reloadState() { return wrapperContained.reloadState; }
// // public void reloadState(Object value) { wrapperContained.reloadState = value; }
// public int reloadCount() { return wrapperContained.reloadCount; }
// public void reloadCount(int value) { wrapperContained.reloadCount = value; }
public void finish() { wrapperContained.finish(); }
// public void reload(Object reason,java.util.List packs) { wrapperContained.reload(reason,packs); }
public void recover(java.lang.Throwable throwable) { wrapperContained.recover(throwable); }
public void addReloadSection(yarnwrap.util.crash.CrashReport report) { wrapperContained.addReloadSection(report.wrapperContained); }

}