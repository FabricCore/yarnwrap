package yarnwrap.network.packet.c2s.common;
public class CustomPayloadC2SPacket { public net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket wrapperContained; public CustomPayloadC2SPacket(net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_PAYLOAD_SIZE() { return wrapperContained.MAX_PAYLOAD_SIZE; }
// public void MAX_PAYLOAD_SIZE(int value) { wrapperContained.MAX_PAYLOAD_SIZE = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }

}