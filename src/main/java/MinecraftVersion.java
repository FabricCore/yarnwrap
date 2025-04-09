package yarnwrap;
public class MinecraftVersion { public net.minecraft.MinecraftVersion wrapperContained; public MinecraftVersion(net.minecraft.MinecraftVersion wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public int dataPackVersion() { return wrapperContained.dataPackVersion; }
// public int protocolVersion() { return wrapperContained.protocolVersion; }
// public yarnwrap.SaveVersion saveVersion() { return new yarnwrap.SaveVersion(wrapperContained.saveVersion); }
// public boolean stable() { return wrapperContained.stable; }
// public java.lang.String id() { return wrapperContained.id; }
// public java.util.Date buildTime() { return wrapperContained.buildTime; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.GameVersion CURRENT() { return new yarnwrap.GameVersion(wrapperContained.CURRENT); }
// public int resourcePackVersion() { return wrapperContained.resourcePackVersion; }
public yarnwrap.GameVersion create() { return new yarnwrap.GameVersion(wrapperContained.create()); }

}