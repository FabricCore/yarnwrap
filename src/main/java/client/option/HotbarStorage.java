package yarnwrap.client.option;
public class HotbarStorage { public net.minecraft.client.option.HotbarStorage wrapperContained; public HotbarStorage(net.minecraft.client.option.HotbarStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.client.option.HotbarStorageEntry[] entries() { return wrapperContained.entries; }
// public boolean loaded() { return wrapperContained.loaded; }
// public java.nio.file.Path file() { return wrapperContained.file; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
public int STORAGE_ENTRY_COUNT() { return wrapperContained.STORAGE_ENTRY_COUNT; }
public void save() { wrapperContained.save(); }
public yarnwrap.client.option.HotbarStorageEntry getSavedHotbar(int i) { return new yarnwrap.client.option.HotbarStorageEntry(wrapperContained.getSavedHotbar(i)); }
// public void load() { wrapperContained.load(); }

}