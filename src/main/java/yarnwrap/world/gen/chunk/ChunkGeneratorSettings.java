package yarnwrap.world.gen.chunk;
public class ChunkGeneratorSettings { public net.minecraft.world.gen.chunk.ChunkGeneratorSettings wrapperContained; public ChunkGeneratorSettings(net.minecraft.world.gen.chunk.ChunkGeneratorSettings wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.chunk.GenerationShapeConfig generationShapeConfig() { return new yarnwrap.world.gen.chunk.GenerationShapeConfig(wrapperContained.generationShapeConfig); }
// public void generationShapeConfig(yarnwrap.world.gen.chunk.GenerationShapeConfig value) { wrapperContained.generationShapeConfig = value.wrapperContained; }
// public yarnwrap.block.BlockState defaultBlock() { return new yarnwrap.block.BlockState(wrapperContained.defaultBlock); }
// public void defaultBlock(yarnwrap.block.BlockState value) { wrapperContained.defaultBlock = value.wrapperContained; }
// public yarnwrap.block.BlockState defaultFluid() { return new yarnwrap.block.BlockState(wrapperContained.defaultFluid); }
// public void defaultFluid(yarnwrap.block.BlockState value) { wrapperContained.defaultFluid = value.wrapperContained; }
// public Object surfaceRule() { return wrapperContained.surfaceRule; }
// // public void surfaceRule(Object value) { wrapperContained.surfaceRule = value; }
// public int seaLevel() { return wrapperContained.seaLevel; }
// public void seaLevel(int value) { wrapperContained.seaLevel = value; }
// public boolean mobGenerationDisabled() { return wrapperContained.mobGenerationDisabled; }
// public void mobGenerationDisabled(boolean value) { wrapperContained.mobGenerationDisabled = value; }
// public boolean aquifers() { return wrapperContained.aquifers; }
// public void aquifers(boolean value) { wrapperContained.aquifers = value; }
// public boolean oreVeins() { return wrapperContained.oreVeins; }
// public void oreVeins(boolean value) { wrapperContained.oreVeins = value; }
// public boolean usesLegacyRandom() { return wrapperContained.usesLegacyRandom; }
// public void usesLegacyRandom(boolean value) { wrapperContained.usesLegacyRandom = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
// public void REGISTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.REGISTRY_CODEC = value; }
public yarnwrap.registry.RegistryKey OVERWORLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.OVERWORLD); }
// public void OVERWORLD(yarnwrap.registry.RegistryKey value) { wrapperContained.OVERWORLD = value.wrapperContained; }
public yarnwrap.registry.RegistryKey AMPLIFIED() { return new yarnwrap.registry.RegistryKey(wrapperContained.AMPLIFIED); }
// public void AMPLIFIED(yarnwrap.registry.RegistryKey value) { wrapperContained.AMPLIFIED = value.wrapperContained; }
public yarnwrap.registry.RegistryKey NETHER() { return new yarnwrap.registry.RegistryKey(wrapperContained.NETHER); }
// public void NETHER(yarnwrap.registry.RegistryKey value) { wrapperContained.NETHER = value.wrapperContained; }
public yarnwrap.registry.RegistryKey END() { return new yarnwrap.registry.RegistryKey(wrapperContained.END); }
// public void END(yarnwrap.registry.RegistryKey value) { wrapperContained.END = value.wrapperContained; }
public yarnwrap.registry.RegistryKey CAVES() { return new yarnwrap.registry.RegistryKey(wrapperContained.CAVES); }
// public void CAVES(yarnwrap.registry.RegistryKey value) { wrapperContained.CAVES = value.wrapperContained; }
public yarnwrap.registry.RegistryKey FLOATING_ISLANDS() { return new yarnwrap.registry.RegistryKey(wrapperContained.FLOATING_ISLANDS); }
// public void FLOATING_ISLANDS(yarnwrap.registry.RegistryKey value) { wrapperContained.FLOATING_ISLANDS = value.wrapperContained; }
public yarnwrap.registry.RegistryKey LARGE_BIOMES() { return new yarnwrap.registry.RegistryKey(wrapperContained.LARGE_BIOMES); }
// public void LARGE_BIOMES(yarnwrap.registry.RegistryKey value) { wrapperContained.LARGE_BIOMES = value.wrapperContained; }
// public ChunkGeneratorSettings(yarnwrap.world.gen.chunk.GenerationShapeConfig surfaceRule) { this.wrapperContained = new net.minecraft.world.gen.chunk.ChunkGeneratorSettings(surfaceRule.wrapperContained); }
// public yarnwrap.world.gen.chunk.GenerationShapeConfig generationShapeConfig() { return new yarnwrap.world.gen.chunk.GenerationShapeConfig(wrapperContained.generationShapeConfig()); }
// public yarnwrap.block.BlockState defaultBlock() { return new yarnwrap.block.BlockState(wrapperContained.defaultBlock()); }
// public yarnwrap.block.BlockState defaultFluid() { return new yarnwrap.block.BlockState(wrapperContained.defaultFluid()); }
// public Object surfaceRule() { return wrapperContained.surfaceRule(); }
// public int seaLevel() { return wrapperContained.seaLevel(); }
// public boolean mobGenerationDisabled() { return wrapperContained.mobGenerationDisabled(); }
// public boolean aquifers() { return wrapperContained.aquifers(); }
// public boolean oreVeins() { return wrapperContained.oreVeins(); }
// public boolean usesLegacyRandom() { return wrapperContained.usesLegacyRandom(); }
// public com.mojang.datafixers.kinds.App method_28558(Object instance) { return wrapperContained.method_28558(instance); }
// public yarnwrap.world.gen.chunk.ChunkGeneratorSettings createNetherSettings(yarnwrap.registry.Registerable registerable) { return new yarnwrap.world.gen.chunk.ChunkGeneratorSettings(wrapperContained.createNetherSettings(registerable.wrapperContained)); }
// public yarnwrap.world.gen.chunk.ChunkGeneratorSettings createEndSettings(yarnwrap.registry.Registerable registerable) { return new yarnwrap.world.gen.chunk.ChunkGeneratorSettings(wrapperContained.createEndSettings(registerable.wrapperContained)); }
// public yarnwrap.world.gen.chunk.ChunkGeneratorSettings createSurfaceSettings(yarnwrap.registry.Registerable registerable,boolean amplified,boolean largeBiomes) { return new yarnwrap.world.gen.chunk.ChunkGeneratorSettings(wrapperContained.createSurfaceSettings(registerable.wrapperContained,amplified,largeBiomes)); }
public void bootstrap(yarnwrap.registry.Registerable chunkGenerationSettingsRegisterable) { wrapperContained.bootstrap(chunkGenerationSettingsRegisterable.wrapperContained); }
public boolean hasAquifers() { return wrapperContained.hasAquifers(); }
public Object getRandomProvider() { return wrapperContained.getRandomProvider(); }
// public yarnwrap.world.gen.chunk.ChunkGeneratorSettings createCavesSettings(yarnwrap.registry.Registerable registerable) { return new yarnwrap.world.gen.chunk.ChunkGeneratorSettings(wrapperContained.createCavesSettings(registerable.wrapperContained)); }
// public yarnwrap.world.gen.chunk.ChunkGeneratorSettings createFloatingIslandsSettings(yarnwrap.registry.Registerable registerable) { return new yarnwrap.world.gen.chunk.ChunkGeneratorSettings(wrapperContained.createFloatingIslandsSettings(registerable.wrapperContained)); }
public yarnwrap.world.gen.chunk.ChunkGeneratorSettings createMissingSettings() { return new yarnwrap.world.gen.chunk.ChunkGeneratorSettings(wrapperContained.createMissingSettings()); }

}