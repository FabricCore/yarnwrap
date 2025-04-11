package yarnwrap.registry;
public class RegistryOps { public net.minecraft.registry.RegistryOps wrapperContained; public RegistryOps(net.minecraft.registry.RegistryOps wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object registryInfoGetter() { return wrapperContained.registryInfoGetter; }
// // public void registryInfoGetter(Object value) { wrapperContained.registryInfoGetter = value; }
// public RegistryOps(com.mojang.serialization.DynamicOps delegate,Object registryInfoGetter) { this.wrapperContained = new net.minecraft.registry.RegistryOps(delegate,registryInfoGetter); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public yarnwrap.registry.RegistryOps of(com.mojang.serialization.DynamicOps delegate,Object registryInfoGetter) { return new yarnwrap.registry.RegistryOps(wrapperContained.of(delegate,registryInfoGetter)); }
// public com.mojang.serialization.DataResult method_46626(Object info) { return wrapperContained.method_46626(info); }
public java.util.Optional getOwner(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.getOwner(registryRef.wrapperContained); }
// public java.util.Optional method_46629(yarnwrap.registry.RegistryKey info) { return wrapperContained.method_46629(info.wrapperContained); }
// public com.mojang.serialization.DataResult method_46630(yarnwrap.registry.RegistryKey ops) { return wrapperContained.method_46630(ops.wrapperContained); }
// public com.mojang.serialization.DataResult method_46631(yarnwrap.registry.RegistryKey ops) { return wrapperContained.method_46631(ops.wrapperContained); }
// // public yarnwrap.registry.RegistryOps of(com.mojang.serialization.DynamicOps delegate,Object wrapperLookup) { return new yarnwrap.registry.RegistryOps(wrapperContained.of(delegate,wrapperLookup)); }
// public Object method_46633(java.lang.Object object) { return wrapperContained.method_46633(object); }
public java.util.Optional getEntryLookup(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.getEntryLookup(registryRef.wrapperContained); }
// public yarnwrap.registry.RegistryEntryLookup method_46635(java.lang.Object object) { return new yarnwrap.registry.RegistryEntryLookup(wrapperContained.method_46635(object)); }
public com.mojang.serialization.codecs.RecordCodecBuilder getEntryLookupCodec(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.getEntryLookupCodec(registryRef.wrapperContained); }
public com.mojang.serialization.codecs.RecordCodecBuilder getEntryCodec(yarnwrap.registry.RegistryKey key) { return wrapperContained.getEntryCodec(key.wrapperContained); }
// public com.mojang.serialization.Dynamic withRegistry(com.mojang.serialization.Dynamic dynamic,Object registryLookup) { return wrapperContained.withRegistry(dynamic,registryLookup); }
public yarnwrap.registry.RegistryOps withDelegate(com.mojang.serialization.DynamicOps delegate) { return new yarnwrap.registry.RegistryOps(wrapperContained.withDelegate(delegate)); }

}