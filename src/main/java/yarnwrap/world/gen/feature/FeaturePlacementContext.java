package yarnwrap.world.gen.feature;
public class FeaturePlacementContext { public net.minecraft.world.gen.feature.FeaturePlacementContext wrapperContained; public FeaturePlacementContext(net.minecraft.world.gen.feature.FeaturePlacementContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.StructureWorldAccess world() { return new yarnwrap.world.StructureWorldAccess(wrapperContained.world); }
// public void world(yarnwrap.world.StructureWorldAccess value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.world.gen.chunk.ChunkGenerator generator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.generator); }
// public void generator(yarnwrap.world.gen.chunk.ChunkGenerator value) { wrapperContained.generator = value.wrapperContained; }
// public java.util.Optional placedFeature() { return wrapperContained.placedFeature; }
// public void placedFeature(java.util.Optional value) { wrapperContained.placedFeature = value; }
// public yarnwrap.world.gen.carver.CarvingMask getOrCreateCarvingMask(yarnwrap.util.math.ChunkPos chunkPos,Object carver) { return new yarnwrap.world.gen.carver.CarvingMask(wrapperContained.getOrCreateCarvingMask(chunkPos.wrapperContained,carver)); }
// public int getTopY(Object heightmap,int x,int z) { return wrapperContained.getTopY(heightmap,x,z); }
public yarnwrap.block.BlockState getBlockState(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getBlockState(pos.wrapperContained)); }
public int getBottomY() { return wrapperContained.getBottomY(); }
public yarnwrap.world.StructureWorldAccess getWorld() { return new yarnwrap.world.StructureWorldAccess(wrapperContained.getWorld()); }
public java.util.Optional getPlacedFeature() { return wrapperContained.getPlacedFeature(); }
public yarnwrap.world.gen.chunk.ChunkGenerator getChunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.getChunkGenerator()); }

}