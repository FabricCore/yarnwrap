package yarnwrap.data.server.tag.vanilla;
public class VanillaPointOfInterestTypeTagProvider { public net.minecraft.data.server.tag.vanilla.VanillaPointOfInterestTypeTagProvider wrapperContained; public VanillaPointOfInterestTypeTagProvider(net.minecraft.data.server.tag.vanilla.VanillaPointOfInterestTypeTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaPointOfInterestTypeTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.vanilla.VanillaPointOfInterestTypeTagProvider(output.wrapperContained,registryLookupFuture); }

}