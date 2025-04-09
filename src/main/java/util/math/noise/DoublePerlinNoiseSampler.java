package yarnwrap.util.math.noise;
public class DoublePerlinNoiseSampler { public net.minecraft.util.math.noise.DoublePerlinNoiseSampler wrapperContained; public DoublePerlinNoiseSampler(net.minecraft.util.math.noise.DoublePerlinNoiseSampler wrapperContained) { this.wrapperContained = wrapperContained; }

// public double amplitude() { return wrapperContained.amplitude; }
// public yarnwrap.util.math.noise.OctavePerlinNoiseSampler firstSampler() { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.firstSampler); }
// public yarnwrap.util.math.noise.OctavePerlinNoiseSampler secondSampler() { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.secondSampler); }
// public double DOMAIN_SCALE() { return wrapperContained.DOMAIN_SCALE; }
// public double maxValue() { return wrapperContained.maxValue; }
// public Object parameters() { return wrapperContained.parameters; }
public double sample(double x,double y,double z) { return wrapperContained.sample(x,y,z); }
// public double createAmplitude(int octaves) { return wrapperContained.createAmplitude(octaves); }
public yarnwrap.util.math.noise.DoublePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,int offset,double octaves) { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.create(random.wrapperContained,offset,octaves)); }
public Object copy() { return wrapperContained.copy(); }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,Object parameters) { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.create(random.wrapperContained,parameters)); }
public void addDebugInfo(java.lang.StringBuilder info) { wrapperContained.addDebugInfo(info); }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler createLegacy(yarnwrap.util.math.random.Random random,Object parameters) { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.createLegacy(random.wrapperContained,parameters)); }
public double getMaxValue() { return wrapperContained.getMaxValue(); }

}