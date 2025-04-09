package yarnwrap.data.server.loottable.vanilla;
public class VanillaLootTableProviders { public net.minecraft.data.server.loottable.vanilla.VanillaLootTableProviders wrapperContained; public VanillaLootTableProviders(net.minecraft.data.server.loottable.vanilla.VanillaLootTableProviders wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.data.server.loottable.LootTableProvider createVanillaProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { return new yarnwrap.data.server.loottable.LootTableProvider(wrapperContained.createVanillaProvider(output.wrapperContained,registryLookupFuture)); }

}