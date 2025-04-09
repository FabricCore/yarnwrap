package yarnwrap.world.biome.source.util;
public class MultiNoiseUtil { public net.minecraft.world.biome.source.util.MultiNoiseUtil wrapperContained; public MultiNoiseUtil(net.minecraft.world.biome.source.util.MultiNoiseUtil wrapperContained) { this.wrapperContained = wrapperContained; }

// public int HYPERCUBE_DIMENSION() { return wrapperContained.HYPERCUBE_DIMENSION; }
// public float TO_LONG_FACTOR() { return wrapperContained.TO_LONG_FACTOR; }
public Object createNoiseValuePoint(float temperatureNoise,float humidityNoise,float continentalnessNoise,float erosionNoise,float depth,float weirdnessNoise) { return wrapperContained.createNoiseValuePoint(temperatureNoise,humidityNoise,continentalnessNoise,erosionNoise,depth,weirdnessNoise); }
public Object createNoiseHypercube(float temperature,float humidity,float continentalness,float erosion,float depth,float weirdness,float offset) { return wrapperContained.createNoiseHypercube(temperature,humidity,continentalness,erosion,depth,weirdness,offset); }
// public Object createNoiseHypercube(Object temperature,Object humidity,Object continentalness,Object erosion,Object depth,Object weirdness,float offset) { return wrapperContained.createNoiseHypercube(temperature,humidity,continentalness,erosion,depth,weirdness,offset); }
public long toLong(float value) { return wrapperContained.toLong(value); }
public float toFloat(long value) { return wrapperContained.toFloat(value); }
// public yarnwrap.util.math.BlockPos findFittestPosition(java.util.List noises,Object sampler) { return new yarnwrap.util.math.BlockPos(wrapperContained.findFittestPosition(noises,sampler)); }
public Object createEmptyMultiNoiseSampler() { return wrapperContained.createEmptyMultiNoiseSampler(); }

}