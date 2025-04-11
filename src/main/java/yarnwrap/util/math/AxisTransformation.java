package yarnwrap.util.math;
public class AxisTransformation { public net.minecraft.util.math.AxisTransformation wrapperContained; public AxisTransformation(net.minecraft.util.math.AxisTransformation wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] mappings() { return wrapperContained.mappings; }
// public void mappings(int[] value) { wrapperContained.mappings = value; }
// public org.joml.Matrix3f matrix() { return wrapperContained.matrix; }
// public void matrix(org.joml.Matrix3f value) { wrapperContained.matrix = value; }
// public net.minecraft.util.math.AxisTransformation[][] COMBINATIONS() { return wrapperContained.COMBINATIONS; }
// public void COMBINATIONS(net.minecraft.util.math.AxisTransformation[][] value) { wrapperContained.COMBINATIONS = value; }
// public int NUM_AXES() { return wrapperContained.NUM_AXES; }
// public void NUM_AXES(int value) { wrapperContained.NUM_AXES = value; }
// // public AxisTransformation(java.lang.String xMapping,int yMapping,int zMapping) { this.wrapperContained = new net.minecraft.util.math.AxisTransformation(xMapping,yMapping,zMapping); }
public org.joml.Matrix3f getMatrix() { return wrapperContained.getMatrix(); }
public int map(int oldAxis) { return wrapperContained.map(oldAxis); }
public yarnwrap.util.math.AxisTransformation prepend(yarnwrap.util.math.AxisTransformation transformation) { return new yarnwrap.util.math.AxisTransformation(wrapperContained.prepend(transformation.wrapperContained)); }

}