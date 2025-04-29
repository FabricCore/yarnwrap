package yarnwrap.util.math;
public class WordPackedArray { public net.minecraft.util.math.WordPackedArray wrapperContained; public WordPackedArray(net.minecraft.util.math.WordPackedArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public long[] array() { return wrapperContained.array; }
// public void array(long[] value) { wrapperContained.array = value; }
// public static long[] array() { return net.minecraft.util.math.WordPackedArray.array; }
// public static void array(long[] value, ) { net.minecraft.util.math.WordPackedArray.array = value; }

// public int unitSize() { return wrapperContained.unitSize; }
// public void unitSize(int value) { wrapperContained.unitSize = value; }
// public static int unitSize() { return net.minecraft.util.math.WordPackedArray.unitSize; }
// public static void unitSize(int value, ) { net.minecraft.util.math.WordPackedArray.unitSize = value; }

// public long maxValue() { return wrapperContained.maxValue; }
// public void maxValue(long value) { wrapperContained.maxValue = value; }
// public static long maxValue() { return net.minecraft.util.math.WordPackedArray.maxValue; }
// public static void maxValue(long value, ) { net.minecraft.util.math.WordPackedArray.maxValue = value; }

// public int length() { return wrapperContained.length; }
// public void length(int value) { wrapperContained.length = value; }
// public static int length() { return net.minecraft.util.math.WordPackedArray.length; }
// public static void length(int value, ) { net.minecraft.util.math.WordPackedArray.length = value; }

// public int BIT_TO_LONG_INDEX_SHIFT() { return wrapperContained.BIT_TO_LONG_INDEX_SHIFT; }
// public void BIT_TO_LONG_INDEX_SHIFT(int value) { wrapperContained.BIT_TO_LONG_INDEX_SHIFT = value; }
// public static int BIT_TO_LONG_INDEX_SHIFT() { return net.minecraft.util.math.WordPackedArray.BIT_TO_LONG_INDEX_SHIFT; }
// public static void BIT_TO_LONG_INDEX_SHIFT(int value, ) { net.minecraft.util.math.WordPackedArray.BIT_TO_LONG_INDEX_SHIFT = value; }

public WordPackedArray(int unitSize,int length) { this.wrapperContained = new net.minecraft.util.math.WordPackedArray(unitSize,length); }
// public WordPackedArray(int unitSize,int length,long array) { this.wrapperContained = new net.minecraft.util.math.WordPackedArray(unitSize,length,array); }
public long[] getAlignedArray() { return wrapperContained.getAlignedArray(); }
// public static long[] getAlignedArray() { return net.minecraft.util.math.WordPackedArray.getAlignedArray(); }
public int get(int index) { return wrapperContained.get(index); }
// public static int get(int index, ) { return net.minecraft.util.math.WordPackedArray.get(index); }
public void set(int index,int value) { wrapperContained.set(index,value); }
// public static void set(int index,int value, ) { net.minecraft.util.math.WordPackedArray.set(index,value); }
public int getUnitSize() { return wrapperContained.getUnitSize(); }
// public static int getUnitSize() { return net.minecraft.util.math.WordPackedArray.getUnitSize(); }

}