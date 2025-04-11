package yarnwrap;
public class MinecraftVersion { public net.minecraft.MinecraftVersion wrapperContained; public MinecraftVersion(net.minecraft.MinecraftVersion wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public int dataPackVersion() { return wrapperContained.dataPackVersion; }
// public void dataPackVersion(int value) { wrapperContained.dataPackVersion = value; }
// public int protocolVersion() { return wrapperContained.protocolVersion; }
// public void protocolVersion(int value) { wrapperContained.protocolVersion = value; }
// public yarnwrap.SaveVersion saveVersion() { return new yarnwrap.SaveVersion(wrapperContained.saveVersion); }
// public void saveVersion(yarnwrap.SaveVersion value) { wrapperContained.saveVersion = value.wrapperContained; }
// public boolean stable() { return wrapperContained.stable; }
// public void stable(boolean value) { wrapperContained.stable = value; }
// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public java.util.Date buildTime() { return wrapperContained.buildTime; }
// public void buildTime(java.util.Date value) { wrapperContained.buildTime = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public yarnwrap.GameVersion CURRENT() { return new yarnwrap.GameVersion(wrapperContained.CURRENT); }
// public void CURRENT(yarnwrap.GameVersion value) { wrapperContained.CURRENT = value.wrapperContained; }
// public int resourcePackVersion() { return wrapperContained.resourcePackVersion; }
// public void resourcePackVersion(int value) { wrapperContained.resourcePackVersion = value; }
public yarnwrap.GameVersion create() { return new yarnwrap.GameVersion(wrapperContained.create()); }

}