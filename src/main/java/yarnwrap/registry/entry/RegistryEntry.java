package yarnwrap.registry.entry;
public class RegistryEntry { public net.minecraft.registry.entry.RegistryEntry wrapperContained; public RegistryEntry(net.minecraft.registry.entry.RegistryEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isIn(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.isIn(tag.wrapperContained); }
// public static boolean isIn(yarnwrap.registry.tag.TagKey tag, ) { return net.minecraft.registry.entry.RegistryEntry.isIn(tag.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry of(java.lang.Object value) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.of(value)); }
// public static yarnwrap.registry.entry.RegistryEntry of(java.lang.Object value, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.registry.entry.RegistryEntry.of(value)); }
public boolean matches(java.util.function.Predicate predicate) { return wrapperContained.matches(predicate); }
// public static boolean matches(java.util.function.Predicate predicate, ) { return net.minecraft.registry.entry.RegistryEntry.matches(predicate); }
public boolean matchesKey(yarnwrap.registry.RegistryKey key) { return wrapperContained.matchesKey(key.wrapperContained); }
// public static boolean matchesKey(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.registry.entry.RegistryEntry.matchesKey(key.wrapperContained); }
public boolean matchesId(yarnwrap.util.Identifier id) { return wrapperContained.matchesId(id.wrapperContained); }
// public static boolean matchesId(yarnwrap.util.Identifier id, ) { return net.minecraft.registry.entry.RegistryEntry.matchesId(id.wrapperContained); }
public boolean hasKeyAndValue() { return wrapperContained.hasKeyAndValue(); }
// public static boolean hasKeyAndValue() { return net.minecraft.registry.entry.RegistryEntry.hasKeyAndValue(); }
public java.util.stream.Stream streamTags() { return wrapperContained.streamTags(); }
// public static java.util.stream.Stream streamTags() { return net.minecraft.registry.entry.RegistryEntry.streamTags(); }
public com.mojang.datafixers.util.Either getKeyOrValue() { return wrapperContained.getKeyOrValue(); }
// public static com.mojang.datafixers.util.Either getKeyOrValue() { return net.minecraft.registry.entry.RegistryEntry.getKeyOrValue(); }
public java.util.Optional getKey() { return wrapperContained.getKey(); }
// public static java.util.Optional getKey() { return net.minecraft.registry.entry.RegistryEntry.getKey(); }
public Object getType() { return wrapperContained.getType(); }
// public static Object getType() { return net.minecraft.registry.entry.RegistryEntry.getType(); }
public boolean ownerEquals(yarnwrap.registry.entry.RegistryEntryOwner owner) { return wrapperContained.ownerEquals(owner.wrapperContained); }
// public static boolean ownerEquals(yarnwrap.registry.entry.RegistryEntryOwner owner, ) { return net.minecraft.registry.entry.RegistryEntry.ownerEquals(owner.wrapperContained); }
public boolean matches(yarnwrap.registry.entry.RegistryEntry entry) { return wrapperContained.matches(entry.wrapperContained); }
// public static boolean matches(yarnwrap.registry.entry.RegistryEntry entry, ) { return net.minecraft.registry.entry.RegistryEntry.matches(entry.wrapperContained); }
// public java.lang.String method_55839(yarnwrap.registry.RegistryKey key) { return wrapperContained.method_55839(key.wrapperContained); }
// public static java.lang.String method_55839(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.registry.entry.RegistryEntry.method_55839(key.wrapperContained); }
public java.lang.String getIdAsString() { return wrapperContained.getIdAsString(); }
// public static java.lang.String getIdAsString() { return net.minecraft.registry.entry.RegistryEntry.getIdAsString(); }

}