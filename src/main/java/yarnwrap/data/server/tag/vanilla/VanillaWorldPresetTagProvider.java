package yarnwrap.data.server.tag.vanilla;
public class VanillaWorldPresetTagProvider { public net.minecraft.data.server.tag.vanilla.VanillaWorldPresetTagProvider wrapperContained; public VanillaWorldPresetTagProvider(net.minecraft.data.server.tag.vanilla.VanillaWorldPresetTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaWorldPresetTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.vanilla.VanillaWorldPresetTagProvider(output.wrapperContained,registryLookupFuture); }

}