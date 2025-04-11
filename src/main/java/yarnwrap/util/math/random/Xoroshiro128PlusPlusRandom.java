package yarnwrap.util.math.random;
public class Xoroshiro128PlusPlusRandom { public net.minecraft.util.math.random.Xoroshiro128PlusPlusRandom wrapperContained; public Xoroshiro128PlusPlusRandom(net.minecraft.util.math.random.Xoroshiro128PlusPlusRandom wrapperContained) { this.wrapperContained = wrapperContained; }

// public float FLOAT_MULTIPLIER() { return wrapperContained.FLOAT_MULTIPLIER; }
// public void FLOAT_MULTIPLIER(float value) { wrapperContained.FLOAT_MULTIPLIER = value; }
// public double DOUBLE_MULTIPLIER() { return wrapperContained.DOUBLE_MULTIPLIER; }
// public void DOUBLE_MULTIPLIER(double value) { wrapperContained.DOUBLE_MULTIPLIER = value; }
// public yarnwrap.util.math.random.Xoroshiro128PlusPlusRandomImpl implementation() { return new yarnwrap.util.math.random.Xoroshiro128PlusPlusRandomImpl(wrapperContained.implementation); }
// public void implementation(yarnwrap.util.math.random.Xoroshiro128PlusPlusRandomImpl value) { wrapperContained.implementation = value.wrapperContained; }
// public yarnwrap.util.math.random.GaussianGenerator gaussianGenerator() { return new yarnwrap.util.math.random.GaussianGenerator(wrapperContained.gaussianGenerator); }
// public void gaussianGenerator(yarnwrap.util.math.random.GaussianGenerator value) { wrapperContained.gaussianGenerator = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public long next(int bits) { return wrapperContained.next(bits); }

}