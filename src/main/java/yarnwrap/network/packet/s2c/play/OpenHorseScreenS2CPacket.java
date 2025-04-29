package yarnwrap.network.packet.s2c.play;
public class OpenHorseScreenS2CPacket { public net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket wrapperContained; public OpenHorseScreenS2CPacket(net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int horseId() { return wrapperContained.horseId; }
// public void horseId(int value) { wrapperContained.horseId = value; }
// public static int horseId() { return net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket.horseId; }
// public static void horseId(int value, ) { net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket.horseId = value; }

// public int slotColumnCount() { return wrapperContained.slotColumnCount; }
// public void slotColumnCount(int value) { wrapperContained.slotColumnCount = value; }
// public static int slotColumnCount() { return net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket.slotColumnCount; }
// public static void slotColumnCount(int value, ) { net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket.slotColumnCount = value; }

// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
// public static int syncId() { return net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket.syncId; }
// public static void syncId(int value, ) { net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket.syncId = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket.CODEC = value.wrapperContained; }

public OpenHorseScreenS2CPacket(int syncId,int slotColumnCount,int horseId) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket(syncId,slotColumnCount,horseId); }
// public OpenHorseScreenS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket(buf.wrapperContained); }
public int getSyncId() { return wrapperContained.getSyncId(); }
// public static int getSyncId() { return net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket.getSyncId(); }
public int getHorseId() { return wrapperContained.getHorseId(); }
// public static int getHorseId() { return net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket.getHorseId(); }
public int getSlotColumnCount() { return wrapperContained.getSlotColumnCount(); }
// public static int getSlotColumnCount() { return net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket.getSlotColumnCount(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket.write(buf.wrapperContained); }

}