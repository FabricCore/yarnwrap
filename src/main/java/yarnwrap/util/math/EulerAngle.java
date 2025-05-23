package yarnwrap.util.math;
public class EulerAngle { public net.minecraft.util.math.EulerAngle wrapperContained; public EulerAngle(net.minecraft.util.math.EulerAngle wrapperContained) { this.wrapperContained = wrapperContained; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.util.math.EulerAngle.pitch; }
// public static void pitch(float value, ) { net.minecraft.util.math.EulerAngle.pitch = value; }

// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.util.math.EulerAngle.yaw; }
// public static void yaw(float value, ) { net.minecraft.util.math.EulerAngle.yaw = value; }

// public float roll() { return wrapperContained.roll; }
// public void roll(float value) { wrapperContained.roll = value; }
// public static float roll() { return net.minecraft.util.math.EulerAngle.roll; }
// public static void roll(float value, ) { net.minecraft.util.math.EulerAngle.roll = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.util.math.EulerAngle.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.util.math.EulerAngle.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.math.EulerAngle.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.math.EulerAngle.CODEC = value; }

// public float pitch() { return wrapperContained.pitch(); }
// // public static float pitch() { return net.minecraft.util.math.EulerAngle.pitch(); }
// public float yaw() { return wrapperContained.yaw(); }
// // public static float yaw() { return net.minecraft.util.math.EulerAngle.yaw(); }
// public float roll() { return wrapperContained.roll(); }
// // public static float roll() { return net.minecraft.util.math.EulerAngle.roll(); }
// public com.mojang.serialization.DataResult method_68073(java.util.List list) { return wrapperContained.method_68073(list); }
// public static com.mojang.serialization.DataResult method_68073(java.util.List list, ) { return net.minecraft.util.math.EulerAngle.method_68073(list); }
// public java.util.List method_68074(yarnwrap.util.math.EulerAngle angle) { return wrapperContained.method_68074(angle.wrapperContained); }
// public static java.util.List method_68074(yarnwrap.util.math.EulerAngle angle, ) { return net.minecraft.util.math.EulerAngle.method_68074(angle.wrapperContained); }
// public yarnwrap.util.math.EulerAngle method_68075(java.util.List angles) { return new yarnwrap.util.math.EulerAngle(wrapperContained.method_68075(angles)); }
// public static yarnwrap.util.math.EulerAngle method_68075(java.util.List angles, ) { return new yarnwrap.util.math.EulerAngle(net.minecraft.util.math.EulerAngle.method_68075(angles)); }

}