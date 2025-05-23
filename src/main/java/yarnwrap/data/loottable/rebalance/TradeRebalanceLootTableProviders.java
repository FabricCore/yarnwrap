package yarnwrap.data.loottable.rebalance;
public class TradeRebalanceLootTableProviders { public net.minecraft.data.loottable.rebalance.TradeRebalanceLootTableProviders wrapperContained; public TradeRebalanceLootTableProviders(net.minecraft.data.loottable.rebalance.TradeRebalanceLootTableProviders wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.loottable.LootTableProvider createTradeRebalanceProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture) { return new yarnwrap.data.loottable.LootTableProvider(wrapperContained.createTradeRebalanceProvider(output.wrapperContained,registriesFuture)); }
// public static yarnwrap.data.loottable.LootTableProvider createTradeRebalanceProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture, ) { return new yarnwrap.data.loottable.LootTableProvider(net.minecraft.data.loottable.rebalance.TradeRebalanceLootTableProviders.createTradeRebalanceProvider(output.wrapperContained,registriesFuture)); }

}