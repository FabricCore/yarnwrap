package yarnwrap.util.collection;
public class DefaultedList { public net.minecraft.util.collection.DefaultedList wrapperContained; public DefaultedList(net.minecraft.util.collection.DefaultedList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List delegate() { return wrapperContained.delegate; }
// public java.lang.Object initialElement() { return wrapperContained.initialElement; }
public yarnwrap.util.collection.DefaultedList of() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.of()); }
public yarnwrap.util.collection.DefaultedList copyOf(java.lang.Object defaultValue,java.lang.Object[] values) { return new yarnwrap.util.collection.DefaultedList(wrapperContained.copyOf(defaultValue,values)); }
public yarnwrap.util.collection.DefaultedList ofSize(int size,java.lang.Object defaultValue) { return new yarnwrap.util.collection.DefaultedList(wrapperContained.ofSize(size,defaultValue)); }
public yarnwrap.util.collection.DefaultedList ofSize(int size) { return new yarnwrap.util.collection.DefaultedList(wrapperContained.ofSize(size)); }

}