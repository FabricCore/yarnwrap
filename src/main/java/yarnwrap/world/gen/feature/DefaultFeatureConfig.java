package yarnwrap.world.gen.feature;
public class DefaultFeatureConfig { public net.minecraft.world.gen.feature.DefaultFeatureConfig wrapperContained; public DefaultFeatureConfig(net.minecraft.world.gen.feature.DefaultFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.DefaultFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.DefaultFeatureConfig.CODEC = value; }

// public yarnwrap.world.gen.feature.DefaultFeatureConfig INSTANCE() { return new yarnwrap.world.gen.feature.DefaultFeatureConfig(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.world.gen.feature.DefaultFeatureConfig value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.world.gen.feature.DefaultFeatureConfig INSTANCE() { return new yarnwrap.world.gen.feature.DefaultFeatureConfig(net.minecraft.world.gen.feature.DefaultFeatureConfig.INSTANCE); }
// public static void INSTANCE(yarnwrap.world.gen.feature.DefaultFeatureConfig value, ) { net.minecraft.world.gen.feature.DefaultFeatureConfig.INSTANCE = value.wrapperContained; }


}