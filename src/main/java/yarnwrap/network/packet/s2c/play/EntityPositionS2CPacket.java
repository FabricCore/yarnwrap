package yarnwrap.network.packet.s2c.play;
public class EntityPositionS2CPacket { public net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket wrapperContained; public EntityPositionS2CPacket(net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public static double z() { return net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.z; }
// public static void z(double value, ) { net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.z = value; }

// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public static double y() { return net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.y; }
// public static void y(double value, ) { net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.y = value; }

// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public static double x() { return net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.x; }
// public static void x(double value, ) { net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.x = value; }

// public boolean onGround() { return wrapperContained.onGround; }
// public void onGround(boolean value) { wrapperContained.onGround = value; }
// public static boolean onGround() { return net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.onGround; }
// public static void onGround(boolean value, ) { net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.onGround = value; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.entityId = value; }

// public byte pitch() { return wrapperContained.pitch; }
// public void pitch(byte value) { wrapperContained.pitch = value; }
// public static byte pitch() { return net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.pitch; }
// public static void pitch(byte value, ) { net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.pitch = value; }

// public byte yaw() { return wrapperContained.yaw; }
// public void yaw(byte value) { wrapperContained.yaw = value; }
// public static byte yaw() { return net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.yaw; }
// public static void yaw(byte value, ) { net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.yaw = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.CODEC = value.wrapperContained; }

public EntityPositionS2CPacket(yarnwrap.entity.Entity entity) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket(entity.wrapperContained); }
// public EntityPositionS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket(buf.wrapperContained); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public static int getEntityId() { return net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.getEntityId(); }
public double getX() { return wrapperContained.getX(); }
// public static double getX() { return net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.getX(); }
public double getZ() { return wrapperContained.getZ(); }
// public static double getZ() { return net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.getZ(); }
public double getY() { return wrapperContained.getY(); }
// public static double getY() { return net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.getY(); }
public byte getYaw() { return wrapperContained.getYaw(); }
// public static byte getYaw() { return net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.getYaw(); }
public byte getPitch() { return wrapperContained.getPitch(); }
// public static byte getPitch() { return net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.getPitch(); }
public boolean isOnGround() { return wrapperContained.isOnGround(); }
// public static boolean isOnGround() { return net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.isOnGround(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket.write(buf.wrapperContained); }

}