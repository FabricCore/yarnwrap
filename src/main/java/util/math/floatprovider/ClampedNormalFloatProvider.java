package yarnwrap.util.math.floatprovider;
public class ClampedNormalFloatProvider { public net.minecraft.util.math.floatprovider.ClampedNormalFloatProvider wrapperContained; public ClampedNormalFloatProvider(net.minecraft.util.math.floatprovider.ClampedNormalFloatProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public float mean() { return wrapperContained.mean; }
// public float deviation() { return wrapperContained.deviation; }
// public float min() { return wrapperContained.min; }
// public float max() { return wrapperContained.max; }
public yarnwrap.util.math.floatprovider.ClampedNormalFloatProvider create(float mean,float deviation,float min,float max) { return new yarnwrap.util.math.floatprovider.ClampedNormalFloatProvider(wrapperContained.create(mean,deviation,min,max)); }
public float get(yarnwrap.util.math.random.Random random,float mean,float deviation,float min,float max) { return wrapperContained.get(random.wrapperContained,mean,deviation,min,max); }

}