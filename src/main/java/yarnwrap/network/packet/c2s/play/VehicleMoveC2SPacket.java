package yarnwrap.network.packet.c2s.play;
public class VehicleMoveC2SPacket { public net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket wrapperContained; public VehicleMoveC2SPacket(net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.yaw; }
// public static void yaw(float value, ) { net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.yaw = value; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.pitch; }
// public static void pitch(float value, ) { net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.pitch = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.CODEC = value.wrapperContained; }

// public float yaw() { return wrapperContained.yaw(); }
// // public static float yaw() { return net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.yaw(); }
// public float pitch() { return wrapperContained.pitch(); }
// // public static float pitch() { return net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.pitch(); }
// public yarnwrap.network.packet.c2s.play.VehicleMoveC2SPacket fromVehicle(yarnwrap.entity.Entity vehicle) { return new yarnwrap.network.packet.c2s.play.VehicleMoveC2SPacket(wrapperContained.fromVehicle(vehicle.wrapperContained)); }
// public static yarnwrap.network.packet.c2s.play.VehicleMoveC2SPacket fromVehicle(yarnwrap.entity.Entity vehicle, ) { return new yarnwrap.network.packet.c2s.play.VehicleMoveC2SPacket(net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket.fromVehicle(vehicle.wrapperContained)); }

}