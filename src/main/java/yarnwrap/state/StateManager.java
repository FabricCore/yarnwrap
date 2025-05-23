package yarnwrap.state;
public class StateManager { public net.minecraft.state.StateManager wrapperContained; public StateManager(net.minecraft.state.StateManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.regex.Pattern VALID_NAME_PATTERN() { return wrapperContained.VALID_NAME_PATTERN; }
// public void VALID_NAME_PATTERN(java.util.regex.Pattern value) { wrapperContained.VALID_NAME_PATTERN = value; }
// public static java.util.regex.Pattern VALID_NAME_PATTERN() { return net.minecraft.state.StateManager.VALID_NAME_PATTERN; }
// public static void VALID_NAME_PATTERN(java.util.regex.Pattern value, ) { net.minecraft.state.StateManager.VALID_NAME_PATTERN = value; }

// public com.google.common.collect.ImmutableList states() { return wrapperContained.states; }
// public void states(com.google.common.collect.ImmutableList value) { wrapperContained.states = value; }
// public static com.google.common.collect.ImmutableList states() { return net.minecraft.state.StateManager.states; }
// public static void states(com.google.common.collect.ImmutableList value, ) { net.minecraft.state.StateManager.states = value; }

// public com.google.common.collect.ImmutableSortedMap properties() { return wrapperContained.properties; }
// public void properties(com.google.common.collect.ImmutableSortedMap value) { wrapperContained.properties = value; }
// public static com.google.common.collect.ImmutableSortedMap properties() { return net.minecraft.state.StateManager.properties; }
// public static void properties(com.google.common.collect.ImmutableSortedMap value, ) { net.minecraft.state.StateManager.properties = value; }

// public java.lang.Object owner() { return wrapperContained.owner; }
// public void owner(java.lang.Object value) { wrapperContained.owner = value; }
// // public static java.lang.Object owner() { return net.minecraft.state.StateManager.owner; }
// public static void owner(java.lang.Object value, ) { net.minecraft.state.StateManager.owner = value; }

// public StateManager(java.util.function.Function defaultStateGetter,java.lang.Object owner,Object factory,java.util.Map propertiesMap) { this.wrapperContained = new net.minecraft.state.StateManager(defaultStateGetter,owner,factory,propertiesMap); }
public java.util.Collection getProperties() { return wrapperContained.getProperties(); }
// public static java.util.Collection getProperties() { return net.minecraft.state.StateManager.getProperties(); }
public java.lang.Object getOwner() { return wrapperContained.getOwner(); }
// public static java.lang.Object getOwner() { return net.minecraft.state.StateManager.getOwner(); }
// public java.util.List method_11661(java.util.List value) { return wrapperContained.method_11661(value); }
// public static java.util.List method_11661(java.util.List value, ) { return net.minecraft.state.StateManager.method_11661(value); }
public com.google.common.collect.ImmutableList getStates() { return wrapperContained.getStates(); }
// public static com.google.common.collect.ImmutableList getStates() { return net.minecraft.state.StateManager.getStates(); }
public yarnwrap.state.property.Property getProperty(java.lang.String name) { return new yarnwrap.state.property.Property(wrapperContained.getProperty(name)); }
// public static yarnwrap.state.property.Property getProperty(java.lang.String name, ) { return new yarnwrap.state.property.Property(net.minecraft.state.StateManager.getProperty(name)); }
public yarnwrap.state.State getDefaultState() { return new yarnwrap.state.State(wrapperContained.getDefaultState()); }
// public static yarnwrap.state.State getDefaultState() { return new yarnwrap.state.State(net.minecraft.state.StateManager.getDefaultState()); }
// public java.util.stream.Stream method_11666(yarnwrap.state.property.Property entries) { return wrapperContained.method_11666(entries.wrapperContained); }
// public static java.util.stream.Stream method_11666(yarnwrap.state.property.Property entries, ) { return net.minecraft.state.StateManager.method_11666(entries.wrapperContained); }
// public void method_28484(Object entries) { wrapperContained.method_28484(entries); }
// public static void method_28484(Object entries, ) { net.minecraft.state.StateManager.method_28484(entries); }
// public com.mojang.datafixers.util.Pair method_30037(yarnwrap.state.property.Property state) { return wrapperContained.method_30037(state.wrapperContained); }
// public static com.mojang.datafixers.util.Pair method_30037(yarnwrap.state.property.Property state, ) { return net.minecraft.state.StateManager.method_30037(state.wrapperContained); }
// public yarnwrap.state.State method_30038(yarnwrap.state.property.Property pair) { return new yarnwrap.state.State(wrapperContained.method_30038(pair.wrapperContained)); }
// public static yarnwrap.state.State method_30038(yarnwrap.state.property.Property pair, ) { return new yarnwrap.state.State(net.minecraft.state.StateManager.method_30038(pair.wrapperContained)); }
// public com.mojang.serialization.MapCodec addFieldToMapCodec(com.mojang.serialization.MapCodec mapCodec,java.util.function.Supplier defaultStateGetter,java.lang.String key,yarnwrap.state.property.Property property) { return wrapperContained.addFieldToMapCodec(mapCodec,defaultStateGetter,key,property.wrapperContained); }
// public static com.mojang.serialization.MapCodec addFieldToMapCodec(com.mojang.serialization.MapCodec mapCodec,java.util.function.Supplier defaultStateGetter,java.lang.String key,yarnwrap.state.property.Property property, ) { return net.minecraft.state.StateManager.addFieldToMapCodec(mapCodec,defaultStateGetter,key,property.wrapperContained); }
// public void method_38859(java.lang.String value) { wrapperContained.method_38859(value); }
// public static void method_38859(java.lang.String value, ) { net.minecraft.state.StateManager.method_38859(value); }

}