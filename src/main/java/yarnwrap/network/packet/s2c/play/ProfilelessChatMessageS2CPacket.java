package yarnwrap.network.packet.s2c.play;
public class ProfilelessChatMessageS2CPacket { public net.minecraft.network.packet.s2c.play.ProfilelessChatMessageS2CPacket wrapperContained; public ProfilelessChatMessageS2CPacket(net.minecraft.network.packet.s2c.play.ProfilelessChatMessageS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }

}