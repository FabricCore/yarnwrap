package yarnwrap.util.collection;
public class TypeFilterableList { public net.minecraft.util.collection.TypeFilterableList wrapperContained; public TypeFilterableList(net.minecraft.util.collection.TypeFilterableList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List allElements() { return wrapperContained.allElements; }
// public void allElements(java.util.List value) { wrapperContained.allElements = value; }
// public static java.util.List allElements() { return net.minecraft.util.collection.TypeFilterableList.allElements; }
// public static void allElements(java.util.List value, ) { net.minecraft.util.collection.TypeFilterableList.allElements = value; }

// public java.util.Map elementsByType() { return wrapperContained.elementsByType; }
// public void elementsByType(java.util.Map value) { wrapperContained.elementsByType = value; }
// public static java.util.Map elementsByType() { return net.minecraft.util.collection.TypeFilterableList.elementsByType; }
// public static void elementsByType(java.util.Map value, ) { net.minecraft.util.collection.TypeFilterableList.elementsByType = value; }

// public java.lang.Class elementType() { return wrapperContained.elementType; }
// public void elementType(java.lang.Class value) { wrapperContained.elementType = value; }
// public static java.lang.Class elementType() { return net.minecraft.util.collection.TypeFilterableList.elementType; }
// public static void elementType(java.lang.Class value, ) { net.minecraft.util.collection.TypeFilterableList.elementType = value; }

public TypeFilterableList(java.lang.Class elementType) { this.wrapperContained = new net.minecraft.util.collection.TypeFilterableList(elementType); }
public boolean add(java.lang.Object e) { return wrapperContained.add(e); }
// public static boolean add(java.lang.Object e, ) { return net.minecraft.util.collection.TypeFilterableList.add(e); }
public boolean contains(java.lang.Object o) { return wrapperContained.contains(o); }
// public static boolean contains(java.lang.Object o, ) { return net.minecraft.util.collection.TypeFilterableList.contains(o); }
public java.util.Collection getAllOfType(java.lang.Class type) { return wrapperContained.getAllOfType(type); }
// public static java.util.Collection getAllOfType(java.lang.Class type, ) { return net.minecraft.util.collection.TypeFilterableList.getAllOfType(type); }
// public java.util.List method_15217(java.lang.Class typeClass) { return wrapperContained.method_15217(typeClass); }
// public static java.util.List method_15217(java.lang.Class typeClass, ) { return net.minecraft.util.collection.TypeFilterableList.method_15217(typeClass); }
public java.util.List copy() { return wrapperContained.copy(); }
// public static java.util.List copy() { return net.minecraft.util.collection.TypeFilterableList.copy(); }
public boolean remove(java.lang.Object o) { return wrapperContained.remove(o); }
// public static boolean remove(java.lang.Object o, ) { return net.minecraft.util.collection.TypeFilterableList.remove(o); }

}