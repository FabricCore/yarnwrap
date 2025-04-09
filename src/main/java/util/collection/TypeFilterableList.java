package yarnwrap.util.collection;
public class TypeFilterableList { public net.minecraft.util.collection.TypeFilterableList wrapperContained; public TypeFilterableList(net.minecraft.util.collection.TypeFilterableList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List allElements() { return wrapperContained.allElements; }
// public java.util.Map elementsByType() { return wrapperContained.elementsByType; }
// public java.lang.Class elementType() { return wrapperContained.elementType; }
public java.util.Collection getAllOfType(java.lang.Class type) { return wrapperContained.getAllOfType(type); }
public java.util.List copy() { return wrapperContained.copy(); }

}