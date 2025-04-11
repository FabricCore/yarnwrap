package yarnwrap.util.math;
public class WordPackedArray { public net.minecraft.util.math.WordPackedArray wrapperContained; public WordPackedArray(net.minecraft.util.math.WordPackedArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public long[] array() { return wrapperContained.array; }
// public void array(long[] value) { wrapperContained.array = value; }
// public int unitSize() { return wrapperContained.unitSize; }
// public void unitSize(int value) { wrapperContained.unitSize = value; }
// public long maxValue() { return wrapperContained.maxValue; }
// public void maxValue(long value) { wrapperContained.maxValue = value; }
// public int length() { return wrapperContained.length; }
// public void length(int value) { wrapperContained.length = value; }
// public int BIT_TO_LONG_INDEX_SHIFT() { return wrapperContained.BIT_TO_LONG_INDEX_SHIFT; }
// public void BIT_TO_LONG_INDEX_SHIFT(int value) { wrapperContained.BIT_TO_LONG_INDEX_SHIFT = value; }
public WordPackedArray(int unitSize,int length) { this.wrapperContained = new net.minecraft.util.math.WordPackedArray(unitSize,length); }
// public WordPackedArray(int unitSize,int length,long array) { this.wrapperContained = new net.minecraft.util.math.WordPackedArray(unitSize,length,array); }
public long[] getAlignedArray() { return wrapperContained.getAlignedArray(); }
public int get(int index) { return wrapperContained.get(index); }
public void set(int index,int value) { wrapperContained.set(index,value); }
public int getUnitSize() { return wrapperContained.getUnitSize(); }

}