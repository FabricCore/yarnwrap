package yarnwrap.registry;
public class RegistryLoader { public net.minecraft.registry.RegistryLoader wrapperContained; public RegistryLoader(net.minecraft.registry.RegistryLoader wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List DYNAMIC_REGISTRIES() { return wrapperContained.DYNAMIC_REGISTRIES; }
// public void DYNAMIC_REGISTRIES(java.util.List value) { wrapperContained.DYNAMIC_REGISTRIES = value; }
public java.util.List DIMENSION_REGISTRIES() { return wrapperContained.DIMENSION_REGISTRIES; }
// public void DIMENSION_REGISTRIES(java.util.List value) { wrapperContained.DIMENSION_REGISTRIES = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public java.util.List SYNCED_REGISTRIES() { return wrapperContained.SYNCED_REGISTRIES; }
// public void SYNCED_REGISTRIES(java.util.List value) { wrapperContained.SYNCED_REGISTRIES = value; }
// public yarnwrap.registry.entry.RegistryEntryInfo EXPERIMENTAL_ENTRY_INFO() { return new yarnwrap.registry.entry.RegistryEntryInfo(wrapperContained.EXPERIMENTAL_ENTRY_INFO); }
// public void EXPERIMENTAL_ENTRY_INFO(yarnwrap.registry.entry.RegistryEntryInfo value) { wrapperContained.EXPERIMENTAL_ENTRY_INFO = value.wrapperContained; }
// public java.util.function.Function RESOURCE_ENTRY_INFO_GETTER() { return wrapperContained.RESOURCE_ENTRY_INFO_GETTER; }
// public void RESOURCE_ENTRY_INFO_GETTER(java.util.function.Function value) { wrapperContained.RESOURCE_ENTRY_INFO_GETTER = value; }
// public Object load(Object loadable,yarnwrap.registry.DynamicRegistryManager baseRegistryManager,java.util.List entries) { return wrapperContained.load(loadable,baseRegistryManager.wrapperContained,entries); }
// public void loadFromResource(yarnwrap.resource.ResourceManager resourceManager,Object infoGetter,yarnwrap.registry.MutableRegistry registry,com.mojang.serialization.Decoder elementDecoder,java.util.Map errors) { wrapperContained.loadFromResource(resourceManager.wrapperContained,infoGetter,registry.wrapperContained,elementDecoder,errors); }
// public void writeLoadingError(java.util.Map exceptions) { wrapperContained.writeLoadingError(exceptions); }
// public Object createInfo(yarnwrap.registry.Registry registry) { return wrapperContained.createInfo(registry.wrapperContained); }
// public Object createInfoGetter(yarnwrap.registry.DynamicRegistryManager baseRegistryManager,java.util.List additionalRegistries) { return wrapperContained.createInfoGetter(baseRegistryManager.wrapperContained,additionalRegistries); }
// public Object createInfo(yarnwrap.registry.MutableRegistry registry) { return wrapperContained.createInfo(registry.wrapperContained); }
public Object loadFromResource(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.registry.DynamicRegistryManager registryManager,java.util.List entries) { return wrapperContained.loadFromResource(resourceManager.wrapperContained,registryManager.wrapperContained,entries); }
// public void loadFromNetwork(java.util.Map data,yarnwrap.resource.ResourceFactory factory,Object infoGetter,yarnwrap.registry.MutableRegistry registry,com.mojang.serialization.Decoder decoder,java.util.Map loadingErrors) { wrapperContained.loadFromNetwork(data,factory.wrapperContained,infoGetter,registry.wrapperContained,decoder,loadingErrors); }
public Object loadFromNetwork(java.util.Map data,yarnwrap.resource.ResourceFactory factory,yarnwrap.registry.DynamicRegistryManager registryManager,java.util.List entries) { return wrapperContained.loadFromNetwork(data,factory.wrapperContained,registryManager.wrapperContained,entries); }
// public void parseAndAdd(yarnwrap.registry.MutableRegistry registry,com.mojang.serialization.Decoder decoder,yarnwrap.registry.RegistryOps ops,yarnwrap.registry.RegistryKey key,yarnwrap.resource.Resource resource,yarnwrap.registry.entry.RegistryEntryInfo entryInfo) { wrapperContained.parseAndAdd(registry.wrapperContained,decoder,ops.wrapperContained,key.wrapperContained,resource.wrapperContained,entryInfo.wrapperContained); }

}