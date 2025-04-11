package yarnwrap.registry.tag;
public class TagKey { public net.minecraft.registry.tag.TagKey wrapperContained; public TagKey(net.minecraft.registry.tag.TagKey wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public com.google.common.collect.Interner INTERNER() { return wrapperContained.INTERNER; }
// public void INTERNER(com.google.common.collect.Interner value) { wrapperContained.INTERNER = value; }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id()); }
public com.mojang.serialization.Codec unprefixedCodec(yarnwrap.registry.RegistryKey registry) { return wrapperContained.unprefixedCodec(registry.wrapperContained); }
public yarnwrap.registry.tag.TagKey of(yarnwrap.registry.RegistryKey registry,yarnwrap.util.Identifier id) { return new yarnwrap.registry.tag.TagKey(wrapperContained.of(registry.wrapperContained,id.wrapperContained)); }
public com.mojang.serialization.Codec codec(yarnwrap.registry.RegistryKey registry) { return wrapperContained.codec(registry.wrapperContained); }
public boolean isOf(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.isOf(registryRef.wrapperContained); }
public java.util.Optional tryCast(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.tryCast(registryRef.wrapperContained); }

}