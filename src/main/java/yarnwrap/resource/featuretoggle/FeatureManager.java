package yarnwrap.resource.featuretoggle;
public class FeatureManager { public net.minecraft.resource.featuretoggle.FeatureManager wrapperContained; public FeatureManager(net.minecraft.resource.featuretoggle.FeatureManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.resource.featuretoggle.FeatureManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.resource.featuretoggle.FeatureManager.LOGGER = value; }

// public yarnwrap.resource.featuretoggle.FeatureUniverse universe() { return new yarnwrap.resource.featuretoggle.FeatureUniverse(wrapperContained.universe); }
// public void universe(yarnwrap.resource.featuretoggle.FeatureUniverse value) { wrapperContained.universe = value.wrapperContained; }
// public static yarnwrap.resource.featuretoggle.FeatureUniverse universe() { return new yarnwrap.resource.featuretoggle.FeatureUniverse(net.minecraft.resource.featuretoggle.FeatureManager.universe); }
// public static void universe(yarnwrap.resource.featuretoggle.FeatureUniverse value, ) { net.minecraft.resource.featuretoggle.FeatureManager.universe = value.wrapperContained; }

// public java.util.Map featureFlags() { return wrapperContained.featureFlags; }
// public void featureFlags(java.util.Map value) { wrapperContained.featureFlags = value; }
// public static java.util.Map featureFlags() { return net.minecraft.resource.featuretoggle.FeatureManager.featureFlags; }
// public static void featureFlags(java.util.Map value, ) { net.minecraft.resource.featuretoggle.FeatureManager.featureFlags = value; }

// public yarnwrap.resource.featuretoggle.FeatureSet featureSet() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.featureSet); }
// public void featureSet(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.featureSet = value.wrapperContained; }
// public static yarnwrap.resource.featuretoggle.FeatureSet featureSet() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.resource.featuretoggle.FeatureManager.featureSet); }
// public static void featureSet(yarnwrap.resource.featuretoggle.FeatureSet value, ) { net.minecraft.resource.featuretoggle.FeatureManager.featureSet = value.wrapperContained; }

// public FeatureManager(yarnwrap.resource.featuretoggle.FeatureUniverse universe,yarnwrap.resource.featuretoggle.FeatureSet featureSet,java.util.Map featureFlags) { this.wrapperContained = new net.minecraft.resource.featuretoggle.FeatureManager(universe.wrapperContained,featureSet.wrapperContained,featureFlags); }
public yarnwrap.resource.featuretoggle.FeatureSet getFeatureSet() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.getFeatureSet()); }
// public static yarnwrap.resource.featuretoggle.FeatureSet getFeatureSet() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.resource.featuretoggle.FeatureManager.getFeatureSet()); }
// public void method_45384(yarnwrap.util.Identifier feature) { wrapperContained.method_45384(feature.wrapperContained); }
// public static void method_45384(yarnwrap.util.Identifier feature, ) { net.minecraft.resource.featuretoggle.FeatureManager.method_45384(feature.wrapperContained); }
public boolean contains(yarnwrap.resource.featuretoggle.FeatureSet features) { return wrapperContained.contains(features.wrapperContained); }
// public static boolean contains(yarnwrap.resource.featuretoggle.FeatureSet features, ) { return net.minecraft.resource.featuretoggle.FeatureManager.contains(features.wrapperContained); }
// public void method_45386(yarnwrap.resource.featuretoggle.FeatureSet identifier,java.util.Set featureFlag) { wrapperContained.method_45386(identifier.wrapperContained,featureFlag); }
// public static void method_45386(yarnwrap.resource.featuretoggle.FeatureSet identifier,java.util.Set featureFlag, ) { net.minecraft.resource.featuretoggle.FeatureManager.method_45386(identifier.wrapperContained,featureFlag); }
public yarnwrap.resource.featuretoggle.FeatureSet featureSetOf(java.lang.Iterable features) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.featureSetOf(features)); }
// public static yarnwrap.resource.featuretoggle.FeatureSet featureSetOf(java.lang.Iterable features, ) { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.resource.featuretoggle.FeatureManager.featureSetOf(features)); }
public yarnwrap.resource.featuretoggle.FeatureSet featureSetOf(java.lang.Iterable features,java.util.function.Consumer unknownFlagConsumer) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.featureSetOf(features,unknownFlagConsumer)); }
// public static yarnwrap.resource.featuretoggle.FeatureSet featureSetOf(java.lang.Iterable features,java.util.function.Consumer unknownFlagConsumer, ) { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.resource.featuretoggle.FeatureManager.featureSetOf(features,unknownFlagConsumer)); }
// public com.mojang.serialization.DataResult method_45389(java.util.List featureIds) { return wrapperContained.method_45389(featureIds); }
// public static com.mojang.serialization.DataResult method_45389(java.util.List featureIds, ) { return net.minecraft.resource.featuretoggle.FeatureManager.method_45389(featureIds); }
public yarnwrap.resource.featuretoggle.FeatureSet featureSetOf(net.minecraft.resource.featuretoggle.FeatureFlag[] features) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.featureSetOf(features)); }
// public static yarnwrap.resource.featuretoggle.FeatureSet featureSetOf(net.minecraft.resource.featuretoggle.FeatureFlag[] features, ) { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.resource.featuretoggle.FeatureManager.featureSetOf(features)); }
public com.mojang.serialization.Codec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.Codec getCodec() { return net.minecraft.resource.featuretoggle.FeatureManager.getCodec(); }
public java.util.Set toId(yarnwrap.resource.featuretoggle.FeatureSet features) { return wrapperContained.toId(features.wrapperContained); }
// public static java.util.Set toId(yarnwrap.resource.featuretoggle.FeatureSet features, ) { return net.minecraft.resource.featuretoggle.FeatureManager.toId(features.wrapperContained); }
// public java.util.List method_45393(yarnwrap.resource.featuretoggle.FeatureSet features) { return wrapperContained.method_45393(features.wrapperContained); }
// public static java.util.List method_45393(yarnwrap.resource.featuretoggle.FeatureSet features, ) { return net.minecraft.resource.featuretoggle.FeatureManager.method_45393(features.wrapperContained); }

}