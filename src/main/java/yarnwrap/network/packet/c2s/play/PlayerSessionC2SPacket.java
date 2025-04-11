package yarnwrap.network.packet.c2s.play;
public class PlayerSessionC2SPacket { public net.minecraft.network.packet.c2s.play.PlayerSessionC2SPacket wrapperContained; public PlayerSessionC2SPacket(net.minecraft.network.packet.c2s.play.PlayerSessionC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}