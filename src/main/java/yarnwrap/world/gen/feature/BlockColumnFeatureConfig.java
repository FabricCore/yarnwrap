package yarnwrap.world.gen.feature;
public class BlockColumnFeatureConfig { public net.minecraft.world.gen.feature.BlockColumnFeatureConfig wrapperContained; public BlockColumnFeatureConfig(net.minecraft.world.gen.feature.BlockColumnFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.BlockColumnFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.BlockColumnFeatureConfig.CODEC = value; }

// public Object createLayer(yarnwrap.util.math.intprovider.IntProvider height,yarnwrap.world.gen.stateprovider.BlockStateProvider state) { return wrapperContained.createLayer(height.wrapperContained,state.wrapperContained); }
// public static Object createLayer(yarnwrap.util.math.intprovider.IntProvider height,yarnwrap.world.gen.stateprovider.BlockStateProvider state, ) { return net.minecraft.world.gen.feature.BlockColumnFeatureConfig.createLayer(height.wrapperContained,state.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_38909(Object instance) { return wrapperContained.method_38909(instance); }
// public static com.mojang.datafixers.kinds.App method_38909(Object instance, ) { return net.minecraft.world.gen.feature.BlockColumnFeatureConfig.method_38909(instance); }
// public yarnwrap.world.gen.feature.BlockColumnFeatureConfig create(yarnwrap.util.math.intprovider.IntProvider height,yarnwrap.world.gen.stateprovider.BlockStateProvider state) { return new yarnwrap.world.gen.feature.BlockColumnFeatureConfig(wrapperContained.create(height.wrapperContained,state.wrapperContained)); }
// public static yarnwrap.world.gen.feature.BlockColumnFeatureConfig create(yarnwrap.util.math.intprovider.IntProvider height,yarnwrap.world.gen.stateprovider.BlockStateProvider state, ) { return new yarnwrap.world.gen.feature.BlockColumnFeatureConfig(net.minecraft.world.gen.feature.BlockColumnFeatureConfig.create(height.wrapperContained,state.wrapperContained)); }

}