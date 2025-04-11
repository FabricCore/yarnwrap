package yarnwrap.client.gui.screen.pack;
public class ResourcePackOrganizer { public net.minecraft.client.gui.screen.pack.ResourcePackOrganizer wrapperContained; public ResourcePackOrganizer(net.minecraft.client.gui.screen.pack.ResourcePackOrganizer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List enabledPacks() { return wrapperContained.enabledPacks; }
// public void enabledPacks(java.util.List value) { wrapperContained.enabledPacks = value; }
// public java.util.List disabledPacks() { return wrapperContained.disabledPacks; }
// public void disabledPacks(java.util.List value) { wrapperContained.disabledPacks = value; }
// public java.lang.Runnable updateCallback() { return wrapperContained.updateCallback; }
// public void updateCallback(java.lang.Runnable value) { wrapperContained.updateCallback = value; }
// public java.util.function.Consumer applier() { return wrapperContained.applier; }
// public void applier(java.util.function.Consumer value) { wrapperContained.applier = value; }
// public yarnwrap.resource.ResourcePackManager resourcePackManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.resourcePackManager); }
// public void resourcePackManager(yarnwrap.resource.ResourcePackManager value) { wrapperContained.resourcePackManager = value.wrapperContained; }
// public java.util.function.Function iconIdSupplier() { return wrapperContained.iconIdSupplier; }
// public void iconIdSupplier(java.util.function.Function value) { wrapperContained.iconIdSupplier = value; }
public ResourcePackOrganizer(java.lang.Runnable updateCallback,java.util.function.Function iconIdSupplier,yarnwrap.resource.ResourcePackManager resourcePackManager,java.util.function.Consumer applier) { this.wrapperContained = new net.minecraft.client.gui.screen.pack.ResourcePackOrganizer(updateCallback,iconIdSupplier,resourcePackManager.wrapperContained,applier); }
public java.util.stream.Stream getDisabledPacks() { return wrapperContained.getDisabledPacks(); }
// public Object method_29640(yarnwrap.resource.ResourcePackProfile pack) { return wrapperContained.method_29640(pack.wrapperContained); }
public void apply() { wrapperContained.apply(); }
public java.util.stream.Stream getEnabledPacks() { return wrapperContained.getEnabledPacks(); }
// public Object method_29644(yarnwrap.resource.ResourcePackProfile pack) { return wrapperContained.method_29644(pack.wrapperContained); }
public void refresh() { wrapperContained.refresh(); }
// public void refreshEnabledProfiles() { wrapperContained.refreshEnabledProfiles(); }

}