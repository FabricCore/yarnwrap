package yarnwrap.component.type;
public class NbtComponent { public net.minecraft.component.type.NbtComponent wrapperContained; public NbtComponent(net.minecraft.component.type.NbtComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.NbtComponent DEFAULT() { return new yarnwrap.component.type.NbtComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.NbtComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec CODEC_WITH_ID() { return wrapperContained.CODEC_WITH_ID; }
// public void CODEC_WITH_ID(com.mojang.serialization.Codec value) { wrapperContained.CODEC_WITH_ID = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt); }
// public void nbt(yarnwrap.nbt.NbtCompound value) { wrapperContained.nbt = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public int getSize() { return wrapperContained.getSize(); }
public void applyToEntity(yarnwrap.entity.Entity entity) { wrapperContained.applyToEntity(entity.wrapperContained); }
public com.mojang.serialization.DataResult get(com.mojang.serialization.MapDecoder decoder) { return wrapperContained.get(decoder); }
public com.mojang.serialization.DataResult with(com.mojang.serialization.DynamicOps ops,com.mojang.serialization.MapEncoder encoder,java.lang.Object value) { return wrapperContained.with(ops,encoder,value); }
// public boolean applyToBlockEntity(yarnwrap.block.entity.BlockEntity blockEntity,Object registryLookup) { return wrapperContained.applyToBlockEntity(blockEntity.wrapperContained,registryLookup); }
public boolean contains(java.lang.String key) { return wrapperContained.contains(key); }
public yarnwrap.component.type.NbtComponent apply(java.util.function.Consumer nbtConsumer) { return new yarnwrap.component.type.NbtComponent(wrapperContained.apply(nbtConsumer)); }
public void set(yarnwrap.component.ComponentType type,yarnwrap.item.ItemStack stack,java.util.function.Consumer nbtSetter) { wrapperContained.set(type.wrapperContained,stack.wrapperContained,nbtSetter); }
public void set(yarnwrap.component.ComponentType type,yarnwrap.item.ItemStack stack,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.set(type.wrapperContained,stack.wrapperContained,nbt.wrapperContained); }
public java.util.function.Predicate createPredicate(yarnwrap.component.ComponentType type,yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.createPredicate(type.wrapperContained,nbt.wrapperContained); }
public yarnwrap.component.type.NbtComponent of(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.component.type.NbtComponent(wrapperContained.of(nbt.wrapperContained)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public boolean matches(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.matches(nbt.wrapperContained); }
public yarnwrap.nbt.NbtCompound copyNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.copyNbt()); }
public yarnwrap.nbt.NbtCompound getNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getNbt()); }
public com.mojang.serialization.DataResult get(com.mojang.serialization.DynamicOps ops,com.mojang.serialization.MapDecoder decoder) { return wrapperContained.get(ops,decoder); }

}