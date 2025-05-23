package yarnwrap.data.tag.vanilla;
public class VanillaStructureTagProvider { public net.minecraft.data.tag.vanilla.VanillaStructureTagProvider wrapperContained; public VanillaStructureTagProvider(net.minecraft.data.tag.vanilla.VanillaStructureTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaStructureTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture) { this.wrapperContained = new net.minecraft.data.tag.vanilla.VanillaStructureTagProvider(output.wrapperContained,registriesFuture); }

}