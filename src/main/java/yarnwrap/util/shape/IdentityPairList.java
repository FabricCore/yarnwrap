package yarnwrap.util.shape;
public class IdentityPairList { public net.minecraft.util.shape.IdentityPairList wrapperContained; public IdentityPairList(net.minecraft.util.shape.IdentityPairList wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.doubles.DoubleList merged() { return wrapperContained.merged; }
// public void merged(it.unimi.dsi.fastutil.doubles.DoubleList value) { wrapperContained.merged = value; }
// public static it.unimi.dsi.fastutil.doubles.DoubleList merged() { return net.minecraft.util.shape.IdentityPairList.merged; }
// public static void merged(it.unimi.dsi.fastutil.doubles.DoubleList value, ) { net.minecraft.util.shape.IdentityPairList.merged = value; }

public IdentityPairList(it.unimi.dsi.fastutil.doubles.DoubleList values) { this.wrapperContained = new net.minecraft.util.shape.IdentityPairList(values); }

}