package yarnwrap.client.world;
public class GeneratorOptionsHolder { public net.minecraft.client.world.GeneratorOptionsHolder wrapperContained; public GeneratorOptionsHolder(net.minecraft.client.world.GeneratorOptionsHolder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.Registry dimensionOptionsRegistry() { return new yarnwrap.registry.Registry(wrapperContained.dimensionOptionsRegistry); }
// public yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.combinedDynamicRegistries); }
// public yarnwrap.world.gen.GeneratorOptions generatorOptions() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.generatorOptions); }
// public yarnwrap.server.DataPackContents dataPackContents() { return new yarnwrap.server.DataPackContents(wrapperContained.dataPackContents); }
// public yarnwrap.registry.Registry dimensionOptionsRegistry() { return new yarnwrap.registry.Registry(wrapperContained.dimensionOptionsRegistry()); }
// public yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.combinedDynamicRegistries()); }
// public yarnwrap.world.gen.GeneratorOptions generatorOptions() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.generatorOptions()); }
// public yarnwrap.server.DataPackContents dataPackContents() { return new yarnwrap.server.DataPackContents(wrapperContained.dataPackContents()); }
public yarnwrap.client.world.GeneratorOptionsHolder with(yarnwrap.world.gen.GeneratorOptions generatorOptions,yarnwrap.world.dimension.DimensionOptionsRegistryHolder selectedDimensions) { return new yarnwrap.client.world.GeneratorOptionsHolder(wrapperContained.with(generatorOptions.wrapperContained,selectedDimensions.wrapperContained)); }
// public yarnwrap.client.world.GeneratorOptionsHolder apply(Object modifier) { return new yarnwrap.client.world.GeneratorOptionsHolder(wrapperContained.apply(modifier)); }
public Object getCombinedRegistryManager() { return wrapperContained.getCombinedRegistryManager(); }
// // public yarnwrap.client.world.GeneratorOptionsHolder apply(Object modifier) { return new yarnwrap.client.world.GeneratorOptionsHolder(wrapperContained.apply(modifier)); }
public void initializeIndexedFeaturesLists() { wrapperContained.initializeIndexedFeaturesLists(); }

}