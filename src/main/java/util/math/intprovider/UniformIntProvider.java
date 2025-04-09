package yarnwrap.util.math.intprovider;
public class UniformIntProvider { public net.minecraft.util.math.intprovider.UniformIntProvider wrapperContained; public UniformIntProvider(net.minecraft.util.math.intprovider.UniformIntProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public int min() { return wrapperContained.min; }
// public int max() { return wrapperContained.max; }
public yarnwrap.util.math.intprovider.UniformIntProvider create(int min,int max) { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.create(min,max)); }

}