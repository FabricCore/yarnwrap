package yarnwrap.util.shape;
public class SimplePairList { public net.minecraft.util.shape.SimplePairList wrapperContained; public SimplePairList(net.minecraft.util.shape.SimplePairList wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] minValues() { return wrapperContained.minValues; }
// public void minValues(int[] value) { wrapperContained.minValues = value; }
// public static int[] minValues() { return net.minecraft.util.shape.SimplePairList.minValues; }
// public static void minValues(int[] value, ) { net.minecraft.util.shape.SimplePairList.minValues = value; }

// public double[] valueIndices() { return wrapperContained.valueIndices; }
// public void valueIndices(double[] value) { wrapperContained.valueIndices = value; }
// public static double[] valueIndices() { return net.minecraft.util.shape.SimplePairList.valueIndices; }
// public static void valueIndices(double[] value, ) { net.minecraft.util.shape.SimplePairList.valueIndices = value; }

// public int[] maxValues() { return wrapperContained.maxValues; }
// public void maxValues(int[] value) { wrapperContained.maxValues = value; }
// public static int[] maxValues() { return net.minecraft.util.shape.SimplePairList.maxValues; }
// public static void maxValues(int[] value, ) { net.minecraft.util.shape.SimplePairList.maxValues = value; }

// public it.unimi.dsi.fastutil.doubles.DoubleList ZERO() { return wrapperContained.ZERO; }
// public void ZERO(it.unimi.dsi.fastutil.doubles.DoubleList value) { wrapperContained.ZERO = value; }
// public static it.unimi.dsi.fastutil.doubles.DoubleList ZERO() { return net.minecraft.util.shape.SimplePairList.ZERO; }
// public static void ZERO(it.unimi.dsi.fastutil.doubles.DoubleList value, ) { net.minecraft.util.shape.SimplePairList.ZERO = value; }

// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
// public static int size() { return net.minecraft.util.shape.SimplePairList.size; }
// public static void size(int value, ) { net.minecraft.util.shape.SimplePairList.size = value; }

public SimplePairList(it.unimi.dsi.fastutil.doubles.DoubleList first,it.unimi.dsi.fastutil.doubles.DoubleList second,boolean includeFirstOnly,boolean includeSecondOnly) { this.wrapperContained = new net.minecraft.util.shape.SimplePairList(first,second,includeFirstOnly,includeSecondOnly); }

}