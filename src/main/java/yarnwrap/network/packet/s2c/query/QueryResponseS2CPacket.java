package yarnwrap.network.packet.s2c.query;
public class QueryResponseS2CPacket { public net.minecraft.network.packet.s2c.query.QueryResponseS2CPacket wrapperContained; public QueryResponseS2CPacket(net.minecraft.network.packet.s2c.query.QueryResponseS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.ServerMetadata metadata() { return new yarnwrap.server.ServerMetadata(wrapperContained.metadata); }
// public void metadata(yarnwrap.server.ServerMetadata value) { wrapperContained.metadata = value.wrapperContained; }
// public static yarnwrap.server.ServerMetadata metadata() { return new yarnwrap.server.ServerMetadata(net.minecraft.network.packet.s2c.query.QueryResponseS2CPacket.metadata); }
// public static void metadata(yarnwrap.server.ServerMetadata value, ) { net.minecraft.network.packet.s2c.query.QueryResponseS2CPacket.metadata = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.query.QueryResponseS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.query.QueryResponseS2CPacket.CODEC = value.wrapperContained; }

// public QueryResponseS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.query.QueryResponseS2CPacket(buf.wrapperContained); }
public QueryResponseS2CPacket(yarnwrap.server.ServerMetadata metadata) { this.wrapperContained = new net.minecraft.network.packet.s2c.query.QueryResponseS2CPacket(metadata.wrapperContained); }
// public yarnwrap.server.ServerMetadata metadata() { return new yarnwrap.server.ServerMetadata(wrapperContained.metadata()); }
// // public static yarnwrap.server.ServerMetadata metadata() { return new yarnwrap.server.ServerMetadata(net.minecraft.network.packet.s2c.query.QueryResponseS2CPacket.metadata()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.query.QueryResponseS2CPacket.write(buf.wrapperContained); }

}