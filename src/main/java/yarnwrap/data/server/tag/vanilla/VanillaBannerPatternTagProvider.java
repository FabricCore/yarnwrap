package yarnwrap.data.server.tag.vanilla;
public class VanillaBannerPatternTagProvider { public net.minecraft.data.server.tag.vanilla.VanillaBannerPatternTagProvider wrapperContained; public VanillaBannerPatternTagProvider(net.minecraft.data.server.tag.vanilla.VanillaBannerPatternTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaBannerPatternTagProvider(yarnwrap.data.DataOutput dataGenerator,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.vanilla.VanillaBannerPatternTagProvider(dataGenerator.wrapperContained,registryLookupFuture); }

}