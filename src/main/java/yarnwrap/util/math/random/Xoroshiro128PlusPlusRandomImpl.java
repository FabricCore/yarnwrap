package yarnwrap.util.math.random;
public class Xoroshiro128PlusPlusRandomImpl { public net.minecraft.util.math.random.Xoroshiro128PlusPlusRandomImpl wrapperContained; public Xoroshiro128PlusPlusRandomImpl(net.minecraft.util.math.random.Xoroshiro128PlusPlusRandomImpl wrapperContained) { this.wrapperContained = wrapperContained; }

// public long seedLo() { return wrapperContained.seedLo; }
// public void seedLo(long value) { wrapperContained.seedLo = value; }
// public static long seedLo() { return net.minecraft.util.math.random.Xoroshiro128PlusPlusRandomImpl.seedLo; }
// public static void seedLo(long value, ) { net.minecraft.util.math.random.Xoroshiro128PlusPlusRandomImpl.seedLo = value; }

// public long seedHi() { return wrapperContained.seedHi; }
// public void seedHi(long value) { wrapperContained.seedHi = value; }
// public static long seedHi() { return net.minecraft.util.math.random.Xoroshiro128PlusPlusRandomImpl.seedHi; }
// public static void seedHi(long value, ) { net.minecraft.util.math.random.Xoroshiro128PlusPlusRandomImpl.seedHi = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.math.random.Xoroshiro128PlusPlusRandomImpl.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.math.random.Xoroshiro128PlusPlusRandomImpl.CODEC = value; }

public Xoroshiro128PlusPlusRandomImpl(long seedLo,long seedHi) { this.wrapperContained = new net.minecraft.util.math.random.Xoroshiro128PlusPlusRandomImpl(seedLo,seedHi); }
// public Xoroshiro128PlusPlusRandomImpl(Object seed) { this.wrapperContained = new net.minecraft.util.math.random.Xoroshiro128PlusPlusRandomImpl(seed); }
public long next() { return wrapperContained.next(); }
// public static long next() { return net.minecraft.util.math.random.Xoroshiro128PlusPlusRandomImpl.next(); }
// public java.util.stream.LongStream method_51857(yarnwrap.util.math.random.Xoroshiro128PlusPlusRandomImpl random) { return wrapperContained.method_51857(random.wrapperContained); }
// public static java.util.stream.LongStream method_51857(yarnwrap.util.math.random.Xoroshiro128PlusPlusRandomImpl random, ) { return net.minecraft.util.math.random.Xoroshiro128PlusPlusRandomImpl.method_51857(random.wrapperContained); }
// public com.mojang.serialization.DataResult method_51858(java.util.stream.LongStream stream) { return wrapperContained.method_51858(stream); }
// public static com.mojang.serialization.DataResult method_51858(java.util.stream.LongStream stream, ) { return net.minecraft.util.math.random.Xoroshiro128PlusPlusRandomImpl.method_51858(stream); }
// public yarnwrap.util.math.random.Xoroshiro128PlusPlusRandomImpl method_51859(long seeds) { return new yarnwrap.util.math.random.Xoroshiro128PlusPlusRandomImpl(wrapperContained.method_51859(seeds)); }
// public static yarnwrap.util.math.random.Xoroshiro128PlusPlusRandomImpl method_51859(long seeds, ) { return new yarnwrap.util.math.random.Xoroshiro128PlusPlusRandomImpl(net.minecraft.util.math.random.Xoroshiro128PlusPlusRandomImpl.method_51859(seeds)); }

}