package yarnwrap.util.collection;
public class Pool { public net.minecraft.util.collection.Pool wrapperContained; public Pool(net.minecraft.util.collection.Pool wrapperContained) { this.wrapperContained = wrapperContained; }

// public int totalWeight() { return wrapperContained.totalWeight; }
// public void totalWeight(int value) { wrapperContained.totalWeight = value; }
// public static int totalWeight() { return net.minecraft.util.collection.Pool.totalWeight; }
// public static void totalWeight(int value, ) { net.minecraft.util.collection.Pool.totalWeight = value; }

// public com.google.common.collect.ImmutableList entries() { return wrapperContained.entries; }
// public void entries(com.google.common.collect.ImmutableList value) { wrapperContained.entries = value; }
// public static com.google.common.collect.ImmutableList entries() { return net.minecraft.util.collection.Pool.entries; }
// public static void entries(com.google.common.collect.ImmutableList value, ) { net.minecraft.util.collection.Pool.entries = value; }

// public Pool(java.util.List entries) { this.wrapperContained = new net.minecraft.util.collection.Pool(entries); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.util.collection.Pool.equals(o); }
// public yarnwrap.util.collection.Pool of(java.util.List entries) { return new yarnwrap.util.collection.Pool(wrapperContained.of(entries)); }
// public static yarnwrap.util.collection.Pool of(java.util.List entries, ) { return new yarnwrap.util.collection.Pool(net.minecraft.util.collection.Pool.of(entries)); }
// public yarnwrap.util.collection.Pool of(net.minecraft.util.collection.Weighted[] entries) { return new yarnwrap.util.collection.Pool(wrapperContained.of(entries)); }
// public static yarnwrap.util.collection.Pool of(net.minecraft.util.collection.Weighted[] entries, ) { return new yarnwrap.util.collection.Pool(net.minecraft.util.collection.Pool.of(entries)); }
// public yarnwrap.util.collection.Pool empty() { return new yarnwrap.util.collection.Pool(wrapperContained.empty()); }
public static yarnwrap.util.collection.Pool empty() { return new yarnwrap.util.collection.Pool(net.minecraft.util.collection.Pool.empty()); }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec entryCodec) { return wrapperContained.createCodec(entryCodec); }
// public static com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec entryCodec, ) { return net.minecraft.util.collection.Pool.createCodec(entryCodec); }
public java.util.Optional getOrEmpty(yarnwrap.util.math.random.Random random) { return wrapperContained.getOrEmpty(random.wrapperContained); }
// public static java.util.Optional getOrEmpty(yarnwrap.util.math.random.Random random, ) { return net.minecraft.util.collection.Pool.getOrEmpty(random.wrapperContained); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.util.collection.Pool.isEmpty(); }
public java.util.List getEntries() { return wrapperContained.getEntries(); }
// public static java.util.List getEntries() { return net.minecraft.util.collection.Pool.getEntries(); }

}