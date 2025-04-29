package yarnwrap.util.collection;
public class IndexedIterable { public net.minecraft.util.collection.IndexedIterable wrapperContained; public IndexedIterable(net.minecraft.util.collection.IndexedIterable wrapperContained) { this.wrapperContained = wrapperContained; }

// public int ABSENT_RAW_ID() { return wrapperContained.ABSENT_RAW_ID; }
// public void ABSENT_RAW_ID(int value) { wrapperContained.ABSENT_RAW_ID = value; }
public static int ABSENT_RAW_ID() { return net.minecraft.util.collection.IndexedIterable.ABSENT_RAW_ID; }
// public static void ABSENT_RAW_ID(int value, ) { net.minecraft.util.collection.IndexedIterable.ABSENT_RAW_ID = value; }

public java.lang.Object get(int index) { return wrapperContained.get(index); }
// public static java.lang.Object get(int index, ) { return net.minecraft.util.collection.IndexedIterable.get(index); }
public int size() { return wrapperContained.size(); }
// public static int size() { return net.minecraft.util.collection.IndexedIterable.size(); }
public int getRawId(java.lang.Object value) { return wrapperContained.getRawId(value); }
// public static int getRawId(java.lang.Object value, ) { return net.minecraft.util.collection.IndexedIterable.getRawId(value); }
public java.lang.Object getOrThrow(int index) { return wrapperContained.getOrThrow(index); }
// public static java.lang.Object getOrThrow(int index, ) { return net.minecraft.util.collection.IndexedIterable.getOrThrow(index); }
public int getRawIdOrThrow(java.lang.Object value) { return wrapperContained.getRawIdOrThrow(value); }
// public static int getRawIdOrThrow(java.lang.Object value, ) { return net.minecraft.util.collection.IndexedIterable.getRawIdOrThrow(value); }

}