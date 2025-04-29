package yarnwrap.network.packet.s2c.play;
public class ChunkLoadDistanceS2CPacket { public net.minecraft.network.packet.s2c.play.ChunkLoadDistanceS2CPacket wrapperContained; public ChunkLoadDistanceS2CPacket(net.minecraft.network.packet.s2c.play.ChunkLoadDistanceS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int distance() { return wrapperContained.distance; }
// public void distance(int value) { wrapperContained.distance = value; }
// public static int distance() { return net.minecraft.network.packet.s2c.play.ChunkLoadDistanceS2CPacket.distance; }
// public static void distance(int value, ) { net.minecraft.network.packet.s2c.play.ChunkLoadDistanceS2CPacket.distance = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.ChunkLoadDistanceS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.ChunkLoadDistanceS2CPacket.CODEC = value.wrapperContained; }

public ChunkLoadDistanceS2CPacket(int distance) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ChunkLoadDistanceS2CPacket(distance); }
// public ChunkLoadDistanceS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ChunkLoadDistanceS2CPacket(buf.wrapperContained); }
public int getDistance() { return wrapperContained.getDistance(); }
// public static int getDistance() { return net.minecraft.network.packet.s2c.play.ChunkLoadDistanceS2CPacket.getDistance(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.ChunkLoadDistanceS2CPacket.write(buf.wrapperContained); }

}