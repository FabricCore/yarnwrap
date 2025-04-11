package yarnwrap.util.collection;
public class TypeFilterableList { public net.minecraft.util.collection.TypeFilterableList wrapperContained; public TypeFilterableList(net.minecraft.util.collection.TypeFilterableList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List allElements() { return wrapperContained.allElements; }
// public void allElements(java.util.List value) { wrapperContained.allElements = value; }
// public java.util.Map elementsByType() { return wrapperContained.elementsByType; }
// public void elementsByType(java.util.Map value) { wrapperContained.elementsByType = value; }
// public java.lang.Class elementType() { return wrapperContained.elementType; }
// public void elementType(java.lang.Class value) { wrapperContained.elementType = value; }
public TypeFilterableList(java.lang.Class elementType) { this.wrapperContained = new net.minecraft.util.collection.TypeFilterableList(elementType); }
public boolean add(java.lang.Object e) { return wrapperContained.add(e); }
public boolean contains(java.lang.Object o) { return wrapperContained.contains(o); }
public java.util.Collection getAllOfType(java.lang.Class type) { return wrapperContained.getAllOfType(type); }
// public java.util.List method_15217(java.lang.Class typeClass) { return wrapperContained.method_15217(typeClass); }
public java.util.List copy() { return wrapperContained.copy(); }
public boolean remove(java.lang.Object o) { return wrapperContained.remove(o); }

}