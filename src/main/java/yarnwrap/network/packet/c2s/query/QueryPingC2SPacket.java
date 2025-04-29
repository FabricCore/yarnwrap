package yarnwrap.network.packet.c2s.query;
public class QueryPingC2SPacket { public net.minecraft.network.packet.c2s.query.QueryPingC2SPacket wrapperContained; public QueryPingC2SPacket(net.minecraft.network.packet.c2s.query.QueryPingC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public long startTime() { return wrapperContained.startTime; }
// public void startTime(long value) { wrapperContained.startTime = value; }
// public static long startTime() { return net.minecraft.network.packet.c2s.query.QueryPingC2SPacket.startTime; }
// public static void startTime(long value, ) { net.minecraft.network.packet.c2s.query.QueryPingC2SPacket.startTime = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.query.QueryPingC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.query.QueryPingC2SPacket.CODEC = value.wrapperContained; }

public QueryPingC2SPacket(long startTime) { this.wrapperContained = new net.minecraft.network.packet.c2s.query.QueryPingC2SPacket(startTime); }
// public QueryPingC2SPacket(io.netty.buffer.ByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.query.QueryPingC2SPacket(buf); }
public long getStartTime() { return wrapperContained.getStartTime(); }
// public static long getStartTime() { return net.minecraft.network.packet.c2s.query.QueryPingC2SPacket.getStartTime(); }
// public void write(io.netty.buffer.ByteBuf buf) { wrapperContained.write(buf); }
// public static void write(io.netty.buffer.ByteBuf buf, ) { net.minecraft.network.packet.c2s.query.QueryPingC2SPacket.write(buf); }

}