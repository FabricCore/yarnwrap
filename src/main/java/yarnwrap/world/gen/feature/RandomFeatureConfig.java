package yarnwrap.world.gen.feature;
public class RandomFeatureConfig { public net.minecraft.world.gen.feature.RandomFeatureConfig wrapperContained; public RandomFeatureConfig(net.minecraft.world.gen.feature.RandomFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List features() { return wrapperContained.features; }
// public void features(java.util.List value) { wrapperContained.features = value; }
public yarnwrap.registry.entry.RegistryEntry defaultFeature() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.defaultFeature); }
// public void defaultFeature(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.defaultFeature = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }

}