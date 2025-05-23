package yarnwrap.client.resource;
public class ClientDataPackManager { public net.minecraft.client.resource.ClientDataPackManager wrapperContained; public ClientDataPackManager(net.minecraft.client.resource.ClientDataPackManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.ResourcePackManager packManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.packManager); }
// public void packManager(yarnwrap.resource.ResourcePackManager value) { wrapperContained.packManager = value.wrapperContained; }
// public static yarnwrap.resource.ResourcePackManager packManager() { return new yarnwrap.resource.ResourcePackManager(net.minecraft.client.resource.ClientDataPackManager.packManager); }
// public static void packManager(yarnwrap.resource.ResourcePackManager value, ) { net.minecraft.client.resource.ClientDataPackManager.packManager = value.wrapperContained; }

// public java.util.Map knownPacks() { return wrapperContained.knownPacks; }
// public void knownPacks(java.util.Map value) { wrapperContained.knownPacks = value; }
// public static java.util.Map knownPacks() { return net.minecraft.client.resource.ClientDataPackManager.knownPacks; }
// public static void knownPacks(java.util.Map value, ) { net.minecraft.client.resource.ClientDataPackManager.knownPacks = value; }

public yarnwrap.resource.LifecycledResourceManager createResourceManager() { return new yarnwrap.resource.LifecycledResourceManager(wrapperContained.createResourceManager()); }
// public static yarnwrap.resource.LifecycledResourceManager createResourceManager() { return new yarnwrap.resource.LifecycledResourceManager(net.minecraft.client.resource.ClientDataPackManager.createResourceManager()); }
public java.util.List getCommonKnownPacks(java.util.List serverKnownPacks) { return wrapperContained.getCommonKnownPacks(serverKnownPacks); }
// public static java.util.List getCommonKnownPacks(java.util.List serverKnownPacks, ) { return net.minecraft.client.resource.ClientDataPackManager.getCommonKnownPacks(serverKnownPacks); }
// public void method_68703(Object knownPackInfo) { wrapperContained.method_68703(knownPackInfo); }
// public static void method_68703(Object knownPackInfo, ) { net.minecraft.client.resource.ClientDataPackManager.method_68703(knownPackInfo); }
// public void method_68704(Object resourcePackProfile) { wrapperContained.method_68704(resourcePackProfile); }
// public static void method_68704(Object resourcePackProfile, ) { net.minecraft.client.resource.ClientDataPackManager.method_68704(resourcePackProfile); }

}