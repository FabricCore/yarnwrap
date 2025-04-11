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
public LargeDripstoneFeatureConfig(int floorToCeilingSearchRange,yarnwrap.util.math.intprovider.IntProvider columnRadius,yarnwrap.util.math.floatprovider.FloatProvider heightScale,float maxColumnRadiusToCaveHeightRatio,yarnwrap.util.math.floatprovider.FloatProvider stalactiteBluntness,yarnwrap.util.math.floatprovider.FloatProvider stalagmiteBluntness,yarnwrap.util.math.floatprovider.FloatProvider windSpeed,int minRadiusForWind,float minBluntnessForWind) { this.wrapperContained = new net.minecraft.world.gen.feature.LargeDripstoneFeatureConfig(floorToCeilingSearchRange,columnRadius.wrapperContained,heightScale.wrapperContained,maxColumnRadiusToCaveHeightRatio,stalactiteBluntness.wrapperContained,stalagmiteBluntness.wrapperContained,windSpeed.wrapperContained,minRadiusForWind,minBluntnessForWind); }
// public com.mojang.datafixers.kinds.App method_33052(Object instance) { return wrapperContained.method_33052(instance); }
// public java.lang.Float method_33053(yarnwrap.world.gen.feature.LargeDripstoneFeatureConfig config) { return wrapperContained.method_33053(config.wrapperContained); }
// public java.lang.Integer method_33054(yarnwrap.world.gen.feature.LargeDripstoneFeatureConfig config) { return wrapperContained.method_33054(config.wrapperContained); }
// public yarnwrap.util.math.floatprovider.FloatProvider method_33055(yarnwrap.world.gen.feature.LargeDripstoneFeatureConfig config) { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.method_33055(config.wrapperContained)); }
// public yarnwrap.util.math.floatprovider.FloatProvider method_33056(yarnwrap.world.gen.feature.LargeDripstoneFeatureConfig config) { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.method_33056(config.wrapperContained)); }
// public yarnwrap.util.math.floatprovider.FloatProvider method_33057(yarnwrap.world.gen.feature.LargeDripstoneFeatureConfig config) { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.method_33057(config.wrapperContained)); }
// public java.lang.Float method_33058(yarnwrap.world.gen.feature.LargeDripstoneFeatureConfig config) { return wrapperContained.method_33058(config.wrapperContained); }
// public yarnwrap.util.math.floatprovider.FloatProvider method_33059(yarnwrap.world.gen.feature.LargeDripstoneFeatureConfig config) { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.method_33059(config.wrapperContained)); }
// public yarnwrap.util.math.intprovider.IntProvider method_33060(yarnwrap.world.gen.feature.LargeDripstoneFeatureConfig config) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_33060(config.wrapperContained)); }
// public java.lang.Integer method_33061(yarnwrap.world.gen.feature.LargeDripstoneFeatureConfig config) { return wrapperContained.method_33061(config.wrapperContained); }

}