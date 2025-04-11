package yarnwrap.world.gen.chunk.placement;
public class StructurePlacementCalculator { public net.minecraft.world.gen.chunk.placement.StructurePlacementCalculator wrapperContained; public StructurePlacementCalculator(net.minecraft.world.gen.chunk.placement.StructurePlacementCalculator wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.world.gen.noise.NoiseConfig noiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.noiseConfig); }
// public void noiseConfig(yarnwrap.world.gen.noise.NoiseConfig value) { wrapperContained.noiseConfig = value.wrapperContained; }
// public yarnwrap.world.biome.source.BiomeSource biomeSource() { return new yarnwrap.world.biome.source.BiomeSource(wrapperContained.biomeSource); }
// public void biomeSource(yarnwrap.world.biome.source.BiomeSource value) { wrapperContained.biomeSource = value.wrapperContained; }
// public long structureSeed() { return wrapperContained.structureSeed; }
// public void structureSeed(long value) { wrapperContained.structureSeed = value; }
// public long concentricRingSeed() { return wrapperContained.concentricRingSeed; }
// public void concentricRingSeed(long value) { wrapperContained.concentricRingSeed = value; }
// public java.util.Map structuresToPlacements() { return wrapperContained.structuresToPlacements; }
// public void structuresToPlacements(java.util.Map value) { wrapperContained.structuresToPlacements = value; }
// public java.util.Map concentricPlacementsToPositions() { return wrapperContained.concentricPlacementsToPositions; }
// public void concentricPlacementsToPositions(java.util.Map value) { wrapperContained.concentricPlacementsToPositions = value; }
// public boolean calculated() { return wrapperContained.calculated; }
// public void calculated(boolean value) { wrapperContained.calculated = value; }
// public java.util.List structureSets() { return wrapperContained.structureSets; }
// public void structureSets(java.util.List value) { wrapperContained.structureSets = value; }
// public StructurePlacementCalculator(yarnwrap.world.gen.noise.NoiseConfig noiseConfig,yarnwrap.world.biome.source.BiomeSource biomeSource,long structureSeed,long concentricRingSeed,java.util.List structureSets) { this.wrapperContained = new net.minecraft.world.gen.chunk.placement.StructurePlacementCalculator(noiseConfig.wrapperContained,biomeSource.wrapperContained,structureSeed,concentricRingSeed,structureSets); }
public java.util.List getStructureSets() { return wrapperContained.getStructureSets(); }
// public boolean method_46699(yarnwrap.world.biome.source.BiomeSource structureSet) { return wrapperContained.method_46699(structureSet.wrapperContained); }
// public boolean method_46700(yarnwrap.world.biome.source.BiomeSource structureSet) { return wrapperContained.method_46700(structureSet.wrapperContained); }
// public java.util.List method_46701(com.google.common.base.Stopwatch positions) { return wrapperContained.method_46701(positions); }
public yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator create(yarnwrap.world.gen.noise.NoiseConfig noiseConfig,long seed,yarnwrap.world.biome.source.BiomeSource biomeSource,yarnwrap.registry.RegistryWrapper structureSetRegistry) { return new yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator(wrapperContained.create(noiseConfig.wrapperContained,seed,biomeSource.wrapperContained,structureSetRegistry.wrapperContained)); }
public yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator create(yarnwrap.world.gen.noise.NoiseConfig noiseConfig,long seed,yarnwrap.world.biome.source.BiomeSource biomeSource,java.util.stream.Stream structureSets) { return new yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator(wrapperContained.create(noiseConfig.wrapperContained,seed,biomeSource.wrapperContained,structureSets)); }
// public java.util.List method_46704(yarnwrap.world.gen.structure.Structure structure) { return wrapperContained.method_46704(structure.wrapperContained); }
// public java.util.stream.Stream method_46705(Object structure) { return wrapperContained.method_46705(structure); }
// public boolean hasValidBiome(yarnwrap.structure.StructureSet structureSet,yarnwrap.world.biome.source.BiomeSource biomeSource) { return wrapperContained.hasValidBiome(structureSet.wrapperContained,biomeSource.wrapperContained); }
public java.util.List getPlacementPositions(yarnwrap.world.gen.chunk.placement.ConcentricRingsStructurePlacement placement) { return wrapperContained.getPlacementPositions(placement.wrapperContained); }
public java.util.List getPlacements(yarnwrap.registry.entry.RegistryEntry structureEntry) { return wrapperContained.getPlacements(structureEntry.wrapperContained); }
public boolean canGenerate(yarnwrap.registry.entry.RegistryEntry structureSetEntry,int centerChunkX,int centerChunkZ,int chunkCount) { return wrapperContained.canGenerate(structureSetEntry.wrapperContained,centerChunkX,centerChunkZ,chunkCount); }
// public java.util.concurrent.CompletableFuture calculateConcentricsRingPlacementPos(yarnwrap.registry.entry.RegistryEntry structureSetEntry,yarnwrap.world.gen.chunk.placement.ConcentricRingsStructurePlacement placement) { return wrapperContained.calculateConcentricsRingPlacementPos(structureSetEntry.wrapperContained,placement.wrapperContained); }
// public void method_46711(java.util.Set structureSet) { wrapperContained.method_46711(structureSet); }
public void tryCalculate() { wrapperContained.tryCalculate(); }
public yarnwrap.world.gen.noise.NoiseConfig getNoiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.getNoiseConfig()); }
public long getStructureSeed() { return wrapperContained.getStructureSeed(); }
// public void calculate() { wrapperContained.calculate(); }

}