package yarnwrap.network.packet.s2c.play;
public class ChatMessageS2CPacket { public net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket wrapperContained; public ChatMessageS2CPacket(net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object serializedParameters() { return wrapperContained.serializedParameters; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public Object serializedParameters() { return wrapperContained.serializedParameters(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}