package yarnwrap.util;
public class Lazy { public net.minecraft.util.Lazy wrapperContained; public Lazy(net.minecraft.util.Lazy wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier supplier() { return wrapperContained.supplier; }
public java.lang.Object get() { return wrapperContained.get(); }

}