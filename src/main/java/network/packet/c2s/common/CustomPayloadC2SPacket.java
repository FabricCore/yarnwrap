package yarnwrap.network.packet.c2s.common;
public class CustomPayloadC2SPacket { public net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket wrapperContained; public CustomPayloadC2SPacket(net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_PAYLOAD_SIZE() { return wrapperContained.MAX_PAYLOAD_SIZE; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }

}