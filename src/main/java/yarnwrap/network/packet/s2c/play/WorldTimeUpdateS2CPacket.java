package yarnwrap.network.packet.s2c.play;
public class WorldTimeUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket wrapperContained; public WorldTimeUpdateS2CPacket(net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public long time() { return wrapperContained.time; }
// public void time(long value) { wrapperContained.time = value; }
// public static long time() { return net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket.time; }
// public static void time(long value, ) { net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket.time = value; }

// public long timeOfDay() { return wrapperContained.timeOfDay; }
// public void timeOfDay(long value) { wrapperContained.timeOfDay = value; }
// public static long timeOfDay() { return net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket.timeOfDay; }
// public static void timeOfDay(long value, ) { net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket.timeOfDay = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket.CODEC = value.wrapperContained; }

// public long time() { return wrapperContained.time(); }
// // public static long time() { return net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket.time(); }
// public long timeOfDay() { return wrapperContained.timeOfDay(); }
// // public static long timeOfDay() { return net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket.timeOfDay(); }

}