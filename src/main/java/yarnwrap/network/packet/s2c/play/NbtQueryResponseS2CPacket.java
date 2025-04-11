package yarnwrap.network.packet.s2c.play;
public class NbtQueryResponseS2CPacket { public net.minecraft.network.packet.s2c.play.NbtQueryResponseS2CPacket wrapperContained; public NbtQueryResponseS2CPacket(net.minecraft.network.packet.s2c.play.NbtQueryResponseS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt); }
// public void nbt(yarnwrap.nbt.NbtCompound value) { wrapperContained.nbt = value.wrapperContained; }
// public int transactionId() { return wrapperContained.transactionId; }
// public void transactionId(int value) { wrapperContained.transactionId = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public int getTransactionId() { return wrapperContained.getTransactionId(); }
public yarnwrap.nbt.NbtCompound getNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getNbt()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}