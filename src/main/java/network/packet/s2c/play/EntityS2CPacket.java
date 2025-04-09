package yarnwrap.network.packet.s2c.play;
public class EntityS2CPacket { public net.minecraft.network.packet.s2c.play.EntityS2CPacket wrapperContained; public EntityS2CPacket(net.minecraft.network.packet.s2c.play.EntityS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean rotate() { return wrapperContained.rotate; }
// public boolean onGround() { return wrapperContained.onGround; }
// public short deltaZ() { return wrapperContained.deltaZ; }
// public short deltaY() { return wrapperContained.deltaY; }
// public short deltaX() { return wrapperContained.deltaX; }
// public int id() { return wrapperContained.id; }
// public byte pitch() { return wrapperContained.pitch; }
// public byte yaw() { return wrapperContained.yaw; }
// public boolean positionChanged() { return wrapperContained.positionChanged; }
public yarnwrap.entity.Entity getEntity(yarnwrap.world.World world) { return new yarnwrap.entity.Entity(wrapperContained.getEntity(world.wrapperContained)); }
public byte getYaw() { return wrapperContained.getYaw(); }
public byte getPitch() { return wrapperContained.getPitch(); }
public boolean hasRotation() { return wrapperContained.hasRotation(); }
public boolean isOnGround() { return wrapperContained.isOnGround(); }
public boolean isPositionChanged() { return wrapperContained.isPositionChanged(); }
public short getDeltaX() { return wrapperContained.getDeltaX(); }
public short getDeltaY() { return wrapperContained.getDeltaY(); }
public short getDeltaZ() { return wrapperContained.getDeltaZ(); }

}