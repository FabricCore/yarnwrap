package yarnwrap.world.gen.feature;
public class UnderwaterMagmaFeatureConfig { public net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig wrapperContained; public UnderwaterMagmaFeatureConfig(net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig.CODEC = value; }

public int floorSearchRange() { return wrapperContained.floorSearchRange; }
// public void floorSearchRange(int value) { wrapperContained.floorSearchRange = value; }
// public static int floorSearchRange() { return net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig.floorSearchRange; }
// public static void floorSearchRange(int value, ) { net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig.floorSearchRange = value; }

public int placementRadiusAroundFloor() { return wrapperContained.placementRadiusAroundFloor; }
// public void placementRadiusAroundFloor(int value) { wrapperContained.placementRadiusAroundFloor = value; }
// public static int placementRadiusAroundFloor() { return net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig.placementRadiusAroundFloor; }
// public static void placementRadiusAroundFloor(int value, ) { net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig.placementRadiusAroundFloor = value; }

public float placementProbabilityPerValidPosition() { return wrapperContained.placementProbabilityPerValidPosition; }
// public void placementProbabilityPerValidPosition(float value) { wrapperContained.placementProbabilityPerValidPosition = value; }
// public static float placementProbabilityPerValidPosition() { return net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig.placementProbabilityPerValidPosition; }
// public static void placementProbabilityPerValidPosition(float value, ) { net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig.placementProbabilityPerValidPosition = value; }

public UnderwaterMagmaFeatureConfig(int minDistanceBelowSurface,int floorSearchRange,float placementProbabilityPerValidPosition) { this.wrapperContained = new net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig(minDistanceBelowSurface,floorSearchRange,placementProbabilityPerValidPosition); }
// public com.mojang.datafixers.kinds.App method_33771(Object instance) { return wrapperContained.method_33771(instance); }
// public static com.mojang.datafixers.kinds.App method_33771(Object instance, ) { return net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig.method_33771(instance); }
// public java.lang.Float method_33772(yarnwrap.world.gen.feature.UnderwaterMagmaFeatureConfig config) { return wrapperContained.method_33772(config.wrapperContained); }
// public static java.lang.Float method_33772(yarnwrap.world.gen.feature.UnderwaterMagmaFeatureConfig config, ) { return net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig.method_33772(config.wrapperContained); }
// public java.lang.Integer method_33773(yarnwrap.world.gen.feature.UnderwaterMagmaFeatureConfig config) { return wrapperContained.method_33773(config.wrapperContained); }
// public static java.lang.Integer method_33773(yarnwrap.world.gen.feature.UnderwaterMagmaFeatureConfig config, ) { return net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig.method_33773(config.wrapperContained); }
// public java.lang.Integer method_33774(yarnwrap.world.gen.feature.UnderwaterMagmaFeatureConfig config) { return wrapperContained.method_33774(config.wrapperContained); }
// public static java.lang.Integer method_33774(yarnwrap.world.gen.feature.UnderwaterMagmaFeatureConfig config, ) { return net.minecraft.world.gen.feature.UnderwaterMagmaFeatureConfig.method_33774(config.wrapperContained); }

}