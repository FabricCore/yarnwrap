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

// public java.util.Comparator KEY_COMPARATOR() { return wrapperContained.KEY_COMPARATOR; }
// public void KEY_COMPARATOR(java.util.Comparator value) { wrapperContained.KEY_COMPARATOR = value; }
// public static java.util.Comparator KEY_COMPARATOR() { return net.minecraft.registry.RegistryLoader.KEY_COMPARATOR; }
// public static void KEY_COMPARATOR(java.util.Comparator value, ) { net.minecraft.registry.RegistryLoader.KEY_COMPARATOR = value; }

// public void method_45120(Object loader) { wrapperContained.method_45120(loader); }
// public static void method_45120(Object loader, ) { net.minecraft.registry.RegistryLoader.method_45120(loader); }
// public Object load(Object loadable,java.util.List registries,java.util.List entries) { return wrapperContained.load(loadable,registries,entries); }
// public static Object load(Object loadable,java.util.List registries,java.util.List entries, ) { return net.minecraft.registry.RegistryLoader.load(loadable,registries,entries); }
// public void loadFromResource(yarnwrap.resource.ResourceManager resourceManager,Object infoGetter,yarnwrap.registry.MutableRegistry registry,com.mojang.serialization.Decoder elementDecoder,java.util.Map errors) { wrapperContained.loadFromResource(resourceManager.wrapperContained,infoGetter,registry.wrapperContained,elementDecoder,errors); }
// public static void loadFromResource(yarnwrap.resource.ResourceManager resourceManager,Object infoGetter,yarnwrap.registry.MutableRegistry registry,com.mojang.serialization.Decoder elementDecoder,java.util.Map errors, ) { net.minecraft.registry.RegistryLoader.loadFromResource(resourceManager.wrapperContained,infoGetter,registry.wrapperContained,elementDecoder,errors); }
// public yarnwrap.util.crash.CrashException writeAndCreateLoadingException(java.util.Map exceptions) { return new yarnwrap.util.crash.CrashException(wrapperContained.writeAndCreateLoadingException(exceptions)); }
// public static yarnwrap.util.crash.CrashException writeAndCreateLoadingException(java.util.Map exceptions, ) { return new yarnwrap.util.crash.CrashException(net.minecraft.registry.RegistryLoader.writeAndCreateLoadingException(exceptions)); }
// public Object method_45127(java.util.Map entry) { return wrapperContained.method_45127(entry); }
// public static Object method_45127(java.util.Map entry, ) { return net.minecraft.registry.RegistryLoader.method_45127(entry); }
// public void method_45128(java.util.Map loader) { wrapperContained.method_45128(loader); }
// public static void method_45128(java.util.Map loader, ) { net.minecraft.registry.RegistryLoader.method_45128(loader); }
// public Object createInfo(Object registry) { return wrapperContained.createInfo(registry); }
// public static Object createInfo(Object registry, ) { return net.minecraft.registry.RegistryLoader.createInfo(registry); }
// public Object createInfoGetter(java.util.List registries,java.util.List additionalRegistries) { return wrapperContained.createInfoGetter(registries,additionalRegistries); }
// public static Object createInfoGetter(java.util.List registries,java.util.List additionalRegistries, ) { return net.minecraft.registry.RegistryLoader.createInfoGetter(registries,additionalRegistries); }
// public Object createInfo(yarnwrap.registry.MutableRegistry registry) { return wrapperContained.createInfo(registry.wrapperContained); }
// public static Object createInfo(yarnwrap.registry.MutableRegistry registry, ) { return net.minecraft.registry.RegistryLoader.createInfo(registry.wrapperContained); }
// public void method_46621(java.util.Map loader) { wrapperContained.method_46621(loader); }
// public static void method_46621(java.util.Map loader, ) { net.minecraft.registry.RegistryLoader.method_46621(loader); }
// public void method_46622(java.util.Map registry) { wrapperContained.method_46622(registry); }
// public static void method_46622(java.util.Map registry, ) { net.minecraft.registry.RegistryLoader.method_46622(registry); }
// public void method_56514(yarnwrap.resource.ResourceManager loader,Object infoGetter) { wrapperContained.method_56514(loader.wrapperContained,infoGetter); }
// public static void method_56514(yarnwrap.resource.ResourceManager loader,Object infoGetter, ) { net.minecraft.registry.RegistryLoader.method_56514(loader.wrapperContained,infoGetter); }
// public Object loadFromResource(yarnwrap.resource.ResourceManager resourceManager,java.util.List registries,java.util.List entries) { return wrapperContained.loadFromResource(resourceManager.wrapperContained,registries,entries); }
// public static Object loadFromResource(yarnwrap.resource.ResourceManager resourceManager,java.util.List registries,java.util.List entries, ) { return net.minecraft.registry.RegistryLoader.loadFromResource(resourceManager.wrapperContained,registries,entries); }
// public void method_56517(java.util.Map loader,yarnwrap.resource.ResourceFactory infoGetter) { wrapperContained.method_56517(loader,infoGetter.wrapperContained); }
// public static void method_56517(java.util.Map loader,yarnwrap.resource.ResourceFactory infoGetter, ) { net.minecraft.registry.RegistryLoader.method_56517(loader,infoGetter.wrapperContained); }
// public void loadFromNetwork(java.util.Map data,yarnwrap.resource.ResourceFactory factory,Object infoGetter,yarnwrap.registry.MutableRegistry registry,com.mojang.serialization.Decoder decoder,java.util.Map loadingErrors) { wrapperContained.loadFromNetwork(data,factory.wrapperContained,infoGetter,registry.wrapperContained,decoder,loadingErrors); }
// public static void loadFromNetwork(java.util.Map data,yarnwrap.resource.ResourceFactory factory,Object infoGetter,yarnwrap.registry.MutableRegistry registry,com.mojang.serialization.Decoder decoder,java.util.Map loadingErrors, ) { net.minecraft.registry.RegistryLoader.loadFromNetwork(data,factory.wrapperContained,infoGetter,registry.wrapperContained,decoder,loadingErrors); }
// public Object loadFromNetwork(java.util.Map data,yarnwrap.resource.ResourceFactory factory,java.util.List registries,java.util.List entries) { return wrapperContained.loadFromNetwork(data,factory.wrapperContained,registries,entries); }
// public static Object loadFromNetwork(java.util.Map data,yarnwrap.resource.ResourceFactory factory,java.util.List registries,java.util.List entries, ) { return net.minecraft.registry.RegistryLoader.loadFromNetwork(data,factory.wrapperContained,registries,entries); }
// public com.mojang.serialization.Lifecycle method_56913(java.lang.Boolean vanilla) { return wrapperContained.method_56913(vanilla); }
// public static com.mojang.serialization.Lifecycle method_56913(java.lang.Boolean vanilla, ) { return net.minecraft.registry.RegistryLoader.method_56913(vanilla); }
// public yarnwrap.registry.entry.RegistryEntryInfo method_56914(java.util.Optional knownPacks) { return new yarnwrap.registry.entry.RegistryEntryInfo(wrapperContained.method_56914(knownPacks)); }
// public static yarnwrap.registry.entry.RegistryEntryInfo method_56914(java.util.Optional knownPacks, ) { return new yarnwrap.registry.entry.RegistryEntryInfo(net.minecraft.registry.RegistryLoader.method_56914(knownPacks)); }
// public void parseAndAdd(yarnwrap.registry.MutableRegistry registry,com.mojang.serialization.Decoder decoder,yarnwrap.registry.RegistryOps ops,yarnwrap.registry.RegistryKey key,yarnwrap.resource.Resource resource,yarnwrap.registry.entry.RegistryEntryInfo entryInfo) { wrapperContained.parseAndAdd(registry.wrapperContained,decoder,ops.wrapperContained,key.wrapperContained,resource.wrapperContained,entryInfo.wrapperContained); }
// public static void parseAndAdd(yarnwrap.registry.MutableRegistry registry,com.mojang.serialization.Decoder decoder,yarnwrap.registry.RegistryOps ops,yarnwrap.registry.RegistryKey key,yarnwrap.resource.Resource resource,yarnwrap.registry.entry.RegistryEntryInfo entryInfo, ) { net.minecraft.registry.RegistryLoader.parseAndAdd(registry.wrapperContained,decoder,ops.wrapperContained,key.wrapperContained,resource.wrapperContained,entryInfo.wrapperContained); }
// public void method_62804(java.io.PrintWriter entry) { wrapperContained.method_62804(entry); }
// public static void method_62804(java.io.PrintWriter entry, ) { net.minecraft.registry.RegistryLoader.method_62804(entry); }
// public void method_62805(java.lang.StringBuilder entry) { wrapperContained.method_62805(entry); }
// public static void method_62805(java.lang.StringBuilder entry, ) { net.minecraft.registry.RegistryLoader.method_62805(entry); }
// public void method_62807(java.io.PrintWriter element) { wrapperContained.method_62807(element); }
// public static void method_62807(java.io.PrintWriter element, ) { net.minecraft.registry.RegistryLoader.method_62807(element); }
// public yarnwrap.util.Identifier method_62808(Object entry) { return new yarnwrap.util.Identifier(wrapperContained.method_62808(entry)); }
// public static yarnwrap.util.Identifier method_62808(Object entry, ) { return new yarnwrap.util.Identifier(net.minecraft.registry.RegistryLoader.method_62808(entry)); }
// public void writeLoadingError(java.util.Map exceptions) { wrapperContained.writeLoadingError(exceptions); }
// public static void writeLoadingError(java.util.Map exceptions, ) { net.minecraft.registry.RegistryLoader.writeLoadingError(exceptions); }
// public yarnwrap.util.crash.CrashException createLoadingException(java.util.Map exceptions) { return new yarnwrap.util.crash.CrashException(wrapperContained.createLoadingException(exceptions)); }
// public static yarnwrap.util.crash.CrashException createLoadingException(java.util.Map exceptions, ) { return new yarnwrap.util.crash.CrashException(net.minecraft.registry.RegistryLoader.createLoadingException(exceptions)); }

}