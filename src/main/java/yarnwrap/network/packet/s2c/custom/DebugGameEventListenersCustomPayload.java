package yarnwrap.network.packet.s2c.custom;
public class DebugGameEventListenersCustomPayload { public net.minecraft.network.packet.s2c.custom.DebugGameEventListenersCustomPayload wrapperContained; public DebugGameEventListenersCustomPayload(net.minecraft.network.packet.s2c.custom.DebugGameEventListenersCustomPayload wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public Object ID() { return wrapperContained.ID; }
// // public void ID(Object value) { wrapperContained.ID = value; }

}