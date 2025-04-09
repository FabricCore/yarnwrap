package yarnwrap.util;
public class Nullables { public net.minecraft.util.Nullables wrapperContained; public Nullables(net.minecraft.util.Nullables wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.Object map(java.lang.Object value,java.util.function.Function mapper) { return wrapperContained.map(value,mapper); }
public java.lang.Object mapOrElse(java.lang.Object value,java.util.function.Function mapper,java.lang.Object other) { return wrapperContained.mapOrElse(value,mapper,other); }
public java.lang.Object mapOrElseGet(java.lang.Object value,java.util.function.Function mapper,java.util.function.Supplier getter) { return wrapperContained.mapOrElseGet(value,mapper,getter); }
public java.lang.Object getFirst(java.util.Collection collection) { return wrapperContained.getFirst(collection); }
public java.lang.Object getFirstOrElse(java.util.Collection collection,java.lang.Object defaultValue) { return wrapperContained.getFirstOrElse(collection,defaultValue); }
public java.lang.Object getFirstOrElseGet(java.util.Collection collection,java.util.function.Supplier getter) { return wrapperContained.getFirstOrElseGet(collection,getter); }
// public boolean isEmpty(byte array) { return wrapperContained.isEmpty(array); }
// public boolean isEmpty(char array) { return wrapperContained.isEmpty(array); }
// public boolean isEmpty(double array) { return wrapperContained.isEmpty(array); }
// public boolean isEmpty(float array) { return wrapperContained.isEmpty(array); }
// public boolean isEmpty(int array) { return wrapperContained.isEmpty(array); }
// public boolean isEmpty(long array) { return wrapperContained.isEmpty(array); }
public boolean isEmpty(java.lang.Object[] array) { return wrapperContained.isEmpty(array); }
// public boolean isEmpty(short array) { return wrapperContained.isEmpty(array); }
// public boolean isEmpty(boolean array) { return wrapperContained.isEmpty(array); }

}