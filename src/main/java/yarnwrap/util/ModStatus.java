package yarnwrap.util;
public class ModStatus { public net.minecraft.util.ModStatus wrapperContained; public ModStatus(net.minecraft.util.ModStatus wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isModded() { return wrapperContained.isModded(); }
// public static boolean isModded() { return net.minecraft.util.ModStatus.isModded(); }
public yarnwrap.util.ModStatus combine(yarnwrap.util.ModStatus brand) { return new yarnwrap.util.ModStatus(wrapperContained.combine(brand.wrapperContained)); }
// public static yarnwrap.util.ModStatus combine(yarnwrap.util.ModStatus brand, ) { return new yarnwrap.util.ModStatus(net.minecraft.util.ModStatus.combine(brand.wrapperContained)); }
// public yarnwrap.util.ModStatus check(java.lang.String vanillaBrand,java.util.function.Supplier brandSupplier,java.lang.String environment,java.lang.Class clazz) { return new yarnwrap.util.ModStatus(wrapperContained.check(vanillaBrand,brandSupplier,environment,clazz)); }
// public static yarnwrap.util.ModStatus check(java.lang.String vanillaBrand,java.util.function.Supplier brandSupplier,java.lang.String environment,java.lang.Class clazz, ) { return new yarnwrap.util.ModStatus(net.minecraft.util.ModStatus.check(vanillaBrand,brandSupplier,environment,clazz)); }
public java.lang.String getMessage() { return wrapperContained.getMessage(); }
// public static java.lang.String getMessage() { return net.minecraft.util.ModStatus.getMessage(); }

}