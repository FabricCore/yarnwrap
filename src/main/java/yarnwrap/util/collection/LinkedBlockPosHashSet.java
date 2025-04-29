package yarnwrap.util.collection;
public class LinkedBlockPosHashSet { public net.minecraft.util.collection.LinkedBlockPosHashSet wrapperContained; public LinkedBlockPosHashSet(net.minecraft.util.collection.LinkedBlockPosHashSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object buffer() { return wrapperContained.buffer; }
// // public void buffer(Object value) { wrapperContained.buffer = value; }
// // public static Object buffer() { return net.minecraft.util.collection.LinkedBlockPosHashSet.buffer; }
// // public static void buffer(Object value, ) { net.minecraft.util.collection.LinkedBlockPosHashSet.buffer = value; }

public LinkedBlockPosHashSet(int expectedSize,float loadFactor) { this.wrapperContained = new net.minecraft.util.collection.LinkedBlockPosHashSet(expectedSize,loadFactor); }
public boolean add(long posLong) { return wrapperContained.add(posLong); }
// public static boolean add(long posLong, ) { return net.minecraft.util.collection.LinkedBlockPosHashSet.add(posLong); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.util.collection.LinkedBlockPosHashSet.isEmpty(); }
public boolean rem(long posLong) { return wrapperContained.rem(posLong); }
// public static boolean rem(long posLong, ) { return net.minecraft.util.collection.LinkedBlockPosHashSet.rem(posLong); }
public long removeFirstLong() { return wrapperContained.removeFirstLong(); }
// public static long removeFirstLong() { return net.minecraft.util.collection.LinkedBlockPosHashSet.removeFirstLong(); }
public int size() { return wrapperContained.size(); }
// public static int size() { return net.minecraft.util.collection.LinkedBlockPosHashSet.size(); }

}