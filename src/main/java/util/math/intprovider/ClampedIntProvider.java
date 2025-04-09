package yarnwrap.util.math.intprovider;
public class ClampedIntProvider { public net.minecraft.util.math.intprovider.ClampedIntProvider wrapperContained; public ClampedIntProvider(net.minecraft.util.math.intprovider.ClampedIntProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.math.intprovider.IntProvider source() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.source); }
// public int min() { return wrapperContained.min; }
// public int max() { return wrapperContained.max; }
public yarnwrap.util.math.intprovider.ClampedIntProvider create(yarnwrap.util.math.intprovider.IntProvider source,int min,int max) { return new yarnwrap.util.math.intprovider.ClampedIntProvider(wrapperContained.create(source.wrapperContained,min,max)); }

}