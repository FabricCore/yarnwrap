package yarnwrap.world.gen.feature;
public class RandomBooleanFeatureConfig { public net.minecraft.world.gen.feature.RandomBooleanFeatureConfig wrapperContained; public RandomBooleanFeatureConfig(net.minecraft.world.gen.feature.RandomBooleanFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.entry.RegistryEntry featureFalse() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.featureFalse); }
// public void featureFalse(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.featureFalse = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry featureFalse() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.feature.RandomBooleanFeatureConfig.featureFalse); }
// public static void featureFalse(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.world.gen.feature.RandomBooleanFeatureConfig.featureFalse = value.wrapperContained; }

public yarnwrap.registry.entry.RegistryEntry featureTrue() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.featureTrue); }
// public void featureTrue(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.featureTrue = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry featureTrue() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.feature.RandomBooleanFeatureConfig.featureTrue); }
// public static void featureTrue(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.world.gen.feature.RandomBooleanFeatureConfig.featureTrue = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.RandomBooleanFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.RandomBooleanFeatureConfig.CODEC = value; }

public RandomBooleanFeatureConfig(yarnwrap.registry.entry.RegistryEntry featureTrue,yarnwrap.registry.entry.RegistryEntry featureFalse) { this.wrapperContained = new net.minecraft.world.gen.feature.RandomBooleanFeatureConfig(featureTrue.wrapperContained,featureFalse.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry method_28749(yarnwrap.world.gen.feature.RandomBooleanFeatureConfig config) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_28749(config.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry method_28749(yarnwrap.world.gen.feature.RandomBooleanFeatureConfig config, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.feature.RandomBooleanFeatureConfig.method_28749(config.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_28750(Object instance) { return wrapperContained.method_28750(instance); }
// public static com.mojang.datafixers.kinds.App method_28750(Object instance, ) { return net.minecraft.world.gen.feature.RandomBooleanFeatureConfig.method_28750(instance); }
// public yarnwrap.registry.entry.RegistryEntry method_28751(yarnwrap.world.gen.feature.RandomBooleanFeatureConfig config) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_28751(config.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry method_28751(yarnwrap.world.gen.feature.RandomBooleanFeatureConfig config, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.feature.RandomBooleanFeatureConfig.method_28751(config.wrapperContained)); }

}