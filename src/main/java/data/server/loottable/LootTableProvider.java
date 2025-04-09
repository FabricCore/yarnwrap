package yarnwrap.data.server.loottable;
public class LootTableProvider { public net.minecraft.data.server.loottable.LootTableProvider wrapperContained; public LootTableProvider(net.minecraft.data.server.loottable.LootTableProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List lootTypeGenerators() { return wrapperContained.lootTypeGenerators; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public Object pathResolver() { return wrapperContained.pathResolver; }
// public java.util.Set lootTableIds() { return wrapperContained.lootTableIds; }
// public java.util.concurrent.CompletableFuture registryLookupFuture() { return wrapperContained.registryLookupFuture; }
// public java.util.concurrent.CompletableFuture run(yarnwrap.data.DataWriter writer,Object registryLookup) { return wrapperContained.run(writer.wrapperContained,registryLookup); }
// public yarnwrap.util.Identifier getId(yarnwrap.registry.RegistryKey lootTableKey) { return new yarnwrap.util.Identifier(wrapperContained.getId(lootTableKey.wrapperContained)); }

}