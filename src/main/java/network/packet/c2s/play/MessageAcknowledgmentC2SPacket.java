package yarnwrap.network.packet.c2s.play;
public class MessageAcknowledgmentC2SPacket { public net.minecraft.network.packet.c2s.play.MessageAcknowledgmentC2SPacket wrapperContained; public MessageAcknowledgmentC2SPacket(net.minecraft.network.packet.c2s.play.MessageAcknowledgmentC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}