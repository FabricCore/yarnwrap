package yarnwrap.util.math.random;
public class RandomSeed { public net.minecraft.util.math.random.RandomSeed wrapperContained; public RandomSeed(net.minecraft.util.math.random.RandomSeed wrapperContained) { this.wrapperContained = wrapperContained; }

public long GOLDEN_RATIO_64() { return wrapperContained.GOLDEN_RATIO_64; }
// public void GOLDEN_RATIO_64(long value) { wrapperContained.GOLDEN_RATIO_64 = value; }
public long SILVER_RATIO_64() { return wrapperContained.SILVER_RATIO_64; }
// public void SILVER_RATIO_64(long value) { wrapperContained.SILVER_RATIO_64 = value; }
// public java.util.concurrent.atomic.AtomicLong SEED_UNIQUIFIER() { return wrapperContained.SEED_UNIQUIFIER; }
// public void SEED_UNIQUIFIER(java.util.concurrent.atomic.AtomicLong value) { wrapperContained.SEED_UNIQUIFIER = value; }
// public com.google.common.hash.HashFunction MD5_HASH() { return wrapperContained.MD5_HASH; }
// public void MD5_HASH(com.google.common.hash.HashFunction value) { wrapperContained.MD5_HASH = value; }
public long getSeed() { return wrapperContained.getSeed(); }
public long mixStafford13(long seed) { return wrapperContained.mixStafford13(seed); }
public Object createXoroshiroSeed(long seed) { return wrapperContained.createXoroshiroSeed(seed); }
// public long method_39004(long seedUniquifier) { return wrapperContained.method_39004(seedUniquifier); }
public Object createXoroshiroSeed(java.lang.String seed) { return wrapperContained.createXoroshiroSeed(seed); }
public Object createUnmixedXoroshiroSeed(long seed) { return wrapperContained.createUnmixedXoroshiroSeed(seed); }

}