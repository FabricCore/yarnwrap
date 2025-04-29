package yarnwrap;
public class MinecraftVersion { public net.minecraft.MinecraftVersion wrapperContained; public MinecraftVersion(net.minecraft.MinecraftVersion wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.MinecraftVersion.name; }
// public static void name(java.lang.String value, ) { net.minecraft.MinecraftVersion.name = value; }

// public int dataPackVersion() { return wrapperContained.dataPackVersion; }
// public void dataPackVersion(int value) { wrapperContained.dataPackVersion = value; }
// public static int dataPackVersion() { return net.minecraft.MinecraftVersion.dataPackVersion; }
// public static void dataPackVersion(int value, ) { net.minecraft.MinecraftVersion.dataPackVersion = value; }

// public int protocolVersion() { return wrapperContained.protocolVersion; }
// public void protocolVersion(int value) { wrapperContained.protocolVersion = value; }
// public static int protocolVersion() { return net.minecraft.MinecraftVersion.protocolVersion; }
// public static void protocolVersion(int value, ) { net.minecraft.MinecraftVersion.protocolVersion = value; }

// public yarnwrap.SaveVersion saveVersion() { return new yarnwrap.SaveVersion(wrapperContained.saveVersion); }
// public void saveVersion(yarnwrap.SaveVersion value) { wrapperContained.saveVersion = value.wrapperContained; }
// public static yarnwrap.SaveVersion saveVersion() { return new yarnwrap.SaveVersion(net.minecraft.MinecraftVersion.saveVersion); }
// public static void saveVersion(yarnwrap.SaveVersion value, ) { net.minecraft.MinecraftVersion.saveVersion = value.wrapperContained; }

// public boolean stable() { return wrapperContained.stable; }
// public void stable(boolean value) { wrapperContained.stable = value; }
// public static boolean stable() { return net.minecraft.MinecraftVersion.stable; }
// public static void stable(boolean value, ) { net.minecraft.MinecraftVersion.stable = value; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.MinecraftVersion.id; }
// public static void id(java.lang.String value, ) { net.minecraft.MinecraftVersion.id = value; }

// public java.util.Date buildTime() { return wrapperContained.buildTime; }
// public void buildTime(java.util.Date value) { wrapperContained.buildTime = value; }
// public static java.util.Date buildTime() { return net.minecraft.MinecraftVersion.buildTime; }
// public static void buildTime(java.util.Date value, ) { net.minecraft.MinecraftVersion.buildTime = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.MinecraftVersion.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.MinecraftVersion.LOGGER = value; }

// public yarnwrap.GameVersion CURRENT() { return new yarnwrap.GameVersion(wrapperContained.CURRENT); }
// public void CURRENT(yarnwrap.GameVersion value) { wrapperContained.CURRENT = value.wrapperContained; }
public static yarnwrap.GameVersion CURRENT() { return new yarnwrap.GameVersion(net.minecraft.MinecraftVersion.CURRENT); }
// public static void CURRENT(yarnwrap.GameVersion value, ) { net.minecraft.MinecraftVersion.CURRENT = value.wrapperContained; }

// public int resourcePackVersion() { return wrapperContained.resourcePackVersion; }
// public void resourcePackVersion(int value) { wrapperContained.resourcePackVersion = value; }
// public static int resourcePackVersion() { return net.minecraft.MinecraftVersion.resourcePackVersion; }
// public static void resourcePackVersion(int value, ) { net.minecraft.MinecraftVersion.resourcePackVersion = value; }

// public MinecraftVersion(com.google.gson.JsonObject json) { this.wrapperContained = new net.minecraft.MinecraftVersion(json); }
// public yarnwrap.GameVersion create() { return new yarnwrap.GameVersion(wrapperContained.create()); }
public static yarnwrap.GameVersion create() { return new yarnwrap.GameVersion(net.minecraft.MinecraftVersion.create()); }

}