package yarnwrap.network.packet.c2s.query;
public class QueryPingC2SPacket { public net.minecraft.network.packet.c2s.query.QueryPingC2SPacket wrapperContained; public QueryPingC2SPacket(net.minecraft.network.packet.c2s.query.QueryPingC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public long startTime() { return wrapperContained.startTime; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public long getStartTime() { return wrapperContained.getStartTime(); }
// public void write(io.netty.buffer.ByteBuf buf) { wrapperContained.write(buf); }

}