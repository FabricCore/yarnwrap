package yarnwrap.network.packet.s2c.play;
public class WorldBorderSizeChangedS2CPacket { public net.minecraft.network.packet.s2c.play.WorldBorderSizeChangedS2CPacket wrapperContained; public WorldBorderSizeChangedS2CPacket(net.minecraft.network.packet.s2c.play.WorldBorderSizeChangedS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double sizeLerpTarget() { return wrapperContained.sizeLerpTarget; }
// public void sizeLerpTarget(double value) { wrapperContained.sizeLerpTarget = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public WorldBorderSizeChangedS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldBorderSizeChangedS2CPacket(buf.wrapperContained); }
public WorldBorderSizeChangedS2CPacket(yarnwrap.world.border.WorldBorder worldBorder) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.WorldBorderSizeChangedS2CPacket(worldBorder.wrapperContained); }
public double getSizeLerpTarget() { return wrapperContained.getSizeLerpTarget(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}