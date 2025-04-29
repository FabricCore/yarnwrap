package yarnwrap.network.packet.c2s.common;
public class CustomPayloadC2SPacket { public net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket wrapperContained; public CustomPayloadC2SPacket(net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_PAYLOAD_SIZE() { return wrapperContained.MAX_PAYLOAD_SIZE; }
// public void MAX_PAYLOAD_SIZE(int value) { wrapperContained.MAX_PAYLOAD_SIZE = value; }
// public static int MAX_PAYLOAD_SIZE() { return net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket.MAX_PAYLOAD_SIZE; }
// public static void MAX_PAYLOAD_SIZE(int value, ) { net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket.MAX_PAYLOAD_SIZE = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket.CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec method_56475(yarnwrap.util.Identifier id) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_56475(id.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec method_56475(yarnwrap.util.Identifier id, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket.method_56475(id.wrapperContained)); }
// public void method_58271(java.util.ArrayList types) { wrapperContained.method_58271(types); }
// public static void method_58271(java.util.ArrayList types, ) { net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket.method_58271(types); }

}