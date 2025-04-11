package yarnwrap.util.math.random;
public class Xoroshiro128PlusPlusRandomImpl { public net.minecraft.util.math.random.Xoroshiro128PlusPlusRandomImpl wrapperContained; public Xoroshiro128PlusPlusRandomImpl(net.minecraft.util.math.random.Xoroshiro128PlusPlusRandomImpl wrapperContained) { this.wrapperContained = wrapperContained; }

// public long seedLo() { return wrapperContained.seedLo; }
// public void seedLo(long value) { wrapperContained.seedLo = value; }
// public long seedHi() { return wrapperContained.seedHi; }
// public void seedHi(long value) { wrapperContained.seedHi = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public long next() { return wrapperContained.next(); }

}