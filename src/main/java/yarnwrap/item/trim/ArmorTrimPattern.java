package yarnwrap.item.trim;
public class ArmorTrimPattern { public net.minecraft.item.trim.ArmorTrimPattern wrapperContained; public ArmorTrimPattern(net.minecraft.item.trim.ArmorTrimPattern wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
// public void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.ENTRY_PACKET_CODEC = value.wrapperContained; }
// public com.mojang.datafixers.kinds.App method_48445(Object instance) { return wrapperContained.method_48445(instance); }
public yarnwrap.text.Text getDescription(yarnwrap.registry.entry.RegistryEntry material) { return new yarnwrap.text.Text(wrapperContained.getDescription(material.wrapperContained)); }

}