package yarnwrap.network.packet.c2s.play;
public class AcknowledgeReconfigurationC2SPacket { public net.minecraft.network.packet.c2s.play.AcknowledgeReconfigurationC2SPacket wrapperContained; public AcknowledgeReconfigurationC2SPacket(net.minecraft.network.packet.c2s.play.AcknowledgeReconfigurationC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.packet.c2s.play.AcknowledgeReconfigurationC2SPacket INSTANCE() { return new yarnwrap.network.packet.c2s.play.AcknowledgeReconfigurationC2SPacket(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.network.packet.c2s.play.AcknowledgeReconfigurationC2SPacket value) { wrapperContained.INSTANCE = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }

}