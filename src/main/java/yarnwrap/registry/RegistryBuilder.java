package yarnwrap.registry;
public class RegistryBuilder { public net.minecraft.registry.RegistryBuilder wrapperContained; public RegistryBuilder(net.minecraft.registry.RegistryBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List registries() { return wrapperContained.registries; }
// public void registries(java.util.List value) { wrapperContained.registries = value; }
// public yarnwrap.registry.RegistryBuilder addRegistry(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Lifecycle lifecycle,Object bootstrapFunction) { return new yarnwrap.registry.RegistryBuilder(wrapperContained.addRegistry(registryRef.wrapperContained,lifecycle,bootstrapFunction)); }
// public yarnwrap.registry.RegistryBuilder addRegistry(yarnwrap.registry.RegistryKey registryRef,Object bootstrapFunction) { return new yarnwrap.registry.RegistryBuilder(wrapperContained.addRegistry(registryRef.wrapperContained,bootstrapFunction)); }
// public yarnwrap.registry.RegistryEntryLookup toLookup(Object wrapper) { return new yarnwrap.registry.RegistryEntryLookup(wrapperContained.toLookup(wrapper)); }
public Object createWrapperLookup(yarnwrap.registry.DynamicRegistryManager registryManager) { return wrapperContained.createWrapperLookup(registryManager.wrapperContained); }
// public Object createWrapperLookup(yarnwrap.registry.DynamicRegistryManager baseRegistryManager,Object wrapperLookup,Object cloneableRegistries) { return wrapperContained.createWrapperLookup(baseRegistryManager.wrapperContained,wrapperLookup,cloneableRegistries); }
// public Object method_46782(Object info) { return wrapperContained.method_46782(info); }
// public Object createBootstrappedRegistries(yarnwrap.registry.DynamicRegistryManager registryManager) { return wrapperContained.createBootstrappedRegistries(registryManager.wrapperContained); }
// public Object method_46785(Object info) { return wrapperContained.method_46785(info); }
// public void method_46786(Object registry) { wrapperContained.method_46786(registry); }
// public void method_49352(java.util.Map registry) { wrapperContained.method_49352(registry); }
// public Object createWrapper(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Lifecycle lifecycle,yarnwrap.registry.entry.RegistryEntryOwner owner,java.util.Map entries) { return wrapperContained.createWrapper(registryRef.wrapperContained,lifecycle,owner.wrapperContained,entries); }
// public Object method_55285(yarnwrap.registry.entry.RegistryEntryOwner key) { return wrapperContained.method_55285(key.wrapperContained); }
// public Object applyPatches(yarnwrap.registry.entry.RegistryEntryOwner owner,Object cloneableRegistries,yarnwrap.registry.RegistryKey registryRef,Object patches,Object base,org.apache.commons.lang3.mutable.MutableObject lazyWrapper) { return wrapperContained.applyPatches(owner.wrapperContained,cloneableRegistries,registryRef.wrapperContained,patches,base,lazyWrapper); }
// public void method_55287(yarnwrap.registry.entry.RegistryEntryOwner entry) { wrapperContained.method_55287(entry.wrapperContained); }
// public void method_55288(java.util.Map registry) { wrapperContained.method_55288(registry); }
// public Object createFullWrapperLookup(yarnwrap.registry.DynamicRegistryManager registryManager,Object base,Object cloneableRegistries,java.util.Map initializedRegistries,Object patches) { return wrapperContained.createFullWrapperLookup(registryManager.wrapperContained,base,cloneableRegistries,initializedRegistries,patches); }
// public Object createWrapperLookup(Object entryOwner,yarnwrap.registry.DynamicRegistryManager registryManager,java.util.stream.Stream wrappers) { return wrapperContained.createWrapperLookup(entryOwner,registryManager.wrapperContained,wrappers); }
// public Object method_55291(Object registry) { return wrapperContained.method_55291(registry); }
// public Object method_55292(Object registryRef) { return wrapperContained.method_55292(registryRef); }
// public void method_55293(java.util.Map key) { wrapperContained.method_55293(key); }
// public void method_55294(java.util.Map entry) { wrapperContained.method_55294(entry); }
// public boolean method_55295(java.util.Set key) { return wrapperContained.method_55295(key); }
// public void method_57094(java.util.Map wrapper) { wrapperContained.method_57094(wrapper); }

}