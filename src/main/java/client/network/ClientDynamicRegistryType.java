package yarnwrap.client.network;
public class ClientDynamicRegistryType { public net.minecraft.client.network.ClientDynamicRegistryType wrapperContained; public ClientDynamicRegistryType(net.minecraft.client.network.ClientDynamicRegistryType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List VALUES() { return wrapperContained.VALUES; }
// public Object STATIC_REGISTRY_MANAGER() { return wrapperContained.STATIC_REGISTRY_MANAGER; }
public yarnwrap.registry.CombinedDynamicRegistries createCombinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.createCombinedDynamicRegistries()); }

}