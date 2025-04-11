package yarnwrap.world.gen.feature;
public class ReplaceBlobsFeatureConfig { public net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig wrapperContained; public ReplaceBlobsFeatureConfig(net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.block.BlockState target() { return new yarnwrap.block.BlockState(wrapperContained.target); }
// public void target(yarnwrap.block.BlockState value) { wrapperContained.target = value.wrapperContained; }
public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
// public void state(yarnwrap.block.BlockState value) { wrapperContained.state = value.wrapperContained; }
// public yarnwrap.util.math.intprovider.IntProvider radius() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.radius); }
// public void radius(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.radius = value.wrapperContained; }
public yarnwrap.util.math.intprovider.IntProvider getRadius() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.getRadius()); }

}