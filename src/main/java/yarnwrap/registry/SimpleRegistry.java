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

// public boolean frozen() { return wrapperContained.frozen; }
// public void frozen(boolean value) { wrapperContained.frozen = value; }
// public static boolean frozen() { return net.minecraft.registry.SimpleRegistry.frozen; }
// public static void frozen(boolean value, ) { net.minecraft.registry.SimpleRegistry.frozen = value; }

// public java.util.Map intrusiveValueToEntry() { return wrapperContained.intrusiveValueToEntry; }
// public void intrusiveValueToEntry(java.util.Map value) { wrapperContained.intrusiveValueToEntry = value; }
// public static java.util.Map intrusiveValueToEntry() { return net.minecraft.registry.SimpleRegistry.intrusiveValueToEntry; }
// public static void intrusiveValueToEntry(java.util.Map value, ) { net.minecraft.registry.SimpleRegistry.intrusiveValueToEntry = value; }

// public yarnwrap.registry.RegistryKey key() { return new yarnwrap.registry.RegistryKey(wrapperContained.key); }
// public void key(yarnwrap.registry.RegistryKey value) { wrapperContained.key = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey key() { return new yarnwrap.registry.RegistryKey(net.minecraft.registry.SimpleRegistry.key); }
// public static void key(yarnwrap.registry.RegistryKey value, ) { net.minecraft.registry.SimpleRegistry.key = value.wrapperContained; }

// public java.util.Map keyToEntryInfo() { return wrapperContained.keyToEntryInfo; }
// public void keyToEntryInfo(java.util.Map value) { wrapperContained.keyToEntryInfo = value; }
// public static java.util.Map keyToEntryInfo() { return net.minecraft.registry.SimpleRegistry.keyToEntryInfo; }
// public static void keyToEntryInfo(java.util.Map value, ) { net.minecraft.registry.SimpleRegistry.keyToEntryInfo = value; }

// public java.util.Map tags() { return wrapperContained.tags; }
// public void tags(java.util.Map value) { wrapperContained.tags = value; }
// public static java.util.Map tags() { return net.minecraft.registry.SimpleRegistry.tags; }
// public static void tags(java.util.Map value, ) { net.minecraft.registry.SimpleRegistry.tags = value; }

// public Object tagLookup() { return wrapperContained.tagLookup; }
// // public void tagLookup(Object value) { wrapperContained.tagLookup = value; }
// // public static Object tagLookup() { return net.minecraft.registry.SimpleRegistry.tagLookup; }
// // public static void tagLookup(Object value, ) { net.minecraft.registry.SimpleRegistry.tagLookup = value; }

public SimpleRegistry(yarnwrap.registry.RegistryKey key,com.mojang.serialization.Lifecycle lifecycle) { this.wrapperContained = new net.minecraft.registry.SimpleRegistry(key.wrapperContained,lifecycle); }
public SimpleRegistry(yarnwrap.registry.RegistryKey key,com.mojang.serialization.Lifecycle lifecycle,boolean intrusive) { this.wrapperContained = new net.minecraft.registry.SimpleRegistry(key.wrapperContained,lifecycle,intrusive); }
// public void method_39665(it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap map) { wrapperContained.method_39665(map); }
// public static void method_39665(it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap map, ) { net.minecraft.registry.SimpleRegistry.method_39665(map); }
// public java.lang.Object getValue(Object entry) { return wrapperContained.getValue(entry); }
// public static java.lang.Object getValue(Object entry, ) { return net.minecraft.registry.SimpleRegistry.getValue(entry); }
// public boolean method_40256(Object entry) { return wrapperContained.method_40256(entry); }
// public static boolean method_40256(Object entry, ) { return net.minecraft.registry.SimpleRegistry.method_40256(entry); }
// public Object method_40271(java.lang.Object valuex) { return wrapperContained.method_40271(valuex); }
// public static Object method_40271(java.lang.Object valuex, ) { return net.minecraft.registry.SimpleRegistry.method_40271(valuex); }
// public void assertNotFrozen(yarnwrap.registry.RegistryKey key) { wrapperContained.assertNotFrozen(key.wrapperContained); }
// public static void assertNotFrozen(yarnwrap.registry.RegistryKey key, ) { net.minecraft.registry.SimpleRegistry.assertNotFrozen(key.wrapperContained); }
// public Object createNamedEntryList(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.createNamedEntryList(tag.wrapperContained); }
// public static Object createNamedEntryList(yarnwrap.registry.tag.TagKey tag, ) { return net.minecraft.registry.SimpleRegistry.createNamedEntryList(tag.wrapperContained); }
// public yarnwrap.util.Identifier method_41199(Object entry) { return new yarnwrap.util.Identifier(wrapperContained.method_41199(entry)); }
// public static yarnwrap.util.Identifier method_41199(Object entry, ) { return new yarnwrap.util.Identifier(net.minecraft.registry.SimpleRegistry.method_41199(entry)); }
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
// public Object ensureTagable(yarnwrap.registry.tag.TagKey key,yarnwrap.registry.entry.RegistryEntry entry) { return wrapperContained.ensureTagable(key.wrapperContained,entry.wrapperContained); }
// public static Object ensureTagable(yarnwrap.registry.tag.TagKey key,yarnwrap.registry.entry.RegistryEntry entry, ) { return net.minecraft.registry.SimpleRegistry.ensureTagable(key.wrapperContained,entry.wrapperContained); }
// public void method_62684(Object key,java.util.Map values) { wrapperContained.method_62684(key,values); }
// public static void method_62684(Object key,java.util.Map values, ) { net.minecraft.registry.SimpleRegistry.method_62684(key,values); }
// public yarnwrap.util.Identifier method_62685(Object entry) { return new yarnwrap.util.Identifier(wrapperContained.method_62685(entry)); }
// public static yarnwrap.util.Identifier method_62685(Object entry, ) { return new yarnwrap.util.Identifier(net.minecraft.registry.SimpleRegistry.method_62685(entry)); }
// public void method_62686(java.util.Map key,yarnwrap.registry.tag.TagKey value) { wrapperContained.method_62686(key,value.wrapperContained); }
// public static void method_62686(java.util.Map key,yarnwrap.registry.tag.TagKey value, ) { net.minecraft.registry.SimpleRegistry.method_62686(key,value.wrapperContained); }
// public void method_62687(java.util.Map key) { wrapperContained.method_62687(key); }
// public static void method_62687(java.util.Map key, ) { net.minecraft.registry.SimpleRegistry.method_62687(key); }
// public void method_62688(Object tag) { wrapperContained.method_62688(tag); }
// public static void method_62688(Object tag, ) { net.minecraft.registry.SimpleRegistry.method_62688(tag); }
// public boolean method_62689(Object entry) { return wrapperContained.method_62689(entry); }
// public static boolean method_62689(Object entry, ) { return net.minecraft.registry.SimpleRegistry.method_62689(entry); }
// public Object getTag(yarnwrap.registry.tag.TagKey key) { return wrapperContained.getTag(key.wrapperContained); }
// public static Object getTag(yarnwrap.registry.tag.TagKey key, ) { return net.minecraft.registry.SimpleRegistry.getTag(key.wrapperContained); }
public void resetTagEntries() { wrapperContained.resetTagEntries(); }
// public static void resetTagEntries() { net.minecraft.registry.SimpleRegistry.resetTagEntries(); }
// public void refreshTags() { wrapperContained.refreshTags(); }
// public static void refreshTags() { net.minecraft.registry.SimpleRegistry.refreshTags(); }

}