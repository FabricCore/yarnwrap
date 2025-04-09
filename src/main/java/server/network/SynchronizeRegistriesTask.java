package yarnwrap.server.network;
public class SynchronizeRegistriesTask { public net.minecraft.server.network.SynchronizeRegistriesTask wrapperContained; public SynchronizeRegistriesTask(net.minecraft.server.network.SynchronizeRegistriesTask wrapperContained) { this.wrapperContained = wrapperContained; }

public Object KEY() { return wrapperContained.KEY; }
// public java.util.List knownPacks() { return wrapperContained.knownPacks; }
// public yarnwrap.registry.CombinedDynamicRegistries registries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.registries); }
public void onSelectKnownPacks(java.util.List clientKnownPacks,java.util.function.Consumer sender) { wrapperContained.onSelectKnownPacks(clientKnownPacks,sender); }
// public void syncRegistryAndTags(java.util.function.Consumer sender,java.util.Set commonKnownPacks) { wrapperContained.syncRegistryAndTags(sender,commonKnownPacks); }

}