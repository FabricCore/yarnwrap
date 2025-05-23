package yarnwrap.data.tag.vanilla;
public class VanillaWorldPresetTagProvider { public net.minecraft.data.tag.vanilla.VanillaWorldPresetTagProvider wrapperContained; public VanillaWorldPresetTagProvider(net.minecraft.data.tag.vanilla.VanillaWorldPresetTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaWorldPresetTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture) { this.wrapperContained = new net.minecraft.data.tag.vanilla.VanillaWorldPresetTagProvider(output.wrapperContained,registriesFuture); }

}