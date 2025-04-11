package yarnwrap.util.collection;
public class TypeFilterableList { public net.minecraft.util.collection.TypeFilterableList wrapperContained; public TypeFilterableList(net.minecraft.util.collection.TypeFilterableList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List allElements() { return wrapperContained.allElements; }
// public void allElements(java.util.List value) { wrapperContained.allElements = value; }
// public java.util.Map elementsByType() { return wrapperContained.elementsByType; }
// public void elementsByType(java.util.Map value) { wrapperContained.elementsByType = value; }
// public java.lang.Class elementType() { return wrapperContained.elementType; }
// public void elementType(java.lang.Class value) { wrapperContained.elementType = value; }
public java.util.Collection getAllOfType(java.lang.Class type) { return wrapperContained.getAllOfType(type); }
public java.util.List copy() { return wrapperContained.copy(); }

}