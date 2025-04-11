package yarnwrap.world.gen.feature;
public class RandomPatchFeatureConfig { public net.minecraft.world.gen.feature.RandomPatchFeatureConfig wrapperContained; public RandomPatchFeatureConfig(net.minecraft.world.gen.feature.RandomPatchFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }

}