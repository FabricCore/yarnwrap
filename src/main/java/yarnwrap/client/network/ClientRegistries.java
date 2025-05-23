package yarnwrap.client.network;
public class ClientRegistries { public net.minecraft.client.network.ClientRegistries wrapperContained; public ClientRegistries(net.minecraft.client.network.ClientRegistries wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object dynamicRegistries() { return wrapperContained.dynamicRegistries; }
// // public void dynamicRegistries(Object value) { wrapperContained.dynamicRegistries = value; }
// // public static Object dynamicRegistries() { return net.minecraft.client.network.ClientRegistries.dynamicRegistries; }
// // public static void dynamicRegistries(Object value, ) { net.minecraft.client.network.ClientRegistries.dynamicRegistries = value; }

// public Object tags() { return wrapperContained.tags; }
// // public void tags(Object value) { wrapperContained.tags = value; }
// // public static Object tags() { return net.minecraft.client.network.ClientRegistries.tags; }
// // public static void tags(Object value, ) { net.minecraft.client.network.ClientRegistries.tags = value; }

public void putDynamicRegistry(yarnwrap.registry.RegistryKey registryRef,java.util.List entries) { wrapperContained.putDynamicRegistry(registryRef.wrapperContained,entries); }
// public static void putDynamicRegistry(yarnwrap.registry.RegistryKey registryRef,java.util.List entries, ) { net.minecraft.client.network.ClientRegistries.putDynamicRegistry(registryRef.wrapperContained,entries); }
// public Object createRegistryManager(yarnwrap.resource.ResourceFactory resourceFactory,Object registryManager,boolean local) { return wrapperContained.createRegistryManager(resourceFactory.wrapperContained,registryManager,local); }
// public static Object createRegistryManager(yarnwrap.resource.ResourceFactory resourceFactory,Object registryManager,boolean local, ) { return net.minecraft.client.network.ClientRegistries.createRegistryManager(resourceFactory.wrapperContained,registryManager,local); }
public void putTags(java.util.Map tags) { wrapperContained.putTags(tags); }
// public static void putTags(java.util.Map tags, ) { net.minecraft.client.network.ClientRegistries.putTags(tags); }
// // public yarnwrap.registry.DynamicRegistryManager createRegistryManager(yarnwrap.resource.ResourceFactory resourceFactory,Object dynamicRegistries,boolean local) { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.createRegistryManager(resourceFactory.wrapperContained,dynamicRegistries,local)); }
// // public static yarnwrap.registry.DynamicRegistryManager createRegistryManager(yarnwrap.resource.ResourceFactory resourceFactory,Object dynamicRegistries,boolean local, ) { return new yarnwrap.registry.DynamicRegistryManager(net.minecraft.client.network.ClientRegistries.createRegistryManager(resourceFactory.wrapperContained,dynamicRegistries,local)); }
// public Object method_62156(Object key,yarnwrap.registry.RegistryKey value) { return wrapperContained.method_62156(key,value.wrapperContained); }
// public static Object method_62156(Object key,yarnwrap.registry.RegistryKey value, ) { return net.minecraft.client.network.ClientRegistries.method_62156(key,value.wrapperContained); }
// public void loadTags(Object tags,Object registryManager,boolean local) { wrapperContained.loadTags(tags,registryManager,local); }
// public static void loadTags(Object tags,Object registryManager,boolean local, ) { net.minecraft.client.network.ClientRegistries.loadTags(tags,registryManager,local); }
// public void method_62158(java.util.Map registryRef,yarnwrap.registry.RegistryKey entries) { wrapperContained.method_62158(registryRef,entries.wrapperContained); }
// public static void method_62158(java.util.Map registryRef,yarnwrap.registry.RegistryKey entries, ) { net.minecraft.client.network.ClientRegistries.method_62158(registryRef,entries.wrapperContained); }
// public void method_62159(java.util.Map registryRef,boolean tags) { wrapperContained.method_62159(registryRef,tags); }
// public static void method_62159(java.util.Map registryRef,boolean tags, ) { net.minecraft.client.network.ClientRegistries.method_62159(registryRef,tags); }
// public Object startTagReload(Object registryManager,yarnwrap.registry.RegistryKey registryRef,Object tags) { return wrapperContained.startTagReload(registryManager,registryRef.wrapperContained,tags); }
// public static Object startTagReload(Object registryManager,yarnwrap.registry.RegistryKey registryRef,Object tags, ) { return net.minecraft.client.network.ClientRegistries.startTagReload(registryManager,registryRef.wrapperContained,tags); }
// public void method_62161(boolean registryRef,Object serialized) { wrapperContained.method_62161(registryRef,serialized); }
// public static void method_62161(boolean registryRef,Object serialized, ) { net.minecraft.client.network.ClientRegistries.method_62161(registryRef,serialized); }
// public java.lang.String method_64901(Object entry) { return wrapperContained.method_64901(entry); }
// public static java.lang.String method_64901(Object entry, ) { return net.minecraft.client.network.ClientRegistries.method_64901(entry); }
// public java.lang.String method_64902(Object tag) { return wrapperContained.method_64902(tag); }
// public static java.lang.String method_64902(Object tag, ) { return net.minecraft.client.network.ClientRegistries.method_64902(tag); }
// public void addCrashReportSection(yarnwrap.util.crash.CrashReport crashReport,java.util.Map data,java.util.List tags) { wrapperContained.addCrashReportSection(crashReport.wrapperContained,data,tags); }
// public static void addCrashReportSection(yarnwrap.util.crash.CrashReport crashReport,java.util.Map data,java.util.List tags, ) { net.minecraft.client.network.ClientRegistries.addCrashReportSection(crashReport.wrapperContained,data,tags); }
// public yarnwrap.util.Identifier method_64904(Object entry) { return new yarnwrap.util.Identifier(wrapperContained.method_64904(entry)); }
// public static yarnwrap.util.Identifier method_64904(Object entry, ) { return new yarnwrap.util.Identifier(net.minecraft.client.network.ClientRegistries.method_64904(entry)); }
// public yarnwrap.util.Identifier method_64906(Object tag) { return new yarnwrap.util.Identifier(wrapperContained.method_64906(tag)); }
// public static yarnwrap.util.Identifier method_64906(Object tag, ) { return new yarnwrap.util.Identifier(net.minecraft.client.network.ClientRegistries.method_64906(tag)); }

}