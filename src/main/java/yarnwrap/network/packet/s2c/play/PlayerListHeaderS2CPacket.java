package yarnwrap.network.packet.s2c.play;
public class PlayerListHeaderS2CPacket { public net.minecraft.network.packet.s2c.play.PlayerListHeaderS2CPacket wrapperContained; public PlayerListHeaderS2CPacket(net.minecraft.network.packet.s2c.play.PlayerListHeaderS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }

}