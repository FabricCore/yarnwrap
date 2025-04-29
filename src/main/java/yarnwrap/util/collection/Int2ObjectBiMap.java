package yarnwrap.util.collection;
public class Int2ObjectBiMap { public net.minecraft.util.collection.Int2ObjectBiMap wrapperContained; public Int2ObjectBiMap(net.minecraft.util.collection.Int2ObjectBiMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] ids() { return wrapperContained.ids; }
// public void ids(int[] value) { wrapperContained.ids = value; }
// public static int[] ids() { return net.minecraft.util.collection.Int2ObjectBiMap.ids; }
// public static void ids(int[] value, ) { net.minecraft.util.collection.Int2ObjectBiMap.ids = value; }

// public java.lang.Object[] idToValues() { return wrapperContained.idToValues; }
// public void idToValues(java.lang.Object[] value) { wrapperContained.idToValues = value; }
// public static java.lang.Object[] idToValues() { return net.minecraft.util.collection.Int2ObjectBiMap.idToValues; }
// public static void idToValues(java.lang.Object[] value, ) { net.minecraft.util.collection.Int2ObjectBiMap.idToValues = value; }

// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
// public static int size() { return net.minecraft.util.collection.Int2ObjectBiMap.size; }
// public static void size(int value, ) { net.minecraft.util.collection.Int2ObjectBiMap.size = value; }

// public int nextId() { return wrapperContained.nextId; }
// public void nextId(int value) { wrapperContained.nextId = value; }
// public static int nextId() { return net.minecraft.util.collection.Int2ObjectBiMap.nextId; }
// public static void nextId(int value, ) { net.minecraft.util.collection.Int2ObjectBiMap.nextId = value; }

// public java.lang.Object EMPTY() { return wrapperContained.EMPTY; }
// public void EMPTY(java.lang.Object value) { wrapperContained.EMPTY = value; }
// // public static java.lang.Object EMPTY() { return net.minecraft.util.collection.Int2ObjectBiMap.EMPTY; }
// public static void EMPTY(java.lang.Object value, ) { net.minecraft.util.collection.Int2ObjectBiMap.EMPTY = value; }

// public java.lang.Object[] values() { return wrapperContained.values; }
// public void values(java.lang.Object[] value) { wrapperContained.values = value; }
// public static java.lang.Object[] values() { return net.minecraft.util.collection.Int2ObjectBiMap.values; }
// public static void values(java.lang.Object[] value, ) { net.minecraft.util.collection.Int2ObjectBiMap.values = value; }

// public int ABSENT() { return wrapperContained.ABSENT; }
// public void ABSENT(int value) { wrapperContained.ABSENT = value; }
// public static int ABSENT() { return net.minecraft.util.collection.Int2ObjectBiMap.ABSENT; }
// public static void ABSENT(int value, ) { net.minecraft.util.collection.Int2ObjectBiMap.ABSENT = value; }

// public float LOAD_FACTOR() { return wrapperContained.LOAD_FACTOR; }
// public void LOAD_FACTOR(float value) { wrapperContained.LOAD_FACTOR = value; }
// public static float LOAD_FACTOR() { return net.minecraft.util.collection.Int2ObjectBiMap.LOAD_FACTOR; }
// public static void LOAD_FACTOR(float value, ) { net.minecraft.util.collection.Int2ObjectBiMap.LOAD_FACTOR = value; }

// public Int2ObjectBiMap(int size) { this.wrapperContained = new net.minecraft.util.collection.Int2ObjectBiMap(size); }
// public Int2ObjectBiMap(java.lang.Object[] values,int ids,java.lang.Object[][] idToValues,int nextId,int size) { this.wrapperContained = new net.minecraft.util.collection.Int2ObjectBiMap(values,ids,idToValues,nextId,size); }
// public int getIdFromIndex(int index) { return wrapperContained.getIdFromIndex(index); }
// public static int getIdFromIndex(int index, ) { return net.minecraft.util.collection.Int2ObjectBiMap.getIdFromIndex(index); }
// public int findFree(int size) { return wrapperContained.findFree(size); }
// public static int findFree(int size, ) { return net.minecraft.util.collection.Int2ObjectBiMap.findFree(size); }
// public void resize(int newSize) { wrapperContained.resize(newSize); }
// public static void resize(int newSize, ) { net.minecraft.util.collection.Int2ObjectBiMap.resize(newSize); }
public int add(java.lang.Object value) { return wrapperContained.add(value); }
// public static int add(java.lang.Object value, ) { return net.minecraft.util.collection.Int2ObjectBiMap.add(value); }
// // public int nextId() { return wrapperContained.nextId(); }
// // public static int nextId() { return net.minecraft.util.collection.Int2ObjectBiMap.nextId(); }
// public int getIdealIndex(java.lang.Object value) { return wrapperContained.getIdealIndex(value); }
// public static int getIdealIndex(java.lang.Object value, ) { return net.minecraft.util.collection.Int2ObjectBiMap.getIdealIndex(value); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.util.collection.Int2ObjectBiMap.clear(); }
public void put(java.lang.Object value,int id) { wrapperContained.put(value,id); }
// public static void put(java.lang.Object value,int id, ) { net.minecraft.util.collection.Int2ObjectBiMap.put(value,id); }
// public int findIndex(java.lang.Object value,int id) { return wrapperContained.findIndex(value,id); }
// public static int findIndex(java.lang.Object value,int id, ) { return net.minecraft.util.collection.Int2ObjectBiMap.findIndex(value,id); }
public boolean containsKey(int index) { return wrapperContained.containsKey(index); }
// public static boolean containsKey(int index, ) { return net.minecraft.util.collection.Int2ObjectBiMap.containsKey(index); }
public boolean contains(java.lang.Object value) { return wrapperContained.contains(value); }
// public static boolean contains(java.lang.Object value, ) { return net.minecraft.util.collection.Int2ObjectBiMap.contains(value); }
// public yarnwrap.util.collection.Int2ObjectBiMap create(int expectedSize) { return new yarnwrap.util.collection.Int2ObjectBiMap(wrapperContained.create(expectedSize)); }
// public static yarnwrap.util.collection.Int2ObjectBiMap create(int expectedSize, ) { return new yarnwrap.util.collection.Int2ObjectBiMap(net.minecraft.util.collection.Int2ObjectBiMap.create(expectedSize)); }
public yarnwrap.util.collection.Int2ObjectBiMap copy() { return new yarnwrap.util.collection.Int2ObjectBiMap(wrapperContained.copy()); }
// public static yarnwrap.util.collection.Int2ObjectBiMap copy() { return new yarnwrap.util.collection.Int2ObjectBiMap(net.minecraft.util.collection.Int2ObjectBiMap.copy()); }

}