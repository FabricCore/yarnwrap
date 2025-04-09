package yarnwrap.network.packet.s2c.play;
public class PlayerPositionLookS2CPacket { public net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket wrapperContained; public PlayerPositionLookS2CPacket(net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public float pitch() { return wrapperContained.pitch; }
// public double y() { return wrapperContained.y; }
// public float yaw() { return wrapperContained.yaw; }
// public int teleportId() { return wrapperContained.teleportId; }
// public double x() { return wrapperContained.x; }
// public java.util.Set flags() { return wrapperContained.flags; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public java.util.Set getFlags() { return wrapperContained.getFlags(); }
public double getX() { return wrapperContained.getX(); }
public double getY() { return wrapperContained.getY(); }
public float getYaw() { return wrapperContained.getYaw(); }
public int getTeleportId() { return wrapperContained.getTeleportId(); }
public double getZ() { return wrapperContained.getZ(); }
public float getPitch() { return wrapperContained.getPitch(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}