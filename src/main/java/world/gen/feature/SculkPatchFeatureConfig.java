package yarnwrap.world.gen.feature;
public class SculkPatchFeatureConfig { public net.minecraft.world.gen.feature.SculkPatchFeatureConfig wrapperContained; public SculkPatchFeatureConfig(net.minecraft.world.gen.feature.SculkPatchFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}