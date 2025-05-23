package yarnwrap.data.tag.vanilla;
public class VanillaFlatLevelGeneratorPresetTagProvider { public net.minecraft.data.tag.vanilla.VanillaFlatLevelGeneratorPresetTagProvider wrapperContained; public VanillaFlatLevelGeneratorPresetTagProvider(net.minecraft.data.tag.vanilla.VanillaFlatLevelGeneratorPresetTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaFlatLevelGeneratorPresetTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture) { this.wrapperContained = new net.minecraft.data.tag.vanilla.VanillaFlatLevelGeneratorPresetTagProvider(output.wrapperContained,registriesFuture); }

}