package yarnwrap.network.packet.c2s.play;
public class ChatMessageC2SPacket { public net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket wrapperContained; public ChatMessageC2SPacket(net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String chatMessage() { return wrapperContained.chatMessage; }
// public java.time.Instant timestamp() { return wrapperContained.timestamp; }
// public Object acknowledgment() { return wrapperContained.acknowledgment; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public java.lang.String chatMessage() { return wrapperContained.chatMessage(); }
// public java.time.Instant timestamp() { return wrapperContained.timestamp(); }
// public Object acknowledgment() { return wrapperContained.acknowledgment(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}