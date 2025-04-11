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
// public ClampedNormalFloatProvider(float mean,float deviation,float min,float max) { this.wrapperContained = new net.minecraft.util.math.floatprovider.ClampedNormalFloatProvider(mean,deviation,min,max); }
public yarnwrap.util.math.floatprovider.ClampedNormalFloatProvider create(float mean,float deviation,float min,float max) { return new yarnwrap.util.math.floatprovider.ClampedNormalFloatProvider(wrapperContained.create(mean,deviation,min,max)); }
// public com.mojang.serialization.DataResult method_33901(yarnwrap.util.math.floatprovider.ClampedNormalFloatProvider provider) { return wrapperContained.method_33901(provider.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_33902(Object instance) { return wrapperContained.method_33902(instance); }
public float get(yarnwrap.util.math.random.Random random,float mean,float deviation,float min,float max) { return wrapperContained.get(random.wrapperContained,mean,deviation,min,max); }
// public java.lang.Float method_33904(yarnwrap.util.math.floatprovider.ClampedNormalFloatProvider provider) { return wrapperContained.method_33904(provider.wrapperContained); }
// public java.lang.Float method_33905(yarnwrap.util.math.floatprovider.ClampedNormalFloatProvider provider) { return wrapperContained.method_33905(provider.wrapperContained); }
// public java.lang.Float method_33906(yarnwrap.util.math.floatprovider.ClampedNormalFloatProvider provider) { return wrapperContained.method_33906(provider.wrapperContained); }
// public java.lang.Float method_33907(yarnwrap.util.math.floatprovider.ClampedNormalFloatProvider provider) { return wrapperContained.method_33907(provider.wrapperContained); }

}