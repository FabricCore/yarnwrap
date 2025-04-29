package yarnwrap.world.gen.feature;
public class EmeraldOreFeatureConfig { public net.minecraft.world.gen.feature.EmeraldOreFeatureConfig wrapperContained; public EmeraldOreFeatureConfig(net.minecraft.world.gen.feature.EmeraldOreFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List targets() { return wrapperContained.targets; }
// public void targets(java.util.List value) { wrapperContained.targets = value; }
// public static java.util.List targets() { return net.minecraft.world.gen.feature.EmeraldOreFeatureConfig.targets; }
// public static void targets(java.util.List value, ) { net.minecraft.world.gen.feature.EmeraldOreFeatureConfig.targets = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.EmeraldOreFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.EmeraldOreFeatureConfig.CODEC = value; }

public EmeraldOreFeatureConfig(java.util.List targets) { this.wrapperContained = new net.minecraft.world.gen.feature.EmeraldOreFeatureConfig(targets); }
public EmeraldOreFeatureConfig(yarnwrap.block.BlockState target,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.world.gen.feature.EmeraldOreFeatureConfig(target.wrapperContained,state.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28771(Object instance) { return wrapperContained.method_28771(instance); }
// public static com.mojang.datafixers.kinds.App method_28771(Object instance, ) { return net.minecraft.world.gen.feature.EmeraldOreFeatureConfig.method_28771(instance); }
// public java.util.List method_28772(yarnwrap.world.gen.feature.EmeraldOreFeatureConfig config) { return wrapperContained.method_28772(config.wrapperContained); }
// public static java.util.List method_28772(yarnwrap.world.gen.feature.EmeraldOreFeatureConfig config, ) { return net.minecraft.world.gen.feature.EmeraldOreFeatureConfig.method_28772(config.wrapperContained); }

}