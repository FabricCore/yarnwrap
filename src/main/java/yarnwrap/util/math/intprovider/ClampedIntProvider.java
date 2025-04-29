package yarnwrap.util.math.intprovider;
public class ClampedIntProvider { public net.minecraft.util.math.intprovider.ClampedIntProvider wrapperContained; public ClampedIntProvider(net.minecraft.util.math.intprovider.ClampedIntProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.util.math.intprovider.ClampedIntProvider.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.util.math.intprovider.ClampedIntProvider.CODEC = value; }

// public yarnwrap.util.math.intprovider.IntProvider source() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.source); }
// public void source(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.source = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider source() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.util.math.intprovider.ClampedIntProvider.source); }
// public static void source(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.util.math.intprovider.ClampedIntProvider.source = value.wrapperContained; }

// public int min() { return wrapperContained.min; }
// public void min(int value) { wrapperContained.min = value; }
// public static int min() { return net.minecraft.util.math.intprovider.ClampedIntProvider.min; }
// public static void min(int value, ) { net.minecraft.util.math.intprovider.ClampedIntProvider.min = value; }

// public int max() { return wrapperContained.max; }
// public void max(int value) { wrapperContained.max = value; }
// public static int max() { return net.minecraft.util.math.intprovider.ClampedIntProvider.max; }
// public static void max(int value, ) { net.minecraft.util.math.intprovider.ClampedIntProvider.max = value; }

public ClampedIntProvider(yarnwrap.util.math.intprovider.IntProvider source,int min,int max) { this.wrapperContained = new net.minecraft.util.math.intprovider.ClampedIntProvider(source.wrapperContained,min,max); }
// public com.mojang.serialization.DataResult method_36254(yarnwrap.util.math.intprovider.ClampedIntProvider provider) { return wrapperContained.method_36254(provider.wrapperContained); }
// public static com.mojang.serialization.DataResult method_36254(yarnwrap.util.math.intprovider.ClampedIntProvider provider, ) { return net.minecraft.util.math.intprovider.ClampedIntProvider.method_36254(provider.wrapperContained); }
// public yarnwrap.util.math.intprovider.ClampedIntProvider create(yarnwrap.util.math.intprovider.IntProvider source,int min,int max) { return new yarnwrap.util.math.intprovider.ClampedIntProvider(wrapperContained.create(source.wrapperContained,min,max)); }
// public static yarnwrap.util.math.intprovider.ClampedIntProvider create(yarnwrap.util.math.intprovider.IntProvider source,int min,int max, ) { return new yarnwrap.util.math.intprovider.ClampedIntProvider(net.minecraft.util.math.intprovider.ClampedIntProvider.create(source.wrapperContained,min,max)); }
// public com.mojang.datafixers.kinds.App method_36256(Object instance) { return wrapperContained.method_36256(instance); }
// public static com.mojang.datafixers.kinds.App method_36256(Object instance, ) { return net.minecraft.util.math.intprovider.ClampedIntProvider.method_36256(instance); }
// public java.lang.Integer method_36257(yarnwrap.util.math.intprovider.ClampedIntProvider provider) { return wrapperContained.method_36257(provider.wrapperContained); }
// public static java.lang.Integer method_36257(yarnwrap.util.math.intprovider.ClampedIntProvider provider, ) { return net.minecraft.util.math.intprovider.ClampedIntProvider.method_36257(provider.wrapperContained); }
// public java.lang.Integer method_36258(yarnwrap.util.math.intprovider.ClampedIntProvider provider) { return wrapperContained.method_36258(provider.wrapperContained); }
// public static java.lang.Integer method_36258(yarnwrap.util.math.intprovider.ClampedIntProvider provider, ) { return net.minecraft.util.math.intprovider.ClampedIntProvider.method_36258(provider.wrapperContained); }
// public yarnwrap.util.math.intprovider.IntProvider method_36259(yarnwrap.util.math.intprovider.ClampedIntProvider provider) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_36259(provider.wrapperContained)); }
// public static yarnwrap.util.math.intprovider.IntProvider method_36259(yarnwrap.util.math.intprovider.ClampedIntProvider provider, ) { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.util.math.intprovider.ClampedIntProvider.method_36259(provider.wrapperContained)); }

}