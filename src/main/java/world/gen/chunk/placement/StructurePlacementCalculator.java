package yarnwrap.world.gen.chunk.placement;
public class StructurePlacementCalculator { public net.minecraft.world.gen.chunk.placement.StructurePlacementCalculator wrapperContained; public StructurePlacementCalculator(net.minecraft.world.gen.chunk.placement.StructurePlacementCalculator wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.world.gen.noise.NoiseConfig noiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.noiseConfig); }
// public yarnwrap.world.biome.source.BiomeSource biomeSource() { return new yarnwrap.world.biome.source.BiomeSource(wrapperContained.biomeSource); }
// public long structureSeed() { return wrapperContained.structureSeed; }
// public long concentricRingSeed() { return wrapperContained.concentricRingSeed; }
// public java.util.Map structuresToPlacements() { return wrapperContained.structuresToPlacements; }
// public java.util.Map concentricPlacementsToPositions() { return wrapperContained.concentricPlacementsToPositions; }
// public boolean calculated() { return wrapperContained.calculated; }
// public java.util.List structureSets() { return wrapperContained.structureSets; }
public java.util.List getStructureSets() { return wrapperContained.getStructureSets(); }
public yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator create(yarnwrap.world.gen.noise.NoiseConfig noiseConfig,long seed,yarnwrap.world.biome.source.BiomeSource biomeSource,yarnwrap.registry.RegistryWrapper structureSetRegistry) { return new yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator(wrapperContained.create(noiseConfig.wrapperContained,seed,biomeSource.wrapperContained,structureSetRegistry.wrapperContained)); }
public yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator create(yarnwrap.world.gen.noise.NoiseConfig noiseConfig,long seed,yarnwrap.world.biome.source.BiomeSource biomeSource,java.util.stream.Stream structureSets) { return new yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator(wrapperContained.create(noiseConfig.wrapperContained,seed,biomeSource.wrapperContained,structureSets)); }
// public boolean hasValidBiome(yarnwrap.structure.StructureSet structureSet,yarnwrap.world.biome.source.BiomeSource biomeSource) { return wrapperContained.hasValidBiome(structureSet.wrapperContained,biomeSource.wrapperContained); }
public java.util.List getPlacementPositions(yarnwrap.world.gen.chunk.placement.ConcentricRingsStructurePlacement placement) { return wrapperContained.getPlacementPositions(placement.wrapperContained); }
public java.util.List getPlacements(yarnwrap.registry.entry.RegistryEntry structureEntry) { return wrapperContained.getPlacements(structureEntry.wrapperContained); }
public boolean canGenerate(yarnwrap.registry.entry.RegistryEntry structureSetEntry,int centerChunkX,int centerChunkZ,int chunkCount) { return wrapperContained.canGenerate(structureSetEntry.wrapperContained,centerChunkX,centerChunkZ,chunkCount); }
// public java.util.concurrent.CompletableFuture calculateConcentricsRingPlacementPos(yarnwrap.registry.entry.RegistryEntry structureSetEntry,yarnwrap.world.gen.chunk.placement.ConcentricRingsStructurePlacement placement) { return wrapperContained.calculateConcentricsRingPlacementPos(structureSetEntry.wrapperContained,placement.wrapperContained); }
public void tryCalculate() { wrapperContained.tryCalculate(); }
public yarnwrap.world.gen.noise.NoiseConfig getNoiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.getNoiseConfig()); }
public long getStructureSeed() { return wrapperContained.getStructureSeed(); }
// public void calculate() { wrapperContained.calculate(); }

}