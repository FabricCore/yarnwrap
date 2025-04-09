package yarnwrap.network.packet.s2c.config;
public class SelectKnownPacksS2CPacket { public net.minecraft.network.packet.s2c.config.SelectKnownPacksS2CPacket wrapperContained; public SelectKnownPacksS2CPacket(net.minecraft.network.packet.s2c.config.SelectKnownPacksS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }

}