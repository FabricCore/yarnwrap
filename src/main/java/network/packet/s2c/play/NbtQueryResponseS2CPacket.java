package yarnwrap.network.packet.s2c.play;
public class NbtQueryResponseS2CPacket { public net.minecraft.network.packet.s2c.play.NbtQueryResponseS2CPacket wrapperContained; public NbtQueryResponseS2CPacket(net.minecraft.network.packet.s2c.play.NbtQueryResponseS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt); }
// public int transactionId() { return wrapperContained.transactionId; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getTransactionId() { return wrapperContained.getTransactionId(); }
public yarnwrap.nbt.NbtCompound getNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getNbt()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}