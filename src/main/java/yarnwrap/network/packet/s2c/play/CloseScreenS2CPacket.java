package yarnwrap.network.packet.s2c.play;
public class CloseScreenS2CPacket { public net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket wrapperContained; public CloseScreenS2CPacket(net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
// public static int syncId() { return net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket.syncId; }
// public static void syncId(int value, ) { net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket.syncId = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket.CODEC = value.wrapperContained; }

public CloseScreenS2CPacket(int syncId) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket(syncId); }
// public CloseScreenS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket(buf.wrapperContained); }
public int getSyncId() { return wrapperContained.getSyncId(); }
// public static int getSyncId() { return net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket.getSyncId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket.write(buf.wrapperContained); }

}