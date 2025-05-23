package yarnwrap.util.math;
public class AxisRotation { public net.minecraft.util.math.AxisRotation wrapperContained; public AxisRotation(net.minecraft.util.math.AxisRotation wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.math.AxisRotation.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.math.AxisRotation.CODEC = value; }

public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.util.math.AxisRotation.index; }
// public static void index(int value, ) { net.minecraft.util.math.AxisRotation.index = value; }

// // public AxisRotation(java.lang.String index) { this.wrapperContained = new net.minecraft.util.math.AxisRotation(index); }
// public yarnwrap.util.math.AxisRotation fromDegrees(int degrees) { return new yarnwrap.util.math.AxisRotation(wrapperContained.fromDegrees(degrees)); }
// public static yarnwrap.util.math.AxisRotation fromDegrees(int degrees, ) { return new yarnwrap.util.math.AxisRotation(net.minecraft.util.math.AxisRotation.fromDegrees(degrees)); }
// public java.lang.Integer method_68065(yarnwrap.util.math.AxisRotation rotation) { return wrapperContained.method_68065(rotation.wrapperContained); }
// public static java.lang.Integer method_68065(yarnwrap.util.math.AxisRotation rotation, ) { return net.minecraft.util.math.AxisRotation.method_68065(rotation.wrapperContained); }
// public com.mojang.serialization.DataResult method_68066(java.lang.Integer degrees) { return wrapperContained.method_68066(degrees); }
// public static com.mojang.serialization.DataResult method_68066(java.lang.Integer degrees, ) { return net.minecraft.util.math.AxisRotation.method_68066(degrees); }
public int rotate(int index) { return wrapperContained.rotate(index); }
// public static int rotate(int index, ) { return net.minecraft.util.math.AxisRotation.rotate(index); }

}