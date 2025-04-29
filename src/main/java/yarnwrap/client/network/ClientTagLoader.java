package yarnwrap.client.network;
public class ClientTagLoader { public net.minecraft.client.network.ClientTagLoader wrapperContained; public ClientTagLoader(net.minecraft.client.network.ClientTagLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map tagsByRegistry() { return wrapperContained.tagsByRegistry; }
// public void tagsByRegistry(java.util.Map value) { wrapperContained.tagsByRegistry = value; }
// public static java.util.Map tagsByRegistry() { return net.minecraft.client.network.ClientTagLoader.tagsByRegistry; }
// public static void tagsByRegistry(java.util.Map value, ) { net.minecraft.client.network.ClientTagLoader.tagsByRegistry = value; }

// public void put(yarnwrap.registry.RegistryKey registryRef,Object serialized) { wrapperContained.put(registryRef.wrapperContained,serialized); }
// public static void put(yarnwrap.registry.RegistryKey registryRef,Object serialized, ) { net.minecraft.client.network.ClientTagLoader.put(registryRef.wrapperContained,serialized); }
// public void load(yarnwrap.registry.DynamicRegistryManager registryManager,java.util.function.Predicate predicate) { wrapperContained.load(registryManager.wrapperContained,predicate); }
// public static void load(yarnwrap.registry.DynamicRegistryManager registryManager,java.util.function.Predicate predicate, ) { net.minecraft.client.network.ClientTagLoader.load(registryManager.wrapperContained,predicate); }
// public void method_56592(java.util.function.Predicate registryRef,yarnwrap.registry.DynamicRegistryManager serialized) { wrapperContained.method_56592(registryRef,serialized.wrapperContained); }
// public static void method_56592(java.util.function.Predicate registryRef,yarnwrap.registry.DynamicRegistryManager serialized, ) { net.minecraft.client.network.ClientTagLoader.method_56592(registryRef,serialized.wrapperContained); }
// public boolean method_57051(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.method_57051(registryRef.wrapperContained); }
// public static boolean method_57051(yarnwrap.registry.RegistryKey registryRef, ) { return net.minecraft.client.network.ClientTagLoader.method_57051(registryRef.wrapperContained); }
// public void method_57052(Object entry) { wrapperContained.method_57052(entry); }
// public static void method_57052(Object entry, ) { net.minecraft.client.network.ClientTagLoader.method_57052(entry); }
public void load(yarnwrap.registry.DynamicRegistryManager registryManager,boolean local) { wrapperContained.load(registryManager.wrapperContained,local); }
// public static void load(yarnwrap.registry.DynamicRegistryManager registryManager,boolean local, ) { net.minecraft.client.network.ClientTagLoader.load(registryManager.wrapperContained,local); }
// public void onStaticTagsLoaded() { wrapperContained.onStaticTagsLoaded(); }
// public static void onStaticTagsLoaded() { net.minecraft.client.network.ClientTagLoader.onStaticTagsLoaded(); }
// public boolean method_57055(Object registries) { return wrapperContained.method_57055(registries); }
// public static boolean method_57055(Object registries, ) { return net.minecraft.client.network.ClientTagLoader.method_57055(registries); }

}