package yarnwrap.util.collection;
public class Int2ObjectBiMap { public net.minecraft.util.collection.Int2ObjectBiMap wrapperContained; public Int2ObjectBiMap(net.minecraft.util.collection.Int2ObjectBiMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] ids() { return wrapperContained.ids; }
// public java.lang.Object[] idToValues() { return wrapperContained.idToValues; }
// public int size() { return wrapperContained.size; }
// public int nextId() { return wrapperContained.nextId; }
// public java.lang.Object EMPTY() { return wrapperContained.EMPTY; }
// public java.lang.Object[] values() { return wrapperContained.values; }
// public int ABSENT() { return wrapperContained.ABSENT; }
// public float LOAD_FACTOR() { return wrapperContained.LOAD_FACTOR; }
// public int getIdFromIndex(int index) { return wrapperContained.getIdFromIndex(index); }
// public int findFree(int size) { return wrapperContained.findFree(size); }
// public void resize(int newSize) { wrapperContained.resize(newSize); }
public int add(java.lang.Object value) { return wrapperContained.add(value); }
// // public int nextId() { return wrapperContained.nextId(); }
// public int getIdealIndex(java.lang.Object value) { return wrapperContained.getIdealIndex(value); }
public void clear() { wrapperContained.clear(); }
public void put(java.lang.Object value,int id) { wrapperContained.put(value,id); }
// public int findIndex(java.lang.Object value,int id) { return wrapperContained.findIndex(value,id); }
public boolean containsKey(int index) { return wrapperContained.containsKey(index); }
public boolean contains(java.lang.Object value) { return wrapperContained.contains(value); }
public yarnwrap.util.collection.Int2ObjectBiMap create(int expectedSize) { return new yarnwrap.util.collection.Int2ObjectBiMap(wrapperContained.create(expectedSize)); }
public yarnwrap.util.collection.Int2ObjectBiMap copy() { return new yarnwrap.util.collection.Int2ObjectBiMap(wrapperContained.copy()); }

}