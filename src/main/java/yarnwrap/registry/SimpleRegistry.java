package yarnwrap.registry;
public class SimpleRegistry { public net.minecraft.registry.SimpleRegistry wrapperContained; public SimpleRegistry(net.minecraft.registry.SimpleRegistry wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map idToEntry() { return wrapperContained.idToEntry; }
// public void idToEntry(java.util.Map value) { wrapperContained.idToEntry = value; }
// public java.util.Map keyToEntry() { return wrapperContained.keyToEntry; }
// public void keyToEntry(java.util.Map value) { wrapperContained.keyToEntry = value; }
// public it.unimi.dsi.fastutil.objects.ObjectList rawIdToEntry() { return wrapperContained.rawIdToEntry; }
// public void rawIdToEntry(it.unimi.dsi.fastutil.objects.ObjectList value) { wrapperContained.rawIdToEntry = value; }
// public it.unimi.dsi.fastutil.objects.Reference2IntMap entryToRawId() { return wrapperContained.entryToRawId; }
// public void entryToRawId(it.unimi.dsi.fastutil.objects.Reference2IntMap value) { wrapperContained.entryToRawId = value; }
// public com.mojang.serialization.Lifecycle lifecycle() { return wrapperContained.lifecycle; }
// public void lifecycle(com.mojang.serialization.Lifecycle value) { wrapperContained.lifecycle = value; }
// public java.util.Map valueToEntry() { return wrapperContained.valueToEntry; }
// public void valueToEntry(java.util.Map value) { wrapperContained.valueToEntry = value; }
// public java.util.Map tagToEntryList() { return wrapperContained.tagToEntryList; }
// public void tagToEntryList(java.util.Map value) { wrapperContained.tagToEntryList = value; }
// public boolean frozen() { return wrapperContained.frozen; }
// public void frozen(boolean value) { wrapperContained.frozen = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Map intrusiveValueToEntry() { return wrapperContained.intrusiveValueToEntry; }
// public void intrusiveValueToEntry(java.util.Map value) { wrapperContained.intrusiveValueToEntry = value; }
// public yarnwrap.registry.RegistryKey key() { return new yarnwrap.registry.RegistryKey(wrapperContained.key); }
// public void key(yarnwrap.registry.RegistryKey value) { wrapperContained.key = value.wrapperContained; }
// public Object wrapper() { return wrapperContained.wrapper; }
// // public void wrapper(Object value) { wrapperContained.wrapper = value; }
// public java.util.Map keyToEntryInfo() { return wrapperContained.keyToEntryInfo; }
// public void keyToEntryInfo(java.util.Map value) { wrapperContained.keyToEntryInfo = value; }
// public java.lang.Object tagLock() { return wrapperContained.tagLock; }
// public void tagLock(java.lang.Object value) { wrapperContained.tagLock = value; }
// public java.lang.Object getValue(Object entry) { return wrapperContained.getValue(entry); }
// public void assertNotFrozen(yarnwrap.registry.RegistryKey key) { wrapperContained.assertNotFrozen(key.wrapperContained); }
// public Object createNamedEntryList(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.createNamedEntryList(tag.wrapperContained); }
// public Object getOrCreateEntry(yarnwrap.registry.RegistryKey key) { return wrapperContained.getOrCreateEntry(key.wrapperContained); }
// public void assertNotFrozen() { wrapperContained.assertNotFrozen(); }

}