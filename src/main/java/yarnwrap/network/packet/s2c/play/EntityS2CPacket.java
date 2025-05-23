package yarnwrap.network.packet.s2c.play;
public class EntityS2CPacket { public net.minecraft.network.packet.s2c.play.EntityS2CPacket wrapperContained; public EntityS2CPacket(net.minecraft.network.packet.s2c.play.EntityS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean rotate() { return wrapperContained.rotate; }
// public void rotate(boolean value) { wrapperContained.rotate = value; }
// public static boolean rotate() { return net.minecraft.network.packet.s2c.play.EntityS2CPacket.rotate; }
// public static void rotate(boolean value, ) { net.minecraft.network.packet.s2c.play.EntityS2CPacket.rotate = value; }

// public boolean onGround() { return wrapperContained.onGround; }
// public void onGround(boolean value) { wrapperContained.onGround = value; }
// public static boolean onGround() { return net.minecraft.network.packet.s2c.play.EntityS2CPacket.onGround; }
// public static void onGround(boolean value, ) { net.minecraft.network.packet.s2c.play.EntityS2CPacket.onGround = value; }

// public short deltaZ() { return wrapperContained.deltaZ; }
// public void deltaZ(short value) { wrapperContained.deltaZ = value; }
// public static short deltaZ() { return net.minecraft.network.packet.s2c.play.EntityS2CPacket.deltaZ; }
// public static void deltaZ(short value, ) { net.minecraft.network.packet.s2c.play.EntityS2CPacket.deltaZ = value; }

// public short deltaY() { return wrapperContained.deltaY; }
// public void deltaY(short value) { wrapperContained.deltaY = value; }
// public static short deltaY() { return net.minecraft.network.packet.s2c.play.EntityS2CPacket.deltaY; }
// public static void deltaY(short value, ) { net.minecraft.network.packet.s2c.play.EntityS2CPacket.deltaY = value; }

// public short deltaX() { return wrapperContained.deltaX; }
// public void deltaX(short value) { wrapperContained.deltaX = value; }
// public static short deltaX() { return net.minecraft.network.packet.s2c.play.EntityS2CPacket.deltaX; }
// public static void deltaX(short value, ) { net.minecraft.network.packet.s2c.play.EntityS2CPacket.deltaX = value; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.network.packet.s2c.play.EntityS2CPacket.id; }
// public static void id(int value, ) { net.minecraft.network.packet.s2c.play.EntityS2CPacket.id = value; }

// public byte pitch() { return wrapperContained.pitch; }
// public void pitch(byte value) { wrapperContained.pitch = value; }
// public static byte pitch() { return net.minecraft.network.packet.s2c.play.EntityS2CPacket.pitch; }
// public static void pitch(byte value, ) { net.minecraft.network.packet.s2c.play.EntityS2CPacket.pitch = value; }

// public byte yaw() { return wrapperContained.yaw; }
// public void yaw(byte value) { wrapperContained.yaw = value; }
// public static byte yaw() { return net.minecraft.network.packet.s2c.play.EntityS2CPacket.yaw; }
// public static void yaw(byte value, ) { net.minecraft.network.packet.s2c.play.EntityS2CPacket.yaw = value; }

// public boolean positionChanged() { return wrapperContained.positionChanged; }
// public void positionChanged(boolean value) { wrapperContained.positionChanged = value; }
// public static boolean positionChanged() { return net.minecraft.network.packet.s2c.play.EntityS2CPacket.positionChanged; }
// public static void positionChanged(boolean value, ) { net.minecraft.network.packet.s2c.play.EntityS2CPacket.positionChanged = value; }

// public EntityS2CPacket(int entityId,short deltaX,short deltaY,short deltaZ,byte yaw,byte pitch,boolean onGround,boolean rotate,boolean positionChanged) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityS2CPacket(entityId,deltaX,deltaY,deltaZ,yaw,pitch,onGround,rotate,positionChanged); }
public yarnwrap.entity.Entity getEntity(yarnwrap.world.World world) { return new yarnwrap.entity.Entity(wrapperContained.getEntity(world.wrapperContained)); }
// public static yarnwrap.entity.Entity getEntity(yarnwrap.world.World world, ) { return new yarnwrap.entity.Entity(net.minecraft.network.packet.s2c.play.EntityS2CPacket.getEntity(world.wrapperContained)); }
public float getYaw() { return wrapperContained.getYaw(); }
// public static float getYaw() { return net.minecraft.network.packet.s2c.play.EntityS2CPacket.getYaw(); }
public float getPitch() { return wrapperContained.getPitch(); }
// public static float getPitch() { return net.minecraft.network.packet.s2c.play.EntityS2CPacket.getPitch(); }
public boolean hasRotation() { return wrapperContained.hasRotation(); }
// public static boolean hasRotation() { return net.minecraft.network.packet.s2c.play.EntityS2CPacket.hasRotation(); }
public boolean isOnGround() { return wrapperContained.isOnGround(); }
// public static boolean isOnGround() { return net.minecraft.network.packet.s2c.play.EntityS2CPacket.isOnGround(); }
public boolean isPositionChanged() { return wrapperContained.isPositionChanged(); }
// public static boolean isPositionChanged() { return net.minecraft.network.packet.s2c.play.EntityS2CPacket.isPositionChanged(); }
public short getDeltaX() { return wrapperContained.getDeltaX(); }
// public static short getDeltaX() { return net.minecraft.network.packet.s2c.play.EntityS2CPacket.getDeltaX(); }
public short getDeltaY() { return wrapperContained.getDeltaY(); }
// public static short getDeltaY() { return net.minecraft.network.packet.s2c.play.EntityS2CPacket.getDeltaY(); }
public short getDeltaZ() { return wrapperContained.getDeltaZ(); }
// public static short getDeltaZ() { return net.minecraft.network.packet.s2c.play.EntityS2CPacket.getDeltaZ(); }

}