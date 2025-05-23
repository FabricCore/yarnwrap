package yarnwrap.predicate;
public class NbtPredicate { public net.minecraft.predicate.NbtPredicate wrapperContained; public NbtPredicate(net.minecraft.predicate.NbtPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt); }
// public void nbt(yarnwrap.nbt.NbtCompound value) { wrapperContained.nbt = value.wrapperContained; }
// public static yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.predicate.NbtPredicate.nbt); }
// public static void nbt(yarnwrap.nbt.NbtCompound value, ) { net.minecraft.predicate.NbtPredicate.nbt = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.NbtPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.NbtPredicate.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.predicate.NbtPredicate.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.predicate.NbtPredicate.PACKET_CODEC = value.wrapperContained; }

// public java.lang.String SELECTED_ITEM_KEY() { return wrapperContained.SELECTED_ITEM_KEY; }
// public void SELECTED_ITEM_KEY(java.lang.String value) { wrapperContained.SELECTED_ITEM_KEY = value; }
// public static java.lang.String SELECTED_ITEM_KEY() { return net.minecraft.predicate.NbtPredicate.SELECTED_ITEM_KEY; }
// public static void SELECTED_ITEM_KEY(java.lang.String value, ) { net.minecraft.predicate.NbtPredicate.SELECTED_ITEM_KEY = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.predicate.NbtPredicate.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.predicate.NbtPredicate.LOGGER = value; }

public NbtPredicate(yarnwrap.nbt.NbtCompound nbt) { this.wrapperContained = new net.minecraft.predicate.NbtPredicate(nbt.wrapperContained); }
// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt()); }
// // public static yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.predicate.NbtPredicate.nbt()); }
public boolean test(yarnwrap.entity.Entity entity) { return wrapperContained.test(entity.wrapperContained); }
// public static boolean test(yarnwrap.entity.Entity entity, ) { return net.minecraft.predicate.NbtPredicate.test(entity.wrapperContained); }
public boolean test(yarnwrap.component.ComponentsAccess components) { return wrapperContained.test(components.wrapperContained); }
// public static boolean test(yarnwrap.component.ComponentsAccess components, ) { return net.minecraft.predicate.NbtPredicate.test(components.wrapperContained); }
// public yarnwrap.nbt.NbtCompound entityToNbt(yarnwrap.entity.Entity entity) { return new yarnwrap.nbt.NbtCompound(wrapperContained.entityToNbt(entity.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound entityToNbt(yarnwrap.entity.Entity entity, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.predicate.NbtPredicate.entityToNbt(entity.wrapperContained)); }
public boolean test(yarnwrap.nbt.NbtElement element) { return wrapperContained.test(element.wrapperContained); }
// public static boolean test(yarnwrap.nbt.NbtElement element, ) { return net.minecraft.predicate.NbtPredicate.test(element.wrapperContained); }

}