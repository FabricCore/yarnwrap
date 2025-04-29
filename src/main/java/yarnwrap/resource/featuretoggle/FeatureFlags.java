package yarnwrap.resource.featuretoggle;
public class FeatureFlags { public net.minecraft.resource.featuretoggle.FeatureFlags wrapperContained; public FeatureFlags(net.minecraft.resource.featuretoggle.FeatureFlags wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.featuretoggle.FeatureFlag VANILLA() { return new yarnwrap.resource.featuretoggle.FeatureFlag(wrapperContained.VANILLA); }
// public void VANILLA(yarnwrap.resource.featuretoggle.FeatureFlag value) { wrapperContained.VANILLA = value.wrapperContained; }
public static yarnwrap.resource.featuretoggle.FeatureFlag VANILLA() { return new yarnwrap.resource.featuretoggle.FeatureFlag(net.minecraft.resource.featuretoggle.FeatureFlags.VANILLA); }
// public static void VANILLA(yarnwrap.resource.featuretoggle.FeatureFlag value, ) { net.minecraft.resource.featuretoggle.FeatureFlags.VANILLA = value.wrapperContained; }

// public yarnwrap.resource.featuretoggle.FeatureFlag BUNDLE() { return new yarnwrap.resource.featuretoggle.FeatureFlag(wrapperContained.BUNDLE); }
// public void BUNDLE(yarnwrap.resource.featuretoggle.FeatureFlag value) { wrapperContained.BUNDLE = value.wrapperContained; }
public static yarnwrap.resource.featuretoggle.FeatureFlag BUNDLE() { return new yarnwrap.resource.featuretoggle.FeatureFlag(net.minecraft.resource.featuretoggle.FeatureFlags.BUNDLE); }
// public static void BUNDLE(yarnwrap.resource.featuretoggle.FeatureFlag value, ) { net.minecraft.resource.featuretoggle.FeatureFlags.BUNDLE = value.wrapperContained; }

// public yarnwrap.resource.featuretoggle.FeatureManager FEATURE_MANAGER() { return new yarnwrap.resource.featuretoggle.FeatureManager(wrapperContained.FEATURE_MANAGER); }
// public void FEATURE_MANAGER(yarnwrap.resource.featuretoggle.FeatureManager value) { wrapperContained.FEATURE_MANAGER = value.wrapperContained; }
public static yarnwrap.resource.featuretoggle.FeatureManager FEATURE_MANAGER() { return new yarnwrap.resource.featuretoggle.FeatureManager(net.minecraft.resource.featuretoggle.FeatureFlags.FEATURE_MANAGER); }
// public static void FEATURE_MANAGER(yarnwrap.resource.featuretoggle.FeatureManager value, ) { net.minecraft.resource.featuretoggle.FeatureFlags.FEATURE_MANAGER = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.resource.featuretoggle.FeatureFlags.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.resource.featuretoggle.FeatureFlags.CODEC = value; }

// public yarnwrap.resource.featuretoggle.FeatureSet VANILLA_FEATURES() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.VANILLA_FEATURES); }
// public void VANILLA_FEATURES(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.VANILLA_FEATURES = value.wrapperContained; }
public static yarnwrap.resource.featuretoggle.FeatureSet VANILLA_FEATURES() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.resource.featuretoggle.FeatureFlags.VANILLA_FEATURES); }
// public static void VANILLA_FEATURES(yarnwrap.resource.featuretoggle.FeatureSet value, ) { net.minecraft.resource.featuretoggle.FeatureFlags.VANILLA_FEATURES = value.wrapperContained; }

// public yarnwrap.resource.featuretoggle.FeatureSet DEFAULT_ENABLED_FEATURES() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.DEFAULT_ENABLED_FEATURES); }
// public void DEFAULT_ENABLED_FEATURES(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.DEFAULT_ENABLED_FEATURES = value.wrapperContained; }
public static yarnwrap.resource.featuretoggle.FeatureSet DEFAULT_ENABLED_FEATURES() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.resource.featuretoggle.FeatureFlags.DEFAULT_ENABLED_FEATURES); }
// public static void DEFAULT_ENABLED_FEATURES(yarnwrap.resource.featuretoggle.FeatureSet value, ) { net.minecraft.resource.featuretoggle.FeatureFlags.DEFAULT_ENABLED_FEATURES = value.wrapperContained; }

// public yarnwrap.resource.featuretoggle.FeatureFlag TRADE_REBALANCE() { return new yarnwrap.resource.featuretoggle.FeatureFlag(wrapperContained.TRADE_REBALANCE); }
// public void TRADE_REBALANCE(yarnwrap.resource.featuretoggle.FeatureFlag value) { wrapperContained.TRADE_REBALANCE = value.wrapperContained; }
public static yarnwrap.resource.featuretoggle.FeatureFlag TRADE_REBALANCE() { return new yarnwrap.resource.featuretoggle.FeatureFlag(net.minecraft.resource.featuretoggle.FeatureFlags.TRADE_REBALANCE); }
// public static void TRADE_REBALANCE(yarnwrap.resource.featuretoggle.FeatureFlag value, ) { net.minecraft.resource.featuretoggle.FeatureFlags.TRADE_REBALANCE = value.wrapperContained; }

// public java.lang.String printMissingFlags(yarnwrap.resource.featuretoggle.FeatureManager featureManager,yarnwrap.resource.featuretoggle.FeatureSet featuresToCheck,yarnwrap.resource.featuretoggle.FeatureSet features) { return wrapperContained.printMissingFlags(featureManager.wrapperContained,featuresToCheck.wrapperContained,features.wrapperContained); }
// public static java.lang.String printMissingFlags(yarnwrap.resource.featuretoggle.FeatureManager featureManager,yarnwrap.resource.featuretoggle.FeatureSet featuresToCheck,yarnwrap.resource.featuretoggle.FeatureSet features, ) { return net.minecraft.resource.featuretoggle.FeatureFlags.printMissingFlags(featureManager.wrapperContained,featuresToCheck.wrapperContained,features.wrapperContained); }
// public boolean isNotVanilla(yarnwrap.resource.featuretoggle.FeatureSet features) { return wrapperContained.isNotVanilla(features.wrapperContained); }
// public static boolean isNotVanilla(yarnwrap.resource.featuretoggle.FeatureSet features, ) { return net.minecraft.resource.featuretoggle.FeatureFlags.isNotVanilla(features.wrapperContained); }
// public java.lang.String printMissingFlags(yarnwrap.resource.featuretoggle.FeatureSet featuresToCheck,yarnwrap.resource.featuretoggle.FeatureSet features) { return wrapperContained.printMissingFlags(featuresToCheck.wrapperContained,features.wrapperContained); }
// public static java.lang.String printMissingFlags(yarnwrap.resource.featuretoggle.FeatureSet featuresToCheck,yarnwrap.resource.featuretoggle.FeatureSet features, ) { return net.minecraft.resource.featuretoggle.FeatureFlags.printMissingFlags(featuresToCheck.wrapperContained,features.wrapperContained); }
// public boolean method_45408(java.util.Set id) { return wrapperContained.method_45408(id); }
// public static boolean method_45408(java.util.Set id, ) { return net.minecraft.resource.featuretoggle.FeatureFlags.method_45408(id); }

}