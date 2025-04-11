package yarnwrap.data.server.tag.vanilla;
public class VanillaDamageTypeTagProvider { public net.minecraft.data.server.tag.vanilla.VanillaDamageTypeTagProvider wrapperContained; public VanillaDamageTypeTagProvider(net.minecraft.data.server.tag.vanilla.VanillaDamageTypeTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaDamageTypeTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture maxChainedNeighborUpdates) { this.wrapperContained = new net.minecraft.data.server.tag.vanilla.VanillaDamageTypeTagProvider(output.wrapperContained,maxChainedNeighborUpdates); }

}