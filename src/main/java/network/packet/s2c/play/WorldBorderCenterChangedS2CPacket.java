package yarnwrap.network.packet.s2c.play;
public class WorldBorderCenterChangedS2CPacket { public net.minecraft.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket wrapperContained; public WorldBorderCenterChangedS2CPacket(net.minecraft.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double centerX() { return wrapperContained.centerX; }
// public double centerZ() { return wrapperContained.centerZ; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public double getCenterZ() { return wrapperContained.getCenterZ(); }
public double getCenterX() { return wrapperContained.getCenterX(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}