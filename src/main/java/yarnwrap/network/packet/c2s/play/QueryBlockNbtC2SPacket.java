package yarnwrap.network.packet.c2s.play;
public class QueryBlockNbtC2SPacket { public net.minecraft.network.packet.c2s.play.QueryBlockNbtC2SPacket wrapperContained; public QueryBlockNbtC2SPacket(net.minecraft.network.packet.c2s.play.QueryBlockNbtC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int transactionId() { return wrapperContained.transactionId; }
// public void transactionId(int value) { wrapperContained.transactionId = value; }
// public static int transactionId() { return net.minecraft.network.packet.c2s.play.QueryBlockNbtC2SPacket.transactionId; }
// public static void transactionId(int value, ) { net.minecraft.network.packet.c2s.play.QueryBlockNbtC2SPacket.transactionId = value; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.c2s.play.QueryBlockNbtC2SPacket.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.network.packet.c2s.play.QueryBlockNbtC2SPacket.pos = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.QueryBlockNbtC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.QueryBlockNbtC2SPacket.CODEC = value.wrapperContained; }

public QueryBlockNbtC2SPacket(int transactionId,yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.QueryBlockNbtC2SPacket(transactionId,pos.wrapperContained); }
// public QueryBlockNbtC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.QueryBlockNbtC2SPacket(buf.wrapperContained); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.c2s.play.QueryBlockNbtC2SPacket.getPos()); }
public int getTransactionId() { return wrapperContained.getTransactionId(); }
// public static int getTransactionId() { return net.minecraft.network.packet.c2s.play.QueryBlockNbtC2SPacket.getTransactionId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.QueryBlockNbtC2SPacket.write(buf.wrapperContained); }

}