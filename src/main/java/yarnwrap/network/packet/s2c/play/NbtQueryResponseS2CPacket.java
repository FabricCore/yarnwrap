package yarnwrap.network.packet.s2c.play;
public class NbtQueryResponseS2CPacket { public net.minecraft.network.packet.s2c.play.NbtQueryResponseS2CPacket wrapperContained; public NbtQueryResponseS2CPacket(net.minecraft.network.packet.s2c.play.NbtQueryResponseS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt); }
// public void nbt(yarnwrap.nbt.NbtCompound value) { wrapperContained.nbt = value.wrapperContained; }
// public static yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.network.packet.s2c.play.NbtQueryResponseS2CPacket.nbt); }
// public static void nbt(yarnwrap.nbt.NbtCompound value, ) { net.minecraft.network.packet.s2c.play.NbtQueryResponseS2CPacket.nbt = value.wrapperContained; }

// public int transactionId() { return wrapperContained.transactionId; }
// public void transactionId(int value) { wrapperContained.transactionId = value; }
// public static int transactionId() { return net.minecraft.network.packet.s2c.play.NbtQueryResponseS2CPacket.transactionId; }
// public static void transactionId(int value, ) { net.minecraft.network.packet.s2c.play.NbtQueryResponseS2CPacket.transactionId = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.NbtQueryResponseS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.NbtQueryResponseS2CPacket.CODEC = value.wrapperContained; }

public NbtQueryResponseS2CPacket(int transactionId,yarnwrap.nbt.NbtCompound nbt) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.NbtQueryResponseS2CPacket(transactionId,nbt.wrapperContained); }
// public NbtQueryResponseS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.NbtQueryResponseS2CPacket(buf.wrapperContained); }
public int getTransactionId() { return wrapperContained.getTransactionId(); }
// public static int getTransactionId() { return net.minecraft.network.packet.s2c.play.NbtQueryResponseS2CPacket.getTransactionId(); }
public yarnwrap.nbt.NbtCompound getNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getNbt()); }
// public static yarnwrap.nbt.NbtCompound getNbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.network.packet.s2c.play.NbtQueryResponseS2CPacket.getNbt()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.NbtQueryResponseS2CPacket.write(buf.wrapperContained); }

}