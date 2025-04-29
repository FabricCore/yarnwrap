package yarnwrap.util.math.noise;
public class DoublePerlinNoiseSampler { public net.minecraft.util.math.noise.DoublePerlinNoiseSampler wrapperContained; public DoublePerlinNoiseSampler(net.minecraft.util.math.noise.DoublePerlinNoiseSampler wrapperContained) { this.wrapperContained = wrapperContained; }

// public double amplitude() { return wrapperContained.amplitude; }
// public void amplitude(double value) { wrapperContained.amplitude = value; }
// public static double amplitude() { return net.minecraft.util.math.noise.DoublePerlinNoiseSampler.amplitude; }
// public static void amplitude(double value, ) { net.minecraft.util.math.noise.DoublePerlinNoiseSampler.amplitude = value; }

// public yarnwrap.util.math.noise.OctavePerlinNoiseSampler firstSampler() { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.firstSampler); }
// public void firstSampler(yarnwrap.util.math.noise.OctavePerlinNoiseSampler value) { wrapperContained.firstSampler = value.wrapperContained; }
// public static yarnwrap.util.math.noise.OctavePerlinNoiseSampler firstSampler() { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(net.minecraft.util.math.noise.DoublePerlinNoiseSampler.firstSampler); }
// public static void firstSampler(yarnwrap.util.math.noise.OctavePerlinNoiseSampler value, ) { net.minecraft.util.math.noise.DoublePerlinNoiseSampler.firstSampler = value.wrapperContained; }

// public yarnwrap.util.math.noise.OctavePerlinNoiseSampler secondSampler() { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.secondSampler); }
// public void secondSampler(yarnwrap.util.math.noise.OctavePerlinNoiseSampler value) { wrapperContained.secondSampler = value.wrapperContained; }
// public static yarnwrap.util.math.noise.OctavePerlinNoiseSampler secondSampler() { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(net.minecraft.util.math.noise.DoublePerlinNoiseSampler.secondSampler); }
// public static void secondSampler(yarnwrap.util.math.noise.OctavePerlinNoiseSampler value, ) { net.minecraft.util.math.noise.DoublePerlinNoiseSampler.secondSampler = value.wrapperContained; }

// public double DOMAIN_SCALE() { return wrapperContained.DOMAIN_SCALE; }
// public void DOMAIN_SCALE(double value) { wrapperContained.DOMAIN_SCALE = value; }
// public static double DOMAIN_SCALE() { return net.minecraft.util.math.noise.DoublePerlinNoiseSampler.DOMAIN_SCALE; }
// public static void DOMAIN_SCALE(double value, ) { net.minecraft.util.math.noise.DoublePerlinNoiseSampler.DOMAIN_SCALE = value; }

// public double maxValue() { return wrapperContained.maxValue; }
// public void maxValue(double value) { wrapperContained.maxValue = value; }
// public static double maxValue() { return net.minecraft.util.math.noise.DoublePerlinNoiseSampler.maxValue; }
// public static void maxValue(double value, ) { net.minecraft.util.math.noise.DoublePerlinNoiseSampler.maxValue = value; }

// public Object parameters() { return wrapperContained.parameters; }
// // public void parameters(Object value) { wrapperContained.parameters = value; }
// // public static Object parameters() { return net.minecraft.util.math.noise.DoublePerlinNoiseSampler.parameters; }
// // public static void parameters(Object value, ) { net.minecraft.util.math.noise.DoublePerlinNoiseSampler.parameters = value; }

// public DoublePerlinNoiseSampler(yarnwrap.util.math.random.Random random,Object parameters,boolean modern) { this.wrapperContained = new net.minecraft.util.math.noise.DoublePerlinNoiseSampler(random.wrapperContained,parameters,modern); }
public double sample(double x,double y,double z) { return wrapperContained.sample(x,y,z); }
// public static double sample(double x,double y,double z, ) { return net.minecraft.util.math.noise.DoublePerlinNoiseSampler.sample(x,y,z); }
// public double createAmplitude(int octaves) { return wrapperContained.createAmplitude(octaves); }
// public static double createAmplitude(int octaves, ) { return net.minecraft.util.math.noise.DoublePerlinNoiseSampler.createAmplitude(octaves); }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,int offset,double octaves) { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.create(random.wrapperContained,offset,octaves)); }
// public static yarnwrap.util.math.noise.DoublePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,int offset,double octaves, ) { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(net.minecraft.util.math.noise.DoublePerlinNoiseSampler.create(random.wrapperContained,offset,octaves)); }
public Object copy() { return wrapperContained.copy(); }
// public static Object copy() { return net.minecraft.util.math.noise.DoublePerlinNoiseSampler.copy(); }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,Object parameters) { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.create(random.wrapperContained,parameters)); }
// public static yarnwrap.util.math.noise.DoublePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,Object parameters, ) { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(net.minecraft.util.math.noise.DoublePerlinNoiseSampler.create(random.wrapperContained,parameters)); }
public void addDebugInfo(java.lang.StringBuilder info) { wrapperContained.addDebugInfo(info); }
// public static void addDebugInfo(java.lang.StringBuilder info, ) { net.minecraft.util.math.noise.DoublePerlinNoiseSampler.addDebugInfo(info); }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler createLegacy(yarnwrap.util.math.random.Random random,Object parameters) { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.createLegacy(random.wrapperContained,parameters)); }
// public static yarnwrap.util.math.noise.DoublePerlinNoiseSampler createLegacy(yarnwrap.util.math.random.Random random,Object parameters, ) { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(net.minecraft.util.math.noise.DoublePerlinNoiseSampler.createLegacy(random.wrapperContained,parameters)); }
public double getMaxValue() { return wrapperContained.getMaxValue(); }
// public static double getMaxValue() { return net.minecraft.util.math.noise.DoublePerlinNoiseSampler.getMaxValue(); }

}