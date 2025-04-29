package yarnwrap.util.math;
public class EulerAngle { public net.minecraft.util.math.EulerAngle wrapperContained; public EulerAngle(net.minecraft.util.math.EulerAngle wrapperContained) { this.wrapperContained = wrapperContained; }

// public float roll() { return wrapperContained.roll; }
// public void roll(float value) { wrapperContained.roll = value; }
// public static float roll() { return net.minecraft.util.math.EulerAngle.roll; }
// public static void roll(float value, ) { net.minecraft.util.math.EulerAngle.roll = value; }

// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.util.math.EulerAngle.yaw; }
// public static void yaw(float value, ) { net.minecraft.util.math.EulerAngle.yaw = value; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.util.math.EulerAngle.pitch; }
// public static void pitch(float value, ) { net.minecraft.util.math.EulerAngle.pitch = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.util.math.EulerAngle.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.util.math.EulerAngle.PACKET_CODEC = value.wrapperContained; }

public EulerAngle(float pitch,float yaw,float roll) { this.wrapperContained = new net.minecraft.util.math.EulerAngle(pitch,yaw,roll); }
public EulerAngle(yarnwrap.nbt.NbtList serialized) { this.wrapperContained = new net.minecraft.util.math.EulerAngle(serialized.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.util.math.EulerAngle.equals(o); }
public yarnwrap.nbt.NbtList toNbt() { return new yarnwrap.nbt.NbtList(wrapperContained.toNbt()); }
// public static yarnwrap.nbt.NbtList toNbt() { return new yarnwrap.nbt.NbtList(net.minecraft.util.math.EulerAngle.toNbt()); }
public float getPitch() { return wrapperContained.getPitch(); }
// public static float getPitch() { return net.minecraft.util.math.EulerAngle.getPitch(); }
public float getYaw() { return wrapperContained.getYaw(); }
// public static float getYaw() { return net.minecraft.util.math.EulerAngle.getYaw(); }
public float getRoll() { return wrapperContained.getRoll(); }
// public static float getRoll() { return net.minecraft.util.math.EulerAngle.getRoll(); }
public float getWrappedPitch() { return wrapperContained.getWrappedPitch(); }
// public static float getWrappedPitch() { return net.minecraft.util.math.EulerAngle.getWrappedPitch(); }
public float getWrappedYaw() { return wrapperContained.getWrappedYaw(); }
// public static float getWrappedYaw() { return net.minecraft.util.math.EulerAngle.getWrappedYaw(); }
public float getWrappedRoll() { return wrapperContained.getWrappedRoll(); }
// public static float getWrappedRoll() { return net.minecraft.util.math.EulerAngle.getWrappedRoll(); }

}