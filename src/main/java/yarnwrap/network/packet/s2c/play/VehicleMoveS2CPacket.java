package yarnwrap.network.packet.s2c.play;
public class VehicleMoveS2CPacket { public net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket wrapperContained; public VehicleMoveS2CPacket(net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.yaw; }
// public static void yaw(float value, ) { net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.yaw = value; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.pitch; }
// public static void pitch(float value, ) { net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.pitch = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.CODEC = value.wrapperContained; }

// public float yaw() { return wrapperContained.yaw(); }
// // public static float yaw() { return net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.yaw(); }
// public float pitch() { return wrapperContained.pitch(); }
// // public static float pitch() { return net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.pitch(); }
// public yarnwrap.network.packet.s2c.play.VehicleMoveS2CPacket fromVehicle(yarnwrap.entity.Entity vehicle) { return new yarnwrap.network.packet.s2c.play.VehicleMoveS2CPacket(wrapperContained.fromVehicle(vehicle.wrapperContained)); }
// public static yarnwrap.network.packet.s2c.play.VehicleMoveS2CPacket fromVehicle(yarnwrap.entity.Entity vehicle, ) { return new yarnwrap.network.packet.s2c.play.VehicleMoveS2CPacket(net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket.fromVehicle(vehicle.wrapperContained)); }

}