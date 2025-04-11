package yarnwrap.network.packet.c2s.play;
public class ChatCommandSignedC2SPacket { public net.minecraft.network.packet.c2s.play.ChatCommandSignedC2SPacket wrapperContained; public ChatCommandSignedC2SPacket(net.minecraft.network.packet.c2s.play.ChatCommandSignedC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Instant timestamp() { return wrapperContained.timestamp; }
// public void timestamp(java.time.Instant value) { wrapperContained.timestamp = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public ChatCommandSignedC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.ChatCommandSignedC2SPacket(buf.wrapperContained); }
// public java.time.Instant timestamp() { return wrapperContained.timestamp(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}