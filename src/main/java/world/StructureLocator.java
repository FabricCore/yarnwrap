package yarnwrap.world;
public class StructureLocator { public net.minecraft.world.StructureLocator wrapperContained; public StructureLocator(net.minecraft.world.StructureLocator wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int START_NOT_PRESENT_REFERENCE() { return wrapperContained.START_NOT_PRESENT_REFERENCE; }
// public yarnwrap.world.storage.NbtScannable chunkIoWorker() { return new yarnwrap.world.storage.NbtScannable(wrapperContained.chunkIoWorker); }
// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
// public yarnwrap.structure.StructureTemplateManager structureTemplateManager() { return new yarnwrap.structure.StructureTemplateManager(wrapperContained.structureTemplateManager); }
// public yarnwrap.registry.RegistryKey worldKey() { return new yarnwrap.registry.RegistryKey(wrapperContained.worldKey); }
// public yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.chunkGenerator); }
// public yarnwrap.world.HeightLimitView world() { return new yarnwrap.world.HeightLimitView(wrapperContained.world); }
// public yarnwrap.world.biome.source.BiomeSource biomeSource() { return new yarnwrap.world.biome.source.BiomeSource(wrapperContained.biomeSource); }
// public long seed() { return wrapperContained.seed; }
// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectMap cachedStructuresByChunkPos() { return wrapperContained.cachedStructuresByChunkPos; }
// public java.util.Map generationPossibilityByStructure() { return wrapperContained.generationPossibilityByStructure; }
// public yarnwrap.world.gen.noise.NoiseConfig noiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.noiseConfig); }
// public void cache(long pos,it.unimi.dsi.fastutil.objects.Object2IntMap referencesByStructure) { wrapperContained.cache(pos,referencesByStructure); }
// public boolean isGenerationPossible(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.gen.structure.Structure structure) { return wrapperContained.isGenerationPossible(pos.wrapperContained,structure.wrapperContained); }
public void incrementReferences(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.gen.structure.Structure structure) { wrapperContained.incrementReferences(pos.wrapperContained,structure.wrapperContained); }
public yarnwrap.world.StructurePresence getStructurePresence(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.gen.structure.Structure type,yarnwrap.world.gen.chunk.placement.StructurePlacement placement,boolean skipReferencedStructures) { return new yarnwrap.world.StructurePresence(wrapperContained.getStructurePresence(pos.wrapperContained,type.wrapperContained,placement.wrapperContained,skipReferencedStructures)); }
// public yarnwrap.world.StructurePresence getStructurePresence(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.gen.structure.Structure structure,boolean skipReferencedStructures,long posLong) { return new yarnwrap.world.StructurePresence(wrapperContained.getStructurePresence(pos.wrapperContained,structure.wrapperContained,skipReferencedStructures,posLong)); }
public void cache(yarnwrap.util.math.ChunkPos pos,java.util.Map structureStarts) { wrapperContained.cache(pos.wrapperContained,structureStarts); }
// public it.unimi.dsi.fastutil.objects.Object2IntMap createMapIfEmpty(it.unimi.dsi.fastutil.objects.Object2IntMap map) { return wrapperContained.createMapIfEmpty(map); }
// public yarnwrap.world.StructurePresence getStructurePresence(it.unimi.dsi.fastutil.objects.Object2IntMap referencesByStructure,yarnwrap.world.gen.structure.Structure structure,boolean skipReferencedStructures) { return new yarnwrap.world.StructurePresence(wrapperContained.getStructurePresence(referencesByStructure,structure.wrapperContained,skipReferencedStructures)); }
// public it.unimi.dsi.fastutil.objects.Object2IntMap collectStructuresAndReferences(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.collectStructuresAndReferences(nbt.wrapperContained); }

}