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
public UnderwaterMagmaFeatureConfig(int minDistanceBelowSurface,int floorSearchRange,float placementProbabilityPerValidPosition) { this.wrapperContained = new net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig(minDistanceBelowSurface,floorSearchRange,placementProbabilityPerValidPosition); }
// public com.mojang.datafixers.kinds.App method_33771(Object instance) { return wrapperContained.method_33771(instance); }
// public java.lang.Float method_33772(yarnwrap.world.gen.feature.UnderwaterMagmaFeatureConfig config) { return wrapperContained.method_33772(config.wrapperContained); }
// public java.lang.Integer method_33773(yarnwrap.world.gen.feature.UnderwaterMagmaFeatureConfig config) { return wrapperContained.method_33773(config.wrapperContained); }
// public java.lang.Integer method_33774(yarnwrap.world.gen.feature.UnderwaterMagmaFeatureConfig config) { return wrapperContained.method_33774(config.wrapperContained); }

}