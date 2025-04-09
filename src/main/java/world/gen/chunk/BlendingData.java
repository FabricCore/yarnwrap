package yarnwrap.world.gen.chunk;
public class BlendingData { public net.minecraft.world.gen.chunk.BlendingData wrapperContained; public BlendingData(net.minecraft.world.gen.chunk.BlendingData wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.HeightLimitView oldHeightLimit() { return new yarnwrap.world.HeightLimitView(wrapperContained.oldHeightLimit); }
// public int HORIZONTAL_BIOME_COUNT() { return wrapperContained.HORIZONTAL_BIOME_COUNT; }
// public java.util.List SURFACE_BLOCKS() { return wrapperContained.SURFACE_BLOCKS; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public int BIOMES_PER_CHUNK() { return wrapperContained.BIOMES_PER_CHUNK; }
// public int LAST_CHUNK_BIOME_INDEX() { return wrapperContained.LAST_CHUNK_BIOME_INDEX; }
// public int CHUNK_BIOME_END_INDEX() { return wrapperContained.CHUNK_BIOME_END_INDEX; }
// public int NORTH_WEST_END_INDEX() { return wrapperContained.NORTH_WEST_END_INDEX; }
// public int SOUTH_EAST_END_INDEX_PART() { return wrapperContained.SOUTH_EAST_END_INDEX_PART; }
// public boolean initializedBlendingData() { return wrapperContained.initializedBlendingData; }
// public double[] surfaceHeights() { return wrapperContained.surfaceHeights; }
// public double[][] collidableBlockDensities() { return wrapperContained.collidableBlockDensities; }
// public com.mojang.serialization.Codec DOUBLE_ARRAY_CODEC() { return wrapperContained.DOUBLE_ARRAY_CODEC; }
// public java.util.List biomes() { return wrapperContained.biomes; }
// public int getX(int index) { return wrapperContained.getX(index); }
// public double getHeight(int biomeX,int biomeY,int biomeZ) { return wrapperContained.getHeight(biomeX,biomeY,biomeZ); }
// public double getCollidableBlockDensity(int chunkBiomeX,int halfSectionY,int chunkBiomeZ) { return wrapperContained.getCollidableBlockDensity(chunkBiomeX,halfSectionY,chunkBiomeZ); }
// public void acceptCollidableBlockDensities(int biomeX,int biomeZ,int minHalfSectionY,int maxHalfSectionY,Object consumer) { wrapperContained.acceptCollidableBlockDensities(biomeX,biomeZ,minHalfSectionY,maxHalfSectionY,consumer); }
// public void initBlockColumn(int index,yarnwrap.world.chunk.Chunk chunk,int chunkBlockX,int chunkBlockZ) { wrapperContained.initBlockColumn(index,chunk.wrapperContained,chunkBlockX,chunkBlockZ); }
// public int getSurfaceBlockY(yarnwrap.world.chunk.Chunk chunk,int blockX,int blockZ) { return wrapperContained.getSurfaceBlockY(chunk.wrapperContained,blockX,blockZ); }
// public boolean isCollidableAndNotTreeAt(yarnwrap.world.chunk.Chunk chunk,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isCollidableAndNotTreeAt(chunk.wrapperContained,pos.wrapperContained); }
// public void acceptHeights(int biomeX,int biomeZ,Object consumer) { wrapperContained.acceptHeights(biomeX,biomeZ,consumer); }
// public int getZ(int index) { return wrapperContained.getZ(index); }
// public double[] calculateCollidableBlockDensityColumn(yarnwrap.world.chunk.Chunk chunk,int chunkBlockX,int chunkBlockZ,int surfaceHeight) { return wrapperContained.calculateCollidableBlockDensityColumn(chunk.wrapperContained,chunkBlockX,chunkBlockZ,surfaceHeight); }
public yarnwrap.world.gen.chunk.BlendingData getBlendingData(yarnwrap.world.ChunkRegion chunkRegion,int chunkX,int chunkZ) { return new yarnwrap.world.gen.chunk.BlendingData(wrapperContained.getBlendingData(chunkRegion.wrapperContained,chunkX,chunkZ)); }
// public void initChunkBlendingData(yarnwrap.world.chunk.Chunk chunk,java.util.Set newNoiseChunkDirections) { wrapperContained.initChunkBlendingData(chunk.wrapperContained,newNoiseChunkDirections); }
// public com.mojang.serialization.DataResult validate(yarnwrap.world.gen.chunk.BlendingData data) { return wrapperContained.validate(data.wrapperContained); }
// public double getCollidableBlockDensity(double collidableBlockDensityColumn,int halfSectionY) { return wrapperContained.getCollidableBlockDensity(collidableBlockDensityColumn,halfSectionY); }
// public int getVerticalHalfSectionCount() { return wrapperContained.getVerticalHalfSectionCount(); }
// public int getNorthWestIndex(int chunkBiomeX,int chunkBiomeZ) { return wrapperContained.getNorthWestIndex(chunkBiomeX,chunkBiomeZ); }
public java.util.Set getAdjacentChunksWithNoise(yarnwrap.world.StructureWorldAccess access,int chunkX,int chunkZ,boolean oldNoise) { return wrapperContained.getAdjacentChunksWithNoise(access.wrapperContained,chunkX,chunkZ,oldNoise); }
// public int getOneAboveBottomHalfSectionY() { return wrapperContained.getOneAboveBottomHalfSectionY(); }
// public int getSouthEastIndex(int chunkBiomeX,int chunkBiomeZ) { return wrapperContained.getSouthEastIndex(chunkBiomeX,chunkBiomeZ); }
// public int getBottomHalfSectionY() { return wrapperContained.getBottomHalfSectionY(); }
// public double getAboveCollidableBlockValue(yarnwrap.world.chunk.Chunk chunk,Object mutablePos) { return wrapperContained.getAboveCollidableBlockValue(chunk.wrapperContained,mutablePos); }
// public double getCollidableBlockDensityBelow(yarnwrap.world.chunk.Chunk chunk,Object mutablePos) { return wrapperContained.getCollidableBlockDensityBelow(chunk.wrapperContained,mutablePos); }
// public void acceptBiomes(int biomeX,int biomeY,int biomeZ,Object consumer) { wrapperContained.acceptBiomes(biomeX,biomeY,biomeZ,consumer); }
public yarnwrap.world.HeightLimitView getOldHeightLimit() { return new yarnwrap.world.HeightLimitView(wrapperContained.getOldHeightLimit()); }
// public int getHalfSectionHeight(int halfSectionY) { return wrapperContained.getHalfSectionHeight(halfSectionY); }
// public java.util.List getVerticalBiomeSections(yarnwrap.world.chunk.Chunk chunk,int chunkBlockX,int chunkBlockZ) { return wrapperContained.getVerticalBiomeSections(chunk.wrapperContained,chunkBlockX,chunkBlockZ); }
// public int getVerticalBiomeCount() { return wrapperContained.getVerticalBiomeCount(); }

}