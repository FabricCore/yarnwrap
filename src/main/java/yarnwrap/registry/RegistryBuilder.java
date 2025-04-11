package yarnwrap.registry;
public class RegistryBuilder { public net.minecraft.registry.RegistryBuilder wrapperContained; public RegistryBuilder(net.minecraft.registry.RegistryBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List registries() { return wrapperContained.registries; }
// public void registries(java.util.List value) { wrapperContained.registries = value; }
// public yarnwrap.registry.RegistryBuilder addRegistry(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Lifecycle lifecycle,Object bootstrapFunction) { return new yarnwrap.registry.RegistryBuilder(wrapperContained.addRegistry(registryRef.wrapperContained,lifecycle,bootstrapFunction)); }
// public yarnwrap.registry.RegistryBuilder addRegistry(yarnwrap.registry.RegistryKey registryRef,Object bootstrapFunction) { return new yarnwrap.registry.RegistryBuilder(wrapperContained.addRegistry(registryRef.wrapperContained,bootstrapFunction)); }
// public yarnwrap.registry.RegistryEntryLookup toLookup(Object wrapper) { return new yarnwrap.registry.RegistryEntryLookup(wrapperContained.toLookup(wrapper)); }
public Object createWrapperLookup(yarnwrap.registry.DynamicRegistryManager registryManager) { return wrapperContained.createWrapperLookup(registryManager.wrapperContained); }
// public Object createWrapperLookup(yarnwrap.registry.DynamicRegistryManager baseRegistryManager,Object wrapperLookup,Object cloneableRegistries) { return wrapperContained.createWrapperLookup(baseRegistryManager.wrapperContained,wrapperLookup,cloneableRegistries); }
// public Object createBootstrappedRegistries(yarnwrap.registry.DynamicRegistryManager registryManager) { return wrapperContained.createBootstrappedRegistries(registryManager.wrapperContained); }
// public Object createWrapper(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Lifecycle lifecycle,yarnwrap.registry.entry.RegistryEntryOwner owner,java.util.Map entries) { return wrapperContained.createWrapper(registryRef.wrapperContained,lifecycle,owner.wrapperContained,entries); }
// public Object applyPatches(yarnwrap.registry.entry.RegistryEntryOwner owner,Object cloneableRegistries,yarnwrap.registry.RegistryKey registryRef,Object patches,Object base,org.apache.commons.lang3.mutable.MutableObject lazyWrapper) { return wrapperContained.applyPatches(owner.wrapperContained,cloneableRegistries,registryRef.wrapperContained,patches,base,lazyWrapper); }
// public Object createFullWrapperLookup(yarnwrap.registry.DynamicRegistryManager registryManager,Object base,Object cloneableRegistries,java.util.Map initializedRegistries,Object patches) { return wrapperContained.createFullWrapperLookup(registryManager.wrapperContained,base,cloneableRegistries,initializedRegistries,patches); }
// public Object createWrapperLookup(Object entryOwner,yarnwrap.registry.DynamicRegistryManager registryManager,java.util.stream.Stream wrappers) { return wrapperContained.createWrapperLookup(entryOwner,registryManager.wrapperContained,wrappers); }

}