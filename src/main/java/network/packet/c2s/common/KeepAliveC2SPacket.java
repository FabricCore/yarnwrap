package yarnwrap.network.packet.c2s.common;
public class KeepAliveC2SPacket { public net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket wrapperContained; public KeepAliveC2SPacket(net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public long id() { return wrapperContained.id; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public long getId() { return wrapperContained.getId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}