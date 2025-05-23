package yarnwrap.data.tag.vanilla;
public class VanillaPaintingVariantTagProvider { public net.minecraft.data.tag.vanilla.VanillaPaintingVariantTagProvider wrapperContained; public VanillaPaintingVariantTagProvider(net.minecraft.data.tag.vanilla.VanillaPaintingVariantTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaPaintingVariantTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture) { this.wrapperContained = new net.minecraft.data.tag.vanilla.VanillaPaintingVariantTagProvider(output.wrapperContained,registriesFuture); }

}