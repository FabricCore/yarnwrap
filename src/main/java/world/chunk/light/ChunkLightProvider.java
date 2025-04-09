package yarnwrap.world.chunk.light;
public class ChunkLightProvider { public net.minecraft.world.chunk.light.ChunkLightProvider wrapperContained; public ChunkLightProvider(net.minecraft.world.chunk.light.ChunkLightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.light.LightStorage lightStorage() { return new yarnwrap.world.chunk.light.LightStorage(wrapperContained.lightStorage); }
// public yarnwrap.world.chunk.ChunkProvider chunkProvider() { return new yarnwrap.world.chunk.ChunkProvider(wrapperContained.chunkProvider); }
// public net.minecraft.util.math.Direction[] DIRECTIONS() { return wrapperContained.DIRECTIONS; }
// public long[] cachedChunkPositions() { return wrapperContained.cachedChunkPositions; }
// public net.minecraft.world.chunk.light.LightSourceView[] cachedChunks() { return wrapperContained.cachedChunks; }
// public Object reusableBlockPos() { return wrapperContained.reusableBlockPos; }
// public it.unimi.dsi.fastutil.longs.LongOpenHashSet blockPositionsToCheck() { return wrapperContained.blockPositionsToCheck; }
public void enqueueSectionData(long sectionPos,yarnwrap.world.chunk.ChunkNibbleArray lightArray) { wrapperContained.enqueueSectionData(sectionPos,lightArray.wrapperContained); }
// public yarnwrap.world.chunk.light.LightSourceView getChunk(int chunkX,int chunkZ) { return new yarnwrap.world.chunk.light.LightSourceView(wrapperContained.getChunk(chunkX,chunkZ)); }
// public void clearChunkCache() { wrapperContained.clearChunkCache(); }
public int getRealisticOpacity(yarnwrap.world.BlockView world,yarnwrap.block.BlockState state1,yarnwrap.util.math.BlockPos pos1,yarnwrap.block.BlockState state2,yarnwrap.util.math.BlockPos pos2,yarnwrap.util.math.Direction direction,int opacity2) { return wrapperContained.getRealisticOpacity(world.wrapperContained,state1.wrapperContained,pos1.wrapperContained,state2.wrapperContained,pos2.wrapperContained,direction.wrapperContained,opacity2); }
public void setRetainColumn(yarnwrap.util.math.ChunkPos pos,boolean retainData) { wrapperContained.setRetainColumn(pos.wrapperContained,retainData); }
// public yarnwrap.util.shape.VoxelShape getOpaqueShape(yarnwrap.block.BlockState blockState,long pos,yarnwrap.util.math.Direction direction) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getOpaqueShape(blockState.wrapperContained,pos,direction.wrapperContained)); }
public java.lang.String displaySectionLevel(long sectionPos) { return wrapperContained.displaySectionLevel(sectionPos); }
// public boolean shapesCoverFullCube(long sourceId,yarnwrap.block.BlockState sourceState,long targetId,yarnwrap.block.BlockState targetState,yarnwrap.util.math.Direction direction) { return wrapperContained.shapesCoverFullCube(sourceId,sourceState.wrapperContained,targetId,targetState.wrapperContained,direction.wrapperContained); }
// public int getOpacity(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getOpacity(state.wrapperContained,pos.wrapperContained); }
// public yarnwrap.block.BlockState getStateForLighting(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getStateForLighting(pos.wrapperContained)); }
public boolean needsLightUpdate(yarnwrap.world.BlockView blockView,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState,yarnwrap.block.BlockState newState) { return wrapperContained.needsLightUpdate(blockView.wrapperContained,pos.wrapperContained,oldState.wrapperContained,newState.wrapperContained); }
public yarnwrap.util.shape.VoxelShape getOpaqueShape(yarnwrap.world.BlockView blockView,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState blockState,yarnwrap.util.math.Direction direction) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getOpaqueShape(blockView.wrapperContained,pos.wrapperContained,blockState.wrapperContained,direction.wrapperContained)); }
// public boolean isTrivialForLighting(yarnwrap.block.BlockState blockState) { return wrapperContained.isTrivialForLighting(blockState.wrapperContained); }
public Object getStatus(long sectionPos) { return wrapperContained.getStatus(sectionPos); }

}