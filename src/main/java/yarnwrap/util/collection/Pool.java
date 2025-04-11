package yarnwrap.util.collection;
public class Pool { public net.minecraft.util.collection.Pool wrapperContained; public Pool(net.minecraft.util.collection.Pool wrapperContained) { this.wrapperContained = wrapperContained; }

// public int totalWeight() { return wrapperContained.totalWeight; }
// public void totalWeight(int value) { wrapperContained.totalWeight = value; }
// public com.google.common.collect.ImmutableList entries() { return wrapperContained.entries; }
// public void entries(com.google.common.collect.ImmutableList value) { wrapperContained.entries = value; }
public yarnwrap.util.collection.Pool of(java.util.List entries) { return new yarnwrap.util.collection.Pool(wrapperContained.of(entries)); }
public yarnwrap.util.collection.Pool of(net.minecraft.util.collection.Weighted[] entries) { return new yarnwrap.util.collection.Pool(wrapperContained.of(entries)); }
public yarnwrap.util.collection.Pool empty() { return new yarnwrap.util.collection.Pool(wrapperContained.empty()); }
public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec entryCodec) { return wrapperContained.createCodec(entryCodec); }
public java.util.Optional getOrEmpty(yarnwrap.util.math.random.Random random) { return wrapperContained.getOrEmpty(random.wrapperContained); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public java.util.List getEntries() { return wrapperContained.getEntries(); }

}