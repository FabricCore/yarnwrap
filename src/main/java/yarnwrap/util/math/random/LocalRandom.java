package yarnwrap.util.math.random;
public class LocalRandom { public net.minecraft.util.math.random.LocalRandom wrapperContained; public LocalRandom(net.minecraft.util.math.random.LocalRandom wrapperContained) { this.wrapperContained = wrapperContained; }

// public int INT_BITS() { return wrapperContained.INT_BITS; }
// public void INT_BITS(int value) { wrapperContained.INT_BITS = value; }
// public long SEED_MASK() { return wrapperContained.SEED_MASK; }
// public void SEED_MASK(long value) { wrapperContained.SEED_MASK = value; }
// public long MULTIPLIER() { return wrapperContained.MULTIPLIER; }
// public void MULTIPLIER(long value) { wrapperContained.MULTIPLIER = value; }
// public long INCREMENT() { return wrapperContained.INCREMENT; }
// public void INCREMENT(long value) { wrapperContained.INCREMENT = value; }
// public long seed() { return wrapperContained.seed; }
// public void seed(long value) { wrapperContained.seed = value; }
// public yarnwrap.util.math.random.GaussianGenerator gaussianGenerator() { return new yarnwrap.util.math.random.GaussianGenerator(wrapperContained.gaussianGenerator); }
// public void gaussianGenerator(yarnwrap.util.math.random.GaussianGenerator value) { wrapperContained.gaussianGenerator = value.wrapperContained; }

}