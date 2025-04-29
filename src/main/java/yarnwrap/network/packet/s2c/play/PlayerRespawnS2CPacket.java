package yarnwrap.network.packet.s2c.play;
public class PlayerRespawnS2CPacket { public net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket wrapperContained; public PlayerRespawnS2CPacket(net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte flag() { return wrapperContained.flag; }
// public void flag(byte value) { wrapperContained.flag = value; }
// public static byte flag() { return net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket.flag; }
// public static void flag(byte value, ) { net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket.flag = value; }

// public byte KEEP_ATTRIBUTES() { return wrapperContained.KEEP_ATTRIBUTES; }
// public void KEEP_ATTRIBUTES(byte value) { wrapperContained.KEEP_ATTRIBUTES = value; }
public static byte KEEP_ATTRIBUTES() { return net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket.KEEP_ATTRIBUTES; }
// public static void KEEP_ATTRIBUTES(byte value, ) { net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket.KEEP_ATTRIBUTES = value; }

// public byte KEEP_TRACKED_DATA() { return wrapperContained.KEEP_TRACKED_DATA; }
// public void KEEP_TRACKED_DATA(byte value) { wrapperContained.KEEP_TRACKED_DATA = value; }
public static byte KEEP_TRACKED_DATA() { return net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket.KEEP_TRACKED_DATA; }
// public static void KEEP_TRACKED_DATA(byte value, ) { net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket.KEEP_TRACKED_DATA = value; }

// public byte KEEP_ALL() { return wrapperContained.KEEP_ALL; }
// public void KEEP_ALL(byte value) { wrapperContained.KEEP_ALL = value; }
public static byte KEEP_ALL() { return net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket.KEEP_ALL; }
// public static void KEEP_ALL(byte value, ) { net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket.KEEP_ALL = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket.CODEC = value.wrapperContained; }

// public byte flag() { return wrapperContained.flag(); }
// // public static byte flag() { return net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket.flag(); }
public boolean hasFlag(byte flag) { return wrapperContained.hasFlag(flag); }
// public static boolean hasFlag(byte flag, ) { return net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket.hasFlag(flag); }
// public void write() { wrapperContained.write(); }
// public static void write() { net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket.write(); }

}