package yarnwrap.data.server.tag.vanilla;
public class VanillaPaintingVariantTagProvider { public net.minecraft.data.server.tag.vanilla.VanillaPaintingVariantTagProvider wrapperContained; public VanillaPaintingVariantTagProvider(net.minecraft.data.server.tag.vanilla.VanillaPaintingVariantTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaPaintingVariantTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.vanilla.VanillaPaintingVariantTagProvider(output.wrapperContained,registryLookupFuture); }

}