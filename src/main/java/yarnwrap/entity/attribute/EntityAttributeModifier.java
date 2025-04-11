package yarnwrap.entity.attribute;
public class EntityAttributeModifier { public net.minecraft.entity.attribute.EntityAttributeModifier wrapperContained; public EntityAttributeModifier(net.minecraft.entity.attribute.EntityAttributeModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public double value() { return wrapperContained.value; }
// public void value(double value) { wrapperContained.value = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.MapCodec MAP_CODEC() { return wrapperContained.MAP_CODEC; }
// public void MAP_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MAP_CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public double value() { return wrapperContained.value(); }
public yarnwrap.entity.attribute.EntityAttributeModifier fromNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.fromNbt(nbt.wrapperContained)); }
public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
public boolean idMatches(yarnwrap.util.Identifier id) { return wrapperContained.idMatches(id.wrapperContained); }

}