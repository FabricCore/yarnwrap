package yarnwrap.network.packet.s2c.play;
public class WorldTimeUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket wrapperContained; public WorldTimeUpdateS2CPacket(net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public long timeOfDay() { return wrapperContained.timeOfDay; }
// public void timeOfDay(long value) { wrapperContained.timeOfDay = value; }
// public static long timeOfDay() { return net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket.timeOfDay; }
// public static void timeOfDay(long value, ) { net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket.timeOfDay = value; }

// public long time() { return wrapperContained.time; }
// public void time(long value) { wrapperContained.time = value; }
// public static long time() { return net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket.time; }
// public static void time(long value, ) { net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket.time = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket.CODEC = value.wrapperContained; }

public WorldTimeUpdateS2CPacket(long time,long timeOfDay,boolean doDaylightCycle) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket(time,timeOfDay,doDaylightCycle); }
// public WorldTimeUpdateS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket(buf.wrapperContained); }
public long getTime() { return wrapperContained.getTime(); }
// public static long getTime() { return net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket.getTime(); }
public long getTimeOfDay() { return wrapperContained.getTimeOfDay(); }
// public static long getTimeOfDay() { return net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket.getTimeOfDay(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket.write(buf.wrapperContained); }

}