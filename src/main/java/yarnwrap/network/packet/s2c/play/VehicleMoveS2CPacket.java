package yarnwrap.network.packet.s2c.play;
public class VehicleMoveS2CPacket { public net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket wrapperContained; public VehicleMoveS2CPacket(net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public static double z() { return net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.z; }
// public static void z(double value, ) { net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.z = value; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.pitch; }
// public static void pitch(float value, ) { net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.pitch = value; }

// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public static double y() { return net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.y; }
// public static void y(double value, ) { net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.y = value; }

// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.yaw; }
// public static void yaw(float value, ) { net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.yaw = value; }

// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public static double x() { return net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.x; }
// public static void x(double value, ) { net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.x = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.CODEC = value.wrapperContained; }

public VehicleMoveS2CPacket(yarnwrap.entity.Entity entity) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket(entity.wrapperContained); }
// public VehicleMoveS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket(buf.wrapperContained); }
public double getZ() { return wrapperContained.getZ(); }
// public static double getZ() { return net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.getZ(); }
public float getPitch() { return wrapperContained.getPitch(); }
// public static float getPitch() { return net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.getPitch(); }
public double getX() { return wrapperContained.getX(); }
// public static double getX() { return net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.getX(); }
public double getY() { return wrapperContained.getY(); }
// public static double getY() { return net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.getY(); }
public float getYaw() { return wrapperContained.getYaw(); }
// public static float getYaw() { return net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.getYaw(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.write(buf.wrapperContained); }

}