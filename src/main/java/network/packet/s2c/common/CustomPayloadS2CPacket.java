package yarnwrap.network.packet.s2c.common;
public class CustomPayloadS2CPacket { public net.minecraft.network.packet.s2c.common.CustomPayloadS2CPacket wrapperContained; public CustomPayloadS2CPacket(net.minecraft.network.packet.s2c.common.CustomPayloadS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_PAYLOAD_SIZE() { return wrapperContained.MAX_PAYLOAD_SIZE; }
public yarnwrap.network.codec.PacketCodec PLAY_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PLAY_CODEC); }
public yarnwrap.network.codec.PacketCodec CONFIGURATION_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CONFIGURATION_CODEC); }

}