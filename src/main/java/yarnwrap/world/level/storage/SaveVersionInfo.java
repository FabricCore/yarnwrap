package yarnwrap.world.level.storage;
public class SaveVersionInfo { public net.minecraft.world.level.storage.SaveVersionInfo wrapperContained; public SaveVersionInfo(net.minecraft.world.level.storage.SaveVersionInfo wrapperContained) { this.wrapperContained = wrapperContained; }

// public int levelFormatVersion() { return wrapperContained.levelFormatVersion; }
// public void levelFormatVersion(int value) { wrapperContained.levelFormatVersion = value; }
// public static int levelFormatVersion() { return net.minecraft.world.level.storage.SaveVersionInfo.levelFormatVersion; }
// public static void levelFormatVersion(int value, ) { net.minecraft.world.level.storage.SaveVersionInfo.levelFormatVersion = value; }

// public long lastPlayed() { return wrapperContained.lastPlayed; }
// public void lastPlayed(long value) { wrapperContained.lastPlayed = value; }
// public static long lastPlayed() { return net.minecraft.world.level.storage.SaveVersionInfo.lastPlayed; }
// public static void lastPlayed(long value, ) { net.minecraft.world.level.storage.SaveVersionInfo.lastPlayed = value; }

// public java.lang.String versionName() { return wrapperContained.versionName; }
// public void versionName(java.lang.String value) { wrapperContained.versionName = value; }
// public static java.lang.String versionName() { return net.minecraft.world.level.storage.SaveVersionInfo.versionName; }
// public static void versionName(java.lang.String value, ) { net.minecraft.world.level.storage.SaveVersionInfo.versionName = value; }

// public yarnwrap.SaveVersion version() { return new yarnwrap.SaveVersion(wrapperContained.version); }
// public void version(yarnwrap.SaveVersion value) { wrapperContained.version = value.wrapperContained; }
// public static yarnwrap.SaveVersion version() { return new yarnwrap.SaveVersion(net.minecraft.world.level.storage.SaveVersionInfo.version); }
// public static void version(yarnwrap.SaveVersion value, ) { net.minecraft.world.level.storage.SaveVersionInfo.version = value.wrapperContained; }

// public boolean stable() { return wrapperContained.stable; }
// public void stable(boolean value) { wrapperContained.stable = value; }
// public static boolean stable() { return net.minecraft.world.level.storage.SaveVersionInfo.stable; }
// public static void stable(boolean value, ) { net.minecraft.world.level.storage.SaveVersionInfo.stable = value; }

// public SaveVersionInfo(int levelFormatVersion,long lastPlayed,java.lang.String versionName,int versionId,java.lang.String series,boolean stable) { this.wrapperContained = new net.minecraft.world.level.storage.SaveVersionInfo(levelFormatVersion,lastPlayed,versionName,versionId,series,stable); }
public int getLevelFormatVersion() { return wrapperContained.getLevelFormatVersion(); }
// public static int getLevelFormatVersion() { return net.minecraft.world.level.storage.SaveVersionInfo.getLevelFormatVersion(); }
// public yarnwrap.world.level.storage.SaveVersionInfo fromDynamic(com.mojang.serialization.Dynamic dynamic) { return new yarnwrap.world.level.storage.SaveVersionInfo(wrapperContained.fromDynamic(dynamic)); }
// public static yarnwrap.world.level.storage.SaveVersionInfo fromDynamic(com.mojang.serialization.Dynamic dynamic, ) { return new yarnwrap.world.level.storage.SaveVersionInfo(net.minecraft.world.level.storage.SaveVersionInfo.fromDynamic(dynamic)); }
public long getLastPlayed() { return wrapperContained.getLastPlayed(); }
// public static long getLastPlayed() { return net.minecraft.world.level.storage.SaveVersionInfo.getLastPlayed(); }
public java.lang.String getVersionName() { return wrapperContained.getVersionName(); }
// public static java.lang.String getVersionName() { return net.minecraft.world.level.storage.SaveVersionInfo.getVersionName(); }
public yarnwrap.SaveVersion getVersion() { return new yarnwrap.SaveVersion(wrapperContained.getVersion()); }
// public static yarnwrap.SaveVersion getVersion() { return new yarnwrap.SaveVersion(net.minecraft.world.level.storage.SaveVersionInfo.getVersion()); }
public boolean isStable() { return wrapperContained.isStable(); }
// public static boolean isStable() { return net.minecraft.world.level.storage.SaveVersionInfo.isStable(); }

}