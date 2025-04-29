package yarnwrap.util.collection;
public class PackedIntegerArray { public net.minecraft.util.collection.PackedIntegerArray wrapperContained; public PackedIntegerArray(net.minecraft.util.collection.PackedIntegerArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public long[] data() { return wrapperContained.data; }
// public void data(long[] value) { wrapperContained.data = value; }
// public static long[] data() { return net.minecraft.util.collection.PackedIntegerArray.data; }
// public static void data(long[] value, ) { net.minecraft.util.collection.PackedIntegerArray.data = value; }

// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
// public static int size() { return net.minecraft.util.collection.PackedIntegerArray.size; }
// public static void size(int value, ) { net.minecraft.util.collection.PackedIntegerArray.size = value; }

// public int elementBits() { return wrapperContained.elementBits; }
// public void elementBits(int value) { wrapperContained.elementBits = value; }
// public static int elementBits() { return net.minecraft.util.collection.PackedIntegerArray.elementBits; }
// public static void elementBits(int value, ) { net.minecraft.util.collection.PackedIntegerArray.elementBits = value; }

// public long maxValue() { return wrapperContained.maxValue; }
// public void maxValue(long value) { wrapperContained.maxValue = value; }
// public static long maxValue() { return net.minecraft.util.collection.PackedIntegerArray.maxValue; }
// public static void maxValue(long value, ) { net.minecraft.util.collection.PackedIntegerArray.maxValue = value; }

// public int[] INDEX_PARAMETERS() { return wrapperContained.INDEX_PARAMETERS; }
// public void INDEX_PARAMETERS(int[] value) { wrapperContained.INDEX_PARAMETERS = value; }
// public static int[] INDEX_PARAMETERS() { return net.minecraft.util.collection.PackedIntegerArray.INDEX_PARAMETERS; }
// public static void INDEX_PARAMETERS(int[] value, ) { net.minecraft.util.collection.PackedIntegerArray.INDEX_PARAMETERS = value; }

// public int elementsPerLong() { return wrapperContained.elementsPerLong; }
// public void elementsPerLong(int value) { wrapperContained.elementsPerLong = value; }
// public static int elementsPerLong() { return net.minecraft.util.collection.PackedIntegerArray.elementsPerLong; }
// public static void elementsPerLong(int value, ) { net.minecraft.util.collection.PackedIntegerArray.elementsPerLong = value; }

// public int indexScale() { return wrapperContained.indexScale; }
// public void indexScale(int value) { wrapperContained.indexScale = value; }
// public static int indexScale() { return net.minecraft.util.collection.PackedIntegerArray.indexScale; }
// public static void indexScale(int value, ) { net.minecraft.util.collection.PackedIntegerArray.indexScale = value; }

// public int indexOffset() { return wrapperContained.indexOffset; }
// public void indexOffset(int value) { wrapperContained.indexOffset = value; }
// public static int indexOffset() { return net.minecraft.util.collection.PackedIntegerArray.indexOffset; }
// public static void indexOffset(int value, ) { net.minecraft.util.collection.PackedIntegerArray.indexOffset = value; }

// public int indexShift() { return wrapperContained.indexShift; }
// public void indexShift(int value) { wrapperContained.indexShift = value; }
// public static int indexShift() { return net.minecraft.util.collection.PackedIntegerArray.indexShift; }
// public static void indexShift(int value, ) { net.minecraft.util.collection.PackedIntegerArray.indexShift = value; }

public PackedIntegerArray(int elementBits,int size) { this.wrapperContained = new net.minecraft.util.collection.PackedIntegerArray(elementBits,size); }
// public PackedIntegerArray(int elementBits,int size,int data) { this.wrapperContained = new net.minecraft.util.collection.PackedIntegerArray(elementBits,size,data); }
// public PackedIntegerArray(int elementBits,int size,long data) { this.wrapperContained = new net.minecraft.util.collection.PackedIntegerArray(elementBits,size,data); }
// public int getStorageIndex(int index) { return wrapperContained.getStorageIndex(index); }
// public static int getStorageIndex(int index, ) { return net.minecraft.util.collection.PackedIntegerArray.getStorageIndex(index); }

}