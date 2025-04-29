package yarnwrap.world;
public class StructureLocator { public net.minecraft.world.StructureLocator wrapperContained; public StructureLocator(net.minecraft.world.StructureLocator wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.StructureLocator.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.StructureLocator.LOGGER = value; }

// public int START_NOT_PRESENT_REFERENCE() { return wrapperContained.START_NOT_PRESENT_REFERENCE; }
// public void START_NOT_PRESENT_REFERENCE(int value) { wrapperContained.START_NOT_PRESENT_REFERENCE = value; }
// public static int START_NOT_PRESENT_REFERENCE() { return net.minecraft.world.StructureLocator.START_NOT_PRESENT_REFERENCE; }
// public static void START_NOT_PRESENT_REFERENCE(int value, ) { net.minecraft.world.StructureLocator.START_NOT_PRESENT_REFERENCE = value; }

// public yarnwrap.world.storage.NbtScannable chunkIoWorker() { return new yarnwrap.world.storage.NbtScannable(wrapperContained.chunkIoWorker); }
// public void chunkIoWorker(yarnwrap.world.storage.NbtScannable value) { wrapperContained.chunkIoWorker = value.wrapperContained; }
// public static yarnwrap.world.storage.NbtScannable chunkIoWorker() { return new yarnwrap.world.storage.NbtScannable(net.minecraft.world.StructureLocator.chunkIoWorker); }
// public static void chunkIoWorker(yarnwrap.world.storage.NbtScannable value, ) { net.minecraft.world.StructureLocator.chunkIoWorker = value.wrapperContained; }

// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
// public void registryManager(yarnwrap.registry.DynamicRegistryManager value) { wrapperContained.registryManager = value.wrapperContained; }
// public static yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(net.minecraft.world.StructureLocator.registryManager); }
// public static void registryManager(yarnwrap.registry.DynamicRegistryManager value, ) { net.minecraft.world.StructureLocator.registryManager = value.wrapperContained; }

// public yarnwrap.structure.StructureTemplateManager structureTemplateManager() { return new yarnwrap.structure.StructureTemplateManager(wrapperContained.structureTemplateManager); }
// public void structureTemplateManager(yarnwrap.structure.StructureTemplateManager value) { wrapperContained.structureTemplateManager = value.wrapperContained; }
// public static yarnwrap.structure.StructureTemplateManager structureTemplateManager() { return new yarnwrap.structure.StructureTemplateManager(net.minecraft.world.StructureLocator.structureTemplateManager); }
// public static void structureTemplateManager(yarnwrap.structure.StructureTemplateManager value, ) { net.minecraft.world.StructureLocator.structureTemplateManager = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey worldKey() { return new yarnwrap.registry.RegistryKey(wrapperContained.worldKey); }
// public void worldKey(yarnwrap.registry.RegistryKey value) { wrapperContained.worldKey = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey worldKey() { return new yarnwrap.registry.RegistryKey(net.minecraft.world.StructureLocator.worldKey); }
// public static void worldKey(yarnwrap.registry.RegistryKey value, ) { net.minecraft.world.StructureLocator.worldKey = value.wrapperContained; }

// public yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.chunkGenerator); }
// public void chunkGenerator(yarnwrap.world.gen.chunk.ChunkGenerator value) { wrapperContained.chunkGenerator = value.wrapperContained; }
// public static yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(net.minecraft.world.StructureLocator.chunkGenerator); }
// public static void chunkGenerator(yarnwrap.world.gen.chunk.ChunkGenerator value, ) { net.minecraft.world.StructureLocator.chunkGenerator = value.wrapperContained; }

// public yarnwrap.world.HeightLimitView world() { return new yarnwrap.world.HeightLimitView(wrapperContained.world); }
// public void world(yarnwrap.world.HeightLimitView value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.HeightLimitView world() { return new yarnwrap.world.HeightLimitView(net.minecraft.world.StructureLocator.world); }
// public static void world(yarnwrap.world.HeightLimitView value, ) { net.minecraft.world.StructureLocator.world = value.wrapperContained; }

// public yarnwrap.world.biome.source.BiomeSource biomeSource() { return new yarnwrap.world.biome.source.BiomeSource(wrapperContained.biomeSource); }
// public void biomeSource(yarnwrap.world.biome.source.BiomeSource value) { wrapperContained.biomeSource = value.wrapperContained; }
// public static yarnwrap.world.biome.source.BiomeSource biomeSource() { return new yarnwrap.world.biome.source.BiomeSource(net.minecraft.world.StructureLocator.biomeSource); }
// public static void biomeSource(yarnwrap.world.biome.source.BiomeSource value, ) { net.minecraft.world.StructureLocator.biomeSource = value.wrapperContained; }

// public long seed() { return wrapperContained.seed; }
// public void seed(long value) { wrapperContained.seed = value; }
// public static long seed() { return net.minecraft.world.StructureLocator.seed; }
// public static void seed(long value, ) { net.minecraft.world.StructureLocator.seed = value; }

// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
// public static com.mojang.datafixers.DataFixer dataFixer() { return net.minecraft.world.StructureLocator.dataFixer; }
// public static void dataFixer(com.mojang.datafixers.DataFixer value, ) { net.minecraft.world.StructureLocator.dataFixer = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap cachedStructuresByChunkPos() { return wrapperContained.cachedStructuresByChunkPos; }
// public void cachedStructuresByChunkPos(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.cachedStructuresByChunkPos = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap cachedStructuresByChunkPos() { return net.minecraft.world.StructureLocator.cachedStructuresByChunkPos; }
// public static void cachedStructuresByChunkPos(it.unimi.dsi.fastutil.longs.Long2ObjectMap value, ) { net.minecraft.world.StructureLocator.cachedStructuresByChunkPos = value; }

// public java.util.Map generationPossibilityByStructure() { return wrapperContained.generationPossibilityByStructure; }
// public void generationPossibilityByStructure(java.util.Map value) { wrapperContained.generationPossibilityByStructure = value; }
// public static java.util.Map generationPossibilityByStructure() { return net.minecraft.world.StructureLocator.generationPossibilityByStructure; }
// public static void generationPossibilityByStructure(java.util.Map value, ) { net.minecraft.world.StructureLocator.generationPossibilityByStructure = value; }

// public yarnwrap.world.gen.noise.NoiseConfig noiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.noiseConfig); }
// public void noiseConfig(yarnwrap.world.gen.noise.NoiseConfig value) { wrapperContained.noiseConfig = value.wrapperContained; }
// public static yarnwrap.world.gen.noise.NoiseConfig noiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(net.minecraft.world.StructureLocator.noiseConfig); }
// public static void noiseConfig(yarnwrap.world.gen.noise.NoiseConfig value, ) { net.minecraft.world.StructureLocator.noiseConfig = value.wrapperContained; }

public StructureLocator(yarnwrap.world.storage.NbtScannable chunkIoWorker,yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.structure.StructureTemplateManager structureTemplateManager,yarnwrap.registry.RegistryKey worldKey,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.world.gen.noise.NoiseConfig noiseConfig,yarnwrap.world.HeightLimitView world,yarnwrap.world.biome.source.BiomeSource biomeSource,long seed,com.mojang.datafixers.DataFixer dataFixer) { this.wrapperContained = new net.minecraft.world.StructureLocator(chunkIoWorker.wrapperContained,registryManager.wrapperContained,structureTemplateManager.wrapperContained,worldKey.wrapperContained,chunkGenerator.wrapperContained,noiseConfig.wrapperContained,world.wrapperContained,biomeSource.wrapperContained,seed,dataFixer); }
// public void method_39827(long generationPossibilityByChunkPos) { wrapperContained.method_39827(generationPossibilityByChunkPos); }
// public static void method_39827(long generationPossibilityByChunkPos, ) { net.minecraft.world.StructureLocator.method_39827(generationPossibilityByChunkPos); }
// public void cache(long pos,it.unimi.dsi.fastutil.objects.Object2IntMap referencesByStructure) { wrapperContained.cache(pos,referencesByStructure); }
// public static void cache(long pos,it.unimi.dsi.fastutil.objects.Object2IntMap referencesByStructure, ) { net.minecraft.world.StructureLocator.cache(pos,referencesByStructure); }
// public boolean isGenerationPossible(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.gen.structure.Structure structure) { return wrapperContained.isGenerationPossible(pos.wrapperContained,structure.wrapperContained); }
// public static boolean isGenerationPossible(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.gen.structure.Structure structure, ) { return net.minecraft.world.StructureLocator.isGenerationPossible(pos.wrapperContained,structure.wrapperContained); }
public void incrementReferences(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.gen.structure.Structure structure) { wrapperContained.incrementReferences(pos.wrapperContained,structure.wrapperContained); }
// public static void incrementReferences(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.gen.structure.Structure structure, ) { net.minecraft.world.StructureLocator.incrementReferences(pos.wrapperContained,structure.wrapperContained); }
public yarnwrap.world.StructurePresence getStructurePresence(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.gen.structure.Structure type,yarnwrap.world.gen.chunk.placement.StructurePlacement placement,boolean skipReferencedStructures) { return new yarnwrap.world.StructurePresence(wrapperContained.getStructurePresence(pos.wrapperContained,type.wrapperContained,placement.wrapperContained,skipReferencedStructures)); }
// public static yarnwrap.world.StructurePresence getStructurePresence(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.gen.structure.Structure type,yarnwrap.world.gen.chunk.placement.StructurePlacement placement,boolean skipReferencedStructures, ) { return new yarnwrap.world.StructurePresence(net.minecraft.world.StructureLocator.getStructurePresence(pos.wrapperContained,type.wrapperContained,placement.wrapperContained,skipReferencedStructures)); }
// public yarnwrap.world.StructurePresence getStructurePresence(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.gen.structure.Structure structure,boolean skipReferencedStructures,long posLong) { return new yarnwrap.world.StructurePresence(wrapperContained.getStructurePresence(pos.wrapperContained,structure.wrapperContained,skipReferencedStructures,posLong)); }
// public static yarnwrap.world.StructurePresence getStructurePresence(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.gen.structure.Structure structure,boolean skipReferencedStructures,long posLong, ) { return new yarnwrap.world.StructurePresence(net.minecraft.world.StructureLocator.getStructurePresence(pos.wrapperContained,structure.wrapperContained,skipReferencedStructures,posLong)); }
public void cache(yarnwrap.util.math.ChunkPos pos,java.util.Map structureStarts) { wrapperContained.cache(pos.wrapperContained,structureStarts); }
// public static void cache(yarnwrap.util.math.ChunkPos pos,java.util.Map structureStarts, ) { net.minecraft.world.StructureLocator.cache(pos.wrapperContained,structureStarts); }
// public it.unimi.dsi.fastutil.longs.Long2BooleanMap method_39834(yarnwrap.world.gen.structure.Structure structure2) { return wrapperContained.method_39834(structure2.wrapperContained); }
// public static it.unimi.dsi.fastutil.longs.Long2BooleanMap method_39834(yarnwrap.world.gen.structure.Structure structure2, ) { return net.minecraft.world.StructureLocator.method_39834(structure2.wrapperContained); }
// public java.lang.Integer method_39836(yarnwrap.world.gen.structure.Structure feature,java.lang.Integer references) { return wrapperContained.method_39836(feature.wrapperContained,references); }
// public static java.lang.Integer method_39836(yarnwrap.world.gen.structure.Structure feature,java.lang.Integer references, ) { return net.minecraft.world.StructureLocator.method_39836(feature.wrapperContained,references); }
// public it.unimi.dsi.fastutil.objects.Object2IntMap method_39837(yarnwrap.world.gen.structure.Structure posx,java.lang.Long referencesByStructure) { return wrapperContained.method_39837(posx.wrapperContained,referencesByStructure); }
// public static it.unimi.dsi.fastutil.objects.Object2IntMap method_39837(yarnwrap.world.gen.structure.Structure posx,java.lang.Long referencesByStructure, ) { return net.minecraft.world.StructureLocator.method_39837(posx.wrapperContained,referencesByStructure); }
// public it.unimi.dsi.fastutil.objects.Object2IntMap createMapIfEmpty(it.unimi.dsi.fastutil.objects.Object2IntMap map) { return wrapperContained.createMapIfEmpty(map); }
// public static it.unimi.dsi.fastutil.objects.Object2IntMap createMapIfEmpty(it.unimi.dsi.fastutil.objects.Object2IntMap map, ) { return net.minecraft.world.StructureLocator.createMapIfEmpty(map); }
// public void method_39839(it.unimi.dsi.fastutil.objects.Object2IntMap structure,yarnwrap.world.gen.structure.Structure start) { wrapperContained.method_39839(structure,start.wrapperContained); }
// public static void method_39839(it.unimi.dsi.fastutil.objects.Object2IntMap structure,yarnwrap.world.gen.structure.Structure start, ) { net.minecraft.world.StructureLocator.method_39839(structure,start.wrapperContained); }
// public yarnwrap.world.StructurePresence getStructurePresence(it.unimi.dsi.fastutil.objects.Object2IntMap referencesByStructure,yarnwrap.world.gen.structure.Structure structure,boolean skipReferencedStructures) { return new yarnwrap.world.StructurePresence(wrapperContained.getStructurePresence(referencesByStructure,structure.wrapperContained,skipReferencedStructures)); }
// public static yarnwrap.world.StructurePresence getStructurePresence(it.unimi.dsi.fastutil.objects.Object2IntMap referencesByStructure,yarnwrap.world.gen.structure.Structure structure,boolean skipReferencedStructures, ) { return new yarnwrap.world.StructurePresence(net.minecraft.world.StructureLocator.getStructurePresence(referencesByStructure,structure.wrapperContained,skipReferencedStructures)); }
// public it.unimi.dsi.fastutil.objects.Object2IntMap collectStructuresAndReferences(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.collectStructuresAndReferences(nbt.wrapperContained); }
// public static it.unimi.dsi.fastutil.objects.Object2IntMap collectStructuresAndReferences(yarnwrap.nbt.NbtCompound nbt, ) { return net.minecraft.world.StructureLocator.collectStructuresAndReferences(nbt.wrapperContained); }
// public boolean method_41143(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.method_41143(chunkPos.wrapperContained); }
// public static boolean method_41143(yarnwrap.util.math.ChunkPos chunkPos, ) { return net.minecraft.world.StructureLocator.method_41143(chunkPos.wrapperContained); }

}