package yarnwrap.registry;
public class ServerDynamicRegistryType { public net.minecraft.registry.ServerDynamicRegistryType wrapperContained; public ServerDynamicRegistryType(net.minecraft.registry.ServerDynamicRegistryType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List VALUES() { return wrapperContained.VALUES; }
// public Object STATIC_REGISTRY_MANAGER() { return wrapperContained.STATIC_REGISTRY_MANAGER; }
public yarnwrap.registry.CombinedDynamicRegistries createCombinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.createCombinedDynamicRegistries()); }

}