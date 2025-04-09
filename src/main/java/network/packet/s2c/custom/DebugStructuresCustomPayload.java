package yarnwrap.network.packet.s2c.custom;
public class DebugStructuresCustomPayload { public net.minecraft.network.packet.s2c.custom.DebugStructuresCustomPayload wrapperContained; public DebugStructuresCustomPayload(net.minecraft.network.packet.s2c.custom.DebugStructuresCustomPayload wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public Object ID() { return wrapperContained.ID; }
// public void writeBox(yarnwrap.network.PacketByteBuf buf,yarnwrap.util.math.BlockBox box) { wrapperContained.writeBox(buf.wrapperContained,box.wrapperContained); }
// public yarnwrap.util.math.BlockBox readBox(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.util.math.BlockBox(wrapperContained.readBox(buf.wrapperContained)); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}