package yarnwrap.resource;
public class DataConfiguration { public net.minecraft.resource.DataConfiguration wrapperContained; public DataConfiguration(net.minecraft.resource.DataConfiguration wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String ENABLED_FEATURES_KEY() { return wrapperContained.ENABLED_FEATURES_KEY; }
// public void ENABLED_FEATURES_KEY(java.lang.String value) { wrapperContained.ENABLED_FEATURES_KEY = value; }
public static java.lang.String ENABLED_FEATURES_KEY() { return net.minecraft.resource.DataConfiguration.ENABLED_FEATURES_KEY; }
// public static void ENABLED_FEATURES_KEY(java.lang.String value, ) { net.minecraft.resource.DataConfiguration.ENABLED_FEATURES_KEY = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.resource.DataConfiguration.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.resource.DataConfiguration.CODEC = value; }

// public yarnwrap.resource.DataConfiguration SAFE_MODE() { return new yarnwrap.resource.DataConfiguration(wrapperContained.SAFE_MODE); }
// public void SAFE_MODE(yarnwrap.resource.DataConfiguration value) { wrapperContained.SAFE_MODE = value.wrapperContained; }
public static yarnwrap.resource.DataConfiguration SAFE_MODE() { return new yarnwrap.resource.DataConfiguration(net.minecraft.resource.DataConfiguration.SAFE_MODE); }
// public static void SAFE_MODE(yarnwrap.resource.DataConfiguration value, ) { net.minecraft.resource.DataConfiguration.SAFE_MODE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec MAP_CODEC() { return wrapperContained.MAP_CODEC; }
// public void MAP_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MAP_CODEC = value; }
public static com.mojang.serialization.MapCodec MAP_CODEC() { return net.minecraft.resource.DataConfiguration.MAP_CODEC; }
// public static void MAP_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.resource.DataConfiguration.MAP_CODEC = value; }

public yarnwrap.resource.DataConfiguration withFeaturesAdded(yarnwrap.resource.featuretoggle.FeatureSet features) { return new yarnwrap.resource.DataConfiguration(wrapperContained.withFeaturesAdded(features.wrapperContained)); }
// public static yarnwrap.resource.DataConfiguration withFeaturesAdded(yarnwrap.resource.featuretoggle.FeatureSet features, ) { return new yarnwrap.resource.DataConfiguration(net.minecraft.resource.DataConfiguration.withFeaturesAdded(features.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_45450(Object instance) { return wrapperContained.method_45450(instance); }
// public static com.mojang.datafixers.kinds.App method_45450(Object instance, ) { return net.minecraft.resource.DataConfiguration.method_45450(instance); }

}