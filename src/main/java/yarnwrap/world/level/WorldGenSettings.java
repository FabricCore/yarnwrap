package yarnwrap.world.level;
public class WorldGenSettings { public net.minecraft.world.level.WorldGenSettings wrapperContained; public WorldGenSettings(net.minecraft.world.level.WorldGenSettings wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.GeneratorOptions generatorOptions() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.generatorOptions); }
// public void generatorOptions(yarnwrap.world.gen.GeneratorOptions value) { wrapperContained.generatorOptions = value.wrapperContained; }
// public yarnwrap.world.dimension.DimensionOptionsRegistryHolder dimensionOptionsRegistryHolder() { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(wrapperContained.dimensionOptionsRegistryHolder); }
// public void dimensionOptionsRegistryHolder(yarnwrap.world.dimension.DimensionOptionsRegistryHolder value) { wrapperContained.dimensionOptionsRegistryHolder = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public yarnwrap.world.gen.GeneratorOptions generatorOptions() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.generatorOptions()); }
// public yarnwrap.world.dimension.DimensionOptionsRegistryHolder dimensionOptionsRegistryHolder() { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(wrapperContained.dimensionOptionsRegistryHolder()); }
public com.mojang.serialization.DataResult encode(com.mojang.serialization.DynamicOps registryOps,yarnwrap.world.gen.GeneratorOptions generatorOptions,yarnwrap.world.dimension.DimensionOptionsRegistryHolder dimensionOptionsRegistryHolder) { return wrapperContained.encode(registryOps,generatorOptions.wrapperContained,dimensionOptionsRegistryHolder.wrapperContained); }
public com.mojang.serialization.DataResult encode(com.mojang.serialization.DynamicOps registryOps,yarnwrap.world.gen.GeneratorOptions generatorOptions,yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager) { return wrapperContained.encode(registryOps,generatorOptions.wrapperContained,dynamicRegistryManager.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_45540(Object instance) { return wrapperContained.method_45540(instance); }

}