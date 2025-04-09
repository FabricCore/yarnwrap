package yarnwrap.util.math;
public class RotationAxis { public net.minecraft.util.math.RotationAxis wrapperContained; public RotationAxis(net.minecraft.util.math.RotationAxis wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.RotationAxis NEGATIVE_X() { return new yarnwrap.util.math.RotationAxis(wrapperContained.NEGATIVE_X); }
public yarnwrap.util.math.RotationAxis POSITIVE_X() { return new yarnwrap.util.math.RotationAxis(wrapperContained.POSITIVE_X); }
public yarnwrap.util.math.RotationAxis NEGATIVE_Y() { return new yarnwrap.util.math.RotationAxis(wrapperContained.NEGATIVE_Y); }
public yarnwrap.util.math.RotationAxis POSITIVE_Y() { return new yarnwrap.util.math.RotationAxis(wrapperContained.POSITIVE_Y); }
public yarnwrap.util.math.RotationAxis NEGATIVE_Z() { return new yarnwrap.util.math.RotationAxis(wrapperContained.NEGATIVE_Z); }
public yarnwrap.util.math.RotationAxis POSITIVE_Z() { return new yarnwrap.util.math.RotationAxis(wrapperContained.POSITIVE_Z); }
// public yarnwrap.util.math.RotationAxis of(org.joml.Vector3f axis) { return new yarnwrap.util.math.RotationAxis(wrapperContained.of(axis)); }

}