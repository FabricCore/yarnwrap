package yarnwrap.network.packet.s2c.play;
public class WorldBorderCenterChangedS2CPacket { public net.minecraft.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket wrapperContained; public WorldBorderCenterChangedS2CPacket(net.minecraft.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double centerX() { return wrapperContained.centerX; }
// public void centerX(double value) { wrapperContained.centerX = value; }
// public double centerZ() { return wrapperContained.centerZ; }
// public void centerZ(double value) { wrapperContained.centerZ = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public double getCenterZ() { return wrapperContained.getCenterZ(); }
public double getCenterX() { return wrapperContained.getCenterX(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}