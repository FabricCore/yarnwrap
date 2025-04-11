package yarnwrap.util.math.intprovider;
public class BiasedToBottomIntProvider { public net.minecraft.util.math.intprovider.BiasedToBottomIntProvider wrapperContained; public BiasedToBottomIntProvider(net.minecraft.util.math.intprovider.BiasedToBottomIntProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public int min() { return wrapperContained.min; }
// public void min(int value) { wrapperContained.min = value; }
// public int max() { return wrapperContained.max; }
// public void max(int value) { wrapperContained.max = value; }
// public BiasedToBottomIntProvider(int min,int max) { this.wrapperContained = new net.minecraft.util.math.intprovider.BiasedToBottomIntProvider(min,max); }
public yarnwrap.util.math.intprovider.BiasedToBottomIntProvider create(int min,int max) { return new yarnwrap.util.math.intprovider.BiasedToBottomIntProvider(wrapperContained.create(min,max)); }
// public com.mojang.serialization.DataResult method_36250(yarnwrap.util.math.intprovider.BiasedToBottomIntProvider provider) { return wrapperContained.method_36250(provider.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_36251(Object instance) { return wrapperContained.method_36251(instance); }
// public java.lang.Integer method_36252(yarnwrap.util.math.intprovider.BiasedToBottomIntProvider provider) { return wrapperContained.method_36252(provider.wrapperContained); }
// public java.lang.Integer method_36253(yarnwrap.util.math.intprovider.BiasedToBottomIntProvider provider) { return wrapperContained.method_36253(provider.wrapperContained); }

}