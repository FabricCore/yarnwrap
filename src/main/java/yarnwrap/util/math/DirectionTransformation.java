package yarnwrap.util.math;
public class DirectionTransformation { public net.minecraft.util.math.DirectionTransformation wrapperContained; public DirectionTransformation(net.minecraft.util.math.DirectionTransformation wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.joml.Matrix3f matrix() { return wrapperContained.matrix; }
// public void matrix(org.joml.Matrix3f value) { wrapperContained.matrix = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public java.util.Map mappings() { return wrapperContained.mappings; }
// public void mappings(java.util.Map value) { wrapperContained.mappings = value; }
// public boolean flipX() { return wrapperContained.flipX; }
// public void flipX(boolean value) { wrapperContained.flipX = value; }
// public boolean flipY() { return wrapperContained.flipY; }
// public void flipY(boolean value) { wrapperContained.flipY = value; }
// public boolean flipZ() { return wrapperContained.flipZ; }
// public void flipZ(boolean value) { wrapperContained.flipZ = value; }
// public yarnwrap.util.math.AxisTransformation axisTransformation() { return new yarnwrap.util.math.AxisTransformation(wrapperContained.axisTransformation); }
// public void axisTransformation(yarnwrap.util.math.AxisTransformation value) { wrapperContained.axisTransformation = value.wrapperContained; }
// public net.minecraft.util.math.DirectionTransformation[][] COMBINATIONS() { return wrapperContained.COMBINATIONS; }
// public void COMBINATIONS(net.minecraft.util.math.DirectionTransformation[][] value) { wrapperContained.COMBINATIONS = value; }
// public net.minecraft.util.math.DirectionTransformation[] INVERSES() { return wrapperContained.INVERSES; }
// public void INVERSES(net.minecraft.util.math.DirectionTransformation[] value) { wrapperContained.INVERSES = value; }
// // public DirectionTransformation(java.lang.String name,int axisTransformation,java.lang.String flipX,yarnwrap.util.math.AxisTransformation flipY,boolean flipZ) { this.wrapperContained = new net.minecraft.util.math.DirectionTransformation(name,axisTransformation,flipX,flipY.wrapperContained,flipZ); }
public yarnwrap.util.math.DirectionTransformation prepend(yarnwrap.util.math.DirectionTransformation transformation) { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.prepend(transformation.wrapperContained)); }
// public boolean shouldFlipDirection(Object axis) { return wrapperContained.shouldFlipDirection(axis); }
public yarnwrap.util.math.Direction map(yarnwrap.util.math.Direction direction) { return new yarnwrap.util.math.Direction(wrapperContained.map(direction.wrapperContained)); }
public yarnwrap.block.enums.Orientation mapJigsawOrientation(yarnwrap.block.enums.Orientation orientation) { return new yarnwrap.block.enums.Orientation(wrapperContained.mapJigsawOrientation(orientation.wrapperContained)); }
// public it.unimi.dsi.fastutil.booleans.BooleanList getAxisFlips() { return wrapperContained.getAxisFlips(); }
public yarnwrap.util.math.DirectionTransformation inverse() { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.inverse()); }
public org.joml.Matrix3f getMatrix() { return wrapperContained.getMatrix(); }

}