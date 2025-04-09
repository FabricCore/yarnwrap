package yarnwrap.world.gen.stateprovider;
public class WeightedBlockStateProvider { public net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider wrapperContained; public WeightedBlockStateProvider(net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.DataPool states() { return new yarnwrap.util.collection.DataPool(wrapperContained.states); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public com.mojang.serialization.DataResult wrap(yarnwrap.util.collection.DataPool states) { return wrapperContained.wrap(states.wrapperContained); }

}