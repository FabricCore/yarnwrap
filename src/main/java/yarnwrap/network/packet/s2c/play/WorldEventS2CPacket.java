package yarnwrap.network.packet.s2c.play;
public class WorldEventS2CPacket { public net.minecraft.network.packet.s2c.play.WorldEventS2CPacket wrapperContained; public WorldEventS2CPacket(net.minecraft.network.packet.s2c.play.WorldEventS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int data() { return wrapperContained.data; }
// public void data(int value) { wrapperContained.data = value; }
// public static int data() { return net.minecraft.network.packet.s2c.play.WorldEventS2CPacket.data; }
// public static void data(int value, ) { net.minecraft.network.packet.s2c.play.WorldEventS2CPacket.data = value; }

// public boolean global() { return wrapperContained.global; }
// public void global(boolean value) { wrapperContained.global = value; }
// public static boolean global() { return net.minecraft.network.packet.s2c.play.WorldEventS2CPacket.global; }
// public static void global(boolean value, ) { net.minecraft.network.packet.s2c.play.WorldEventS2CPacket.global = value; }

// public int eventId() { return wrapperContained.eventId; }
// public void eventId(int value) { wrapperContained.eventId = value; }
// public static int eventId() { return net.minecraft.network.packet.s2c.play.WorldEventS2CPacket.eventId; }
// public static void eventId(int value, ) { net.minecraft.network.packet.s2c.play.WorldEventS2CPacket.eventId = value; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.s2c.play.WorldEventS2CPacket.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.network.packet.s2c.play.WorldEventS2CPacket.pos = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.WorldEventS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.WorldEventS2CPacket.CODEC = value.wrapperContained; }

public WorldEventS2CPacket(int eventId,yarnwrap.util.math.BlockPos pos,int data,boolean global) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldEventS2CPacket(eventId,pos.wrapperContained,data,global); }
// public WorldEventS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldEventS2CPacket(buf.wrapperContained); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.s2c.play.WorldEventS2CPacket.getPos()); }
public int getEventId() { return wrapperContained.getEventId(); }
// public static int getEventId() { return net.minecraft.network.packet.s2c.play.WorldEventS2CPacket.getEventId(); }
public boolean isGlobal() { return wrapperContained.isGlobal(); }
// public static boolean isGlobal() { return net.minecraft.network.packet.s2c.play.WorldEventS2CPacket.isGlobal(); }
public int getData() { return wrapperContained.getData(); }
// public static int getData() { return net.minecraft.network.packet.s2c.play.WorldEventS2CPacket.getData(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.WorldEventS2CPacket.write(buf.wrapperContained); }

}