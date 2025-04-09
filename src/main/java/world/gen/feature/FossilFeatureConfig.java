package yarnwrap.world.gen.feature;
public class FossilFeatureConfig { public net.minecraft.world.gen.feature.FossilFeatureConfig wrapperContained; public FossilFeatureConfig(net.minecraft.world.gen.feature.FossilFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public java.util.List fossilStructures() { return wrapperContained.fossilStructures; }
public java.util.List overlayStructures() { return wrapperContained.overlayStructures; }
public yarnwrap.registry.entry.RegistryEntry fossilProcessors() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.fossilProcessors); }
public yarnwrap.registry.entry.RegistryEntry overlayProcessors() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.overlayProcessors); }
public int maxEmptyCorners() { return wrapperContained.maxEmptyCorners; }

}