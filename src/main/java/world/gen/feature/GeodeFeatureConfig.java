package yarnwrap.world.gen.feature;
public class GeodeFeatureConfig { public net.minecraft.world.gen.feature.GeodeFeatureConfig wrapperContained; public GeodeFeatureConfig(net.minecraft.world.gen.feature.GeodeFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec RANGE() { return wrapperContained.RANGE; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.world.gen.feature.GeodeLayerConfig layerConfig() { return new yarnwrap.world.gen.feature.GeodeLayerConfig(wrapperContained.layerConfig); }
public yarnwrap.world.gen.feature.GeodeLayerThicknessConfig layerThicknessConfig() { return new yarnwrap.world.gen.feature.GeodeLayerThicknessConfig(wrapperContained.layerThicknessConfig); }
public yarnwrap.world.gen.feature.GeodeCrackConfig crackConfig() { return new yarnwrap.world.gen.feature.GeodeCrackConfig(wrapperContained.crackConfig); }
public double usePotentialPlacementsChance() { return wrapperContained.usePotentialPlacementsChance; }
public double useAlternateLayer0Chance() { return wrapperContained.useAlternateLayer0Chance; }
public boolean placementsRequireLayer0Alternate() { return wrapperContained.placementsRequireLayer0Alternate; }
public int minGenOffset() { return wrapperContained.minGenOffset; }
public int maxGenOffset() { return wrapperContained.maxGenOffset; }
public double noiseMultiplier() { return wrapperContained.noiseMultiplier; }
public int invalidBlocksThreshold() { return wrapperContained.invalidBlocksThreshold; }
public yarnwrap.util.math.intprovider.IntProvider outerWallDistance() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.outerWallDistance); }
public yarnwrap.util.math.intprovider.IntProvider distributionPoints() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.distributionPoints); }
public yarnwrap.util.math.intprovider.IntProvider pointOffset() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.pointOffset); }

}