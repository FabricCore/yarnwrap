package yarnwrap.data.advancement.vanilla;
public class VanillaAdvancementProviders { public net.minecraft.data.advancement.vanilla.VanillaAdvancementProviders wrapperContained; public VanillaAdvancementProviders(net.minecraft.data.advancement.vanilla.VanillaAdvancementProviders wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.advancement.AdvancementProvider createVanillaProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture) { return new yarnwrap.data.advancement.AdvancementProvider(wrapperContained.createVanillaProvider(output.wrapperContained,registriesFuture)); }
// public static yarnwrap.data.advancement.AdvancementProvider createVanillaProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture, ) { return new yarnwrap.data.advancement.AdvancementProvider(net.minecraft.data.advancement.vanilla.VanillaAdvancementProviders.createVanillaProvider(output.wrapperContained,registriesFuture)); }

}