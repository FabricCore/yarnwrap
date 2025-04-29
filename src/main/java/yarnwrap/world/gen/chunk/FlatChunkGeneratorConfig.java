package yarnwrap.world.gen.chunk;
public class FlatChunkGeneratorConfig { public net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig wrapperContained; public FlatChunkGeneratorConfig(net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.LOGGER = value; }

// public java.util.List layers() { return wrapperContained.layers; }
// public void layers(java.util.List value) { wrapperContained.layers = value; }
// public static java.util.List layers() { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.layers; }
// public static void layers(java.util.List value, ) { net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.layers = value; }

// public boolean hasNoTerrain() { return wrapperContained.hasNoTerrain; }
// public void hasNoTerrain(boolean value) { wrapperContained.hasNoTerrain = value; }
// public static boolean hasNoTerrain() { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.hasNoTerrain; }
// public static void hasNoTerrain(boolean value, ) { net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.hasNoTerrain = value; }

// public yarnwrap.registry.entry.RegistryEntry biome() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.biome); }
// public void biome(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.biome = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry biome() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.biome); }
// public static void biome(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.biome = value.wrapperContained; }

// public java.util.List layerBlocks() { return wrapperContained.layerBlocks; }
// public void layerBlocks(java.util.List value) { wrapperContained.layerBlocks = value; }
// public static java.util.List layerBlocks() { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.layerBlocks; }
// public static void layerBlocks(java.util.List value, ) { net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.layerBlocks = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.CODEC = value; }

// public boolean hasFeatures() { return wrapperContained.hasFeatures; }
// public void hasFeatures(boolean value) { wrapperContained.hasFeatures = value; }
// public static boolean hasFeatures() { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.hasFeatures; }
// public static void hasFeatures(boolean value, ) { net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.hasFeatures = value; }

// public boolean hasLakes() { return wrapperContained.hasLakes; }
// public void hasLakes(boolean value) { wrapperContained.hasLakes = value; }
// public static boolean hasLakes() { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.hasLakes; }
// public static void hasLakes(boolean value, ) { net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.hasLakes = value; }

// public java.util.Optional structureOverrides() { return wrapperContained.structureOverrides; }
// public void structureOverrides(java.util.Optional value) { wrapperContained.structureOverrides = value; }
// public static java.util.Optional structureOverrides() { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.structureOverrides; }
// public static void structureOverrides(java.util.Optional value, ) { net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.structureOverrides = value; }

// public java.util.List features() { return wrapperContained.features; }
// public void features(java.util.List value) { wrapperContained.features = value; }
// public static java.util.List features() { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.features; }
// public static void features(java.util.List value, ) { net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.features = value; }

// public FlatChunkGeneratorConfig(java.util.Optional structureOverrides,java.util.List layers,boolean lakes,boolean features,java.util.Optional biome,Object fallback,yarnwrap.registry.entry.RegistryEntry undergroundLavaLakeFeature,yarnwrap.registry.entry.RegistryEntry surfaceLavaLakeFeature) { this.wrapperContained = new net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig(structureOverrides,layers,lakes,features,biome,fallback,undergroundLavaLakeFeature.wrapperContained,surfaceLavaLakeFeature.wrapperContained); }
public FlatChunkGeneratorConfig(java.util.Optional structureOverrides,yarnwrap.registry.entry.RegistryEntry biome,java.util.List features) { this.wrapperContained = new net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig(structureOverrides,biome.wrapperContained,features); }
// public yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig getDefaultConfig(yarnwrap.registry.RegistryEntryLookup biomeLookup,yarnwrap.registry.RegistryEntryLookup structureSetLookup,yarnwrap.registry.RegistryEntryLookup featureLookup) { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(wrapperContained.getDefaultConfig(biomeLookup.wrapperContained,structureSetLookup.wrapperContained,featureLookup.wrapperContained)); }
// public static yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig getDefaultConfig(yarnwrap.registry.RegistryEntryLookup biomeLookup,yarnwrap.registry.RegistryEntryLookup structureSetLookup,yarnwrap.registry.RegistryEntryLookup featureLookup, ) { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.getDefaultConfig(biomeLookup.wrapperContained,structureSetLookup.wrapperContained,featureLookup.wrapperContained)); }
public java.util.List getLayerBlocks() { return wrapperContained.getLayerBlocks(); }
// public static java.util.List getLayerBlocks() { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.getLayerBlocks(); }
public yarnwrap.registry.entry.RegistryEntry getBiome() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getBiome()); }
// public static yarnwrap.registry.entry.RegistryEntry getBiome() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.getBiome()); }
public java.util.List getLayers() { return wrapperContained.getLayers(); }
// public static java.util.List getLayers() { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.getLayers(); }
public void updateLayerBlocks() { wrapperContained.updateLayerBlocks(); }
// public static void updateLayerBlocks() { net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.updateLayerBlocks(); }
public void enableFeatures() { wrapperContained.enableFeatures(); }
// public static void enableFeatures() { net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.enableFeatures(); }
// public com.mojang.datafixers.kinds.App method_28913(Object instance) { return wrapperContained.method_28913(instance); }
// public static com.mojang.datafixers.kinds.App method_28913(Object instance, ) { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.method_28913(instance); }
public void enableLakes() { wrapperContained.enableLakes(); }
// public static void enableLakes() { net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.enableLakes(); }
// public java.lang.Boolean method_30046(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { return wrapperContained.method_30046(config.wrapperContained); }
// public static java.lang.Boolean method_30046(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config, ) { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.method_30046(config.wrapperContained); }
// public java.lang.Boolean method_30047(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { return wrapperContained.method_30047(config.wrapperContained); }
// public static java.lang.Boolean method_30047(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config, ) { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.method_30047(config.wrapperContained); }
// public java.util.Optional method_31182(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { return wrapperContained.method_31182(config.wrapperContained); }
// public static java.util.Optional method_31182(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config, ) { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.method_31182(config.wrapperContained); }
// public com.mojang.serialization.DataResult checkHeight(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { return wrapperContained.checkHeight(config.wrapperContained); }
// public static com.mojang.serialization.DataResult checkHeight(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config, ) { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.checkHeight(config.wrapperContained); }
// public boolean method_34741(yarnwrap.block.BlockState state) { return wrapperContained.method_34741(state.wrapperContained); }
// public static boolean method_34741(yarnwrap.block.BlockState state, ) { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.method_34741(state.wrapperContained); }
public java.util.Optional getStructureOverrides() { return wrapperContained.getStructureOverrides(); }
// public static java.util.Optional getStructureOverrides() { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.getStructureOverrides(); }
// public java.util.Optional method_41140(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { return wrapperContained.method_41140(config.wrapperContained); }
// public static java.util.Optional method_41140(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config, ) { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.method_41140(config.wrapperContained); }
public yarnwrap.world.biome.GenerationSettings createGenerationSettings(yarnwrap.registry.entry.RegistryEntry biomeEntry) { return new yarnwrap.world.biome.GenerationSettings(wrapperContained.createGenerationSettings(biomeEntry.wrapperContained)); }
// public static yarnwrap.world.biome.GenerationSettings createGenerationSettings(yarnwrap.registry.entry.RegistryEntry biomeEntry, ) { return new yarnwrap.world.biome.GenerationSettings(net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.createGenerationSettings(biomeEntry.wrapperContained)); }
// public yarnwrap.registry.entry.RegistryEntry getPlains(yarnwrap.registry.RegistryEntryLookup biomeLookup) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getPlains(biomeLookup.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry getPlains(yarnwrap.registry.RegistryEntryLookup biomeLookup, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.getPlains(biomeLookup.wrapperContained)); }
public yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig with(java.util.List layers,java.util.Optional structureOverrides,yarnwrap.registry.entry.RegistryEntry biome) { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(wrapperContained.with(layers,structureOverrides,biome.wrapperContained)); }
// public static yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig with(java.util.List layers,java.util.Optional structureOverrides,yarnwrap.registry.entry.RegistryEntry biome, ) { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.with(layers,structureOverrides,biome.wrapperContained)); }
// public yarnwrap.registry.entry.RegistryEntry getBiome(java.util.Optional biome,yarnwrap.registry.entry.RegistryEntry fallback) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getBiome(biome,fallback.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry getBiome(java.util.Optional biome,yarnwrap.registry.entry.RegistryEntry fallback, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.getBiome(biome,fallback.wrapperContained)); }
// public java.util.List getLavaLakes(yarnwrap.registry.RegistryEntryLookup featureLookup) { return wrapperContained.getLavaLakes(featureLookup.wrapperContained); }
// public static java.util.List getLavaLakes(yarnwrap.registry.RegistryEntryLookup featureLookup, ) { return net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig.getLavaLakes(featureLookup.wrapperContained); }

}