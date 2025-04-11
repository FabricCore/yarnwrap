package yarnwrap.registry.entry;
public class RegistryElementCodec { public net.minecraft.registry.entry.RegistryElementCodec wrapperContained; public RegistryElementCodec(net.minecraft.registry.entry.RegistryElementCodec wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(wrapperContained.registryRef); }
// public void registryRef(yarnwrap.registry.RegistryKey value) { wrapperContained.registryRef = value.wrapperContained; }
// public com.mojang.serialization.Codec elementCodec() { return wrapperContained.elementCodec; }
// public void elementCodec(com.mojang.serialization.Codec value) { wrapperContained.elementCodec = value; }
// public boolean allowInlineDefinitions() { return wrapperContained.allowInlineDefinitions; }
// public void allowInlineDefinitions(boolean value) { wrapperContained.allowInlineDefinitions = value; }
// public RegistryElementCodec(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Codec elementCodec,boolean allowInlineDefinitions) { this.wrapperContained = new net.minecraft.registry.entry.RegistryElementCodec(registryRef.wrapperContained,elementCodec,allowInlineDefinitions); }
public com.mojang.serialization.DataResult decode(com.mojang.serialization.DynamicOps ops,java.lang.Object input) { return wrapperContained.decode(ops,input); }
public com.mojang.serialization.DataResult encode(java.lang.Object input,com.mojang.serialization.DynamicOps ops,java.lang.Object prefix) { return wrapperContained.encode(input,ops,prefix); }
// public com.mojang.datafixers.util.Pair method_29746(com.mojang.datafixers.util.Pair pair) { return wrapperContained.method_29746(pair); }
public yarnwrap.registry.entry.RegistryElementCodec of(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Codec elementCodec) { return new yarnwrap.registry.entry.RegistryElementCodec(wrapperContained.of(registryRef.wrapperContained,elementCodec)); }
public yarnwrap.registry.entry.RegistryElementCodec of(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Codec elementCodec,boolean allowInlineDefinitions) { return new yarnwrap.registry.entry.RegistryElementCodec(wrapperContained.of(registryRef.wrapperContained,elementCodec,allowInlineDefinitions)); }
// public com.mojang.serialization.DataResult method_40392(com.mojang.serialization.DynamicOps value) { return wrapperContained.method_40392(value); }
// public com.mojang.serialization.DataResult method_40393(com.mojang.serialization.DynamicOps key) { return wrapperContained.method_40393(key); }
// public com.mojang.datafixers.util.Pair method_40394(com.mojang.datafixers.util.Pair pair) { return wrapperContained.method_40394(pair); }

}