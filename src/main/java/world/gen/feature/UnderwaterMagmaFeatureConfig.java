package yarnwrap.world.gen.feature;
public class UnderwaterMagmaFeatureConfig { public net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig wrapperContained; public UnderwaterMagmaFeatureConfig(net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public int floorSearchRange() { return wrapperContained.floorSearchRange; }
public int placementRadiusAroundFloor() { return wrapperContained.placementRadiusAroundFloor; }
public float placementProbabilityPerValidPosition() { return wrapperContained.placementProbabilityPerValidPosition; }

}