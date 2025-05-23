package yarnwrap.world.gen.stateprovider;
public class WeightedBlockStateProvider { public net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider wrapperContained; public WeightedBlockStateProvider(net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.Pool states() { return new yarnwrap.util.collection.Pool(wrapperContained.states); }
// public void states(yarnwrap.util.collection.Pool value) { wrapperContained.states = value.wrapperContained; }
// public static yarnwrap.util.collection.Pool states() { return new yarnwrap.util.collection.Pool(net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider.states); }
// public static void states(yarnwrap.util.collection.Pool value, ) { net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider.states = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider.CODEC = value; }

public WeightedBlockStateProvider(yarnwrap.util.collection.Pool states) { this.wrapperContained = new net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider(states.wrapperContained); }
// public WeightedBlockStateProvider(Object states) { this.wrapperContained = new net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider(states); }
// public com.mojang.serialization.DataResult wrap(yarnwrap.util.collection.Pool states) { return wrapperContained.wrap(states.wrapperContained); }
// public static com.mojang.serialization.DataResult wrap(yarnwrap.util.collection.Pool states, ) { return net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider.wrap(states.wrapperContained); }

}