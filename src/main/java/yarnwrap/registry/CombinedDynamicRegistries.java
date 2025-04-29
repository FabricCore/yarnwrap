package yarnwrap.registry;
public class CombinedDynamicRegistries { public net.minecraft.registry.CombinedDynamicRegistries wrapperContained; public CombinedDynamicRegistries(net.minecraft.registry.CombinedDynamicRegistries wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List types() { return wrapperContained.types; }
// public void types(java.util.List value) { wrapperContained.types = value; }
// public static java.util.List types() { return net.minecraft.registry.CombinedDynamicRegistries.types; }
// public static void types(java.util.List value, ) { net.minecraft.registry.CombinedDynamicRegistries.types = value; }

// public java.util.List registryManagers() { return wrapperContained.registryManagers; }
// public void registryManagers(java.util.List value) { wrapperContained.registryManagers = value; }
// public static java.util.List registryManagers() { return net.minecraft.registry.CombinedDynamicRegistries.registryManagers; }
// public static void registryManagers(java.util.List value, ) { net.minecraft.registry.CombinedDynamicRegistries.registryManagers = value; }

// public Object combinedRegistryManager() { return wrapperContained.combinedRegistryManager; }
// // public void combinedRegistryManager(Object value) { wrapperContained.combinedRegistryManager = value; }
// // public static Object combinedRegistryManager() { return net.minecraft.registry.CombinedDynamicRegistries.combinedRegistryManager; }
// // public static void combinedRegistryManager(Object value, ) { net.minecraft.registry.CombinedDynamicRegistries.combinedRegistryManager = value; }

public CombinedDynamicRegistries(java.util.List types) { this.wrapperContained = new net.minecraft.registry.CombinedDynamicRegistries(types); }
// public CombinedDynamicRegistries(java.util.List types,java.util.List registryManagers) { this.wrapperContained = new net.minecraft.registry.CombinedDynamicRegistries(types,registryManagers); }
public Object getCombinedRegistryManager() { return wrapperContained.getCombinedRegistryManager(); }
// public static Object getCombinedRegistryManager() { return net.minecraft.registry.CombinedDynamicRegistries.getCombinedRegistryManager(); }
// public Object subset(int startIndex,int endIndex) { return wrapperContained.subset(startIndex,endIndex); }
// public static Object subset(int startIndex,int endIndex, ) { return net.minecraft.registry.CombinedDynamicRegistries.subset(startIndex,endIndex); }
public Object get(java.lang.Object index) { return wrapperContained.get(index); }
// public static Object get(java.lang.Object index, ) { return net.minecraft.registry.CombinedDynamicRegistries.get(index); }
public yarnwrap.registry.CombinedDynamicRegistries with(java.lang.Object type,java.util.List registryManagers) { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.with(type,registryManagers)); }
// public static yarnwrap.registry.CombinedDynamicRegistries with(java.lang.Object type,java.util.List registryManagers, ) { return new yarnwrap.registry.CombinedDynamicRegistries(net.minecraft.registry.CombinedDynamicRegistries.with(type,registryManagers)); }
// public yarnwrap.registry.CombinedDynamicRegistries with(java.lang.Object type,Object[] registryManagers) { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.with(type,registryManagers)); }
// public static yarnwrap.registry.CombinedDynamicRegistries with(java.lang.Object type,Object[] registryManagers, ) { return new yarnwrap.registry.CombinedDynamicRegistries(net.minecraft.registry.CombinedDynamicRegistries.with(type,registryManagers)); }
// public void method_45932(java.util.Map entry) { wrapperContained.method_45932(entry); }
// public static void method_45932(java.util.Map entry, ) { net.minecraft.registry.CombinedDynamicRegistries.method_45932(entry); }
// public void method_45933(java.util.Map registryManager) { wrapperContained.method_45933(registryManager); }
// public static void method_45933(java.util.Map registryManager, ) { net.minecraft.registry.CombinedDynamicRegistries.method_45933(registryManager); }
// public java.util.Map toRegistryMap(java.util.stream.Stream registryManagers) { return wrapperContained.toRegistryMap(registryManagers); }
// public static java.util.Map toRegistryMap(java.util.stream.Stream registryManagers, ) { return net.minecraft.registry.CombinedDynamicRegistries.toRegistryMap(registryManagers); }
public Object getPrecedingRegistryManagers(java.lang.Object type) { return wrapperContained.getPrecedingRegistryManagers(type); }
// public static Object getPrecedingRegistryManagers(java.lang.Object type, ) { return net.minecraft.registry.CombinedDynamicRegistries.getPrecedingRegistryManagers(type); }
public Object getSucceedingRegistryManagers(java.lang.Object type) { return wrapperContained.getSucceedingRegistryManagers(type); }
// public static Object getSucceedingRegistryManagers(java.lang.Object type, ) { return net.minecraft.registry.CombinedDynamicRegistries.getSucceedingRegistryManagers(type); }
// public int getIndex(java.lang.Object type) { return wrapperContained.getIndex(type); }
// public static int getIndex(java.lang.Object type, ) { return net.minecraft.registry.CombinedDynamicRegistries.getIndex(type); }

}