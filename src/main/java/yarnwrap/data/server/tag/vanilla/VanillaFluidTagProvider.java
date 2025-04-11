package yarnwrap.data.server.tag.vanilla;
public class VanillaFluidTagProvider { public net.minecraft.data.server.tag.vanilla.VanillaFluidTagProvider wrapperContained; public VanillaFluidTagProvider(net.minecraft.data.server.tag.vanilla.VanillaFluidTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaFluidTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.vanilla.VanillaFluidTagProvider(output.wrapperContained,registryLookupFuture); }
// public yarnwrap.registry.RegistryKey method_46825(yarnwrap.fluid.Fluid fluid) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_46825(fluid.wrapperContained)); }

}