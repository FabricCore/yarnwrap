package yarnwrap.world.gen.feature;
public class FossilFeatureConfig { public net.minecraft.world.gen.feature.FossilFeatureConfig wrapperContained; public FossilFeatureConfig(net.minecraft.world.gen.feature.FossilFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public java.util.List fossilStructures() { return wrapperContained.fossilStructures; }
// public void fossilStructures(java.util.List value) { wrapperContained.fossilStructures = value; }
public java.util.List overlayStructures() { return wrapperContained.overlayStructures; }
// public void overlayStructures(java.util.List value) { wrapperContained.overlayStructures = value; }
public yarnwrap.registry.entry.RegistryEntry fossilProcessors() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.fossilProcessors); }
// public void fossilProcessors(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.fossilProcessors = value.wrapperContained; }
public yarnwrap.registry.entry.RegistryEntry overlayProcessors() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.overlayProcessors); }
// public void overlayProcessors(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.overlayProcessors = value.wrapperContained; }
public int maxEmptyCorners() { return wrapperContained.maxEmptyCorners; }
// public void maxEmptyCorners(int value) { wrapperContained.maxEmptyCorners = value; }

}