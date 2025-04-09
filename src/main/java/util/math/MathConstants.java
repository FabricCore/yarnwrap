package yarnwrap.util.math;
public class MathConstants { public net.minecraft.util.math.MathConstants wrapperContained; public MathConstants(net.minecraft.util.math.MathConstants wrapperContained) { this.wrapperContained = wrapperContained; }

public float PI() { return wrapperContained.PI; }
public float DEGREES_PER_RADIAN() { return wrapperContained.DEGREES_PER_RADIAN; }
public float RADIANS_PER_DEGREE() { return wrapperContained.RADIANS_PER_DEGREE; }
public float EPSILON() { return wrapperContained.EPSILON; }

}