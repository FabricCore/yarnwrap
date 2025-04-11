package yarnwrap.util.math.floatprovider;
public class UniformFloatProvider { public net.minecraft.util.math.floatprovider.UniformFloatProvider wrapperContained; public UniformFloatProvider(net.minecraft.util.math.floatprovider.UniformFloatProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public float min() { return wrapperContained.min; }
// public void min(float value) { wrapperContained.min = value; }
// public float max() { return wrapperContained.max; }
// public void max(float value) { wrapperContained.max = value; }
// public UniformFloatProvider(float min,float max) { this.wrapperContained = new net.minecraft.util.math.floatprovider.UniformFloatProvider(min,max); }
// public com.mojang.serialization.DataResult method_33932(yarnwrap.util.math.floatprovider.UniformFloatProvider provider) { return wrapperContained.method_33932(provider.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_33933(Object instance) { return wrapperContained.method_33933(instance); }
public yarnwrap.util.math.floatprovider.UniformFloatProvider create(float min,float max) { return new yarnwrap.util.math.floatprovider.UniformFloatProvider(wrapperContained.create(min,max)); }
// public java.lang.Float method_33935(yarnwrap.util.math.floatprovider.UniformFloatProvider provider) { return wrapperContained.method_33935(provider.wrapperContained); }
// public java.lang.Float method_33936(yarnwrap.util.math.floatprovider.UniformFloatProvider provider) { return wrapperContained.method_33936(provider.wrapperContained); }

}