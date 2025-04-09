package yarnwrap.util.math;
public class WordPackedArray { public net.minecraft.util.math.WordPackedArray wrapperContained; public WordPackedArray(net.minecraft.util.math.WordPackedArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public long[] array() { return wrapperContained.array; }
// public int unitSize() { return wrapperContained.unitSize; }
// public long maxValue() { return wrapperContained.maxValue; }
// public int length() { return wrapperContained.length; }
// public int BIT_TO_LONG_INDEX_SHIFT() { return wrapperContained.BIT_TO_LONG_INDEX_SHIFT; }
public long[] getAlignedArray() { return wrapperContained.getAlignedArray(); }
public int get(int index) { return wrapperContained.get(index); }
public void set(int index,int value) { wrapperContained.set(index,value); }
public int getUnitSize() { return wrapperContained.getUnitSize(); }

}