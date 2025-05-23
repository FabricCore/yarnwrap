package yarnwrap.data.tag.vanilla;
public class VanillaInstrumentTagProvider { public net.minecraft.data.tag.vanilla.VanillaInstrumentTagProvider wrapperContained; public VanillaInstrumentTagProvider(net.minecraft.data.tag.vanilla.VanillaInstrumentTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaInstrumentTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture) { this.wrapperContained = new net.minecraft.data.tag.vanilla.VanillaInstrumentTagProvider(output.wrapperContained,registriesFuture); }

}