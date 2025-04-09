package yarnwrap.network.packet.s2c.common;
public class DisconnectS2CPacket { public net.minecraft.network.packet.s2c.common.DisconnectS2CPacket wrapperContained; public DisconnectS2CPacket(net.minecraft.network.packet.s2c.common.DisconnectS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }

}