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
public SimpleRegistry(yarnwrap.registry.RegistryKey key,com.mojang.serialization.Lifecycle lifecycle) { this.wrapperContained = new net.minecraft.registry.SimpleRegistry(key.wrapperContained,lifecycle); }
public SimpleRegistry(yarnwrap.registry.RegistryKey key,com.mojang.serialization.Lifecycle lifecycle,boolean intrusive) { this.wrapperContained = new net.minecraft.registry.SimpleRegistry(key.wrapperContained,lifecycle,intrusive); }
// public void method_39665(it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap map) { wrapperContained.method_39665(map); }
// public java.lang.Object getValue(Object entry) { return wrapperContained.getValue(entry); }
// public void method_40255(Object entryList) { wrapperContained.method_40255(entryList); }
// public boolean method_40256(Object entry) { return wrapperContained.method_40256(entry); }
// public void method_40258(java.util.Map tag,yarnwrap.registry.tag.TagKey entries) { wrapperContained.method_40258(tag,entries.wrapperContained); }
// public void method_40259(java.util.Map entry) { wrapperContained.method_40259(entry); }
// public void method_40261(Object entry) { wrapperContained.method_40261(entry); }
// public com.mojang.datafixers.util.Pair method_40262(Object entry) { return wrapperContained.method_40262(entry); }
// public void method_40263(java.util.Map tag,yarnwrap.registry.tag.TagKey entries) { wrapperContained.method_40263(tag,entries.wrapperContained); }
// public Object method_40271(java.lang.Object valuex) { return wrapperContained.method_40271(valuex); }
// public void assertNotFrozen(yarnwrap.registry.RegistryKey key) { wrapperContained.assertNotFrozen(key.wrapperContained); }
// public Object createNamedEntryList(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.createNamedEntryList(tag.wrapperContained); }
// public java.lang.String method_40563(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.method_40563(tag.wrapperContained); }
// public Object getOrCreateEntry(yarnwrap.registry.RegistryKey key) { return wrapperContained.getOrCreateEntry(key.wrapperContained); }
// public Object method_44299(yarnwrap.registry.RegistryKey key2) { return wrapperContained.method_44299(key2.wrapperContained); }
// public void method_45938(java.lang.Object value,Object entry) { wrapperContained.method_45938(value,entry); }
// public void assertNotFrozen() { wrapperContained.assertNotFrozen(); }
// public Object method_56594(yarnwrap.registry.RegistryKey k) { return wrapperContained.method_56594(k.wrapperContained); }

}