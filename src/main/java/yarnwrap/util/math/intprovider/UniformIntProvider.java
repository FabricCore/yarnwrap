package yarnwrap.util.math.intprovider;
public class UniformIntProvider { public net.minecraft.util.math.intprovider.UniformIntProvider wrapperContained; public UniformIntProvider(net.minecraft.util.math.intprovider.UniformIntProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public int min() { return wrapperContained.min; }
// public void min(int value) { wrapperContained.min = value; }
// public int max() { return wrapperContained.max; }
// public void max(int value) { wrapperContained.max = value; }
// public UniformIntProvider(int min,int max) { this.wrapperContained = new net.minecraft.util.math.intprovider.UniformIntProvider(min,max); }
// public com.mojang.serialization.DataResult method_35015(yarnwrap.util.math.intprovider.UniformIntProvider provider) { return wrapperContained.method_35015(provider.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_35016(Object instance) { return wrapperContained.method_35016(instance); }
public yarnwrap.util.math.intprovider.UniformIntProvider create(int min,int max) { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.create(min,max)); }
// public java.lang.Integer method_35018(yarnwrap.util.math.intprovider.UniformIntProvider provider) { return wrapperContained.method_35018(provider.wrapperContained); }
// public java.lang.Integer method_35019(yarnwrap.util.math.intprovider.UniformIntProvider provider) { return wrapperContained.method_35019(provider.wrapperContained); }

}