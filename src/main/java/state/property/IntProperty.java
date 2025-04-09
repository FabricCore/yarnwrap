package yarnwrap.state.property;
public class IntProperty { public net.minecraft.state.property.IntProperty wrapperContained; public IntProperty(net.minecraft.state.property.IntProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableSet values() { return wrapperContained.values; }
// public int min() { return wrapperContained.min; }
// public int max() { return wrapperContained.max; }
public yarnwrap.state.property.IntProperty of(java.lang.String name,int min,int max) { return new yarnwrap.state.property.IntProperty(wrapperContained.of(name,min,max)); }

}