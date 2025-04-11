package yarnwrap.registry.entry;
public class RegistryEntry { public net.minecraft.registry.entry.RegistryEntry wrapperContained; public RegistryEntry(net.minecraft.registry.entry.RegistryEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isIn(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.isIn(tag.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry of(java.lang.Object value) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.of(value)); }
public boolean matches(java.util.function.Predicate predicate) { return wrapperContained.matches(predicate); }
public boolean matchesKey(yarnwrap.registry.RegistryKey key) { return wrapperContained.matchesKey(key.wrapperContained); }
public boolean matchesId(yarnwrap.util.Identifier id) { return wrapperContained.matchesId(id.wrapperContained); }
public boolean hasKeyAndValue() { return wrapperContained.hasKeyAndValue(); }
public java.util.stream.Stream streamTags() { return wrapperContained.streamTags(); }
public com.mojang.datafixers.util.Either getKeyOrValue() { return wrapperContained.getKeyOrValue(); }
public java.util.Optional getKey() { return wrapperContained.getKey(); }
public Object getType() { return wrapperContained.getType(); }
public boolean ownerEquals(yarnwrap.registry.entry.RegistryEntryOwner owner) { return wrapperContained.ownerEquals(owner.wrapperContained); }
public boolean matches(yarnwrap.registry.entry.RegistryEntry entry) { return wrapperContained.matches(entry.wrapperContained); }
public java.lang.String getIdAsString() { return wrapperContained.getIdAsString(); }

}