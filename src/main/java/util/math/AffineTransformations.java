package yarnwrap.util.math;
public class AffineTransformations { public net.minecraft.util.math.AffineTransformations wrapperContained; public AffineTransformations(net.minecraft.util.math.AffineTransformations wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map DIRECTION_ROTATIONS() { return wrapperContained.DIRECTION_ROTATIONS; }
public java.util.Map INVERTED_DIRECTION_ROTATIONS() { return wrapperContained.INVERTED_DIRECTION_ROTATIONS; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.util.math.AffineTransformation setupUvLock(yarnwrap.util.math.AffineTransformation transformation) { return new yarnwrap.util.math.AffineTransformation(wrapperContained.setupUvLock(transformation.wrapperContained)); }
public yarnwrap.util.math.AffineTransformation uvLock(yarnwrap.util.math.AffineTransformation transformation,yarnwrap.util.math.Direction dir) { return new yarnwrap.util.math.AffineTransformation(wrapperContained.uvLock(transformation.wrapperContained,dir.wrapperContained)); }

}