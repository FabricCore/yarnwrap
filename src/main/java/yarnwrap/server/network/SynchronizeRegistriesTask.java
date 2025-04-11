package yarnwrap.server.network;
public class SynchronizeRegistriesTask { public net.minecraft.server.network.SynchronizeRegistriesTask wrapperContained; public SynchronizeRegistriesTask(net.minecraft.server.network.SynchronizeRegistriesTask wrapperContained) { this.wrapperContained = wrapperContained; }

public Object KEY() { return wrapperContained.KEY; }
// // public void KEY(Object value) { wrapperContained.KEY = value; }
// public java.util.List knownPacks() { return wrapperContained.knownPacks; }
// public void knownPacks(java.util.List value) { wrapperContained.knownPacks = value; }
// public yarnwrap.registry.CombinedDynamicRegistries registries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.registries); }
// public void registries(yarnwrap.registry.CombinedDynamicRegistries value) { wrapperContained.registries = value.wrapperContained; }
public SynchronizeRegistriesTask(java.util.List knownPacks,yarnwrap.registry.CombinedDynamicRegistries registries) { this.wrapperContained = new net.minecraft.server.network.SynchronizeRegistriesTask(knownPacks,registries.wrapperContained); }
public void onSelectKnownPacks(java.util.List clientKnownPacks,java.util.function.Consumer sender) { wrapperContained.onSelectKnownPacks(clientKnownPacks,sender); }
// public void method_56924(java.util.function.Consumer key,yarnwrap.registry.RegistryKey entries) { wrapperContained.method_56924(key,entries.wrapperContained); }
// public void syncRegistryAndTags(java.util.function.Consumer sender,java.util.Set commonKnownPacks) { wrapperContained.syncRegistryAndTags(sender,commonKnownPacks); }

}