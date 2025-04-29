package yarnwrap.util.dynamic;
public class Range { public net.minecraft.util.dynamic.Range wrapperContained; public Range(net.minecraft.util.dynamic.Range wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Comparable minInclusive() { return wrapperContained.minInclusive; }
// public void minInclusive(java.lang.Comparable value) { wrapperContained.minInclusive = value; }
// public static java.lang.Comparable minInclusive() { return net.minecraft.util.dynamic.Range.minInclusive; }
// public static void minInclusive(java.lang.Comparable value, ) { net.minecraft.util.dynamic.Range.minInclusive = value; }

// public java.lang.Comparable maxInclusive() { return wrapperContained.maxInclusive; }
// public void maxInclusive(java.lang.Comparable value) { wrapperContained.maxInclusive = value; }
// public static java.lang.Comparable maxInclusive() { return net.minecraft.util.dynamic.Range.maxInclusive; }
// public static void maxInclusive(java.lang.Comparable value, ) { net.minecraft.util.dynamic.Range.maxInclusive = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.dynamic.Range.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Range.CODEC = value; }

public Range(java.lang.Comparable value) { this.wrapperContained = new net.minecraft.util.dynamic.Range(value); }
public Range(java.lang.Comparable minInclusive,java.lang.Comparable maxInclusive) { this.wrapperContained = new net.minecraft.util.dynamic.Range(minInclusive,maxInclusive); }
// public java.lang.Comparable minInclusive() { return wrapperContained.minInclusive(); }
// // public static java.lang.Comparable minInclusive() { return net.minecraft.util.dynamic.Range.minInclusive(); }
// public java.lang.Comparable maxInclusive() { return wrapperContained.maxInclusive(); }
// // public static java.lang.Comparable maxInclusive() { return net.minecraft.util.dynamic.Range.maxInclusive(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.util.dynamic.Range.equals(o); }
public boolean contains(yarnwrap.util.dynamic.Range other) { return wrapperContained.contains(other.wrapperContained); }
// public static boolean contains(yarnwrap.util.dynamic.Range other, ) { return net.minecraft.util.dynamic.Range.contains(other.wrapperContained); }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec elementCodec) { return wrapperContained.createCodec(elementCodec); }
// public static com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec elementCodec, ) { return net.minecraft.util.dynamic.Range.createCodec(elementCodec); }
// public com.mojang.serialization.Codec createRangedCodec(com.mojang.serialization.Codec codec,java.lang.Comparable minInclusive,java.lang.Comparable maxInclusive) { return wrapperContained.createRangedCodec(codec,minInclusive,maxInclusive); }
// public static com.mojang.serialization.Codec createRangedCodec(com.mojang.serialization.Codec codec,java.lang.Comparable minInclusive,java.lang.Comparable maxInclusive, ) { return net.minecraft.util.dynamic.Range.createRangedCodec(codec,minInclusive,maxInclusive); }
public boolean contains(java.lang.Comparable value) { return wrapperContained.contains(value); }
// public static boolean contains(java.lang.Comparable value, ) { return net.minecraft.util.dynamic.Range.contains(value); }
// public com.mojang.serialization.DataResult validate(java.lang.Comparable minInclusive,java.lang.Comparable maxInclusive) { return wrapperContained.validate(minInclusive,maxInclusive); }
// public static com.mojang.serialization.DataResult validate(java.lang.Comparable minInclusive,java.lang.Comparable maxInclusive, ) { return net.minecraft.util.dynamic.Range.validate(minInclusive,maxInclusive); }
// public com.mojang.serialization.DataResult method_37957(java.lang.Comparable range) { return wrapperContained.method_37957(range); }
// public static com.mojang.serialization.DataResult method_37957(java.lang.Comparable range, ) { return net.minecraft.util.dynamic.Range.method_37957(range); }

}