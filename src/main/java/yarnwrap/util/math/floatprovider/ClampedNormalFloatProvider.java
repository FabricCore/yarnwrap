package yarnwrap.util.math.floatprovider;
public class ClampedNormalFloatProvider { public net.minecraft.util.math.floatprovider.ClampedNormalFloatProvider wrapperContained; public ClampedNormalFloatProvider(net.minecraft.util.math.floatprovider.ClampedNormalFloatProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public float mean() { return wrapperContained.mean; }
// public void mean(float value) { wrapperContained.mean = value; }
// public float deviation() { return wrapperContained.deviation; }
// public void deviation(float value) { wrapperContained.deviation = value; }
// public float min() { return wrapperContained.min; }
// public void min(float value) { wrapperContained.min = value; }
// public float max() { return wrapperContained.max; }
// public void max(float value) { wrapperContained.max = value; }
public yarnwrap.util.math.floatprovider.ClampedNormalFloatProvider create(float mean,float deviation,float min,float max) { return new yarnwrap.util.math.floatprovider.ClampedNormalFloatProvider(wrapperContained.create(mean,deviation,min,max)); }
public float get(yarnwrap.util.math.random.Random random,float mean,float deviation,float min,float max) { return wrapperContained.get(random.wrapperContained,mean,deviation,min,max); }

}