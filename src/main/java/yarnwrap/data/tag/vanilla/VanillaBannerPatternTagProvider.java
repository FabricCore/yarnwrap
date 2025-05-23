package yarnwrap.data.tag.vanilla;
public class VanillaBannerPatternTagProvider { public net.minecraft.data.tag.vanilla.VanillaBannerPatternTagProvider wrapperContained; public VanillaBannerPatternTagProvider(net.minecraft.data.tag.vanilla.VanillaBannerPatternTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaBannerPatternTagProvider(yarnwrap.data.DataOutput dataGenerator,java.util.concurrent.CompletableFuture registriesFuture) { this.wrapperContained = new net.minecraft.data.tag.vanilla.VanillaBannerPatternTagProvider(dataGenerator.wrapperContained,registriesFuture); }

}