package yarnwrap.registry;
public class CombinedDynamicRegistries { public net.minecraft.registry.CombinedDynamicRegistries wrapperContained; public CombinedDynamicRegistries(net.minecraft.registry.CombinedDynamicRegistries wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List types() { return wrapperContained.types; }
// public void types(java.util.List value) { wrapperContained.types = value; }
// public java.util.List registryManagers() { return wrapperContained.registryManagers; }
// public void registryManagers(java.util.List value) { wrapperContained.registryManagers = value; }
// public Object combinedRegistryManager() { return wrapperContained.combinedRegistryManager; }
// // public void combinedRegistryManager(Object value) { wrapperContained.combinedRegistryManager = value; }
public CombinedDynamicRegistries(java.util.List types) { this.wrapperContained = new net.minecraft.registry.CombinedDynamicRegistries(types); }
// public CombinedDynamicRegistries(java.util.List types,java.util.List registryManagers) { this.wrapperContained = new net.minecraft.registry.CombinedDynamicRegistries(types,registryManagers); }
public Object getCombinedRegistryManager() { return wrapperContained.getCombinedRegistryManager(); }
// public Object subset(int startIndex,int endIndex) { return wrapperContained.subset(startIndex,endIndex); }
public Object get(java.lang.Object index) { return wrapperContained.get(index); }
public yarnwrap.registry.CombinedDynamicRegistries with(java.lang.Object type,java.util.List registryManagers) { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.with(type,registryManagers)); }
// public yarnwrap.registry.CombinedDynamicRegistries with(java.lang.Object type,Object[] registryManagers) { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.with(type,registryManagers)); }
// public void method_45932(java.util.Map entry) { wrapperContained.method_45932(entry); }
// public void method_45933(java.util.Map registryManager) { wrapperContained.method_45933(registryManager); }
// public java.util.Map toRegistryMap(java.util.stream.Stream registryManagers) { return wrapperContained.toRegistryMap(registryManagers); }
public Object getPrecedingRegistryManagers(java.lang.Object type) { return wrapperContained.getPrecedingRegistryManagers(type); }
public Object getSucceedingRegistryManagers(java.lang.Object type) { return wrapperContained.getSucceedingRegistryManagers(type); }
// public int getIndex(java.lang.Object type) { return wrapperContained.getIndex(type); }

}