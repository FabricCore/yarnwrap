package yarnwrap.resource;
public class ResourcePackSource { public net.minecraft.resource.ResourcePackSource wrapperContained; public ResourcePackSource(net.minecraft.resource.ResourcePackSource wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.resource.ResourcePackSource NONE() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.NONE); }
// public void NONE(yarnwrap.resource.ResourcePackSource value) { wrapperContained.NONE = value.wrapperContained; }
public yarnwrap.resource.ResourcePackSource BUILTIN() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.BUILTIN); }
// public void BUILTIN(yarnwrap.resource.ResourcePackSource value) { wrapperContained.BUILTIN = value.wrapperContained; }
public yarnwrap.resource.ResourcePackSource WORLD() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.WORLD); }
// public void WORLD(yarnwrap.resource.ResourcePackSource value) { wrapperContained.WORLD = value.wrapperContained; }
public yarnwrap.resource.ResourcePackSource SERVER() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.SERVER); }
// public void SERVER(yarnwrap.resource.ResourcePackSource value) { wrapperContained.SERVER = value.wrapperContained; }
public java.util.function.UnaryOperator NONE_SOURCE_TEXT_SUPPLIER() { return wrapperContained.NONE_SOURCE_TEXT_SUPPLIER; }
// public void NONE_SOURCE_TEXT_SUPPLIER(java.util.function.UnaryOperator value) { wrapperContained.NONE_SOURCE_TEXT_SUPPLIER = value; }
public yarnwrap.resource.ResourcePackSource FEATURE() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.FEATURE); }
// public void FEATURE(yarnwrap.resource.ResourcePackSource value) { wrapperContained.FEATURE = value.wrapperContained; }
public boolean canBeEnabledLater() { return wrapperContained.canBeEnabledLater(); }
// // public java.util.function.UnaryOperator getSourceTextSupplier(java.lang.String translationKey) { return wrapperContained.getSourceTextSupplier(translationKey); }
// public yarnwrap.resource.ResourcePackSource create(java.util.function.UnaryOperator sourceTextSupplier,boolean canBeEnabledLater) { return new yarnwrap.resource.ResourcePackSource(wrapperContained.create(sourceTextSupplier,canBeEnabledLater)); }
public yarnwrap.text.Text decorate(yarnwrap.text.Text packDisplayName) { return new yarnwrap.text.Text(wrapperContained.decorate(packDisplayName.wrapperContained)); }

}