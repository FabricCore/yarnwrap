package yarnwrap.world.gen.heightprovider;
public class WeightedListHeightProvider { public net.minecraft.world.gen.heightprovider.WeightedListHeightProvider wrapperContained; public WeightedListHeightProvider(net.minecraft.world.gen.heightprovider.WeightedListHeightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec WEIGHTED_LIST_CODEC() { return wrapperContained.WEIGHTED_LIST_CODEC; }
// public void WEIGHTED_LIST_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.WEIGHTED_LIST_CODEC = value; }
public static com.mojang.serialization.MapCodec WEIGHTED_LIST_CODEC() { return net.minecraft.world.gen.heightprovider.WeightedListHeightProvider.WEIGHTED_LIST_CODEC; }
// public static void WEIGHTED_LIST_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.heightprovider.WeightedListHeightProvider.WEIGHTED_LIST_CODEC = value; }

// public yarnwrap.util.collection.DataPool weightedList() { return new yarnwrap.util.collection.DataPool(wrapperContained.weightedList); }
// public void weightedList(yarnwrap.util.collection.DataPool value) { wrapperContained.weightedList = value.wrapperContained; }
// public static yarnwrap.util.collection.DataPool weightedList() { return new yarnwrap.util.collection.DataPool(net.minecraft.world.gen.heightprovider.WeightedListHeightProvider.weightedList); }
// public static void weightedList(yarnwrap.util.collection.DataPool value, ) { net.minecraft.world.gen.heightprovider.WeightedListHeightProvider.weightedList = value.wrapperContained; }

public WeightedListHeightProvider(yarnwrap.util.collection.DataPool weightedList) { this.wrapperContained = new net.minecraft.world.gen.heightprovider.WeightedListHeightProvider(weightedList.wrapperContained); }

}