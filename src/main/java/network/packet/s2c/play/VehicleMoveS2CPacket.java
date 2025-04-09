package yarnwrap.network.packet.s2c.play;
public class VehicleMoveS2CPacket { public net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket wrapperContained; public VehicleMoveS2CPacket(net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public float pitch() { return wrapperContained.pitch; }
// public double y() { return wrapperContained.y; }
// public float yaw() { return wrapperContained.yaw; }
// public double x() { return wrapperContained.x; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public double getZ() { return wrapperContained.getZ(); }
public float getPitch() { return wrapperContained.getPitch(); }
public double getX() { return wrapperContained.getX(); }
public double getY() { return wrapperContained.getY(); }
public float getYaw() { return wrapperContained.getYaw(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}