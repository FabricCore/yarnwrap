package yarnwrap.state.property;
public class Property { public net.minecraft.state.property.Property wrapperContained; public Property(net.minecraft.state.property.Property wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Class type() { return wrapperContained.type; }
// public void type(java.lang.Class value) { wrapperContained.type = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public java.lang.Integer hashCodeCache() { return wrapperContained.hashCodeCache; }
// public void hashCodeCache(java.lang.Integer value) { wrapperContained.hashCodeCache = value; }
// public com.mojang.serialization.Codec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.Codec value) { wrapperContained.codec = value; }
// public com.mojang.serialization.Codec valueCodec() { return wrapperContained.valueCodec; }
// public void valueCodec(com.mojang.serialization.Codec value) { wrapperContained.valueCodec = value; }
public int computeHashCode() { return wrapperContained.computeHashCode(); }
public java.util.Collection getValues() { return wrapperContained.getValues(); }
public java.lang.String getName() { return wrapperContained.getName(); }
public java.util.Optional parse(java.lang.String name) { return wrapperContained.parse(name); }
public java.lang.String name(java.lang.Comparable value) { return wrapperContained.name(value); }
public java.lang.Class getType() { return wrapperContained.getType(); }
public Object createValue(yarnwrap.state.State state) { return wrapperContained.createValue(state.wrapperContained); }
public Object createValue(java.lang.Comparable value) { return wrapperContained.createValue(value); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
public com.mojang.serialization.Codec getValueCodec() { return wrapperContained.getValueCodec(); }
public com.mojang.serialization.DataResult parse(com.mojang.serialization.DynamicOps ops,yarnwrap.state.State state,java.lang.Object input) { return wrapperContained.parse(ops,state.wrapperContained,input); }
public com.mojang.serialization.Codec getCodec() { return wrapperContained.getCodec(); }

}