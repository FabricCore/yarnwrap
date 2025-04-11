package yarnwrap.util.math.intprovider;
public class BiasedToBottomIntProvider { public net.minecraft.util.math.intprovider.BiasedToBottomIntProvider wrapperContained; public BiasedToBottomIntProvider(net.minecraft.util.math.intprovider.BiasedToBottomIntProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public int min() { return wrapperContained.min; }
// public void min(int value) { wrapperContained.min = value; }
// public int max() { return wrapperContained.max; }
// public void max(int value) { wrapperContained.max = value; }
public yarnwrap.util.math.intprovider.BiasedToBottomIntProvider create(int min,int max) { return new yarnwrap.util.math.intprovider.BiasedToBottomIntProvider(wrapperContained.create(min,max)); }

}