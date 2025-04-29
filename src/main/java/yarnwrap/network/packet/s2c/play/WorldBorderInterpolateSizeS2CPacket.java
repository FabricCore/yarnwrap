package yarnwrap.network.packet.s2c.play;
public class WorldBorderInterpolateSizeS2CPacket { public net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket wrapperContained; public WorldBorderInterpolateSizeS2CPacket(net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double size() { return wrapperContained.size; }
// public void size(double value) { wrapperContained.size = value; }
// public static double size() { return net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket.size; }
// public static void size(double value, ) { net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket.size = value; }

// public double sizeLerpTarget() { return wrapperContained.sizeLerpTarget; }
// public void sizeLerpTarget(double value) { wrapperContained.sizeLerpTarget = value; }
// public static double sizeLerpTarget() { return net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket.sizeLerpTarget; }
// public static void sizeLerpTarget(double value, ) { net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket.sizeLerpTarget = value; }

// public long sizeLerpTime() { return wrapperContained.sizeLerpTime; }
// public void sizeLerpTime(long value) { wrapperContained.sizeLerpTime = value; }
// public static long sizeLerpTime() { return net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket.sizeLerpTime; }
// public static void sizeLerpTime(long value, ) { net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket.sizeLerpTime = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket.CODEC = value.wrapperContained; }

// public WorldBorderInterpolateSizeS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket(buf.wrapperContained); }
public WorldBorderInterpolateSizeS2CPacket(yarnwrap.world.border.WorldBorder worldBorder) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket(worldBorder.wrapperContained); }
public double getSize() { return wrapperContained.getSize(); }
// public static double getSize() { return net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket.getSize(); }
public double getSizeLerpTarget() { return wrapperContained.getSizeLerpTarget(); }
// public static double getSizeLerpTarget() { return net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket.getSizeLerpTarget(); }
public long getSizeLerpTime() { return wrapperContained.getSizeLerpTime(); }
// public static long getSizeLerpTime() { return net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket.getSizeLerpTime(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket.write(buf.wrapperContained); }

}