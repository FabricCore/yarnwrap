package yarnwrap.world.gen.feature;
public class BlockPileFeatureConfig { public net.minecraft.world.gen.feature.BlockPileFeatureConfig wrapperContained; public BlockPileFeatureConfig(net.minecraft.world.gen.feature.BlockPileFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.gen.stateprovider.BlockStateProvider stateProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.stateProvider); }
// public void stateProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.stateProvider = value.wrapperContained; }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider stateProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.feature.BlockPileFeatureConfig.stateProvider); }
// public static void stateProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value, ) { net.minecraft.world.gen.feature.BlockPileFeatureConfig.stateProvider = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.BlockPileFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.BlockPileFeatureConfig.CODEC = value; }

public BlockPileFeatureConfig(yarnwrap.world.gen.stateprovider.BlockStateProvider stateProvider) { this.wrapperContained = new net.minecraft.world.gen.feature.BlockPileFeatureConfig(stateProvider.wrapperContained); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_28683(yarnwrap.world.gen.feature.BlockPileFeatureConfig config) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_28683(config.wrapperContained)); }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider method_28683(yarnwrap.world.gen.feature.BlockPileFeatureConfig config, ) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.feature.BlockPileFeatureConfig.method_28683(config.wrapperContained)); }

}