package yarnwrap.world.gen.feature;
public class SimpleRandomFeatureConfig { public net.minecraft.world.gen.feature.SimpleRandomFeatureConfig wrapperContained; public SimpleRandomFeatureConfig(net.minecraft.world.gen.feature.SimpleRandomFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.entry.RegistryEntryList features() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.features); }
// public void features(yarnwrap.registry.entry.RegistryEntryList value) { wrapperContained.features = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }

}