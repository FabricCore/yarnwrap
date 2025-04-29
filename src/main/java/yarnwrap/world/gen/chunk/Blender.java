package yarnwrap.world.gen.chunk;
public class Blender { public net.minecraft.world.gen.chunk.Blender wrapperContained; public Blender(net.minecraft.world.gen.chunk.Blender wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.chunk.Blender NO_BLENDING() { return new yarnwrap.world.gen.chunk.Blender(wrapperContained.NO_BLENDING); }
// public void NO_BLENDING(yarnwrap.world.gen.chunk.Blender value) { wrapperContained.NO_BLENDING = value.wrapperContained; }
// public static yarnwrap.world.gen.chunk.Blender NO_BLENDING() { return new yarnwrap.world.gen.chunk.Blender(net.minecraft.world.gen.chunk.Blender.NO_BLENDING); }
// public static void NO_BLENDING(yarnwrap.world.gen.chunk.Blender value, ) { net.minecraft.world.gen.chunk.Blender.NO_BLENDING = value.wrapperContained; }

// public int BLENDING_BIOME_DISTANCE_THRESHOLD() { return wrapperContained.BLENDING_BIOME_DISTANCE_THRESHOLD; }
// public void BLENDING_BIOME_DISTANCE_THRESHOLD(int value) { wrapperContained.BLENDING_BIOME_DISTANCE_THRESHOLD = value; }
// public static int BLENDING_BIOME_DISTANCE_THRESHOLD() { return net.minecraft.world.gen.chunk.Blender.BLENDING_BIOME_DISTANCE_THRESHOLD; }
// public static void BLENDING_BIOME_DISTANCE_THRESHOLD(int value, ) { net.minecraft.world.gen.chunk.Blender.BLENDING_BIOME_DISTANCE_THRESHOLD = value; }

// public int BLENDING_CHUNK_DISTANCE_THRESHOLD() { return wrapperContained.BLENDING_CHUNK_DISTANCE_THRESHOLD; }
// public void BLENDING_CHUNK_DISTANCE_THRESHOLD(int value) { wrapperContained.BLENDING_CHUNK_DISTANCE_THRESHOLD = value; }
// public static int BLENDING_CHUNK_DISTANCE_THRESHOLD() { return net.minecraft.world.gen.chunk.Blender.BLENDING_CHUNK_DISTANCE_THRESHOLD; }
// public static void BLENDING_CHUNK_DISTANCE_THRESHOLD(int value, ) { net.minecraft.world.gen.chunk.Blender.BLENDING_CHUNK_DISTANCE_THRESHOLD = value; }

// public int CLOSE_BLENDING_DISTANCE_THRESHOLD() { return wrapperContained.CLOSE_BLENDING_DISTANCE_THRESHOLD; }
// public void CLOSE_BLENDING_DISTANCE_THRESHOLD(int value) { wrapperContained.CLOSE_BLENDING_DISTANCE_THRESHOLD = value; }
// public static int CLOSE_BLENDING_DISTANCE_THRESHOLD() { return net.minecraft.world.gen.chunk.Blender.CLOSE_BLENDING_DISTANCE_THRESHOLD; }
// public static void CLOSE_BLENDING_DISTANCE_THRESHOLD(int value, ) { net.minecraft.world.gen.chunk.Blender.CLOSE_BLENDING_DISTANCE_THRESHOLD = value; }

// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler OFFSET_NOISE() { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.OFFSET_NOISE); }
// public void OFFSET_NOISE(yarnwrap.util.math.noise.DoublePerlinNoiseSampler value) { wrapperContained.OFFSET_NOISE = value.wrapperContained; }
// public static yarnwrap.util.math.noise.DoublePerlinNoiseSampler OFFSET_NOISE() { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(net.minecraft.world.gen.chunk.Blender.OFFSET_NOISE); }
// public static void OFFSET_NOISE(yarnwrap.util.math.noise.DoublePerlinNoiseSampler value, ) { net.minecraft.world.gen.chunk.Blender.OFFSET_NOISE = value.wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap blendingData() { return wrapperContained.blendingData; }
// public void blendingData(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value) { wrapperContained.blendingData = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap blendingData() { return net.minecraft.world.gen.chunk.Blender.blendingData; }
// public static void blendingData(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value, ) { net.minecraft.world.gen.chunk.Blender.blendingData = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap closeBlendingData() { return wrapperContained.closeBlendingData; }
// public void closeBlendingData(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value) { wrapperContained.closeBlendingData = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap closeBlendingData() { return net.minecraft.world.gen.chunk.Blender.closeBlendingData; }
// public static void closeBlendingData(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value, ) { net.minecraft.world.gen.chunk.Blender.closeBlendingData = value; }

// public Blender(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap blendingData,it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap closeBlendingData) { this.wrapperContained = new net.minecraft.world.gen.chunk.Blender(blendingData,closeBlendingData); }
// public yarnwrap.world.gen.chunk.Blender getNoBlending() { return new yarnwrap.world.gen.chunk.Blender(wrapperContained.getNoBlending()); }
public static yarnwrap.world.gen.chunk.Blender getNoBlending() { return new yarnwrap.world.gen.chunk.Blender(net.minecraft.world.gen.chunk.Blender.getNoBlending()); }
// public double getBlendOffset(double height) { return wrapperContained.getBlendOffset(height); }
// public static double getBlendOffset(double height, ) { return net.minecraft.world.gen.chunk.Blender.getBlendOffset(height); }
// public double applyBlendDensity(Object pos,double density) { return wrapperContained.applyBlendDensity(pos,density); }
// public static double applyBlendDensity(Object pos,double density, ) { return net.minecraft.world.gen.chunk.Blender.applyBlendDensity(pos,density); }
// public void method_39339(int biomeX,int halfSectionY,int biomeZ,org.apache.commons.lang3.mutable.MutableDouble collidableBlockDensity) { wrapperContained.method_39339(biomeX,halfSectionY,biomeZ,collidableBlockDensity); }
// public static void method_39339(int biomeX,int halfSectionY,int biomeZ,org.apache.commons.lang3.mutable.MutableDouble collidableBlockDensity, ) { net.minecraft.world.gen.chunk.Blender.method_39339(biomeX,halfSectionY,biomeZ,collidableBlockDensity); }
public Object calculate(int blockX,int blockZ) { return wrapperContained.calculate(blockX,blockZ); }
// public static Object calculate(int blockX,int blockZ, ) { return net.minecraft.world.gen.chunk.Blender.calculate(blockX,blockZ); }
// public void method_39341(int biomeX,int biomeZ,org.apache.commons.lang3.mutable.MutableDouble height) { wrapperContained.method_39341(biomeX,biomeZ,height); }
// public static void method_39341(int biomeX,int biomeZ,org.apache.commons.lang3.mutable.MutableDouble height, ) { net.minecraft.world.gen.chunk.Blender.method_39341(biomeX,biomeZ,height); }
// public yarnwrap.world.gen.chunk.Blender getBlender(yarnwrap.world.ChunkRegion chunkRegion) { return new yarnwrap.world.gen.chunk.Blender(wrapperContained.getBlender(chunkRegion.wrapperContained)); }
// public static yarnwrap.world.gen.chunk.Blender getBlender(yarnwrap.world.ChunkRegion chunkRegion, ) { return new yarnwrap.world.gen.chunk.Blender(net.minecraft.world.gen.chunk.Blender.getBlender(chunkRegion.wrapperContained)); }
// public void method_39560(int chunkPos,int data) { wrapperContained.method_39560(chunkPos,data); }
// public static void method_39560(int chunkPos,int data, ) { net.minecraft.world.gen.chunk.Blender.method_39560(chunkPos,data); }
// public yarnwrap.registry.entry.RegistryEntry blendBiome(int x,int y,int z) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.blendBiome(x,y,z)); }
// public static yarnwrap.registry.entry.RegistryEntry blendBiome(int x,int y,int z, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.chunk.Blender.blendBiome(x,y,z)); }
// public double sampleClosest(int biomeX,int biomeY,int biomeZ,Object sampler) { return wrapperContained.sampleClosest(biomeX,biomeY,biomeZ,sampler); }
// public static double sampleClosest(int biomeX,int biomeY,int biomeZ,Object sampler, ) { return net.minecraft.world.gen.chunk.Blender.sampleClosest(biomeX,biomeY,biomeZ,sampler); }
public yarnwrap.world.biome.source.BiomeSupplier getBiomeSupplier(yarnwrap.world.biome.source.BiomeSupplier biomeSupplier) { return new yarnwrap.world.biome.source.BiomeSupplier(wrapperContained.getBiomeSupplier(biomeSupplier.wrapperContained)); }
// public static yarnwrap.world.biome.source.BiomeSupplier getBiomeSupplier(yarnwrap.world.biome.source.BiomeSupplier biomeSupplier, ) { return new yarnwrap.world.biome.source.BiomeSupplier(net.minecraft.world.gen.chunk.Blender.getBiomeSupplier(biomeSupplier.wrapperContained)); }
// public yarnwrap.registry.entry.RegistryEntry method_39564(yarnwrap.world.biome.source.BiomeSupplier x,int y,int z,int noise) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_39564(x.wrapperContained,y,z,noise)); }
// public static yarnwrap.registry.entry.RegistryEntry method_39564(yarnwrap.world.biome.source.BiomeSupplier x,int y,int z,int noise, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.chunk.Blender.method_39564(x.wrapperContained,y,z,noise)); }
// public double sample(Object sampler,int chunkX,int chunkZ,int biomeX,int biomeY,int biomeZ) { return wrapperContained.sample(sampler,chunkX,chunkZ,biomeX,biomeY,biomeZ); }
// public static double sample(Object sampler,int chunkX,int chunkZ,int biomeX,int biomeY,int biomeZ, ) { return net.minecraft.world.gen.chunk.Blender.sample(sampler,chunkX,chunkZ,biomeX,biomeY,biomeZ); }
// public void tickLeavesAndFluids(yarnwrap.world.ChunkRegion chunkRegion,yarnwrap.world.chunk.Chunk chunk) { wrapperContained.tickLeavesAndFluids(chunkRegion.wrapperContained,chunk.wrapperContained); }
// public static void tickLeavesAndFluids(yarnwrap.world.ChunkRegion chunkRegion,yarnwrap.world.chunk.Chunk chunk, ) { net.minecraft.world.gen.chunk.Blender.tickLeavesAndFluids(chunkRegion.wrapperContained,chunk.wrapperContained); }
// public void tickLeavesAndFluids(yarnwrap.world.chunk.Chunk chunk,yarnwrap.util.math.BlockPos pos) { wrapperContained.tickLeavesAndFluids(chunk.wrapperContained,pos.wrapperContained); }
// public static void tickLeavesAndFluids(yarnwrap.world.chunk.Chunk chunk,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.world.gen.chunk.Blender.tickLeavesAndFluids(chunk.wrapperContained,pos.wrapperContained); }
// public double method_39807(double offsetX,double y,double offsetZ) { return wrapperContained.method_39807(offsetX,y,offsetZ); }
// public static double method_39807(double offsetX,double y,double offsetZ, ) { return net.minecraft.world.gen.chunk.Blender.method_39807(offsetX,y,offsetZ); }
// public double getDistance(double x1,double y1,double z1,double x2,double y2,double z2) { return wrapperContained.getDistance(x1,y1,z1,x2,y2,z2); }
// public static double getDistance(double x1,double y1,double z1,double x2,double y2,double z2, ) { return net.minecraft.world.gen.chunk.Blender.getDistance(x1,y1,z1,x2,y2,z2); }
// public void createCarvingMasks(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.chunk.ProtoChunk chunk) { wrapperContained.createCarvingMasks(world.wrapperContained,chunk.wrapperContained); }
// public static void createCarvingMasks(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.chunk.ProtoChunk chunk, ) { net.minecraft.world.gen.chunk.Blender.createCarvingMasks(world.wrapperContained,chunk.wrapperContained); }
// public void method_39810(Object mask) { wrapperContained.method_39810(mask); }
// public static void method_39810(Object mask, ) { net.minecraft.world.gen.chunk.Blender.method_39810(mask); }
// public boolean method_39811(Object offsetX,int y,int offsetZ) { return wrapperContained.method_39811(offsetX,y,offsetZ); }
// public static boolean method_39811(Object offsetX,int y,int offsetZ, ) { return net.minecraft.world.gen.chunk.Blender.method_39811(offsetX,y,offsetZ); }
// public Object createDistanceFunction(yarnwrap.util.math.EightWayDirection direction,yarnwrap.world.gen.chunk.BlendingData data) { return wrapperContained.createDistanceFunction(direction.wrapperContained,data.wrapperContained); }
// public static Object createDistanceFunction(yarnwrap.util.math.EightWayDirection direction,yarnwrap.world.gen.chunk.BlendingData data, ) { return net.minecraft.world.gen.chunk.Blender.createDistanceFunction(direction.wrapperContained,data.wrapperContained); }
// public double method_39813(java.util.List offsetX,double y,double offsetZ) { return wrapperContained.method_39813(offsetX,y,offsetZ); }
// public static double method_39813(java.util.List offsetX,double y,double offsetZ, ) { return net.minecraft.world.gen.chunk.Blender.method_39813(offsetX,y,offsetZ); }
// public void method_39814(java.util.List direction,yarnwrap.util.math.EightWayDirection datax) { wrapperContained.method_39814(direction,datax.wrapperContained); }
// public static void method_39814(java.util.List direction,yarnwrap.util.math.EightWayDirection datax, ) { net.minecraft.world.gen.chunk.Blender.method_39814(direction,datax.wrapperContained); }
// public Object createClosestDistanceFunction(yarnwrap.world.gen.chunk.BlendingData data,java.util.Map neighborData) { return wrapperContained.createClosestDistanceFunction(data.wrapperContained,neighborData); }
// public static Object createClosestDistanceFunction(yarnwrap.world.gen.chunk.BlendingData data,java.util.Map neighborData, ) { return net.minecraft.world.gen.chunk.Blender.createClosestDistanceFunction(data.wrapperContained,neighborData); }
// public void method_40025(int biomeX,int biomeZ,org.apache.commons.lang3.mutable.MutableDouble biome) { wrapperContained.method_40025(biomeX,biomeZ,biome); }
// public static void method_40025(int biomeX,int biomeZ,org.apache.commons.lang3.mutable.MutableDouble biome, ) { net.minecraft.world.gen.chunk.Blender.method_40025(biomeX,biomeZ,biome); }
// public void method_40026(int chunkPos,int data) { wrapperContained.method_40026(chunkPos,data); }
// public static void method_40026(int chunkPos,int data, ) { net.minecraft.world.gen.chunk.Blender.method_40026(chunkPos,data); }
// public void method_40027(int chunkPos,int data) { wrapperContained.method_40027(chunkPos,data); }
// public static void method_40027(int chunkPos,int data, ) { net.minecraft.world.gen.chunk.Blender.method_40027(chunkPos,data); }

}