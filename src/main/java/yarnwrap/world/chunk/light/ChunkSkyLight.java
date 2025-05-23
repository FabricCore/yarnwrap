package yarnwrap.world.chunk.light;
public class ChunkSkyLight { public net.minecraft.world.chunk.light.ChunkSkyLight wrapperContained; public ChunkSkyLight(net.minecraft.world.chunk.light.ChunkSkyLight wrapperContained) { this.wrapperContained = wrapperContained; }

// public int minY() { return wrapperContained.minY; }
// public void minY(int value) { wrapperContained.minY = value; }
// public static int minY() { return net.minecraft.world.chunk.light.ChunkSkyLight.minY; }
// public static void minY(int value, ) { net.minecraft.world.chunk.light.ChunkSkyLight.minY = value; }

// public yarnwrap.util.collection.PaletteStorage palette() { return new yarnwrap.util.collection.PaletteStorage(wrapperContained.palette); }
// public void palette(yarnwrap.util.collection.PaletteStorage value) { wrapperContained.palette = value.wrapperContained; }
// public static yarnwrap.util.collection.PaletteStorage palette() { return new yarnwrap.util.collection.PaletteStorage(net.minecraft.world.chunk.light.ChunkSkyLight.palette); }
// public static void palette(yarnwrap.util.collection.PaletteStorage value, ) { net.minecraft.world.chunk.light.ChunkSkyLight.palette = value.wrapperContained; }

// public Object reusableBlockPos1() { return wrapperContained.reusableBlockPos1; }
// // public void reusableBlockPos1(Object value) { wrapperContained.reusableBlockPos1 = value; }
// // public static Object reusableBlockPos1() { return net.minecraft.world.chunk.light.ChunkSkyLight.reusableBlockPos1; }
// // public static void reusableBlockPos1(Object value, ) { net.minecraft.world.chunk.light.ChunkSkyLight.reusableBlockPos1 = value; }

// public Object reusableBlockPos2() { return wrapperContained.reusableBlockPos2; }
// // public void reusableBlockPos2(Object value) { wrapperContained.reusableBlockPos2 = value; }
// // public static Object reusableBlockPos2() { return net.minecraft.world.chunk.light.ChunkSkyLight.reusableBlockPos2; }
// // public static void reusableBlockPos2(Object value, ) { net.minecraft.world.chunk.light.ChunkSkyLight.reusableBlockPos2 = value; }

public ChunkSkyLight(yarnwrap.world.HeightLimitView heightLimitView) { this.wrapperContained = new net.minecraft.world.chunk.light.ChunkSkyLight(heightLimitView.wrapperContained); }
public int getMaxSurfaceY() { return wrapperContained.getMaxSurfaceY(); }
// public static int getMaxSurfaceY() { return net.minecraft.world.chunk.light.ChunkSkyLight.getMaxSurfaceY(); }
// public void fill(int y) { wrapperContained.fill(y); }
// public static void fill(int y, ) { net.minecraft.world.chunk.light.ChunkSkyLight.fill(y); }
public int get(int localX,int localZ) { return wrapperContained.get(localX,localZ); }
// public static int get(int localX,int localZ, ) { return net.minecraft.world.chunk.light.ChunkSkyLight.get(localX,localZ); }
public boolean isSkyLightAccessible(yarnwrap.world.BlockView blockView,int localX,int y,int localZ) { return wrapperContained.isSkyLightAccessible(blockView.wrapperContained,localX,y,localZ); }
// public static boolean isSkyLightAccessible(yarnwrap.world.BlockView blockView,int localX,int y,int localZ, ) { return net.minecraft.world.chunk.light.ChunkSkyLight.isSkyLightAccessible(blockView.wrapperContained,localX,y,localZ); }
// public boolean isSkyLightAccessible(yarnwrap.world.BlockView blockView,int packedIndex,int value,yarnwrap.util.math.BlockPos upperPos,yarnwrap.block.BlockState upperState,yarnwrap.util.math.BlockPos lowerPos,yarnwrap.block.BlockState lowerState) { return wrapperContained.isSkyLightAccessible(blockView.wrapperContained,packedIndex,value,upperPos.wrapperContained,upperState.wrapperContained,lowerPos.wrapperContained,lowerState.wrapperContained); }
// public static boolean isSkyLightAccessible(yarnwrap.world.BlockView blockView,int packedIndex,int value,yarnwrap.util.math.BlockPos upperPos,yarnwrap.block.BlockState upperState,yarnwrap.util.math.BlockPos lowerPos,yarnwrap.block.BlockState lowerState, ) { return net.minecraft.world.chunk.light.ChunkSkyLight.isSkyLightAccessible(blockView.wrapperContained,packedIndex,value,upperPos.wrapperContained,upperState.wrapperContained,lowerPos.wrapperContained,lowerState.wrapperContained); }
// public int locateLightBlockingBlockBelow(yarnwrap.world.BlockView blockView,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState blockState) { return wrapperContained.locateLightBlockingBlockBelow(blockView.wrapperContained,pos.wrapperContained,blockState.wrapperContained); }
// public static int locateLightBlockingBlockBelow(yarnwrap.world.BlockView blockView,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState blockState, ) { return net.minecraft.world.chunk.light.ChunkSkyLight.locateLightBlockingBlockBelow(blockView.wrapperContained,pos.wrapperContained,blockState.wrapperContained); }
// public boolean faceBlocksLight(yarnwrap.block.BlockState upper,yarnwrap.block.BlockState lower) { return wrapperContained.faceBlocksLight(upper.wrapperContained,lower.wrapperContained); }
// public static boolean faceBlocksLight(yarnwrap.block.BlockState upper,yarnwrap.block.BlockState lower, ) { return net.minecraft.world.chunk.light.ChunkSkyLight.faceBlocksLight(upper.wrapperContained,lower.wrapperContained); }
public void refreshSurfaceY(yarnwrap.world.chunk.Chunk chunk) { wrapperContained.refreshSurfaceY(chunk.wrapperContained); }
// public static void refreshSurfaceY(yarnwrap.world.chunk.Chunk chunk, ) { net.minecraft.world.chunk.light.ChunkSkyLight.refreshSurfaceY(chunk.wrapperContained); }
// public int calculateSurfaceY(yarnwrap.world.chunk.Chunk chunk,int topSectionIndex,int localX,int localZ) { return wrapperContained.calculateSurfaceY(chunk.wrapperContained,topSectionIndex,localX,localZ); }
// public static int calculateSurfaceY(yarnwrap.world.chunk.Chunk chunk,int topSectionIndex,int localX,int localZ, ) { return net.minecraft.world.chunk.light.ChunkSkyLight.calculateSurfaceY(chunk.wrapperContained,topSectionIndex,localX,localZ); }
// public int get(int index) { return wrapperContained.get(index); }
// public static int get(int index, ) { return net.minecraft.world.chunk.light.ChunkSkyLight.get(index); }
// public void set(int index,int y) { wrapperContained.set(index,y); }
// public static void set(int index,int y, ) { net.minecraft.world.chunk.light.ChunkSkyLight.set(index,y); }
// public int convertMinY(int y) { return wrapperContained.convertMinY(y); }
// public static int convertMinY(int y, ) { return net.minecraft.world.chunk.light.ChunkSkyLight.convertMinY(y); }
// public int getPackedIndex(int localX,int localZ) { return wrapperContained.getPackedIndex(localX,localZ); }
// public static int getPackedIndex(int localX,int localZ, ) { return net.minecraft.world.chunk.light.ChunkSkyLight.getPackedIndex(localX,localZ); }

}