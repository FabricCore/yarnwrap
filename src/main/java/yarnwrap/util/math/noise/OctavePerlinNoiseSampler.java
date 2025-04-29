package yarnwrap.util.math.noise;
public class OctavePerlinNoiseSampler { public net.minecraft.util.math.noise.OctavePerlinNoiseSampler wrapperContained; public OctavePerlinNoiseSampler(net.minecraft.util.math.noise.OctavePerlinNoiseSampler wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.math.noise.PerlinNoiseSampler[] octaveSamplers() { return wrapperContained.octaveSamplers; }
// public void octaveSamplers(net.minecraft.util.math.noise.PerlinNoiseSampler[] value) { wrapperContained.octaveSamplers = value; }
// public static net.minecraft.util.math.noise.PerlinNoiseSampler[] octaveSamplers() { return net.minecraft.util.math.noise.OctavePerlinNoiseSampler.octaveSamplers; }
// public static void octaveSamplers(net.minecraft.util.math.noise.PerlinNoiseSampler[] value, ) { net.minecraft.util.math.noise.OctavePerlinNoiseSampler.octaveSamplers = value; }

// public double persistence() { return wrapperContained.persistence; }
// public void persistence(double value) { wrapperContained.persistence = value; }
// public static double persistence() { return net.minecraft.util.math.noise.OctavePerlinNoiseSampler.persistence; }
// public static void persistence(double value, ) { net.minecraft.util.math.noise.OctavePerlinNoiseSampler.persistence = value; }

// public double lacunarity() { return wrapperContained.lacunarity; }
// public void lacunarity(double value) { wrapperContained.lacunarity = value; }
// public static double lacunarity() { return net.minecraft.util.math.noise.OctavePerlinNoiseSampler.lacunarity; }
// public static void lacunarity(double value, ) { net.minecraft.util.math.noise.OctavePerlinNoiseSampler.lacunarity = value; }

// public it.unimi.dsi.fastutil.doubles.DoubleList amplitudes() { return wrapperContained.amplitudes; }
// public void amplitudes(it.unimi.dsi.fastutil.doubles.DoubleList value) { wrapperContained.amplitudes = value; }
// public static it.unimi.dsi.fastutil.doubles.DoubleList amplitudes() { return net.minecraft.util.math.noise.OctavePerlinNoiseSampler.amplitudes; }
// public static void amplitudes(it.unimi.dsi.fastutil.doubles.DoubleList value, ) { net.minecraft.util.math.noise.OctavePerlinNoiseSampler.amplitudes = value; }

// public int firstOctave() { return wrapperContained.firstOctave; }
// public void firstOctave(int value) { wrapperContained.firstOctave = value; }
// public static int firstOctave() { return net.minecraft.util.math.noise.OctavePerlinNoiseSampler.firstOctave; }
// public static void firstOctave(int value, ) { net.minecraft.util.math.noise.OctavePerlinNoiseSampler.firstOctave = value; }

// public double maxValue() { return wrapperContained.maxValue; }
// public void maxValue(double value) { wrapperContained.maxValue = value; }
// public static double maxValue() { return net.minecraft.util.math.noise.OctavePerlinNoiseSampler.maxValue; }
// public static void maxValue(double value, ) { net.minecraft.util.math.noise.OctavePerlinNoiseSampler.maxValue = value; }

// public OctavePerlinNoiseSampler(yarnwrap.util.math.random.Random random,com.mojang.datafixers.util.Pair firstOctaveAndAmplitudes,boolean xoroshiro) { this.wrapperContained = new net.minecraft.util.math.noise.OctavePerlinNoiseSampler(random.wrapperContained,firstOctaveAndAmplitudes,xoroshiro); }
public double sample(double x,double y,double z) { return wrapperContained.sample(x,y,z); }
// public static double sample(double x,double y,double z, ) { return net.minecraft.util.math.noise.OctavePerlinNoiseSampler.sample(x,y,z); }
// public double maintainPrecision(double value) { return wrapperContained.maintainPrecision(value); }
// public static double maintainPrecision(double value, ) { return net.minecraft.util.math.noise.OctavePerlinNoiseSampler.maintainPrecision(value); }
public double sample(double x,double y,double z,double yScale,double yMax,boolean useOrigin) { return wrapperContained.sample(x,y,z,yScale,yMax,useOrigin); }
// public static double sample(double x,double y,double z,double yScale,double yMax,boolean useOrigin, ) { return net.minecraft.util.math.noise.OctavePerlinNoiseSampler.sample(x,y,z,yScale,yMax,useOrigin); }
public yarnwrap.util.math.noise.PerlinNoiseSampler getOctave(int octave) { return new yarnwrap.util.math.noise.PerlinNoiseSampler(wrapperContained.getOctave(octave)); }
// public static yarnwrap.util.math.noise.PerlinNoiseSampler getOctave(int octave, ) { return new yarnwrap.util.math.noise.PerlinNoiseSampler(net.minecraft.util.math.noise.OctavePerlinNoiseSampler.getOctave(octave)); }
// public yarnwrap.util.math.noise.OctavePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,int offset,it.unimi.dsi.fastutil.doubles.DoubleList amplitudes) { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.create(random.wrapperContained,offset,amplitudes)); }
// public static yarnwrap.util.math.noise.OctavePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,int offset,it.unimi.dsi.fastutil.doubles.DoubleList amplitudes, ) { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(net.minecraft.util.math.noise.OctavePerlinNoiseSampler.create(random.wrapperContained,offset,amplitudes)); }
// public com.mojang.datafixers.util.Pair calculateAmplitudes(it.unimi.dsi.fastutil.ints.IntSortedSet octaves) { return wrapperContained.calculateAmplitudes(octaves); }
// public static com.mojang.datafixers.util.Pair calculateAmplitudes(it.unimi.dsi.fastutil.ints.IntSortedSet octaves, ) { return net.minecraft.util.math.noise.OctavePerlinNoiseSampler.calculateAmplitudes(octaves); }
// public void skipCalls(yarnwrap.util.math.random.Random random) { wrapperContained.skipCalls(random.wrapperContained); }
// public static void skipCalls(yarnwrap.util.math.random.Random random, ) { net.minecraft.util.math.noise.OctavePerlinNoiseSampler.skipCalls(random.wrapperContained); }
// public yarnwrap.util.math.noise.OctavePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,int offset,double firstAmplitude,double amplitudes) { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.create(random.wrapperContained,offset,firstAmplitude,amplitudes)); }
// public static yarnwrap.util.math.noise.OctavePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,int offset,double firstAmplitude,double amplitudes, ) { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(net.minecraft.util.math.noise.OctavePerlinNoiseSampler.create(random.wrapperContained,offset,firstAmplitude,amplitudes)); }
// public int getFirstOctave() { return wrapperContained.getFirstOctave(); }
// public static int getFirstOctave() { return net.minecraft.util.math.noise.OctavePerlinNoiseSampler.getFirstOctave(); }
// public it.unimi.dsi.fastutil.doubles.DoubleList getAmplitudes() { return wrapperContained.getAmplitudes(); }
// public static it.unimi.dsi.fastutil.doubles.DoubleList getAmplitudes() { return net.minecraft.util.math.noise.OctavePerlinNoiseSampler.getAmplitudes(); }
// public yarnwrap.util.math.noise.OctavePerlinNoiseSampler createLegacy(yarnwrap.util.math.random.Random random,int offset,it.unimi.dsi.fastutil.doubles.DoubleList amplitudes) { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.createLegacy(random.wrapperContained,offset,amplitudes)); }
// public static yarnwrap.util.math.noise.OctavePerlinNoiseSampler createLegacy(yarnwrap.util.math.random.Random random,int offset,it.unimi.dsi.fastutil.doubles.DoubleList amplitudes, ) { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(net.minecraft.util.math.noise.OctavePerlinNoiseSampler.createLegacy(random.wrapperContained,offset,amplitudes)); }
// public yarnwrap.util.math.noise.OctavePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,java.util.List octaves) { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.create(random.wrapperContained,octaves)); }
// public static yarnwrap.util.math.noise.OctavePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,java.util.List octaves, ) { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(net.minecraft.util.math.noise.OctavePerlinNoiseSampler.create(random.wrapperContained,octaves)); }
// public yarnwrap.util.math.noise.OctavePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,java.util.stream.IntStream octaves) { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.create(random.wrapperContained,octaves)); }
// public static yarnwrap.util.math.noise.OctavePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,java.util.stream.IntStream octaves, ) { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(net.minecraft.util.math.noise.OctavePerlinNoiseSampler.create(random.wrapperContained,octaves)); }
public void addDebugInfo(java.lang.StringBuilder info) { wrapperContained.addDebugInfo(info); }
// public static void addDebugInfo(java.lang.StringBuilder info, ) { net.minecraft.util.math.noise.OctavePerlinNoiseSampler.addDebugInfo(info); }
// public boolean method_39131(java.lang.Double amplitude) { return wrapperContained.method_39131(amplitude); }
// public static boolean method_39131(java.lang.Double amplitude, ) { return net.minecraft.util.math.noise.OctavePerlinNoiseSampler.method_39131(amplitude); }
// public yarnwrap.util.math.noise.OctavePerlinNoiseSampler createLegacy(yarnwrap.util.math.random.Random random,java.util.stream.IntStream octaves) { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.createLegacy(random.wrapperContained,octaves)); }
// public static yarnwrap.util.math.noise.OctavePerlinNoiseSampler createLegacy(yarnwrap.util.math.random.Random random,java.util.stream.IntStream octaves, ) { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(net.minecraft.util.math.noise.OctavePerlinNoiseSampler.createLegacy(random.wrapperContained,octaves)); }
// public double getMaxValue() { return wrapperContained.getMaxValue(); }
// public static double getMaxValue() { return net.minecraft.util.math.noise.OctavePerlinNoiseSampler.getMaxValue(); }
// public double getTotalAmplitude(double scale) { return wrapperContained.getTotalAmplitude(scale); }
// public static double getTotalAmplitude(double scale, ) { return net.minecraft.util.math.noise.OctavePerlinNoiseSampler.getTotalAmplitude(scale); }

}