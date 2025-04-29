package yarnwrap.registry;
public class ServerDynamicRegistryType { public net.minecraft.registry.ServerDynamicRegistryType wrapperContained; public ServerDynamicRegistryType(net.minecraft.registry.ServerDynamicRegistryType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List VALUES() { return wrapperContained.VALUES; }
// public void VALUES(java.util.List value) { wrapperContained.VALUES = value; }
// public static java.util.List VALUES() { return net.minecraft.registry.ServerDynamicRegistryType.VALUES; }
// public static void VALUES(java.util.List value, ) { net.minecraft.registry.ServerDynamicRegistryType.VALUES = value; }

// public Object STATIC_REGISTRY_MANAGER() { return wrapperContained.STATIC_REGISTRY_MANAGER; }
// // public void STATIC_REGISTRY_MANAGER(Object value) { wrapperContained.STATIC_REGISTRY_MANAGER = value; }
// // public static Object STATIC_REGISTRY_MANAGER() { return net.minecraft.registry.ServerDynamicRegistryType.STATIC_REGISTRY_MANAGER; }
// // public static void STATIC_REGISTRY_MANAGER(Object value, ) { net.minecraft.registry.ServerDynamicRegistryType.STATIC_REGISTRY_MANAGER = value; }

// public yarnwrap.registry.CombinedDynamicRegistries createCombinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.createCombinedDynamicRegistries()); }
public static yarnwrap.registry.CombinedDynamicRegistries createCombinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(net.minecraft.registry.ServerDynamicRegistryType.createCombinedDynamicRegistries()); }

}