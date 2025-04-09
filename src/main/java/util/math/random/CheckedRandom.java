package yarnwrap.util.math.random;
public class CheckedRandom { public net.minecraft.util.math.random.CheckedRandom wrapperContained; public CheckedRandom(net.minecraft.util.math.random.CheckedRandom wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.atomic.AtomicLong seed() { return wrapperContained.seed; }
// public int INT_BITS() { return wrapperContained.INT_BITS; }
// public long SEED_MASK() { return wrapperContained.SEED_MASK; }
// public long MULTIPLIER() { return wrapperContained.MULTIPLIER; }
// public long INCREMENT() { return wrapperContained.INCREMENT; }
// public yarnwrap.util.math.random.GaussianGenerator gaussianGenerator() { return new yarnwrap.util.math.random.GaussianGenerator(wrapperContained.gaussianGenerator); }

}