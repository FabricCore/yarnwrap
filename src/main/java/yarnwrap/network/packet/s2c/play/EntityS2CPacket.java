package yarnwrap.network.packet.s2c.play;
public class EntityS2CPacket { public net.minecraft.network.packet.s2c.play.EntityS2CPacket wrapperContained; public EntityS2CPacket(net.minecraft.network.packet.s2c.play.EntityS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean rotate() { return wrapperContained.rotate; }
// public void rotate(boolean value) { wrapperContained.rotate = value; }
// public boolean onGround() { return wrapperContained.onGround; }
// public void onGround(boolean value) { wrapperContained.onGround = value; }
// public short deltaZ() { return wrapperContained.deltaZ; }
// public void deltaZ(short value) { wrapperContained.deltaZ = value; }
// public short deltaY() { return wrapperContained.deltaY; }
// public void deltaY(short value) { wrapperContained.deltaY = value; }
// public short deltaX() { return wrapperContained.deltaX; }
// public void deltaX(short value) { wrapperContained.deltaX = value; }
// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public byte pitch() { return wrapperContained.pitch; }
// public void pitch(byte value) { wrapperContained.pitch = value; }
// public byte yaw() { return wrapperContained.yaw; }
// public void yaw(byte value) { wrapperContained.yaw = value; }
// public boolean positionChanged() { return wrapperContained.positionChanged; }
// public void positionChanged(boolean value) { wrapperContained.positionChanged = value; }
// public EntityS2CPacket(int entityId,short deltaX,short deltaY,short deltaZ,byte yaw,byte pitch,boolean onGround,boolean rotate,boolean positionChanged) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityS2CPacket(entityId,deltaX,deltaY,deltaZ,yaw,pitch,onGround,rotate,positionChanged); }
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