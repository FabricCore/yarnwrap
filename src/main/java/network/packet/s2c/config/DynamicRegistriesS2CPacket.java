package yarnwrap.network.packet.s2c.config;
public class DynamicRegistriesS2CPacket { public net.minecraft.network.packet.s2c.config.DynamicRegistriesS2CPacket wrapperContained; public DynamicRegistriesS2CPacket(net.minecraft.network.packet.s2c.config.DynamicRegistriesS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public yarnwrap.network.codec.PacketCodec REGISTRY_KEY_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.REGISTRY_KEY_CODEC); }

}