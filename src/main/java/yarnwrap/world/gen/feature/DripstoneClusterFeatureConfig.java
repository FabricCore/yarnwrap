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

}