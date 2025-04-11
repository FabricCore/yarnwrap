package yarnwrap.data.server.tag.vanilla;
public class VanillaCatVariantTagProvider { public net.minecraft.data.server.tag.vanilla.VanillaCatVariantTagProvider wrapperContained; public VanillaCatVariantTagProvider(net.minecraft.data.server.tag.vanilla.VanillaCatVariantTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaCatVariantTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.vanilla.VanillaCatVariantTagProvider(output.wrapperContained,registryLookupFuture); }

}