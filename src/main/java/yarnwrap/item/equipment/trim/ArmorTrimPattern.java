package yarnwrap.item.equipment.trim;
public class ArmorTrimPattern { public net.minecraft.item.equipment.trim.ArmorTrimPattern wrapperContained; public ArmorTrimPattern(net.minecraft.item.equipment.trim.ArmorTrimPattern wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.item.equipment.trim.ArmorTrimPattern.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.equipment.trim.ArmorTrimPattern.CODEC = value; }

// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec ENTRY_CODEC() { return net.minecraft.item.equipment.trim.ArmorTrimPattern.ENTRY_CODEC; }
// public static void ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.equipment.trim.ArmorTrimPattern.ENTRY_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.equipment.trim.ArmorTrimPattern.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.equipment.trim.ArmorTrimPattern.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
// public void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.ENTRY_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.equipment.trim.ArmorTrimPattern.ENTRY_PACKET_CODEC); }
// public static void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.equipment.trim.ArmorTrimPattern.ENTRY_PACKET_CODEC = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_48445(Object instance) { return wrapperContained.method_48445(instance); }
// public static com.mojang.datafixers.kinds.App method_48445(Object instance, ) { return net.minecraft.item.equipment.trim.ArmorTrimPattern.method_48445(instance); }
public yarnwrap.text.Text getDescription(yarnwrap.registry.entry.RegistryEntry material) { return new yarnwrap.text.Text(wrapperContained.getDescription(material.wrapperContained)); }
// public static yarnwrap.text.Text getDescription(yarnwrap.registry.entry.RegistryEntry material, ) { return new yarnwrap.text.Text(net.minecraft.item.equipment.trim.ArmorTrimPattern.getDescription(material.wrapperContained)); }

}