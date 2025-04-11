package yarnwrap.util;
public class Lazy { public net.minecraft.util.Lazy wrapperContained; public Lazy(net.minecraft.util.Lazy wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier supplier() { return wrapperContained.supplier; }
// public void supplier(java.util.function.Supplier value) { wrapperContained.supplier = value; }
public Lazy(java.util.function.Supplier delegate) { this.wrapperContained = new net.minecraft.util.Lazy(delegate); }
public java.lang.Object get() { return wrapperContained.get(); }

}