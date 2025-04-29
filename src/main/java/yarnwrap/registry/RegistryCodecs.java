package yarnwrap.registry;
public class RegistryCodecs { public net.minecraft.registry.RegistryCodecs wrapperContained; public RegistryCodecs(net.minecraft.registry.RegistryCodecs wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec entryList(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.entryList(registryRef.wrapperContained); }
// public static com.mojang.serialization.Codec entryList(yarnwrap.registry.RegistryKey registryRef, ) { return net.minecraft.registry.RegistryCodecs.entryList(registryRef.wrapperContained); }
// public com.mojang.serialization.Codec entryList(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Codec elementCodec) { return wrapperContained.entryList(registryRef.wrapperContained,elementCodec); }
// public static com.mojang.serialization.Codec entryList(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Codec elementCodec, ) { return net.minecraft.registry.RegistryCodecs.entryList(registryRef.wrapperContained,elementCodec); }
// public com.mojang.serialization.Codec entryList(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Codec elementCodec,boolean alwaysSerializeAsList) { return wrapperContained.entryList(registryRef.wrapperContained,elementCodec,alwaysSerializeAsList); }
// public static com.mojang.serialization.Codec entryList(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Codec elementCodec,boolean alwaysSerializeAsList, ) { return net.minecraft.registry.RegistryCodecs.entryList(registryRef.wrapperContained,elementCodec,alwaysSerializeAsList); }
// public com.mojang.serialization.Codec entryList(yarnwrap.registry.RegistryKey registryRef,boolean alwaysSerializeAsList) { return wrapperContained.entryList(registryRef.wrapperContained,alwaysSerializeAsList); }
// public static com.mojang.serialization.Codec entryList(yarnwrap.registry.RegistryKey registryRef,boolean alwaysSerializeAsList, ) { return net.minecraft.registry.RegistryCodecs.entryList(registryRef.wrapperContained,alwaysSerializeAsList); }

}