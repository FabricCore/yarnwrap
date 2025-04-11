package yarnwrap.world.gen.feature;
public class BlockColumnFeatureConfig { public net.minecraft.world.gen.feature.BlockColumnFeatureConfig wrapperContained; public BlockColumnFeatureConfig(net.minecraft.world.gen.feature.BlockColumnFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public Object createLayer(yarnwrap.util.math.intprovider.IntProvider height,yarnwrap.world.gen.stateprovider.BlockStateProvider state) { return wrapperContained.createLayer(height.wrapperContained,state.wrapperContained); }
public yarnwrap.world.gen.feature.BlockColumnFeatureConfig create(yarnwrap.util.math.intprovider.IntProvider height,yarnwrap.world.gen.stateprovider.BlockStateProvider state) { return new yarnwrap.world.gen.feature.BlockColumnFeatureConfig(wrapperContained.create(height.wrapperContained,state.wrapperContained)); }

}