package yarnwrap.network.packet.c2s.play;
public class ChatMessageC2SPacket { public net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket wrapperContained; public ChatMessageC2SPacket(net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String chatMessage() { return wrapperContained.chatMessage; }
// public void chatMessage(java.lang.String value) { wrapperContained.chatMessage = value; }
// public java.time.Instant timestamp() { return wrapperContained.timestamp; }
// public void timestamp(java.time.Instant value) { wrapperContained.timestamp = value; }
// public Object acknowledgment() { return wrapperContained.acknowledgment; }
// // public void acknowledgment(Object value) { wrapperContained.acknowledgment = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public java.lang.String chatMessage() { return wrapperContained.chatMessage(); }
// public java.time.Instant timestamp() { return wrapperContained.timestamp(); }
// public Object acknowledgment() { return wrapperContained.acknowledgment(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}