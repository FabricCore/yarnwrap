package yarnwrap.data.server.tag.vanilla;
public class VanillaStructureTagProvider { public net.minecraft.data.server.tag.vanilla.VanillaStructureTagProvider wrapperContained; public VanillaStructureTagProvider(net.minecraft.data.server.tag.vanilla.VanillaStructureTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaStructureTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.vanilla.VanillaStructureTagProvider(output.wrapperContained,registryLookupFuture); }

}