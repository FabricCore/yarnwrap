package yarnwrap.registry;
public class ReloadableRegistries { public net.minecraft.registry.ReloadableRegistries wrapperContained; public ReloadableRegistries(net.minecraft.registry.ReloadableRegistries wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.registry.ReloadableRegistries.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.registry.ReloadableRegistries.LOGGER = value; }

// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
// public static com.google.gson.Gson GSON() { return net.minecraft.registry.ReloadableRegistries.GSON; }
// public static void GSON(com.google.gson.Gson value, ) { net.minecraft.registry.ReloadableRegistries.GSON = value; }

// public yarnwrap.registry.entry.RegistryEntryInfo DEFAULT_REGISTRY_ENTRY_INFO() { return new yarnwrap.registry.entry.RegistryEntryInfo(wrapperContained.DEFAULT_REGISTRY_ENTRY_INFO); }
// public void DEFAULT_REGISTRY_ENTRY_INFO(yarnwrap.registry.entry.RegistryEntryInfo value) { wrapperContained.DEFAULT_REGISTRY_ENTRY_INFO = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntryInfo DEFAULT_REGISTRY_ENTRY_INFO() { return new yarnwrap.registry.entry.RegistryEntryInfo(net.minecraft.registry.ReloadableRegistries.DEFAULT_REGISTRY_ENTRY_INFO); }
// public static void DEFAULT_REGISTRY_ENTRY_INFO(yarnwrap.registry.entry.RegistryEntryInfo value, ) { net.minecraft.registry.ReloadableRegistries.DEFAULT_REGISTRY_ENTRY_INFO = value.wrapperContained; }

// public java.util.concurrent.CompletableFuture method_58276(yarnwrap.registry.RegistryOps type) { return wrapperContained.method_58276(type.wrapperContained); }
// public static java.util.concurrent.CompletableFuture method_58276(yarnwrap.registry.RegistryOps type, ) { return net.minecraft.registry.ReloadableRegistries.method_58276(type.wrapperContained); }
// public java.util.concurrent.CompletableFuture prepare(yarnwrap.loot.LootDataType type,yarnwrap.registry.RegistryOps ops,yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor prepareExecutor) { return wrapperContained.prepare(type.wrapperContained,ops.wrapperContained,resourceManager.wrapperContained,prepareExecutor); }
// public static java.util.concurrent.CompletableFuture prepare(yarnwrap.loot.LootDataType type,yarnwrap.registry.RegistryOps ops,yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor prepareExecutor, ) { return net.minecraft.registry.ReloadableRegistries.prepare(type.wrapperContained,ops.wrapperContained,resourceManager.wrapperContained,prepareExecutor); }
// public void method_58278(yarnwrap.loot.LootDataType id,yarnwrap.registry.RegistryOps json) { wrapperContained.method_58278(id.wrapperContained,json.wrapperContained); }
// public static void method_58278(yarnwrap.loot.LootDataType id,yarnwrap.registry.RegistryOps json, ) { net.minecraft.registry.ReloadableRegistries.method_58278(id.wrapperContained,json.wrapperContained); }
// public void method_58280(yarnwrap.loot.LootDataType entry) { wrapperContained.method_58280(entry.wrapperContained); }
// public static void method_58280(yarnwrap.loot.LootDataType entry, ) { net.minecraft.registry.ReloadableRegistries.method_58280(entry.wrapperContained); }
// public void validateLootData(yarnwrap.loot.LootTableReporter reporter,yarnwrap.loot.LootDataType lootDataType,yarnwrap.registry.DynamicRegistryManager registryManager) { wrapperContained.validateLootData(reporter.wrapperContained,lootDataType.wrapperContained,registryManager.wrapperContained); }
// public static void validateLootData(yarnwrap.loot.LootTableReporter reporter,yarnwrap.loot.LootDataType lootDataType,yarnwrap.registry.DynamicRegistryManager registryManager, ) { net.minecraft.registry.ReloadableRegistries.validateLootData(reporter.wrapperContained,lootDataType.wrapperContained,registryManager.wrapperContained); }
// public void method_58282(yarnwrap.loot.LootTableReporter lootDataType) { wrapperContained.method_58282(lootDataType.wrapperContained); }
// public static void method_58282(yarnwrap.loot.LootTableReporter lootDataType, ) { net.minecraft.registry.ReloadableRegistries.method_58282(lootDataType.wrapperContained); }
// public void method_58283(java.lang.String path,java.lang.String message) { wrapperContained.method_58283(path,message); }
// public static void method_58283(java.lang.String path,java.lang.String message, ) { net.minecraft.registry.ReloadableRegistries.method_58283(path,message); }
// public java.util.concurrent.CompletableFuture reload(yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor prepareExecutor) { return wrapperContained.reload(dynamicRegistries.wrapperContained,resourceManager.wrapperContained,prepareExecutor); }
// public static java.util.concurrent.CompletableFuture reload(yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor prepareExecutor, ) { return net.minecraft.registry.ReloadableRegistries.reload(dynamicRegistries.wrapperContained,resourceManager.wrapperContained,prepareExecutor); }
// public yarnwrap.registry.CombinedDynamicRegistries apply(yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,java.util.List registries) { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.apply(dynamicRegistries.wrapperContained,registries)); }
// public static yarnwrap.registry.CombinedDynamicRegistries apply(yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,java.util.List registries, ) { return new yarnwrap.registry.CombinedDynamicRegistries(net.minecraft.registry.ReloadableRegistries.apply(dynamicRegistries.wrapperContained,registries)); }
// public void method_58286(yarnwrap.registry.MutableRegistry value) { wrapperContained.method_58286(value.wrapperContained); }
// public static void method_58286(yarnwrap.registry.MutableRegistry value, ) { net.minecraft.registry.ReloadableRegistries.method_58286(value.wrapperContained); }
// public yarnwrap.registry.CombinedDynamicRegistries with(yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,java.util.List registries) { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.with(dynamicRegistries.wrapperContained,registries)); }
// public static yarnwrap.registry.CombinedDynamicRegistries with(yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,java.util.List registries, ) { return new yarnwrap.registry.CombinedDynamicRegistries(net.minecraft.registry.ReloadableRegistries.with(dynamicRegistries.wrapperContained,registries)); }
// public yarnwrap.registry.CombinedDynamicRegistries method_58288(yarnwrap.registry.CombinedDynamicRegistries registries) { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.method_58288(registries.wrapperContained)); }
// public static yarnwrap.registry.CombinedDynamicRegistries method_58288(yarnwrap.registry.CombinedDynamicRegistries registries, ) { return new yarnwrap.registry.CombinedDynamicRegistries(net.minecraft.registry.ReloadableRegistries.method_58288(registries.wrapperContained)); }

}