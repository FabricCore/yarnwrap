package yarnwrap.data.tag.vanilla;
public class VanillaBiomeTagProvider { public net.minecraft.data.tag.vanilla.VanillaBiomeTagProvider wrapperContained; public VanillaBiomeTagProvider(net.minecraft.data.tag.vanilla.VanillaBiomeTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaBiomeTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture) { this.wrapperContained = new net.minecraft.data.tag.vanilla.VanillaBiomeTagProvider(output.wrapperContained,registriesFuture); }

}