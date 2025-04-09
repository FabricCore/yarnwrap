package yarnwrap.util.math.random;
public class Random { public net.minecraft.util.math.random.Random wrapperContained; public Random(net.minecraft.util.math.random.Random wrapperContained) { this.wrapperContained = wrapperContained; }

public void skip(int count) { wrapperContained.skip(count); }
public yarnwrap.util.math.random.Random split() { return new yarnwrap.util.math.random.Random(wrapperContained.split()); }
public yarnwrap.util.math.random.RandomSplitter nextSplitter() { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.nextSplitter()); }
public int nextBetween(int min,int max) { return wrapperContained.nextBetween(min,max); }
// public yarnwrap.util.math.random.Random create() { return new yarnwrap.util.math.random.Random(wrapperContained.create()); }
public int nextInt(int bound) { return wrapperContained.nextInt(bound); }
// public yarnwrap.util.math.random.Random create(long seed) { return new yarnwrap.util.math.random.Random(wrapperContained.create(seed)); }
// public yarnwrap.util.math.random.Random createThreadSafe() { return new yarnwrap.util.math.random.Random(wrapperContained.createThreadSafe()); }
public int nextBetweenExclusive(int min,int max) { return wrapperContained.nextBetweenExclusive(min,max); }
public void setSeed(long seed) { wrapperContained.setSeed(seed); }
// public yarnwrap.util.math.random.Random createLocal() { return new yarnwrap.util.math.random.Random(wrapperContained.createLocal()); }
public int nextInt() { return wrapperContained.nextInt(); }
public long nextLong() { return wrapperContained.nextLong(); }
public boolean nextBoolean() { return wrapperContained.nextBoolean(); }
public float nextFloat() { return wrapperContained.nextFloat(); }
public double nextDouble() { return wrapperContained.nextDouble(); }
public double nextGaussian() { return wrapperContained.nextGaussian(); }
public double nextTriangular(double mode,double deviation) { return wrapperContained.nextTriangular(mode,deviation); }

}