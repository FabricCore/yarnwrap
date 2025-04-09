package yarnwrap.resource.featuretoggle;
public class FeatureSet { public net.minecraft.resource.featuretoggle.FeatureSet wrapperContained; public FeatureSet(net.minecraft.resource.featuretoggle.FeatureSet wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_FEATURE_FLAGS() { return wrapperContained.MAX_FEATURE_FLAGS; }
// public yarnwrap.resource.featuretoggle.FeatureSet EMPTY() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.EMPTY); }
// public yarnwrap.resource.featuretoggle.FeatureUniverse universe() { return new yarnwrap.resource.featuretoggle.FeatureUniverse(wrapperContained.universe); }
// public long featuresMask() { return wrapperContained.featuresMask; }
public yarnwrap.resource.featuretoggle.FeatureSet empty() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.empty()); }
public yarnwrap.resource.featuretoggle.FeatureSet of(yarnwrap.resource.featuretoggle.FeatureFlag feature) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.of(feature.wrapperContained)); }
public yarnwrap.resource.featuretoggle.FeatureSet of(yarnwrap.resource.featuretoggle.FeatureFlag feature1,net.minecraft.resource.featuretoggle.FeatureFlag[] features) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.of(feature1.wrapperContained,features)); }
public boolean isSubsetOf(yarnwrap.resource.featuretoggle.FeatureSet features) { return wrapperContained.isSubsetOf(features.wrapperContained); }
// public long combineMask(yarnwrap.resource.featuretoggle.FeatureUniverse universe,long featuresMask,java.lang.Iterable newFeatures) { return wrapperContained.combineMask(universe.wrapperContained,featuresMask,newFeatures); }
// public yarnwrap.resource.featuretoggle.FeatureSet of(yarnwrap.resource.featuretoggle.FeatureUniverse universe,java.util.Collection features) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.of(universe.wrapperContained,features)); }
public boolean contains(yarnwrap.resource.featuretoggle.FeatureFlag feature) { return wrapperContained.contains(feature.wrapperContained); }
public yarnwrap.resource.featuretoggle.FeatureSet combine(yarnwrap.resource.featuretoggle.FeatureSet features) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.combine(features.wrapperContained)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public boolean intersects(yarnwrap.resource.featuretoggle.FeatureSet features) { return wrapperContained.intersects(features.wrapperContained); }
public yarnwrap.resource.featuretoggle.FeatureSet subtract(yarnwrap.resource.featuretoggle.FeatureSet features) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.subtract(features.wrapperContained)); }

}