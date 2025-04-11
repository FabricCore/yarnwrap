package yarnwrap.network.packet.c2s.config;
public class SelectKnownPacksC2SPacket { public net.minecraft.network.packet.c2s.config.SelectKnownPacksC2SPacket wrapperContained; public SelectKnownPacksC2SPacket(net.minecraft.network.packet.c2s.config.SelectKnownPacksC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }

}