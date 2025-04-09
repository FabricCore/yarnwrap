package yarnwrap.world.gen.feature;
public class FillLayerFeatureConfig { public net.minecraft.world.gen.feature.FillLayerFeatureConfig wrapperContained; public FillLayerFeatureConfig(net.minecraft.world.gen.feature.FillLayerFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public int height() { return wrapperContained.height; }
public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}