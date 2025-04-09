package yarnwrap.state;
public class StateManager { public net.minecraft.state.StateManager wrapperContained; public StateManager(net.minecraft.state.StateManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.regex.Pattern VALID_NAME_PATTERN() { return wrapperContained.VALID_NAME_PATTERN; }
// public com.google.common.collect.ImmutableList states() { return wrapperContained.states; }
// public com.google.common.collect.ImmutableSortedMap properties() { return wrapperContained.properties; }
// public java.lang.Object owner() { return wrapperContained.owner; }
public java.util.Collection getProperties() { return wrapperContained.getProperties(); }
public java.lang.Object getOwner() { return wrapperContained.getOwner(); }
public com.google.common.collect.ImmutableList getStates() { return wrapperContained.getStates(); }
public yarnwrap.state.property.Property getProperty(java.lang.String name) { return new yarnwrap.state.property.Property(wrapperContained.getProperty(name)); }
public yarnwrap.state.State getDefaultState() { return new yarnwrap.state.State(wrapperContained.getDefaultState()); }
// public com.mojang.serialization.MapCodec addFieldToMapCodec(com.mojang.serialization.MapCodec mapCodec,java.util.function.Supplier defaultStateGetter,java.lang.String key,yarnwrap.state.property.Property property) { return wrapperContained.addFieldToMapCodec(mapCodec,defaultStateGetter,key,property.wrapperContained); }

}