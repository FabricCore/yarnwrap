package yarnwrap.registry;
public class Registerable { public net.minecraft.registry.Registerable wrapperContained; public Registerable(net.minecraft.registry.Registerable wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryEntryLookup getRegistryLookup(yarnwrap.registry.RegistryKey registryRef) { return new yarnwrap.registry.RegistryEntryLookup(wrapperContained.getRegistryLookup(registryRef.wrapperContained)); }
// public static yarnwrap.registry.RegistryEntryLookup getRegistryLookup(yarnwrap.registry.RegistryKey registryRef, ) { return new yarnwrap.registry.RegistryEntryLookup(net.minecraft.registry.Registerable.getRegistryLookup(registryRef.wrapperContained)); }
public Object register(yarnwrap.registry.RegistryKey key,java.lang.Object value,com.mojang.serialization.Lifecycle lifecycle) { return wrapperContained.register(key.wrapperContained,value,lifecycle); }
// public static Object register(yarnwrap.registry.RegistryKey key,java.lang.Object value,com.mojang.serialization.Lifecycle lifecycle, ) { return net.minecraft.registry.Registerable.register(key.wrapperContained,value,lifecycle); }
public Object register(yarnwrap.registry.RegistryKey key,java.lang.Object value) { return wrapperContained.register(key.wrapperContained,value); }
// public static Object register(yarnwrap.registry.RegistryKey key,java.lang.Object value, ) { return net.minecraft.registry.Registerable.register(key.wrapperContained,value); }

}