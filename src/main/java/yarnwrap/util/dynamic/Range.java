package yarnwrap.util.dynamic;
public class Range { public net.minecraft.util.dynamic.Range wrapperContained; public Range(net.minecraft.util.dynamic.Range wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Comparable minInclusive() { return wrapperContained.minInclusive; }
// public void minInclusive(java.lang.Comparable value) { wrapperContained.minInclusive = value; }
// public java.lang.Comparable maxInclusive() { return wrapperContained.maxInclusive; }
// public void maxInclusive(java.lang.Comparable value) { wrapperContained.maxInclusive = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public Range(java.lang.Comparable value) { this.wrapperContained = new net.minecraft.util.dynamic.Range(value); }
public Range(java.lang.Comparable minInclusive,java.lang.Comparable maxInclusive) { this.wrapperContained = new net.minecraft.util.dynamic.Range(minInclusive,maxInclusive); }
// public java.lang.Comparable minInclusive() { return wrapperContained.minInclusive(); }
// public java.lang.Comparable maxInclusive() { return wrapperContained.maxInclusive(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public boolean contains(yarnwrap.util.dynamic.Range other) { return wrapperContained.contains(other.wrapperContained); }
public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec elementCodec) { return wrapperContained.createCodec(elementCodec); }
public com.mojang.serialization.Codec createRangedCodec(com.mojang.serialization.Codec codec,java.lang.Comparable minInclusive,java.lang.Comparable maxInclusive) { return wrapperContained.createRangedCodec(codec,minInclusive,maxInclusive); }
public boolean contains(java.lang.Comparable value) { return wrapperContained.contains(value); }
public com.mojang.serialization.DataResult validate(java.lang.Comparable minInclusive,java.lang.Comparable maxInclusive) { return wrapperContained.validate(minInclusive,maxInclusive); }
// public com.mojang.serialization.DataResult method_37957(java.lang.Comparable range) { return wrapperContained.method_37957(range); }

}