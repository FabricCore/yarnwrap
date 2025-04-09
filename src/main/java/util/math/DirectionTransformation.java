package yarnwrap.util.math;
public class DirectionTransformation { public net.minecraft.util.math.DirectionTransformation wrapperContained; public DirectionTransformation(net.minecraft.util.math.DirectionTransformation wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.joml.Matrix3f matrix() { return wrapperContained.matrix; }
// public java.lang.String name() { return wrapperContained.name; }
// public java.util.Map mappings() { return wrapperContained.mappings; }
// public boolean flipX() { return wrapperContained.flipX; }
// public boolean flipY() { return wrapperContained.flipY; }
// public boolean flipZ() { return wrapperContained.flipZ; }
// public yarnwrap.util.math.AxisTransformation axisTransformation() { return new yarnwrap.util.math.AxisTransformation(wrapperContained.axisTransformation); }
// public net.minecraft.util.math.DirectionTransformation[][] COMBINATIONS() { return wrapperContained.COMBINATIONS; }
// public net.minecraft.util.math.DirectionTransformation[] INVERSES() { return wrapperContained.INVERSES; }
public yarnwrap.util.math.DirectionTransformation prepend(yarnwrap.util.math.DirectionTransformation transformation) { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.prepend(transformation.wrapperContained)); }
// public boolean shouldFlipDirection(Object axis) { return wrapperContained.shouldFlipDirection(axis); }
public yarnwrap.util.math.Direction map(yarnwrap.util.math.Direction direction) { return new yarnwrap.util.math.Direction(wrapperContained.map(direction.wrapperContained)); }
public yarnwrap.block.enums.Orientation mapJigsawOrientation(yarnwrap.block.enums.Orientation orientation) { return new yarnwrap.block.enums.Orientation(wrapperContained.mapJigsawOrientation(orientation.wrapperContained)); }
// public it.unimi.dsi.fastutil.booleans.BooleanList getAxisFlips() { return wrapperContained.getAxisFlips(); }
public yarnwrap.util.math.DirectionTransformation inverse() { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.inverse()); }
public org.joml.Matrix3f getMatrix() { return wrapperContained.getMatrix(); }

}