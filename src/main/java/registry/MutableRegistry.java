package yarnwrap.registry;
public class MutableRegistry { public net.minecraft.registry.MutableRegistry wrapperContained; public MutableRegistry(net.minecraft.registry.MutableRegistry wrapperContained) { this.wrapperContained = wrapperContained; }

public Object add(yarnwrap.registry.RegistryKey key,java.lang.Object value,yarnwrap.registry.entry.RegistryEntryInfo info) { return wrapperContained.add(key.wrapperContained,value,info.wrapperContained); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public yarnwrap.registry.RegistryEntryLookup createMutableEntryLookup() { return new yarnwrap.registry.RegistryEntryLookup(wrapperContained.createMutableEntryLookup()); }

}