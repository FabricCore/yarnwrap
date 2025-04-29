package yarnwrap.network.packet.s2c.play;
public class WorldBorderInitializeS2CPacket { public net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket wrapperContained; public WorldBorderInitializeS2CPacket(net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double centerX() { return wrapperContained.centerX; }
// public void centerX(double value) { wrapperContained.centerX = value; }
// public static double centerX() { return net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.centerX; }
// public static void centerX(double value, ) { net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.centerX = value; }

// public double centerZ() { return wrapperContained.centerZ; }
// public void centerZ(double value) { wrapperContained.centerZ = value; }
// public static double centerZ() { return net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.centerZ; }
// public static void centerZ(double value, ) { net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.centerZ = value; }

// public double size() { return wrapperContained.size; }
// public void size(double value) { wrapperContained.size = value; }
// public static double size() { return net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.size; }
// public static void size(double value, ) { net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.size = value; }

// public double sizeLerpTarget() { return wrapperContained.sizeLerpTarget; }
// public void sizeLerpTarget(double value) { wrapperContained.sizeLerpTarget = value; }
// public static double sizeLerpTarget() { return net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.sizeLerpTarget; }
// public static void sizeLerpTarget(double value, ) { net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.sizeLerpTarget = value; }

// public long sizeLerpTime() { return wrapperContained.sizeLerpTime; }
// public void sizeLerpTime(long value) { wrapperContained.sizeLerpTime = value; }
// public static long sizeLerpTime() { return net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.sizeLerpTime; }
// public static void sizeLerpTime(long value, ) { net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.sizeLerpTime = value; }

// public int maxRadius() { return wrapperContained.maxRadius; }
// public void maxRadius(int value) { wrapperContained.maxRadius = value; }
// public static int maxRadius() { return net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.maxRadius; }
// public static void maxRadius(int value, ) { net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.maxRadius = value; }

// public int warningBlocks() { return wrapperContained.warningBlocks; }
// public void warningBlocks(int value) { wrapperContained.warningBlocks = value; }
// public static int warningBlocks() { return net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.warningBlocks; }
// public static void warningBlocks(int value, ) { net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.warningBlocks = value; }

// public int warningTime() { return wrapperContained.warningTime; }
// public void warningTime(int value) { wrapperContained.warningTime = value; }
// public static int warningTime() { return net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.warningTime; }
// public static void warningTime(int value, ) { net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.warningTime = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.CODEC = value.wrapperContained; }

// public WorldBorderInitializeS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket(buf.wrapperContained); }
public WorldBorderInitializeS2CPacket(yarnwrap.world.border.WorldBorder worldBorder) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket(worldBorder.wrapperContained); }
public double getCenterX() { return wrapperContained.getCenterX(); }
// public static double getCenterX() { return net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.getCenterX(); }
public double getCenterZ() { return wrapperContained.getCenterZ(); }
// public static double getCenterZ() { return net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.getCenterZ(); }
public double getSizeLerpTarget() { return wrapperContained.getSizeLerpTarget(); }
// public static double getSizeLerpTarget() { return net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.getSizeLerpTarget(); }
public double getSize() { return wrapperContained.getSize(); }
// public static double getSize() { return net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.getSize(); }
public long getSizeLerpTime() { return wrapperContained.getSizeLerpTime(); }
// public static long getSizeLerpTime() { return net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.getSizeLerpTime(); }
public int getMaxRadius() { return wrapperContained.getMaxRadius(); }
// public static int getMaxRadius() { return net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.getMaxRadius(); }
public int getWarningTime() { return wrapperContained.getWarningTime(); }
// public static int getWarningTime() { return net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.getWarningTime(); }
public int getWarningBlocks() { return wrapperContained.getWarningBlocks(); }
// public static int getWarningBlocks() { return net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.getWarningBlocks(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket.write(buf.wrapperContained); }

}