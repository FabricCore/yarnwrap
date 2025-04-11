package yarnwrap.network.packet.c2s.query;
public class QueryPingC2SPacket { public net.minecraft.network.packet.c2s.query.QueryPingC2SPacket wrapperContained; public QueryPingC2SPacket(net.minecraft.network.packet.c2s.query.QueryPingC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public long startTime() { return wrapperContained.startTime; }
// public void startTime(long value) { wrapperContained.startTime = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public long getStartTime() { return wrapperContained.getStartTime(); }
// public void write(io.netty.buffer.ByteBuf buf) { wrapperContained.write(buf); }

}