package yarnwrap.resource;
public class ResourcePackCompatibility { public net.minecraft.resource.ResourcePackCompatibility wrapperContained; public ResourcePackCompatibility(net.minecraft.resource.ResourcePackCompatibility wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text notification() { return new yarnwrap.text.Text(wrapperContained.notification); }
// public void notification(yarnwrap.text.Text value) { wrapperContained.notification = value.wrapperContained; }
// public static yarnwrap.text.Text notification() { return new yarnwrap.text.Text(net.minecraft.resource.ResourcePackCompatibility.notification); }
// public static void notification(yarnwrap.text.Text value, ) { net.minecraft.resource.ResourcePackCompatibility.notification = value.wrapperContained; }

// public yarnwrap.text.Text confirmMessage() { return new yarnwrap.text.Text(wrapperContained.confirmMessage); }
// public void confirmMessage(yarnwrap.text.Text value) { wrapperContained.confirmMessage = value.wrapperContained; }
// public static yarnwrap.text.Text confirmMessage() { return new yarnwrap.text.Text(net.minecraft.resource.ResourcePackCompatibility.confirmMessage); }
// public static void confirmMessage(yarnwrap.text.Text value, ) { net.minecraft.resource.ResourcePackCompatibility.confirmMessage = value.wrapperContained; }

// public ResourcePackCompatibility(java.lang.String translationSuffix) { this.wrapperContained = new net.minecraft.resource.ResourcePackCompatibility(translationSuffix); }
// public yarnwrap.resource.ResourcePackCompatibility from(yarnwrap.util.dynamic.Range range,int current) { return new yarnwrap.resource.ResourcePackCompatibility(wrapperContained.from(range.wrapperContained,current)); }
// public static yarnwrap.resource.ResourcePackCompatibility from(yarnwrap.util.dynamic.Range range,int current, ) { return new yarnwrap.resource.ResourcePackCompatibility(net.minecraft.resource.ResourcePackCompatibility.from(range.wrapperContained,current)); }
public boolean isCompatible() { return wrapperContained.isCompatible(); }
// public static boolean isCompatible() { return net.minecraft.resource.ResourcePackCompatibility.isCompatible(); }
public yarnwrap.text.Text getConfirmMessage() { return new yarnwrap.text.Text(wrapperContained.getConfirmMessage()); }
// public static yarnwrap.text.Text getConfirmMessage() { return new yarnwrap.text.Text(net.minecraft.resource.ResourcePackCompatibility.getConfirmMessage()); }
public yarnwrap.text.Text getNotification() { return new yarnwrap.text.Text(wrapperContained.getNotification()); }
// public static yarnwrap.text.Text getNotification() { return new yarnwrap.text.Text(net.minecraft.resource.ResourcePackCompatibility.getNotification()); }

}