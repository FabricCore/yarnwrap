package yarnwrap.network.packet.s2c.play;
public class WorldBorderInterpolateSizeS2CPacket { public net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket wrapperContained; public WorldBorderInterpolateSizeS2CPacket(net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double size() { return wrapperContained.size; }
// public double sizeLerpTarget() { return wrapperContained.sizeLerpTarget; }
// public long sizeLerpTime() { return wrapperContained.sizeLerpTime; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public double getSize() { return wrapperContained.getSize(); }
public double getSizeLerpTarget() { return wrapperContained.getSizeLerpTarget(); }
public long getSizeLerpTime() { return wrapperContained.getSizeLerpTime(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}