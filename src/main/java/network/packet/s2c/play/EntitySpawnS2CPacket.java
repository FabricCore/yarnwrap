package yarnwrap.network.packet.s2c.play;
public class EntitySpawnS2CPacket { public net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket wrapperContained; public EntitySpawnS2CPacket(net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double y() { return wrapperContained.y; }
// public byte pitch() { return wrapperContained.pitch; }
// public double x() { return wrapperContained.x; }
// public int velocityZ() { return wrapperContained.velocityZ; }
// public int velocityY() { return wrapperContained.velocityY; }
// public int velocityX() { return wrapperContained.velocityX; }
// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public int entityId() { return wrapperContained.entityId; }
// public int entityData() { return wrapperContained.entityData; }
// public yarnwrap.entity.EntityType entityType() { return new yarnwrap.entity.EntityType(wrapperContained.entityType); }
// public double z() { return wrapperContained.z; }
// public byte yaw() { return wrapperContained.yaw; }
// public double VELOCITY_SCALE() { return wrapperContained.VELOCITY_SCALE; }
// public double MAX_ABSOLUTE_VELOCITY() { return wrapperContained.MAX_ABSOLUTE_VELOCITY; }
// public byte headYaw() { return wrapperContained.headYaw; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
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