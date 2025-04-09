package yarnwrap.world.gen.feature;
public class DiskFeatureConfig { public net.minecraft.world.gen.feature.DiskFeatureConfig wrapperContained; public DiskFeatureConfig(net.minecraft.world.gen.feature.DiskFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider radius() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.radius); }
// public int halfHeight() { return wrapperContained.halfHeight; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.math.intprovider.IntProvider radius() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.radius()); }
// public int halfHeight() { return wrapperContained.halfHeight(); }

}