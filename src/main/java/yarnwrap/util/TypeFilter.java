package yarnwrap.util;
public class TypeFilter { public net.minecraft.util.TypeFilter wrapperContained; public TypeFilter(net.minecraft.util.TypeFilter wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.Class getBaseClass() { return wrapperContained.getBaseClass(); }
// public static java.lang.Class getBaseClass() { return net.minecraft.util.TypeFilter.getBaseClass(); }
// public yarnwrap.util.TypeFilter instanceOf(java.lang.Class cls) { return new yarnwrap.util.TypeFilter(wrapperContained.instanceOf(cls)); }
// public static yarnwrap.util.TypeFilter instanceOf(java.lang.Class cls, ) { return new yarnwrap.util.TypeFilter(net.minecraft.util.TypeFilter.instanceOf(cls)); }
public java.lang.Object downcast(java.lang.Object obj) { return wrapperContained.downcast(obj); }
// public static java.lang.Object downcast(java.lang.Object obj, ) { return net.minecraft.util.TypeFilter.downcast(obj); }
// public yarnwrap.util.TypeFilter equals(java.lang.Class cls) { return new yarnwrap.util.TypeFilter(wrapperContained.equals(cls)); }
// public static yarnwrap.util.TypeFilter equals(java.lang.Class cls, ) { return new yarnwrap.util.TypeFilter(net.minecraft.util.TypeFilter.equals(cls)); }

}