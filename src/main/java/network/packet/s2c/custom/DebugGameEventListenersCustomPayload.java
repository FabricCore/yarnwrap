package yarnwrap.network.packet.s2c.custom;
public class DebugGameEventListenersCustomPayload { public net.minecraft.network.packet.s2c.custom.DebugGameEventListenersCustomPayload wrapperContained; public DebugGameEventListenersCustomPayload(net.minecraft.network.packet.s2c.custom.DebugGameEventListenersCustomPayload wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public Object ID() { return wrapperContained.ID; }

}