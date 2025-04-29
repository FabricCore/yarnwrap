package yarnwrap.world.gen.feature;
public class TwistingVinesFeatureConfig { public net.minecraft.world.gen.feature.TwistingVinesFeatureConfig wrapperContained; public TwistingVinesFeatureConfig(net.minecraft.world.gen.feature.TwistingVinesFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.TwistingVinesFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.TwistingVinesFeatureConfig.CODEC = value; }


}