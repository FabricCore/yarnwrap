package yarnwrap.data.tag.rebalance;
public class TradeRebalanceEnchantmentTagProvider { public net.minecraft.data.tag.rebalance.TradeRebalanceEnchantmentTagProvider wrapperContained; public TradeRebalanceEnchantmentTagProvider(net.minecraft.data.tag.rebalance.TradeRebalanceEnchantmentTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public TradeRebalanceEnchantmentTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture) { this.wrapperContained = new net.minecraft.data.tag.rebalance.TradeRebalanceEnchantmentTagProvider(output.wrapperContained,registriesFuture); }

}