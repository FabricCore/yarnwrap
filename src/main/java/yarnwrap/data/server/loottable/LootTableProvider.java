package yarnwrap.data.server.loottable;
public class LootTableProvider { public net.minecraft.data.server.loottable.LootTableProvider wrapperContained; public LootTableProvider(net.minecraft.data.server.loottable.LootTableProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List lootTypeGenerators() { return wrapperContained.lootTypeGenerators; }
// public void lootTypeGenerators(java.util.List value) { wrapperContained.lootTypeGenerators = value; }
// public static java.util.List lootTypeGenerators() { return net.minecraft.data.server.loottable.LootTableProvider.lootTypeGenerators; }
// public static void lootTypeGenerators(java.util.List value, ) { net.minecraft.data.server.loottable.LootTableProvider.lootTypeGenerators = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.data.server.loottable.LootTableProvider.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.data.server.loottable.LootTableProvider.LOGGER = value; }

// public Object pathResolver() { return wrapperContained.pathResolver; }
// // public void pathResolver(Object value) { wrapperContained.pathResolver = value; }
// // public static Object pathResolver() { return net.minecraft.data.server.loottable.LootTableProvider.pathResolver; }
// // public static void pathResolver(Object value, ) { net.minecraft.data.server.loottable.LootTableProvider.pathResolver = value; }

// public java.util.Set lootTableIds() { return wrapperContained.lootTableIds; }
// public void lootTableIds(java.util.Set value) { wrapperContained.lootTableIds = value; }
// public static java.util.Set lootTableIds() { return net.minecraft.data.server.loottable.LootTableProvider.lootTableIds; }
// public static void lootTableIds(java.util.Set value, ) { net.minecraft.data.server.loottable.LootTableProvider.lootTableIds = value; }

// public java.util.concurrent.CompletableFuture registryLookupFuture() { return wrapperContained.registryLookupFuture; }
// public void registryLookupFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.registryLookupFuture = value; }
// public static java.util.concurrent.CompletableFuture registryLookupFuture() { return net.minecraft.data.server.loottable.LootTableProvider.registryLookupFuture; }
// public static void registryLookupFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.data.server.loottable.LootTableProvider.registryLookupFuture = value; }

public LootTableProvider(yarnwrap.data.DataOutput output,java.util.Set lootTableIds,java.util.List lootTypeGenerators,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.loottable.LootTableProvider(output.wrapperContained,lootTableIds,lootTypeGenerators,registryLookupFuture); }
// public void method_10407(java.lang.String name,java.lang.String message) { wrapperContained.method_10407(name,message); }
// public static void method_10407(java.lang.String name,java.lang.String message, ) { net.minecraft.data.server.loottable.LootTableProvider.method_10407(name,message); }
// public java.util.concurrent.CompletableFuture method_10408(yarnwrap.data.DataWriter entry) { return wrapperContained.method_10408(entry.wrapperContained); }
// public static java.util.concurrent.CompletableFuture method_10408(yarnwrap.data.DataWriter entry, ) { return net.minecraft.data.server.loottable.LootTableProvider.method_10408(entry.wrapperContained); }
// public void method_10410(Object lootTypeGenerator) { wrapperContained.method_10410(lootTypeGenerator); }
// public static void method_10410(Object lootTypeGenerator, ) { net.minecraft.data.server.loottable.LootTableProvider.method_10410(lootTypeGenerator); }
// public void method_10411(yarnwrap.loot.LootTableReporter entry) { wrapperContained.method_10411(entry.wrapperContained); }
// public static void method_10411(yarnwrap.loot.LootTableReporter entry, ) { net.minecraft.data.server.loottable.LootTableProvider.method_10411(entry.wrapperContained); }
// public void method_10412(java.util.Map lootTable,Object builder) { wrapperContained.method_10412(lootTable,builder); }
// public static void method_10412(java.util.Map lootTable,Object builder, ) { net.minecraft.data.server.loottable.LootTableProvider.method_10412(lootTable,builder); }
// public java.util.concurrent.CompletableFuture run(yarnwrap.data.DataWriter writer,Object registryLookup) { return wrapperContained.run(writer.wrapperContained,registryLookup); }
// public static java.util.concurrent.CompletableFuture run(yarnwrap.data.DataWriter writer,Object registryLookup, ) { return net.minecraft.data.server.loottable.LootTableProvider.run(writer.wrapperContained,registryLookup); }
// public java.util.concurrent.CompletionStage method_56884(yarnwrap.data.DataWriter registryLookup) { return wrapperContained.method_56884(registryLookup.wrapperContained); }
// public static java.util.concurrent.CompletionStage method_56884(yarnwrap.data.DataWriter registryLookup, ) { return net.minecraft.data.server.loottable.LootTableProvider.method_56884(registryLookup.wrapperContained); }
// public yarnwrap.util.Identifier getId(yarnwrap.registry.RegistryKey lootTableKey) { return new yarnwrap.util.Identifier(wrapperContained.getId(lootTableKey.wrapperContained)); }
// public static yarnwrap.util.Identifier getId(yarnwrap.registry.RegistryKey lootTableKey, ) { return new yarnwrap.util.Identifier(net.minecraft.data.server.loottable.LootTableProvider.getId(lootTableKey.wrapperContained)); }

}