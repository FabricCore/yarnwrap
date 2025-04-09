package yarnwrap.network.packet.s2c.custom;
public class DebugBeeCustomPayload { public net.minecraft.network.packet.s2c.custom.DebugBeeCustomPayload wrapperContained; public DebugBeeCustomPayload(net.minecraft.network.packet.s2c.custom.DebugBeeCustomPayload wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public Object ID() { return wrapperContained.ID; }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}