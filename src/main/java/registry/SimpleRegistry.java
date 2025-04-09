package yarnwrap.registry;
public class SimpleRegistry { public net.minecraft.registry.SimpleRegistry wrapperContained; public SimpleRegistry(net.minecraft.registry.SimpleRegistry wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map idToEntry() { return wrapperContained.idToEntry; }
// public java.util.Map keyToEntry() { return wrapperContained.keyToEntry; }
// public it.unimi.dsi.fastutil.objects.ObjectList rawIdToEntry() { return wrapperContained.rawIdToEntry; }
// public it.unimi.dsi.fastutil.objects.Reference2IntMap entryToRawId() { return wrapperContained.entryToRawId; }
// public com.mojang.serialization.Lifecycle lifecycle() { return wrapperContained.lifecycle; }
// public java.util.Map valueToEntry() { return wrapperContained.valueToEntry; }
// public java.util.Map tagToEntryList() { return wrapperContained.tagToEntryList; }
// public boolean frozen() { return wrapperContained.frozen; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Map intrusiveValueToEntry() { return wrapperContained.intrusiveValueToEntry; }
// public yarnwrap.registry.RegistryKey key() { return new yarnwrap.registry.RegistryKey(wrapperContained.key); }
// public Object wrapper() { return wrapperContained.wrapper; }
// public java.util.Map keyToEntryInfo() { return wrapperContained.keyToEntryInfo; }
// public java.lang.Object tagLock() { return wrapperContained.tagLock; }
// public java.lang.Object getValue(Object entry) { return wrapperContained.getValue(entry); }
// public void assertNotFrozen(yarnwrap.registry.RegistryKey key) { wrapperContained.assertNotFrozen(key.wrapperContained); }
// public Object createNamedEntryList(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.createNamedEntryList(tag.wrapperContained); }
// public Object getOrCreateEntry(yarnwrap.registry.RegistryKey key) { return wrapperContained.getOrCreateEntry(key.wrapperContained); }
// public void assertNotFrozen() { wrapperContained.assertNotFrozen(); }

}