package yarnwrap.network.packet.s2c.custom;
public class DebugHiveCustomPayload { public net.minecraft.network.packet.s2c.custom.DebugHiveCustomPayload wrapperContained; public DebugHiveCustomPayload(net.minecraft.network.packet.s2c.custom.DebugHiveCustomPayload wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public Object ID() { return wrapperContained.ID; }
// // public void ID(Object value) { wrapperContained.ID = value; }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}