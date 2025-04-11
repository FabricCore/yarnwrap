package yarnwrap.util.math;
public class AffineTransformations { public net.minecraft.util.math.AffineTransformations wrapperContained; public AffineTransformations(net.minecraft.util.math.AffineTransformations wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map DIRECTION_ROTATIONS() { return wrapperContained.DIRECTION_ROTATIONS; }
// public void DIRECTION_ROTATIONS(java.util.Map value) { wrapperContained.DIRECTION_ROTATIONS = value; }
public java.util.Map INVERTED_DIRECTION_ROTATIONS() { return wrapperContained.INVERTED_DIRECTION_ROTATIONS; }
// public void INVERTED_DIRECTION_ROTATIONS(java.util.Map value) { wrapperContained.INVERTED_DIRECTION_ROTATIONS = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public yarnwrap.util.math.AffineTransformation setupUvLock(yarnwrap.util.math.AffineTransformation transformation) { return new yarnwrap.util.math.AffineTransformation(wrapperContained.setupUvLock(transformation.wrapperContained)); }
public yarnwrap.util.math.AffineTransformation uvLock(yarnwrap.util.math.AffineTransformation transformation,yarnwrap.util.math.Direction dir) { return new yarnwrap.util.math.AffineTransformation(wrapperContained.uvLock(transformation.wrapperContained,dir.wrapperContained)); }
// public void method_23222(java.util.EnumMap map) { wrapperContained.method_23222(map); }
// public void method_23223(java.util.EnumMap map) { wrapperContained.method_23223(map); }
public yarnwrap.util.math.AffineTransformation method_35829(yarnwrap.util.math.AffineTransformation transformation) { return new yarnwrap.util.math.AffineTransformation(wrapperContained.method_35829(transformation.wrapperContained)); }

}