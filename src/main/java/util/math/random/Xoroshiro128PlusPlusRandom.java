package yarnwrap.util.math.random;
public class Xoroshiro128PlusPlusRandom { public net.minecraft.util.math.random.Xoroshiro128PlusPlusRandom wrapperContained; public Xoroshiro128PlusPlusRandom(net.minecraft.util.math.random.Xoroshiro128PlusPlusRandom wrapperContained) { this.wrapperContained = wrapperContained; }

// public float FLOAT_MULTIPLIER() { return wrapperContained.FLOAT_MULTIPLIER; }
// public double DOUBLE_MULTIPLIER() { return wrapperContained.DOUBLE_MULTIPLIER; }
// public yarnwrap.util.math.random.Xoroshiro128PlusPlusRandomImpl implementation() { return new yarnwrap.util.math.random.Xoroshiro128PlusPlusRandomImpl(wrapperContained.implementation); }
// public yarnwrap.util.math.random.GaussianGenerator gaussianGenerator() { return new yarnwrap.util.math.random.GaussianGenerator(wrapperContained.gaussianGenerator); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public long next(int bits) { return wrapperContained.next(bits); }

}