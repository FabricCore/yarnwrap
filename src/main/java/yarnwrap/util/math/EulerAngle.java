package yarnwrap.util.math;
public class EulerAngle { public net.minecraft.util.math.EulerAngle wrapperContained; public EulerAngle(net.minecraft.util.math.EulerAngle wrapperContained) { this.wrapperContained = wrapperContained; }

// public float roll() { return wrapperContained.roll; }
// public void roll(float value) { wrapperContained.roll = value; }
// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public EulerAngle(float pitch,float yaw,float roll) { this.wrapperContained = new net.minecraft.util.math.EulerAngle(pitch,yaw,roll); }
public EulerAngle(yarnwrap.nbt.NbtList serialized) { this.wrapperContained = new net.minecraft.util.math.EulerAngle(serialized.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public yarnwrap.nbt.NbtList toNbt() { return new yarnwrap.nbt.NbtList(wrapperContained.toNbt()); }
public float getPitch() { return wrapperContained.getPitch(); }
public float getYaw() { return wrapperContained.getYaw(); }
public float getRoll() { return wrapperContained.getRoll(); }
public float getWrappedPitch() { return wrapperContained.getWrappedPitch(); }
public float getWrappedYaw() { return wrapperContained.getWrappedYaw(); }
public float getWrappedRoll() { return wrapperContained.getWrappedRoll(); }

}