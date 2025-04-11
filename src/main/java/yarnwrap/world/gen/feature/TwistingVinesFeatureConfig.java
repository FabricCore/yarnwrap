package yarnwrap.world.gen.feature;
public class TwistingVinesFeatureConfig { public net.minecraft.world.gen.feature.TwistingVinesFeatureConfig wrapperContained; public TwistingVinesFeatureConfig(net.minecraft.world.gen.feature.TwistingVinesFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }

}