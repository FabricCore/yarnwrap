package yarnwrap.state.property;
public class IntProperty { public net.minecraft.state.property.IntProperty wrapperContained; public IntProperty(net.minecraft.state.property.IntProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableSet values() { return wrapperContained.values; }
// public void values(com.google.common.collect.ImmutableSet value) { wrapperContained.values = value; }
// public int min() { return wrapperContained.min; }
// public void min(int value) { wrapperContained.min = value; }
// public int max() { return wrapperContained.max; }
// public void max(int value) { wrapperContained.max = value; }
// public IntProperty(java.lang.String name,int min,int max) { this.wrapperContained = new net.minecraft.state.property.IntProperty(name,min,max); }
public yarnwrap.state.property.IntProperty of(java.lang.String name,int min,int max) { return new yarnwrap.state.property.IntProperty(wrapperContained.of(name,min,max)); }

}