package yarnwrap.util.collection;
public class Pool { public net.minecraft.util.collection.Pool wrapperContained; public Pool(net.minecraft.util.collection.Pool wrapperContained) { this.wrapperContained = wrapperContained; }

// public int totalWeight() { return wrapperContained.totalWeight; }
// public void totalWeight(int value) { wrapperContained.totalWeight = value; }
// public static int totalWeight() { return net.minecraft.util.collection.Pool.totalWeight; }
// public static void totalWeight(int value, ) { net.minecraft.util.collection.Pool.totalWeight = value; }

// public java.util.List entries() { return wrapperContained.entries; }
// public void entries(java.util.List value) { wrapperContained.entries = value; }
// public static java.util.List entries() { return net.minecraft.util.collection.Pool.entries; }
// public static void entries(java.util.List value, ) { net.minecraft.util.collection.Pool.entries = value; }

// public int FLATTENED_CONTENT_THRESHOLD() { return wrapperContained.FLATTENED_CONTENT_THRESHOLD; }
// public void FLATTENED_CONTENT_THRESHOLD(int value) { wrapperContained.FLATTENED_CONTENT_THRESHOLD = value; }
// public static int FLATTENED_CONTENT_THRESHOLD() { return net.minecraft.util.collection.Pool.FLATTENED_CONTENT_THRESHOLD; }
// public static void FLATTENED_CONTENT_THRESHOLD(int value, ) { net.minecraft.util.collection.Pool.FLATTENED_CONTENT_THRESHOLD = value; }

// public Object content() { return wrapperContained.content; }
// // public void content(Object value) { wrapperContained.content = value; }
// // public static Object content() { return net.minecraft.util.collection.Pool.content; }
// // public static void content(Object value, ) { net.minecraft.util.collection.Pool.content = value; }

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
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.MapCodec entryCodec) { return wrapperContained.createCodec(entryCodec); }
// public static com.mojang.serialization.Codec createCodec(com.mojang.serialization.MapCodec entryCodec, ) { return net.minecraft.util.collection.Pool.createCodec(entryCodec); }
// public yarnwrap.util.collection.Pool of(java.lang.Object entry) { return new yarnwrap.util.collection.Pool(wrapperContained.of(entry)); }
// public static yarnwrap.util.collection.Pool of(java.lang.Object entry, ) { return new yarnwrap.util.collection.Pool(net.minecraft.util.collection.Pool.of(entry)); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.util.collection.Pool.builder(); }
public java.lang.Object get(yarnwrap.util.math.random.Random random) { return wrapperContained.get(random.wrapperContained); }
// public static java.lang.Object get(yarnwrap.util.math.random.Random random, ) { return net.minecraft.util.collection.Pool.get(random.wrapperContained); }
// public com.mojang.serialization.Codec createNonEmptyCodec(com.mojang.serialization.Codec entryCodec) { return wrapperContained.createNonEmptyCodec(entryCodec); }
// public static com.mojang.serialization.Codec createNonEmptyCodec(com.mojang.serialization.Codec entryCodec, ) { return net.minecraft.util.collection.Pool.createNonEmptyCodec(entryCodec); }
// public com.mojang.serialization.Codec createNonEmptyCodec(com.mojang.serialization.MapCodec entryCodec) { return wrapperContained.createNonEmptyCodec(entryCodec); }
// public static com.mojang.serialization.Codec createNonEmptyCodec(com.mojang.serialization.MapCodec entryCodec, ) { return net.minecraft.util.collection.Pool.createNonEmptyCodec(entryCodec); }
public boolean contains(java.lang.Object value) { return wrapperContained.contains(value); }
// public static boolean contains(java.lang.Object value, ) { return net.minecraft.util.collection.Pool.contains(value); }
public yarnwrap.util.collection.Pool transform(java.util.function.Function function) { return new yarnwrap.util.collection.Pool(wrapperContained.transform(function)); }
// public static yarnwrap.util.collection.Pool transform(java.util.function.Function function, ) { return new yarnwrap.util.collection.Pool(net.minecraft.util.collection.Pool.transform(function)); }
// public yarnwrap.util.collection.Weighted method_68257(java.util.function.Function entry) { return new yarnwrap.util.collection.Weighted(wrapperContained.method_68257(entry)); }
// public static yarnwrap.util.collection.Weighted method_68257(java.util.function.Function entry, ) { return new yarnwrap.util.collection.Weighted(net.minecraft.util.collection.Pool.method_68257(entry)); }

}