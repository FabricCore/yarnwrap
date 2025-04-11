package yarnwrap.world.gen.feature;
public class RandomBooleanFeatureConfig { public net.minecraft.world.gen.feature.RandomBooleanFeatureConfig wrapperContained; public RandomBooleanFeatureConfig(net.minecraft.world.gen.feature.RandomBooleanFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.entry.RegistryEntry featureFalse() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.featureFalse); }
// public void featureFalse(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.featureFalse = value.wrapperContained; }
public yarnwrap.registry.entry.RegistryEntry featureTrue() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.featureTrue); }
// public void featureTrue(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.featureTrue = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }

}