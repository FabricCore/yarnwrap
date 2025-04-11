package yarnwrap.world.gen.feature;
public class UnderwaterMagmaFeatureConfig { public net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig wrapperContained; public UnderwaterMagmaFeatureConfig(net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public int floorSearchRange() { return wrapperContained.floorSearchRange; }
// public void floorSearchRange(int value) { wrapperContained.floorSearchRange = value; }
public int placementRadiusAroundFloor() { return wrapperContained.placementRadiusAroundFloor; }
// public void placementRadiusAroundFloor(int value) { wrapperContained.placementRadiusAroundFloor = value; }
public float placementProbabilityPerValidPosition() { return wrapperContained.placementProbabilityPerValidPosition; }
// public void placementProbabilityPerValidPosition(float value) { wrapperContained.placementProbabilityPerValidPosition = value; }

}