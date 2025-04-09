package yarnwrap.world.gen.feature;
public class RandomFeatureConfig { public net.minecraft.world.gen.feature.RandomFeatureConfig wrapperContained; public RandomFeatureConfig(net.minecraft.world.gen.feature.RandomFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List features() { return wrapperContained.features; }
public yarnwrap.registry.entry.RegistryEntry defaultFeature() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.defaultFeature); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}