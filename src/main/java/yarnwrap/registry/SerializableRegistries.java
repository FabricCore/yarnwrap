package yarnwrap.registry;
public class SerializableRegistries { public net.minecraft.registry.SerializableRegistries wrapperContained; public SerializableRegistries(net.minecraft.registry.SerializableRegistries wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Set SYNCED_REGISTRIES() { return wrapperContained.SYNCED_REGISTRIES; }
// public void SYNCED_REGISTRIES(java.util.Set value) { wrapperContained.SYNCED_REGISTRIES = value; }
public java.util.stream.Stream streamRegistryManagerEntries(yarnwrap.registry.CombinedDynamicRegistries combinedRegistries) { return wrapperContained.streamRegistryManagerEntries(combinedRegistries.wrapperContained); }
// public java.util.stream.Stream stream(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager) { return wrapperContained.stream(dynamicRegistryManager.wrapperContained); }
public java.util.stream.Stream streamDynamicEntries(yarnwrap.registry.CombinedDynamicRegistries combinedRegistries) { return wrapperContained.streamDynamicEntries(combinedRegistries.wrapperContained); }
// public void method_56595(yarnwrap.registry.Registry registryEntry) { wrapperContained.method_56595(registryEntry.wrapperContained); }
// public void method_56596(java.util.Set registry) { wrapperContained.method_56596(registry); }
// public void serialize(com.mojang.serialization.DynamicOps nbtOps,Object entry,yarnwrap.registry.DynamicRegistryManager registryManager,java.util.Set knownPacks,java.util.function.BiConsumer callback) { wrapperContained.serialize(nbtOps,entry,registryManager.wrapperContained,knownPacks,callback); }
public void forEachSyncedRegistry(com.mojang.serialization.DynamicOps nbtOps,yarnwrap.registry.DynamicRegistryManager registryManager,java.util.Set knownPacks,java.util.function.BiConsumer callback) { wrapperContained.forEachSyncedRegistry(nbtOps,registryManager.wrapperContained,knownPacks,callback); }
// public void method_56599(com.mojang.serialization.DynamicOps registry) { wrapperContained.method_56599(registry); }
// public java.lang.IllegalArgumentException method_56600(Object error) { return wrapperContained.method_56600(error); }
// public boolean method_56601(Object registry) { return wrapperContained.method_56601(registry); }

}