package yarnwrap.data.server.loottable;
public class LootTableProvider { public net.minecraft.data.server.loottable.LootTableProvider wrapperContained; public LootTableProvider(net.minecraft.data.server.loottable.LootTableProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List lootTypeGenerators() { return wrapperContained.lootTypeGenerators; }
// public void lootTypeGenerators(java.util.List value) { wrapperContained.lootTypeGenerators = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public Object pathResolver() { return wrapperContained.pathResolver; }
// // public void pathResolver(Object value) { wrapperContained.pathResolver = value; }
// public java.util.Set lootTableIds() { return wrapperContained.lootTableIds; }
// public void lootTableIds(java.util.Set value) { wrapperContained.lootTableIds = value; }
// public java.util.concurrent.CompletableFuture registryLookupFuture() { return wrapperContained.registryLookupFuture; }
// public void registryLookupFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.registryLookupFuture = value; }
public LootTableProvider(yarnwrap.data.DataOutput output,java.util.Set lootTableIds,java.util.List lootTypeGenerators,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.loottable.LootTableProvider(output.wrapperContained,lootTableIds,lootTypeGenerators,registryLookupFuture); }
// public void method_10407(java.lang.String name,java.lang.String message) { wrapperContained.method_10407(name,message); }
// public java.util.concurrent.CompletableFuture method_10408(yarnwrap.data.DataWriter entry) { return wrapperContained.method_10408(entry.wrapperContained); }
// public void method_10410(Object lootTypeGenerator) { wrapperContained.method_10410(lootTypeGenerator); }
// public void method_10411(yarnwrap.loot.LootTableReporter entry) { wrapperContained.method_10411(entry.wrapperContained); }
// public void method_10412(java.util.Map lootTable,Object builder) { wrapperContained.method_10412(lootTable,builder); }
// public java.util.concurrent.CompletableFuture run(yarnwrap.data.DataWriter writer,Object registryLookup) { return wrapperContained.run(writer.wrapperContained,registryLookup); }
// public java.util.concurrent.CompletionStage method_56884(yarnwrap.data.DataWriter registryLookup) { return wrapperContained.method_56884(registryLookup.wrapperContained); }
// public yarnwrap.util.Identifier getId(yarnwrap.registry.RegistryKey lootTableKey) { return new yarnwrap.util.Identifier(wrapperContained.getId(lootTableKey.wrapperContained)); }

}