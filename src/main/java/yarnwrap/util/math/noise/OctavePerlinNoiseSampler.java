package yarnwrap.util.math.noise;
public class OctavePerlinNoiseSampler { public net.minecraft.util.math.noise.OctavePerlinNoiseSampler wrapperContained; public OctavePerlinNoiseSampler(net.minecraft.util.math.noise.OctavePerlinNoiseSampler wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.math.noise.PerlinNoiseSampler[] octaveSamplers() { return wrapperContained.octaveSamplers; }
// public void octaveSamplers(net.minecraft.util.math.noise.PerlinNoiseSampler[] value) { wrapperContained.octaveSamplers = value; }
// public double persistence() { return wrapperContained.persistence; }
// public void persistence(double value) { wrapperContained.persistence = value; }
// public double lacunarity() { return wrapperContained.lacunarity; }
// public void lacunarity(double value) { wrapperContained.lacunarity = value; }
// public it.unimi.dsi.fastutil.doubles.DoubleList amplitudes() { return wrapperContained.amplitudes; }
// public void amplitudes(it.unimi.dsi.fastutil.doubles.DoubleList value) { wrapperContained.amplitudes = value; }
// public int firstOctave() { return wrapperContained.firstOctave; }
// public void firstOctave(int value) { wrapperContained.firstOctave = value; }
// public double maxValue() { return wrapperContained.maxValue; }
// public void maxValue(double value) { wrapperContained.maxValue = value; }
public double sample(double x,double y,double z) { return wrapperContained.sample(x,y,z); }
public double maintainPrecision(double value) { return wrapperContained.maintainPrecision(value); }
public double sample(double x,double y,double z,double yScale,double yMax,boolean useOrigin) { return wrapperContained.sample(x,y,z,yScale,yMax,useOrigin); }
public yarnwrap.util.math.noise.PerlinNoiseSampler getOctave(int octave) { return new yarnwrap.util.math.noise.PerlinNoiseSampler(wrapperContained.getOctave(octave)); }
public yarnwrap.util.math.noise.OctavePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,int offset,it.unimi.dsi.fastutil.doubles.DoubleList amplitudes) { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.create(random.wrapperContained,offset,amplitudes)); }
// public com.mojang.datafixers.util.Pair calculateAmplitudes(it.unimi.dsi.fastutil.ints.IntSortedSet octaves) { return wrapperContained.calculateAmplitudes(octaves); }
// public void skipCalls(yarnwrap.util.math.random.Random random) { wrapperContained.skipCalls(random.wrapperContained); }
public yarnwrap.util.math.noise.OctavePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,int offset,double firstAmplitude,double amplitudes) { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.create(random.wrapperContained,offset,firstAmplitude,amplitudes)); }
// public int getFirstOctave() { return wrapperContained.getFirstOctave(); }
// public it.unimi.dsi.fastutil.doubles.DoubleList getAmplitudes() { return wrapperContained.getAmplitudes(); }
public yarnwrap.util.math.noise.OctavePerlinNoiseSampler createLegacy(yarnwrap.util.math.random.Random random,int offset,it.unimi.dsi.fastutil.doubles.DoubleList amplitudes) { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.createLegacy(random.wrapperContained,offset,amplitudes)); }
public yarnwrap.util.math.noise.OctavePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,java.util.List octaves) { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.create(random.wrapperContained,octaves)); }
public yarnwrap.util.math.noise.OctavePerlinNoiseSampler create(yarnwrap.util.math.random.Random random,java.util.stream.IntStream octaves) { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.create(random.wrapperContained,octaves)); }
public void addDebugInfo(java.lang.StringBuilder info) { wrapperContained.addDebugInfo(info); }
public yarnwrap.util.math.noise.OctavePerlinNoiseSampler createLegacy(yarnwrap.util.math.random.Random random,java.util.stream.IntStream octaves) { return new yarnwrap.util.math.noise.OctavePerlinNoiseSampler(wrapperContained.createLegacy(random.wrapperContained,octaves)); }
// public double getMaxValue() { return wrapperContained.getMaxValue(); }
// public double getTotalAmplitude(double scale) { return wrapperContained.getTotalAmplitude(scale); }

}