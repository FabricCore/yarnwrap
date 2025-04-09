package yarnwrap.network.packet.c2s.play;
public class ChatCommandSignedC2SPacket { public net.minecraft.network.packet.c2s.play.ChatCommandSignedC2SPacket wrapperContained; public ChatCommandSignedC2SPacket(net.minecraft.network.packet.c2s.play.ChatCommandSignedC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Instant timestamp() { return wrapperContained.timestamp; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public java.time.Instant timestamp() { return wrapperContained.timestamp(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}