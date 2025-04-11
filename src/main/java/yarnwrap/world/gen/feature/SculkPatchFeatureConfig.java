package yarnwrap.world.gen.feature;
public class SculkPatchFeatureConfig { public net.minecraft.world.gen.feature.SculkPatchFeatureConfig wrapperContained; public SculkPatchFeatureConfig(net.minecraft.world.gen.feature.SculkPatchFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }

}