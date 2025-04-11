package yarnwrap.util.math;
public class RotationAxis { public net.minecraft.util.math.RotationAxis wrapperContained; public RotationAxis(net.minecraft.util.math.RotationAxis wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.RotationAxis NEGATIVE_X() { return new yarnwrap.util.math.RotationAxis(wrapperContained.NEGATIVE_X); }
// public void NEGATIVE_X(yarnwrap.util.math.RotationAxis value) { wrapperContained.NEGATIVE_X = value.wrapperContained; }
public yarnwrap.util.math.RotationAxis POSITIVE_X() { return new yarnwrap.util.math.RotationAxis(wrapperContained.POSITIVE_X); }
// public void POSITIVE_X(yarnwrap.util.math.RotationAxis value) { wrapperContained.POSITIVE_X = value.wrapperContained; }
public yarnwrap.util.math.RotationAxis NEGATIVE_Y() { return new yarnwrap.util.math.RotationAxis(wrapperContained.NEGATIVE_Y); }
// public void NEGATIVE_Y(yarnwrap.util.math.RotationAxis value) { wrapperContained.NEGATIVE_Y = value.wrapperContained; }
public yarnwrap.util.math.RotationAxis POSITIVE_Y() { return new yarnwrap.util.math.RotationAxis(wrapperContained.POSITIVE_Y); }
// public void POSITIVE_Y(yarnwrap.util.math.RotationAxis value) { wrapperContained.POSITIVE_Y = value.wrapperContained; }
public yarnwrap.util.math.RotationAxis NEGATIVE_Z() { return new yarnwrap.util.math.RotationAxis(wrapperContained.NEGATIVE_Z); }
// public void NEGATIVE_Z(yarnwrap.util.math.RotationAxis value) { wrapperContained.NEGATIVE_Z = value.wrapperContained; }
public yarnwrap.util.math.RotationAxis POSITIVE_Z() { return new yarnwrap.util.math.RotationAxis(wrapperContained.POSITIVE_Z); }
// public void POSITIVE_Z(yarnwrap.util.math.RotationAxis value) { wrapperContained.POSITIVE_Z = value.wrapperContained; }
// public yarnwrap.util.math.RotationAxis of(org.joml.Vector3f axis) { return new yarnwrap.util.math.RotationAxis(wrapperContained.of(axis)); }

}