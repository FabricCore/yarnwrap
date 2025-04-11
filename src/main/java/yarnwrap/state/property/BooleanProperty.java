package yarnwrap.state.property;
public class BooleanProperty { public net.minecraft.state.property.BooleanProperty wrapperContained; public BooleanProperty(net.minecraft.state.property.BooleanProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableSet values() { return wrapperContained.values; }
// public void values(com.google.common.collect.ImmutableSet value) { wrapperContained.values = value; }
// public BooleanProperty(java.lang.String name) { this.wrapperContained = new net.minecraft.state.property.BooleanProperty(name); }
public yarnwrap.state.property.BooleanProperty of(java.lang.String name) { return new yarnwrap.state.property.BooleanProperty(wrapperContained.of(name)); }

}