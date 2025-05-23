package yarnwrap.data.tag.vanilla;
public class VanillaDamageTypeTagProvider { public net.minecraft.data.tag.vanilla.VanillaDamageTypeTagProvider wrapperContained; public VanillaDamageTypeTagProvider(net.minecraft.data.tag.vanilla.VanillaDamageTypeTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaDamageTypeTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture) { this.wrapperContained = new net.minecraft.data.tag.vanilla.VanillaDamageTypeTagProvider(output.wrapperContained,registriesFuture); }

}