package yarnwrap.server.network;
public class SynchronizeRegistriesTask { public net.minecraft.server.network.SynchronizeRegistriesTask wrapperContained; public SynchronizeRegistriesTask(net.minecraft.server.network.SynchronizeRegistriesTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object KEY() { return wrapperContained.KEY; }
// // public void KEY(Object value) { wrapperContained.KEY = value; }
// public static Object KEY() { return net.minecraft.server.network.SynchronizeRegistriesTask.KEY; }
// // public static void KEY(Object value, ) { net.minecraft.server.network.SynchronizeRegistriesTask.KEY = value; }

// public java.util.List knownPacks() { return wrapperContained.knownPacks; }
// public void knownPacks(java.util.List value) { wrapperContained.knownPacks = value; }
// public static java.util.List knownPacks() { return net.minecraft.server.network.SynchronizeRegistriesTask.knownPacks; }
// public static void knownPacks(java.util.List value, ) { net.minecraft.server.network.SynchronizeRegistriesTask.knownPacks = value; }

// public yarnwrap.registry.CombinedDynamicRegistries registries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.registries); }
// public void registries(yarnwrap.registry.CombinedDynamicRegistries value) { wrapperContained.registries = value.wrapperContained; }
// public static yarnwrap.registry.CombinedDynamicRegistries registries() { return new yarnwrap.registry.CombinedDynamicRegistries(net.minecraft.server.network.SynchronizeRegistriesTask.registries); }
// public static void registries(yarnwrap.registry.CombinedDynamicRegistries value, ) { net.minecraft.server.network.SynchronizeRegistriesTask.registries = value.wrapperContained; }

public SynchronizeRegistriesTask(java.util.List knownPacks,yarnwrap.registry.CombinedDynamicRegistries registries) { this.wrapperContained = new net.minecraft.server.network.SynchronizeRegistriesTask(knownPacks,registries.wrapperContained); }
public void onSelectKnownPacks(java.util.List clientKnownPacks,java.util.function.Consumer sender) { wrapperContained.onSelectKnownPacks(clientKnownPacks,sender); }
// public static void onSelectKnownPacks(java.util.List clientKnownPacks,java.util.function.Consumer sender, ) { net.minecraft.server.network.SynchronizeRegistriesTask.onSelectKnownPacks(clientKnownPacks,sender); }
// public void method_56924(java.util.function.Consumer key,yarnwrap.registry.RegistryKey entries) { wrapperContained.method_56924(key,entries.wrapperContained); }
// public static void method_56924(java.util.function.Consumer key,yarnwrap.registry.RegistryKey entries, ) { net.minecraft.server.network.SynchronizeRegistriesTask.method_56924(key,entries.wrapperContained); }
// public void syncRegistryAndTags(java.util.function.Consumer sender,java.util.Set commonKnownPacks) { wrapperContained.syncRegistryAndTags(sender,commonKnownPacks); }
// public static void syncRegistryAndTags(java.util.function.Consumer sender,java.util.Set commonKnownPacks, ) { net.minecraft.server.network.SynchronizeRegistriesTask.syncRegistryAndTags(sender,commonKnownPacks); }

}