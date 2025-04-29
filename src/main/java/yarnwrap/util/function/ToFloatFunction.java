package yarnwrap.util.function;
public class ToFloatFunction { public net.minecraft.util.function.ToFloatFunction wrapperContained; public ToFloatFunction(net.minecraft.util.function.ToFloatFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.function.ToFloatFunction IDENTITY() { return new yarnwrap.util.function.ToFloatFunction(wrapperContained.IDENTITY); }
// public void IDENTITY(yarnwrap.util.function.ToFloatFunction value) { wrapperContained.IDENTITY = value.wrapperContained; }
public static yarnwrap.util.function.ToFloatFunction IDENTITY() { return new yarnwrap.util.function.ToFloatFunction(net.minecraft.util.function.ToFloatFunction.IDENTITY); }
// public static void IDENTITY(yarnwrap.util.function.ToFloatFunction value, ) { net.minecraft.util.function.ToFloatFunction.IDENTITY = value.wrapperContained; }

public float min() { return wrapperContained.min(); }
// public static float min() { return net.minecraft.util.function.ToFloatFunction.min(); }
public float max() { return wrapperContained.max(); }
// public static float max() { return net.minecraft.util.function.ToFloatFunction.max(); }
public float apply(java.lang.Object x) { return wrapperContained.apply(x); }
// public static float apply(java.lang.Object x, ) { return net.minecraft.util.function.ToFloatFunction.apply(x); }
// public float method_41307(float value) { return wrapperContained.method_41307(value); }
// public static float method_41307(float value, ) { return net.minecraft.util.function.ToFloatFunction.method_41307(value); }
// public yarnwrap.util.function.ToFloatFunction fromFloat(it.unimi.dsi.fastutil.floats.Float2FloatFunction delegate) { return new yarnwrap.util.function.ToFloatFunction(wrapperContained.fromFloat(delegate)); }
// public static yarnwrap.util.function.ToFloatFunction fromFloat(it.unimi.dsi.fastutil.floats.Float2FloatFunction delegate, ) { return new yarnwrap.util.function.ToFloatFunction(net.minecraft.util.function.ToFloatFunction.fromFloat(delegate)); }
public yarnwrap.util.function.ToFloatFunction compose(java.util.function.Function before) { return new yarnwrap.util.function.ToFloatFunction(wrapperContained.compose(before)); }
// public static yarnwrap.util.function.ToFloatFunction compose(java.util.function.Function before, ) { return new yarnwrap.util.function.ToFloatFunction(net.minecraft.util.function.ToFloatFunction.compose(before)); }

}