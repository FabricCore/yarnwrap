package yarnwrap.util.function;
public class ToFloatFunction { public net.minecraft.util.function.ToFloatFunction wrapperContained; public ToFloatFunction(net.minecraft.util.function.ToFloatFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.function.ToFloatFunction IDENTITY() { return new yarnwrap.util.function.ToFloatFunction(wrapperContained.IDENTITY); }
public float min() { return wrapperContained.min(); }
public float max() { return wrapperContained.max(); }
public float apply(java.lang.Object x) { return wrapperContained.apply(x); }
// public yarnwrap.util.function.ToFloatFunction fromFloat(it.unimi.dsi.fastutil.floats.Float2FloatFunction delegate) { return new yarnwrap.util.function.ToFloatFunction(wrapperContained.fromFloat(delegate)); }
public yarnwrap.util.function.ToFloatFunction compose(java.util.function.Function before) { return new yarnwrap.util.function.ToFloatFunction(wrapperContained.compose(before)); }

}