package yarnwrap.client.resource;
public class ClientDataPackManager { public net.minecraft.client.resource.ClientDataPackManager wrapperContained; public ClientDataPackManager(net.minecraft.client.resource.ClientDataPackManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.ResourcePackManager packManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.packManager); }
// public void packManager(yarnwrap.resource.ResourcePackManager value) { wrapperContained.packManager = value.wrapperContained; }
// public java.util.Map knownPacks() { return wrapperContained.knownPacks; }
// public void knownPacks(java.util.Map value) { wrapperContained.knownPacks = value; }
public yarnwrap.resource.LifecycledResourceManager createResourceManager() { return new yarnwrap.resource.LifecycledResourceManager(wrapperContained.createResourceManager()); }
public java.util.List getCommonKnownPacks(java.util.List serverKnownPacks) { return wrapperContained.getCommonKnownPacks(serverKnownPacks); }

}