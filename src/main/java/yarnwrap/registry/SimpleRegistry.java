package yarnwrap.registry;
public class SimpleRegistry { public net.minecraft.registry.SimpleRegistry wrapperContained; public SimpleRegistry(net.minecraft.registry.SimpleRegistry wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map idToEntry() { return wrapperContained.idToEntry; }
// public void idToEntry(java.util.Map value) { wrapperContained.idToEntry = value; }
// public static java.util.Map idToEntry() { return net.minecraft.registry.SimpleRegistry.idToEntry; }
// public static void idToEntry(java.util.Map value, ) { net.minecraft.registry.SimpleRegistry.idToEntry = value; }

// public java.util.Map keyToEntry() { return wrapperContained.keyToEntry; }
// public void keyToEntry(java.util.Map value) { wrapperContained.keyToEntry = value; }
// public static java.util.Map keyToEntry() { return net.minecraft.registry.SimpleRegistry.keyToEntry; }
// public static void keyToEntry(java.util.Map value, ) { net.minecraft.registry.SimpleRegistry.keyToEntry = value; }

// public it.unimi.dsi.fastutil.objects.ObjectList rawIdToEntry() { return wrapperContained.rawIdToEntry; }
// public void rawIdToEntry(it.unimi.dsi.fastutil.objects.ObjectList value) { wrapperContained.rawIdToEntry = value; }
// public static it.unimi.dsi.fastutil.objects.ObjectList rawIdToEntry() { return net.minecraft.registry.SimpleRegistry.rawIdToEntry; }
// public static void rawIdToEntry(it.unimi.dsi.fastutil.objects.ObjectList value, ) { net.minecraft.registry.SimpleRegistry.rawIdToEntry = value; }

// public it.unimi.dsi.fastutil.objects.Reference2IntMap entryToRawId() { return wrapperContained.entryToRawId; }
// public void entryToRawId(it.unimi.dsi.fastutil.objects.Reference2IntMap value) { wrapperContained.entryToRawId = value; }
// public static it.unimi.dsi.fastutil.objects.Reference2IntMap entryToRawId() { return net.minecraft.registry.SimpleRegistry.entryToRawId; }
// public static void entryToRawId(it.unimi.dsi.fastutil.objects.Reference2IntMap value, ) { net.minecraft.registry.SimpleRegistry.entryToRawId = value; }

// public com.mojang.serialization.Lifecycle lifecycle() { return wrapperContained.lifecycle; }
// public void lifecycle(com.mojang.serialization.Lifecycle value) { wrapperContained.lifecycle = value; }
// public static com.mojang.serialization.Lifecycle lifecycle() { return net.minecraft.registry.SimpleRegistry.lifecycle; }
// public static void lifecycle(com.mojang.serialization.Lifecycle value, ) { net.minecraft.registry.SimpleRegistry.lifecycle = value; }

// public java.util.Map valueToEntry() { return wrapperContained.valueToEntry; }
// public void valueToEntry(java.util.Map value) { wrapperContained.valueToEntry = value; }
// public static java.util.Map valueToEntry() { return net.minecraft.registry.SimpleRegistry.valueToEntry; }
// public static void valueToEntry(java.util.Map value, ) { net.minecraft.registry.SimpleRegistry.valueToEntry = value; }

// public java.util.Map tagToEntryList() { return wrapperContained.tagToEntryList; }
// public void tagToEntryList(java.util.Map value) { wrapperContained.tagToEntryList = value; }
// public static java.util.Map tagToEntryList() { return net.minecraft.registry.SimpleRegistry.tagToEntryList; }
// public static void tagToEntryList(java.util.Map value, ) { net.minecraft.registry.SimpleRegistry.tagToEntryList = value; }

// public boolean frozen() { return wrapperContained.frozen; }
// public void frozen(boolean value) { wrapperContained.frozen = value; }
// public static boolean frozen() { return net.minecraft.registry.SimpleRegistry.frozen; }
// public static void frozen(boolean value, ) { net.minecraft.registry.SimpleRegistry.frozen = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.registry.SimpleRegistry.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.registry.SimpleRegistry.LOGGER = value; }

// public java.util.Map intrusiveValueToEntry() { return wrapperContained.intrusiveValueToEntry; }
// public void intrusiveValueToEntry(java.util.Map value) { wrapperContained.intrusiveValueToEntry = value; }
// public static java.util.Map intrusiveValueToEntry() { return net.minecraft.registry.SimpleRegistry.intrusiveValueToEntry; }
// public static void intrusiveValueToEntry(java.util.Map value, ) { net.minecraft.registry.SimpleRegistry.intrusiveValueToEntry = value; }

// public yarnwrap.registry.RegistryKey key() { return new yarnwrap.registry.RegistryKey(wrapperContained.key); }
// public void key(yarnwrap.registry.RegistryKey value) { wrapperContained.key = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey key() { return new yarnwrap.registry.RegistryKey(net.minecraft.registry.SimpleRegistry.key); }
// public static void key(yarnwrap.registry.RegistryKey value, ) { net.minecraft.registry.SimpleRegistry.key = value.wrapperContained; }

// public Object wrapper() { return wrapperContained.wrapper; }
// // public void wrapper(Object value) { wrapperContained.wrapper = value; }
// // public static Object wrapper() { return net.minecraft.registry.SimpleRegistry.wrapper; }
// // public static void wrapper(Object value, ) { net.minecraft.registry.SimpleRegistry.wrapper = value; }

// public java.util.Map keyToEntryInfo() { return wrapperContained.keyToEntryInfo; }
// public void keyToEntryInfo(java.util.Map value) { wrapperContained.keyToEntryInfo = value; }
// public static java.util.Map keyToEntryInfo() { return net.minecraft.registry.SimpleRegistry.keyToEntryInfo; }
// public static void keyToEntryInfo(java.util.Map value, ) { net.minecraft.registry.SimpleRegistry.keyToEntryInfo = value; }

// public java.lang.Object tagLock() { return wrapperContained.tagLock; }
// public void tagLock(java.lang.Object value) { wrapperContained.tagLock = value; }
// // public static java.lang.Object tagLock() { return net.minecraft.registry.SimpleRegistry.tagLock; }
// public static void tagLock(java.lang.Object value, ) { net.minecraft.registry.SimpleRegistry.tagLock = value; }

public SimpleRegistry(yarnwrap.registry.RegistryKey key,com.mojang.serialization.Lifecycle lifecycle) { this.wrapperContained = new net.minecraft.registry.SimpleRegistry(key.wrapperContained,lifecycle); }
public SimpleRegistry(yarnwrap.registry.RegistryKey key,com.mojang.serialization.Lifecycle lifecycle,boolean intrusive) { this.wrapperContained = new net.minecraft.registry.SimpleRegistry(key.wrapperContained,lifecycle,intrusive); }
// public void method_39665(it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap map) { wrapperContained.method_39665(map); }
// public static void method_39665(it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap map, ) { net.minecraft.registry.SimpleRegistry.method_39665(map); }
// public java.lang.Object getValue(Object entry) { return wrapperContained.getValue(entry); }
// public static java.lang.Object getValue(Object entry, ) { return net.minecraft.registry.SimpleRegistry.getValue(entry); }
// public void method_40255(Object entryList) { wrapperContained.method_40255(entryList); }
// public static void method_40255(Object entryList, ) { net.minecraft.registry.SimpleRegistry.method_40255(entryList); }
// public boolean method_40256(Object entry) { return wrapperContained.method_40256(entry); }
// public static boolean method_40256(Object entry, ) { return net.minecraft.registry.SimpleRegistry.method_40256(entry); }
// public void method_40258(java.util.Map tag,yarnwrap.registry.tag.TagKey entries) { wrapperContained.method_40258(tag,entries.wrapperContained); }
// public static void method_40258(java.util.Map tag,yarnwrap.registry.tag.TagKey entries, ) { net.minecraft.registry.SimpleRegistry.method_40258(tag,entries.wrapperContained); }
// public void method_40259(java.util.Map entry) { wrapperContained.method_40259(entry); }
// public static void method_40259(java.util.Map entry, ) { net.minecraft.registry.SimpleRegistry.method_40259(entry); }
// public void method_40261(Object entry) { wrapperContained.method_40261(entry); }
// public static void method_40261(Object entry, ) { net.minecraft.registry.SimpleRegistry.method_40261(entry); }
// public com.mojang.datafixers.util.Pair method_40262(Object entry) { return wrapperContained.method_40262(entry); }
// public static com.mojang.datafixers.util.Pair method_40262(Object entry, ) { return net.minecraft.registry.SimpleRegistry.method_40262(entry); }
// public void method_40263(java.util.Map tag,yarnwrap.registry.tag.TagKey entries) { wrapperContained.method_40263(tag,entries.wrapperContained); }
// public static void method_40263(java.util.Map tag,yarnwrap.registry.tag.TagKey entries, ) { net.minecraft.registry.SimpleRegistry.method_40263(tag,entries.wrapperContained); }
// public Object method_40271(java.lang.Object valuex) { return wrapperContained.method_40271(valuex); }
// public static Object method_40271(java.lang.Object valuex, ) { return net.minecraft.registry.SimpleRegistry.method_40271(valuex); }
// public void assertNotFrozen(yarnwrap.registry.RegistryKey key) { wrapperContained.assertNotFrozen(key.wrapperContained); }
// public static void assertNotFrozen(yarnwrap.registry.RegistryKey key, ) { net.minecraft.registry.SimpleRegistry.assertNotFrozen(key.wrapperContained); }
// public Object createNamedEntryList(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.createNamedEntryList(tag.wrapperContained); }
// public static Object createNamedEntryList(yarnwrap.registry.tag.TagKey tag, ) { return net.minecraft.registry.SimpleRegistry.createNamedEntryList(tag.wrapperContained); }
// public java.lang.String method_40563(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.method_40563(tag.wrapperContained); }
// public static java.lang.String method_40563(yarnwrap.registry.tag.TagKey tag, ) { return net.minecraft.registry.SimpleRegistry.method_40563(tag.wrapperContained); }
// public Object getOrCreateEntry(yarnwrap.registry.RegistryKey key) { return wrapperContained.getOrCreateEntry(key.wrapperContained); }
// public static Object getOrCreateEntry(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.registry.SimpleRegistry.getOrCreateEntry(key.wrapperContained); }
// public Object method_44299(yarnwrap.registry.RegistryKey key2) { return wrapperContained.method_44299(key2.wrapperContained); }
// public static Object method_44299(yarnwrap.registry.RegistryKey key2, ) { return net.minecraft.registry.SimpleRegistry.method_44299(key2.wrapperContained); }
// public void method_45938(java.lang.Object value,Object entry) { wrapperContained.method_45938(value,entry); }
// public static void method_45938(java.lang.Object value,Object entry, ) { net.minecraft.registry.SimpleRegistry.method_45938(value,entry); }
// public void assertNotFrozen() { wrapperContained.assertNotFrozen(); }
// public static void assertNotFrozen() { net.minecraft.registry.SimpleRegistry.assertNotFrozen(); }
// public Object method_56594(yarnwrap.registry.RegistryKey k) { return wrapperContained.method_56594(k.wrapperContained); }
// public static Object method_56594(yarnwrap.registry.RegistryKey k, ) { return net.minecraft.registry.SimpleRegistry.method_56594(k.wrapperContained); }

}