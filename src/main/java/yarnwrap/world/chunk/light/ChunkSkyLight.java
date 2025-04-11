package yarnwrap.world.chunk.light;
public class ChunkSkyLight { public net.minecraft.world.chunk.light.ChunkSkyLight wrapperContained; public ChunkSkyLight(net.minecraft.world.chunk.light.ChunkSkyLight wrapperContained) { this.wrapperContained = wrapperContained; }

// public int minY() { return wrapperContained.minY; }
// public void minY(int value) { wrapperContained.minY = value; }
// public yarnwrap.util.collection.PaletteStorage palette() { return new yarnwrap.util.collection.PaletteStorage(wrapperContained.palette); }
// public void palette(yarnwrap.util.collection.PaletteStorage value) { wrapperContained.palette = value.wrapperContained; }
// public Object reusableBlockPos1() { return wrapperContained.reusableBlockPos1; }
// // public void reusableBlockPos1(Object value) { wrapperContained.reusableBlockPos1 = value; }
// public Object reusableBlockPos2() { return wrapperContained.reusableBlockPos2; }
// // public void reusableBlockPos2(Object value) { wrapperContained.reusableBlockPos2 = value; }
public int getMaxSurfaceY() { return wrapperContained.getMaxSurfaceY(); }
// public void fill(int y) { wrapperContained.fill(y); }
public int get(int localX,int localZ) { return wrapperContained.get(localX,localZ); }
public boolean isSkyLightAccessible(yarnwrap.world.BlockView blockView,int localX,int y,int localZ) { return wrapperContained.isSkyLightAccessible(blockView.wrapperContained,localX,y,localZ); }
// public boolean isSkyLightAccessible(yarnwrap.world.BlockView blockView,int packedIndex,int value,yarnwrap.util.math.BlockPos upperPos,yarnwrap.block.BlockState upperState,yarnwrap.util.math.BlockPos lowerPos,yarnwrap.block.BlockState lowerState) { return wrapperContained.isSkyLightAccessible(blockView.wrapperContained,packedIndex,value,upperPos.wrapperContained,upperState.wrapperContained,lowerPos.wrapperContained,lowerState.wrapperContained); }
// public int locateLightBlockingBlockBelow(yarnwrap.world.BlockView blockView,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState blockState) { return wrapperContained.locateLightBlockingBlockBelow(blockView.wrapperContained,pos.wrapperContained,blockState.wrapperContained); }
// public boolean faceBlocksLight(yarnwrap.world.BlockView blockView,yarnwrap.util.math.BlockPos upperPos,yarnwrap.block.BlockState upperState,yarnwrap.util.math.BlockPos lowerPos,yarnwrap.block.BlockState lowerState) { return wrapperContained.faceBlocksLight(blockView.wrapperContained,upperPos.wrapperContained,upperState.wrapperContained,lowerPos.wrapperContained,lowerState.wrapperContained); }
public void refreshSurfaceY(yarnwrap.world.chunk.Chunk chunk) { wrapperContained.refreshSurfaceY(chunk.wrapperContained); }
// public int calculateSurfaceY(yarnwrap.world.chunk.Chunk chunk,int topSectionIndex,int localX,int localZ) { return wrapperContained.calculateSurfaceY(chunk.wrapperContained,topSectionIndex,localX,localZ); }
// public int get(int index) { return wrapperContained.get(index); }
// public void set(int index,int y) { wrapperContained.set(index,y); }
// public int convertMinY(int y) { return wrapperContained.convertMinY(y); }
// public int getPackedIndex(int localX,int localZ) { return wrapperContained.getPackedIndex(localX,localZ); }

}