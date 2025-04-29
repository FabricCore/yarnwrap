package yarnwrap.util.collection;
public class DefaultedList { public net.minecraft.util.collection.DefaultedList wrapperContained; public DefaultedList(net.minecraft.util.collection.DefaultedList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List delegate() { return wrapperContained.delegate; }
// public void delegate(java.util.List value) { wrapperContained.delegate = value; }
// public static java.util.List delegate() { return net.minecraft.util.collection.DefaultedList.delegate; }
// public static void delegate(java.util.List value, ) { net.minecraft.util.collection.DefaultedList.delegate = value; }

// public java.lang.Object initialElement() { return wrapperContained.initialElement; }
// public void initialElement(java.lang.Object value) { wrapperContained.initialElement = value; }
// // public static java.lang.Object initialElement() { return net.minecraft.util.collection.DefaultedList.initialElement; }
// public static void initialElement(java.lang.Object value, ) { net.minecraft.util.collection.DefaultedList.initialElement = value; }

// public DefaultedList(java.util.List delegate,java.lang.Object initialElement) { this.wrapperContained = new net.minecraft.util.collection.DefaultedList(delegate,initialElement); }
public void add(int index,java.lang.Object element) { wrapperContained.add(index,element); }
// public static void add(int index,java.lang.Object element, ) { net.minecraft.util.collection.DefaultedList.add(index,element); }
public java.lang.Object get(int index) { return wrapperContained.get(index); }
// public static java.lang.Object get(int index, ) { return net.minecraft.util.collection.DefaultedList.get(index); }
// public yarnwrap.util.collection.DefaultedList of() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.of()); }
public static yarnwrap.util.collection.DefaultedList of() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.util.collection.DefaultedList.of()); }
// public yarnwrap.util.collection.DefaultedList copyOf(java.lang.Object defaultValue,java.lang.Object[] values) { return new yarnwrap.util.collection.DefaultedList(wrapperContained.copyOf(defaultValue,values)); }
// public static yarnwrap.util.collection.DefaultedList copyOf(java.lang.Object defaultValue,java.lang.Object[] values, ) { return new yarnwrap.util.collection.DefaultedList(net.minecraft.util.collection.DefaultedList.copyOf(defaultValue,values)); }
// public yarnwrap.util.collection.DefaultedList ofSize(int size,java.lang.Object defaultValue) { return new yarnwrap.util.collection.DefaultedList(wrapperContained.ofSize(size,defaultValue)); }
// public static yarnwrap.util.collection.DefaultedList ofSize(int size,java.lang.Object defaultValue, ) { return new yarnwrap.util.collection.DefaultedList(net.minecraft.util.collection.DefaultedList.ofSize(size,defaultValue)); }
// public yarnwrap.util.collection.DefaultedList ofSize(int size) { return new yarnwrap.util.collection.DefaultedList(wrapperContained.ofSize(size)); }
// public static yarnwrap.util.collection.DefaultedList ofSize(int size, ) { return new yarnwrap.util.collection.DefaultedList(net.minecraft.util.collection.DefaultedList.ofSize(size)); }
public java.lang.Object remove(int index) { return wrapperContained.remove(index); }
// public static java.lang.Object remove(int index, ) { return net.minecraft.util.collection.DefaultedList.remove(index); }
public java.lang.Object set(int index,java.lang.Object element) { return wrapperContained.set(index,element); }
// public static java.lang.Object set(int index,java.lang.Object element, ) { return net.minecraft.util.collection.DefaultedList.set(index,element); }

}