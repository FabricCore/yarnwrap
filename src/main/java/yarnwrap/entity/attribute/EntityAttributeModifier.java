package yarnwrap.entity.attribute;
public class EntityAttributeModifier { public net.minecraft.entity.attribute.EntityAttributeModifier wrapperContained; public EntityAttributeModifier(net.minecraft.entity.attribute.EntityAttributeModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public double value() { return wrapperContained.value; }
// public void value(double value) { wrapperContained.value = value; }
// public static double value() { return net.minecraft.entity.attribute.EntityAttributeModifier.value; }
// public static void value(double value, ) { net.minecraft.entity.attribute.EntityAttributeModifier.value = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.entity.attribute.EntityAttributeModifier.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.entity.attribute.EntityAttributeModifier.LOGGER = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.attribute.EntityAttributeModifier.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.attribute.EntityAttributeModifier.CODEC = value; }

// public com.mojang.serialization.MapCodec MAP_CODEC() { return wrapperContained.MAP_CODEC; }
// public void MAP_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MAP_CODEC = value; }
public static com.mojang.serialization.MapCodec MAP_CODEC() { return net.minecraft.entity.attribute.EntityAttributeModifier.MAP_CODEC; }
// public static void MAP_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.entity.attribute.EntityAttributeModifier.MAP_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.entity.attribute.EntityAttributeModifier.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.entity.attribute.EntityAttributeModifier.PACKET_CODEC = value.wrapperContained; }

// public double value() { return wrapperContained.value(); }
// // public static double value() { return net.minecraft.entity.attribute.EntityAttributeModifier.value(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.entity.attribute.EntityAttributeModifier.equals(o); }
// public yarnwrap.entity.attribute.EntityAttributeModifier fromNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.fromNbt(nbt.wrapperContained)); }
// public static yarnwrap.entity.attribute.EntityAttributeModifier fromNbt(yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.entity.attribute.EntityAttributeModifier(net.minecraft.entity.attribute.EntityAttributeModifier.fromNbt(nbt.wrapperContained)); }
public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
// public static yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.entity.attribute.EntityAttributeModifier.toNbt()); }
public boolean idMatches(yarnwrap.util.Identifier id) { return wrapperContained.idMatches(id.wrapperContained); }
// public static boolean idMatches(yarnwrap.util.Identifier id, ) { return net.minecraft.entity.attribute.EntityAttributeModifier.idMatches(id.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_60719(Object instance) { return wrapperContained.method_60719(instance); }
// public static com.mojang.datafixers.kinds.App method_60719(Object instance, ) { return net.minecraft.entity.attribute.EntityAttributeModifier.method_60719(instance); }

}