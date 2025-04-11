package yarnwrap.util.math;
public class MathConstants { public net.minecraft.util.math.MathConstants wrapperContained; public MathConstants(net.minecraft.util.math.MathConstants wrapperContained) { this.wrapperContained = wrapperContained; }

public float PI() { return wrapperContained.PI; }
// public void PI(float value) { wrapperContained.PI = value; }
public float DEGREES_PER_RADIAN() { return wrapperContained.DEGREES_PER_RADIAN; }
// public void DEGREES_PER_RADIAN(float value) { wrapperContained.DEGREES_PER_RADIAN = value; }
public float RADIANS_PER_DEGREE() { return wrapperContained.RADIANS_PER_DEGREE; }
// public void RADIANS_PER_DEGREE(float value) { wrapperContained.RADIANS_PER_DEGREE = value; }
public float EPSILON() { return wrapperContained.EPSILON; }
// public void EPSILON(float value) { wrapperContained.EPSILON = value; }

}