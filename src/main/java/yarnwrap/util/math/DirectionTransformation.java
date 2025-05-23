package yarnwrap.util.math;
public class DirectionTransformation { public net.minecraft.util.math.DirectionTransformation wrapperContained; public DirectionTransformation(net.minecraft.util.math.DirectionTransformation wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.joml.Matrix3fc matrix() { return wrapperContained.matrix; }
// public void matrix(org.joml.Matrix3fc value) { wrapperContained.matrix = value; }
// public static org.joml.Matrix3fc matrix() { return net.minecraft.util.math.DirectionTransformation.matrix; }
// public static void matrix(org.joml.Matrix3fc value, ) { net.minecraft.util.math.DirectionTransformation.matrix = value; }

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

// public Object AXES() { return wrapperContained.AXES; }
// // public void AXES(Object value) { wrapperContained.AXES = value; }
// // public static Object AXES() { return net.minecraft.util.math.DirectionTransformation.AXES; }
// // public static void AXES(Object value, ) { net.minecraft.util.math.DirectionTransformation.AXES = value; }

// public net.minecraft.util.math.DirectionTransformation[][] COMBINATIONS() { return wrapperContained.COMBINATIONS; }
// public void COMBINATIONS(net.minecraft.util.math.DirectionTransformation[][] value) { wrapperContained.COMBINATIONS = value; }
// public static net.minecraft.util.math.DirectionTransformation[][] COMBINATIONS() { return net.minecraft.util.math.DirectionTransformation.COMBINATIONS; }
// public static void COMBINATIONS(net.minecraft.util.math.DirectionTransformation[][] value, ) { net.minecraft.util.math.DirectionTransformation.COMBINATIONS = value; }

// public net.minecraft.util.math.DirectionTransformation[] INVERSES() { return wrapperContained.INVERSES; }
// public void INVERSES(net.minecraft.util.math.DirectionTransformation[] value) { wrapperContained.INVERSES = value; }
// public static net.minecraft.util.math.DirectionTransformation[] INVERSES() { return net.minecraft.util.math.DirectionTransformation.INVERSES; }
// public static void INVERSES(net.minecraft.util.math.DirectionTransformation[] value, ) { net.minecraft.util.math.DirectionTransformation.INVERSES = value; }

// public net.minecraft.util.math.DirectionTransformation[][] BY_ROTATIONS() { return wrapperContained.BY_ROTATIONS; }
// public void BY_ROTATIONS(net.minecraft.util.math.DirectionTransformation[][] value) { wrapperContained.BY_ROTATIONS = value; }
// public static net.minecraft.util.math.DirectionTransformation[][] BY_ROTATIONS() { return net.minecraft.util.math.DirectionTransformation.BY_ROTATIONS; }
// public static void BY_ROTATIONS(net.minecraft.util.math.DirectionTransformation[][] value, ) { net.minecraft.util.math.DirectionTransformation.BY_ROTATIONS = value; }

// // public DirectionTransformation(java.lang.String name,int axisTransformation,java.lang.String flipX,yarnwrap.util.math.AxisTransformation flipY,boolean flipZ) { this.wrapperContained = new net.minecraft.util.math.DirectionTransformation(name,axisTransformation,flipX,flipY.wrapperContained,flipZ); }
public yarnwrap.util.math.DirectionTransformation prepend(yarnwrap.util.math.DirectionTransformation transformation) { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.prepend(transformation.wrapperContained)); }
// public static yarnwrap.util.math.DirectionTransformation prepend(yarnwrap.util.math.DirectionTransformation transformation, ) { return new yarnwrap.util.math.DirectionTransformation(net.minecraft.util.math.DirectionTransformation.prepend(transformation.wrapperContained)); }
// public boolean method_26386(yarnwrap.util.math.DirectionTransformation b) { return wrapperContained.method_26386(b.wrapperContained); }
// public static boolean method_26386(yarnwrap.util.math.DirectionTransformation b, ) { return net.minecraft.util.math.DirectionTransformation.method_26386(b.wrapperContained); }
// public boolean shouldFlipDirection(Object axis) { return wrapperContained.shouldFlipDirection(axis); }
// public static boolean shouldFlipDirection(Object axis, ) { return net.minecraft.util.math.DirectionTransformation.shouldFlipDirection(axis); }
public yarnwrap.util.math.Direction map(yarnwrap.util.math.Direction direction) { return new yarnwrap.util.math.Direction(wrapperContained.map(direction.wrapperContained)); }
// public static yarnwrap.util.math.Direction map(yarnwrap.util.math.Direction direction, ) { return new yarnwrap.util.math.Direction(net.minecraft.util.math.DirectionTransformation.map(direction.wrapperContained)); }
public yarnwrap.block.enums.Orientation mapJigsawOrientation(yarnwrap.block.enums.Orientation orientation) { return new yarnwrap.block.enums.Orientation(wrapperContained.mapJigsawOrientation(orientation.wrapperContained)); }
// public static yarnwrap.block.enums.Orientation mapJigsawOrientation(yarnwrap.block.enums.Orientation orientation, ) { return new yarnwrap.block.enums.Orientation(net.minecraft.util.math.DirectionTransformation.mapJigsawOrientation(orientation.wrapperContained)); }
// public void method_26390(net.minecraft.util.math.DirectionTransformation[][] combinations) { wrapperContained.method_26390(combinations); }
// public static void method_26390(net.minecraft.util.math.DirectionTransformation[][] combinations, ) { net.minecraft.util.math.DirectionTransformation.method_26390(combinations); }
// public it.unimi.dsi.fastutil.booleans.BooleanList getAxisFlips() { return wrapperContained.getAxisFlips(); }
// public static it.unimi.dsi.fastutil.booleans.BooleanList getAxisFlips() { return net.minecraft.util.math.DirectionTransformation.getAxisFlips(); }
// public yarnwrap.util.math.DirectionTransformation method_26392(yarnwrap.util.math.DirectionTransformation a) { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.method_26392(a.wrapperContained)); }
// public static yarnwrap.util.math.DirectionTransformation method_26392(yarnwrap.util.math.DirectionTransformation a, ) { return new yarnwrap.util.math.DirectionTransformation(net.minecraft.util.math.DirectionTransformation.method_26392(a.wrapperContained)); }
// public yarnwrap.util.math.DirectionTransformation method_26393(yarnwrap.util.math.DirectionTransformation transformation) { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.method_26393(transformation.wrapperContained)); }
// public static yarnwrap.util.math.DirectionTransformation method_26393(yarnwrap.util.math.DirectionTransformation transformation, ) { return new yarnwrap.util.math.DirectionTransformation(net.minecraft.util.math.DirectionTransformation.method_26393(transformation.wrapperContained)); }
// public com.mojang.datafixers.util.Pair method_26394(yarnwrap.util.math.DirectionTransformation transformation) { return wrapperContained.method_26394(transformation.wrapperContained); }
// public static com.mojang.datafixers.util.Pair method_26394(yarnwrap.util.math.DirectionTransformation transformation, ) { return net.minecraft.util.math.DirectionTransformation.method_26394(transformation.wrapperContained); }
public yarnwrap.util.math.DirectionTransformation inverse() { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.inverse()); }
// public static yarnwrap.util.math.DirectionTransformation inverse() { return new yarnwrap.util.math.DirectionTransformation(net.minecraft.util.math.DirectionTransformation.inverse()); }
public org.joml.Matrix3fc getMatrix() { return wrapperContained.getMatrix(); }
// public static org.joml.Matrix3fc getMatrix() { return net.minecraft.util.math.DirectionTransformation.getMatrix(); }
// public Object map(Object axis) { return wrapperContained.map(axis); }
// public static Object map(Object axis, ) { return net.minecraft.util.math.DirectionTransformation.map(axis); }
// public yarnwrap.util.math.Direction method_66545(yarnwrap.util.math.Direction direction) { return new yarnwrap.util.math.Direction(wrapperContained.method_66545(direction.wrapperContained)); }
// public static yarnwrap.util.math.Direction method_66545(yarnwrap.util.math.Direction direction, ) { return new yarnwrap.util.math.Direction(net.minecraft.util.math.DirectionTransformation.method_66545(direction.wrapperContained)); }
// public yarnwrap.util.math.DirectionTransformation fromRotations(yarnwrap.util.math.AxisRotation x,yarnwrap.util.math.AxisRotation y) { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.fromRotations(x.wrapperContained,y.wrapperContained)); }
// public static yarnwrap.util.math.DirectionTransformation fromRotations(yarnwrap.util.math.AxisRotation x,yarnwrap.util.math.AxisRotation y, ) { return new yarnwrap.util.math.DirectionTransformation(net.minecraft.util.math.DirectionTransformation.fromRotations(x.wrapperContained,y.wrapperContained)); }
// public void method_67987(net.minecraft.util.math.DirectionTransformation[][] byRotations) { wrapperContained.method_67987(byRotations); }
// public static void method_67987(net.minecraft.util.math.DirectionTransformation[][] byRotations, ) { net.minecraft.util.math.DirectionTransformation.method_67987(byRotations); }

}