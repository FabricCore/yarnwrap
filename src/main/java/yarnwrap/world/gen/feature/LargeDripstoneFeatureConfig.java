package yarnwrap.world.gen.feature;
public class LargeDripstoneFeatureConfig { public net.minecraft.world.gen.feature.LargeDripstoneFeatureConfig wrapperContained; public LargeDripstoneFeatureConfig(net.minecraft.world.gen.feature.LargeDripstoneFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public int floorToCeilingSearchRange() { return wrapperContained.floorToCeilingSearchRange; }
// public void floorToCeilingSearchRange(int value) { wrapperContained.floorToCeilingSearchRange = value; }
public yarnwrap.util.math.intprovider.IntProvider columnRadius() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.columnRadius); }
// public void columnRadius(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.columnRadius = value.wrapperContained; }
public yarnwrap.util.math.floatprovider.FloatProvider heightScale() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.heightScale); }
// public void heightScale(yarnwrap.util.math.floatprovider.FloatProvider value) { wrapperContained.heightScale = value.wrapperContained; }
public float maxColumnRadiusToCaveHeightRatio() { return wrapperContained.maxColumnRadiusToCaveHeightRatio; }
// public void maxColumnRadiusToCaveHeightRatio(float value) { wrapperContained.maxColumnRadiusToCaveHeightRatio = value; }
public yarnwrap.util.math.floatprovider.FloatProvider stalactiteBluntness() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.stalactiteBluntness); }
// public void stalactiteBluntness(yarnwrap.util.math.floatprovider.FloatProvider value) { wrapperContained.stalactiteBluntness = value.wrapperContained; }
public yarnwrap.util.math.floatprovider.FloatProvider stalagmiteBluntness() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.stalagmiteBluntness); }
// public void stalagmiteBluntness(yarnwrap.util.math.floatprovider.FloatProvider value) { wrapperContained.stalagmiteBluntness = value.wrapperContained; }
public yarnwrap.util.math.floatprovider.FloatProvider windSpeed() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.windSpeed); }
// public void windSpeed(yarnwrap.util.math.floatprovider.FloatProvider value) { wrapperContained.windSpeed = value.wrapperContained; }
public int minRadiusForWind() { return wrapperContained.minRadiusForWind; }
// public void minRadiusForWind(int value) { wrapperContained.minRadiusForWind = value; }
public float minBluntnessForWind() { return wrapperContained.minBluntnessForWind; }
// public void minBluntnessForWind(float value) { wrapperContained.minBluntnessForWind = value; }

}