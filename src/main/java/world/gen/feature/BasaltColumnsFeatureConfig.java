package yarnwrap.world.gen.feature;
public class BasaltColumnsFeatureConfig { public net.minecraft.world.gen.feature.BasaltColumnsFeatureConfig wrapperContained; public BasaltColumnsFeatureConfig(net.minecraft.world.gen.feature.BasaltColumnsFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.math.intprovider.IntProvider reach() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.reach); }
// public yarnwrap.util.math.intprovider.IntProvider height() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.height); }
public yarnwrap.util.math.intprovider.IntProvider getReach() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.getReach()); }
public yarnwrap.util.math.intprovider.IntProvider getHeight() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.getHeight()); }

}