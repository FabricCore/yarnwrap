package yarnwrap.network.packet.s2c.play;
public class VehicleMoveS2CPacket { public net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket wrapperContained; public VehicleMoveS2CPacket(net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public double getZ() { return wrapperContained.getZ(); }
public float getPitch() { return wrapperContained.getPitch(); }
public double getX() { return wrapperContained.getX(); }
public double getY() { return wrapperContained.getY(); }
public float getYaw() { return wrapperContained.getYaw(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}