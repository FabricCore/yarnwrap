package yarnwrap.world.gen.feature;
public class RandomFeatureConfig { public net.minecraft.world.gen.feature.RandomFeatureConfig wrapperContained; public RandomFeatureConfig(net.minecraft.world.gen.feature.RandomFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List features() { return wrapperContained.features; }
// public void features(java.util.List value) { wrapperContained.features = value; }
public yarnwrap.registry.entry.RegistryEntry defaultFeature() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.defaultFeature); }
// public void defaultFeature(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.defaultFeature = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public RandomFeatureConfig(java.util.List features,yarnwrap.registry.entry.RegistryEntry defaultFeature) { this.wrapperContained = new net.minecraft.world.gen.feature.RandomFeatureConfig(features,defaultFeature.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry method_28752(yarnwrap.world.gen.feature.RandomFeatureConfig config) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_28752(config.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_28753(Object instance) { return wrapperContained.method_28753(instance); }
// public java.util.List method_28754(yarnwrap.world.gen.feature.RandomFeatureConfig config) { return wrapperContained.method_28754(config.wrapperContained); }
// public java.util.stream.Stream method_30650(yarnwrap.world.gen.feature.RandomFeatureEntry entry) { return wrapperContained.method_30650(entry.wrapperContained); }

}