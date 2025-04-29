package yarnwrap.world.level;
public class WorldGenSettings { public net.minecraft.world.level.WorldGenSettings wrapperContained; public WorldGenSettings(net.minecraft.world.level.WorldGenSettings wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.GeneratorOptions generatorOptions() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.generatorOptions); }
// public void generatorOptions(yarnwrap.world.gen.GeneratorOptions value) { wrapperContained.generatorOptions = value.wrapperContained; }
// public static yarnwrap.world.gen.GeneratorOptions generatorOptions() { return new yarnwrap.world.gen.GeneratorOptions(net.minecraft.world.level.WorldGenSettings.generatorOptions); }
// public static void generatorOptions(yarnwrap.world.gen.GeneratorOptions value, ) { net.minecraft.world.level.WorldGenSettings.generatorOptions = value.wrapperContained; }

// public yarnwrap.world.dimension.DimensionOptionsRegistryHolder dimensionOptionsRegistryHolder() { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(wrapperContained.dimensionOptionsRegistryHolder); }
// public void dimensionOptionsRegistryHolder(yarnwrap.world.dimension.DimensionOptionsRegistryHolder value) { wrapperContained.dimensionOptionsRegistryHolder = value.wrapperContained; }
// public static yarnwrap.world.dimension.DimensionOptionsRegistryHolder dimensionOptionsRegistryHolder() { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(net.minecraft.world.level.WorldGenSettings.dimensionOptionsRegistryHolder); }
// public static void dimensionOptionsRegistryHolder(yarnwrap.world.dimension.DimensionOptionsRegistryHolder value, ) { net.minecraft.world.level.WorldGenSettings.dimensionOptionsRegistryHolder = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.level.WorldGenSettings.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.level.WorldGenSettings.CODEC = value; }

// public yarnwrap.world.gen.GeneratorOptions generatorOptions() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.generatorOptions()); }
// // public static yarnwrap.world.gen.GeneratorOptions generatorOptions() { return new yarnwrap.world.gen.GeneratorOptions(net.minecraft.world.level.WorldGenSettings.generatorOptions()); }
// public yarnwrap.world.dimension.DimensionOptionsRegistryHolder dimensionOptionsRegistryHolder() { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(wrapperContained.dimensionOptionsRegistryHolder()); }
// // public static yarnwrap.world.dimension.DimensionOptionsRegistryHolder dimensionOptionsRegistryHolder() { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(net.minecraft.world.level.WorldGenSettings.dimensionOptionsRegistryHolder()); }
// public com.mojang.serialization.DataResult encode(com.mojang.serialization.DynamicOps registryOps,yarnwrap.world.gen.GeneratorOptions generatorOptions,yarnwrap.world.dimension.DimensionOptionsRegistryHolder dimensionOptionsRegistryHolder) { return wrapperContained.encode(registryOps,generatorOptions.wrapperContained,dimensionOptionsRegistryHolder.wrapperContained); }
// public static com.mojang.serialization.DataResult encode(com.mojang.serialization.DynamicOps registryOps,yarnwrap.world.gen.GeneratorOptions generatorOptions,yarnwrap.world.dimension.DimensionOptionsRegistryHolder dimensionOptionsRegistryHolder, ) { return net.minecraft.world.level.WorldGenSettings.encode(registryOps,generatorOptions.wrapperContained,dimensionOptionsRegistryHolder.wrapperContained); }
// public com.mojang.serialization.DataResult encode(com.mojang.serialization.DynamicOps registryOps,yarnwrap.world.gen.GeneratorOptions generatorOptions,yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager) { return wrapperContained.encode(registryOps,generatorOptions.wrapperContained,dynamicRegistryManager.wrapperContained); }
// public static com.mojang.serialization.DataResult encode(com.mojang.serialization.DynamicOps registryOps,yarnwrap.world.gen.GeneratorOptions generatorOptions,yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager, ) { return net.minecraft.world.level.WorldGenSettings.encode(registryOps,generatorOptions.wrapperContained,dynamicRegistryManager.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_45540(Object instance) { return wrapperContained.method_45540(instance); }
// public static com.mojang.datafixers.kinds.App method_45540(Object instance, ) { return net.minecraft.world.level.WorldGenSettings.method_45540(instance); }

}