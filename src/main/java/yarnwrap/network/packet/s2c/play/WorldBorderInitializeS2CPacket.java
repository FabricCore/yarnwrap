package yarnwrap.network.packet.s2c.play;
public class WorldBorderInitializeS2CPacket { public net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket wrapperContained; public WorldBorderInitializeS2CPacket(net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double centerX() { return wrapperContained.centerX; }
// public void centerX(double value) { wrapperContained.centerX = value; }
// public double centerZ() { return wrapperContained.centerZ; }
// public void centerZ(double value) { wrapperContained.centerZ = value; }
// public double size() { return wrapperContained.size; }
// public void size(double value) { wrapperContained.size = value; }
// public double sizeLerpTarget() { return wrapperContained.sizeLerpTarget; }
// public void sizeLerpTarget(double value) { wrapperContained.sizeLerpTarget = value; }
// public long sizeLerpTime() { return wrapperContained.sizeLerpTime; }
// public void sizeLerpTime(long value) { wrapperContained.sizeLerpTime = value; }
// public int maxRadius() { return wrapperContained.maxRadius; }
// public void maxRadius(int value) { wrapperContained.maxRadius = value; }
// public int warningBlocks() { return wrapperContained.warningBlocks; }
// public void warningBlocks(int value) { wrapperContained.warningBlocks = value; }
// public int warningTime() { return wrapperContained.warningTime; }
// public void warningTime(int value) { wrapperContained.warningTime = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public WorldBorderInitializeS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket(buf.wrapperContained); }
public WorldBorderInitializeS2CPacket(yarnwrap.world.border.WorldBorder worldBorder) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket(worldBorder.wrapperContained); }
public double getCenterX() { return wrapperContained.getCenterX(); }
public double getCenterZ() { return wrapperContained.getCenterZ(); }
public double getSizeLerpTarget() { return wrapperContained.getSizeLerpTarget(); }
public double getSize() { return wrapperContained.getSize(); }
public long getSizeLerpTime() { return wrapperContained.getSizeLerpTime(); }
public int getMaxRadius() { return wrapperContained.getMaxRadius(); }
public int getWarningTime() { return wrapperContained.getWarningTime(); }
public int getWarningBlocks() { return wrapperContained.getWarningBlocks(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}