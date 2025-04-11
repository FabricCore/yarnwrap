package yarnwrap.client.option;
public class HotbarStorage { public net.minecraft.client.option.HotbarStorage wrapperContained; public HotbarStorage(net.minecraft.client.option.HotbarStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.client.option.HotbarStorageEntry[] entries() { return wrapperContained.entries; }
// public void entries(net.minecraft.client.option.HotbarStorageEntry[] value) { wrapperContained.entries = value; }
// public boolean loaded() { return wrapperContained.loaded; }
// public void loaded(boolean value) { wrapperContained.loaded = value; }
// public java.nio.file.Path file() { return wrapperContained.file; }
// public void file(java.nio.file.Path value) { wrapperContained.file = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
public int STORAGE_ENTRY_COUNT() { return wrapperContained.STORAGE_ENTRY_COUNT; }
// public void STORAGE_ENTRY_COUNT(int value) { wrapperContained.STORAGE_ENTRY_COUNT = value; }
public HotbarStorage(java.nio.file.Path directory,com.mojang.datafixers.DataFixer dataFixer) { this.wrapperContained = new net.minecraft.client.option.HotbarStorage(directory,dataFixer); }
public void save() { wrapperContained.save(); }
public yarnwrap.client.option.HotbarStorageEntry getSavedHotbar(int i) { return new yarnwrap.client.option.HotbarStorageEntry(wrapperContained.getSavedHotbar(i)); }
// public void load() { wrapperContained.load(); }
// public void method_56825(java.lang.String error) { wrapperContained.method_56825(error); }

}