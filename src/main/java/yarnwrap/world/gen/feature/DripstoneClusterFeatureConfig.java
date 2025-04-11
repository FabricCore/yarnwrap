package yarnwrap.world.gen.feature;
public class DripstoneClusterFeatureConfig { public net.minecraft.world.gen.feature.DripstoneClusterFeatureConfig wrapperContained; public DripstoneClusterFeatureConfig(net.minecraft.world.gen.feature.DripstoneClusterFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public int floorToCeilingSearchRange() { return wrapperContained.floorToCeilingSearchRange; }
// public void floorToCeilingSearchRange(int value) { wrapperContained.floorToCeilingSearchRange = value; }
public yarnwrap.util.math.intprovider.IntProvider height() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.height); }
// public void height(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.height = value.wrapperContained; }
public yarnwrap.util.math.intprovider.IntProvider radius() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.radius); }
// public void radius(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.radius = value.wrapperContained; }
public int maxStalagmiteStalactiteHeightDiff() { return wrapperContained.maxStalagmiteStalactiteHeightDiff; }
// public void maxStalagmiteStalactiteHeightDiff(int value) { wrapperContained.maxStalagmiteStalactiteHeightDiff = value; }
public int heightDeviation() { return wrapperContained.heightDeviation; }
// public void heightDeviation(int value) { wrapperContained.heightDeviation = value; }
public yarnwrap.util.math.intprovider.IntProvider dripstoneBlockLayerThickness() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.dripstoneBlockLayerThickness); }
// public void dripstoneBlockLayerThickness(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.dripstoneBlockLayerThickness = value.wrapperContained; }
public yarnwrap.util.math.floatprovider.FloatProvider density() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.density); }
// public void density(yarnwrap.util.math.floatprovider.FloatProvider value) { wrapperContained.density = value.wrapperContained; }
public yarnwrap.util.math.floatprovider.FloatProvider wetness() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.wetness); }
// public void wetness(yarnwrap.util.math.floatprovider.FloatProvider value) { wrapperContained.wetness = value.wrapperContained; }
public float chanceOfDripstoneColumnAtMaxDistanceFromCenter() { return wrapperContained.chanceOfDripstoneColumnAtMaxDistanceFromCenter; }
// public void chanceOfDripstoneColumnAtMaxDistanceFromCenter(float value) { wrapperContained.chanceOfDripstoneColumnAtMaxDistanceFromCenter = value; }
public int maxDistanceFromCenterAffectingChanceOfDripstoneColumn() { return wrapperContained.maxDistanceFromCenterAffectingChanceOfDripstoneColumn; }
// public void maxDistanceFromCenterAffectingChanceOfDripstoneColumn(int value) { wrapperContained.maxDistanceFromCenterAffectingChanceOfDripstoneColumn = value; }
public int maxDistanceFromCenterAffectingHeightBias() { return wrapperContained.maxDistanceFromCenterAffectingHeightBias; }
// public void maxDistanceFromCenterAffectingHeightBias(int value) { wrapperContained.maxDistanceFromCenterAffectingHeightBias = value; }
public DripstoneClusterFeatureConfig(int floorToCeilingSearchRange,yarnwrap.util.math.intprovider.IntProvider height,yarnwrap.util.math.intprovider.IntProvider radius,int maxStalagmiteStalactiteHeightDiff,int heightDeviation,yarnwrap.util.math.intprovider.IntProvider dripstoneBlockLayerThickness,yarnwrap.util.math.floatprovider.FloatProvider density,yarnwrap.util.math.floatprovider.FloatProvider wetness,float wetnessMean,int maxDistanceFromCenterAffectingChanceOfDripstoneColumn,int maxDistanceFromCenterAffectingHeightBias) { this.wrapperContained = new net.minecraft.world.gen.feature.DripstoneClusterFeatureConfig(floorToCeilingSearchRange,height.wrapperContained,radius.wrapperContained,maxStalagmiteStalactiteHeightDiff,heightDeviation,dripstoneBlockLayerThickness.wrapperContained,density.wrapperContained,wetness.wrapperContained,wetnessMean,maxDistanceFromCenterAffectingChanceOfDripstoneColumn,maxDistanceFromCenterAffectingHeightBias); }
// public java.lang.Float method_33043(yarnwrap.world.gen.feature.DripstoneClusterFeatureConfig config) { return wrapperContained.method_33043(config.wrapperContained); }
// public yarnwrap.util.math.floatprovider.FloatProvider method_33044(yarnwrap.world.gen.feature.DripstoneClusterFeatureConfig config) { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.method_33044(config.wrapperContained)); }
// public yarnwrap.util.math.floatprovider.FloatProvider method_33045(yarnwrap.world.gen.feature.DripstoneClusterFeatureConfig config) { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.method_33045(config.wrapperContained)); }
// public yarnwrap.util.math.intprovider.IntProvider method_33046(yarnwrap.world.gen.feature.DripstoneClusterFeatureConfig config) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_33046(config.wrapperContained)); }
// public java.lang.Integer method_33047(yarnwrap.world.gen.feature.DripstoneClusterFeatureConfig config) { return wrapperContained.method_33047(config.wrapperContained); }
// public java.lang.Integer method_33048(yarnwrap.world.gen.feature.DripstoneClusterFeatureConfig config) { return wrapperContained.method_33048(config.wrapperContained); }
// public yarnwrap.util.math.intprovider.IntProvider method_33049(yarnwrap.world.gen.feature.DripstoneClusterFeatureConfig config) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_33049(config.wrapperContained)); }
// public yarnwrap.util.math.intprovider.IntProvider method_33050(yarnwrap.world.gen.feature.DripstoneClusterFeatureConfig config) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_33050(config.wrapperContained)); }
// public java.lang.Integer method_33051(yarnwrap.world.gen.feature.DripstoneClusterFeatureConfig config) { return wrapperContained.method_33051(config.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_33987(Object instance) { return wrapperContained.method_33987(instance); }
// public java.lang.Integer method_33988(yarnwrap.world.gen.feature.DripstoneClusterFeatureConfig config) { return wrapperContained.method_33988(config.wrapperContained); }
// public java.lang.Integer method_33989(yarnwrap.world.gen.feature.DripstoneClusterFeatureConfig config) { return wrapperContained.method_33989(config.wrapperContained); }

}