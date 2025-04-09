package yarnwrap.world.gen.chunk;
public class Blender { public net.minecraft.world.gen.chunk.Blender wrapperContained; public Blender(net.minecraft.world.gen.chunk.Blender wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.chunk.Blender NO_BLENDING() { return new yarnwrap.world.gen.chunk.Blender(wrapperContained.NO_BLENDING); }
// public int BLENDING_BIOME_DISTANCE_THRESHOLD() { return wrapperContained.BLENDING_BIOME_DISTANCE_THRESHOLD; }
// public int BLENDING_CHUNK_DISTANCE_THRESHOLD() { return wrapperContained.BLENDING_CHUNK_DISTANCE_THRESHOLD; }
// public int CLOSE_BLENDING_DISTANCE_THRESHOLD() { return wrapperContained.CLOSE_BLENDING_DISTANCE_THRESHOLD; }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler OFFSET_NOISE() { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.OFFSET_NOISE); }
// public it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap blendingData() { return wrapperContained.blendingData; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap closeBlendingData() { return wrapperContained.closeBlendingData; }
public yarnwrap.world.gen.chunk.Blender getNoBlending() { return new yarnwrap.world.gen.chunk.Blender(wrapperContained.getNoBlending()); }
// public double getBlendOffset(double height) { return wrapperContained.getBlendOffset(height); }
// public double applyBlendDensity(Object pos,double density) { return wrapperContained.applyBlendDensity(pos,density); }
public Object calculate(int blockX,int blockZ) { return wrapperContained.calculate(blockX,blockZ); }
public yarnwrap.world.gen.chunk.Blender getBlender(yarnwrap.world.ChunkRegion chunkRegion) { return new yarnwrap.world.gen.chunk.Blender(wrapperContained.getBlender(chunkRegion.wrapperContained)); }
// public yarnwrap.registry.entry.RegistryEntry blendBiome(int x,int y,int z) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.blendBiome(x,y,z)); }
// public double sampleClosest(int biomeX,int biomeY,int biomeZ,Object sampler) { return wrapperContained.sampleClosest(biomeX,biomeY,biomeZ,sampler); }
public yarnwrap.world.biome.source.BiomeSupplier getBiomeSupplier(yarnwrap.world.biome.source.BiomeSupplier biomeSupplier) { return new yarnwrap.world.biome.source.BiomeSupplier(wrapperContained.getBiomeSupplier(biomeSupplier.wrapperContained)); }
// public double sample(Object sampler,int chunkX,int chunkZ,int biomeX,int biomeY,int biomeZ) { return wrapperContained.sample(sampler,chunkX,chunkZ,biomeX,biomeY,biomeZ); }
public void tickLeavesAndFluids(yarnwrap.world.ChunkRegion chunkRegion,yarnwrap.world.chunk.Chunk chunk) { wrapperContained.tickLeavesAndFluids(chunkRegion.wrapperContained,chunk.wrapperContained); }
// public void tickLeavesAndFluids(yarnwrap.world.chunk.Chunk chunk,yarnwrap.util.math.BlockPos pos) { wrapperContained.tickLeavesAndFluids(chunk.wrapperContained,pos.wrapperContained); }
// public double getDistance(double x1,double y1,double z1,double x2,double y2,double z2) { return wrapperContained.getDistance(x1,y1,z1,x2,y2,z2); }
public void createCarvingMasks(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.chunk.ProtoChunk chunk) { wrapperContained.createCarvingMasks(world.wrapperContained,chunk.wrapperContained); }
// public Object createDistanceFunction(yarnwrap.util.math.EightWayDirection direction,yarnwrap.world.gen.chunk.BlendingData data) { return wrapperContained.createDistanceFunction(direction.wrapperContained,data.wrapperContained); }
public Object createClosestDistanceFunction(yarnwrap.world.gen.chunk.BlendingData data,java.util.Map neighborData) { return wrapperContained.createClosestDistanceFunction(data.wrapperContained,neighborData); }

}