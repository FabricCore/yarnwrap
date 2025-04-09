package yarnwrap.registry;
public class RegistryOps { public net.minecraft.registry.RegistryOps wrapperContained; public RegistryOps(net.minecraft.registry.RegistryOps wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object registryInfoGetter() { return wrapperContained.registryInfoGetter; }
// public yarnwrap.registry.RegistryOps of(com.mojang.serialization.DynamicOps delegate,Object registryInfoGetter) { return new yarnwrap.registry.RegistryOps(wrapperContained.of(delegate,registryInfoGetter)); }
public java.util.Optional getOwner(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.getOwner(registryRef.wrapperContained); }
// // public yarnwrap.registry.RegistryOps of(com.mojang.serialization.DynamicOps delegate,Object wrapperLookup) { return new yarnwrap.registry.RegistryOps(wrapperContained.of(delegate,wrapperLookup)); }
public java.util.Optional getEntryLookup(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.getEntryLookup(registryRef.wrapperContained); }
public com.mojang.serialization.codecs.RecordCodecBuilder getEntryLookupCodec(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.getEntryLookupCodec(registryRef.wrapperContained); }
public com.mojang.serialization.codecs.RecordCodecBuilder getEntryCodec(yarnwrap.registry.RegistryKey key) { return wrapperContained.getEntryCodec(key.wrapperContained); }
// public com.mojang.serialization.Dynamic withRegistry(com.mojang.serialization.Dynamic dynamic,Object registryLookup) { return wrapperContained.withRegistry(dynamic,registryLookup); }
public yarnwrap.registry.RegistryOps withDelegate(com.mojang.serialization.DynamicOps delegate) { return new yarnwrap.registry.RegistryOps(wrapperContained.withDelegate(delegate)); }

}