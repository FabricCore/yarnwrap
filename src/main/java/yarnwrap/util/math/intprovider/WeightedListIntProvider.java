package yarnwrap.util.math.intprovider;
public class WeightedListIntProvider { public net.minecraft.util.math.intprovider.WeightedListIntProvider wrapperContained; public WeightedListIntProvider(net.minecraft.util.math.intprovider.WeightedListIntProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.util.math.intprovider.WeightedListIntProvider.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.util.math.intprovider.WeightedListIntProvider.CODEC = value; }

// public yarnwrap.util.collection.Pool weightedList() { return new yarnwrap.util.collection.Pool(wrapperContained.weightedList); }
// public void weightedList(yarnwrap.util.collection.Pool value) { wrapperContained.weightedList = value.wrapperContained; }
// public static yarnwrap.util.collection.Pool weightedList() { return new yarnwrap.util.collection.Pool(net.minecraft.util.math.intprovider.WeightedListIntProvider.weightedList); }
// public static void weightedList(yarnwrap.util.collection.Pool value, ) { net.minecraft.util.math.intprovider.WeightedListIntProvider.weightedList = value.wrapperContained; }

// public int min() { return wrapperContained.min; }
// public void min(int value) { wrapperContained.min = value; }
// public static int min() { return net.minecraft.util.math.intprovider.WeightedListIntProvider.min; }
// public static void min(int value, ) { net.minecraft.util.math.intprovider.WeightedListIntProvider.min = value; }

// public int max() { return wrapperContained.max; }
// public void max(int value) { wrapperContained.max = value; }
// public static int max() { return net.minecraft.util.math.intprovider.WeightedListIntProvider.max; }
// public static void max(int value, ) { net.minecraft.util.math.intprovider.WeightedListIntProvider.max = value; }

public WeightedListIntProvider(yarnwrap.util.collection.Pool weightedList) { this.wrapperContained = new net.minecraft.util.math.intprovider.WeightedListIntProvider(weightedList.wrapperContained); }
// public yarnwrap.util.collection.Pool method_38844(yarnwrap.util.math.intprovider.WeightedListIntProvider provider) { return new yarnwrap.util.collection.Pool(wrapperContained.method_38844(provider.wrapperContained)); }
// public static yarnwrap.util.collection.Pool method_38844(yarnwrap.util.math.intprovider.WeightedListIntProvider provider, ) { return new yarnwrap.util.collection.Pool(net.minecraft.util.math.intprovider.WeightedListIntProvider.method_38844(provider.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_38845(Object instance) { return wrapperContained.method_38845(instance); }
// public static com.mojang.datafixers.kinds.App method_38845(Object instance, ) { return net.minecraft.util.math.intprovider.WeightedListIntProvider.method_38845(instance); }

}