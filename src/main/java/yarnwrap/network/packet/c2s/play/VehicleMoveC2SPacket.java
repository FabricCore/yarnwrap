package yarnwrap.network.packet.c2s.play;
public class VehicleMoveC2SPacket { public net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket wrapperContained; public VehicleMoveC2SPacket(net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public static double z() { return net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.z; }
// public static void z(double value, ) { net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.z = value; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.pitch; }
// public static void pitch(float value, ) { net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.pitch = value; }

// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public static double y() { return net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.y; }
// public static void y(double value, ) { net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.y = value; }

// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.yaw; }
// public static void yaw(float value, ) { net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.yaw = value; }

// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public static double x() { return net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.x; }
// public static void x(double value, ) { net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.x = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.CODEC = value.wrapperContained; }

public VehicleMoveC2SPacket(yarnwrap.entity.Entity entity) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket(entity.wrapperContained); }
// public VehicleMoveC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket(buf.wrapperContained); }
public double getZ() { return wrapperContained.getZ(); }
// public static double getZ() { return net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.getZ(); }
public float getPitch() { return wrapperContained.getPitch(); }
// public static float getPitch() { return net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.getPitch(); }
public double getX() { return wrapperContained.getX(); }
// public static double getX() { return net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.getX(); }
public double getY() { return wrapperContained.getY(); }
// public static double getY() { return net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.getY(); }
public float getYaw() { return wrapperContained.getYaw(); }
// public static float getYaw() { return net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.getYaw(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.write(buf.wrapperContained); }

}