package yarnwrap.util.math.intprovider;
public class ClampedNormalIntProvider { public net.minecraft.util.math.intprovider.ClampedNormalIntProvider wrapperContained; public ClampedNormalIntProvider(net.minecraft.util.math.intprovider.ClampedNormalIntProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public float mean() { return wrapperContained.mean; }
// public void mean(float value) { wrapperContained.mean = value; }
// public float deviation() { return wrapperContained.deviation; }
// public void deviation(float value) { wrapperContained.deviation = value; }
// public int min() { return wrapperContained.min; }
// public void min(int value) { wrapperContained.min = value; }
// public int max() { return wrapperContained.max; }
// public void max(int value) { wrapperContained.max = value; }
// public ClampedNormalIntProvider(float mean,float deviation,int min,int max) { this.wrapperContained = new net.minecraft.util.math.intprovider.ClampedNormalIntProvider(mean,deviation,min,max); }
public yarnwrap.util.math.intprovider.ClampedNormalIntProvider of(float mean,float deviation,int min,int max) { return new yarnwrap.util.math.intprovider.ClampedNormalIntProvider(wrapperContained.of(mean,deviation,min,max)); }
// public com.mojang.serialization.DataResult method_39157(yarnwrap.util.math.intprovider.ClampedNormalIntProvider provider) { return wrapperContained.method_39157(provider.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_39158(Object instance) { return wrapperContained.method_39158(instance); }
public int next(yarnwrap.util.math.random.Random random,float mean,float deviation,float min,float max) { return wrapperContained.next(random.wrapperContained,mean,deviation,min,max); }
// public java.lang.Integer method_39160(yarnwrap.util.math.intprovider.ClampedNormalIntProvider provider) { return wrapperContained.method_39160(provider.wrapperContained); }
// public java.lang.Integer method_39161(yarnwrap.util.math.intprovider.ClampedNormalIntProvider provider) { return wrapperContained.method_39161(provider.wrapperContained); }
// public java.lang.Float method_39162(yarnwrap.util.math.intprovider.ClampedNormalIntProvider provider) { return wrapperContained.method_39162(provider.wrapperContained); }
// public java.lang.Float method_39163(yarnwrap.util.math.intprovider.ClampedNormalIntProvider provider) { return wrapperContained.method_39163(provider.wrapperContained); }

}