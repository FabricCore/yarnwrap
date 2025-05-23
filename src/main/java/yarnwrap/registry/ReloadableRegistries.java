package yarnwrap.registry;
public class ReloadableRegistries { public net.minecraft.registry.ReloadableRegistries wrapperContained; public ReloadableRegistries(net.minecraft.registry.ReloadableRegistries wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.registry.ReloadableRegistries.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.registry.ReloadableRegistries.LOGGER = value; }

// public yarnwrap.registry.entry.RegistryEntryInfo DEFAULT_REGISTRY_ENTRY_INFO() { return new yarnwrap.registry.entry.RegistryEntryInfo(wrapperContained.DEFAULT_REGISTRY_ENTRY_INFO); }
// public void DEFAULT_REGISTRY_ENTRY_INFO(yarnwrap.registry.entry.RegistryEntryInfo value) { wrapperContained.DEFAULT_REGISTRY_ENTRY_INFO = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntryInfo DEFAULT_REGISTRY_ENTRY_INFO() { return new yarnwrap.registry.entry.RegistryEntryInfo(net.minecraft.registry.ReloadableRegistries.DEFAULT_REGISTRY_ENTRY_INFO); }
// public static void DEFAULT_REGISTRY_ENTRY_INFO(yarnwrap.registry.entry.RegistryEntryInfo value, ) { net.minecraft.registry.ReloadableRegistries.DEFAULT_REGISTRY_ENTRY_INFO = value.wrapperContained; }

// public java.util.concurrent.CompletableFuture method_58276(yarnwrap.registry.RegistryOps type) { return wrapperContained.method_58276(type.wrapperContained); }
// public static java.util.concurrent.CompletableFuture method_58276(yarnwrap.registry.RegistryOps type, ) { return net.minecraft.registry.ReloadableRegistries.method_58276(type.wrapperContained); }
// public java.util.concurrent.CompletableFuture prepare(yarnwrap.loot.LootDataType type,yarnwrap.registry.RegistryOps ops,yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor prepareExecutor) { return wrapperContained.prepare(type.wrapperContained,ops.wrapperContained,resourceManager.wrapperContained,prepareExecutor); }
// public static java.util.concurrent.CompletableFuture prepare(yarnwrap.loot.LootDataType type,yarnwrap.registry.RegistryOps ops,yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor prepareExecutor, ) { return net.minecraft.registry.ReloadableRegistries.prepare(type.wrapperContained,ops.wrapperContained,resourceManager.wrapperContained,prepareExecutor); }
// public void method_58280(yarnwrap.loot.LootDataType entry) { wrapperContained.method_58280(entry.wrapperContained); }
// public static void method_58280(yarnwrap.loot.LootDataType entry, ) { net.minecraft.registry.ReloadableRegistries.method_58280(entry.wrapperContained); }
// public void validateLootData(yarnwrap.loot.LootTableReporter reporter,yarnwrap.loot.LootDataType lootDataType,Object registries) { wrapperContained.validateLootData(reporter.wrapperContained,lootDataType.wrapperContained,registries); }
// public static void validateLootData(yarnwrap.loot.LootTableReporter reporter,yarnwrap.loot.LootDataType lootDataType,Object registries, ) { net.minecraft.registry.ReloadableRegistries.validateLootData(reporter.wrapperContained,lootDataType.wrapperContained,registries); }
// public java.util.concurrent.CompletableFuture reload(yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,java.util.List pendingTagLoads,yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor prepareExecutor) { return wrapperContained.reload(dynamicRegistries.wrapperContained,pendingTagLoads,resourceManager.wrapperContained,prepareExecutor); }
// public static java.util.concurrent.CompletableFuture reload(yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,java.util.List pendingTagLoads,yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor prepareExecutor, ) { return net.minecraft.registry.ReloadableRegistries.reload(dynamicRegistries.wrapperContained,pendingTagLoads,resourceManager.wrapperContained,prepareExecutor); }
// public yarnwrap.registry.CombinedDynamicRegistries with(yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,java.util.List registries) { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.with(dynamicRegistries.wrapperContained,registries)); }
// public static yarnwrap.registry.CombinedDynamicRegistries with(yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,java.util.List registries, ) { return new yarnwrap.registry.CombinedDynamicRegistries(net.minecraft.registry.ReloadableRegistries.with(dynamicRegistries.wrapperContained,registries)); }
// public void method_61241(yarnwrap.loot.LootTableReporter type) { wrapperContained.method_61241(type.wrapperContained); }
// public static void method_61241(yarnwrap.loot.LootTableReporter type, ) { net.minecraft.registry.ReloadableRegistries.method_61241(type.wrapperContained); }
// public void method_61242(java.lang.String id) { wrapperContained.method_61242(id); }
// public static void method_61242(java.lang.String id, ) { net.minecraft.registry.ReloadableRegistries.method_61242(id); }
// public void validate(Object registries) { wrapperContained.validate(registries); }
// public static void validate(Object registries, ) { net.minecraft.registry.ReloadableRegistries.validate(registries); }
// public Object concat(Object first,Object second) { return wrapperContained.concat(first,second); }
// public static Object concat(Object first,Object second, ) { return net.minecraft.registry.ReloadableRegistries.concat(first,second); }
// public Object toResult(yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,Object nonReloadables,java.util.List registries) { return wrapperContained.toResult(dynamicRegistries.wrapperContained,nonReloadables,registries); }
// public static Object toResult(yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,Object nonReloadables,java.util.List registries, ) { return net.minecraft.registry.ReloadableRegistries.toResult(dynamicRegistries.wrapperContained,nonReloadables,registries); }
// public void method_61246(yarnwrap.registry.MutableRegistry id,yarnwrap.loot.LootDataType value) { wrapperContained.method_61246(id.wrapperContained,value.wrapperContained); }
// public static void method_61246(yarnwrap.registry.MutableRegistry id,yarnwrap.loot.LootDataType value, ) { net.minecraft.registry.ReloadableRegistries.method_61246(id.wrapperContained,value.wrapperContained); }
// public Object method_61247(yarnwrap.registry.CombinedDynamicRegistries registries) { return wrapperContained.method_61247(registries.wrapperContained); }
// public static Object method_61247(yarnwrap.registry.CombinedDynamicRegistries registries, ) { return net.minecraft.registry.ReloadableRegistries.method_61247(registries.wrapperContained); }

}