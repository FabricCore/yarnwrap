package yarnwrap.client.network;
public class ClientRegistries { public net.minecraft.client.network.ClientRegistries wrapperContained; public ClientRegistries(net.minecraft.client.network.ClientRegistries wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object dynamicRegistries() { return wrapperContained.dynamicRegistries; }
// // public void dynamicRegistries(Object value) { wrapperContained.dynamicRegistries = value; }
// public yarnwrap.client.network.ClientTagLoader tagLoader() { return new yarnwrap.client.network.ClientTagLoader(wrapperContained.tagLoader); }
// public void tagLoader(yarnwrap.client.network.ClientTagLoader value) { wrapperContained.tagLoader = value.wrapperContained; }
public void putDynamicRegistry(yarnwrap.registry.RegistryKey registryRef,java.util.List entries) { wrapperContained.putDynamicRegistry(registryRef.wrapperContained,entries); }
public Object createRegistryManager(yarnwrap.resource.ResourceFactory factory,yarnwrap.registry.DynamicRegistryManager registryManager,boolean local) { return wrapperContained.createRegistryManager(factory.wrapperContained,registryManager.wrapperContained,local); }
public void putTags(java.util.Map tags) { wrapperContained.putTags(tags); }

}