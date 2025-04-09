package yarnwrap.client.network;
public class ClientTagLoader { public net.minecraft.client.network.ClientTagLoader wrapperContained; public ClientTagLoader(net.minecraft.client.network.ClientTagLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map tagsByRegistry() { return wrapperContained.tagsByRegistry; }
// public void put(yarnwrap.registry.RegistryKey registryRef,Object serialized) { wrapperContained.put(registryRef.wrapperContained,serialized); }
// public void load(yarnwrap.registry.DynamicRegistryManager registryManager,java.util.function.Predicate predicate) { wrapperContained.load(registryManager.wrapperContained,predicate); }
public void load(yarnwrap.registry.DynamicRegistryManager registryManager,boolean local) { wrapperContained.load(registryManager.wrapperContained,local); }
// public void onStaticTagsLoaded() { wrapperContained.onStaticTagsLoaded(); }

}