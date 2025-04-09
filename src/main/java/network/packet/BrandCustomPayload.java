package yarnwrap.network.packet;
public class BrandCustomPayload { public net.minecraft.network.packet.BrandCustomPayload wrapperContained; public BrandCustomPayload(net.minecraft.network.packet.BrandCustomPayload wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public Object ID() { return wrapperContained.ID; }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}