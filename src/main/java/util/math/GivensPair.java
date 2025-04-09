package yarnwrap.util.math;
public class GivensPair { public net.minecraft.util.math.GivensPair wrapperContained; public GivensPair(net.minecraft.util.math.GivensPair wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.GivensPair negateSin() { return new yarnwrap.util.math.GivensPair(wrapperContained.negateSin()); }
public yarnwrap.util.math.GivensPair fromAngle(float radians) { return new yarnwrap.util.math.GivensPair(wrapperContained.fromAngle(radians)); }
public yarnwrap.util.math.GivensPair normalize(float a,float b) { return new yarnwrap.util.math.GivensPair(wrapperContained.normalize(a,b)); }
// public org.joml.Matrix3f setRotationX() { return wrapperContained.setRotationX(); }
// public org.joml.Quaternionf setXRotation() { return wrapperContained.setXRotation(); }
public float cosDouble() { return wrapperContained.cosDouble(); }
// public org.joml.Matrix3f setRotationY() { return wrapperContained.setRotationY(); }
// public org.joml.Quaternionf setYRotation() { return wrapperContained.setYRotation(); }
public float sinDouble() { return wrapperContained.sinDouble(); }
// public org.joml.Matrix3f setRotationZ() { return wrapperContained.setRotationZ(); }
// public org.joml.Quaternionf setZRotation() { return wrapperContained.setZRotation(); }

}