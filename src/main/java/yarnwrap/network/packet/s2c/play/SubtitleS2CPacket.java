package yarnwrap.network.packet.s2c.play;
public class SubtitleS2CPacket { public net.minecraft.network.packet.s2c.play.SubtitleS2CPacket wrapperContained; public SubtitleS2CPacket(net.minecraft.network.packet.s2c.play.SubtitleS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.SubtitleS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.SubtitleS2CPacket.CODEC = value.wrapperContained; }


}