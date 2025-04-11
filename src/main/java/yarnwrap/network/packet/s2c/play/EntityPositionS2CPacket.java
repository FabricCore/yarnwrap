package yarnwrap.network.packet.s2c.play;
public class EntityPositionS2CPacket { public net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket wrapperContained; public EntityPositionS2CPacket(net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public boolean onGround() { return wrapperContained.onGround; }
// public void onGround(boolean value) { wrapperContained.onGround = value; }
// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public byte pitch() { return wrapperContained.pitch; }
// public void pitch(byte value) { wrapperContained.pitch = value; }
// public byte yaw() { return wrapperContained.yaw; }
// public void yaw(byte value) { wrapperContained.yaw = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public int getEntityId() { return wrapperContained.getEntityId(); }
public double getX() { return wrapperContained.getX(); }
public double getZ() { return wrapperContained.getZ(); }
public double getY() { return wrapperContained.getY(); }
public byte getYaw() { return wrapperContained.getYaw(); }
public byte getPitch() { return wrapperContained.getPitch(); }
public boolean isOnGround() { return wrapperContained.isOnGround(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}