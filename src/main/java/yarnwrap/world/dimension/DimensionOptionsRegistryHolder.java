package yarnwrap.world.dimension;
public class DimensionOptionsRegistryHolder { public net.minecraft.world.dimension.DimensionOptionsRegistryHolder wrapperContained; public DimensionOptionsRegistryHolder(net.minecraft.world.dimension.DimensionOptionsRegistryHolder wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.dimension.DimensionOptionsRegistryHolder.CODEC = value; }

// public java.util.Set VANILLA_KEYS() { return wrapperContained.VANILLA_KEYS; }
// public void VANILLA_KEYS(java.util.Set value) { wrapperContained.VANILLA_KEYS = value; }
// public static java.util.Set VANILLA_KEYS() { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.VANILLA_KEYS; }
// public static void VANILLA_KEYS(java.util.Set value, ) { net.minecraft.world.dimension.DimensionOptionsRegistryHolder.VANILLA_KEYS = value; }

// public int VANILLA_KEY_COUNT() { return wrapperContained.VANILLA_KEY_COUNT; }
// public void VANILLA_KEY_COUNT(int value) { wrapperContained.VANILLA_KEY_COUNT = value; }
// public static int VANILLA_KEY_COUNT() { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.VANILLA_KEY_COUNT; }
// public static void VANILLA_KEY_COUNT(int value, ) { net.minecraft.world.dimension.DimensionOptionsRegistryHolder.VANILLA_KEY_COUNT = value; }

public DimensionOptionsRegistryHolder(yarnwrap.registry.Registry dimensionOptionsRegistry) { this.wrapperContained = new net.minecraft.world.dimension.DimensionOptionsRegistryHolder(dimensionOptionsRegistry.wrapperContained); }
public yarnwrap.world.gen.chunk.ChunkGenerator getChunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.getChunkGenerator()); }
// public static yarnwrap.world.gen.chunk.ChunkGenerator getChunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(net.minecraft.world.dimension.DimensionOptionsRegistryHolder.getChunkGenerator()); }
public java.util.Optional getOrEmpty(yarnwrap.registry.RegistryKey key) { return wrapperContained.getOrEmpty(key.wrapperContained); }
// public static java.util.Optional getOrEmpty(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.getOrEmpty(key.wrapperContained); }
// public com.mojang.serialization.Lifecycle getLifecycle(yarnwrap.registry.RegistryKey key,yarnwrap.world.dimension.DimensionOptions dimensionOptions) { return wrapperContained.getLifecycle(key.wrapperContained,dimensionOptions.wrapperContained); }
// public static com.mojang.serialization.Lifecycle getLifecycle(yarnwrap.registry.RegistryKey key,yarnwrap.world.dimension.DimensionOptions dimensionOptions, ) { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.getLifecycle(key.wrapperContained,dimensionOptions.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_45516(Object instance) { return wrapperContained.method_45516(instance); }
// public static com.mojang.datafixers.kinds.App method_45516(Object instance, ) { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.method_45516(instance); }
// public boolean isOverworldVanilla(yarnwrap.world.dimension.DimensionOptions dimensionOptions) { return wrapperContained.isOverworldVanilla(dimensionOptions.wrapperContained); }
// public static boolean isOverworldVanilla(yarnwrap.world.dimension.DimensionOptions dimensionOptions, ) { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.isOverworldVanilla(dimensionOptions.wrapperContained); }
public Object toConfig(yarnwrap.registry.Registry existingRegistry) { return wrapperContained.toConfig(existingRegistry.wrapperContained); }
// public static Object toConfig(yarnwrap.registry.Registry existingRegistry, ) { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.toConfig(existingRegistry.wrapperContained); }
// public java.util.Map createRegistry(java.util.Map dimensionOptions,yarnwrap.registry.entry.RegistryEntry overworld,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator) { return wrapperContained.createRegistry(dimensionOptions,overworld.wrapperContained,chunkGenerator.wrapperContained); }
// public static java.util.Map createRegistry(java.util.Map dimensionOptions,yarnwrap.registry.entry.RegistryEntry overworld,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator, ) { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.createRegistry(dimensionOptions,overworld.wrapperContained,chunkGenerator.wrapperContained); }
// public java.util.Map createRegistry(yarnwrap.registry.Registry dynamicRegistry,java.util.Map dimensionOptions,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator) { return wrapperContained.createRegistry(dynamicRegistry.wrapperContained,dimensionOptions,chunkGenerator.wrapperContained); }
// public static java.util.Map createRegistry(yarnwrap.registry.Registry dynamicRegistry,java.util.Map dimensionOptions,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator, ) { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.createRegistry(dynamicRegistry.wrapperContained,dimensionOptions,chunkGenerator.wrapperContained); }
// public void method_45521(yarnwrap.registry.Registry key) { wrapperContained.method_45521(key.wrapperContained); }
// public static void method_45521(yarnwrap.registry.Registry key, ) { net.minecraft.world.dimension.DimensionOptionsRegistryHolder.method_45521(key.wrapperContained); }
public yarnwrap.world.dimension.DimensionOptionsRegistryHolder with(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator) { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(wrapperContained.with(dynamicRegistryManager.wrapperContained,chunkGenerator.wrapperContained)); }
// public static yarnwrap.world.dimension.DimensionOptionsRegistryHolder with(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator, ) { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(net.minecraft.world.dimension.DimensionOptionsRegistryHolder.with(dynamicRegistryManager.wrapperContained,chunkGenerator.wrapperContained)); }
// public void method_45523(yarnwrap.registry.MutableRegistry entry) { wrapperContained.method_45523(entry.wrapperContained); }
// public static void method_45523(yarnwrap.registry.MutableRegistry entry, ) { net.minecraft.world.dimension.DimensionOptionsRegistryHolder.method_45523(entry.wrapperContained); }
// public void method_45524(java.util.List dimensionOptions) { wrapperContained.method_45524(dimensionOptions); }
// public static void method_45524(java.util.List dimensionOptions, ) { net.minecraft.world.dimension.DimensionOptionsRegistryHolder.method_45524(dimensionOptions); }
// public java.util.stream.Stream streamAll(java.util.stream.Stream otherKeys) { return wrapperContained.streamAll(otherKeys); }
// public static java.util.stream.Stream streamAll(java.util.stream.Stream otherKeys, ) { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.streamAll(otherKeys); }
public com.google.common.collect.ImmutableSet getWorldKeys() { return wrapperContained.getWorldKeys(); }
// public static com.google.common.collect.ImmutableSet getWorldKeys() { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.getWorldKeys(); }
// public boolean isVanilla(yarnwrap.registry.RegistryKey key,yarnwrap.world.dimension.DimensionOptions dimensionOptions) { return wrapperContained.isVanilla(key.wrapperContained,dimensionOptions.wrapperContained); }
// public static boolean isVanilla(yarnwrap.registry.RegistryKey key,yarnwrap.world.dimension.DimensionOptions dimensionOptions, ) { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.isVanilla(key.wrapperContained,dimensionOptions.wrapperContained); }
// public boolean isNetherVanilla(yarnwrap.world.dimension.DimensionOptions dimensionOptions) { return wrapperContained.isNetherVanilla(dimensionOptions.wrapperContained); }
// public static boolean isNetherVanilla(yarnwrap.world.dimension.DimensionOptions dimensionOptions, ) { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.isNetherVanilla(dimensionOptions.wrapperContained); }
// public Object getSpecialProperty(yarnwrap.registry.Registry dimensionOptionsRegistry) { return wrapperContained.getSpecialProperty(dimensionOptionsRegistry.wrapperContained); }
// public static Object getSpecialProperty(yarnwrap.registry.Registry dimensionOptionsRegistry, ) { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.getSpecialProperty(dimensionOptionsRegistry.wrapperContained); }
public boolean isDebug() { return wrapperContained.isDebug(); }
// public static boolean isDebug() { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.isDebug(); }
// public boolean method_45532(yarnwrap.registry.RegistryKey key) { return wrapperContained.method_45532(key.wrapperContained); }
// public static boolean method_45532(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.method_45532(key.wrapperContained); }
// public boolean isTheEndVanilla(yarnwrap.world.dimension.DimensionOptions dimensionOptions) { return wrapperContained.isTheEndVanilla(dimensionOptions.wrapperContained); }
// public static boolean isTheEndVanilla(yarnwrap.world.dimension.DimensionOptions dimensionOptions, ) { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.isTheEndVanilla(dimensionOptions.wrapperContained); }
// public Object method_45534(yarnwrap.world.dimension.DimensionOptions overworldEntry) { return wrapperContained.method_45534(overworldEntry.wrapperContained); }
// public static Object method_45534(yarnwrap.world.dimension.DimensionOptions overworldEntry, ) { return net.minecraft.world.dimension.DimensionOptionsRegistryHolder.method_45534(overworldEntry.wrapperContained); }

}