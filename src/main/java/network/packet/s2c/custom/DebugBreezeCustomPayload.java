package yarnwrap.network.packet.s2c.custom;
public class DebugBreezeCustomPayload { public net.minecraft.network.packet.s2c.custom.DebugBreezeCustomPayload wrapperContained; public DebugBreezeCustomPayload(net.minecraft.network.packet.s2c.custom.DebugBreezeCustomPayload wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public Object ID() { return wrapperContained.ID; }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}