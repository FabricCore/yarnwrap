package yarnwrap.util.math.random;
public class Xoroshiro128PlusPlusRandomImpl { public net.minecraft.util.math.random.Xoroshiro128PlusPlusRandomImpl wrapperContained; public Xoroshiro128PlusPlusRandomImpl(net.minecraft.util.math.random.Xoroshiro128PlusPlusRandomImpl wrapperContained) { this.wrapperContained = wrapperContained; }

// public long seedLo() { return wrapperContained.seedLo; }
// public long seedHi() { return wrapperContained.seedHi; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public long next() { return wrapperContained.next(); }

}