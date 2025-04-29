package yarnwrap.world.gen.feature;
public class SimpleRandomFeatureConfig { public net.minecraft.world.gen.feature.SimpleRandomFeatureConfig wrapperContained; public SimpleRandomFeatureConfig(net.minecraft.world.gen.feature.SimpleRandomFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.entry.RegistryEntryList features() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.features); }
// public void features(yarnwrap.registry.entry.RegistryEntryList value) { wrapperContained.features = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntryList features() { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.world.gen.feature.SimpleRandomFeatureConfig.features); }
// public static void features(yarnwrap.registry.entry.RegistryEntryList value, ) { net.minecraft.world.gen.feature.SimpleRandomFeatureConfig.features = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.SimpleRandomFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.SimpleRandomFeatureConfig.CODEC = value; }

public SimpleRandomFeatureConfig(yarnwrap.registry.entry.RegistryEntryList features) { this.wrapperContained = new net.minecraft.world.gen.feature.SimpleRandomFeatureConfig(features.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntryList method_28788(yarnwrap.world.gen.feature.SimpleRandomFeatureConfig config) { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.method_28788(config.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntryList method_28788(yarnwrap.world.gen.feature.SimpleRandomFeatureConfig config, ) { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.world.gen.feature.SimpleRandomFeatureConfig.method_28788(config.wrapperContained)); }
// public java.util.stream.Stream method_30651(yarnwrap.registry.entry.RegistryEntry feature) { return wrapperContained.method_30651(feature.wrapperContained); }
// public static java.util.stream.Stream method_30651(yarnwrap.registry.entry.RegistryEntry feature, ) { return net.minecraft.world.gen.feature.SimpleRandomFeatureConfig.method_30651(feature.wrapperContained); }

}