package yarnwrap.network.packet.s2c.play;
public class EntityPositionS2CPacket { public net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket wrapperContained; public EntityPositionS2CPacket(net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public double y() { return wrapperContained.y; }
// public double x() { return wrapperContained.x; }
// public boolean onGround() { return wrapperContained.onGround; }
// public int entityId() { return wrapperContained.entityId; }
// public byte pitch() { return wrapperContained.pitch; }
// public byte yaw() { return wrapperContained.yaw; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getEntityId() { return wrapperContained.getEntityId(); }
public double getX() { return wrapperContained.getX(); }
public double getZ() { return wrapperContained.getZ(); }
public double getY() { return wrapperContained.getY(); }
public byte getYaw() { return wrapperContained.getYaw(); }
public byte getPitch() { return wrapperContained.getPitch(); }
public boolean isOnGround() { return wrapperContained.isOnGround(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}