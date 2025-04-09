package yarnwrap.registry;
public class Registry { public net.minecraft.registry.Registry wrapperContained; public Registry(net.minecraft.registry.Registry wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.stream.Stream stream() { return wrapperContained.stream(); }
public yarnwrap.util.Identifier getId(java.lang.Object value) { return new yarnwrap.util.Identifier(wrapperContained.getId(value)); }
public java.lang.Object get(yarnwrap.util.Identifier id) { return wrapperContained.get(id.wrapperContained); }
// public java.lang.Object register(yarnwrap.registry.Registry registry,java.lang.String id,java.lang.Object entry) { return wrapperContained.register(registry.wrapperContained,id,entry); }
// public java.lang.Object register(yarnwrap.registry.Registry registry,yarnwrap.util.Identifier id,java.lang.Object entry) { return wrapperContained.register(registry.wrapperContained,id.wrapperContained,entry); }
public java.util.Set getIds() { return wrapperContained.getIds(); }
public java.util.Optional getRandom(yarnwrap.util.math.random.Random random) { return wrapperContained.getRandom(random.wrapperContained); }
public boolean containsId(yarnwrap.util.Identifier id) { return wrapperContained.containsId(id.wrapperContained); }
public java.util.Optional getOrEmpty(yarnwrap.util.Identifier id) { return wrapperContained.getOrEmpty(id.wrapperContained); }
public java.lang.Object get(yarnwrap.registry.RegistryKey key) { return wrapperContained.get(key.wrapperContained); }
public java.util.Optional getKey(java.lang.Object entry) { return wrapperContained.getKey(entry); }
public java.util.Set getEntrySet() { return wrapperContained.getEntrySet(); }
public yarnwrap.registry.RegistryKey getKey() { return new yarnwrap.registry.RegistryKey(wrapperContained.getKey()); }
public com.mojang.serialization.Lifecycle getLifecycle() { return wrapperContained.getLifecycle(); }
public java.lang.Object getOrThrow(yarnwrap.registry.RegistryKey key) { return wrapperContained.getOrThrow(key.wrapperContained); }
public java.util.Optional getOrEmpty(yarnwrap.registry.RegistryKey key) { return wrapperContained.getOrEmpty(key.wrapperContained); }
public boolean contains(yarnwrap.registry.RegistryKey key) { return wrapperContained.contains(key.wrapperContained); }
// public java.lang.Object register(yarnwrap.registry.Registry registry,yarnwrap.registry.RegistryKey key,java.lang.Object entry) { return wrapperContained.register(registry.wrapperContained,key.wrapperContained,entry); }
public com.mojang.serialization.Codec getCodec() { return wrapperContained.getCodec(); }
public void populateTags(java.util.Map tagEntries) { wrapperContained.populateTags(tagEntries); }
public Object getOrCreateEntryList(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.getOrCreateEntryList(tag.wrapperContained); }
public java.util.Optional getEntry(yarnwrap.registry.RegistryKey key) { return wrapperContained.getEntry(key.wrapperContained); }
public java.util.Optional getEntry(int rawId) { return wrapperContained.getEntry(rawId); }
public java.util.Optional getEntryList(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.getEntryList(tag.wrapperContained); }
public Object createEntry(java.lang.Object value) { return wrapperContained.createEntry(value); }
public java.util.stream.Stream streamEntries() { return wrapperContained.streamEntries(); }
public java.util.stream.Stream streamTagsAndEntries() { return wrapperContained.streamTagsAndEntries(); }
public java.util.stream.Stream streamTags() { return wrapperContained.streamTags(); }
public yarnwrap.registry.Registry freeze() { return new yarnwrap.registry.Registry(wrapperContained.freeze()); }
public void clearTags() { wrapperContained.clearTags(); }
public java.lang.Iterable iterateEntries(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.iterateEntries(tag.wrapperContained); }
public Object entryOf(yarnwrap.registry.RegistryKey key) { return wrapperContained.entryOf(key.wrapperContained); }
public com.mojang.serialization.Codec getEntryCodec() { return wrapperContained.getEntryCodec(); }
public yarnwrap.util.collection.IndexedIterable getIndexedEntries() { return new yarnwrap.util.collection.IndexedIterable(wrapperContained.getIndexedEntries()); }
public java.util.Set getKeys() { return wrapperContained.getKeys(); }
public yarnwrap.registry.entry.RegistryEntryOwner getEntryOwner() { return new yarnwrap.registry.entry.RegistryEntryOwner(wrapperContained.getEntryOwner()); }
public Object getReadOnlyWrapper() { return wrapperContained.getReadOnlyWrapper(); }
public Object getTagCreatingWrapper() { return wrapperContained.getTagCreatingWrapper(); }
public yarnwrap.registry.entry.RegistryEntry getEntry(java.lang.Object value) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getEntry(value)); }
// public Object registerReference(yarnwrap.registry.Registry registry,yarnwrap.registry.RegistryKey key,java.lang.Object entry) { return wrapperContained.registerReference(registry.wrapperContained,key.wrapperContained,entry); }
// public Object registerReference(yarnwrap.registry.Registry registry,yarnwrap.util.Identifier id,java.lang.Object entry) { return wrapperContained.registerReference(registry.wrapperContained,id.wrapperContained,entry); }
public java.util.Optional getEntry(yarnwrap.util.Identifier id) { return wrapperContained.getEntry(id.wrapperContained); }
public java.util.Optional getRandomEntry(yarnwrap.registry.tag.TagKey tag,yarnwrap.util.math.random.Random random) { return wrapperContained.getRandomEntry(tag.wrapperContained,random.wrapperContained); }
public java.util.Optional getEntryInfo(yarnwrap.registry.RegistryKey key) { return wrapperContained.getEntryInfo(key.wrapperContained); }
// public com.mojang.serialization.Codec getReferenceEntryCodec() { return wrapperContained.getReferenceEntryCodec(); }
// public com.mojang.serialization.DataResult validateReference(yarnwrap.registry.entry.RegistryEntry entry) { return wrapperContained.validateReference(entry.wrapperContained); }
public java.util.Optional getDefaultEntry() { return wrapperContained.getDefaultEntry(); }

}