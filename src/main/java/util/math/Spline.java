package yarnwrap.util.math;
public class Spline { public net.minecraft.util.math.Spline wrapperContained; public Spline(net.minecraft.util.math.Spline wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object builder(yarnwrap.util.function.ToFloatFunction locationFunction) { return wrapperContained.builder(locationFunction.wrapperContained); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec locationFunctionCodec) { return wrapperContained.createCodec(locationFunctionCodec); }
// public yarnwrap.util.math.Spline fixedFloatFunction(float value) { return new yarnwrap.util.math.Spline(wrapperContained.fixedFloatFunction(value)); }
// public Object builder(yarnwrap.util.function.ToFloatFunction locationFunction,yarnwrap.util.function.ToFloatFunction amplifier) { return wrapperContained.builder(locationFunction.wrapperContained,amplifier.wrapperContained); }
// public yarnwrap.util.math.Spline apply(Object visitor) { return new yarnwrap.util.math.Spline(wrapperContained.apply(visitor)); }

}