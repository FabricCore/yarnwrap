package yarnwrap.network.packet.s2c.play;
public class GameMessageS2CPacket { public net.minecraft.network.packet.s2c.play.GameMessageS2CPacket wrapperContained; public GameMessageS2CPacket(net.minecraft.network.packet.s2c.play.GameMessageS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }

}