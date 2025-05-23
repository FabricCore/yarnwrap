package yarnwrap.data.loottable.vanilla;
public class VanillaLootTableProviders { public net.minecraft.data.loottable.vanilla.VanillaLootTableProviders wrapperContained; public VanillaLootTableProviders(net.minecraft.data.loottable.vanilla.VanillaLootTableProviders wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.loottable.LootTableProvider createVanillaProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture) { return new yarnwrap.data.loottable.LootTableProvider(wrapperContained.createVanillaProvider(output.wrapperContained,registriesFuture)); }
// public static yarnwrap.data.loottable.LootTableProvider createVanillaProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture, ) { return new yarnwrap.data.loottable.LootTableProvider(net.minecraft.data.loottable.vanilla.VanillaLootTableProviders.createVanillaProvider(output.wrapperContained,registriesFuture)); }

}