package yarnwrap.data.server.tag.vanilla;
public class VanillaEntityTypeTagProvider { public net.minecraft.data.server.tag.vanilla.VanillaEntityTypeTagProvider wrapperContained; public VanillaEntityTypeTagProvider(net.minecraft.data.server.tag.vanilla.VanillaEntityTypeTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaEntityTypeTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.vanilla.VanillaEntityTypeTagProvider(output.wrapperContained,registryLookupFuture); }
// public yarnwrap.registry.RegistryKey method_46824(yarnwrap.entity.EntityType entityType) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_46824(entityType.wrapperContained)); }

}