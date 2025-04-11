package yarnwrap.network.packet.s2c.play;
public class WorldBorderInterpolateSizeS2CPacket { public net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket wrapperContained; public WorldBorderInterpolateSizeS2CPacket(net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double size() { return wrapperContained.size; }
// public void size(double value) { wrapperContained.size = value; }
// public double sizeLerpTarget() { return wrapperContained.sizeLerpTarget; }
// public void sizeLerpTarget(double value) { wrapperContained.sizeLerpTarget = value; }
// public long sizeLerpTime() { return wrapperContained.sizeLerpTime; }
// public void sizeLerpTime(long value) { wrapperContained.sizeLerpTime = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public double getSize() { return wrapperContained.getSize(); }
public double getSizeLerpTarget() { return wrapperContained.getSizeLerpTarget(); }
public long getSizeLerpTime() { return wrapperContained.getSizeLerpTime(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}