package yarnwrap.data.tag.vanilla;
public class VanillaPointOfInterestTypeTagProvider { public net.minecraft.data.tag.vanilla.VanillaPointOfInterestTypeTagProvider wrapperContained; public VanillaPointOfInterestTypeTagProvider(net.minecraft.data.tag.vanilla.VanillaPointOfInterestTypeTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaPointOfInterestTypeTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture) { this.wrapperContained = new net.minecraft.data.tag.vanilla.VanillaPointOfInterestTypeTagProvider(output.wrapperContained,registriesFuture); }

}