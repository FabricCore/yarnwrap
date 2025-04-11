package yarnwrap.util.math.noise;
public class DoublePerlinNoiseSampler { public net.minecraft.util.math.noise.DoublePerlinNoiseSampler wrapperContained; public DoublePerlinNoiseSampler(net.minecraft.util.math.noise.DoublePerlinNoiseSampler wrapperContained) { this.wrapperContained = wrapperContained; }

// public double amplitude() { return wrapperContained.amplitude; }
// public void amplitude(double value) { wrapperContained.amplitude = value; }
// public yarnwrap.util.math.noise.OctavePerlinNoiseSampler firstSampler() { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.firstSampler); }
// public void firstSampler(yarnwrap.util.math.noise.OctavePerlinNoiseSampler value) { wrapperContained.firstSampler = value.wrapperContained; }
// public yarnwrap.util.math.noise.OctavePerlinNoiseSampler secondSampler() { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.secondSampler); }
// public void secondSampler(yarnwrap.util.math.noise.OctavePerlinNoiseSampler value) { wrapperContained.secondSampler = value.wrapperContained; }
// public double DOMAIN_SCALE() { return wrapperContained.DOMAIN_SCALE; }
// public void DOMAIN_SCALE(double value) { wrapperContained.DOMAIN_SCALE = value; }
// public double maxValue() { return wrapperContained.maxValue; }
// public void maxValue(double value) { wrapperContained.maxValue = value; }
// public Object parameters() { return wrapperContained.parameters; }
// // public void parameters(Object value) { wrapperContained.parameters = value; }
// public DoublePerlinNoiseSampler(yarnwrap.util.math.random.Random random,Object parameters,boolean modern) { this.wrapperContained = new net.minecraft.util.math.noise.DoublePerlinNoiseSampler(random.wrapperContained,parameters,modern); }
public double sample(double x,double y,double z) { return wrapperContained.sample(x,y,z); }
// public double createAmplitude(int octaves) { return wrapperContained.createAmplitude(octaves); }
public yarnwrap.util.math.noise.DoublePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,int offset,double octaves) { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.create(random.wrapperContained,offset,octaves)); }
public Object copy() { return wrapperContained.copy(); }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,Object parameters) { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.create(random.wrapperContained,parameters)); }
public void addDebugInfo(java.lang.StringBuilder info) { wrapperContained.addDebugInfo(info); }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler createLegacy(yarnwrap.util.math.random.Random random,Object parameters) { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.createLegacy(random.wrapperContained,parameters)); }
public double getMaxValue() { return wrapperContained.getMaxValue(); }

}