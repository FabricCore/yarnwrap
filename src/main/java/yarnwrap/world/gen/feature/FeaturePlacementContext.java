package yarnwrap.world.gen.feature;
public class FeaturePlacementContext { public net.minecraft.world.gen.feature.FeaturePlacementContext wrapperContained; public FeaturePlacementContext(net.minecraft.world.gen.feature.FeaturePlacementContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.StructureWorldAccess world() { return new yarnwrap.world.StructureWorldAccess(wrapperContained.world); }
// public void world(yarnwrap.world.StructureWorldAccess value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.StructureWorldAccess world() { return new yarnwrap.world.StructureWorldAccess(net.minecraft.world.gen.feature.FeaturePlacementContext.world); }
// public static void world(yarnwrap.world.StructureWorldAccess value, ) { net.minecraft.world.gen.feature.FeaturePlacementContext.world = value.wrapperContained; }

// public yarnwrap.world.gen.chunk.ChunkGenerator generator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.generator); }
// public void generator(yarnwrap.world.gen.chunk.ChunkGenerator value) { wrapperContained.generator = value.wrapperContained; }
// public static yarnwrap.world.gen.chunk.ChunkGenerator generator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(net.minecraft.world.gen.feature.FeaturePlacementContext.generator); }
// public static void generator(yarnwrap.world.gen.chunk.ChunkGenerator value, ) { net.minecraft.world.gen.feature.FeaturePlacementContext.generator = value.wrapperContained; }

// public java.util.Optional placedFeature() { return wrapperContained.placedFeature; }
// public void placedFeature(java.util.Optional value) { wrapperContained.placedFeature = value; }
// public static java.util.Optional placedFeature() { return net.minecraft.world.gen.feature.FeaturePlacementContext.placedFeature; }
// public static void placedFeature(java.util.Optional value, ) { net.minecraft.world.gen.feature.FeaturePlacementContext.placedFeature = value; }

public FeaturePlacementContext(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.chunk.ChunkGenerator generator,java.util.Optional placedFeature) { this.wrapperContained = new net.minecraft.world.gen.feature.FeaturePlacementContext(world.wrapperContained,generator.wrapperContained,placedFeature); }
public yarnwrap.world.gen.carver.CarvingMask getOrCreateCarvingMask(yarnwrap.util.math.ChunkPos chunkPos) { return new yarnwrap.world.gen.carver.CarvingMask(wrapperContained.getOrCreateCarvingMask(chunkPos.wrapperContained)); }
// public static yarnwrap.world.gen.carver.CarvingMask getOrCreateCarvingMask(yarnwrap.util.math.ChunkPos chunkPos, ) { return new yarnwrap.world.gen.carver.CarvingMask(net.minecraft.world.gen.feature.FeaturePlacementContext.getOrCreateCarvingMask(chunkPos.wrapperContained)); }
// public int getTopY(Object heightmap,int x,int z) { return wrapperContained.getTopY(heightmap,x,z); }
// public static int getTopY(Object heightmap,int x,int z, ) { return net.minecraft.world.gen.feature.FeaturePlacementContext.getTopY(heightmap,x,z); }
public yarnwrap.block.BlockState getBlockState(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getBlockState(pos.wrapperContained)); }
// public static yarnwrap.block.BlockState getBlockState(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.BlockState(net.minecraft.world.gen.feature.FeaturePlacementContext.getBlockState(pos.wrapperContained)); }
public int getBottomY() { return wrapperContained.getBottomY(); }
// public static int getBottomY() { return net.minecraft.world.gen.feature.FeaturePlacementContext.getBottomY(); }
public yarnwrap.world.StructureWorldAccess getWorld() { return new yarnwrap.world.StructureWorldAccess(wrapperContained.getWorld()); }
// public static yarnwrap.world.StructureWorldAccess getWorld() { return new yarnwrap.world.StructureWorldAccess(net.minecraft.world.gen.feature.FeaturePlacementContext.getWorld()); }
public java.util.Optional getPlacedFeature() { return wrapperContained.getPlacedFeature(); }
// public static java.util.Optional getPlacedFeature() { return net.minecraft.world.gen.feature.FeaturePlacementContext.getPlacedFeature(); }
public yarnwrap.world.gen.chunk.ChunkGenerator getChunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.getChunkGenerator()); }
// public static yarnwrap.world.gen.chunk.ChunkGenerator getChunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(net.minecraft.world.gen.feature.FeaturePlacementContext.getChunkGenerator()); }

}