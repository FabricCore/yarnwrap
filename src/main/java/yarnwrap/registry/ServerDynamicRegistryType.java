package yarnwrap.registry;
public class ServerDynamicRegistryType { public net.minecraft.registry.ServerDynamicRegistryType wrapperContained; public ServerDynamicRegistryType(net.minecraft.registry.ServerDynamicRegistryType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List VALUES() { return wrapperContained.VALUES; }
// public void VALUES(java.util.List value) { wrapperContained.VALUES = value; }
// public Object STATIC_REGISTRY_MANAGER() { return wrapperContained.STATIC_REGISTRY_MANAGER; }
// // public void STATIC_REGISTRY_MANAGER(Object value) { wrapperContained.STATIC_REGISTRY_MANAGER = value; }
public yarnwrap.registry.CombinedDynamicRegistries createCombinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.createCombinedDynamicRegistries()); }

}