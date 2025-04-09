package yarnwrap.client.gui.screen.pack;
public class ResourcePackOrganizer { public net.minecraft.client.gui.screen.pack.ResourcePackOrganizer wrapperContained; public ResourcePackOrganizer(net.minecraft.client.gui.screen.pack.ResourcePackOrganizer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List enabledPacks() { return wrapperContained.enabledPacks; }
// public java.util.List disabledPacks() { return wrapperContained.disabledPacks; }
// public java.lang.Runnable updateCallback() { return wrapperContained.updateCallback; }
// public java.util.function.Consumer applier() { return wrapperContained.applier; }
// public yarnwrap.resource.ResourcePackManager resourcePackManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.resourcePackManager); }
// public java.util.function.Function iconIdSupplier() { return wrapperContained.iconIdSupplier; }
public java.util.stream.Stream getDisabledPacks() { return wrapperContained.getDisabledPacks(); }
public void apply() { wrapperContained.apply(); }
public java.util.stream.Stream getEnabledPacks() { return wrapperContained.getEnabledPacks(); }
public void refresh() { wrapperContained.refresh(); }
// public void refreshEnabledProfiles() { wrapperContained.refreshEnabledProfiles(); }

}