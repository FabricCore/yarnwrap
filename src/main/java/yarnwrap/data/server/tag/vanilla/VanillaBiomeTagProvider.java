package yarnwrap.data.server.tag.vanilla;
public class VanillaBiomeTagProvider { public net.minecraft.data.server.tag.vanilla.VanillaBiomeTagProvider wrapperContained; public VanillaBiomeTagProvider(net.minecraft.data.server.tag.vanilla.VanillaBiomeTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaBiomeTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.vanilla.VanillaBiomeTagProvider(output.wrapperContained,registryLookupFuture); }

}