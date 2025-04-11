package yarnwrap.world.level.storage;
public class SaveVersionInfo { public net.minecraft.world.level.storage.SaveVersionInfo wrapperContained; public SaveVersionInfo(net.minecraft.world.level.storage.SaveVersionInfo wrapperContained) { this.wrapperContained = wrapperContained; }

// public int levelFormatVersion() { return wrapperContained.levelFormatVersion; }
// public void levelFormatVersion(int value) { wrapperContained.levelFormatVersion = value; }
// public long lastPlayed() { return wrapperContained.lastPlayed; }
// public void lastPlayed(long value) { wrapperContained.lastPlayed = value; }
// public java.lang.String versionName() { return wrapperContained.versionName; }
// public void versionName(java.lang.String value) { wrapperContained.versionName = value; }
// public yarnwrap.SaveVersion version() { return new yarnwrap.SaveVersion(wrapperContained.version); }
// public void version(yarnwrap.SaveVersion value) { wrapperContained.version = value.wrapperContained; }
// public boolean stable() { return wrapperContained.stable; }
// public void stable(boolean value) { wrapperContained.stable = value; }
public int getLevelFormatVersion() { return wrapperContained.getLevelFormatVersion(); }
public yarnwrap.world.level.storage.SaveVersionInfo fromDynamic(com.mojang.serialization.Dynamic dynamic) { return new yarnwrap.world.level.storage.SaveVersionInfo(wrapperContained.fromDynamic(dynamic)); }
public long getLastPlayed() { return wrapperContained.getLastPlayed(); }
public java.lang.String getVersionName() { return wrapperContained.getVersionName(); }
public yarnwrap.SaveVersion getVersion() { return new yarnwrap.SaveVersion(wrapperContained.getVersion()); }
public boolean isStable() { return wrapperContained.isStable(); }

}