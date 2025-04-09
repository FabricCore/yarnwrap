package yarnwrap.util.math.random;
public class LocalRandom { public net.minecraft.util.math.random.LocalRandom wrapperContained; public LocalRandom(net.minecraft.util.math.random.LocalRandom wrapperContained) { this.wrapperContained = wrapperContained; }

// public int INT_BITS() { return wrapperContained.INT_BITS; }
// public long SEED_MASK() { return wrapperContained.SEED_MASK; }
// public long MULTIPLIER() { return wrapperContained.MULTIPLIER; }
// public long INCREMENT() { return wrapperContained.INCREMENT; }
// public long seed() { return wrapperContained.seed; }
// public yarnwrap.util.math.random.GaussianGenerator gaussianGenerator() { return new yarnwrap.util.math.random.GaussianGenerator(wrapperContained.gaussianGenerator); }

}