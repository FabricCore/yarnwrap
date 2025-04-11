package yarnwrap.network.packet.c2s.play;
public class QueryBlockNbtC2SPacket { public net.minecraft.network.packet.c2s.play.QueryBlockNbtC2SPacket wrapperContained; public QueryBlockNbtC2SPacket(net.minecraft.network.packet.c2s.play.QueryBlockNbtC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int transactionId() { return wrapperContained.transactionId; }
// public void transactionId(int value) { wrapperContained.transactionId = value; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public int getTransactionId() { return wrapperContained.getTransactionId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}