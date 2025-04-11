package yarnwrap.world.gen.feature;
public class SingleStateFeatureConfig { public net.minecraft.world.gen.feature.SingleStateFeatureConfig wrapperContained; public SingleStateFeatureConfig(net.minecraft.world.gen.feature.SingleStateFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
// public void state(yarnwrap.block.BlockState value) { wrapperContained.state = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public SingleStateFeatureConfig(yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.world.gen.feature.SingleStateFeatureConfig(state.wrapperContained); }
// public yarnwrap.block.BlockState method_28684(yarnwrap.world.gen.feature.SingleStateFeatureConfig config) { return new yarnwrap.block.BlockState(wrapperContained.method_28684(config.wrapperContained)); }

}