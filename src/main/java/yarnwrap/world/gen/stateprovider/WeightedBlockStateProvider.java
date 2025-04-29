package yarnwrap.world.gen.stateprovider;
public class WeightedBlockStateProvider { public net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider wrapperContained; public WeightedBlockStateProvider(net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.DataPool states() { return new yarnwrap.util.collection.DataPool(wrapperContained.states); }
// public void states(yarnwrap.util.collection.DataPool value) { wrapperContained.states = value.wrapperContained; }
// public static yarnwrap.util.collection.DataPool states() { return new yarnwrap.util.collection.DataPool(net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider.states); }
// public static void states(yarnwrap.util.collection.DataPool value, ) { net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider.states = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider.CODEC = value; }

// public WeightedBlockStateProvider(Object states) { this.wrapperContained = new net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider(states); }
public WeightedBlockStateProvider(yarnwrap.util.collection.DataPool states) { this.wrapperContained = new net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider(states.wrapperContained); }
// public com.mojang.serialization.DataResult wrap(yarnwrap.util.collection.DataPool states) { return wrapperContained.wrap(states.wrapperContained); }
// public static com.mojang.serialization.DataResult wrap(yarnwrap.util.collection.DataPool states, ) { return net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider.wrap(states.wrapperContained); }

}