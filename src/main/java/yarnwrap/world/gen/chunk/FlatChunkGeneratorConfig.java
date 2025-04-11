package yarnwrap.world.gen.chunk;
public class FlatChunkGeneratorConfig { public net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig wrapperContained; public FlatChunkGeneratorConfig(net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.List layers() { return wrapperContained.layers; }
// public void layers(java.util.List value) { wrapperContained.layers = value; }
// public boolean hasNoTerrain() { return wrapperContained.hasNoTerrain; }
// public void hasNoTerrain(boolean value) { wrapperContained.hasNoTerrain = value; }
// public yarnwrap.registry.entry.RegistryEntry biome() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.biome); }
// public void biome(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.biome = value.wrapperContained; }
// public java.util.List layerBlocks() { return wrapperContained.layerBlocks; }
// public void layerBlocks(java.util.List value) { wrapperContained.layerBlocks = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public boolean hasFeatures() { return wrapperContained.hasFeatures; }
// public void hasFeatures(boolean value) { wrapperContained.hasFeatures = value; }
// public boolean hasLakes() { return wrapperContained.hasLakes; }
// public void hasLakes(boolean value) { wrapperContained.hasLakes = value; }
// public java.util.Optional structureOverrides() { return wrapperContained.structureOverrides; }
// public void structureOverrides(java.util.Optional value) { wrapperContained.structureOverrides = value; }
// public java.util.List features() { return wrapperContained.features; }
// public void features(java.util.List value) { wrapperContained.features = value; }
// public FlatChunkGeneratorConfig(java.util.Optional structureOverrides,java.util.List layers,boolean lakes,boolean features,java.util.Optional biome,Object fallback,yarnwrap.registry.entry.RegistryEntry undergroundLavaLakeFeature,yarnwrap.registry.entry.RegistryEntry surfaceLavaLakeFeature) { this.wrapperContained = new net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig(structureOverrides,layers,lakes,features,biome,fallback,undergroundLavaLakeFeature.wrapperContained,surfaceLavaLakeFeature.wrapperContained); }
public FlatChunkGeneratorConfig(java.util.Optional structureOverrides,yarnwrap.registry.entry.RegistryEntry biome,java.util.List features) { this.wrapperContained = new net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig(structureOverrides,biome.wrapperContained,features); }
public yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig getDefaultConfig(yarnwrap.registry.RegistryEntryLookup biomeLookup,yarnwrap.registry.RegistryEntryLookup structureSetLookup,yarnwrap.registry.RegistryEntryLookup featureLookup) { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(wrapperContained.getDefaultConfig(biomeLookup.wrapperContained,structureSetLookup.wrapperContained,featureLookup.wrapperContained)); }
public java.util.List getLayerBlocks() { return wrapperContained.getLayerBlocks(); }
public yarnwrap.registry.entry.RegistryEntry getBiome() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getBiome()); }
public java.util.List getLayers() { return wrapperContained.getLayers(); }
public void updateLayerBlocks() { wrapperContained.updateLayerBlocks(); }
public void enableFeatures() { wrapperContained.enableFeatures(); }
// public com.mojang.datafixers.kinds.App method_28913(Object instance) { return wrapperContained.method_28913(instance); }
public void enableLakes() { wrapperContained.enableLakes(); }
// public java.lang.Boolean method_30046(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { return wrapperContained.method_30046(config.wrapperContained); }
// public java.lang.Boolean method_30047(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { return wrapperContained.method_30047(config.wrapperContained); }
// public java.util.Optional method_31182(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { return wrapperContained.method_31182(config.wrapperContained); }
// public com.mojang.serialization.DataResult checkHeight(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { return wrapperContained.checkHeight(config.wrapperContained); }
// public boolean method_34741(yarnwrap.block.BlockState state) { return wrapperContained.method_34741(state.wrapperContained); }
public java.util.Optional getStructureOverrides() { return wrapperContained.getStructureOverrides(); }
// public java.util.Optional method_41140(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { return wrapperContained.method_41140(config.wrapperContained); }
public yarnwrap.world.biome.GenerationSettings createGenerationSettings(yarnwrap.registry.entry.RegistryEntry biomeEntry) { return new yarnwrap.world.biome.GenerationSettings(wrapperContained.createGenerationSettings(biomeEntry.wrapperContained)); }
public yarnwrap.registry.entry.RegistryEntry getPlains(yarnwrap.registry.RegistryEntryLookup biomeLookup) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getPlains(biomeLookup.wrapperContained)); }
public yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig with(java.util.List layers,java.util.Optional structureOverrides,yarnwrap.registry.entry.RegistryEntry biome) { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(wrapperContained.with(layers,structureOverrides,biome.wrapperContained)); }
// public yarnwrap.registry.entry.RegistryEntry getBiome(java.util.Optional biome,yarnwrap.registry.entry.RegistryEntry fallback) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getBiome(biome,fallback.wrapperContained)); }
public java.util.List getLavaLakes(yarnwrap.registry.RegistryEntryLookup featureLookup) { return wrapperContained.getLavaLakes(featureLookup.wrapperContained); }

}