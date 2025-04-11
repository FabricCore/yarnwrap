package yarnwrap.resource;
public class DataConfiguration { public net.minecraft.resource.DataConfiguration wrapperContained; public DataConfiguration(net.minecraft.resource.DataConfiguration wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String ENABLED_FEATURES_KEY() { return wrapperContained.ENABLED_FEATURES_KEY; }
// public void ENABLED_FEATURES_KEY(java.lang.String value) { wrapperContained.ENABLED_FEATURES_KEY = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.resource.DataConfiguration SAFE_MODE() { return new yarnwrap.resource.DataConfiguration(wrapperContained.SAFE_MODE); }
// public void SAFE_MODE(yarnwrap.resource.DataConfiguration value) { wrapperContained.SAFE_MODE = value.wrapperContained; }
public yarnwrap.resource.DataConfiguration withFeaturesAdded(yarnwrap.resource.featuretoggle.FeatureSet features) { return new yarnwrap.resource.DataConfiguration(wrapperContained.withFeaturesAdded(features.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_45450(Object instance) { return wrapperContained.method_45450(instance); }

}