package yarnwrap.registry.entry;
public class RegistryElementCodec { public net.minecraft.registry.entry.RegistryElementCodec wrapperContained; public RegistryElementCodec(net.minecraft.registry.entry.RegistryElementCodec wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(wrapperContained.registryRef); }
// public void registryRef(yarnwrap.registry.RegistryKey value) { wrapperContained.registryRef = value.wrapperContained; }
// public com.mojang.serialization.Codec elementCodec() { return wrapperContained.elementCodec; }
// public void elementCodec(com.mojang.serialization.Codec value) { wrapperContained.elementCodec = value; }
// public boolean allowInlineDefinitions() { return wrapperContained.allowInlineDefinitions; }
// public void allowInlineDefinitions(boolean value) { wrapperContained.allowInlineDefinitions = value; }
public yarnwrap.registry.entry.RegistryElementCodec of(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Codec elementCodec) { return new yarnwrap.registry.entry.RegistryElementCodec(wrapperContained.of(registryRef.wrapperContained,elementCodec)); }
public yarnwrap.registry.entry.RegistryElementCodec of(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Codec elementCodec,boolean allowInlineDefinitions) { return new yarnwrap.registry.entry.RegistryElementCodec(wrapperContained.of(registryRef.wrapperContained,elementCodec,allowInlineDefinitions)); }

}