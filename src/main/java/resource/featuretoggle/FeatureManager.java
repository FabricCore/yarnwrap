package yarnwrap.resource.featuretoggle;
public class FeatureManager { public net.minecraft.resource.featuretoggle.FeatureManager wrapperContained; public FeatureManager(net.minecraft.resource.featuretoggle.FeatureManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.resource.featuretoggle.FeatureUniverse universe() { return new yarnwrap.resource.featuretoggle.FeatureUniverse(wrapperContained.universe); }
// public java.util.Map featureFlags() { return wrapperContained.featureFlags; }
// public yarnwrap.resource.featuretoggle.FeatureSet featureSet() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.featureSet); }
public yarnwrap.resource.featuretoggle.FeatureSet getFeatureSet() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.getFeatureSet()); }
public boolean contains(yarnwrap.resource.featuretoggle.FeatureSet features) { return wrapperContained.contains(features.wrapperContained); }
public yarnwrap.resource.featuretoggle.FeatureSet featureSetOf(java.lang.Iterable features) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.featureSetOf(features)); }
public yarnwrap.resource.featuretoggle.FeatureSet featureSetOf(java.lang.Iterable features,java.util.function.Consumer unknownFlagConsumer) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.featureSetOf(features,unknownFlagConsumer)); }
public yarnwrap.resource.featuretoggle.FeatureSet featureSetOf(net.minecraft.resource.featuretoggle.FeatureFlag[] features) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.featureSetOf(features)); }
public com.mojang.serialization.Codec getCodec() { return wrapperContained.getCodec(); }
public java.util.Set toId(yarnwrap.resource.featuretoggle.FeatureSet features) { return wrapperContained.toId(features.wrapperContained); }

}