package yarnwrap.util.math.random;
public class ThreadSafeRandom { public net.minecraft.util.math.random.ThreadSafeRandom wrapperContained; public ThreadSafeRandom(net.minecraft.util.math.random.ThreadSafeRandom wrapperContained) { this.wrapperContained = wrapperContained; }

// public int INT_BITS() { return wrapperContained.INT_BITS; }
// public void INT_BITS(int value) { wrapperContained.INT_BITS = value; }
// public static int INT_BITS() { return net.minecraft.util.math.random.ThreadSafeRandom.INT_BITS; }
// public static void INT_BITS(int value, ) { net.minecraft.util.math.random.ThreadSafeRandom.INT_BITS = value; }

// public long SEED_MASK() { return wrapperContained.SEED_MASK; }
// public void SEED_MASK(long value) { wrapperContained.SEED_MASK = value; }
// public static long SEED_MASK() { return net.minecraft.util.math.random.ThreadSafeRandom.SEED_MASK; }
// public static void SEED_MASK(long value, ) { net.minecraft.util.math.random.ThreadSafeRandom.SEED_MASK = value; }

// public long MULTIPLIER() { return wrapperContained.MULTIPLIER; }
// public void MULTIPLIER(long value) { wrapperContained.MULTIPLIER = value; }
// public static long MULTIPLIER() { return net.minecraft.util.math.random.ThreadSafeRandom.MULTIPLIER; }
// public static void MULTIPLIER(long value, ) { net.minecraft.util.math.random.ThreadSafeRandom.MULTIPLIER = value; }

// public long INCREMENT() { return wrapperContained.INCREMENT; }
// public void INCREMENT(long value) { wrapperContained.INCREMENT = value; }
// public static long INCREMENT() { return net.minecraft.util.math.random.ThreadSafeRandom.INCREMENT; }
// public static void INCREMENT(long value, ) { net.minecraft.util.math.random.ThreadSafeRandom.INCREMENT = value; }

// public java.util.concurrent.atomic.AtomicLong seed() { return wrapperContained.seed; }
// public void seed(java.util.concurrent.atomic.AtomicLong value) { wrapperContained.seed = value; }
// public static java.util.concurrent.atomic.AtomicLong seed() { return net.minecraft.util.math.random.ThreadSafeRandom.seed; }
// public static void seed(java.util.concurrent.atomic.AtomicLong value, ) { net.minecraft.util.math.random.ThreadSafeRandom.seed = value; }

// public yarnwrap.util.math.random.GaussianGenerator gaussianGenerator() { return new yarnwrap.util.math.random.GaussianGenerator(wrapperContained.gaussianGenerator); }
// public void gaussianGenerator(yarnwrap.util.math.random.GaussianGenerator value) { wrapperContained.gaussianGenerator = value.wrapperContained; }
// public static yarnwrap.util.math.random.GaussianGenerator gaussianGenerator() { return new yarnwrap.util.math.random.GaussianGenerator(net.minecraft.util.math.random.ThreadSafeRandom.gaussianGenerator); }
// public static void gaussianGenerator(yarnwrap.util.math.random.GaussianGenerator value, ) { net.minecraft.util.math.random.ThreadSafeRandom.gaussianGenerator = value.wrapperContained; }

public ThreadSafeRandom(long seed) { this.wrapperContained = new net.minecraft.util.math.random.ThreadSafeRandom(seed); }

}