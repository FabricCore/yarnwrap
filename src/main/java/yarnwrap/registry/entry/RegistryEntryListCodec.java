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
// public RegistryEntryListCodec(yarnwrap.registry.RegistryKey registry,com.mojang.serialization.Codec entryCodec,boolean alwaysSerializeAsList) { this.wrapperContained = new net.minecraft.registry.entry.RegistryEntryListCodec(registry.wrapperContained,entryCodec,alwaysSerializeAsList); }
public com.mojang.serialization.DataResult decode(com.mojang.serialization.DynamicOps ops,java.lang.Object input) { return wrapperContained.decode(ops,input); }
public com.mojang.serialization.DataResult encode(java.lang.Object entryList,com.mojang.serialization.DynamicOps ops,java.lang.Object prefix) { return wrapperContained.encode(entryList,ops,prefix); }
// public java.util.List method_40380(com.mojang.datafixers.util.Either either) { return wrapperContained.method_40380(either); }
// public com.mojang.serialization.DataResult method_40381(com.mojang.datafixers.util.Pair pair) { return wrapperContained.method_40381(pair); }
// public com.mojang.serialization.Codec createDirectEntryListCodec(com.mojang.serialization.Codec entryCodec,boolean alwaysSerializeAsList) { return wrapperContained.createDirectEntryListCodec(entryCodec,alwaysSerializeAsList); }
// public com.mojang.serialization.DataResult decodeDirect(com.mojang.serialization.DynamicOps ops,java.lang.Object input) { return wrapperContained.decodeDirect(ops,input); }
// public com.mojang.serialization.DataResult method_40385(yarnwrap.registry.RegistryEntryLookup tag) { return wrapperContained.method_40385(tag.wrapperContained); }
// public com.mojang.serialization.DataResult method_40386(yarnwrap.registry.RegistryEntryLookup pair) { return wrapperContained.method_40386(pair.wrapperContained); }
// public com.mojang.datafixers.util.Either method_40387(java.util.List entries) { return wrapperContained.method_40387(entries); }
public com.mojang.serialization.Codec create(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Codec entryCodec,boolean alwaysSerializeAsList) { return wrapperContained.create(registryRef.wrapperContained,entryCodec,alwaysSerializeAsList); }
// public com.mojang.serialization.DataResult encodeDirect(yarnwrap.registry.entry.RegistryEntryList entryList,com.mojang.serialization.DynamicOps ops,java.lang.Object prefix) { return wrapperContained.encodeDirect(entryList.wrapperContained,ops,prefix); }
// public java.util.List method_40390(java.util.List entries) { return wrapperContained.method_40390(entries); }
// public com.mojang.datafixers.util.Pair method_58028(com.mojang.datafixers.util.Pair entries) { return wrapperContained.method_58028(entries); }
// public com.mojang.serialization.DataResult get(yarnwrap.registry.RegistryEntryLookup registry,yarnwrap.registry.tag.TagKey tag) { return wrapperContained.get(registry.wrapperContained,tag.wrapperContained); }
// public com.mojang.serialization.DataResult method_58030(java.util.List entries) { return wrapperContained.method_58030(entries); }

}