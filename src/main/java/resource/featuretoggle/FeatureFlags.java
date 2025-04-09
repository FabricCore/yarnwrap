package yarnwrap.resource.featuretoggle;
public class FeatureFlags { public net.minecraft.resource.featuretoggle.FeatureFlags wrapperContained; public FeatureFlags(net.minecraft.resource.featuretoggle.FeatureFlags wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.resource.featuretoggle.FeatureFlag VANILLA() { return new yarnwrap.resource.featuretoggle.FeatureFlag(wrapperContained.VANILLA); }
public yarnwrap.resource.featuretoggle.FeatureFlag BUNDLE() { return new yarnwrap.resource.featuretoggle.FeatureFlag(wrapperContained.BUNDLE); }
public yarnwrap.resource.featuretoggle.FeatureManager FEATURE_MANAGER() { return new yarnwrap.resource.featuretoggle.FeatureManager(wrapperContained.FEATURE_MANAGER); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.resource.featuretoggle.FeatureSet VANILLA_FEATURES() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.VANILLA_FEATURES); }
public yarnwrap.resource.featuretoggle.FeatureSet DEFAULT_ENABLED_FEATURES() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.DEFAULT_ENABLED_FEATURES); }
public yarnwrap.resource.featuretoggle.FeatureFlag TRADE_REBALANCE() { return new yarnwrap.resource.featuretoggle.FeatureFlag(wrapperContained.TRADE_REBALANCE); }
public java.lang.String printMissingFlags(yarnwrap.resource.featuretoggle.FeatureManager featureManager,yarnwrap.resource.featuretoggle.FeatureSet featuresToCheck,yarnwrap.resource.featuretoggle.FeatureSet features) { return wrapperContained.printMissingFlags(featureManager.wrapperContained,featuresToCheck.wrapperContained,features.wrapperContained); }
public boolean isNotVanilla(yarnwrap.resource.featuretoggle.FeatureSet features) { return wrapperContained.isNotVanilla(features.wrapperContained); }
public java.lang.String printMissingFlags(yarnwrap.resource.featuretoggle.FeatureSet featuresToCheck,yarnwrap.resource.featuretoggle.FeatureSet features) { return wrapperContained.printMissingFlags(featuresToCheck.wrapperContained,features.wrapperContained); }

}