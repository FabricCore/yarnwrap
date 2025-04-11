package yarnwrap.network.packet.s2c.play;
public class EntitySpawnS2CPacket { public net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket wrapperContained; public EntitySpawnS2CPacket(net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public byte pitch() { return wrapperContained.pitch; }
// public void pitch(byte value) { wrapperContained.pitch = value; }
// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public int velocityZ() { return wrapperContained.velocityZ; }
// public void velocityZ(int value) { wrapperContained.velocityZ = value; }
// public int velocityY() { return wrapperContained.velocityY; }
// public void velocityY(int value) { wrapperContained.velocityY = value; }
// public int velocityX() { return wrapperContained.velocityX; }
// public void velocityX(int value) { wrapperContained.velocityX = value; }
// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public void uuid(java.util.UUID value) { wrapperContained.uuid = value; }
// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public int entityData() { return wrapperContained.entityData; }
// public void entityData(int value) { wrapperContained.entityData = value; }
// public yarnwrap.entity.EntityType entityType() { return new yarnwrap.entity.EntityType(wrapperContained.entityType); }
// public void entityType(yarnwrap.entity.EntityType value) { wrapperContained.entityType = value.wrapperContained; }
// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public byte yaw() { return wrapperContained.yaw; }
// public void yaw(byte value) { wrapperContained.yaw = value; }
// public double VELOCITY_SCALE() { return wrapperContained.VELOCITY_SCALE; }
// public void VELOCITY_SCALE(double value) { wrapperContained.VELOCITY_SCALE = value; }
// public double MAX_ABSOLUTE_VELOCITY() { return wrapperContained.MAX_ABSOLUTE_VELOCITY; }
// public void MAX_ABSOLUTE_VELOCITY(double value) { wrapperContained.MAX_ABSOLUTE_VELOCITY = value; }
// public byte headYaw() { return wrapperContained.headYaw; }
// public void headYaw(byte value) { wrapperContained.headYaw = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public java.util.UUID getUuid() { return wrapperContained.getUuid(); }
public int getEntityData() { return wrapperContained.getEntityData(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
public float getYaw() { return wrapperContained.getYaw(); }
public yarnwrap.entity.EntityType getEntityType() { return new yarnwrap.entity.EntityType(wrapperContained.getEntityType()); }
public double getVelocityX() { return wrapperContained.getVelocityX(); }
public float getPitch() { return wrapperContained.getPitch(); }
public double getVelocityY() { return wrapperContained.getVelocityY(); }
public double getVelocityZ() { return wrapperContained.getVelocityZ(); }
public double getY() { return wrapperContained.getY(); }
public double getX() { return wrapperContained.getX(); }
public double getZ() { return wrapperContained.getZ(); }
public float getHeadYaw() { return wrapperContained.getHeadYaw(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}