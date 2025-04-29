package yarnwrap.resource;
public class ResourcePackManager { public net.minecraft.resource.ResourcePackManager wrapperContained; public ResourcePackManager(net.minecraft.resource.ResourcePackManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List enabled() { return wrapperContained.enabled; }
// public void enabled(java.util.List value) { wrapperContained.enabled = value; }
// public static java.util.List enabled() { return net.minecraft.resource.ResourcePackManager.enabled; }
// public static void enabled(java.util.List value, ) { net.minecraft.resource.ResourcePackManager.enabled = value; }

// public java.util.Map profiles() { return wrapperContained.profiles; }
// public void profiles(java.util.Map value) { wrapperContained.profiles = value; }
// public static java.util.Map profiles() { return net.minecraft.resource.ResourcePackManager.profiles; }
// public static void profiles(java.util.Map value, ) { net.minecraft.resource.ResourcePackManager.profiles = value; }

// public java.util.Set providers() { return wrapperContained.providers; }
// public void providers(java.util.Set value) { wrapperContained.providers = value; }
// public static java.util.Set providers() { return net.minecraft.resource.ResourcePackManager.providers; }
// public static void providers(java.util.Set value, ) { net.minecraft.resource.ResourcePackManager.providers = value; }

public ResourcePackManager(net.minecraft.resource.ResourcePackProvider[] providers) { this.wrapperContained = new net.minecraft.resource.ResourcePackManager(providers); }
public java.util.Collection getProfiles() { return wrapperContained.getProfiles(); }
// public static java.util.Collection getProfiles() { return net.minecraft.resource.ResourcePackManager.getProfiles(); }
public java.util.Collection getEnabledProfiles() { return wrapperContained.getEnabledProfiles(); }
// public static java.util.Collection getEnabledProfiles() { return net.minecraft.resource.ResourcePackManager.getEnabledProfiles(); }
public void scanPacks() { wrapperContained.scanPacks(); }
// public static void scanPacks() { net.minecraft.resource.ResourcePackManager.scanPacks(); }
public void setEnabledProfiles(java.util.Collection enabled) { wrapperContained.setEnabledProfiles(enabled); }
// public static void setEnabledProfiles(java.util.Collection enabled, ) { net.minecraft.resource.ResourcePackManager.setEnabledProfiles(enabled); }
public yarnwrap.resource.ResourcePackProfile getProfile(java.lang.String id) { return new yarnwrap.resource.ResourcePackProfile(wrapperContained.getProfile(id)); }
// public static yarnwrap.resource.ResourcePackProfile getProfile(java.lang.String id, ) { return new yarnwrap.resource.ResourcePackProfile(net.minecraft.resource.ResourcePackManager.getProfile(id)); }
public java.util.Collection getIds() { return wrapperContained.getIds(); }
// public static java.util.Collection getIds() { return net.minecraft.resource.ResourcePackManager.getIds(); }
public boolean hasProfile(java.lang.String id) { return wrapperContained.hasProfile(id); }
// public static boolean hasProfile(java.lang.String id, ) { return net.minecraft.resource.ResourcePackManager.hasProfile(id); }
// public java.util.List buildEnabledProfiles(java.util.Collection enabledNames) { return wrapperContained.buildEnabledProfiles(enabledNames); }
// public static java.util.List buildEnabledProfiles(java.util.Collection enabledNames, ) { return net.minecraft.resource.ResourcePackManager.buildEnabledProfiles(enabledNames); }
// public java.util.stream.Stream streamProfilesById(java.util.Collection ids) { return wrapperContained.streamProfilesById(ids); }
// public static java.util.stream.Stream streamProfilesById(java.util.Collection ids, ) { return net.minecraft.resource.ResourcePackManager.streamProfilesById(ids); }
public java.util.Collection getEnabledIds() { return wrapperContained.getEnabledIds(); }
// public static java.util.Collection getEnabledIds() { return net.minecraft.resource.ResourcePackManager.getEnabledIds(); }
public java.util.List createResourcePacks() { return wrapperContained.createResourcePacks(); }
// public static java.util.List createResourcePacks() { return net.minecraft.resource.ResourcePackManager.createResourcePacks(); }
// public java.util.Map providePackProfiles() { return wrapperContained.providePackProfiles(); }
// public static java.util.Map providePackProfiles() { return net.minecraft.resource.ResourcePackManager.providePackProfiles(); }
// public void method_29484(java.util.Map profile) { wrapperContained.method_29484(profile); }
// public static void method_29484(java.util.Map profile, ) { net.minecraft.resource.ResourcePackManager.method_29484(profile); }
public yarnwrap.resource.featuretoggle.FeatureSet getRequestedFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.getRequestedFeatures()); }
// public static yarnwrap.resource.featuretoggle.FeatureSet getRequestedFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.resource.ResourcePackManager.getRequestedFeatures()); }
public boolean enable(java.lang.String profile) { return wrapperContained.enable(profile); }
// public static boolean enable(java.lang.String profile, ) { return net.minecraft.resource.ResourcePackManager.enable(profile); }
public boolean disable(java.lang.String profile) { return wrapperContained.disable(profile); }
// public static boolean disable(java.lang.String profile, ) { return net.minecraft.resource.ResourcePackManager.disable(profile); }
// public java.lang.String method_59808(yarnwrap.resource.ResourcePackProfile profile) { return wrapperContained.method_59808(profile.wrapperContained); }
// public static java.lang.String method_59808(yarnwrap.resource.ResourcePackProfile profile, ) { return net.minecraft.resource.ResourcePackManager.method_59808(profile.wrapperContained); }
// public java.lang.String listPacks(java.util.Collection profiles) { return wrapperContained.listPacks(profiles); }
// public static java.lang.String listPacks(java.util.Collection profiles, ) { return net.minecraft.resource.ResourcePackManager.listPacks(profiles); }

}