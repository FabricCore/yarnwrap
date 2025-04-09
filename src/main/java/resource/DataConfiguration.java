package yarnwrap.resource;
public class DataConfiguration { public net.minecraft.resource.DataConfiguration wrapperContained; public DataConfiguration(net.minecraft.resource.DataConfiguration wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String ENABLED_FEATURES_KEY() { return wrapperContained.ENABLED_FEATURES_KEY; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.resource.DataConfiguration SAFE_MODE() { return new yarnwrap.resource.DataConfiguration(wrapperContained.SAFE_MODE); }
public yarnwrap.resource.DataConfiguration withFeaturesAdded(yarnwrap.resource.featuretoggle.FeatureSet features) { return new yarnwrap.resource.DataConfiguration(wrapperContained.withFeaturesAdded(features.wrapperContained)); }

}