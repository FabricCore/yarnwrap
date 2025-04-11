package yarnwrap.util.math.floatprovider;
public class UniformFloatProvider { public net.minecraft.util.math.floatprovider.UniformFloatProvider wrapperContained; public UniformFloatProvider(net.minecraft.util.math.floatprovider.UniformFloatProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public float min() { return wrapperContained.min; }
// public void min(float value) { wrapperContained.min = value; }
// public float max() { return wrapperContained.max; }
// public void max(float value) { wrapperContained.max = value; }
public yarnwrap.util.math.floatprovider.UniformFloatProvider create(float min,float max) { return new yarnwrap.util.math.floatprovider.UniformFloatProvider(wrapperContained.create(min,max)); }

}