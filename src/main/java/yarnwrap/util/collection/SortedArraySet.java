package yarnwrap.util.collection;
public class SortedArraySet { public net.minecraft.util.collection.SortedArraySet wrapperContained; public SortedArraySet(net.minecraft.util.collection.SortedArraySet wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Comparator comparator() { return wrapperContained.comparator; }
// public void comparator(java.util.Comparator value) { wrapperContained.comparator = value; }
// public java.lang.Object[] elements() { return wrapperContained.elements; }
// public void elements(java.lang.Object[] value) { wrapperContained.elements = value; }
// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
// public int DEFAULT_CAPACITY() { return wrapperContained.DEFAULT_CAPACITY; }
// public void DEFAULT_CAPACITY(int value) { wrapperContained.DEFAULT_CAPACITY = value; }
// public SortedArraySet(int initialCapacity,java.util.Comparator comparator) { this.wrapperContained = new net.minecraft.util.collection.SortedArraySet(initialCapacity,comparator); }
public boolean add(java.lang.Object object) { return wrapperContained.add(object); }
public boolean contains(java.lang.Object object) { return wrapperContained.contains(object); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public yarnwrap.util.collection.SortedArraySet create(int initialCapacity) { return new yarnwrap.util.collection.SortedArraySet(wrapperContained.create(initialCapacity)); }
public java.lang.Object addAndGet(java.lang.Object object) { return wrapperContained.addAndGet(object); }
// public void add(java.lang.Object object,int index) { wrapperContained.add(object,index); }
// public java.lang.Object[] cast(java.lang.Object[] array) { return wrapperContained.cast(array); }
public java.lang.Object first() { return wrapperContained.first(); }
// public int insertionPoint(int binarySearchResult) { return wrapperContained.insertionPoint(binarySearchResult); }
// public void ensureCapacity(int minCapacity) { wrapperContained.ensureCapacity(minCapacity); }
// public int binarySearch(java.lang.Object object) { return wrapperContained.binarySearch(object); }
public void remove(int index) { wrapperContained.remove(index); }
// public java.lang.Object get(int index) { return wrapperContained.get(index); }
public yarnwrap.util.collection.SortedArraySet create() { return new yarnwrap.util.collection.SortedArraySet(wrapperContained.create()); }
public yarnwrap.util.collection.SortedArraySet create(java.util.Comparator comparator) { return new yarnwrap.util.collection.SortedArraySet(wrapperContained.create(comparator)); }
public yarnwrap.util.collection.SortedArraySet create(java.util.Comparator comparator,int initialCapacity) { return new yarnwrap.util.collection.SortedArraySet(wrapperContained.create(comparator,initialCapacity)); }
public java.lang.Object getIfContains(java.lang.Object object) { return wrapperContained.getIfContains(object); }
public java.lang.Object last() { return wrapperContained.last(); }
public boolean remove(java.lang.Object object) { return wrapperContained.remove(object); }
public java.lang.Object[] toArray(java.lang.Object[] array) { return wrapperContained.toArray(array); }

}