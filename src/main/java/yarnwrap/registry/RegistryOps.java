package yarnwrap.registry;
public class RegistryOps { public net.minecraft.registry.RegistryOps wrapperContained; public RegistryOps(net.minecraft.registry.RegistryOps wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object registryInfoGetter() { return wrapperContained.registryInfoGetter; }
// // public void registryInfoGetter(Object value) { wrapperContained.registryInfoGetter = value; }
// // public static Object registryInfoGetter() { return net.minecraft.registry.RegistryOps.registryInfoGetter; }
// // public static void registryInfoGetter(Object value, ) { net.minecraft.registry.RegistryOps.registryInfoGetter = value; }

// public RegistryOps(com.mojang.serialization.DynamicOps delegate,Object registryInfoGetter) { this.wrapperContained = new net.minecraft.registry.RegistryOps(delegate,registryInfoGetter); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.registry.RegistryOps.equals(o); }
// public yarnwrap.registry.RegistryOps of(com.mojang.serialization.DynamicOps delegate,Object registryInfoGetter) { return new yarnwrap.registry.RegistryOps(wrapperContained.of(delegate,registryInfoGetter)); }
// public static yarnwrap.registry.RegistryOps of(com.mojang.serialization.DynamicOps delegate,Object registryInfoGetter, ) { return new yarnwrap.registry.RegistryOps(net.minecraft.registry.RegistryOps.of(delegate,registryInfoGetter)); }
// public com.mojang.serialization.DataResult method_46626(Object info) { return wrapperContained.method_46626(info); }
// public static com.mojang.serialization.DataResult method_46626(Object info, ) { return net.minecraft.registry.RegistryOps.method_46626(info); }
public java.util.Optional getOwner(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.getOwner(registryRef.wrapperContained); }
// public static java.util.Optional getOwner(yarnwrap.registry.RegistryKey registryRef, ) { return net.minecraft.registry.RegistryOps.getOwner(registryRef.wrapperContained); }
// public java.util.Optional method_46629(yarnwrap.registry.RegistryKey info) { return wrapperContained.method_46629(info.wrapperContained); }
// public static java.util.Optional method_46629(yarnwrap.registry.RegistryKey info, ) { return net.minecraft.registry.RegistryOps.method_46629(info.wrapperContained); }
// public com.mojang.serialization.DataResult method_46630(yarnwrap.registry.RegistryKey ops) { return wrapperContained.method_46630(ops.wrapperContained); }
// public static com.mojang.serialization.DataResult method_46630(yarnwrap.registry.RegistryKey ops, ) { return net.minecraft.registry.RegistryOps.method_46630(ops.wrapperContained); }
// public com.mojang.serialization.DataResult method_46631(yarnwrap.registry.RegistryKey ops) { return wrapperContained.method_46631(ops.wrapperContained); }
// public static com.mojang.serialization.DataResult method_46631(yarnwrap.registry.RegistryKey ops, ) { return net.minecraft.registry.RegistryOps.method_46631(ops.wrapperContained); }
// // public yarnwrap.registry.RegistryOps of(com.mojang.serialization.DynamicOps delegate,Object registries) { return new yarnwrap.registry.RegistryOps(wrapperContained.of(delegate,registries)); }
// // public static yarnwrap.registry.RegistryOps of(com.mojang.serialization.DynamicOps delegate,Object registries, ) { return new yarnwrap.registry.RegistryOps(net.minecraft.registry.RegistryOps.of(delegate,registries)); }
// public Object method_46633(java.lang.Object object) { return wrapperContained.method_46633(object); }
// public static Object method_46633(java.lang.Object object, ) { return net.minecraft.registry.RegistryOps.method_46633(object); }
public java.util.Optional getEntryLookup(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.getEntryLookup(registryRef.wrapperContained); }
// public static java.util.Optional getEntryLookup(yarnwrap.registry.RegistryKey registryRef, ) { return net.minecraft.registry.RegistryOps.getEntryLookup(registryRef.wrapperContained); }
// public yarnwrap.registry.RegistryEntryLookup method_46635(java.lang.Object object) { return new yarnwrap.registry.RegistryEntryLookup(wrapperContained.method_46635(object)); }
// public static yarnwrap.registry.RegistryEntryLookup method_46635(java.lang.Object object, ) { return new yarnwrap.registry.RegistryEntryLookup(net.minecraft.registry.RegistryOps.method_46635(object)); }
// public com.mojang.serialization.codecs.RecordCodecBuilder getEntryLookupCodec(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.getEntryLookupCodec(registryRef.wrapperContained); }
// public static com.mojang.serialization.codecs.RecordCodecBuilder getEntryLookupCodec(yarnwrap.registry.RegistryKey registryRef, ) { return net.minecraft.registry.RegistryOps.getEntryLookupCodec(registryRef.wrapperContained); }
// public com.mojang.serialization.codecs.RecordCodecBuilder getEntryCodec(yarnwrap.registry.RegistryKey key) { return wrapperContained.getEntryCodec(key.wrapperContained); }
// public static com.mojang.serialization.codecs.RecordCodecBuilder getEntryCodec(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.registry.RegistryOps.getEntryCodec(key.wrapperContained); }
// public com.mojang.serialization.Dynamic withRegistry(com.mojang.serialization.Dynamic dynamic,Object registries) { return wrapperContained.withRegistry(dynamic,registries); }
// public static com.mojang.serialization.Dynamic withRegistry(com.mojang.serialization.Dynamic dynamic,Object registries, ) { return net.minecraft.registry.RegistryOps.withRegistry(dynamic,registries); }
public yarnwrap.registry.RegistryOps withDelegate(com.mojang.serialization.DynamicOps delegate) { return new yarnwrap.registry.RegistryOps(wrapperContained.withDelegate(delegate)); }
// public static yarnwrap.registry.RegistryOps withDelegate(com.mojang.serialization.DynamicOps delegate, ) { return new yarnwrap.registry.RegistryOps(net.minecraft.registry.RegistryOps.withDelegate(delegate)); }

}