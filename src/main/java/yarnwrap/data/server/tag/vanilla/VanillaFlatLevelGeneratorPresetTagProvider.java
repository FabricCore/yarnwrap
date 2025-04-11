package yarnwrap.data.server.tag.vanilla;
public class VanillaFlatLevelGeneratorPresetTagProvider { public net.minecraft.data.server.tag.vanilla.VanillaFlatLevelGeneratorPresetTagProvider wrapperContained; public VanillaFlatLevelGeneratorPresetTagProvider(net.minecraft.data.server.tag.vanilla.VanillaFlatLevelGeneratorPresetTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaFlatLevelGeneratorPresetTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.vanilla.VanillaFlatLevelGeneratorPresetTagProvider(output.wrapperContained,registryLookupFuture); }

}