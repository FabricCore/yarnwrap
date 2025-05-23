package yarnwrap.component.type;
public class NbtComponent { public net.minecraft.component.type.NbtComponent wrapperContained; public NbtComponent(net.minecraft.component.type.NbtComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.type.NbtComponent DEFAULT() { return new yarnwrap.component.type.NbtComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.NbtComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.NbtComponent DEFAULT() { return new yarnwrap.component.type.NbtComponent(net.minecraft.component.type.NbtComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.NbtComponent value, ) { net.minecraft.component.type.NbtComponent.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.NbtComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.NbtComponent.CODEC = value; }

// public com.mojang.serialization.Codec CODEC_WITH_ID() { return wrapperContained.CODEC_WITH_ID; }
// public void CODEC_WITH_ID(com.mojang.serialization.Codec value) { wrapperContained.CODEC_WITH_ID = value; }
public static com.mojang.serialization.Codec CODEC_WITH_ID() { return net.minecraft.component.type.NbtComponent.CODEC_WITH_ID; }
// public static void CODEC_WITH_ID(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.NbtComponent.CODEC_WITH_ID = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.NbtComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.NbtComponent.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt); }
// public void nbt(yarnwrap.nbt.NbtCompound value) { wrapperContained.nbt = value.wrapperContained; }
// public static yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.component.type.NbtComponent.nbt); }
// public static void nbt(yarnwrap.nbt.NbtCompound value, ) { net.minecraft.component.type.NbtComponent.nbt = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.component.type.NbtComponent.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.component.type.NbtComponent.LOGGER = value; }

// public java.lang.String ID_KEY() { return wrapperContained.ID_KEY; }
// public void ID_KEY(java.lang.String value) { wrapperContained.ID_KEY = value; }
// public static java.lang.String ID_KEY() { return net.minecraft.component.type.NbtComponent.ID_KEY; }
// public static void ID_KEY(java.lang.String value, ) { net.minecraft.component.type.NbtComponent.ID_KEY = value; }

// public NbtComponent(yarnwrap.nbt.NbtCompound nbt) { this.wrapperContained = new net.minecraft.component.type.NbtComponent(nbt.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.component.type.NbtComponent.equals(o); }
public int getSize() { return wrapperContained.getSize(); }
// public static int getSize() { return net.minecraft.component.type.NbtComponent.getSize(); }
public void applyToEntity(yarnwrap.entity.Entity entity) { wrapperContained.applyToEntity(entity.wrapperContained); }
// public static void applyToEntity(yarnwrap.entity.Entity entity, ) { net.minecraft.component.type.NbtComponent.applyToEntity(entity.wrapperContained); }
public com.mojang.serialization.DataResult get(com.mojang.serialization.MapDecoder decoder) { return wrapperContained.get(decoder); }
// public static com.mojang.serialization.DataResult get(com.mojang.serialization.MapDecoder decoder, ) { return net.minecraft.component.type.NbtComponent.get(decoder); }
public com.mojang.serialization.DataResult with(com.mojang.serialization.DynamicOps ops,com.mojang.serialization.MapEncoder encoder,java.lang.Object value) { return wrapperContained.with(ops,encoder,value); }
// public static com.mojang.serialization.DataResult with(com.mojang.serialization.DynamicOps ops,com.mojang.serialization.MapEncoder encoder,java.lang.Object value, ) { return net.minecraft.component.type.NbtComponent.with(ops,encoder,value); }
// public yarnwrap.nbt.NbtCompound method_57448(yarnwrap.component.type.NbtComponent component) { return new yarnwrap.nbt.NbtCompound(wrapperContained.method_57448(component.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound method_57448(yarnwrap.component.type.NbtComponent component, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.component.type.NbtComponent.method_57448(component.wrapperContained)); }
// public boolean applyToBlockEntity(yarnwrap.block.entity.BlockEntity blockEntity,Object registries) { return wrapperContained.applyToBlockEntity(blockEntity.wrapperContained,registries); }
// public static boolean applyToBlockEntity(yarnwrap.block.entity.BlockEntity blockEntity,Object registries, ) { return net.minecraft.component.type.NbtComponent.applyToBlockEntity(blockEntity.wrapperContained,registries); }
public boolean contains(java.lang.String key) { return wrapperContained.contains(key); }
// public static boolean contains(java.lang.String key, ) { return net.minecraft.component.type.NbtComponent.contains(key); }
public yarnwrap.component.type.NbtComponent apply(java.util.function.Consumer nbtConsumer) { return new yarnwrap.component.type.NbtComponent(wrapperContained.apply(nbtConsumer)); }
// public static yarnwrap.component.type.NbtComponent apply(java.util.function.Consumer nbtConsumer, ) { return new yarnwrap.component.type.NbtComponent(net.minecraft.component.type.NbtComponent.apply(nbtConsumer)); }
// public void set(yarnwrap.component.ComponentType type,yarnwrap.item.ItemStack stack,java.util.function.Consumer nbtSetter) { wrapperContained.set(type.wrapperContained,stack.wrapperContained,nbtSetter); }
// public static void set(yarnwrap.component.ComponentType type,yarnwrap.item.ItemStack stack,java.util.function.Consumer nbtSetter, ) { net.minecraft.component.type.NbtComponent.set(type.wrapperContained,stack.wrapperContained,nbtSetter); }
// public void set(yarnwrap.component.ComponentType type,yarnwrap.item.ItemStack stack,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.set(type.wrapperContained,stack.wrapperContained,nbt.wrapperContained); }
// public static void set(yarnwrap.component.ComponentType type,yarnwrap.item.ItemStack stack,yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.component.type.NbtComponent.set(type.wrapperContained,stack.wrapperContained,nbt.wrapperContained); }
// public yarnwrap.component.type.NbtComponent of(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.component.type.NbtComponent(wrapperContained.of(nbt.wrapperContained)); }
// public static yarnwrap.component.type.NbtComponent of(yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.component.type.NbtComponent(net.minecraft.component.type.NbtComponent.of(nbt.wrapperContained)); }
// public yarnwrap.component.type.NbtComponent method_57457(yarnwrap.nbt.NbtElement nbt) { return new yarnwrap.component.type.NbtComponent(wrapperContained.method_57457(nbt.wrapperContained)); }
// public static yarnwrap.component.type.NbtComponent method_57457(yarnwrap.nbt.NbtElement nbt, ) { return new yarnwrap.component.type.NbtComponent(net.minecraft.component.type.NbtComponent.method_57457(nbt.wrapperContained)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.component.type.NbtComponent.isEmpty(); }
// public com.mojang.serialization.DataResult method_57459(yarnwrap.component.type.NbtComponent component) { return wrapperContained.method_57459(component.wrapperContained); }
// public static com.mojang.serialization.DataResult method_57459(yarnwrap.component.type.NbtComponent component, ) { return net.minecraft.component.type.NbtComponent.method_57459(component.wrapperContained); }
public boolean matches(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.matches(nbt.wrapperContained); }
// public static boolean matches(yarnwrap.nbt.NbtCompound nbt, ) { return net.minecraft.component.type.NbtComponent.matches(nbt.wrapperContained); }
public yarnwrap.nbt.NbtCompound copyNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.copyNbt()); }
// public static yarnwrap.nbt.NbtCompound copyNbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.component.type.NbtComponent.copyNbt()); }
public yarnwrap.nbt.NbtCompound getNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getNbt()); }
// public static yarnwrap.nbt.NbtCompound getNbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.component.type.NbtComponent.getNbt()); }
// public yarnwrap.nbt.NbtCompound method_57464(yarnwrap.component.type.NbtComponent component) { return new yarnwrap.nbt.NbtCompound(wrapperContained.method_57464(component.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound method_57464(yarnwrap.component.type.NbtComponent component, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.component.type.NbtComponent.method_57464(component.wrapperContained)); }
public com.mojang.serialization.DataResult get(com.mojang.serialization.DynamicOps ops,com.mojang.serialization.MapDecoder decoder) { return wrapperContained.get(ops,decoder); }
// public static com.mojang.serialization.DataResult get(com.mojang.serialization.DynamicOps ops,com.mojang.serialization.MapDecoder decoder, ) { return net.minecraft.component.type.NbtComponent.get(ops,decoder); }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }
// public static yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(net.minecraft.component.type.NbtComponent.getId()); }
// public java.util.Optional method_65903(yarnwrap.registry.RegistryKey registry) { return wrapperContained.method_65903(registry.wrapperContained); }
// public static java.util.Optional method_65903(yarnwrap.registry.RegistryKey registry, ) { return net.minecraft.component.type.NbtComponent.method_65903(registry.wrapperContained); }
// public java.lang.Object getRegistryValueOfId(Object registries,yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.getRegistryValueOfId(registries,registryRef.wrapperContained); }
// public static java.lang.Object getRegistryValueOfId(Object registries,yarnwrap.registry.RegistryKey registryRef, ) { return net.minecraft.component.type.NbtComponent.getRegistryValueOfId(registries,registryRef.wrapperContained); }

}