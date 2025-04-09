package yarnwrap.network.packet.s2c.query;
public class QueryResponseS2CPacket { public net.minecraft.network.packet.s2c.query.QueryResponseS2CPacket wrapperContained; public QueryResponseS2CPacket(net.minecraft.network.packet.s2c.query.QueryResponseS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.ServerMetadata metadata() { return new yarnwrap.server.ServerMetadata(wrapperContained.metadata); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public yarnwrap.server.ServerMetadata metadata() { return new yarnwrap.server.ServerMetadata(wrapperContained.metadata()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}