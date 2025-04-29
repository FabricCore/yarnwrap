package yarnwrap.network.packet.s2c.play;
public class ScreenHandlerPropertyUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket wrapperContained; public ScreenHandlerPropertyUpdateS2CPacket(net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int value() { return wrapperContained.value; }
// public void value(int value) { wrapperContained.value = value; }
// public static int value() { return net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket.value; }
// public static void value(int value, ) { net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket.value = value; }

// public int propertyId() { return wrapperContained.propertyId; }
// public void propertyId(int value) { wrapperContained.propertyId = value; }
// public static int propertyId() { return net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket.propertyId; }
// public static void propertyId(int value, ) { net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket.propertyId = value; }

// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
// public static int syncId() { return net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket.syncId; }
// public static void syncId(int value, ) { net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket.syncId = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket.CODEC = value.wrapperContained; }

public ScreenHandlerPropertyUpdateS2CPacket(int syncId,int propertyId,int value) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket(syncId,propertyId,value); }
// public ScreenHandlerPropertyUpdateS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket(buf.wrapperContained); }
public int getPropertyId() { return wrapperContained.getPropertyId(); }
// public static int getPropertyId() { return net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket.getPropertyId(); }
public int getValue() { return wrapperContained.getValue(); }
// public static int getValue() { return net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket.getValue(); }
public int getSyncId() { return wrapperContained.getSyncId(); }
// public static int getSyncId() { return net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket.getSyncId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket.write(buf.wrapperContained); }

}