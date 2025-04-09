package yarnwrap.world.gen.chunk;
public class ChunkGeneratorSettings { public net.minecraft.world.gen.chunk.ChunkGeneratorSettings wrapperContained; public ChunkGeneratorSettings(net.minecraft.world.gen.chunk.ChunkGeneratorSettings wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.chunk.GenerationShapeConfig generationShapeConfig() { return new yarnwrap.world.gen.chunk.GenerationShapeConfig(wrapperContained.generationShapeConfig); }
// public yarnwrap.block.BlockState defaultBlock() { return new yarnwrap.block.BlockState(wrapperContained.defaultBlock); }
// public yarnwrap.block.BlockState defaultFluid() { return new yarnwrap.block.BlockState(wrapperContained.defaultFluid); }
// public Object surfaceRule() { return wrapperContained.surfaceRule; }
// public int seaLevel() { return wrapperContained.seaLevel; }
// public boolean mobGenerationDisabled() { return wrapperContained.mobGenerationDisabled; }
// public boolean aquifers() { return wrapperContained.aquifers; }
// public boolean oreVeins() { return wrapperContained.oreVeins; }
// public boolean usesLegacyRandom() { return wrapperContained.usesLegacyRandom; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
public yarnwrap.registry.RegistryKey OVERWORLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.OVERWORLD); }
public yarnwrap.registry.RegistryKey AMPLIFIED() { return new yarnwrap.registry.RegistryKey(wrapperContained.AMPLIFIED); }
public yarnwrap.registry.RegistryKey NETHER() { return new yarnwrap.registry.RegistryKey(wrapperContained.NETHER); }
public yarnwrap.registry.RegistryKey END() { return new yarnwrap.registry.RegistryKey(wrapperContained.END); }
public yarnwrap.registry.RegistryKey CAVES() { return new yarnwrap.registry.RegistryKey(wrapperContained.CAVES); }
public yarnwrap.registry.RegistryKey FLOATING_ISLANDS() { return new yarnwrap.registry.RegistryKey(wrapperContained.FLOATING_ISLANDS); }
public yarnwrap.registry.RegistryKey LARGE_BIOMES() { return new yarnwrap.registry.RegistryKey(wrapperContained.LARGE_BIOMES); }
// public yarnwrap.world.gen.chunk.GenerationShapeConfig generationShapeConfig() { return new yarnwrap.world.gen.chunk.GenerationShapeConfig(wrapperContained.generationShapeConfig()); }
// public yarnwrap.block.BlockState defaultBlock() { return new yarnwrap.block.BlockState(wrapperContained.defaultBlock()); }
// public yarnwrap.block.BlockState defaultFluid() { return new yarnwrap.block.BlockState(wrapperContained.defaultFluid()); }
// public Object surfaceRule() { return wrapperContained.surfaceRule(); }
// public int seaLevel() { return wrapperContained.seaLevel(); }
// public boolean mobGenerationDisabled() { return wrapperContained.mobGenerationDisabled(); }
// public boolean aquifers() { return wrapperContained.aquifers(); }
// public boolean oreVeins() { return wrapperContained.oreVeins(); }
// public boolean usesLegacyRandom() { return wrapperContained.usesLegacyRandom(); }
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