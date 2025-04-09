package yarnwrap.world.gen.feature;
public class EmeraldOreFeatureConfig { public net.minecraft.world.gen.feature.EmeraldOreFeatureConfig wrapperContained; public EmeraldOreFeatureConfig(net.minecraft.world.gen.feature.EmeraldOreFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List targets() { return wrapperContained.targets; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}