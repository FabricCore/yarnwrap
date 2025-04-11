package yarnwrap.util.collection;
public class ArrayListDeque { public net.minecraft.util.collection.ArrayListDeque wrapperContained; public ArrayListDeque(net.minecraft.util.collection.ArrayListDeque wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MISSING() { return wrapperContained.MISSING; }
// public void MISSING(int value) { wrapperContained.MISSING = value; }
// public java.lang.Object[] array() { return wrapperContained.array; }
// public void array(java.lang.Object[] value) { wrapperContained.array = value; }
// public int startIndex() { return wrapperContained.startIndex; }
// public void startIndex(int value) { wrapperContained.startIndex = value; }
// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
public ArrayListDeque(int size) { this.wrapperContained = new net.minecraft.util.collection.ArrayListDeque(size); }
public void add(int index,java.lang.Object value) { wrapperContained.add(index,value); }
public void addFirst(java.lang.Object value) { wrapperContained.addFirst(value); }
public void addLast(java.lang.Object value) { wrapperContained.addLast(value); }
public void forEach(java.util.function.Consumer consumer) { wrapperContained.forEach(consumer); }
public java.lang.Object get(int index) { return wrapperContained.get(index); }
public int getArrayLength() { return wrapperContained.getArrayLength(); }
// public int wrap(int index) { return wrapperContained.wrap(index); }
// public void checkBounds(int start,int end) { wrapperContained.checkBounds(start,end); }
// public void copyTo(java.lang.Object[] array,int size) { wrapperContained.copyTo(array,size); }
// public void enlarge() { wrapperContained.enlarge(); }
// public void checkBounds(int index) { wrapperContained.checkBounds(index); }
// public java.lang.Object getRaw(int index) { return wrapperContained.getRaw(index); }
public boolean offerFirst(java.lang.Object value) { return wrapperContained.offerFirst(value); }
public boolean offerLast(java.lang.Object value) { return wrapperContained.offerLast(value); }
public java.lang.Object remove(int index) { return wrapperContained.remove(index); }
public boolean removeFirstOccurrence(java.lang.Object value) { return wrapperContained.removeFirstOccurrence(value); }
public boolean removeIf(java.util.function.Predicate predicate) { return wrapperContained.removeIf(predicate); }
public boolean removeLastOccurrence(java.lang.Object value) { return wrapperContained.removeLastOccurrence(value); }
public void replaceAll(java.util.function.UnaryOperator mapper) { wrapperContained.replaceAll(mapper); }
public java.lang.Object set(int index,java.lang.Object value) { return wrapperContained.set(index,value); }

}