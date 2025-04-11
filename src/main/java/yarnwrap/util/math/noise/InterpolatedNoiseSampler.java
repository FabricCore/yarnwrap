package yarnwrap.util.math.noise;
public class InterpolatedNoiseSampler { public net.minecraft.util.math.noise.InterpolatedNoiseSampler wrapperContained; public InterpolatedNoiseSampler(net.minecraft.util.math.noise.InterpolatedNoiseSampler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.noise.OctavePerlinNoiseSampler lowerInterpolatedNoise() { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.lowerInterpolatedNoise); }
// public void lowerInterpolatedNoise(yarnwrap.util.math.noise.OctavePerlinNoiseSampler value) { wrapperContained.lowerInterpolatedNoise = value.wrapperContained; }
// public yarnwrap.util.math.noise.OctavePerlinNoiseSampler upperInterpolatedNoise() { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.upperInterpolatedNoise); }
// public void upperInterpolatedNoise(yarnwrap.util.math.noise.OctavePerlinNoiseSampler value) { wrapperContained.upperInterpolatedNoise = value.wrapperContained; }
// public yarnwrap.util.math.noise.OctavePerlinNoiseSampler interpolationNoise() { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.interpolationNoise); }
// public void interpolationNoise(yarnwrap.util.math.noise.OctavePerlinNoiseSampler value) { wrapperContained.interpolationNoise = value.wrapperContained; }
// public double xzScale() { return wrapperContained.xzScale; }
// public void xzScale(double value) { wrapperContained.xzScale = value; }
// public double yScale() { return wrapperContained.yScale; }
// public void yScale(double value) { wrapperContained.yScale = value; }
// public double maxValue() { return wrapperContained.maxValue; }
// public void maxValue(double value) { wrapperContained.maxValue = value; }
public yarnwrap.util.dynamic.CodecHolder CODEC() { return new yarnwrap.util.dynamic.CodecHolder(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.util.dynamic.CodecHolder value) { wrapperContained.CODEC = value.wrapperContained; }
// public com.mojang.serialization.Codec SCALE_AND_FACTOR_RANGE() { return wrapperContained.SCALE_AND_FACTOR_RANGE; }
// public void SCALE_AND_FACTOR_RANGE(com.mojang.serialization.Codec value) { wrapperContained.SCALE_AND_FACTOR_RANGE = value; }
// public com.mojang.serialization.MapCodec MAP_CODEC() { return wrapperContained.MAP_CODEC; }
// public void MAP_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MAP_CODEC = value; }
// public double scaledXzScale() { return wrapperContained.scaledXzScale; }
// public void scaledXzScale(double value) { wrapperContained.scaledXzScale = value; }
// public double scaledYScale() { return wrapperContained.scaledYScale; }
// public void scaledYScale(double value) { wrapperContained.scaledYScale = value; }
// public double xzFactor() { return wrapperContained.xzFactor; }
// public void xzFactor(double value) { wrapperContained.xzFactor = value; }
// public double yFactor() { return wrapperContained.yFactor; }
// public void yFactor(double value) { wrapperContained.yFactor = value; }
// public double smearScaleMultiplier() { return wrapperContained.smearScaleMultiplier; }
// public void smearScaleMultiplier(double value) { wrapperContained.smearScaleMultiplier = value; }
public void addDebugInfo(java.lang.StringBuilder info) { wrapperContained.addDebugInfo(info); }
public yarnwrap.util.math.noise.InterpolatedNoiseSampler createBase3dNoiseFunction(double xzScale,double yScale,double xzFactor,double yFactor,double smearScaleMultiplier) { return new yarnwrap.util.math.noise.InterpolatedNoiseSampler(wrapperContained.createBase3dNoiseFunction(xzScale,yScale,xzFactor,yFactor,smearScaleMultiplier)); }
public yarnwrap.util.math.noise.InterpolatedNoiseSampler copyWithRandom(yarnwrap.util.math.random.Random random) { return new yarnwrap.util.math.noise.InterpolatedNoiseSampler(wrapperContained.copyWithRandom(random.wrapperContained)); }

}