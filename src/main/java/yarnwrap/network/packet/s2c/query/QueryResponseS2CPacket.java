package yarnwrap.network.packet.s2c.query;
public class QueryResponseS2CPacket { public net.minecraft.network.packet.s2c.query.QueryResponseS2CPacket wrapperContained; public QueryResponseS2CPacket(net.minecraft.network.packet.s2c.query.QueryResponseS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.ServerMetadata metadata() { return new yarnwrap.server.ServerMetadata(wrapperContained.metadata); }
// public void metadata(yarnwrap.server.ServerMetadata value) { wrapperContained.metadata = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public yarnwrap.server.ServerMetadata metadata() { return new yarnwrap.server.ServerMetadata(wrapperContained.metadata()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}