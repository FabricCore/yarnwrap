package yarnwrap.network.packet.s2c.play;
public class TitleS2CPacket { public net.minecraft.network.packet.s2c.play.TitleS2CPacket wrapperContained; public TitleS2CPacket(net.minecraft.network.packet.s2c.play.TitleS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }

}