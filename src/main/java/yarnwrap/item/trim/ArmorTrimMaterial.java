package yarnwrap.item.trim;
public class ArmorTrimMaterial { public net.minecraft.item.trim.ArmorTrimMaterial wrapperContained; public ArmorTrimMaterial(net.minecraft.item.trim.ArmorTrimMaterial wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
// public void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.ENTRY_PACKET_CODEC = value.wrapperContained; }
public yarnwrap.item.trim.ArmorTrimMaterial of(java.lang.String assetName,yarnwrap.item.Item ingredient,float itemModelIndex,yarnwrap.text.Text description,java.util.Map overrideArmorMaterials) { return new yarnwrap.item.trim.ArmorTrimMaterial(wrapperContained.of(assetName,ingredient.wrapperContained,itemModelIndex,description.wrapperContained,overrideArmorMaterials)); }

}