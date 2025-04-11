package yarnwrap.state.property;
public class EnumProperty { public net.minecraft.state.property.EnumProperty wrapperContained; public EnumProperty(net.minecraft.state.property.EnumProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableSet values() { return wrapperContained.values; }
// public void values(com.google.common.collect.ImmutableSet value) { wrapperContained.values = value; }
// public java.util.Map byName() { return wrapperContained.byName; }
// public void byName(java.util.Map value) { wrapperContained.byName = value; }
public yarnwrap.state.property.EnumProperty of(java.lang.String name,java.lang.Class type,java.util.Collection values) { return new yarnwrap.state.property.EnumProperty(wrapperContained.of(name,type,values)); }
public yarnwrap.state.property.EnumProperty of(java.lang.String name,java.lang.Class type,java.util.function.Predicate filter) { return new yarnwrap.state.property.EnumProperty(wrapperContained.of(name,type,filter)); }
// public yarnwrap.state.property.EnumProperty of(java.lang.String name,java.lang.Class type,java.lang.Enum[] values) { return new yarnwrap.state.property.EnumProperty(wrapperContained.of(name,type,values)); }
public yarnwrap.state.property.EnumProperty of(java.lang.String name,java.lang.Class type) { return new yarnwrap.state.property.EnumProperty(wrapperContained.of(name,type)); }

}