package yarnwrap.world.gen.feature;
public class BlockPileFeatureConfig { public net.minecraft.world.gen.feature.BlockPileFeatureConfig wrapperContained; public BlockPileFeatureConfig(net.minecraft.world.gen.feature.BlockPileFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.gen.stateprovider.BlockStateProvider stateProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.stateProvider); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}