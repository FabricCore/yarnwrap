package yarnwrap.util.math.random;
public class ThreadSafeRandom { public net.minecraft.util.math.random.ThreadSafeRandom wrapperContained; public ThreadSafeRandom(net.minecraft.util.math.random.ThreadSafeRandom wrapperContained) { this.wrapperContained = wrapperContained; }

// public int INT_BITS() { return wrapperContained.INT_BITS; }
// public long SEED_MASK() { return wrapperContained.SEED_MASK; }
// public long MULTIPLIER() { return wrapperContained.MULTIPLIER; }
// public long INCREMENT() { return wrapperContained.INCREMENT; }
// public java.util.concurrent.atomic.AtomicLong seed() { return wrapperContained.seed; }
// public yarnwrap.util.math.random.GaussianGenerator gaussianGenerator() { return new yarnwrap.util.math.random.GaussianGenerator(wrapperContained.gaussianGenerator); }

}