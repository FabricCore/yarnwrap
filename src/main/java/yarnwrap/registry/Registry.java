package yarnwrap.registry;
public class Registry { public net.minecraft.registry.Registry wrapperContained; public Registry(net.minecraft.registry.Registry wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.stream.Stream keys(com.mojang.serialization.DynamicOps ops) { return wrapperContained.keys(ops); }
// public static java.util.stream.Stream keys(com.mojang.serialization.DynamicOps ops, ) { return net.minecraft.registry.Registry.keys(ops); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
// public static java.util.stream.Stream stream() { return net.minecraft.registry.Registry.stream(); }
public yarnwrap.util.Identifier getId(java.lang.Object value) { return new yarnwrap.util.Identifier(wrapperContained.getId(value)); }
// public static yarnwrap.util.Identifier getId(java.lang.Object value, ) { return new yarnwrap.util.Identifier(net.minecraft.registry.Registry.getId(value)); }
public java.lang.Object get(yarnwrap.util.Identifier id) { return wrapperContained.get(id.wrapperContained); }
// public static java.lang.Object get(yarnwrap.util.Identifier id, ) { return net.minecraft.registry.Registry.get(id.wrapperContained); }
// public java.lang.Object register(yarnwrap.registry.Registry registry,java.lang.String id,java.lang.Object entry) { return wrapperContained.register(registry.wrapperContained,id,entry); }
// public static java.lang.Object register(yarnwrap.registry.Registry registry,java.lang.String id,java.lang.Object entry, ) { return net.minecraft.registry.Registry.register(registry.wrapperContained,id,entry); }
// public java.lang.Object register(yarnwrap.registry.Registry registry,yarnwrap.util.Identifier id,java.lang.Object entry) { return wrapperContained.register(registry.wrapperContained,id.wrapperContained,entry); }
// public static java.lang.Object register(yarnwrap.registry.Registry registry,yarnwrap.util.Identifier id,java.lang.Object entry, ) { return net.minecraft.registry.Registry.register(registry.wrapperContained,id.wrapperContained,entry); }
public java.util.Set getIds() { return wrapperContained.getIds(); }
// public static java.util.Set getIds() { return net.minecraft.registry.Registry.getIds(); }
public java.util.Optional getRandom(yarnwrap.util.math.random.Random random) { return wrapperContained.getRandom(random.wrapperContained); }
// public static java.util.Optional getRandom(yarnwrap.util.math.random.Random random, ) { return net.minecraft.registry.Registry.getRandom(random.wrapperContained); }
public boolean containsId(yarnwrap.util.Identifier id) { return wrapperContained.containsId(id.wrapperContained); }
// public static boolean containsId(yarnwrap.util.Identifier id, ) { return net.minecraft.registry.Registry.containsId(id.wrapperContained); }
public java.util.Optional getOrEmpty(yarnwrap.util.Identifier id) { return wrapperContained.getOrEmpty(id.wrapperContained); }
// public static java.util.Optional getOrEmpty(yarnwrap.util.Identifier id, ) { return net.minecraft.registry.Registry.getOrEmpty(id.wrapperContained); }
public java.lang.Object get(yarnwrap.registry.RegistryKey key) { return wrapperContained.get(key.wrapperContained); }
// public static java.lang.Object get(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.registry.Registry.get(key.wrapperContained); }
public java.util.Optional getKey(java.lang.Object entry) { return wrapperContained.getKey(entry); }
// public static java.util.Optional getKey(java.lang.Object entry, ) { return net.minecraft.registry.Registry.getKey(entry); }
public java.util.Set getEntrySet() { return wrapperContained.getEntrySet(); }
// public static java.util.Set getEntrySet() { return net.minecraft.registry.Registry.getEntrySet(); }
public yarnwrap.registry.RegistryKey getKey() { return new yarnwrap.registry.RegistryKey(wrapperContained.getKey()); }
// // public static yarnwrap.registry.RegistryKey getKey() { return new yarnwrap.registry.RegistryKey(net.minecraft.registry.Registry.getKey()); }
public com.mojang.serialization.Lifecycle getLifecycle() { return wrapperContained.getLifecycle(); }
// public static com.mojang.serialization.Lifecycle getLifecycle() { return net.minecraft.registry.Registry.getLifecycle(); }
public java.lang.Object getOrThrow(yarnwrap.registry.RegistryKey key) { return wrapperContained.getOrThrow(key.wrapperContained); }
// public static java.lang.Object getOrThrow(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.registry.Registry.getOrThrow(key.wrapperContained); }
public java.util.Optional getOrEmpty(yarnwrap.registry.RegistryKey key) { return wrapperContained.getOrEmpty(key.wrapperContained); }
// public static java.util.Optional getOrEmpty(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.registry.Registry.getOrEmpty(key.wrapperContained); }
// public java.lang.Object method_34028(com.mojang.serialization.DynamicOps id) { return wrapperContained.method_34028(id); }
// public static java.lang.Object method_34028(com.mojang.serialization.DynamicOps id, ) { return net.minecraft.registry.Registry.method_34028(id); }
public boolean contains(yarnwrap.registry.RegistryKey key) { return wrapperContained.contains(key.wrapperContained); }
// public static boolean contains(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.registry.Registry.contains(key.wrapperContained); }
// public java.lang.Object register(yarnwrap.registry.Registry registry,yarnwrap.registry.RegistryKey key,java.lang.Object entry) { return wrapperContained.register(registry.wrapperContained,key.wrapperContained,entry); }
// public static java.lang.Object register(yarnwrap.registry.Registry registry,yarnwrap.registry.RegistryKey key,java.lang.Object entry, ) { return net.minecraft.registry.Registry.register(registry.wrapperContained,key.wrapperContained,entry); }
public com.mojang.serialization.Codec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.Codec getCodec() { return net.minecraft.registry.Registry.getCodec(); }
public void populateTags(java.util.Map tagEntries) { wrapperContained.populateTags(tagEntries); }
// public static void populateTags(java.util.Map tagEntries, ) { net.minecraft.registry.Registry.populateTags(tagEntries); }
public Object getOrCreateEntryList(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.getOrCreateEntryList(tag.wrapperContained); }
// public static Object getOrCreateEntryList(yarnwrap.registry.tag.TagKey tag, ) { return net.minecraft.registry.Registry.getOrCreateEntryList(tag.wrapperContained); }
public java.util.Optional getEntry(yarnwrap.registry.RegistryKey key) { return wrapperContained.getEntry(key.wrapperContained); }
// public static java.util.Optional getEntry(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.registry.Registry.getEntry(key.wrapperContained); }
public java.util.Optional getEntry(int rawId) { return wrapperContained.getEntry(rawId); }
// public static java.util.Optional getEntry(int rawId, ) { return net.minecraft.registry.Registry.getEntry(rawId); }
public java.util.Optional getEntryList(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.getEntryList(tag.wrapperContained); }
// public static java.util.Optional getEntryList(yarnwrap.registry.tag.TagKey tag, ) { return net.minecraft.registry.Registry.getEntryList(tag.wrapperContained); }
public Object createEntry(java.lang.Object value) { return wrapperContained.createEntry(value); }
// public static Object createEntry(java.lang.Object value, ) { return net.minecraft.registry.Registry.createEntry(value); }
public java.util.stream.Stream streamEntries() { return wrapperContained.streamEntries(); }
// public static java.util.stream.Stream streamEntries() { return net.minecraft.registry.Registry.streamEntries(); }
public java.util.stream.Stream streamTagsAndEntries() { return wrapperContained.streamTagsAndEntries(); }
// public static java.util.stream.Stream streamTagsAndEntries() { return net.minecraft.registry.Registry.streamTagsAndEntries(); }
public java.util.stream.Stream streamTags() { return wrapperContained.streamTags(); }
// public static java.util.stream.Stream streamTags() { return net.minecraft.registry.Registry.streamTags(); }
public yarnwrap.registry.Registry freeze() { return new yarnwrap.registry.Registry(wrapperContained.freeze()); }
// public static yarnwrap.registry.Registry freeze() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registry.freeze()); }
public void clearTags() { wrapperContained.clearTags(); }
// public static void clearTags() { net.minecraft.registry.Registry.clearTags(); }
public java.lang.Iterable iterateEntries(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.iterateEntries(tag.wrapperContained); }
// public static java.lang.Iterable iterateEntries(yarnwrap.registry.tag.TagKey tag, ) { return net.minecraft.registry.Registry.iterateEntries(tag.wrapperContained); }
public Object entryOf(yarnwrap.registry.RegistryKey key) { return wrapperContained.entryOf(key.wrapperContained); }
// public static Object entryOf(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.registry.Registry.entryOf(key.wrapperContained); }
public com.mojang.serialization.Codec getEntryCodec() { return wrapperContained.getEntryCodec(); }
// public static com.mojang.serialization.Codec getEntryCodec() { return net.minecraft.registry.Registry.getEntryCodec(); }
public yarnwrap.util.collection.IndexedIterable getIndexedEntries() { return new yarnwrap.util.collection.IndexedIterable(wrapperContained.getIndexedEntries()); }
// public static yarnwrap.util.collection.IndexedIterable getIndexedEntries() { return new yarnwrap.util.collection.IndexedIterable(net.minecraft.registry.Registry.getIndexedEntries()); }
public java.util.Set getKeys() { return wrapperContained.getKeys(); }
// public static java.util.Set getKeys() { return net.minecraft.registry.Registry.getKeys(); }
public yarnwrap.registry.entry.RegistryEntryOwner getEntryOwner() { return new yarnwrap.registry.entry.RegistryEntryOwner(wrapperContained.getEntryOwner()); }
// public static yarnwrap.registry.entry.RegistryEntryOwner getEntryOwner() { return new yarnwrap.registry.entry.RegistryEntryOwner(net.minecraft.registry.Registry.getEntryOwner()); }
public Object getReadOnlyWrapper() { return wrapperContained.getReadOnlyWrapper(); }
// public static Object getReadOnlyWrapper() { return net.minecraft.registry.Registry.getReadOnlyWrapper(); }
public Object getTagCreatingWrapper() { return wrapperContained.getTagCreatingWrapper(); }
// public static Object getTagCreatingWrapper() { return net.minecraft.registry.Registry.getTagCreatingWrapper(); }
// public com.mojang.serialization.DataResult method_47448(java.lang.Object value) { return wrapperContained.method_47448(value); }
// public static com.mojang.serialization.DataResult method_47448(java.lang.Object value, ) { return net.minecraft.registry.Registry.method_47448(value); }
public yarnwrap.registry.entry.RegistryEntry getEntry(java.lang.Object value) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getEntry(value)); }
// public static yarnwrap.registry.entry.RegistryEntry getEntry(java.lang.Object value, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.registry.Registry.getEntry(value)); }
// public Object registerReference(yarnwrap.registry.Registry registry,yarnwrap.registry.RegistryKey key,java.lang.Object entry) { return wrapperContained.registerReference(registry.wrapperContained,key.wrapperContained,entry); }
// public static Object registerReference(yarnwrap.registry.Registry registry,yarnwrap.registry.RegistryKey key,java.lang.Object entry, ) { return net.minecraft.registry.Registry.registerReference(registry.wrapperContained,key.wrapperContained,entry); }
// public Object registerReference(yarnwrap.registry.Registry registry,yarnwrap.util.Identifier id,java.lang.Object entry) { return wrapperContained.registerReference(registry.wrapperContained,id.wrapperContained,entry); }
// public static Object registerReference(yarnwrap.registry.Registry registry,yarnwrap.util.Identifier id,java.lang.Object entry, ) { return net.minecraft.registry.Registry.registerReference(registry.wrapperContained,id.wrapperContained,entry); }
public java.util.Optional getEntry(yarnwrap.util.Identifier id) { return wrapperContained.getEntry(id.wrapperContained); }
// public static java.util.Optional getEntry(yarnwrap.util.Identifier id, ) { return net.minecraft.registry.Registry.getEntry(id.wrapperContained); }
public java.util.Optional getRandomEntry(yarnwrap.registry.tag.TagKey tag,yarnwrap.util.math.random.Random random) { return wrapperContained.getRandomEntry(tag.wrapperContained,random.wrapperContained); }
// public static java.util.Optional getRandomEntry(yarnwrap.registry.tag.TagKey tag,yarnwrap.util.math.random.Random random, ) { return net.minecraft.registry.Registry.getRandomEntry(tag.wrapperContained,random.wrapperContained); }
// public java.util.Optional method_56160(yarnwrap.util.math.random.Random entryList) { return wrapperContained.method_56160(entryList.wrapperContained); }
// public static java.util.Optional method_56160(yarnwrap.util.math.random.Random entryList, ) { return net.minecraft.registry.Registry.method_56160(entryList.wrapperContained); }
public java.util.Optional getEntryInfo(yarnwrap.registry.RegistryKey key) { return wrapperContained.getEntryInfo(key.wrapperContained); }
// public static java.util.Optional getEntryInfo(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.registry.Registry.getEntryInfo(key.wrapperContained); }
// public com.mojang.serialization.Codec getReferenceEntryCodec() { return wrapperContained.getReferenceEntryCodec(); }
// public static com.mojang.serialization.Codec getReferenceEntryCodec() { return net.minecraft.registry.Registry.getReferenceEntryCodec(); }
// public com.mojang.serialization.Lifecycle method_57060(Object entry) { return wrapperContained.method_57060(entry); }
// public static com.mojang.serialization.Lifecycle method_57060(Object entry, ) { return net.minecraft.registry.Registry.method_57060(entry); }
// public com.mojang.serialization.DataResult validateReference(yarnwrap.registry.entry.RegistryEntry entry) { return wrapperContained.validateReference(entry.wrapperContained); }
// public static com.mojang.serialization.DataResult validateReference(yarnwrap.registry.entry.RegistryEntry entry, ) { return net.minecraft.registry.Registry.validateReference(entry.wrapperContained); }
// public yarnwrap.util.Identifier method_57062(Object entry) { return new yarnwrap.util.Identifier(wrapperContained.method_57062(entry)); }
// public static yarnwrap.util.Identifier method_57062(Object entry, ) { return new yarnwrap.util.Identifier(net.minecraft.registry.Registry.method_57062(entry)); }
// public yarnwrap.registry.entry.RegistryEntry method_57064(Object entry) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_57064(entry)); }
// public static yarnwrap.registry.entry.RegistryEntry method_57064(Object entry, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.registry.Registry.method_57064(entry)); }
// public com.mojang.serialization.DataResult method_57065(yarnwrap.util.Identifier id) { return wrapperContained.method_57065(id.wrapperContained); }
// public static com.mojang.serialization.DataResult method_57065(yarnwrap.util.Identifier id, ) { return net.minecraft.registry.Registry.method_57065(id.wrapperContained); }
public java.util.Optional getDefaultEntry() { return wrapperContained.getDefaultEntry(); }
// public static java.util.Optional getDefaultEntry() { return net.minecraft.registry.Registry.getDefaultEntry(); }

}