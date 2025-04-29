package yarnwrap.data.server.advancement.vanilla;
public class VanillaAdvancementProviders { public net.minecraft.data.server.advancement.vanilla.VanillaAdvancementProviders wrapperContained; public VanillaAdvancementProviders(net.minecraft.data.server.advancement.vanilla.VanillaAdvancementProviders wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.server.advancement.AdvancementProvider createVanillaProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { return new yarnwrap.data.server.advancement.AdvancementProvider(wrapperContained.createVanillaProvider(output.wrapperContained,registryLookupFuture)); }
// public static yarnwrap.data.server.advancement.AdvancementProvider createVanillaProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture, ) { return new yarnwrap.data.server.advancement.AdvancementProvider(net.minecraft.data.server.advancement.vanilla.VanillaAdvancementProviders.createVanillaProvider(output.wrapperContained,registryLookupFuture)); }

}