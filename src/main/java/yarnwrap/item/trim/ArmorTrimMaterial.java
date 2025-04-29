package yarnwrap.item.trim;
public class ArmorTrimMaterial { public net.minecraft.item.trim.ArmorTrimMaterial wrapperContained; public ArmorTrimMaterial(net.minecraft.item.trim.ArmorTrimMaterial wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.item.trim.ArmorTrimMaterial.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.trim.ArmorTrimMaterial.CODEC = value; }

// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec ENTRY_CODEC() { return net.minecraft.item.trim.ArmorTrimMaterial.ENTRY_CODEC; }
// public static void ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.trim.ArmorTrimMaterial.ENTRY_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.trim.ArmorTrimMaterial.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.trim.ArmorTrimMaterial.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
// public void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.ENTRY_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.trim.ArmorTrimMaterial.ENTRY_PACKET_CODEC); }
// public static void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.trim.ArmorTrimMaterial.ENTRY_PACKET_CODEC = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_48437(Object instance) { return wrapperContained.method_48437(instance); }
// public static com.mojang.datafixers.kinds.App method_48437(Object instance, ) { return net.minecraft.item.trim.ArmorTrimMaterial.method_48437(instance); }
// public yarnwrap.item.trim.ArmorTrimMaterial of(java.lang.String assetName,yarnwrap.item.Item ingredient,float itemModelIndex,yarnwrap.text.Text description,java.util.Map overrideArmorMaterials) { return new yarnwrap.item.trim.ArmorTrimMaterial(wrapperContained.of(assetName,ingredient.wrapperContained,itemModelIndex,description.wrapperContained,overrideArmorMaterials)); }
// public static yarnwrap.item.trim.ArmorTrimMaterial of(java.lang.String assetName,yarnwrap.item.Item ingredient,float itemModelIndex,yarnwrap.text.Text description,java.util.Map overrideArmorMaterials, ) { return new yarnwrap.item.trim.ArmorTrimMaterial(net.minecraft.item.trim.ArmorTrimMaterial.of(assetName,ingredient.wrapperContained,itemModelIndex,description.wrapperContained,overrideArmorMaterials)); }

}