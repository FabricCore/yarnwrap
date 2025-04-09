package yarnwrap.entity.attribute;
public class EntityAttributeModifier { public net.minecraft.entity.attribute.EntityAttributeModifier wrapperContained; public EntityAttributeModifier(net.minecraft.entity.attribute.EntityAttributeModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public double value() { return wrapperContained.value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.MapCodec MAP_CODEC() { return wrapperContained.MAP_CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public double value() { return wrapperContained.value(); }
public yarnwrap.entity.attribute.EntityAttributeModifier fromNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.fromNbt(nbt.wrapperContained)); }
public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
public boolean idMatches(yarnwrap.util.Identifier id) { return wrapperContained.idMatches(id.wrapperContained); }

}