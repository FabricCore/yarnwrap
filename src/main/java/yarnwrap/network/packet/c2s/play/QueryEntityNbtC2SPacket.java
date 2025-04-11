package yarnwrap.network.packet.c2s.play;
public class QueryEntityNbtC2SPacket { public net.minecraft.network.packet.c2s.play.QueryEntityNbtC2SPacket wrapperContained; public QueryEntityNbtC2SPacket(net.minecraft.network.packet.c2s.play.QueryEntityNbtC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public int transactionId() { return wrapperContained.transactionId; }
// public void transactionId(int value) { wrapperContained.transactionId = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public QueryEntityNbtC2SPacket(int transactionId,int entityId) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.QueryEntityNbtC2SPacket(transactionId,entityId); }
// public QueryEntityNbtC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.QueryEntityNbtC2SPacket(buf.wrapperContained); }
public int getEntityId() { return wrapperContained.getEntityId(); }
public int getTransactionId() { return wrapperContained.getTransactionId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}