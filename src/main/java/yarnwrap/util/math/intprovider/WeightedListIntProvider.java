package yarnwrap.util.math.intprovider;
public class WeightedListIntProvider { public net.minecraft.util.math.intprovider.WeightedListIntProvider wrapperContained; public WeightedListIntProvider(net.minecraft.util.math.intprovider.WeightedListIntProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.collection.DataPool weightedList() { return new yarnwrap.util.collection.DataPool(wrapperContained.weightedList); }
// public void weightedList(yarnwrap.util.collection.DataPool value) { wrapperContained.weightedList = value.wrapperContained; }
// public int min() { return wrapperContained.min; }
// public void min(int value) { wrapperContained.min = value; }
// public int max() { return wrapperContained.max; }
// public void max(int value) { wrapperContained.max = value; }
public WeightedListIntProvider(yarnwrap.util.collection.DataPool weightedList) { this.wrapperContained = new net.minecraft.util.math.intprovider.WeightedListIntProvider(weightedList.wrapperContained); }
// public yarnwrap.util.collection.DataPool method_38844(yarnwrap.util.math.intprovider.WeightedListIntProvider provider) { return new yarnwrap.util.collection.DataPool(wrapperContained.method_38844(provider.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_38845(Object instance) { return wrapperContained.method_38845(instance); }

}