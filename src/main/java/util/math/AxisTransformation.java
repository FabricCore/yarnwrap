package yarnwrap.util.math;
public class AxisTransformation { public net.minecraft.util.math.AxisTransformation wrapperContained; public AxisTransformation(net.minecraft.util.math.AxisTransformation wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] mappings() { return wrapperContained.mappings; }
// public org.joml.Matrix3f matrix() { return wrapperContained.matrix; }
// public net.minecraft.util.math.AxisTransformation[][] COMBINATIONS() { return wrapperContained.COMBINATIONS; }
// public int NUM_AXES() { return wrapperContained.NUM_AXES; }
public org.joml.Matrix3f getMatrix() { return wrapperContained.getMatrix(); }
public int map(int oldAxis) { return wrapperContained.map(oldAxis); }
public yarnwrap.util.math.AxisTransformation prepend(yarnwrap.util.math.AxisTransformation transformation) { return new yarnwrap.util.math.AxisTransformation(wrapperContained.prepend(transformation.wrapperContained)); }

}