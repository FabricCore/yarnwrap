package yarnwrap.world.dimension;
public class DimensionOptionsRegistryHolder { public net.minecraft.world.dimension.DimensionOptionsRegistryHolder wrapperContained; public DimensionOptionsRegistryHolder(net.minecraft.world.dimension.DimensionOptionsRegistryHolder wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public java.util.Set VANILLA_KEYS() { return wrapperContained.VANILLA_KEYS; }
// public int VANILLA_KEY_COUNT() { return wrapperContained.VANILLA_KEY_COUNT; }
public yarnwrap.world.gen.chunk.ChunkGenerator getChunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.getChunkGenerator()); }
public java.util.Optional getOrEmpty(yarnwrap.registry.RegistryKey key) { return wrapperContained.getOrEmpty(key.wrapperContained); }
// public com.mojang.serialization.Lifecycle getLifecycle(yarnwrap.registry.RegistryKey key,yarnwrap.world.dimension.DimensionOptions dimensionOptions) { return wrapperContained.getLifecycle(key.wrapperContained,dimensionOptions.wrapperContained); }
// public boolean isOverworldVanilla(yarnwrap.world.dimension.DimensionOptions dimensionOptions) { return wrapperContained.isOverworldVanilla(dimensionOptions.wrapperContained); }
public Object toConfig(yarnwrap.registry.Registry existingRegistry) { return wrapperContained.toConfig(existingRegistry.wrapperContained); }
public java.util.Map createRegistry(java.util.Map dimensionOptions,yarnwrap.registry.entry.RegistryEntry overworld,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator) { return wrapperContained.createRegistry(dimensionOptions,overworld.wrapperContained,chunkGenerator.wrapperContained); }
public java.util.Map createRegistry(yarnwrap.registry.Registry dynamicRegistry,java.util.Map dimensionOptions,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator) { return wrapperContained.createRegistry(dynamicRegistry.wrapperContained,dimensionOptions,chunkGenerator.wrapperContained); }
public yarnwrap.world.dimension.DimensionOptionsRegistryHolder with(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator) { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(wrapperContained.with(dynamicRegistryManager.wrapperContained,chunkGenerator.wrapperContained)); }
public java.util.stream.Stream streamAll(java.util.stream.Stream otherKeys) { return wrapperContained.streamAll(otherKeys); }
public com.google.common.collect.ImmutableSet getWorldKeys() { return wrapperContained.getWorldKeys(); }
// public boolean isVanilla(yarnwrap.registry.RegistryKey key,yarnwrap.world.dimension.DimensionOptions dimensionOptions) { return wrapperContained.isVanilla(key.wrapperContained,dimensionOptions.wrapperContained); }
// public boolean isNetherVanilla(yarnwrap.world.dimension.DimensionOptions dimensionOptions) { return wrapperContained.isNetherVanilla(dimensionOptions.wrapperContained); }
// public Object getSpecialProperty(yarnwrap.registry.Registry dimensionOptionsRegistry) { return wrapperContained.getSpecialProperty(dimensionOptionsRegistry.wrapperContained); }
public boolean isDebug() { return wrapperContained.isDebug(); }
// public boolean isTheEndVanilla(yarnwrap.world.dimension.DimensionOptions dimensionOptions) { return wrapperContained.isTheEndVanilla(dimensionOptions.wrapperContained); }

}