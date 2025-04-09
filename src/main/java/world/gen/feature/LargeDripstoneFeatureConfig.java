package yarnwrap.world.gen.feature;
public class LargeDripstoneFeatureConfig { public net.minecraft.world.gen.feature.LargeDripstoneFeatureConfig wrapperContained; public LargeDripstoneFeatureConfig(net.minecraft.world.gen.feature.LargeDripstoneFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public int floorToCeilingSearchRange() { return wrapperContained.floorToCeilingSearchRange; }
public yarnwrap.util.math.intprovider.IntProvider columnRadius() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.columnRadius); }
public yarnwrap.util.math.floatprovider.FloatProvider heightScale() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.heightScale); }
public float maxColumnRadiusToCaveHeightRatio() { return wrapperContained.maxColumnRadiusToCaveHeightRatio; }
public yarnwrap.util.math.floatprovider.FloatProvider stalactiteBluntness() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.stalactiteBluntness); }
public yarnwrap.util.math.floatprovider.FloatProvider stalagmiteBluntness() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.stalagmiteBluntness); }
public yarnwrap.util.math.floatprovider.FloatProvider windSpeed() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.windSpeed); }
public int minRadiusForWind() { return wrapperContained.minRadiusForWind; }
public float minBluntnessForWind() { return wrapperContained.minBluntnessForWind; }

}