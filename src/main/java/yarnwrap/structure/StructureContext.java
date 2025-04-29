package yarnwrap.structure;
public class StructureContext { public net.minecraft.structure.StructureContext wrapperContained; public StructureContext(net.minecraft.structure.StructureContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
// public void registryManager(yarnwrap.registry.DynamicRegistryManager value) { wrapperContained.registryManager = value.wrapperContained; }
// public static yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(net.minecraft.structure.StructureContext.registryManager); }
// public static void registryManager(yarnwrap.registry.DynamicRegistryManager value, ) { net.minecraft.structure.StructureContext.registryManager = value.wrapperContained; }

// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager()); }
// // public static yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(net.minecraft.structure.StructureContext.registryManager()); }
// public yarnwrap.structure.StructureContext from(yarnwrap.server.world.ServerWorld world) { return new yarnwrap.structure.StructureContext(wrapperContained.from(world.wrapperContained)); }
// public static yarnwrap.structure.StructureContext from(yarnwrap.server.world.ServerWorld world, ) { return new yarnwrap.structure.StructureContext(net.minecraft.structure.StructureContext.from(world.wrapperContained)); }

}