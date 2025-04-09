package yarnwrap.resource.featuretoggle;
public class ToggleableFeature { public net.minecraft.resource.featuretoggle.ToggleableFeature wrapperContained; public ToggleableFeature(net.minecraft.resource.featuretoggle.ToggleableFeature wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Set FEATURE_ENABLED_REGISTRY_KEYS() { return wrapperContained.FEATURE_ENABLED_REGISTRY_KEYS; }
public yarnwrap.resource.featuretoggle.FeatureSet getRequiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.getRequiredFeatures()); }
public boolean isEnabled(yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures) { return wrapperContained.isEnabled(enabledFeatures.wrapperContained); }

}