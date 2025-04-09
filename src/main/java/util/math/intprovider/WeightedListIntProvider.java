package yarnwrap.util.math.intprovider;
public class WeightedListIntProvider { public net.minecraft.util.math.intprovider.WeightedListIntProvider wrapperContained; public WeightedListIntProvider(net.minecraft.util.math.intprovider.WeightedListIntProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.collection.DataPool weightedList() { return new yarnwrap.util.collection.DataPool(wrapperContained.weightedList); }
// public int min() { return wrapperContained.min; }
// public int max() { return wrapperContained.max; }

}