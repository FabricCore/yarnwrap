package yarnwrap.registry.tag;
public class TagKey { public net.minecraft.registry.tag.TagKey wrapperContained; public TagKey(net.minecraft.registry.tag.TagKey wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(wrapperContained.registryRef); }
// public void registryRef(yarnwrap.registry.RegistryKey value) { wrapperContained.registryRef = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(net.minecraft.registry.tag.TagKey.registryRef); }
// public static void registryRef(yarnwrap.registry.RegistryKey value, ) { net.minecraft.registry.tag.TagKey.registryRef = value.wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.registry.tag.TagKey.id); }
// public static void id(yarnwrap.util.Identifier value, ) { net.minecraft.registry.tag.TagKey.id = value.wrapperContained; }

// public com.google.common.collect.Interner INTERNER() { return wrapperContained.INTERNER; }
// public void INTERNER(com.google.common.collect.Interner value) { wrapperContained.INTERNER = value; }
// public static com.google.common.collect.Interner INTERNER() { return net.minecraft.registry.tag.TagKey.INTERNER; }
// public static void INTERNER(com.google.common.collect.Interner value, ) { net.minecraft.registry.tag.TagKey.INTERNER = value; }

public TagKey(yarnwrap.registry.RegistryKey registryRef,yarnwrap.util.Identifier id) { this.wrapperContained = new net.minecraft.registry.tag.TagKey(registryRef.wrapperContained,id.wrapperContained); }
// public yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(wrapperContained.registryRef()); }
// // public static yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(net.minecraft.registry.tag.TagKey.registryRef()); }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id()); }
// // public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.registry.tag.TagKey.id()); }
// public java.lang.String method_40089(yarnwrap.registry.tag.TagKey string) { return wrapperContained.method_40089(string.wrapperContained); }
// public static java.lang.String method_40089(yarnwrap.registry.tag.TagKey string, ) { return net.minecraft.registry.tag.TagKey.method_40089(string.wrapperContained); }
// public com.mojang.serialization.Codec unprefixedCodec(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.unprefixedCodec(registryRef.wrapperContained); }
// public static com.mojang.serialization.Codec unprefixedCodec(yarnwrap.registry.RegistryKey registryRef, ) { return net.minecraft.registry.tag.TagKey.unprefixedCodec(registryRef.wrapperContained); }
// public com.mojang.serialization.DataResult method_40091(yarnwrap.registry.RegistryKey string) { return wrapperContained.method_40091(string.wrapperContained); }
// public static com.mojang.serialization.DataResult method_40091(yarnwrap.registry.RegistryKey string, ) { return net.minecraft.registry.tag.TagKey.method_40091(string.wrapperContained); }
// public yarnwrap.registry.tag.TagKey of(yarnwrap.registry.RegistryKey registryRef,yarnwrap.util.Identifier id) { return new yarnwrap.registry.tag.TagKey(wrapperContained.of(registryRef.wrapperContained,id.wrapperContained)); }
// public static yarnwrap.registry.tag.TagKey of(yarnwrap.registry.RegistryKey registryRef,yarnwrap.util.Identifier id, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.registry.tag.TagKey.of(registryRef.wrapperContained,id.wrapperContained)); }
// public com.mojang.serialization.Codec codec(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.codec(registryRef.wrapperContained); }
// public static com.mojang.serialization.Codec codec(yarnwrap.registry.RegistryKey registryRef, ) { return net.minecraft.registry.tag.TagKey.codec(registryRef.wrapperContained); }
// public yarnwrap.registry.tag.TagKey method_40094(yarnwrap.registry.RegistryKey id) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_40094(id.wrapperContained)); }
// public static yarnwrap.registry.tag.TagKey method_40094(yarnwrap.registry.RegistryKey id, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.registry.tag.TagKey.method_40094(id.wrapperContained)); }
// public yarnwrap.registry.tag.TagKey method_40095(yarnwrap.registry.RegistryKey id) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_40095(id.wrapperContained)); }
// public static yarnwrap.registry.tag.TagKey method_40095(yarnwrap.registry.RegistryKey id, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.registry.tag.TagKey.method_40095(id.wrapperContained)); }
public boolean isOf(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.isOf(registryRef.wrapperContained); }
// public static boolean isOf(yarnwrap.registry.RegistryKey registryRef, ) { return net.minecraft.registry.tag.TagKey.isOf(registryRef.wrapperContained); }
public java.util.Optional tryCast(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.tryCast(registryRef.wrapperContained); }
// public static java.util.Optional tryCast(yarnwrap.registry.RegistryKey registryRef, ) { return net.minecraft.registry.tag.TagKey.tryCast(registryRef.wrapperContained); }
// public yarnwrap.registry.tag.TagKey method_64142(yarnwrap.registry.RegistryKey id) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_64142(id.wrapperContained)); }
// public static yarnwrap.registry.tag.TagKey method_64142(yarnwrap.registry.RegistryKey id, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.registry.tag.TagKey.method_64142(id.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec packetCodec(yarnwrap.registry.RegistryKey registryRef) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.packetCodec(registryRef.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec packetCodec(yarnwrap.registry.RegistryKey registryRef, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.registry.tag.TagKey.packetCodec(registryRef.wrapperContained)); }

}