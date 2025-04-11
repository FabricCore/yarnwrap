package yarnwrap.registry;
public class ReloadableRegistries { public net.minecraft.registry.ReloadableRegistries wrapperContained; public ReloadableRegistries(net.minecraft.registry.ReloadableRegistries wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
// public yarnwrap.registry.entry.RegistryEntryInfo DEFAULT_REGISTRY_ENTRY_INFO() { return new yarnwrap.registry.entry.RegistryEntryInfo(wrapperContained.DEFAULT_REGISTRY_ENTRY_INFO); }
// public void DEFAULT_REGISTRY_ENTRY_INFO(yarnwrap.registry.entry.RegistryEntryInfo value) { wrapperContained.DEFAULT_REGISTRY_ENTRY_INFO = value.wrapperContained; }
// public java.util.concurrent.CompletableFuture prepare(yarnwrap.loot.LootDataType type,yarnwrap.registry.RegistryOps ops,yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor prepareExecutor) { return wrapperContained.prepare(type.wrapperContained,ops.wrapperContained,resourceManager.wrapperContained,prepareExecutor); }
// public void validateLootData(yarnwrap.loot.LootTableReporter reporter,yarnwrap.loot.LootDataType lootDataType,yarnwrap.registry.DynamicRegistryManager registryManager) { wrapperContained.validateLootData(reporter.wrapperContained,lootDataType.wrapperContained,registryManager.wrapperContained); }
public java.util.concurrent.CompletableFuture reload(yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor prepareExecutor) { return wrapperContained.reload(dynamicRegistries.wrapperContained,resourceManager.wrapperContained,prepareExecutor); }
// public yarnwrap.registry.CombinedDynamicRegistries apply(yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,java.util.List registries) { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.apply(dynamicRegistries.wrapperContained,registries)); }
// public yarnwrap.registry.CombinedDynamicRegistries with(yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,java.util.List registries) { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.with(dynamicRegistries.wrapperContained,registries)); }

}