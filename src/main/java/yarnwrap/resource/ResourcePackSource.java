package yarnwrap.resource;
public class ResourcePackSource { public net.minecraft.resource.ResourcePackSource wrapperContained; public ResourcePackSource(net.minecraft.resource.ResourcePackSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.ResourcePackSource NONE() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.NONE); }
// public void NONE(yarnwrap.resource.ResourcePackSource value) { wrapperContained.NONE = value.wrapperContained; }
public static yarnwrap.resource.ResourcePackSource NONE() { return new yarnwrap.resource.ResourcePackSource(net.minecraft.resource.ResourcePackSource.NONE); }
// public static void NONE(yarnwrap.resource.ResourcePackSource value, ) { net.minecraft.resource.ResourcePackSource.NONE = value.wrapperContained; }

// public yarnwrap.resource.ResourcePackSource BUILTIN() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.BUILTIN); }
// public void BUILTIN(yarnwrap.resource.ResourcePackSource value) { wrapperContained.BUILTIN = value.wrapperContained; }
public static yarnwrap.resource.ResourcePackSource BUILTIN() { return new yarnwrap.resource.ResourcePackSource(net.minecraft.resource.ResourcePackSource.BUILTIN); }
// public static void BUILTIN(yarnwrap.resource.ResourcePackSource value, ) { net.minecraft.resource.ResourcePackSource.BUILTIN = value.wrapperContained; }

// public yarnwrap.resource.ResourcePackSource WORLD() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.WORLD); }
// public void WORLD(yarnwrap.resource.ResourcePackSource value) { wrapperContained.WORLD = value.wrapperContained; }
public static yarnwrap.resource.ResourcePackSource WORLD() { return new yarnwrap.resource.ResourcePackSource(net.minecraft.resource.ResourcePackSource.WORLD); }
// public static void WORLD(yarnwrap.resource.ResourcePackSource value, ) { net.minecraft.resource.ResourcePackSource.WORLD = value.wrapperContained; }

// public yarnwrap.resource.ResourcePackSource SERVER() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.SERVER); }
// public void SERVER(yarnwrap.resource.ResourcePackSource value) { wrapperContained.SERVER = value.wrapperContained; }
public static yarnwrap.resource.ResourcePackSource SERVER() { return new yarnwrap.resource.ResourcePackSource(net.minecraft.resource.ResourcePackSource.SERVER); }
// public static void SERVER(yarnwrap.resource.ResourcePackSource value, ) { net.minecraft.resource.ResourcePackSource.SERVER = value.wrapperContained; }

// public java.util.function.UnaryOperator NONE_SOURCE_TEXT_SUPPLIER() { return wrapperContained.NONE_SOURCE_TEXT_SUPPLIER; }
// public void NONE_SOURCE_TEXT_SUPPLIER(java.util.function.UnaryOperator value) { wrapperContained.NONE_SOURCE_TEXT_SUPPLIER = value; }
public static java.util.function.UnaryOperator NONE_SOURCE_TEXT_SUPPLIER() { return net.minecraft.resource.ResourcePackSource.NONE_SOURCE_TEXT_SUPPLIER; }
// public static void NONE_SOURCE_TEXT_SUPPLIER(java.util.function.UnaryOperator value, ) { net.minecraft.resource.ResourcePackSource.NONE_SOURCE_TEXT_SUPPLIER = value; }

// public yarnwrap.resource.ResourcePackSource FEATURE() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.FEATURE); }
// public void FEATURE(yarnwrap.resource.ResourcePackSource value) { wrapperContained.FEATURE = value.wrapperContained; }
public static yarnwrap.resource.ResourcePackSource FEATURE() { return new yarnwrap.resource.ResourcePackSource(net.minecraft.resource.ResourcePackSource.FEATURE); }
// public static void FEATURE(yarnwrap.resource.ResourcePackSource value, ) { net.minecraft.resource.ResourcePackSource.FEATURE = value.wrapperContained; }

public boolean canBeEnabledLater() { return wrapperContained.canBeEnabledLater(); }
// public static boolean canBeEnabledLater() { return net.minecraft.resource.ResourcePackSource.canBeEnabledLater(); }
// // public java.util.function.UnaryOperator getSourceTextSupplier(java.lang.String translationKey) { return wrapperContained.getSourceTextSupplier(translationKey); }
// public static java.util.function.UnaryOperator getSourceTextSupplier(java.lang.String translationKey, ) { return net.minecraft.resource.ResourcePackSource.getSourceTextSupplier(translationKey); }
// public yarnwrap.resource.ResourcePackSource create(java.util.function.UnaryOperator sourceTextSupplier,boolean canBeEnabledLater) { return new yarnwrap.resource.ResourcePackSource(wrapperContained.create(sourceTextSupplier,canBeEnabledLater)); }
// public static yarnwrap.resource.ResourcePackSource create(java.util.function.UnaryOperator sourceTextSupplier,boolean canBeEnabledLater, ) { return new yarnwrap.resource.ResourcePackSource(net.minecraft.resource.ResourcePackSource.create(sourceTextSupplier,canBeEnabledLater)); }
public yarnwrap.text.Text decorate(yarnwrap.text.Text packDisplayName) { return new yarnwrap.text.Text(wrapperContained.decorate(packDisplayName.wrapperContained)); }
// public static yarnwrap.text.Text decorate(yarnwrap.text.Text packDisplayName, ) { return new yarnwrap.text.Text(net.minecraft.resource.ResourcePackSource.decorate(packDisplayName.wrapperContained)); }
// public yarnwrap.text.Text method_45283(yarnwrap.text.Text name) { return new yarnwrap.text.Text(wrapperContained.method_45283(name.wrapperContained)); }
// public static yarnwrap.text.Text method_45283(yarnwrap.text.Text name, ) { return new yarnwrap.text.Text(net.minecraft.resource.ResourcePackSource.method_45283(name.wrapperContained)); }

}