package yarnwrap.network.packet.s2c.common;
public class CustomPayloadS2CPacket { public net.minecraft.network.packet.s2c.common.CustomPayloadS2CPacket wrapperContained; public CustomPayloadS2CPacket(net.minecraft.network.packet.s2c.common.CustomPayloadS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_PAYLOAD_SIZE() { return wrapperContained.MAX_PAYLOAD_SIZE; }
// public void MAX_PAYLOAD_SIZE(int value) { wrapperContained.MAX_PAYLOAD_SIZE = value; }
// public static int MAX_PAYLOAD_SIZE() { return net.minecraft.network.packet.s2c.common.CustomPayloadS2CPacket.MAX_PAYLOAD_SIZE; }
// public static void MAX_PAYLOAD_SIZE(int value, ) { net.minecraft.network.packet.s2c.common.CustomPayloadS2CPacket.MAX_PAYLOAD_SIZE = value; }

// public yarnwrap.network.codec.PacketCodec PLAY_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PLAY_CODEC); }
// public void PLAY_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PLAY_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PLAY_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.common.CustomPayloadS2CPacket.PLAY_CODEC); }
// public static void PLAY_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.common.CustomPayloadS2CPacket.PLAY_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CONFIGURATION_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CONFIGURATION_CODEC); }
// public void CONFIGURATION_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CONFIGURATION_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CONFIGURATION_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.common.CustomPayloadS2CPacket.CONFIGURATION_CODEC); }
// public static void CONFIGURATION_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.common.CustomPayloadS2CPacket.CONFIGURATION_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec method_56460(yarnwrap.util.Identifier id) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_56460(id.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec method_56460(yarnwrap.util.Identifier id, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.common.CustomPayloadS2CPacket.method_56460(id.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec method_56461(yarnwrap.util.Identifier id) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_56461(id.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec method_56461(yarnwrap.util.Identifier id, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.common.CustomPayloadS2CPacket.method_56461(id.wrapperContained)); }
// public void method_58270(java.util.ArrayList types) { wrapperContained.method_58270(types); }
// public static void method_58270(java.util.ArrayList types, ) { net.minecraft.network.packet.s2c.common.CustomPayloadS2CPacket.method_58270(types); }

}