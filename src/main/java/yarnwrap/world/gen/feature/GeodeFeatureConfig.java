package yarnwrap.world.gen.feature;
public class GeodeFeatureConfig { public net.minecraft.world.gen.feature.GeodeFeatureConfig wrapperContained; public GeodeFeatureConfig(net.minecraft.world.gen.feature.GeodeFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec RANGE() { return wrapperContained.RANGE; }
// public void RANGE(com.mojang.serialization.Codec value) { wrapperContained.RANGE = value; }
public static com.mojang.serialization.Codec RANGE() { return net.minecraft.world.gen.feature.GeodeFeatureConfig.RANGE; }
// public static void RANGE(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.GeodeFeatureConfig.RANGE = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.GeodeFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.GeodeFeatureConfig.CODEC = value; }

public yarnwrap.world.gen.feature.GeodeLayerConfig layerConfig() { return new yarnwrap.world.gen.feature.GeodeLayerConfig(wrapperContained.layerConfig); }
// public void layerConfig(yarnwrap.world.gen.feature.GeodeLayerConfig value) { wrapperContained.layerConfig = value.wrapperContained; }
// public static yarnwrap.world.gen.feature.GeodeLayerConfig layerConfig() { return new yarnwrap.world.gen.feature.GeodeLayerConfig(net.minecraft.world.gen.feature.GeodeFeatureConfig.layerConfig); }
// public static void layerConfig(yarnwrap.world.gen.feature.GeodeLayerConfig value, ) { net.minecraft.world.gen.feature.GeodeFeatureConfig.layerConfig = value.wrapperContained; }

public yarnwrap.world.gen.feature.GeodeLayerThicknessConfig layerThicknessConfig() { return new yarnwrap.world.gen.feature.GeodeLayerThicknessConfig(wrapperContained.layerThicknessConfig); }
// public void layerThicknessConfig(yarnwrap.world.gen.feature.GeodeLayerThicknessConfig value) { wrapperContained.layerThicknessConfig = value.wrapperContained; }
// public static yarnwrap.world.gen.feature.GeodeLayerThicknessConfig layerThicknessConfig() { return new yarnwrap.world.gen.feature.GeodeLayerThicknessConfig(net.minecraft.world.gen.feature.GeodeFeatureConfig.layerThicknessConfig); }
// public static void layerThicknessConfig(yarnwrap.world.gen.feature.GeodeLayerThicknessConfig value, ) { net.minecraft.world.gen.feature.GeodeFeatureConfig.layerThicknessConfig = value.wrapperContained; }

public yarnwrap.world.gen.feature.GeodeCrackConfig crackConfig() { return new yarnwrap.world.gen.feature.GeodeCrackConfig(wrapperContained.crackConfig); }
// public void crackConfig(yarnwrap.world.gen.feature.GeodeCrackConfig value) { wrapperContained.crackConfig = value.wrapperContained; }
// public static yarnwrap.world.gen.feature.GeodeCrackConfig crackConfig() { return new yarnwrap.world.gen.feature.GeodeCrackConfig(net.minecraft.world.gen.feature.GeodeFeatureConfig.crackConfig); }
// public static void crackConfig(yarnwrap.world.gen.feature.GeodeCrackConfig value, ) { net.minecraft.world.gen.feature.GeodeFeatureConfig.crackConfig = value.wrapperContained; }

public double usePotentialPlacementsChance() { return wrapperContained.usePotentialPlacementsChance; }
// public void usePotentialPlacementsChance(double value) { wrapperContained.usePotentialPlacementsChance = value; }
// public static double usePotentialPlacementsChance() { return net.minecraft.world.gen.feature.GeodeFeatureConfig.usePotentialPlacementsChance; }
// public static void usePotentialPlacementsChance(double value, ) { net.minecraft.world.gen.feature.GeodeFeatureConfig.usePotentialPlacementsChance = value; }

public double useAlternateLayer0Chance() { return wrapperContained.useAlternateLayer0Chance; }
// public void useAlternateLayer0Chance(double value) { wrapperContained.useAlternateLayer0Chance = value; }
// public static double useAlternateLayer0Chance() { return net.minecraft.world.gen.feature.GeodeFeatureConfig.useAlternateLayer0Chance; }
// public static void useAlternateLayer0Chance(double value, ) { net.minecraft.world.gen.feature.GeodeFeatureConfig.useAlternateLayer0Chance = value; }

public boolean placementsRequireLayer0Alternate() { return wrapperContained.placementsRequireLayer0Alternate; }
// public void placementsRequireLayer0Alternate(boolean value) { wrapperContained.placementsRequireLayer0Alternate = value; }
// public static boolean placementsRequireLayer0Alternate() { return net.minecraft.world.gen.feature.GeodeFeatureConfig.placementsRequireLayer0Alternate; }
// public static void placementsRequireLayer0Alternate(boolean value, ) { net.minecraft.world.gen.feature.GeodeFeatureConfig.placementsRequireLayer0Alternate = value; }

public int minGenOffset() { return wrapperContained.minGenOffset; }
// public void minGenOffset(int value) { wrapperContained.minGenOffset = value; }
// public static int minGenOffset() { return net.minecraft.world.gen.feature.GeodeFeatureConfig.minGenOffset; }
// public static void minGenOffset(int value, ) { net.minecraft.world.gen.feature.GeodeFeatureConfig.minGenOffset = value; }

public int maxGenOffset() { return wrapperContained.maxGenOffset; }
// public void maxGenOffset(int value) { wrapperContained.maxGenOffset = value; }
// public static int maxGenOffset() { return net.minecraft.world.gen.feature.GeodeFeatureConfig.maxGenOffset; }
// public static void maxGenOffset(int value, ) { net.minecraft.world.gen.feature.GeodeFeatureConfig.maxGenOffset = value; }

public double noiseMultiplier() { return wrapperContained.noiseMultiplier; }
// public void noiseMultiplier(double value) { wrapperContained.noiseMultiplier = value; }
// public static double noiseMultiplier() { return net.minecraft.world.gen.feature.GeodeFeatureConfig.noiseMultiplier; }
// public static void noiseMultiplier(double value, ) { net.minecraft.world.gen.feature.GeodeFeatureConfig.noiseMultiplier = value; }

public int invalidBlocksThreshold() { return wrapperContained.invalidBlocksThreshold; }
// public void invalidBlocksThreshold(int value) { wrapperContained.invalidBlocksThreshold = value; }
// public static int invalidBlocksThreshold() { return net.minecraft.world.gen.feature.GeodeFeatureConfig.invalidBlocksThreshold; }
// public static void invalidBlocksThreshold(int value, ) { net.minecraft.world.gen.feature.GeodeFeatureConfig.invalidBlocksThreshold = value; }

public yarnwrap.util.math.intprovider.IntProvider outerWallDistance() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.outerWallDistance); }
// public void outerWallDistance(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.outerWallDistance = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider outerWallDistance() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.GeodeFeatureConfig.outerWallDistance); }
// public static void outerWallDistance(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.world.gen.feature.GeodeFeatureConfig.outerWallDistance = value.wrapperContained; }

public yarnwrap.util.math.intprovider.IntProvider distributionPoints() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.distributionPoints); }
// public void distributionPoints(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.distributionPoints = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider distributionPoints() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.GeodeFeatureConfig.distributionPoints); }
// public static void distributionPoints(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.world.gen.feature.GeodeFeatureConfig.distributionPoints = value.wrapperContained; }

public yarnwrap.util.math.intprovider.IntProvider pointOffset() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.pointOffset); }
// public void pointOffset(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.pointOffset = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider pointOffset() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.GeodeFeatureConfig.pointOffset); }
// public static void pointOffset(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.world.gen.feature.GeodeFeatureConfig.pointOffset = value.wrapperContained; }

public GeodeFeatureConfig(yarnwrap.world.gen.feature.GeodeLayerConfig layerConfig,yarnwrap.world.gen.feature.GeodeLayerThicknessConfig layerThicknessConfig,yarnwrap.world.gen.feature.GeodeCrackConfig crackConfig,double usePotentialPlacementsChance,double useAlternateLayer0Chance,boolean placementsRequireLayer0Alternate,yarnwrap.util.math.intprovider.IntProvider outerWallDistance,yarnwrap.util.math.intprovider.IntProvider distributionPoints,yarnwrap.util.math.intprovider.IntProvider pointOffset,int maxDistributionPoints,int minPointOffset,double noiseMultiplier,int maxGenOffset) { this.wrapperContained = new net.minecraft.world.gen.feature.GeodeFeatureConfig(layerConfig.wrapperContained,layerThicknessConfig.wrapperContained,crackConfig.wrapperContained,usePotentialPlacementsChance,useAlternateLayer0Chance,placementsRequireLayer0Alternate,outerWallDistance.wrapperContained,distributionPoints.wrapperContained,pointOffset.wrapperContained,maxDistributionPoints,minPointOffset,noiseMultiplier,maxGenOffset); }
// public java.lang.Integer method_31906(yarnwrap.world.gen.feature.GeodeFeatureConfig config) { return wrapperContained.method_31906(config.wrapperContained); }
// public static java.lang.Integer method_31906(yarnwrap.world.gen.feature.GeodeFeatureConfig config, ) { return net.minecraft.world.gen.feature.GeodeFeatureConfig.method_31906(config.wrapperContained); }
// public java.lang.Integer method_31908(yarnwrap.world.gen.feature.GeodeFeatureConfig config) { return wrapperContained.method_31908(config.wrapperContained); }
// public static java.lang.Integer method_31908(yarnwrap.world.gen.feature.GeodeFeatureConfig config, ) { return net.minecraft.world.gen.feature.GeodeFeatureConfig.method_31908(config.wrapperContained); }
// public java.lang.Integer method_31909(yarnwrap.world.gen.feature.GeodeFeatureConfig config) { return wrapperContained.method_31909(config.wrapperContained); }
// public static java.lang.Integer method_31909(yarnwrap.world.gen.feature.GeodeFeatureConfig config, ) { return net.minecraft.world.gen.feature.GeodeFeatureConfig.method_31909(config.wrapperContained); }
// public java.lang.Boolean method_31913(yarnwrap.world.gen.feature.GeodeFeatureConfig config) { return wrapperContained.method_31913(config.wrapperContained); }
// public static java.lang.Boolean method_31913(yarnwrap.world.gen.feature.GeodeFeatureConfig config, ) { return net.minecraft.world.gen.feature.GeodeFeatureConfig.method_31913(config.wrapperContained); }
// public java.lang.Double method_31914(yarnwrap.world.gen.feature.GeodeFeatureConfig config) { return wrapperContained.method_31914(config.wrapperContained); }
// public static java.lang.Double method_31914(yarnwrap.world.gen.feature.GeodeFeatureConfig config, ) { return net.minecraft.world.gen.feature.GeodeFeatureConfig.method_31914(config.wrapperContained); }
// public java.lang.Double method_31915(yarnwrap.world.gen.feature.GeodeFeatureConfig config) { return wrapperContained.method_31915(config.wrapperContained); }
// public static java.lang.Double method_31915(yarnwrap.world.gen.feature.GeodeFeatureConfig config, ) { return net.minecraft.world.gen.feature.GeodeFeatureConfig.method_31915(config.wrapperContained); }
// public yarnwrap.world.gen.feature.GeodeCrackConfig method_31916(yarnwrap.world.gen.feature.GeodeFeatureConfig config) { return new yarnwrap.world.gen.feature.GeodeCrackConfig(wrapperContained.method_31916(config.wrapperContained)); }
// public static yarnwrap.world.gen.feature.GeodeCrackConfig method_31916(yarnwrap.world.gen.feature.GeodeFeatureConfig config, ) { return new yarnwrap.world.gen.feature.GeodeCrackConfig(net.minecraft.world.gen.feature.GeodeFeatureConfig.method_31916(config.wrapperContained)); }
// public yarnwrap.world.gen.feature.GeodeLayerThicknessConfig method_31917(yarnwrap.world.gen.feature.GeodeFeatureConfig config) { return new yarnwrap.world.gen.feature.GeodeLayerThicknessConfig(wrapperContained.method_31917(config.wrapperContained)); }
// public static yarnwrap.world.gen.feature.GeodeLayerThicknessConfig method_31917(yarnwrap.world.gen.feature.GeodeFeatureConfig config, ) { return new yarnwrap.world.gen.feature.GeodeLayerThicknessConfig(net.minecraft.world.gen.feature.GeodeFeatureConfig.method_31917(config.wrapperContained)); }
// public yarnwrap.world.gen.feature.GeodeLayerConfig method_31918(yarnwrap.world.gen.feature.GeodeFeatureConfig config) { return new yarnwrap.world.gen.feature.GeodeLayerConfig(wrapperContained.method_31918(config.wrapperContained)); }
// public static yarnwrap.world.gen.feature.GeodeLayerConfig method_31918(yarnwrap.world.gen.feature.GeodeFeatureConfig config, ) { return new yarnwrap.world.gen.feature.GeodeLayerConfig(net.minecraft.world.gen.feature.GeodeFeatureConfig.method_31918(config.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_36299(Object instance) { return wrapperContained.method_36299(instance); }
// public static com.mojang.datafixers.kinds.App method_36299(Object instance, ) { return net.minecraft.world.gen.feature.GeodeFeatureConfig.method_36299(instance); }
// public java.lang.Double method_36300(yarnwrap.world.gen.feature.GeodeFeatureConfig config) { return wrapperContained.method_36300(config.wrapperContained); }
// public static java.lang.Double method_36300(yarnwrap.world.gen.feature.GeodeFeatureConfig config, ) { return net.minecraft.world.gen.feature.GeodeFeatureConfig.method_36300(config.wrapperContained); }
// public yarnwrap.util.math.intprovider.IntProvider method_36301(yarnwrap.world.gen.feature.GeodeFeatureConfig config) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_36301(config.wrapperContained)); }
// public static yarnwrap.util.math.intprovider.IntProvider method_36301(yarnwrap.world.gen.feature.GeodeFeatureConfig config, ) { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.GeodeFeatureConfig.method_36301(config.wrapperContained)); }
// public yarnwrap.util.math.intprovider.IntProvider method_36302(yarnwrap.world.gen.feature.GeodeFeatureConfig config) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_36302(config.wrapperContained)); }
// public static yarnwrap.util.math.intprovider.IntProvider method_36302(yarnwrap.world.gen.feature.GeodeFeatureConfig config, ) { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.GeodeFeatureConfig.method_36302(config.wrapperContained)); }
// public yarnwrap.util.math.intprovider.IntProvider method_36303(yarnwrap.world.gen.feature.GeodeFeatureConfig config) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_36303(config.wrapperContained)); }
// public static yarnwrap.util.math.intprovider.IntProvider method_36303(yarnwrap.world.gen.feature.GeodeFeatureConfig config, ) { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.GeodeFeatureConfig.method_36303(config.wrapperContained)); }

}