package yarnwrap.item.equipment.trim;
public class ArmorTrimMaterial { public net.minecraft.item.equipment.trim.ArmorTrimMaterial wrapperContained; public ArmorTrimMaterial(net.minecraft.item.equipment.trim.ArmorTrimMaterial wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.item.equipment.trim.ArmorTrimMaterial.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.equipment.trim.ArmorTrimMaterial.CODEC = value; }

// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec ENTRY_CODEC() { return net.minecraft.item.equipment.trim.ArmorTrimMaterial.ENTRY_CODEC; }
// public static void ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.equipment.trim.ArmorTrimMaterial.ENTRY_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.equipment.trim.ArmorTrimMaterial.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.equipment.trim.ArmorTrimMaterial.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
// public void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.ENTRY_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.equipment.trim.ArmorTrimMaterial.ENTRY_PACKET_CODEC); }
// public static void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.equipment.trim.ArmorTrimMaterial.ENTRY_PACKET_CODEC = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_67231(Object instance) { return wrapperContained.method_67231(instance); }
// public static com.mojang.datafixers.kinds.App method_67231(Object instance, ) { return net.minecraft.item.equipment.trim.ArmorTrimMaterial.method_67231(instance); }

}