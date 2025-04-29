package yarnwrap.client.option;
public class HotbarStorage { public net.minecraft.client.option.HotbarStorage wrapperContained; public HotbarStorage(net.minecraft.client.option.HotbarStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.client.option.HotbarStorageEntry[] entries() { return wrapperContained.entries; }
// public void entries(net.minecraft.client.option.HotbarStorageEntry[] value) { wrapperContained.entries = value; }
// public static net.minecraft.client.option.HotbarStorageEntry[] entries() { return net.minecraft.client.option.HotbarStorage.entries; }
// public static void entries(net.minecraft.client.option.HotbarStorageEntry[] value, ) { net.minecraft.client.option.HotbarStorage.entries = value; }

// public boolean loaded() { return wrapperContained.loaded; }
// public void loaded(boolean value) { wrapperContained.loaded = value; }
// public static boolean loaded() { return net.minecraft.client.option.HotbarStorage.loaded; }
// public static void loaded(boolean value, ) { net.minecraft.client.option.HotbarStorage.loaded = value; }

// public java.nio.file.Path file() { return wrapperContained.file; }
// public void file(java.nio.file.Path value) { wrapperContained.file = value; }
// public static java.nio.file.Path file() { return net.minecraft.client.option.HotbarStorage.file; }
// public static void file(java.nio.file.Path value, ) { net.minecraft.client.option.HotbarStorage.file = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.option.HotbarStorage.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.option.HotbarStorage.LOGGER = value; }

// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
// public static com.mojang.datafixers.DataFixer dataFixer() { return net.minecraft.client.option.HotbarStorage.dataFixer; }
// public static void dataFixer(com.mojang.datafixers.DataFixer value, ) { net.minecraft.client.option.HotbarStorage.dataFixer = value; }

// public int STORAGE_ENTRY_COUNT() { return wrapperContained.STORAGE_ENTRY_COUNT; }
// public void STORAGE_ENTRY_COUNT(int value) { wrapperContained.STORAGE_ENTRY_COUNT = value; }
public static int STORAGE_ENTRY_COUNT() { return net.minecraft.client.option.HotbarStorage.STORAGE_ENTRY_COUNT; }
// public static void STORAGE_ENTRY_COUNT(int value, ) { net.minecraft.client.option.HotbarStorage.STORAGE_ENTRY_COUNT = value; }

public HotbarStorage(java.nio.file.Path directory,com.mojang.datafixers.DataFixer dataFixer) { this.wrapperContained = new net.minecraft.client.option.HotbarStorage(directory,dataFixer); }
public void save() { wrapperContained.save(); }
// public static void save() { net.minecraft.client.option.HotbarStorage.save(); }
public yarnwrap.client.option.HotbarStorageEntry getSavedHotbar(int i) { return new yarnwrap.client.option.HotbarStorageEntry(wrapperContained.getSavedHotbar(i)); }
// public static yarnwrap.client.option.HotbarStorageEntry getSavedHotbar(int i, ) { return new yarnwrap.client.option.HotbarStorageEntry(net.minecraft.client.option.HotbarStorage.getSavedHotbar(i)); }
// public void load() { wrapperContained.load(); }
// public static void load() { net.minecraft.client.option.HotbarStorage.load(); }
// public void method_56825(java.lang.String error) { wrapperContained.method_56825(error); }
// public static void method_56825(java.lang.String error, ) { net.minecraft.client.option.HotbarStorage.method_56825(error); }

}