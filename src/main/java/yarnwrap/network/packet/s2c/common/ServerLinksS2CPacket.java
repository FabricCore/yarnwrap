package yarnwrap.network.packet.s2c.common;
public class ServerLinksS2CPacket { public net.minecraft.network.packet.s2c.common.ServerLinksS2CPacket wrapperContained; public ServerLinksS2CPacket(net.minecraft.network.packet.s2c.common.ServerLinksS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }

}