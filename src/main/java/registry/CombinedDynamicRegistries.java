package yarnwrap.registry;
public class CombinedDynamicRegistries { public net.minecraft.registry.CombinedDynamicRegistries wrapperContained; public CombinedDynamicRegistries(net.minecraft.registry.CombinedDynamicRegistries wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List types() { return wrapperContained.types; }
// public java.util.List registryManagers() { return wrapperContained.registryManagers; }
// public Object combinedRegistryManager() { return wrapperContained.combinedRegistryManager; }
public Object getCombinedRegistryManager() { return wrapperContained.getCombinedRegistryManager(); }
// public Object subset(int startIndex,int endIndex) { return wrapperContained.subset(startIndex,endIndex); }
public Object get(java.lang.Object index) { return wrapperContained.get(index); }
public yarnwrap.registry.CombinedDynamicRegistries with(java.lang.Object type,java.util.List registryManagers) { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.with(type,registryManagers)); }
// public yarnwrap.registry.CombinedDynamicRegistries with(java.lang.Object type,Object[] registryManagers) { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.with(type,registryManagers)); }
// public java.util.Map toRegistryMap(java.util.stream.Stream registryManagers) { return wrapperContained.toRegistryMap(registryManagers); }
public Object getPrecedingRegistryManagers(java.lang.Object type) { return wrapperContained.getPrecedingRegistryManagers(type); }
public Object getSucceedingRegistryManagers(java.lang.Object type) { return wrapperContained.getSucceedingRegistryManagers(type); }
// public int getIndex(java.lang.Object type) { return wrapperContained.getIndex(type); }

}