package yarnwrap.util.math.random;
public class RandomSeed { public net.minecraft.util.math.random.RandomSeed wrapperContained; public RandomSeed(net.minecraft.util.math.random.RandomSeed wrapperContained) { this.wrapperContained = wrapperContained; }

public long GOLDEN_RATIO_64() { return wrapperContained.GOLDEN_RATIO_64; }
public long SILVER_RATIO_64() { return wrapperContained.SILVER_RATIO_64; }
// public java.util.concurrent.atomic.AtomicLong SEED_UNIQUIFIER() { return wrapperContained.SEED_UNIQUIFIER; }
// public com.google.common.hash.HashFunction MD5_HASH() { return wrapperContained.MD5_HASH; }
public long getSeed() { return wrapperContained.getSeed(); }
public long mixStafford13(long seed) { return wrapperContained.mixStafford13(seed); }
public Object createXoroshiroSeed(long seed) { return wrapperContained.createXoroshiroSeed(seed); }
public Object createXoroshiroSeed(java.lang.String seed) { return wrapperContained.createXoroshiroSeed(seed); }
public Object createUnmixedXoroshiroSeed(long seed) { return wrapperContained.createUnmixedXoroshiroSeed(seed); }

}