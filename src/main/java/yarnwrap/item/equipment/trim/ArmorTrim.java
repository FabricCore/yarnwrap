package yarnwrap.item.equipment.trim;
public class ArmorTrim { public net.minecraft.item.equipment.trim.ArmorTrim wrapperContained; public ArmorTrim(net.minecraft.item.equipment.trim.ArmorTrim wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry material() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.material); }
// public void material(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.material = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry material() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.item.equipment.trim.ArmorTrim.material); }
// public static void material(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.item.equipment.trim.ArmorTrim.material = value.wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry pattern() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.pattern); }
// public void pattern(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.pattern = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry pattern() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.item.equipment.trim.ArmorTrim.pattern); }
// public static void pattern(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.item.equipment.trim.ArmorTrim.pattern = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.item.equipment.trim.ArmorTrim.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.equipment.trim.ArmorTrim.CODEC = value; }

// public yarnwrap.text.Text UPGRADE_TEXT() { return new yarnwrap.text.Text(wrapperContained.UPGRADE_TEXT); }
// public void UPGRADE_TEXT(yarnwrap.text.Text value) { wrapperContained.UPGRADE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text UPGRADE_TEXT() { return new yarnwrap.text.Text(net.minecraft.item.equipment.trim.ArmorTrim.UPGRADE_TEXT); }
// public static void UPGRADE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.item.equipment.trim.ArmorTrim.UPGRADE_TEXT = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.equipment.trim.ArmorTrim.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.equipment.trim.ArmorTrim.PACKET_CODEC = value.wrapperContained; }

public ArmorTrim(yarnwrap.registry.entry.RegistryEntry material,yarnwrap.registry.entry.RegistryEntry pattern) { this.wrapperContained = new net.minecraft.item.equipment.trim.ArmorTrim(material.wrapperContained,pattern.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry material() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.material()); }
// // public static yarnwrap.registry.entry.RegistryEntry material() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.item.equipment.trim.ArmorTrim.material()); }
// public yarnwrap.registry.entry.RegistryEntry pattern() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.pattern()); }
// // public static yarnwrap.registry.entry.RegistryEntry pattern() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.item.equipment.trim.ArmorTrim.pattern()); }
// public com.mojang.datafixers.kinds.App method_67224(Object instance) { return wrapperContained.method_67224(instance); }
// public static com.mojang.datafixers.kinds.App method_67224(Object instance, ) { return net.minecraft.item.equipment.trim.ArmorTrim.method_67224(instance); }
public yarnwrap.util.Identifier getTextureId(java.lang.String trimsDirectory,yarnwrap.registry.RegistryKey equipmentAsset) { return new yarnwrap.util.Identifier(wrapperContained.getTextureId(trimsDirectory,equipmentAsset.wrapperContained)); }
// public static yarnwrap.util.Identifier getTextureId(java.lang.String trimsDirectory,yarnwrap.registry.RegistryKey equipmentAsset, ) { return new yarnwrap.util.Identifier(net.minecraft.item.equipment.trim.ArmorTrim.getTextureId(trimsDirectory,equipmentAsset.wrapperContained)); }
// public java.lang.String method_67226(java.lang.String patternId) { return wrapperContained.method_67226(patternId); }
// public static java.lang.String method_67226(java.lang.String patternId, ) { return net.minecraft.item.equipment.trim.ArmorTrim.method_67226(patternId); }

}