package yarnwrap.network.packet.c2s.play;
public class ChatMessageC2SPacket { public net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket wrapperContained; public ChatMessageC2SPacket(net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String chatMessage() { return wrapperContained.chatMessage; }
// public void chatMessage(java.lang.String value) { wrapperContained.chatMessage = value; }
// public static java.lang.String chatMessage() { return net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket.chatMessage; }
// public static void chatMessage(java.lang.String value, ) { net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket.chatMessage = value; }

// public java.time.Instant timestamp() { return wrapperContained.timestamp; }
// public void timestamp(java.time.Instant value) { wrapperContained.timestamp = value; }
// public static java.time.Instant timestamp() { return net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket.timestamp; }
// public static void timestamp(java.time.Instant value, ) { net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket.timestamp = value; }

// public Object acknowledgment() { return wrapperContained.acknowledgment; }
// // public void acknowledgment(Object value) { wrapperContained.acknowledgment = value; }
// // public static Object acknowledgment() { return net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket.acknowledgment; }
// // public static void acknowledgment(Object value, ) { net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket.acknowledgment = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket.CODEC = value.wrapperContained; }

// public ChatMessageC2SPacket(java.lang.String timestamp,java.time.Instant salt,long signature) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket(timestamp,salt,signature); }
// public ChatMessageC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket(buf.wrapperContained); }
// public java.lang.String chatMessage() { return wrapperContained.chatMessage(); }
// // public static java.lang.String chatMessage() { return net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket.chatMessage(); }
// public java.time.Instant timestamp() { return wrapperContained.timestamp(); }
// // public static java.time.Instant timestamp() { return net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket.timestamp(); }
// public Object acknowledgment() { return wrapperContained.acknowledgment(); }
// // public static Object acknowledgment() { return net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket.acknowledgment(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket.write(buf.wrapperContained); }

}