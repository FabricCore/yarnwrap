package yarnwrap.client.world;
public class GeneratorOptionsHolder { public net.minecraft.client.world.GeneratorOptionsHolder wrapperContained; public GeneratorOptionsHolder(net.minecraft.client.world.GeneratorOptionsHolder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.GeneratorOptions generatorOptions() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.generatorOptions); }
// public void generatorOptions(yarnwrap.world.gen.GeneratorOptions value) { wrapperContained.generatorOptions = value.wrapperContained; }
// public static yarnwrap.world.gen.GeneratorOptions generatorOptions() { return new yarnwrap.world.gen.GeneratorOptions(net.minecraft.client.world.GeneratorOptionsHolder.generatorOptions); }
// public static void generatorOptions(yarnwrap.world.gen.GeneratorOptions value, ) { net.minecraft.client.world.GeneratorOptionsHolder.generatorOptions = value.wrapperContained; }

// public yarnwrap.server.DataPackContents dataPackContents() { return new yarnwrap.server.DataPackContents(wrapperContained.dataPackContents); }
// public void dataPackContents(yarnwrap.server.DataPackContents value) { wrapperContained.dataPackContents = value.wrapperContained; }
// public static yarnwrap.server.DataPackContents dataPackContents() { return new yarnwrap.server.DataPackContents(net.minecraft.client.world.GeneratorOptionsHolder.dataPackContents); }
// public static void dataPackContents(yarnwrap.server.DataPackContents value, ) { net.minecraft.client.world.GeneratorOptionsHolder.dataPackContents = value.wrapperContained; }

// public yarnwrap.registry.Registry dimensionOptionsRegistry() { return new yarnwrap.registry.Registry(wrapperContained.dimensionOptionsRegistry); }
// public void dimensionOptionsRegistry(yarnwrap.registry.Registry value) { wrapperContained.dimensionOptionsRegistry = value.wrapperContained; }
// public static yarnwrap.registry.Registry dimensionOptionsRegistry() { return new yarnwrap.registry.Registry(net.minecraft.client.world.GeneratorOptionsHolder.dimensionOptionsRegistry); }
// public static void dimensionOptionsRegistry(yarnwrap.registry.Registry value, ) { net.minecraft.client.world.GeneratorOptionsHolder.dimensionOptionsRegistry = value.wrapperContained; }

// public yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.combinedDynamicRegistries); }
// public void combinedDynamicRegistries(yarnwrap.registry.CombinedDynamicRegistries value) { wrapperContained.combinedDynamicRegistries = value.wrapperContained; }
// public static yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(net.minecraft.client.world.GeneratorOptionsHolder.combinedDynamicRegistries); }
// public static void combinedDynamicRegistries(yarnwrap.registry.CombinedDynamicRegistries value, ) { net.minecraft.client.world.GeneratorOptionsHolder.combinedDynamicRegistries = value.wrapperContained; }

// public GeneratorOptionsHolder(yarnwrap.world.gen.GeneratorOptions generatorOptions,yarnwrap.world.dimension.DimensionOptionsRegistryHolder selectedDimensions,yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries,yarnwrap.server.DataPackContents dataPackContents,yarnwrap.resource.DataConfiguration dataConfiguration) { this.wrapperContained = new net.minecraft.client.world.GeneratorOptionsHolder(generatorOptions.wrapperContained,selectedDimensions.wrapperContained,combinedDynamicRegistries.wrapperContained,dataPackContents.wrapperContained,dataConfiguration.wrapperContained); }
public GeneratorOptionsHolder(yarnwrap.world.level.WorldGenSettings worldGenSettings,yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries,yarnwrap.server.DataPackContents dataPackContents,yarnwrap.resource.DataConfiguration dataConfiguration) { this.wrapperContained = new net.minecraft.client.world.GeneratorOptionsHolder(worldGenSettings.wrapperContained,combinedDynamicRegistries.wrapperContained,dataPackContents.wrapperContained,dataConfiguration.wrapperContained); }
// public yarnwrap.world.gen.GeneratorOptions generatorOptions() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.generatorOptions()); }
// // public static yarnwrap.world.gen.GeneratorOptions generatorOptions() { return new yarnwrap.world.gen.GeneratorOptions(net.minecraft.client.world.GeneratorOptionsHolder.generatorOptions()); }
// public yarnwrap.server.DataPackContents dataPackContents() { return new yarnwrap.server.DataPackContents(wrapperContained.dataPackContents()); }
// // public static yarnwrap.server.DataPackContents dataPackContents() { return new yarnwrap.server.DataPackContents(net.minecraft.client.world.GeneratorOptionsHolder.dataPackContents()); }
// public yarnwrap.registry.Registry dimensionOptionsRegistry() { return new yarnwrap.registry.Registry(wrapperContained.dimensionOptionsRegistry()); }
// // public static yarnwrap.registry.Registry dimensionOptionsRegistry() { return new yarnwrap.registry.Registry(net.minecraft.client.world.GeneratorOptionsHolder.dimensionOptionsRegistry()); }
// public yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.combinedDynamicRegistries()); }
// // public static yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(net.minecraft.client.world.GeneratorOptionsHolder.combinedDynamicRegistries()); }
public yarnwrap.client.world.GeneratorOptionsHolder with(yarnwrap.world.gen.GeneratorOptions generatorOptions,yarnwrap.world.dimension.DimensionOptionsRegistryHolder selectedDimensions) { return new yarnwrap.client.world.GeneratorOptionsHolder(wrapperContained.with(generatorOptions.wrapperContained,selectedDimensions.wrapperContained)); }
// public static yarnwrap.client.world.GeneratorOptionsHolder with(yarnwrap.world.gen.GeneratorOptions generatorOptions,yarnwrap.world.dimension.DimensionOptionsRegistryHolder selectedDimensions, ) { return new yarnwrap.client.world.GeneratorOptionsHolder(net.minecraft.client.world.GeneratorOptionsHolder.with(generatorOptions.wrapperContained,selectedDimensions.wrapperContained)); }
// public yarnwrap.client.world.GeneratorOptionsHolder apply(Object modifier) { return new yarnwrap.client.world.GeneratorOptionsHolder(wrapperContained.apply(modifier)); }
// public static yarnwrap.client.world.GeneratorOptionsHolder apply(Object modifier, ) { return new yarnwrap.client.world.GeneratorOptionsHolder(net.minecraft.client.world.GeneratorOptionsHolder.apply(modifier)); }
public Object getCombinedRegistryManager() { return wrapperContained.getCombinedRegistryManager(); }
// public static Object getCombinedRegistryManager() { return net.minecraft.client.world.GeneratorOptionsHolder.getCombinedRegistryManager(); }
// // public yarnwrap.client.world.GeneratorOptionsHolder apply(Object modifier) { return new yarnwrap.client.world.GeneratorOptionsHolder(wrapperContained.apply(modifier)); }
// // public static yarnwrap.client.world.GeneratorOptionsHolder apply(Object modifier, ) { return new yarnwrap.client.world.GeneratorOptionsHolder(net.minecraft.client.world.GeneratorOptionsHolder.apply(modifier)); }
public void initializeIndexedFeaturesLists() { wrapperContained.initializeIndexedFeaturesLists(); }
// public static void initializeIndexedFeaturesLists() { net.minecraft.client.world.GeneratorOptionsHolder.initializeIndexedFeaturesLists(); }

}