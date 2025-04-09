package yarnwrap.world.level.storage;
public class SaveVersionInfo { public net.minecraft.world.level.storage.SaveVersionInfo wrapperContained; public SaveVersionInfo(net.minecraft.world.level.storage.SaveVersionInfo wrapperContained) { this.wrapperContained = wrapperContained; }

// public int levelFormatVersion() { return wrapperContained.levelFormatVersion; }
// public long lastPlayed() { return wrapperContained.lastPlayed; }
// public java.lang.String versionName() { return wrapperContained.versionName; }
// public yarnwrap.SaveVersion version() { return new yarnwrap.SaveVersion(wrapperContained.version); }
// public boolean stable() { return wrapperContained.stable; }
public int getLevelFormatVersion() { return wrapperContained.getLevelFormatVersion(); }
public yarnwrap.world.level.storage.SaveVersionInfo fromDynamic(com.mojang.serialization.Dynamic dynamic) { return new yarnwrap.world.level.storage.SaveVersionInfo(wrapperContained.fromDynamic(dynamic)); }
public long getLastPlayed() { return wrapperContained.getLastPlayed(); }
public java.lang.String getVersionName() { return wrapperContained.getVersionName(); }
public yarnwrap.SaveVersion getVersion() { return new yarnwrap.SaveVersion(wrapperContained.getVersion()); }
public boolean isStable() { return wrapperContained.isStable(); }

}