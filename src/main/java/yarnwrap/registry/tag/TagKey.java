package yarnwrap.registry.tag;
public class TagKey { public net.minecraft.registry.tag.TagKey wrapperContained; public TagKey(net.minecraft.registry.tag.TagKey wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.registry.tag.TagKey.id); }
// public static void id(yarnwrap.util.Identifier value, ) { net.minecraft.registry.tag.TagKey.id = value.wrapperContained; }

// public com.google.common.collect.Interner INTERNER() { return wrapperContained.INTERNER; }
// public void INTERNER(com.google.common.collect.Interner value) { wrapperContained.INTERNER = value; }
// public static com.google.common.collect.Interner INTERNER() { return net.minecraft.registry.tag.TagKey.INTERNER; }
// public static void INTERNER(com.google.common.collect.Interner value, ) { net.minecraft.registry.tag.TagKey.INTERNER = value; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id()); }
// // public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.registry.tag.TagKey.id()); }
// public java.lang.String method_40089(yarnwrap.registry.tag.TagKey string) { return wrapperContained.method_40089(string.wrapperContained); }
// public static java.lang.String method_40089(yarnwrap.registry.tag.TagKey string, ) { return net.minecraft.registry.tag.TagKey.method_40089(string.wrapperContained); }
// public com.mojang.serialization.Codec unprefixedCodec(yarnwrap.registry.RegistryKey registry) { return wrapperContained.unprefixedCodec(registry.wrapperContained); }
// public static com.mojang.serialization.Codec unprefixedCodec(yarnwrap.registry.RegistryKey registry, ) { return net.minecraft.registry.tag.TagKey.unprefixedCodec(registry.wrapperContained); }
// public com.mojang.serialization.DataResult method_40091(yarnwrap.registry.RegistryKey string) { return wrapperContained.method_40091(string.wrapperContained); }
// public static com.mojang.serialization.DataResult method_40091(yarnwrap.registry.RegistryKey string, ) { return net.minecraft.registry.tag.TagKey.method_40091(string.wrapperContained); }
// public yarnwrap.registry.tag.TagKey of(yarnwrap.registry.RegistryKey registry,yarnwrap.util.Identifier id) { return new yarnwrap.registry.tag.TagKey(wrapperContained.of(registry.wrapperContained,id.wrapperContained)); }
// public static yarnwrap.registry.tag.TagKey of(yarnwrap.registry.RegistryKey registry,yarnwrap.util.Identifier id, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.registry.tag.TagKey.of(registry.wrapperContained,id.wrapperContained)); }
// public com.mojang.serialization.Codec codec(yarnwrap.registry.RegistryKey registry) { return wrapperContained.codec(registry.wrapperContained); }
// public static com.mojang.serialization.Codec codec(yarnwrap.registry.RegistryKey registry, ) { return net.minecraft.registry.tag.TagKey.codec(registry.wrapperContained); }
// public yarnwrap.registry.tag.TagKey method_40094(yarnwrap.registry.RegistryKey id) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_40094(id.wrapperContained)); }
// public static yarnwrap.registry.tag.TagKey method_40094(yarnwrap.registry.RegistryKey id, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.registry.tag.TagKey.method_40094(id.wrapperContained)); }
// public yarnwrap.registry.tag.TagKey method_40095(yarnwrap.registry.RegistryKey id) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_40095(id.wrapperContained)); }
// public static yarnwrap.registry.tag.TagKey method_40095(yarnwrap.registry.RegistryKey id, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.registry.tag.TagKey.method_40095(id.wrapperContained)); }
public boolean isOf(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.isOf(registryRef.wrapperContained); }
// public static boolean isOf(yarnwrap.registry.RegistryKey registryRef, ) { return net.minecraft.registry.tag.TagKey.isOf(registryRef.wrapperContained); }
public java.util.Optional tryCast(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.tryCast(registryRef.wrapperContained); }
// public static java.util.Optional tryCast(yarnwrap.registry.RegistryKey registryRef, ) { return net.minecraft.registry.tag.TagKey.tryCast(registryRef.wrapperContained); }

}