package yarnwrap.network.packet.s2c.play;
public class WorldBorderCenterChangedS2CPacket { public net.minecraft.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket wrapperContained; public WorldBorderCenterChangedS2CPacket(net.minecraft.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double centerX() { return wrapperContained.centerX; }
// public void centerX(double value) { wrapperContained.centerX = value; }
// public static double centerX() { return net.minecraft.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket.centerX; }
// public static void centerX(double value, ) { net.minecraft.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket.centerX = value; }

// public double centerZ() { return wrapperContained.centerZ; }
// public void centerZ(double value) { wrapperContained.centerZ = value; }
// public static double centerZ() { return net.minecraft.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket.centerZ; }
// public static void centerZ(double value, ) { net.minecraft.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket.centerZ = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket.CODEC = value.wrapperContained; }

// public WorldBorderCenterChangedS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket(buf.wrapperContained); }
public WorldBorderCenterChangedS2CPacket(yarnwrap.world.border.WorldBorder worldBorder) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket(worldBorder.wrapperContained); }
public double getCenterZ() { return wrapperContained.getCenterZ(); }
// public static double getCenterZ() { return net.minecraft.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket.getCenterZ(); }
public double getCenterX() { return wrapperContained.getCenterX(); }
// public static double getCenterX() { return net.minecraft.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket.getCenterX(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket.write(buf.wrapperContained); }

}