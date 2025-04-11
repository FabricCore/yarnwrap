package yarnwrap.data.server.tag.vanilla;
public class VanillaBlockTagProvider { public net.minecraft.data.server.tag.vanilla.VanillaBlockTagProvider wrapperContained; public VanillaBlockTagProvider(net.minecraft.data.server.tag.vanilla.VanillaBlockTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaBlockTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.vanilla.VanillaBlockTagProvider(output.wrapperContained,registryLookupFuture); }
// public yarnwrap.registry.RegistryKey method_46837(yarnwrap.block.Block block) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_46837(block.wrapperContained)); }
// public boolean method_51274(yarnwrap.block.Block block) { return wrapperContained.method_51274(block.wrapperContained); }

}