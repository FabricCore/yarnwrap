package yarnwrap.util.math.noise;
public class InterpolatedNoiseSampler { public net.minecraft.util.math.noise.InterpolatedNoiseSampler wrapperContained; public InterpolatedNoiseSampler(net.minecraft.util.math.noise.InterpolatedNoiseSampler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.noise.OctavePerlinNoiseSampler lowerInterpolatedNoise() { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.lowerInterpolatedNoise); }
// public yarnwrap.util.math.noise.OctavePerlinNoiseSampler upperInterpolatedNoise() { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.upperInterpolatedNoise); }
// public yarnwrap.util.math.noise.OctavePerlinNoiseSampler interpolationNoise() { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.interpolationNoise); }
// public double xzScale() { return wrapperContained.xzScale; }
// public double yScale() { return wrapperContained.yScale; }
// public double maxValue() { return wrapperContained.maxValue; }
public yarnwrap.util.dynamic.CodecHolder CODEC() { return new yarnwrap.util.dynamic.CodecHolder(wrapperContained.CODEC); }
// public com.mojang.serialization.Codec SCALE_AND_FACTOR_RANGE() { return wrapperContained.SCALE_AND_FACTOR_RANGE; }
// public com.mojang.serialization.MapCodec MAP_CODEC() { return wrapperContained.MAP_CODEC; }
// public double scaledXzScale() { return wrapperContained.scaledXzScale; }
// public double scaledYScale() { return wrapperContained.scaledYScale; }
// public double xzFactor() { return wrapperContained.xzFactor; }
// public double yFactor() { return wrapperContained.yFactor; }
// public double smearScaleMultiplier() { return wrapperContained.smearScaleMultiplier; }
public void addDebugInfo(java.lang.StringBuilder info) { wrapperContained.addDebugInfo(info); }
public yarnwrap.util.math.noise.InterpolatedNoiseSampler createBase3dNoiseFunction(double xzScale,double yScale,double xzFactor,double yFactor,double smearScaleMultiplier) { return new yarnwrap.util.math.noise.InterpolatedNoiseSampler(wrapperContained.createBase3dNoiseFunction(xzScale,yScale,xzFactor,yFactor,smearScaleMultiplier)); }
public yarnwrap.util.math.noise.InterpolatedNoiseSampler copyWithRandom(yarnwrap.util.math.random.Random random) { return new yarnwrap.util.math.noise.InterpolatedNoiseSampler(wrapperContained.copyWithRandom(random.wrapperContained)); }

}