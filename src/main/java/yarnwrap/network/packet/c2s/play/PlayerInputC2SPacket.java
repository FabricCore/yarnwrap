package yarnwrap.network.packet.c2s.play;
public class PlayerInputC2SPacket { public net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket wrapperContained; public PlayerInputC2SPacket(net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket.CODEC = value.wrapperContained; }


}