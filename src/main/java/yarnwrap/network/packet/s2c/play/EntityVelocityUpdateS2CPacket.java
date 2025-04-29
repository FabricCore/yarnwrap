package yarnwrap.network.packet.s2c.play;
public class EntityVelocityUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket wrapperContained; public EntityVelocityUpdateS2CPacket(net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int velocityZ() { return wrapperContained.velocityZ; }
// public void velocityZ(int value) { wrapperContained.velocityZ = value; }
// public static int velocityZ() { return net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket.velocityZ; }
// public static void velocityZ(int value, ) { net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket.velocityZ = value; }

// public int velocityY() { return wrapperContained.velocityY; }
// public void velocityY(int value) { wrapperContained.velocityY = value; }
// public static int velocityY() { return net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket.velocityY; }
// public static void velocityY(int value, ) { net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket.velocityY = value; }

// public int velocityX() { return wrapperContained.velocityX; }
// public void velocityX(int value) { wrapperContained.velocityX = value; }
// public static int velocityX() { return net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket.velocityX; }
// public static void velocityX(int value, ) { net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket.velocityX = value; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket.entityId = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket.CODEC = value.wrapperContained; }

public EntityVelocityUpdateS2CPacket(int entityId,yarnwrap.util.math.Vec3d velocity) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket(entityId,velocity.wrapperContained); }
public EntityVelocityUpdateS2CPacket(yarnwrap.entity.Entity entity) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket(entity.wrapperContained); }
// public EntityVelocityUpdateS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket(buf.wrapperContained); }
public double getVelocityX() { return wrapperContained.getVelocityX(); }
// public static double getVelocityX() { return net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket.getVelocityX(); }
public double getVelocityY() { return wrapperContained.getVelocityY(); }
// public static double getVelocityY() { return net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket.getVelocityY(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public static int getEntityId() { return net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket.getEntityId(); }
public double getVelocityZ() { return wrapperContained.getVelocityZ(); }
// public static double getVelocityZ() { return net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket.getVelocityZ(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket.write(buf.wrapperContained); }

}