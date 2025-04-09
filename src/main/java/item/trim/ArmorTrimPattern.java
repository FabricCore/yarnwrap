package yarnwrap.item.trim;
public class ArmorTrimPattern { public net.minecraft.item.trim.ArmorTrimPattern wrapperContained; public ArmorTrimPattern(net.minecraft.item.trim.ArmorTrimPattern wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
public yarnwrap.text.Text getDescription(yarnwrap.registry.entry.RegistryEntry material) { return new yarnwrap.text.Text(wrapperContained.getDescription(material.wrapperContained)); }

}