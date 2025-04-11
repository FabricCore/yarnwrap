package yarnwrap.world.gen.feature;
public class GeodeFeatureConfig { public net.minecraft.world.gen.feature.GeodeFeatureConfig wrapperContained; public GeodeFeatureConfig(net.minecraft.world.gen.feature.GeodeFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec RANGE() { return wrapperContained.RANGE; }
// public void RANGE(com.mojang.serialization.Codec value) { wrapperContained.RANGE = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.world.gen.feature.GeodeLayerConfig layerConfig() { return new yarnwrap.world.gen.feature.GeodeLayerConfig(wrapperContained.layerConfig); }
// public void layerConfig(yarnwrap.world.gen.feature.GeodeLayerConfig value) { wrapperContained.layerConfig = value.wrapperContained; }
public yarnwrap.world.gen.feature.GeodeLayerThicknessConfig layerThicknessConfig() { return new yarnwrap.world.gen.feature.GeodeLayerThicknessConfig(wrapperContained.layerThicknessConfig); }
// public void layerThicknessConfig(yarnwrap.world.gen.feature.GeodeLayerThicknessConfig value) { wrapperContained.layerThicknessConfig = value.wrapperContained; }
public yarnwrap.world.gen.feature.GeodeCrackConfig crackConfig() { return new yarnwrap.world.gen.feature.GeodeCrackConfig(wrapperContained.crackConfig); }
// public void crackConfig(yarnwrap.world.gen.feature.GeodeCrackConfig value) { wrapperContained.crackConfig = value.wrapperContained; }
public double usePotentialPlacementsChance() { return wrapperContained.usePotentialPlacementsChance; }
// public void usePotentialPlacementsChance(double value) { wrapperContained.usePotentialPlacementsChance = value; }
public double useAlternateLayer0Chance() { return wrapperContained.useAlternateLayer0Chance; }
// public void useAlternateLayer0Chance(double value) { wrapperContained.useAlternateLayer0Chance = value; }
public boolean placementsRequireLayer0Alternate() { return wrapperContained.placementsRequireLayer0Alternate; }
// public void placementsRequireLayer0Alternate(boolean value) { wrapperContained.placementsRequireLayer0Alternate = value; }
public int minGenOffset() { return wrapperContained.minGenOffset; }
// public void minGenOffset(int value) { wrapperContained.minGenOffset = value; }
public int maxGenOffset() { return wrapperContained.maxGenOffset; }
// public void maxGenOffset(int value) { wrapperContained.maxGenOffset = value; }
public double noiseMultiplier() { return wrapperContained.noiseMultiplier; }
// public void noiseMultiplier(double value) { wrapperContained.noiseMultiplier = value; }
public int invalidBlocksThreshold() { return wrapperContained.invalidBlocksThreshold; }
// public void invalidBlocksThreshold(int value) { wrapperContained.invalidBlocksThreshold = value; }
public yarnwrap.util.math.intprovider.IntProvider outerWallDistance() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.outerWallDistance); }
// public void outerWallDistance(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.outerWallDistance = value.wrapperContained; }
public yarnwrap.util.math.intprovider.IntProvider distributionPoints() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.distributionPoints); }
// public void distributionPoints(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.distributionPoints = value.wrapperContained; }
public yarnwrap.util.math.intprovider.IntProvider pointOffset() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.pointOffset); }
// public void pointOffset(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.pointOffset = value.wrapperContained; }

}