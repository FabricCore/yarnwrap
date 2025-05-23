package yarnwrap;
public class MinecraftVersion { public net.minecraft.MinecraftVersion wrapperContained; public MinecraftVersion(net.minecraft.MinecraftVersion wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.MinecraftVersion.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.MinecraftVersion.LOGGER = value; }

// public yarnwrap.GameVersion CURRENT() { return new yarnwrap.GameVersion(wrapperContained.CURRENT); }
// public void CURRENT(yarnwrap.GameVersion value) { wrapperContained.CURRENT = value.wrapperContained; }
public static yarnwrap.GameVersion CURRENT() { return new yarnwrap.GameVersion(net.minecraft.MinecraftVersion.CURRENT); }
// public static void CURRENT(yarnwrap.GameVersion value, ) { net.minecraft.MinecraftVersion.CURRENT = value.wrapperContained; }

// public yarnwrap.GameVersion create() { return new yarnwrap.GameVersion(wrapperContained.create()); }
public static yarnwrap.GameVersion create() { return new yarnwrap.GameVersion(net.minecraft.MinecraftVersion.create()); }
// public yarnwrap.GameVersion fromJson(com.google.gson.JsonObject json) { return new yarnwrap.GameVersion(wrapperContained.fromJson(json)); }
// public static yarnwrap.GameVersion fromJson(com.google.gson.JsonObject json, ) { return new yarnwrap.GameVersion(net.minecraft.MinecraftVersion.fromJson(json)); }
// public yarnwrap.GameVersion createCurrent() { return new yarnwrap.GameVersion(wrapperContained.createCurrent()); }
// public static yarnwrap.GameVersion createCurrent() { return new yarnwrap.GameVersion(net.minecraft.MinecraftVersion.createCurrent()); }

}