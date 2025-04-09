package yarnwrap.util.dynamic;
public class Range { public net.minecraft.util.dynamic.Range wrapperContained; public Range(net.minecraft.util.dynamic.Range wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Comparable minInclusive() { return wrapperContained.minInclusive; }
// public java.lang.Comparable maxInclusive() { return wrapperContained.maxInclusive; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.lang.Comparable minInclusive() { return wrapperContained.minInclusive(); }
// public java.lang.Comparable maxInclusive() { return wrapperContained.maxInclusive(); }
public boolean contains(yarnwrap.util.dynamic.Range other) { return wrapperContained.contains(other.wrapperContained); }
public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec elementCodec) { return wrapperContained.createCodec(elementCodec); }
public com.mojang.serialization.Codec createRangedCodec(com.mojang.serialization.Codec codec,java.lang.Comparable minInclusive,java.lang.Comparable maxInclusive) { return wrapperContained.createRangedCodec(codec,minInclusive,maxInclusive); }
public boolean contains(java.lang.Comparable value) { return wrapperContained.contains(value); }
public com.mojang.serialization.DataResult validate(java.lang.Comparable minInclusive,java.lang.Comparable maxInclusive) { return wrapperContained.validate(minInclusive,maxInclusive); }

}