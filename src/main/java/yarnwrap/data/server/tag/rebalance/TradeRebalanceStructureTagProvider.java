package yarnwrap.data.server.tag.rebalance;
public class TradeRebalanceStructureTagProvider { public net.minecraft.data.server.tag.rebalance.TradeRebalanceStructureTagProvider wrapperContained; public TradeRebalanceStructureTagProvider(net.minecraft.data.server.tag.rebalance.TradeRebalanceStructureTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public TradeRebalanceStructureTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.rebalance.TradeRebalanceStructureTagProvider(output.wrapperContained,registryLookupFuture); }

}