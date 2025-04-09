package yarnwrap.network.packet.s2c.play;
public class WorldBorderInitializeS2CPacket { public net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket wrapperContained; public WorldBorderInitializeS2CPacket(net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double centerX() { return wrapperContained.centerX; }
// public double centerZ() { return wrapperContained.centerZ; }
// public double size() { return wrapperContained.size; }
// public double sizeLerpTarget() { return wrapperContained.sizeLerpTarget; }
// public long sizeLerpTime() { return wrapperContained.sizeLerpTime; }
// public int maxRadius() { return wrapperContained.maxRadius; }
// public int warningBlocks() { return wrapperContained.warningBlocks; }
// public int warningTime() { return wrapperContained.warningTime; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
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