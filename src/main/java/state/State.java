package yarnwrap.state;
public class State { public net.minecraft.state.State wrapperContained; public State(net.minecraft.state.State wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function PROPERTY_MAP_PRINTER() { return wrapperContained.PROPERTY_MAP_PRINTER; }
// public it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap propertyMap() { return wrapperContained.propertyMap; }
// public java.lang.Object owner() { return wrapperContained.owner; }
// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public com.google.common.collect.Table withTable() { return wrapperContained.withTable; }
public java.lang.String NAME() { return wrapperContained.NAME; }
public java.lang.String PROPERTIES() { return wrapperContained.PROPERTIES; }
public java.lang.Comparable get(yarnwrap.state.property.Property property) { return wrapperContained.get(property.wrapperContained); }
public java.util.Map getEntries() { return wrapperContained.getEntries(); }
public java.lang.Object with(yarnwrap.state.property.Property property,java.lang.Comparable value) { return wrapperContained.with(property.wrapperContained,value); }
public java.lang.Object cycle(yarnwrap.state.property.Property property) { return wrapperContained.cycle(property.wrapperContained); }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec codec,java.util.function.Function ownerToStateFunction) { return wrapperContained.createCodec(codec,ownerToStateFunction); }
// public java.lang.Object getNext(java.util.Collection values,java.lang.Object value) { return wrapperContained.getNext(values,value); }
public void createWithTable(java.util.Map states) { wrapperContained.createWithTable(states); }
public boolean contains(yarnwrap.state.property.Property property) { return wrapperContained.contains(property.wrapperContained); }
// public java.util.Map toMapWith(yarnwrap.state.property.Property property,java.lang.Comparable value) { return wrapperContained.toMapWith(property.wrapperContained,value); }
public java.util.Optional getOrEmpty(yarnwrap.state.property.Property property) { return wrapperContained.getOrEmpty(property.wrapperContained); }
public java.util.Collection getProperties() { return wrapperContained.getProperties(); }
public java.lang.Object withIfExists(yarnwrap.state.property.Property property,java.lang.Comparable value) { return wrapperContained.withIfExists(property.wrapperContained,value); }

}