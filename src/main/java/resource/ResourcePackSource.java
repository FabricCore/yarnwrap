package yarnwrap.resource;
public class ResourcePackSource { public net.minecraft.resource.ResourcePackSource wrapperContained; public ResourcePackSource(net.minecraft.resource.ResourcePackSource wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.resource.ResourcePackSource NONE() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.NONE); }
public yarnwrap.resource.ResourcePackSource BUILTIN() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.BUILTIN); }
public yarnwrap.resource.ResourcePackSource WORLD() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.WORLD); }
public yarnwrap.resource.ResourcePackSource SERVER() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.SERVER); }
public java.util.function.UnaryOperator NONE_SOURCE_TEXT_SUPPLIER() { return wrapperContained.NONE_SOURCE_TEXT_SUPPLIER; }
public yarnwrap.resource.ResourcePackSource FEATURE() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.FEATURE); }
public boolean canBeEnabledLater() { return wrapperContained.canBeEnabledLater(); }
// // public java.util.function.UnaryOperator getSourceTextSupplier(java.lang.String translationKey) { return wrapperContained.getSourceTextSupplier(translationKey); }
// public yarnwrap.resource.ResourcePackSource create(java.util.function.UnaryOperator sourceTextSupplier,boolean canBeEnabledLater) { return new yarnwrap.resource.ResourcePackSource(wrapperContained.create(sourceTextSupplier,canBeEnabledLater)); }
public yarnwrap.text.Text decorate(yarnwrap.text.Text packDisplayName) { return new yarnwrap.text.Text(wrapperContained.decorate(packDisplayName.wrapperContained)); }

}