package yarnwrap.resource.featuretoggle;
public class FeatureSet { public net.minecraft.resource.featuretoggle.FeatureSet wrapperContained; public FeatureSet(net.minecraft.resource.featuretoggle.FeatureSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_FEATURE_FLAGS() { return wrapperContained.MAX_FEATURE_FLAGS; }
// public void MAX_FEATURE_FLAGS(int value) { wrapperContained.MAX_FEATURE_FLAGS = value; }
public static int MAX_FEATURE_FLAGS() { return net.minecraft.resource.featuretoggle.FeatureSet.MAX_FEATURE_FLAGS; }
// public static void MAX_FEATURE_FLAGS(int value, ) { net.minecraft.resource.featuretoggle.FeatureSet.MAX_FEATURE_FLAGS = value; }

// public yarnwrap.resource.featuretoggle.FeatureSet EMPTY() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.EMPTY = value.wrapperContained; }
// public static yarnwrap.resource.featuretoggle.FeatureSet EMPTY() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.resource.featuretoggle.FeatureSet.EMPTY); }
// public static void EMPTY(yarnwrap.resource.featuretoggle.FeatureSet value, ) { net.minecraft.resource.featuretoggle.FeatureSet.EMPTY = value.wrapperContained; }

// public yarnwrap.resource.featuretoggle.FeatureUniverse universe() { return new yarnwrap.resource.featuretoggle.FeatureUniverse(wrapperContained.universe); }
// public void universe(yarnwrap.resource.featuretoggle.FeatureUniverse value) { wrapperContained.universe = value.wrapperContained; }
// public static yarnwrap.resource.featuretoggle.FeatureUniverse universe() { return new yarnwrap.resource.featuretoggle.FeatureUniverse(net.minecraft.resource.featuretoggle.FeatureSet.universe); }
// public static void universe(yarnwrap.resource.featuretoggle.FeatureUniverse value, ) { net.minecraft.resource.featuretoggle.FeatureSet.universe = value.wrapperContained; }

// public long featuresMask() { return wrapperContained.featuresMask; }
// public void featuresMask(long value) { wrapperContained.featuresMask = value; }
// public static long featuresMask() { return net.minecraft.resource.featuretoggle.FeatureSet.featuresMask; }
// public static void featuresMask(long value, ) { net.minecraft.resource.featuretoggle.FeatureSet.featuresMask = value; }

// public FeatureSet(yarnwrap.resource.featuretoggle.FeatureUniverse universe,long featuresMask) { this.wrapperContained = new net.minecraft.resource.featuretoggle.FeatureSet(universe.wrapperContained,featuresMask); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.resource.featuretoggle.FeatureSet.equals(o); }
// public yarnwrap.resource.featuretoggle.FeatureSet empty() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.empty()); }
public static yarnwrap.resource.featuretoggle.FeatureSet empty() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.resource.featuretoggle.FeatureSet.empty()); }
// public yarnwrap.resource.featuretoggle.FeatureSet of(yarnwrap.resource.featuretoggle.FeatureFlag feature) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.of(feature.wrapperContained)); }
// public static yarnwrap.resource.featuretoggle.FeatureSet of(yarnwrap.resource.featuretoggle.FeatureFlag feature, ) { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.resource.featuretoggle.FeatureSet.of(feature.wrapperContained)); }
// public yarnwrap.resource.featuretoggle.FeatureSet of(yarnwrap.resource.featuretoggle.FeatureFlag feature1,net.minecraft.resource.featuretoggle.FeatureFlag[] features) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.of(feature1.wrapperContained,features)); }
// public static yarnwrap.resource.featuretoggle.FeatureSet of(yarnwrap.resource.featuretoggle.FeatureFlag feature1,net.minecraft.resource.featuretoggle.FeatureFlag[] features, ) { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.resource.featuretoggle.FeatureSet.of(feature1.wrapperContained,features)); }
public boolean isSubsetOf(yarnwrap.resource.featuretoggle.FeatureSet features) { return wrapperContained.isSubsetOf(features.wrapperContained); }
// public static boolean isSubsetOf(yarnwrap.resource.featuretoggle.FeatureSet features, ) { return net.minecraft.resource.featuretoggle.FeatureSet.isSubsetOf(features.wrapperContained); }
// public long combineMask(yarnwrap.resource.featuretoggle.FeatureUniverse universe,long featuresMask,java.lang.Iterable newFeatures) { return wrapperContained.combineMask(universe.wrapperContained,featuresMask,newFeatures); }
// public static long combineMask(yarnwrap.resource.featuretoggle.FeatureUniverse universe,long featuresMask,java.lang.Iterable newFeatures, ) { return net.minecraft.resource.featuretoggle.FeatureSet.combineMask(universe.wrapperContained,featuresMask,newFeatures); }
// public yarnwrap.resource.featuretoggle.FeatureSet of(yarnwrap.resource.featuretoggle.FeatureUniverse universe,java.util.Collection features) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.of(universe.wrapperContained,features)); }
// public static yarnwrap.resource.featuretoggle.FeatureSet of(yarnwrap.resource.featuretoggle.FeatureUniverse universe,java.util.Collection features, ) { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.resource.featuretoggle.FeatureSet.of(universe.wrapperContained,features)); }
public boolean contains(yarnwrap.resource.featuretoggle.FeatureFlag feature) { return wrapperContained.contains(feature.wrapperContained); }
// public static boolean contains(yarnwrap.resource.featuretoggle.FeatureFlag feature, ) { return net.minecraft.resource.featuretoggle.FeatureSet.contains(feature.wrapperContained); }
public yarnwrap.resource.featuretoggle.FeatureSet combine(yarnwrap.resource.featuretoggle.FeatureSet features) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.combine(features.wrapperContained)); }
// public static yarnwrap.resource.featuretoggle.FeatureSet combine(yarnwrap.resource.featuretoggle.FeatureSet features, ) { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.resource.featuretoggle.FeatureSet.combine(features.wrapperContained)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.resource.featuretoggle.FeatureSet.isEmpty(); }
public boolean intersects(yarnwrap.resource.featuretoggle.FeatureSet features) { return wrapperContained.intersects(features.wrapperContained); }
// public static boolean intersects(yarnwrap.resource.featuretoggle.FeatureSet features, ) { return net.minecraft.resource.featuretoggle.FeatureSet.intersects(features.wrapperContained); }
public yarnwrap.resource.featuretoggle.FeatureSet subtract(yarnwrap.resource.featuretoggle.FeatureSet features) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.subtract(features.wrapperContained)); }
// public static yarnwrap.resource.featuretoggle.FeatureSet subtract(yarnwrap.resource.featuretoggle.FeatureSet features, ) { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.resource.featuretoggle.FeatureSet.subtract(features.wrapperContained)); }

}