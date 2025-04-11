package yarnwrap.data.server.tag.vanilla;
public class VanillaInstrumentTagProvider { public net.minecraft.data.server.tag.vanilla.VanillaInstrumentTagProvider wrapperContained; public VanillaInstrumentTagProvider(net.minecraft.data.server.tag.vanilla.VanillaInstrumentTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaInstrumentTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.vanilla.VanillaInstrumentTagProvider(output.wrapperContained,registryLookupFuture); }

}