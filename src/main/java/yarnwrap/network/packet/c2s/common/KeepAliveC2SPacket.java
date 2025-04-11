package yarnwrap.network.packet.c2s.common;
public class KeepAliveC2SPacket { public net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket wrapperContained; public KeepAliveC2SPacket(net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public long id() { return wrapperContained.id; }
// public void id(long value) { wrapperContained.id = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public long getId() { return wrapperContained.getId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}