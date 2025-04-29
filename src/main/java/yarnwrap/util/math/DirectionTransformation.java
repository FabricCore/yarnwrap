package yarnwrap.util.math;
public class DirectionTransformation { public net.minecraft.util.math.DirectionTransformation wrapperContained; public DirectionTransformation(net.minecraft.util.math.DirectionTransformation wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.joml.Matrix3f matrix() { return wrapperContained.matrix; }
// public void matrix(org.joml.Matrix3f value) { wrapperContained.matrix = value; }
// public static org.joml.Matrix3f matrix() { return net.minecraft.util.math.DirectionTransformation.matrix; }
// public static void matrix(org.joml.Matrix3f value, ) { net.minecraft.util.math.DirectionTransformation.matrix = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.util.math.DirectionTransformation.name; }
// public static void name(java.lang.String value, ) { net.minecraft.util.math.DirectionTransformation.name = value; }

// public java.util.Map mappings() { return wrapperContained.mappings; }
// public void mappings(java.util.Map value) { wrapperContained.mappings = value; }
// public static java.util.Map mappings() { return net.minecraft.util.math.DirectionTransformation.mappings; }
// public static void mappings(java.util.Map value, ) { net.minecraft.util.math.DirectionTransformation.mappings = value; }

// public boolean flipX() { return wrapperContained.flipX; }
// public void flipX(boolean value) { wrapperContained.flipX = value; }
// public static boolean flipX() { return net.minecraft.util.math.DirectionTransformation.flipX; }
// public static void flipX(boolean value, ) { net.minecraft.util.math.DirectionTransformation.flipX = value; }

// public boolean flipY() { return wrapperContained.flipY; }
// public void flipY(boolean value) { wrapperContained.flipY = value; }
// public static boolean flipY() { return net.minecraft.util.math.DirectionTransformation.flipY; }
// public static void flipY(boolean value, ) { net.minecraft.util.math.DirectionTransformation.flipY = value; }

// public boolean flipZ() { return wrapperContained.flipZ; }
// public void flipZ(boolean value) { wrapperContained.flipZ = value; }
// public static boolean flipZ() { return net.minecraft.util.math.DirectionTransformation.flipZ; }
// public static void flipZ(boolean value, ) { net.minecraft.util.math.DirectionTransformation.flipZ = value; }

// public yarnwrap.util.math.AxisTransformation axisTransformation() { return new yarnwrap.util.math.AxisTransformation(wrapperContained.axisTransformation); }
// public void axisTransformation(yarnwrap.util.math.AxisTransformation value) { wrapperContained.axisTransformation = value.wrapperContained; }
// public static yarnwrap.util.math.AxisTransformation axisTransformation() { return new yarnwrap.util.math.AxisTransformation(net.minecraft.util.math.DirectionTransformation.axisTransformation); }
// public static void axisTransformation(yarnwrap.util.math.AxisTransformation value, ) { net.minecraft.util.math.DirectionTransformation.axisTransformation = value.wrapperContained; }

// public net.minecraft.util.math.DirectionTransformation[][] COMBINATIONS() { return wrapperContained.COMBINATIONS; }
// public void COMBINATIONS(net.minecraft.util.math.DirectionTransformation[][] value) { wrapperContained.COMBINATIONS = value; }
// public static net.minecraft.util.math.DirectionTransformation[][] COMBINATIONS() { return net.minecraft.util.math.DirectionTransformation.COMBINATIONS; }
// public static void COMBINATIONS(net.minecraft.util.math.DirectionTransformation[][] value, ) { net.minecraft.util.math.DirectionTransformation.COMBINATIONS = value; }

// public net.minecraft.util.math.DirectionTransformation[] INVERSES() { return wrapperContained.INVERSES; }
// public void INVERSES(net.minecraft.util.math.DirectionTransformation[] value) { wrapperContained.INVERSES = value; }
// public static net.minecraft.util.math.DirectionTransformation[] INVERSES() { return net.minecraft.util.math.DirectionTransformation.INVERSES; }
// public static void INVERSES(net.minecraft.util.math.DirectionTransformation[] value, ) { net.minecraft.util.math.DirectionTransformation.INVERSES = value; }

// // public DirectionTransformation(java.lang.String name,int axisTransformation,java.lang.String flipX,yarnwrap.util.math.AxisTransformation flipY,boolean flipZ) { this.wrapperContained = new net.minecraft.util.math.DirectionTransformation(name,axisTransformation,flipX,flipY.wrapperContained,flipZ); }
public yarnwrap.util.math.DirectionTransformation prepend(yarnwrap.util.math.DirectionTransformation transformation) { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.prepend(transformation.wrapperContained)); }
// public static yarnwrap.util.math.DirectionTransformation prepend(yarnwrap.util.math.DirectionTransformation transformation, ) { return new yarnwrap.util.math.DirectionTransformation(net.minecraft.util.math.DirectionTransformation.prepend(transformation.wrapperContained)); }
// public boolean shouldFlipDirection(Object axis) { return wrapperContained.shouldFlipDirection(axis); }
// public static boolean shouldFlipDirection(Object axis, ) { return net.minecraft.util.math.DirectionTransformation.shouldFlipDirection(axis); }
public yarnwrap.util.math.Direction map(yarnwrap.util.math.Direction direction) { return new yarnwrap.util.math.Direction(wrapperContained.map(direction.wrapperContained)); }
// public static yarnwrap.util.math.Direction map(yarnwrap.util.math.Direction direction, ) { return new yarnwrap.util.math.Direction(net.minecraft.util.math.DirectionTransformation.map(direction.wrapperContained)); }
public yarnwrap.block.enums.Orientation mapJigsawOrientation(yarnwrap.block.enums.Orientation orientation) { return new yarnwrap.block.enums.Orientation(wrapperContained.mapJigsawOrientation(orientation.wrapperContained)); }
// public static yarnwrap.block.enums.Orientation mapJigsawOrientation(yarnwrap.block.enums.Orientation orientation, ) { return new yarnwrap.block.enums.Orientation(net.minecraft.util.math.DirectionTransformation.mapJigsawOrientation(orientation.wrapperContained)); }
// public it.unimi.dsi.fastutil.booleans.BooleanList getAxisFlips() { return wrapperContained.getAxisFlips(); }
// public static it.unimi.dsi.fastutil.booleans.BooleanList getAxisFlips() { return net.minecraft.util.math.DirectionTransformation.getAxisFlips(); }
public yarnwrap.util.math.DirectionTransformation inverse() { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.inverse()); }
// public static yarnwrap.util.math.DirectionTransformation inverse() { return new yarnwrap.util.math.DirectionTransformation(net.minecraft.util.math.DirectionTransformation.inverse()); }
public org.joml.Matrix3f getMatrix() { return wrapperContained.getMatrix(); }
// public static org.joml.Matrix3f getMatrix() { return net.minecraft.util.math.DirectionTransformation.getMatrix(); }

}