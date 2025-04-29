package yarnwrap.client.network;
public class ClientDynamicRegistryType { public net.minecraft.client.network.ClientDynamicRegistryType wrapperContained; public ClientDynamicRegistryType(net.minecraft.client.network.ClientDynamicRegistryType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List VALUES() { return wrapperContained.VALUES; }
// public void VALUES(java.util.List value) { wrapperContained.VALUES = value; }
// public static java.util.List VALUES() { return net.minecraft.client.network.ClientDynamicRegistryType.VALUES; }
// public static void VALUES(java.util.List value, ) { net.minecraft.client.network.ClientDynamicRegistryType.VALUES = value; }

// public Object STATIC_REGISTRY_MANAGER() { return wrapperContained.STATIC_REGISTRY_MANAGER; }
// // public void STATIC_REGISTRY_MANAGER(Object value) { wrapperContained.STATIC_REGISTRY_MANAGER = value; }
// // public static Object STATIC_REGISTRY_MANAGER() { return net.minecraft.client.network.ClientDynamicRegistryType.STATIC_REGISTRY_MANAGER; }
// // public static void STATIC_REGISTRY_MANAGER(Object value, ) { net.minecraft.client.network.ClientDynamicRegistryType.STATIC_REGISTRY_MANAGER = value; }

// public yarnwrap.registry.CombinedDynamicRegistries createCombinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.createCombinedDynamicRegistries()); }
public static yarnwrap.registry.CombinedDynamicRegistries createCombinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(net.minecraft.client.network.ClientDynamicRegistryType.createCombinedDynamicRegistries()); }

}