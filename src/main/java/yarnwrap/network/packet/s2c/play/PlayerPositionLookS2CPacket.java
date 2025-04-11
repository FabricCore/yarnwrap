package yarnwrap.network.packet.s2c.play;
public class PlayerPositionLookS2CPacket { public net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket wrapperContained; public PlayerPositionLookS2CPacket(net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public int teleportId() { return wrapperContained.teleportId; }
// public void teleportId(int value) { wrapperContained.teleportId = value; }
// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public java.util.Set flags() { return wrapperContained.flags; }
// public void flags(java.util.Set value) { wrapperContained.flags = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public PlayerPositionLookS2CPacket(double x,double y,double z,float yaw,float pitch,java.util.Set flags,int teleportId) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket(x,y,z,yaw,pitch,flags,teleportId); }
// public PlayerPositionLookS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket(buf.wrapperContained); }
public java.util.Set getFlags() { return wrapperContained.getFlags(); }
public double getX() { return wrapperContained.getX(); }
public double getY() { return wrapperContained.getY(); }
public float getYaw() { return wrapperContained.getYaw(); }
public int getTeleportId() { return wrapperContained.getTeleportId(); }
public double getZ() { return wrapperContained.getZ(); }
public float getPitch() { return wrapperContained.getPitch(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}