package yarnwrap.state;
public class State { public net.minecraft.state.State wrapperContained; public State(net.minecraft.state.State wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function PROPERTY_MAP_PRINTER() { return wrapperContained.PROPERTY_MAP_PRINTER; }
// public void PROPERTY_MAP_PRINTER(java.util.function.Function value) { wrapperContained.PROPERTY_MAP_PRINTER = value; }
// public it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap propertyMap() { return wrapperContained.propertyMap; }
// public void propertyMap(it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap value) { wrapperContained.propertyMap = value; }
// public java.lang.Object owner() { return wrapperContained.owner; }
// public void owner(java.lang.Object value) { wrapperContained.owner = value; }
// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
// public com.google.common.collect.Table withTable() { return wrapperContained.withTable; }
// public void withTable(com.google.common.collect.Table value) { wrapperContained.withTable = value; }
public java.lang.String NAME() { return wrapperContained.NAME; }
// public void NAME(java.lang.String value) { wrapperContained.NAME = value; }
public java.lang.String PROPERTIES() { return wrapperContained.PROPERTIES; }
// public void PROPERTIES(java.lang.String value) { wrapperContained.PROPERTIES = value; }
// public State(java.lang.Object owner,it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap propertyMap,com.mojang.serialization.MapCodec codec) { this.wrapperContained = new net.minecraft.state.State(owner,propertyMap,codec); }
public java.lang.Comparable get(yarnwrap.state.property.Property property) { return wrapperContained.get(property.wrapperContained); }
public java.util.Map getEntries() { return wrapperContained.getEntries(); }
public java.lang.Object with(yarnwrap.state.property.Property property,java.lang.Comparable value) { return wrapperContained.with(property.wrapperContained,value); }
// public java.lang.Object method_28492(yarnwrap.state.State state) { return wrapperContained.method_28492(state.wrapperContained); }
public java.lang.Object cycle(yarnwrap.state.property.Property property) { return wrapperContained.cycle(property.wrapperContained); }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec codec,java.util.function.Function ownerToStateFunction) { return wrapperContained.createCodec(codec,ownerToStateFunction); }
// public java.lang.Object getNext(java.util.Collection values,java.lang.Object value) { return wrapperContained.getNext(values,value); }
public void createWithTable(java.util.Map states) { wrapperContained.createWithTable(states); }
// public com.mojang.serialization.MapCodec method_28497(java.util.function.Function owner) { return wrapperContained.method_28497(owner); }
public boolean contains(yarnwrap.state.property.Property property) { return wrapperContained.contains(property.wrapperContained); }
// public java.util.Map toMapWith(yarnwrap.state.property.Property property,java.lang.Comparable value) { return wrapperContained.toMapWith(property.wrapperContained,value); }
public java.util.Optional getOrEmpty(yarnwrap.state.property.Property property) { return wrapperContained.getOrEmpty(property.wrapperContained); }
public java.util.Collection getProperties() { return wrapperContained.getProperties(); }
public java.lang.Object withIfExists(yarnwrap.state.property.Property property,java.lang.Comparable value) { return wrapperContained.withIfExists(property.wrapperContained,value); }

}