package yarnwrap.world.gen.feature;
public class SculkPatchFeatureConfig { public net.minecraft.world.gen.feature.SculkPatchFeatureConfig wrapperContained; public SculkPatchFeatureConfig(net.minecraft.world.gen.feature.SculkPatchFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.SculkPatchFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.SculkPatchFeatureConfig.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_41575(Object instance) { return wrapperContained.method_41575(instance); }
// public static com.mojang.datafixers.kinds.App method_41575(Object instance, ) { return net.minecraft.world.gen.feature.SculkPatchFeatureConfig.method_41575(instance); }

}