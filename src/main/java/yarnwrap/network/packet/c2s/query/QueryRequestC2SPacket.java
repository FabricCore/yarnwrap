package yarnwrap.network.packet.c2s.query;
public class QueryRequestC2SPacket { public net.minecraft.network.packet.c2s.query.QueryRequestC2SPacket wrapperContained; public QueryRequestC2SPacket(net.minecraft.network.packet.c2s.query.QueryRequestC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.packet.c2s.query.QueryRequestC2SPacket INSTANCE() { return new yarnwrap.network.packet.c2s.query.QueryRequestC2SPacket(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.network.packet.c2s.query.QueryRequestC2SPacket value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.network.packet.c2s.query.QueryRequestC2SPacket INSTANCE() { return new yarnwrap.network.packet.c2s.query.QueryRequestC2SPacket(net.minecraft.network.packet.c2s.query.QueryRequestC2SPacket.INSTANCE); }
// public static void INSTANCE(yarnwrap.network.packet.c2s.query.QueryRequestC2SPacket value, ) { net.minecraft.network.packet.c2s.query.QueryRequestC2SPacket.INSTANCE = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.query.QueryRequestC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.query.QueryRequestC2SPacket.CODEC = value.wrapperContained; }


}