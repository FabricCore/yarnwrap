package yarnwrap.resource;
public class ResourcePackCompatibility { public net.minecraft.resource.ResourcePackCompatibility wrapperContained; public ResourcePackCompatibility(net.minecraft.resource.ResourcePackCompatibility wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text notification() { return new yarnwrap.text.Text(wrapperContained.notification); }
// public yarnwrap.text.Text confirmMessage() { return new yarnwrap.text.Text(wrapperContained.confirmMessage); }
public yarnwrap.resource.ResourcePackCompatibility from(yarnwrap.util.dynamic.Range range,int current) { return new yarnwrap.resource.ResourcePackCompatibility(wrapperContained.from(range.wrapperContained,current)); }
public boolean isCompatible() { return wrapperContained.isCompatible(); }
public yarnwrap.text.Text getConfirmMessage() { return new yarnwrap.text.Text(wrapperContained.getConfirmMessage()); }
public yarnwrap.text.Text getNotification() { return new yarnwrap.text.Text(wrapperContained.getNotification()); }

}