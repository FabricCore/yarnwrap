package yarnwrap.network.packet.s2c.play;
public class ChatMessageS2CPacket { public net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket wrapperContained; public ChatMessageS2CPacket(net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object serializedParameters() { return wrapperContained.serializedParameters; }
// // public void serializedParameters(Object value) { wrapperContained.serializedParameters = value; }
// // public static Object serializedParameters() { return net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket.serializedParameters; }
// // public static void serializedParameters(Object value, ) { net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket.serializedParameters = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket.CODEC = value.wrapperContained; }

// public ChatMessageS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket(buf.wrapperContained); }
// public Object serializedParameters() { return wrapperContained.serializedParameters(); }
// // public static Object serializedParameters() { return net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket.serializedParameters(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket.write(buf.wrapperContained); }

}