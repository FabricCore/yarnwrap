package yarnwrap.state.property;
public class Property { public net.minecraft.state.property.Property wrapperContained; public Property(net.minecraft.state.property.Property wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Class type() { return wrapperContained.type; }
// public void type(java.lang.Class value) { wrapperContained.type = value; }
// public static java.lang.Class type() { return net.minecraft.state.property.Property.type; }
// public static void type(java.lang.Class value, ) { net.minecraft.state.property.Property.type = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.state.property.Property.name; }
// public static void name(java.lang.String value, ) { net.minecraft.state.property.Property.name = value; }

// public java.lang.Integer hashCodeCache() { return wrapperContained.hashCodeCache; }
// public void hashCodeCache(java.lang.Integer value) { wrapperContained.hashCodeCache = value; }
// public static java.lang.Integer hashCodeCache() { return net.minecraft.state.property.Property.hashCodeCache; }
// public static void hashCodeCache(java.lang.Integer value, ) { net.minecraft.state.property.Property.hashCodeCache = value; }

// public com.mojang.serialization.Codec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.Codec value) { wrapperContained.codec = value; }
// public static com.mojang.serialization.Codec codec() { return net.minecraft.state.property.Property.codec; }
// public static void codec(com.mojang.serialization.Codec value, ) { net.minecraft.state.property.Property.codec = value; }

// public com.mojang.serialization.Codec valueCodec() { return wrapperContained.valueCodec; }
// public void valueCodec(com.mojang.serialization.Codec value) { wrapperContained.valueCodec = value; }
// public static com.mojang.serialization.Codec valueCodec() { return net.minecraft.state.property.Property.valueCodec; }
// public static void valueCodec(com.mojang.serialization.Codec value, ) { net.minecraft.state.property.Property.valueCodec = value; }

// public Property(java.lang.String name,java.lang.Class type) { this.wrapperContained = new net.minecraft.state.property.Property(name,type); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.state.property.Property.equals(o); }
public int computeHashCode() { return wrapperContained.computeHashCode(); }
// public static int computeHashCode() { return net.minecraft.state.property.Property.computeHashCode(); }
public java.util.Collection getValues() { return wrapperContained.getValues(); }
// public static java.util.Collection getValues() { return net.minecraft.state.property.Property.getValues(); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.state.property.Property.getName(); }
public java.util.Optional parse(java.lang.String name) { return wrapperContained.parse(name); }
// public static java.util.Optional parse(java.lang.String name, ) { return net.minecraft.state.property.Property.parse(name); }
public java.lang.String name(java.lang.Comparable value) { return wrapperContained.name(value); }
// public static java.lang.String name(java.lang.Comparable value, ) { return net.minecraft.state.property.Property.name(value); }
public java.lang.Class getType() { return wrapperContained.getType(); }
// public static java.lang.Class getType() { return net.minecraft.state.property.Property.getType(); }
// public com.mojang.serialization.DataResult method_28504(java.lang.String value) { return wrapperContained.method_28504(value); }
// public static com.mojang.serialization.DataResult method_28504(java.lang.String value, ) { return net.minecraft.state.property.Property.method_28504(value); }
public Object createValue(yarnwrap.state.State state) { return wrapperContained.createValue(state.wrapperContained); }
// public static Object createValue(yarnwrap.state.State state, ) { return net.minecraft.state.property.Property.createValue(state.wrapperContained); }
public Object createValue(java.lang.Comparable value) { return wrapperContained.createValue(value); }
// public static Object createValue(java.lang.Comparable value, ) { return net.minecraft.state.property.Property.createValue(value); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
// public static java.util.stream.Stream stream() { return net.minecraft.state.property.Property.stream(); }
public com.mojang.serialization.Codec getValueCodec() { return wrapperContained.getValueCodec(); }
// public static com.mojang.serialization.Codec getValueCodec() { return net.minecraft.state.property.Property.getValueCodec(); }
// public yarnwrap.state.State method_35306(yarnwrap.state.State property) { return new yarnwrap.state.State(wrapperContained.method_35306(property.wrapperContained)); }
// public static yarnwrap.state.State method_35306(yarnwrap.state.State property, ) { return new yarnwrap.state.State(net.minecraft.state.property.Property.method_35306(property.wrapperContained)); }
public com.mojang.serialization.DataResult parse(com.mojang.serialization.DynamicOps ops,yarnwrap.state.State state,java.lang.Object input) { return wrapperContained.parse(ops,state.wrapperContained,input); }
// public static com.mojang.serialization.DataResult parse(com.mojang.serialization.DynamicOps ops,yarnwrap.state.State state,java.lang.Object input, ) { return net.minecraft.state.property.Property.parse(ops,state.wrapperContained,input); }
public com.mojang.serialization.Codec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.Codec getCodec() { return net.minecraft.state.property.Property.getCodec(); }

}