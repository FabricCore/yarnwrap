package yarnwrap.world.gen.feature;
public class SingleStateFeatureConfig { public net.minecraft.world.gen.feature.SingleStateFeatureConfig wrapperContained; public SingleStateFeatureConfig(net.minecraft.world.gen.feature.SingleStateFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}