package yarnwrap.registry;
public class RegistryLoader { public net.minecraft.registry.RegistryLoader wrapperContained; public RegistryLoader(net.minecraft.registry.RegistryLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List DYNAMIC_REGISTRIES() { return wrapperContained.DYNAMIC_REGISTRIES; }
// public void DYNAMIC_REGISTRIES(java.util.List value) { wrapperContained.DYNAMIC_REGISTRIES = value; }
public static java.util.List DYNAMIC_REGISTRIES() { return net.minecraft.registry.RegistryLoader.DYNAMIC_REGISTRIES; }
// public static void DYNAMIC_REGISTRIES(java.util.List value, ) { net.minecraft.registry.RegistryLoader.DYNAMIC_REGISTRIES = value; }

// public java.util.List DIMENSION_REGISTRIES() { return wrapperContained.DIMENSION_REGISTRIES; }
// public void DIMENSION_REGISTRIES(java.util.List value) { wrapperContained.DIMENSION_REGISTRIES = value; }
public static java.util.List DIMENSION_REGISTRIES() { return net.minecraft.registry.RegistryLoader.DIMENSION_REGISTRIES; }
// public static void DIMENSION_REGISTRIES(java.util.List value, ) { net.minecraft.registry.RegistryLoader.DIMENSION_REGISTRIES = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.registry.RegistryLoader.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.registry.RegistryLoader.LOGGER = value; }

// public java.util.List SYNCED_REGISTRIES() { return wrapperContained.SYNCED_REGISTRIES; }
// public void SYNCED_REGISTRIES(java.util.List value) { wrapperContained.SYNCED_REGISTRIES = value; }
public static java.util.List SYNCED_REGISTRIES() { return net.minecraft.registry.RegistryLoader.SYNCED_REGISTRIES; }
// public static void SYNCED_REGISTRIES(java.util.List value, ) { net.minecraft.registry.RegistryLoader.SYNCED_REGISTRIES = value; }

// public yarnwrap.registry.entry.RegistryEntryInfo EXPERIMENTAL_ENTRY_INFO() { return new yarnwrap.registry.entry.RegistryEntryInfo(wrapperContained.EXPERIMENTAL_ENTRY_INFO); }
// public void EXPERIMENTAL_ENTRY_INFO(yarnwrap.registry.entry.RegistryEntryInfo value) { wrapperContained.EXPERIMENTAL_ENTRY_INFO = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntryInfo EXPERIMENTAL_ENTRY_INFO() { return new yarnwrap.registry.entry.RegistryEntryInfo(net.minecraft.registry.RegistryLoader.EXPERIMENTAL_ENTRY_INFO); }
// public static void EXPERIMENTAL_ENTRY_INFO(yarnwrap.registry.entry.RegistryEntryInfo value, ) { net.minecraft.registry.RegistryLoader.EXPERIMENTAL_ENTRY_INFO = value.wrapperContained; }

// public java.util.function.Function RESOURCE_ENTRY_INFO_GETTER() { return wrapperContained.RESOURCE_ENTRY_INFO_GETTER; }
// public void RESOURCE_ENTRY_INFO_GETTER(java.util.function.Function value) { wrapperContained.RESOURCE_ENTRY_INFO_GETTER = value; }
// public static java.util.function.Function RESOURCE_ENTRY_INFO_GETTER() { return net.minecraft.registry.RegistryLoader.RESOURCE_ENTRY_INFO_GETTER; }
// public static void RESOURCE_ENTRY_INFO_GETTER(java.util.function.Function value, ) { net.minecraft.registry.RegistryLoader.RESOURCE_ENTRY_INFO_GETTER = value; }

// public void method_45120(Object loader) { wrapperContained.method_45120(loader); }
// public static void method_45120(Object loader, ) { net.minecraft.registry.RegistryLoader.method_45120(loader); }
// public Object load(Object loadable,yarnwrap.registry.DynamicRegistryManager baseRegistryManager,java.util.List entries) { return wrapperContained.load(loadable,baseRegistryManager.wrapperContained,entries); }
// public static Object load(Object loadable,yarnwrap.registry.DynamicRegistryManager baseRegistryManager,java.util.List entries, ) { return net.minecraft.registry.RegistryLoader.load(loadable,baseRegistryManager.wrapperContained,entries); }
// public void loadFromResource(yarnwrap.resource.ResourceManager resourceManager,Object infoGetter,yarnwrap.registry.MutableRegistry registry,com.mojang.serialization.Decoder elementDecoder,java.util.Map errors) { wrapperContained.loadFromResource(resourceManager.wrapperContained,infoGetter,registry.wrapperContained,elementDecoder,errors); }
// public static void loadFromResource(yarnwrap.resource.ResourceManager resourceManager,Object infoGetter,yarnwrap.registry.MutableRegistry registry,com.mojang.serialization.Decoder elementDecoder,java.util.Map errors, ) { net.minecraft.registry.RegistryLoader.loadFromResource(resourceManager.wrapperContained,infoGetter,registry.wrapperContained,elementDecoder,errors); }
// public void method_45123(java.io.PrintWriter entry) { wrapperContained.method_45123(entry); }
// public static void method_45123(java.io.PrintWriter entry, ) { net.minecraft.registry.RegistryLoader.method_45123(entry); }
// public yarnwrap.util.Identifier method_45125(Object entry) { return new yarnwrap.util.Identifier(wrapperContained.method_45125(entry)); }
// public static yarnwrap.util.Identifier method_45125(Object entry, ) { return new yarnwrap.util.Identifier(net.minecraft.registry.RegistryLoader.method_45125(entry)); }
// public void writeLoadingError(java.util.Map exceptions) { wrapperContained.writeLoadingError(exceptions); }
// public static void writeLoadingError(java.util.Map exceptions, ) { net.minecraft.registry.RegistryLoader.writeLoadingError(exceptions); }
// public Object method_45127(java.util.Map entry) { return wrapperContained.method_45127(entry); }
// public static Object method_45127(java.util.Map entry, ) { return net.minecraft.registry.RegistryLoader.method_45127(entry); }
// public void method_45128(java.util.Map loader) { wrapperContained.method_45128(loader); }
// public static void method_45128(java.util.Map loader, ) { net.minecraft.registry.RegistryLoader.method_45128(loader); }
// public void method_45129(java.io.PrintWriter elementEntry) { wrapperContained.method_45129(elementEntry); }
// public static void method_45129(java.io.PrintWriter elementEntry, ) { net.minecraft.registry.RegistryLoader.method_45129(elementEntry); }
// public yarnwrap.util.Identifier method_45130(Object entry) { return new yarnwrap.util.Identifier(wrapperContained.method_45130(entry)); }
// public static yarnwrap.util.Identifier method_45130(Object entry, ) { return new yarnwrap.util.Identifier(net.minecraft.registry.RegistryLoader.method_45130(entry)); }
// public Object createInfo(yarnwrap.registry.Registry registry) { return wrapperContained.createInfo(registry.wrapperContained); }
// public static Object createInfo(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.RegistryLoader.createInfo(registry.wrapperContained); }
// public Object createInfoGetter(yarnwrap.registry.DynamicRegistryManager baseRegistryManager,java.util.List additionalRegistries) { return wrapperContained.createInfoGetter(baseRegistryManager.wrapperContained,additionalRegistries); }
// public static Object createInfoGetter(yarnwrap.registry.DynamicRegistryManager baseRegistryManager,java.util.List additionalRegistries, ) { return net.minecraft.registry.RegistryLoader.createInfoGetter(baseRegistryManager.wrapperContained,additionalRegistries); }
// public Object createInfo(yarnwrap.registry.MutableRegistry registry) { return wrapperContained.createInfo(registry.wrapperContained); }
// public static Object createInfo(yarnwrap.registry.MutableRegistry registry, ) { return net.minecraft.registry.RegistryLoader.createInfo(registry.wrapperContained); }
// public void method_46621(java.util.Map loader) { wrapperContained.method_46621(loader); }
// public static void method_46621(java.util.Map loader, ) { net.minecraft.registry.RegistryLoader.method_46621(loader); }
// public void method_46622(java.util.Map entry) { wrapperContained.method_46622(entry); }
// public static void method_46622(java.util.Map entry, ) { net.minecraft.registry.RegistryLoader.method_46622(entry); }
// public void method_56514(yarnwrap.resource.ResourceManager loader,Object infoGetter) { wrapperContained.method_56514(loader.wrapperContained,infoGetter); }
// public static void method_56514(yarnwrap.resource.ResourceManager loader,Object infoGetter, ) { net.minecraft.registry.RegistryLoader.method_56514(loader.wrapperContained,infoGetter); }
// public Object loadFromResource(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.registry.DynamicRegistryManager registryManager,java.util.List entries) { return wrapperContained.loadFromResource(resourceManager.wrapperContained,registryManager.wrapperContained,entries); }
// public static Object loadFromResource(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.registry.DynamicRegistryManager registryManager,java.util.List entries, ) { return net.minecraft.registry.RegistryLoader.loadFromResource(resourceManager.wrapperContained,registryManager.wrapperContained,entries); }
// public void method_56517(java.util.Map loader,yarnwrap.resource.ResourceFactory infoGetter) { wrapperContained.method_56517(loader,infoGetter.wrapperContained); }
// public static void method_56517(java.util.Map loader,yarnwrap.resource.ResourceFactory infoGetter, ) { net.minecraft.registry.RegistryLoader.method_56517(loader,infoGetter.wrapperContained); }
// public void loadFromNetwork(java.util.Map data,yarnwrap.resource.ResourceFactory factory,Object infoGetter,yarnwrap.registry.MutableRegistry registry,com.mojang.serialization.Decoder decoder,java.util.Map loadingErrors) { wrapperContained.loadFromNetwork(data,factory.wrapperContained,infoGetter,registry.wrapperContained,decoder,loadingErrors); }
// public static void loadFromNetwork(java.util.Map data,yarnwrap.resource.ResourceFactory factory,Object infoGetter,yarnwrap.registry.MutableRegistry registry,com.mojang.serialization.Decoder decoder,java.util.Map loadingErrors, ) { net.minecraft.registry.RegistryLoader.loadFromNetwork(data,factory.wrapperContained,infoGetter,registry.wrapperContained,decoder,loadingErrors); }
// public Object loadFromNetwork(java.util.Map data,yarnwrap.resource.ResourceFactory factory,yarnwrap.registry.DynamicRegistryManager registryManager,java.util.List entries) { return wrapperContained.loadFromNetwork(data,factory.wrapperContained,registryManager.wrapperContained,entries); }
// public static Object loadFromNetwork(java.util.Map data,yarnwrap.resource.ResourceFactory factory,yarnwrap.registry.DynamicRegistryManager registryManager,java.util.List entries, ) { return net.minecraft.registry.RegistryLoader.loadFromNetwork(data,factory.wrapperContained,registryManager.wrapperContained,entries); }
// public com.mojang.serialization.Lifecycle method_56913(java.lang.Boolean vanilla) { return wrapperContained.method_56913(vanilla); }
// public static com.mojang.serialization.Lifecycle method_56913(java.lang.Boolean vanilla, ) { return net.minecraft.registry.RegistryLoader.method_56913(vanilla); }
// public yarnwrap.registry.entry.RegistryEntryInfo method_56914(java.util.Optional knownPacks) { return new yarnwrap.registry.entry.RegistryEntryInfo(wrapperContained.method_56914(knownPacks)); }
// public static yarnwrap.registry.entry.RegistryEntryInfo method_56914(java.util.Optional knownPacks, ) { return new yarnwrap.registry.entry.RegistryEntryInfo(net.minecraft.registry.RegistryLoader.method_56914(knownPacks)); }
// public void parseAndAdd(yarnwrap.registry.MutableRegistry registry,com.mojang.serialization.Decoder decoder,yarnwrap.registry.RegistryOps ops,yarnwrap.registry.RegistryKey key,yarnwrap.resource.Resource resource,yarnwrap.registry.entry.RegistryEntryInfo entryInfo) { wrapperContained.parseAndAdd(registry.wrapperContained,decoder,ops.wrapperContained,key.wrapperContained,resource.wrapperContained,entryInfo.wrapperContained); }
// public static void parseAndAdd(yarnwrap.registry.MutableRegistry registry,com.mojang.serialization.Decoder decoder,yarnwrap.registry.RegistryOps ops,yarnwrap.registry.RegistryKey key,yarnwrap.resource.Resource resource,yarnwrap.registry.entry.RegistryEntryInfo entryInfo, ) { net.minecraft.registry.RegistryLoader.parseAndAdd(registry.wrapperContained,decoder,ops.wrapperContained,key.wrapperContained,resource.wrapperContained,entryInfo.wrapperContained); }

}