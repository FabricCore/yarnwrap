package yarnwrap.util.shape;
public class SimplePairList { public net.minecraft.util.shape.SimplePairList wrapperContained; public SimplePairList(net.minecraft.util.shape.SimplePairList wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] minValues() { return wrapperContained.minValues; }
// public void minValues(int[] value) { wrapperContained.minValues = value; }
// public double[] valueIndices() { return wrapperContained.valueIndices; }
// public void valueIndices(double[] value) { wrapperContained.valueIndices = value; }
// public int[] maxValues() { return wrapperContained.maxValues; }
// public void maxValues(int[] value) { wrapperContained.maxValues = value; }
// public it.unimi.dsi.fastutil.doubles.DoubleList ZERO() { return wrapperContained.ZERO; }
// public void ZERO(it.unimi.dsi.fastutil.doubles.DoubleList value) { wrapperContained.ZERO = value; }
// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
public SimplePairList(it.unimi.dsi.fastutil.doubles.DoubleList first,it.unimi.dsi.fastutil.doubles.DoubleList second,boolean includeFirstOnly,boolean includeSecondOnly) { this.wrapperContained = new net.minecraft.util.shape.SimplePairList(first,second,includeFirstOnly,includeSecondOnly); }

}