package yarnwrap.client.resource;
public class ClientDataPackManager { public net.minecraft.client.resource.ClientDataPackManager wrapperContained; public ClientDataPackManager(net.minecraft.client.resource.ClientDataPackManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.ResourcePackManager packManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.packManager); }
// public java.util.Map knownPacks() { return wrapperContained.knownPacks; }
public yarnwrap.resource.LifecycledResourceManager createResourceManager() { return new yarnwrap.resource.LifecycledResourceManager(wrapperContained.createResourceManager()); }
public java.util.List getCommonKnownPacks(java.util.List serverKnownPacks) { return wrapperContained.getCommonKnownPacks(serverKnownPacks); }

}