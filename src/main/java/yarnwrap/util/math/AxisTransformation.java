package yarnwrap.util.math;
public class AxisTransformation { public net.minecraft.util.math.AxisTransformation wrapperContained; public AxisTransformation(net.minecraft.util.math.AxisTransformation wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] mappings() { return wrapperContained.mappings; }
// public void mappings(int[] value) { wrapperContained.mappings = value; }
// public static int[] mappings() { return net.minecraft.util.math.AxisTransformation.mappings; }
// public static void mappings(int[] value, ) { net.minecraft.util.math.AxisTransformation.mappings = value; }

// public org.joml.Matrix3fc matrix() { return wrapperContained.matrix; }
// public void matrix(org.joml.Matrix3fc value) { wrapperContained.matrix = value; }
// public static org.joml.Matrix3fc matrix() { return net.minecraft.util.math.AxisTransformation.matrix; }
// public static void matrix(org.joml.Matrix3fc value, ) { net.minecraft.util.math.AxisTransformation.matrix = value; }

// public int NUM_AXES() { return wrapperContained.NUM_AXES; }
// public void NUM_AXES(int value) { wrapperContained.NUM_AXES = value; }
// public static int NUM_AXES() { return net.minecraft.util.math.AxisTransformation.NUM_AXES; }
// public static void NUM_AXES(int value, ) { net.minecraft.util.math.AxisTransformation.NUM_AXES = value; }

// public net.minecraft.util.math.AxisTransformation[][] COMBINATIONS() { return wrapperContained.COMBINATIONS; }
// public void COMBINATIONS(net.minecraft.util.math.AxisTransformation[][] value) { wrapperContained.COMBINATIONS = value; }
// public static net.minecraft.util.math.AxisTransformation[][] COMBINATIONS() { return net.minecraft.util.math.AxisTransformation.COMBINATIONS; }
// public static void COMBINATIONS(net.minecraft.util.math.AxisTransformation[][] value, ) { net.minecraft.util.math.AxisTransformation.COMBINATIONS = value; }

// // public AxisTransformation(java.lang.String xMapping,int yMapping,int zMapping) { this.wrapperContained = new net.minecraft.util.math.AxisTransformation(xMapping,yMapping,zMapping); }
public org.joml.Matrix3fc getMatrix() { return wrapperContained.getMatrix(); }
// public static org.joml.Matrix3fc getMatrix() { return net.minecraft.util.math.AxisTransformation.getMatrix(); }
public int map(int oldAxis) { return wrapperContained.map(oldAxis); }
// public static int map(int oldAxis, ) { return net.minecraft.util.math.AxisTransformation.map(oldAxis); }
public yarnwrap.util.math.AxisTransformation prepend(yarnwrap.util.math.AxisTransformation transformation) { return new yarnwrap.util.math.AxisTransformation(wrapperContained.prepend(transformation.wrapperContained)); }
// public static yarnwrap.util.math.AxisTransformation prepend(yarnwrap.util.math.AxisTransformation transformation, ) { return new yarnwrap.util.math.AxisTransformation(net.minecraft.util.math.AxisTransformation.prepend(transformation.wrapperContained)); }
// public boolean method_26419(int transformation) { return wrapperContained.method_26419(transformation); }
// public static boolean method_26419(int transformation, ) { return net.minecraft.util.math.AxisTransformation.method_26419(transformation); }
// public void method_26420(net.minecraft.util.math.AxisTransformation[][] combinations) { wrapperContained.method_26420(combinations); }
// public static void method_26420(net.minecraft.util.math.AxisTransformation[][] combinations, ) { net.minecraft.util.math.AxisTransformation.method_26420(combinations); }

}