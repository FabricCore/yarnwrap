package yarnwrap.world.gen.feature;
public class ReplaceBlobsFeatureConfig { public net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig wrapperContained; public ReplaceBlobsFeatureConfig(net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.block.BlockState target() { return new yarnwrap.block.BlockState(wrapperContained.target); }
public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
// public yarnwrap.util.math.intprovider.IntProvider radius() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.radius); }
public yarnwrap.util.math.intprovider.IntProvider getRadius() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.getRadius()); }

}