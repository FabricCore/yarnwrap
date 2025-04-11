package yarnwrap.data.server.tag.rebalance;
public class TradeRebalanceEnchantmentTagProvider { public net.minecraft.data.server.tag.rebalance.TradeRebalanceEnchantmentTagProvider wrapperContained; public TradeRebalanceEnchantmentTagProvider(net.minecraft.data.server.tag.rebalance.TradeRebalanceEnchantmentTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public TradeRebalanceEnchantmentTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.rebalance.TradeRebalanceEnchantmentTagProvider(output.wrapperContained,registryLookupFuture); }

}