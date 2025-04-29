package yarnwrap.world.gen.structure;
public class Structure { public net.minecraft.world.gen.structure.Structure wrapperContained; public Structure(net.minecraft.world.gen.structure.Structure wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec STRUCTURE_CODEC() { return wrapperContained.STRUCTURE_CODEC; }
// public void STRUCTURE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.STRUCTURE_CODEC = value; }
public static com.mojang.serialization.Codec STRUCTURE_CODEC() { return net.minecraft.world.gen.structure.Structure.STRUCTURE_CODEC; }
// public static void STRUCTURE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.structure.Structure.STRUCTURE_CODEC = value; }

// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec ENTRY_CODEC() { return net.minecraft.world.gen.structure.Structure.ENTRY_CODEC; }
// public static void ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.structure.Structure.ENTRY_CODEC = value; }

// public Object config() { return wrapperContained.config; }
// // public void config(Object value) { wrapperContained.config = value; }
// // public static Object config() { return net.minecraft.world.gen.structure.Structure.config; }
// // public static void config(Object value, ) { net.minecraft.world.gen.structure.Structure.config = value; }

// public Structure(Object config) { this.wrapperContained = new net.minecraft.world.gen.structure.Structure(config); }
// public java.util.Optional getStructurePosition(Object context) { return wrapperContained.getStructurePosition(context); }
// public static java.util.Optional getStructurePosition(Object context, ) { return net.minecraft.world.gen.structure.Structure.getStructurePosition(context); }
public void postPlace(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.StructureAccessor structureAccessor,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockBox box,yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.structure.StructurePiecesList pieces) { wrapperContained.postPlace(world.wrapperContained,structureAccessor.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,box.wrapperContained,chunkPos.wrapperContained,pieces.wrapperContained); }
// public static void postPlace(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.StructureAccessor structureAccessor,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockBox box,yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.structure.StructurePiecesList pieces, ) { net.minecraft.world.gen.structure.Structure.postPlace(world.wrapperContained,structureAccessor.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,box.wrapperContained,chunkPos.wrapperContained,pieces.wrapperContained); }
public yarnwrap.registry.entry.RegistryEntryList getValidBiomes() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.getValidBiomes()); }
// public static yarnwrap.registry.entry.RegistryEntryList getValidBiomes() { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.world.gen.structure.Structure.getValidBiomes()); }
public yarnwrap.util.math.BlockBox expandBoxIfShouldAdaptNoise(yarnwrap.util.math.BlockBox box) { return new yarnwrap.util.math.BlockBox(wrapperContained.expandBoxIfShouldAdaptNoise(box.wrapperContained)); }
// public static yarnwrap.util.math.BlockBox expandBoxIfShouldAdaptNoise(yarnwrap.util.math.BlockBox box, ) { return new yarnwrap.util.math.BlockBox(net.minecraft.world.gen.structure.Structure.expandBoxIfShouldAdaptNoise(box.wrapperContained)); }
// public int getMinCornerHeight(Object context,int width,int height) { return wrapperContained.getMinCornerHeight(context,width,height); }
// public static int getMinCornerHeight(Object context,int width,int height, ) { return net.minecraft.world.gen.structure.Structure.getMinCornerHeight(context,width,height); }
// public int[] getCornerHeights(Object context,int x,int width,int z,int height) { return wrapperContained.getCornerHeights(context,x,width,z,height); }
// public static int[] getCornerHeights(Object context,int x,int width,int z,int height, ) { return net.minecraft.world.gen.structure.Structure.getCornerHeights(context,x,width,z,height); }
// public java.util.Optional getStructurePosition(Object context,Object heightmap,java.util.function.Consumer generator) { return wrapperContained.getStructurePosition(context,heightmap,generator); }
// public static java.util.Optional getStructurePosition(Object context,Object heightmap,java.util.function.Consumer generator, ) { return net.minecraft.world.gen.structure.Structure.getStructurePosition(context,heightmap,generator); }
// public boolean isBiomeValid(Object result,Object context) { return wrapperContained.isBiomeValid(result,context); }
// public static boolean isBiomeValid(Object result,Object context, ) { return net.minecraft.world.gen.structure.Structure.isBiomeValid(result,context); }
public yarnwrap.structure.StructureStart createStructureStart(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.world.biome.source.BiomeSource biomeSource,yarnwrap.world.gen.noise.NoiseConfig noiseConfig,yarnwrap.structure.StructureTemplateManager structureTemplateManager,long seed,yarnwrap.util.math.ChunkPos chunkPos,int references,yarnwrap.world.HeightLimitView world,java.util.function.Predicate validBiomes) { return new yarnwrap.structure.StructureStart(wrapperContained.createStructureStart(dynamicRegistryManager.wrapperContained,chunkGenerator.wrapperContained,biomeSource.wrapperContained,noiseConfig.wrapperContained,structureTemplateManager.wrapperContained,seed,chunkPos.wrapperContained,references,world.wrapperContained,validBiomes)); }
// public static yarnwrap.structure.StructureStart createStructureStart(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.world.biome.source.BiomeSource biomeSource,yarnwrap.world.gen.noise.NoiseConfig noiseConfig,yarnwrap.structure.StructureTemplateManager structureTemplateManager,long seed,yarnwrap.util.math.ChunkPos chunkPos,int references,yarnwrap.world.HeightLimitView world,java.util.function.Predicate validBiomes, ) { return new yarnwrap.structure.StructureStart(net.minecraft.world.gen.structure.Structure.createStructureStart(dynamicRegistryManager.wrapperContained,chunkGenerator.wrapperContained,biomeSource.wrapperContained,noiseConfig.wrapperContained,structureTemplateManager.wrapperContained,seed,chunkPos.wrapperContained,references,world.wrapperContained,validBiomes)); }
public java.util.Map getStructureSpawns() { return wrapperContained.getStructureSpawns(); }
// public static java.util.Map getStructureSpawns() { return net.minecraft.world.gen.structure.Structure.getStructureSpawns(); }
public Object getFeatureGenerationStep() { return wrapperContained.getFeatureGenerationStep(); }
// public static Object getFeatureGenerationStep() { return net.minecraft.world.gen.structure.Structure.getFeatureGenerationStep(); }
public yarnwrap.world.gen.structure.StructureType getType() { return new yarnwrap.world.gen.structure.StructureType(wrapperContained.getType()); }
// public static yarnwrap.world.gen.structure.StructureType getType() { return new yarnwrap.world.gen.structure.StructureType(net.minecraft.world.gen.structure.Structure.getType()); }
// public int getMinCornerHeight(Object context,int x,int z,int width,int height) { return wrapperContained.getMinCornerHeight(context,x,z,width,height); }
// public static int getMinCornerHeight(Object context,int x,int z,int width,int height, ) { return net.minecraft.world.gen.structure.Structure.getMinCornerHeight(context,x,z,width,height); }
// public yarnwrap.util.math.BlockPos getShiftedPos(Object context,yarnwrap.util.BlockRotation rotation) { return new yarnwrap.util.math.BlockPos(wrapperContained.getShiftedPos(context,rotation.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos getShiftedPos(Object context,yarnwrap.util.BlockRotation rotation, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.world.gen.structure.Structure.getShiftedPos(context,rotation.wrapperContained)); }
// public com.mojang.serialization.codecs.RecordCodecBuilder configCodecBuilder(Object instance) { return wrapperContained.configCodecBuilder(instance); }
// public static com.mojang.serialization.codecs.RecordCodecBuilder configCodecBuilder(Object instance, ) { return net.minecraft.world.gen.structure.Structure.configCodecBuilder(instance); }
// public Object method_42698(yarnwrap.world.gen.structure.Structure feature) { return wrapperContained.method_42698(feature.wrapperContained); }
// public static Object method_42698(yarnwrap.world.gen.structure.Structure feature, ) { return net.minecraft.world.gen.structure.Structure.method_42698(feature.wrapperContained); }
// public com.mojang.serialization.MapCodec createCodec(java.util.function.Function featureCreator) { return wrapperContained.createCodec(featureCreator); }
// public static com.mojang.serialization.MapCodec createCodec(java.util.function.Function featureCreator, ) { return net.minecraft.world.gen.structure.Structure.createCodec(featureCreator); }
// public com.mojang.datafixers.kinds.App method_42700(java.util.function.Function instance) { return wrapperContained.method_42700(instance); }
// public static com.mojang.datafixers.kinds.App method_42700(java.util.function.Function instance, ) { return net.minecraft.world.gen.structure.Structure.method_42700(instance); }
public yarnwrap.world.gen.StructureTerrainAdaptation getTerrainAdaptation() { return new yarnwrap.world.gen.StructureTerrainAdaptation(wrapperContained.getTerrainAdaptation()); }
// public static yarnwrap.world.gen.StructureTerrainAdaptation getTerrainAdaptation() { return new yarnwrap.world.gen.StructureTerrainAdaptation(net.minecraft.world.gen.structure.Structure.getTerrainAdaptation()); }
// public boolean method_47931(Object position) { return wrapperContained.method_47931(position); }
// public static boolean method_47931(Object position, ) { return net.minecraft.world.gen.structure.Structure.method_47931(position); }
// public java.util.Optional getValidStructurePosition(Object context) { return wrapperContained.getValidStructurePosition(context); }
// public static java.util.Optional getValidStructurePosition(Object context, ) { return net.minecraft.world.gen.structure.Structure.getValidStructurePosition(context); }
// public int getAverageCornerHeights(Object context,int x,int width,int z,int height) { return wrapperContained.getAverageCornerHeights(context,x,width,z,height); }
// public static int getAverageCornerHeights(Object context,int x,int width,int z,int height, ) { return net.minecraft.world.gen.structure.Structure.getAverageCornerHeights(context,x,width,z,height); }

}