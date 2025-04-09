package yarnwrap.network.packet.s2c.custom;
public class DebugPoiAddedCustomPayload { public net.minecraft.network.packet.s2c.custom.DebugPoiAddedCustomPayload wrapperContained; public DebugPoiAddedCustomPayload(net.minecraft.network.packet.s2c.custom.DebugPoiAddedCustomPayload wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public Object ID() { return wrapperContained.ID; }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}