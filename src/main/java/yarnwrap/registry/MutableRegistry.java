package yarnwrap.registry;
public class MutableRegistry { public net.minecraft.registry.MutableRegistry wrapperContained; public MutableRegistry(net.minecraft.registry.MutableRegistry wrapperContained) { this.wrapperContained = wrapperContained; }

public Object add(yarnwrap.registry.RegistryKey key,java.lang.Object value,yarnwrap.registry.entry.RegistryEntryInfo info) { return wrapperContained.add(key.wrapperContained,value,info.wrapperContained); }
// public static Object add(yarnwrap.registry.RegistryKey key,java.lang.Object value,yarnwrap.registry.entry.RegistryEntryInfo info, ) { return net.minecraft.registry.MutableRegistry.add(key.wrapperContained,value,info.wrapperContained); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.registry.MutableRegistry.isEmpty(); }
public yarnwrap.registry.RegistryEntryLookup createMutableRegistryLookup() { return new yarnwrap.registry.RegistryEntryLookup(wrapperContained.createMutableRegistryLookup()); }
// public static yarnwrap.registry.RegistryEntryLookup createMutableRegistryLookup() { return new yarnwrap.registry.RegistryEntryLookup(net.minecraft.registry.MutableRegistry.createMutableRegistryLookup()); }
public void setEntries(yarnwrap.registry.tag.TagKey tag,java.util.List entries) { wrapperContained.setEntries(tag.wrapperContained,entries); }
// public static void setEntries(yarnwrap.registry.tag.TagKey tag,java.util.List entries, ) { net.minecraft.registry.MutableRegistry.setEntries(tag.wrapperContained,entries); }

}