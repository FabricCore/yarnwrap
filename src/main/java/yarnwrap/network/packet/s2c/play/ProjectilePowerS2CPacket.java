package yarnwrap.network.packet.s2c.play;
public class ProjectilePowerS2CPacket { public net.minecraft.network.packet.s2c.play.ProjectilePowerS2CPacket wrapperContained; public ProjectilePowerS2CPacket(net.minecraft.network.packet.s2c.play.ProjectilePowerS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.ProjectilePowerS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.ProjectilePowerS2CPacket.CODEC = value.wrapperContained; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.s2c.play.ProjectilePowerS2CPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.s2c.play.ProjectilePowerS2CPacket.entityId = value; }

// public double accelerationPower() { return wrapperContained.accelerationPower; }
// public void accelerationPower(double value) { wrapperContained.accelerationPower = value; }
// public static double accelerationPower() { return net.minecraft.network.packet.s2c.play.ProjectilePowerS2CPacket.accelerationPower; }
// public static void accelerationPower(double value, ) { net.minecraft.network.packet.s2c.play.ProjectilePowerS2CPacket.accelerationPower = value; }

public ProjectilePowerS2CPacket(int entityId,double accelerationPower) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ProjectilePowerS2CPacket(entityId,accelerationPower); }
// public ProjectilePowerS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ProjectilePowerS2CPacket(buf.wrapperContained); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.ProjectilePowerS2CPacket.write(buf.wrapperContained); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public static int getEntityId() { return net.minecraft.network.packet.s2c.play.ProjectilePowerS2CPacket.getEntityId(); }
public double getAccelerationPower() { return wrapperContained.getAccelerationPower(); }
// public static double getAccelerationPower() { return net.minecraft.network.packet.s2c.play.ProjectilePowerS2CPacket.getAccelerationPower(); }

}