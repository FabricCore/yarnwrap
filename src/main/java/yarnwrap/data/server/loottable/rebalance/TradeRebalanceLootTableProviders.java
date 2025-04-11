package yarnwrap.data.server.loottable.rebalance;
public class TradeRebalanceLootTableProviders { public net.minecraft.data.server.loottable.rebalance.TradeRebalanceLootTableProviders wrapperContained; public TradeRebalanceLootTableProviders(net.minecraft.data.server.loottable.rebalance.TradeRebalanceLootTableProviders wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.data.server.loottable.LootTableProvider createTradeRebalanceProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { return new yarnwrap.data.server.loottable.LootTableProvider(wrapperContained.createTradeRebalanceProvider(output.wrapperContained,registryLookupFuture)); }

}