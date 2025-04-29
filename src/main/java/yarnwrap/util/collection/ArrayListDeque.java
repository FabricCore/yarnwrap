package yarnwrap.util.collection;
public class ArrayListDeque { public net.minecraft.util.collection.ArrayListDeque wrapperContained; public ArrayListDeque(net.minecraft.util.collection.ArrayListDeque wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MISSING() { return wrapperContained.MISSING; }
// public void MISSING(int value) { wrapperContained.MISSING = value; }
// public static int MISSING() { return net.minecraft.util.collection.ArrayListDeque.MISSING; }
// public static void MISSING(int value, ) { net.minecraft.util.collection.ArrayListDeque.MISSING = value; }

// public java.lang.Object[] array() { return wrapperContained.array; }
// public void array(java.lang.Object[] value) { wrapperContained.array = value; }
// public static java.lang.Object[] array() { return net.minecraft.util.collection.ArrayListDeque.array; }
// public static void array(java.lang.Object[] value, ) { net.minecraft.util.collection.ArrayListDeque.array = value; }

// public int startIndex() { return wrapperContained.startIndex; }
// public void startIndex(int value) { wrapperContained.startIndex = value; }
// public static int startIndex() { return net.minecraft.util.collection.ArrayListDeque.startIndex; }
// public static void startIndex(int value, ) { net.minecraft.util.collection.ArrayListDeque.startIndex = value; }

// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
// public static int size() { return net.minecraft.util.collection.ArrayListDeque.size; }
// public static void size(int value, ) { net.minecraft.util.collection.ArrayListDeque.size = value; }

public ArrayListDeque(int size) { this.wrapperContained = new net.minecraft.util.collection.ArrayListDeque(size); }
public void add(int index,java.lang.Object value) { wrapperContained.add(index,value); }
// public static void add(int index,java.lang.Object value, ) { net.minecraft.util.collection.ArrayListDeque.add(index,value); }
public void addFirst(java.lang.Object value) { wrapperContained.addFirst(value); }
// public static void addFirst(java.lang.Object value, ) { net.minecraft.util.collection.ArrayListDeque.addFirst(value); }
public void addLast(java.lang.Object value) { wrapperContained.addLast(value); }
// public static void addLast(java.lang.Object value, ) { net.minecraft.util.collection.ArrayListDeque.addLast(value); }
public void forEach(java.util.function.Consumer consumer) { wrapperContained.forEach(consumer); }
// public static void forEach(java.util.function.Consumer consumer, ) { net.minecraft.util.collection.ArrayListDeque.forEach(consumer); }
public java.lang.Object get(int index) { return wrapperContained.get(index); }
// public static java.lang.Object get(int index, ) { return net.minecraft.util.collection.ArrayListDeque.get(index); }
public int getArrayLength() { return wrapperContained.getArrayLength(); }
// public static int getArrayLength() { return net.minecraft.util.collection.ArrayListDeque.getArrayLength(); }
// public int wrap(int index) { return wrapperContained.wrap(index); }
// public static int wrap(int index, ) { return net.minecraft.util.collection.ArrayListDeque.wrap(index); }
// public void checkBounds(int start,int end) { wrapperContained.checkBounds(start,end); }
// public static void checkBounds(int start,int end, ) { net.minecraft.util.collection.ArrayListDeque.checkBounds(start,end); }
// public void copyTo(java.lang.Object[] array,int size) { wrapperContained.copyTo(array,size); }
// public static void copyTo(java.lang.Object[] array,int size, ) { net.minecraft.util.collection.ArrayListDeque.copyTo(array,size); }
// public void enlarge() { wrapperContained.enlarge(); }
// public static void enlarge() { net.minecraft.util.collection.ArrayListDeque.enlarge(); }
// public void checkBounds(int index) { wrapperContained.checkBounds(index); }
// public static void checkBounds(int index, ) { net.minecraft.util.collection.ArrayListDeque.checkBounds(index); }
// public java.lang.Object getRaw(int index) { return wrapperContained.getRaw(index); }
// public static java.lang.Object getRaw(int index, ) { return net.minecraft.util.collection.ArrayListDeque.getRaw(index); }
public boolean offerFirst(java.lang.Object value) { return wrapperContained.offerFirst(value); }
// public static boolean offerFirst(java.lang.Object value, ) { return net.minecraft.util.collection.ArrayListDeque.offerFirst(value); }
public boolean offerLast(java.lang.Object value) { return wrapperContained.offerLast(value); }
// public static boolean offerLast(java.lang.Object value, ) { return net.minecraft.util.collection.ArrayListDeque.offerLast(value); }
public java.lang.Object remove(int index) { return wrapperContained.remove(index); }
// public static java.lang.Object remove(int index, ) { return net.minecraft.util.collection.ArrayListDeque.remove(index); }
public boolean removeFirstOccurrence(java.lang.Object value) { return wrapperContained.removeFirstOccurrence(value); }
// public static boolean removeFirstOccurrence(java.lang.Object value, ) { return net.minecraft.util.collection.ArrayListDeque.removeFirstOccurrence(value); }
public boolean removeIf(java.util.function.Predicate predicate) { return wrapperContained.removeIf(predicate); }
// public static boolean removeIf(java.util.function.Predicate predicate, ) { return net.minecraft.util.collection.ArrayListDeque.removeIf(predicate); }
public boolean removeLastOccurrence(java.lang.Object value) { return wrapperContained.removeLastOccurrence(value); }
// public static boolean removeLastOccurrence(java.lang.Object value, ) { return net.minecraft.util.collection.ArrayListDeque.removeLastOccurrence(value); }
public void replaceAll(java.util.function.UnaryOperator mapper) { wrapperContained.replaceAll(mapper); }
// public static void replaceAll(java.util.function.UnaryOperator mapper, ) { net.minecraft.util.collection.ArrayListDeque.replaceAll(mapper); }
public java.lang.Object set(int index,java.lang.Object value) { return wrapperContained.set(index,value); }
// public static java.lang.Object set(int index,java.lang.Object value, ) { return net.minecraft.util.collection.ArrayListDeque.set(index,value); }

}