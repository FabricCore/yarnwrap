package yarnwrap.util.math.random;
public class Random { public net.minecraft.util.math.random.Random wrapperContained; public Random(net.minecraft.util.math.random.Random wrapperContained) { this.wrapperContained = wrapperContained; }

public void skip(int count) { wrapperContained.skip(count); }
// public static void skip(int count, ) { net.minecraft.util.math.random.Random.skip(count); }
public yarnwrap.util.math.random.Random split() { return new yarnwrap.util.math.random.Random(wrapperContained.split()); }
// public static yarnwrap.util.math.random.Random split() { return new yarnwrap.util.math.random.Random(net.minecraft.util.math.random.Random.split()); }
public yarnwrap.util.math.random.RandomSplitter nextSplitter() { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.nextSplitter()); }
// public static yarnwrap.util.math.random.RandomSplitter nextSplitter() { return new yarnwrap.util.math.random.RandomSplitter(net.minecraft.util.math.random.Random.nextSplitter()); }
public int nextBetween(int min,int max) { return wrapperContained.nextBetween(min,max); }
// public static int nextBetween(int min,int max, ) { return net.minecraft.util.math.random.Random.nextBetween(min,max); }
// public yarnwrap.util.math.random.Random create() { return new yarnwrap.util.math.random.Random(wrapperContained.create()); }
public static yarnwrap.util.math.random.Random create() { return new yarnwrap.util.math.random.Random(net.minecraft.util.math.random.Random.create()); }
public int nextInt(int bound) { return wrapperContained.nextInt(bound); }
// public static int nextInt(int bound, ) { return net.minecraft.util.math.random.Random.nextInt(bound); }
// public yarnwrap.util.math.random.Random create(long seed) { return new yarnwrap.util.math.random.Random(wrapperContained.create(seed)); }
// public static yarnwrap.util.math.random.Random create(long seed, ) { return new yarnwrap.util.math.random.Random(net.minecraft.util.math.random.Random.create(seed)); }
// public yarnwrap.util.math.random.Random createThreadSafe() { return new yarnwrap.util.math.random.Random(wrapperContained.createThreadSafe()); }
public static yarnwrap.util.math.random.Random createThreadSafe() { return new yarnwrap.util.math.random.Random(net.minecraft.util.math.random.Random.createThreadSafe()); }
public int nextBetweenExclusive(int min,int max) { return wrapperContained.nextBetweenExclusive(min,max); }
// public static int nextBetweenExclusive(int min,int max, ) { return net.minecraft.util.math.random.Random.nextBetweenExclusive(min,max); }
public void setSeed(long seed) { wrapperContained.setSeed(seed); }
// public static void setSeed(long seed, ) { net.minecraft.util.math.random.Random.setSeed(seed); }
// public yarnwrap.util.math.random.Random createLocal() { return new yarnwrap.util.math.random.Random(wrapperContained.createLocal()); }
public static yarnwrap.util.math.random.Random createLocal() { return new yarnwrap.util.math.random.Random(net.minecraft.util.math.random.Random.createLocal()); }
public int nextInt() { return wrapperContained.nextInt(); }
// public static int nextInt() { return net.minecraft.util.math.random.Random.nextInt(); }
public long nextLong() { return wrapperContained.nextLong(); }
// public static long nextLong() { return net.minecraft.util.math.random.Random.nextLong(); }
public boolean nextBoolean() { return wrapperContained.nextBoolean(); }
// public static boolean nextBoolean() { return net.minecraft.util.math.random.Random.nextBoolean(); }
public float nextFloat() { return wrapperContained.nextFloat(); }
// public static float nextFloat() { return net.minecraft.util.math.random.Random.nextFloat(); }
public double nextDouble() { return wrapperContained.nextDouble(); }
// public static double nextDouble() { return net.minecraft.util.math.random.Random.nextDouble(); }
public double nextGaussian() { return wrapperContained.nextGaussian(); }
// public static double nextGaussian() { return net.minecraft.util.math.random.Random.nextGaussian(); }
public double nextTriangular(double mode,double deviation) { return wrapperContained.nextTriangular(mode,deviation); }
// public static double nextTriangular(double mode,double deviation, ) { return net.minecraft.util.math.random.Random.nextTriangular(mode,deviation); }
public float nextTriangular(float mode,float deviation) { return wrapperContained.nextTriangular(mode,deviation); }
// public static float nextTriangular(float mode,float deviation, ) { return net.minecraft.util.math.random.Random.nextTriangular(mode,deviation); }

}