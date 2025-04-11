package yarnwrap.world.gen.feature;
public class FeatureConfig { public net.minecraft.world.gen.feature.FeatureConfig wrapperContained; public FeatureConfig(net.minecraft.world.gen.feature.FeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.gen.feature.DefaultFeatureConfig DEFAULT() { return new yarnwrap.world.gen.feature.DefaultFeatureConfig(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.world.gen.feature.DefaultFeatureConfig value) { wrapperContained.DEFAULT = value.wrapperContained; }
public java.util.stream.Stream getDecoratedFeatures() { return wrapperContained.getDecoratedFeatures(); }

}