package yarnwrap.registry.entry;
public class RegistryEntryList { public net.minecraft.registry.entry.RegistryEntryList wrapperContained; public RegistryEntryList(net.minecraft.registry.entry.RegistryEntryList wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.stream.Stream stream() { return wrapperContained.stream(); }
// public static java.util.stream.Stream stream() { return net.minecraft.registry.entry.RegistryEntryList.stream(); }
public yarnwrap.registry.entry.RegistryEntry get(int index) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.get(index)); }
// public static yarnwrap.registry.entry.RegistryEntry get(int index, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.registry.entry.RegistryEntryList.get(index)); }
public boolean contains(yarnwrap.registry.entry.RegistryEntry entry) { return wrapperContained.contains(entry.wrapperContained); }
// public static boolean contains(yarnwrap.registry.entry.RegistryEntry entry, ) { return net.minecraft.registry.entry.RegistryEntryList.contains(entry.wrapperContained); }
// public Object of(java.util.List entries) { return wrapperContained.of(entries); }
// public static Object of(java.util.List entries, ) { return net.minecraft.registry.entry.RegistryEntryList.of(entries); }
public java.util.Optional getRandom(yarnwrap.util.math.random.Random random) { return wrapperContained.getRandom(random.wrapperContained); }
// public static java.util.Optional getRandom(yarnwrap.util.math.random.Random random, ) { return net.minecraft.registry.entry.RegistryEntryList.getRandom(random.wrapperContained); }
// public Object of(java.util.function.Function mapper,java.util.Collection values) { return wrapperContained.of(mapper,values); }
// public static Object of(java.util.function.Function mapper,java.util.Collection values, ) { return net.minecraft.registry.entry.RegistryEntryList.of(mapper,values); }
// public Object of(java.util.function.Function mapper,java.lang.Object[] values) { return wrapperContained.of(mapper,values); }
// public static Object of(java.util.function.Function mapper,java.lang.Object[] values, ) { return net.minecraft.registry.entry.RegistryEntryList.of(mapper,values); }
// public Object of(net.minecraft.registry.entry.RegistryEntry[] entries) { return wrapperContained.of(entries); }
// public static Object of(net.minecraft.registry.entry.RegistryEntry[] entries, ) { return net.minecraft.registry.entry.RegistryEntryList.of(entries); }
public int size() { return wrapperContained.size(); }
// public static int size() { return net.minecraft.registry.entry.RegistryEntryList.size(); }
public com.mojang.datafixers.util.Either getStorage() { return wrapperContained.getStorage(); }
// public static com.mojang.datafixers.util.Either getStorage() { return net.minecraft.registry.entry.RegistryEntryList.getStorage(); }
// public Object of(yarnwrap.registry.entry.RegistryEntryOwner owner,yarnwrap.registry.tag.TagKey tagKey) { return wrapperContained.of(owner.wrapperContained,tagKey.wrapperContained); }
// public static Object of(yarnwrap.registry.entry.RegistryEntryOwner owner,yarnwrap.registry.tag.TagKey tagKey, ) { return net.minecraft.registry.entry.RegistryEntryList.of(owner.wrapperContained,tagKey.wrapperContained); }
public java.util.Optional getTagKey() { return wrapperContained.getTagKey(); }
// public static java.util.Optional getTagKey() { return net.minecraft.registry.entry.RegistryEntryList.getTagKey(); }
public boolean ownerEquals(yarnwrap.registry.entry.RegistryEntryOwner owner) { return wrapperContained.ownerEquals(owner.wrapperContained); }
// public static boolean ownerEquals(yarnwrap.registry.entry.RegistryEntryOwner owner, ) { return net.minecraft.registry.entry.RegistryEntryList.ownerEquals(owner.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntryList empty() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.empty()); }
public static yarnwrap.registry.entry.RegistryEntryList empty() { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.registry.entry.RegistryEntryList.empty()); }
public boolean isBound() { return wrapperContained.isBound(); }
// public static boolean isBound() { return net.minecraft.registry.entry.RegistryEntryList.isBound(); }

}