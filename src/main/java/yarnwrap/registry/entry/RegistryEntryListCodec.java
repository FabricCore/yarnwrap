package yarnwrap.registry.entry;
public class RegistryEntryListCodec { public net.minecraft.registry.entry.RegistryEntryListCodec wrapperContained; public RegistryEntryListCodec(net.minecraft.registry.entry.RegistryEntryListCodec wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey registry() { return new yarnwrap.registry.RegistryKey(wrapperContained.registry); }
// public void registry(yarnwrap.registry.RegistryKey value) { wrapperContained.registry = value.wrapperContained; }
// public com.mojang.serialization.Codec entryCodec() { return wrapperContained.entryCodec; }
// public void entryCodec(com.mojang.serialization.Codec value) { wrapperContained.entryCodec = value; }
// public com.mojang.serialization.Codec directEntryListCodec() { return wrapperContained.directEntryListCodec; }
// public void directEntryListCodec(com.mojang.serialization.Codec value) { wrapperContained.directEntryListCodec = value; }
// public com.mojang.serialization.Codec entryListStorageCodec() { return wrapperContained.entryListStorageCodec; }
// public void entryListStorageCodec(com.mojang.serialization.Codec value) { wrapperContained.entryListStorageCodec = value; }
// public com.mojang.serialization.Codec createDirectEntryListCodec(com.mojang.serialization.Codec entryCodec,boolean alwaysSerializeAsList) { return wrapperContained.createDirectEntryListCodec(entryCodec,alwaysSerializeAsList); }
// public com.mojang.serialization.DataResult decodeDirect(com.mojang.serialization.DynamicOps ops,java.lang.Object input) { return wrapperContained.decodeDirect(ops,input); }
public com.mojang.serialization.Codec create(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Codec entryCodec,boolean alwaysSerializeAsList) { return wrapperContained.create(registryRef.wrapperContained,entryCodec,alwaysSerializeAsList); }
// public com.mojang.serialization.DataResult encodeDirect(yarnwrap.registry.entry.RegistryEntryList entryList,com.mojang.serialization.DynamicOps ops,java.lang.Object prefix) { return wrapperContained.encodeDirect(entryList.wrapperContained,ops,prefix); }
// public com.mojang.serialization.DataResult get(yarnwrap.registry.RegistryEntryLookup registry,yarnwrap.registry.tag.TagKey tag) { return wrapperContained.get(registry.wrapperContained,tag.wrapperContained); }

}