package yarnwrap.world;
public class StructureLocator { public net.minecraft.world.StructureLocator wrapperContained; public StructureLocator(net.minecraft.world.StructureLocator wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int START_NOT_PRESENT_REFERENCE() { return wrapperContained.START_NOT_PRESENT_REFERENCE; }
// public void START_NOT_PRESENT_REFERENCE(int value) { wrapperContained.START_NOT_PRESENT_REFERENCE = value; }
// public yarnwrap.world.storage.NbtScannable chunkIoWorker() { return new yarnwrap.world.storage.NbtScannable(wrapperContained.chunkIoWorker); }
// public void chunkIoWorker(yarnwrap.world.storage.NbtScannable value) { wrapperContained.chunkIoWorker = value.wrapperContained; }
// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
// public void registryManager(yarnwrap.registry.DynamicRegistryManager value) { wrapperContained.registryManager = value.wrapperContained; }
// public yarnwrap.structure.StructureTemplateManager structureTemplateManager() { return new yarnwrap.structure.StructureTemplateManager(wrapperContained.structureTemplateManager); }
// public void structureTemplateManager(yarnwrap.structure.StructureTemplateManager value) { wrapperContained.structureTemplateManager = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey worldKey() { return new yarnwrap.registry.RegistryKey(wrapperContained.worldKey); }
// public void worldKey(yarnwrap.registry.RegistryKey value) { wrapperContained.worldKey = value.wrapperContained; }
// public yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.chunkGenerator); }
// public void chunkGenerator(yarnwrap.world.gen.chunk.ChunkGenerator value) { wrapperContained.chunkGenerator = value.wrapperContained; }
// public yarnwrap.world.HeightLimitView world() { return new yarnwrap.world.HeightLimitView(wrapperContained.world); }
// public void world(yarnwrap.world.HeightLimitView value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.world.biome.source.BiomeSource biomeSource() { return new yarnwrap.world.biome.source.BiomeSource(wrapperContained.biomeSource); }
// public void biomeSource(yarnwrap.world.biome.source.BiomeSource value) { wrapperContained.biomeSource = value.wrapperContained; }
// public long seed() { return wrapperContained.seed; }
// public void seed(long value) { wrapperContained.seed = value; }
// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectMap cachedStructuresByChunkPos() { return wrapperContained.cachedStructuresByChunkPos; }
// public void cachedStructuresByChunkPos(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.cachedStructuresByChunkPos = value; }
// public java.util.Map generationPossibilityByStructure() { return wrapperContained.generationPossibilityByStructure; }
// public void generationPossibilityByStructure(java.util.Map value) { wrapperContained.generationPossibilityByStructure = value; }
// public yarnwrap.world.gen.noise.NoiseConfig noiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.noiseConfig); }
// public void noiseConfig(yarnwrap.world.gen.noise.NoiseConfig value) { wrapperContained.noiseConfig = value.wrapperContained; }
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