package yarnwrap.util;
public class TypeFilter { public net.minecraft.util.TypeFilter wrapperContained; public TypeFilter(net.minecraft.util.TypeFilter wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.Class getBaseClass() { return wrapperContained.getBaseClass(); }
// public yarnwrap.util.TypeFilter instanceOf(java.lang.Class cls) { return new yarnwrap.util.TypeFilter(wrapperContained.instanceOf(cls)); }
public java.lang.Object downcast(java.lang.Object obj) { return wrapperContained.downcast(obj); }
// public yarnwrap.util.TypeFilter equals(java.lang.Class cls) { return new yarnwrap.util.TypeFilter(wrapperContained.equals(cls)); }

}