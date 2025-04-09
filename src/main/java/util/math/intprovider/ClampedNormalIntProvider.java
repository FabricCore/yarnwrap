package yarnwrap.util.math.intprovider;
public class ClampedNormalIntProvider { public net.minecraft.util.math.intprovider.ClampedNormalIntProvider wrapperContained; public ClampedNormalIntProvider(net.minecraft.util.math.intprovider.ClampedNormalIntProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public float mean() { return wrapperContained.mean; }
// public float deviation() { return wrapperContained.deviation; }
// public int min() { return wrapperContained.min; }
// public int max() { return wrapperContained.max; }
public yarnwrap.util.math.intprovider.ClampedNormalIntProvider of(float mean,float deviation,int min,int max) { return new yarnwrap.util.math.intprovider.ClampedNormalIntProvider(wrapperContained.of(mean,deviation,min,max)); }
public int next(yarnwrap.util.math.random.Random random,float mean,float deviation,float min,float max) { return wrapperContained.next(random.wrapperContained,mean,deviation,min,max); }

}