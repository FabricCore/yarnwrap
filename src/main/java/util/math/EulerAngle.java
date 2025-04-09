package yarnwrap.util.math;
public class EulerAngle { public net.minecraft.util.math.EulerAngle wrapperContained; public EulerAngle(net.minecraft.util.math.EulerAngle wrapperContained) { this.wrapperContained = wrapperContained; }

// public float roll() { return wrapperContained.roll; }
// public float yaw() { return wrapperContained.yaw; }
// public float pitch() { return wrapperContained.pitch; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public yarnwrap.nbt.NbtList toNbt() { return new yarnwrap.nbt.NbtList(wrapperContained.toNbt()); }
public float getPitch() { return wrapperContained.getPitch(); }
public float getYaw() { return wrapperContained.getYaw(); }
public float getRoll() { return wrapperContained.getRoll(); }
public float getWrappedPitch() { return wrapperContained.getWrappedPitch(); }
public float getWrappedYaw() { return wrapperContained.getWrappedYaw(); }
public float getWrappedRoll() { return wrapperContained.getWrappedRoll(); }

}