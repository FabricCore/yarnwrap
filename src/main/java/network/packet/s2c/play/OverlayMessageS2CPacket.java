package yarnwrap.network.packet.s2c.play;
public class OverlayMessageS2CPacket { public net.minecraft.network.packet.s2c.play.OverlayMessageS2CPacket wrapperContained; public OverlayMessageS2CPacket(net.minecraft.network.packet.s2c.play.OverlayMessageS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }

}