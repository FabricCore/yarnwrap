package yarnwrap.data.tag.vanilla;
public class VanillaEntityTypeTagProvider { public net.minecraft.data.tag.vanilla.VanillaEntityTypeTagProvider wrapperContained; public VanillaEntityTypeTagProvider(net.minecraft.data.tag.vanilla.VanillaEntityTypeTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public VanillaEntityTypeTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture) { this.wrapperContained = new net.minecraft.data.tag.vanilla.VanillaEntityTypeTagProvider(output.wrapperContained,registriesFuture); }
// public yarnwrap.registry.RegistryKey method_46824(yarnwrap.entity.EntityType entityType) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_46824(entityType.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey method_46824(yarnwrap.entity.EntityType entityType, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.data.tag.vanilla.VanillaEntityTypeTagProvider.method_46824(entityType.wrapperContained)); }

}