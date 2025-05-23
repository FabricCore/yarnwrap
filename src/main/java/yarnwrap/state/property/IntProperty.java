package yarnwrap.state.property;
public class IntProperty { public net.minecraft.state.property.IntProperty wrapperContained; public IntProperty(net.minecraft.state.property.IntProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.IntImmutableList values() { return wrapperContained.values; }
// public void values(it.unimi.dsi.fastutil.ints.IntImmutableList value) { wrapperContained.values = value; }
// public static it.unimi.dsi.fastutil.ints.IntImmutableList values() { return net.minecraft.state.property.IntProperty.values; }
// public static void values(it.unimi.dsi.fastutil.ints.IntImmutableList value, ) { net.minecraft.state.property.IntProperty.values = value; }

// public int min() { return wrapperContained.min; }
// public void min(int value) { wrapperContained.min = value; }
// public static int min() { return net.minecraft.state.property.IntProperty.min; }
// public static void min(int value, ) { net.minecraft.state.property.IntProperty.min = value; }

// public int max() { return wrapperContained.max; }
// public void max(int value) { wrapperContained.max = value; }
// public static int max() { return net.minecraft.state.property.IntProperty.max; }
// public static void max(int value, ) { net.minecraft.state.property.IntProperty.max = value; }

// public IntProperty(java.lang.String name,int min,int max) { this.wrapperContained = new net.minecraft.state.property.IntProperty(name,min,max); }
// public yarnwrap.state.property.IntProperty of(java.lang.String name,int min,int max) { return new yarnwrap.state.property.IntProperty(wrapperContained.of(name,min,max)); }
// public static yarnwrap.state.property.IntProperty of(java.lang.String name,int min,int max, ) { return new yarnwrap.state.property.IntProperty(net.minecraft.state.property.IntProperty.of(name,min,max)); }

}