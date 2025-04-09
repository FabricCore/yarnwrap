package yarnwrap.resource;
public class ResourcePackManager { public net.minecraft.resource.ResourcePackManager wrapperContained; public ResourcePackManager(net.minecraft.resource.ResourcePackManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List enabled() { return wrapperContained.enabled; }
// public java.util.Map profiles() { return wrapperContained.profiles; }
// public java.util.Set providers() { return wrapperContained.providers; }
public java.util.Collection getProfiles() { return wrapperContained.getProfiles(); }
public java.util.Collection getEnabledProfiles() { return wrapperContained.getEnabledProfiles(); }
public void scanPacks() { wrapperContained.scanPacks(); }
public void setEnabledProfiles(java.util.Collection enabled) { wrapperContained.setEnabledProfiles(enabled); }
public yarnwrap.resource.ResourcePackProfile getProfile(java.lang.String id) { return new yarnwrap.resource.ResourcePackProfile(wrapperContained.getProfile(id)); }
public java.util.Collection getIds() { return wrapperContained.getIds(); }
public boolean hasProfile(java.lang.String id) { return wrapperContained.hasProfile(id); }
// public java.util.List buildEnabledProfiles(java.util.Collection enabledNames) { return wrapperContained.buildEnabledProfiles(enabledNames); }
// public java.util.stream.Stream streamProfilesById(java.util.Collection ids) { return wrapperContained.streamProfilesById(ids); }
public java.util.Collection getEnabledIds() { return wrapperContained.getEnabledIds(); }
public java.util.List createResourcePacks() { return wrapperContained.createResourcePacks(); }
// public java.util.Map providePackProfiles() { return wrapperContained.providePackProfiles(); }
public yarnwrap.resource.featuretoggle.FeatureSet getRequestedFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.getRequestedFeatures()); }
public boolean enable(java.lang.String profile) { return wrapperContained.enable(profile); }
public boolean disable(java.lang.String profile) { return wrapperContained.disable(profile); }
public java.lang.String listPacks(java.util.Collection profiles) { return wrapperContained.listPacks(profiles); }

}