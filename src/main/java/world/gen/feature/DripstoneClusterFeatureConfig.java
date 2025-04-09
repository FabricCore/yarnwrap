package yarnwrap.world.gen.feature;
public class DripstoneClusterFeatureConfig { public net.minecraft.world.gen.feature.DripstoneClusterFeatureConfig wrapperContained; public DripstoneClusterFeatureConfig(net.minecraft.world.gen.feature.DripstoneClusterFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public int floorToCeilingSearchRange() { return wrapperContained.floorToCeilingSearchRange; }
public yarnwrap.util.math.intprovider.IntProvider height() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.height); }
public yarnwrap.util.math.intprovider.IntProvider radius() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.radius); }
public int maxStalagmiteStalactiteHeightDiff() { return wrapperContained.maxStalagmiteStalactiteHeightDiff; }
public int heightDeviation() { return wrapperContained.heightDeviation; }
public yarnwrap.util.math.intprovider.IntProvider dripstoneBlockLayerThickness() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.dripstoneBlockLayerThickness); }
public yarnwrap.util.math.floatprovider.FloatProvider density() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.density); }
public yarnwrap.util.math.floatprovider.FloatProvider wetness() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.wetness); }
public float chanceOfDripstoneColumnAtMaxDistanceFromCenter() { return wrapperContained.chanceOfDripstoneColumnAtMaxDistanceFromCenter; }
public int maxDistanceFromCenterAffectingChanceOfDripstoneColumn() { return wrapperContained.maxDistanceFromCenterAffectingChanceOfDripstoneColumn; }
public int maxDistanceFromCenterAffectingHeightBias() { return wrapperContained.maxDistanceFromCenterAffectingHeightBias; }

}