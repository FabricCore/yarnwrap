package yarnwrap.world.chunk.light;
public class ChunkLightProvider { public net.minecraft.world.chunk.light.ChunkLightProvider wrapperContained; public ChunkLightProvider(net.minecraft.world.chunk.light.ChunkLightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.light.LightStorage lightStorage() { return new yarnwrap.world.chunk.light.LightStorage(wrapperContained.lightStorage); }
// public void lightStorage(yarnwrap.world.chunk.light.LightStorage value) { wrapperContained.lightStorage = value.wrapperContained; }
// public static yarnwrap.world.chunk.light.LightStorage lightStorage() { return new yarnwrap.world.chunk.light.LightStorage(net.minecraft.world.chunk.light.ChunkLightProvider.lightStorage); }
// public static void lightStorage(yarnwrap.world.chunk.light.LightStorage value, ) { net.minecraft.world.chunk.light.ChunkLightProvider.lightStorage = value.wrapperContained; }

// public yarnwrap.world.chunk.ChunkProvider chunkProvider() { return new yarnwrap.world.chunk.ChunkProvider(wrapperContained.chunkProvider); }
// public void chunkProvider(yarnwrap.world.chunk.ChunkProvider value) { wrapperContained.chunkProvider = value.wrapperContained; }
// public static yarnwrap.world.chunk.ChunkProvider chunkProvider() { return new yarnwrap.world.chunk.ChunkProvider(net.minecraft.world.chunk.light.ChunkLightProvider.chunkProvider); }
// public static void chunkProvider(yarnwrap.world.chunk.ChunkProvider value, ) { net.minecraft.world.chunk.light.ChunkLightProvider.chunkProvider = value.wrapperContained; }

// public net.minecraft.util.math.Direction[] DIRECTIONS() { return wrapperContained.DIRECTIONS; }
// public void DIRECTIONS(net.minecraft.util.math.Direction[] value) { wrapperContained.DIRECTIONS = value; }
// public static net.minecraft.util.math.Direction[] DIRECTIONS() { return net.minecraft.world.chunk.light.ChunkLightProvider.DIRECTIONS; }
// public static void DIRECTIONS(net.minecraft.util.math.Direction[] value, ) { net.minecraft.world.chunk.light.ChunkLightProvider.DIRECTIONS = value; }

// public long[] cachedChunkPositions() { return wrapperContained.cachedChunkPositions; }
// public void cachedChunkPositions(long[] value) { wrapperContained.cachedChunkPositions = value; }
// public static long[] cachedChunkPositions() { return net.minecraft.world.chunk.light.ChunkLightProvider.cachedChunkPositions; }
// public static void cachedChunkPositions(long[] value, ) { net.minecraft.world.chunk.light.ChunkLightProvider.cachedChunkPositions = value; }

// public net.minecraft.world.chunk.light.LightSourceView[] cachedChunks() { return wrapperContained.cachedChunks; }
// public void cachedChunks(net.minecraft.world.chunk.light.LightSourceView[] value) { wrapperContained.cachedChunks = value; }
// public static net.minecraft.world.chunk.light.LightSourceView[] cachedChunks() { return net.minecraft.world.chunk.light.ChunkLightProvider.cachedChunks; }
// public static void cachedChunks(net.minecraft.world.chunk.light.LightSourceView[] value, ) { net.minecraft.world.chunk.light.ChunkLightProvider.cachedChunks = value; }

// public it.unimi.dsi.fastutil.longs.LongOpenHashSet blockPositionsToCheck() { return wrapperContained.blockPositionsToCheck; }
// public void blockPositionsToCheck(it.unimi.dsi.fastutil.longs.LongOpenHashSet value) { wrapperContained.blockPositionsToCheck = value; }
// public static it.unimi.dsi.fastutil.longs.LongOpenHashSet blockPositionsToCheck() { return net.minecraft.world.chunk.light.ChunkLightProvider.blockPositionsToCheck; }
// public static void blockPositionsToCheck(it.unimi.dsi.fastutil.longs.LongOpenHashSet value, ) { net.minecraft.world.chunk.light.ChunkLightProvider.blockPositionsToCheck = value; }

// public ChunkLightProvider(yarnwrap.world.chunk.ChunkProvider chunkProvider,yarnwrap.world.chunk.light.LightStorage lightStorage) { this.wrapperContained = new net.minecraft.world.chunk.light.ChunkLightProvider(chunkProvider.wrapperContained,lightStorage.wrapperContained); }
public void enqueueSectionData(long sectionPos,yarnwrap.world.chunk.ChunkNibbleArray lightArray) { wrapperContained.enqueueSectionData(sectionPos,lightArray.wrapperContained); }
// public static void enqueueSectionData(long sectionPos,yarnwrap.world.chunk.ChunkNibbleArray lightArray, ) { net.minecraft.world.chunk.light.ChunkLightProvider.enqueueSectionData(sectionPos,lightArray.wrapperContained); }
// public yarnwrap.world.chunk.light.LightSourceView getChunk(int chunkX,int chunkZ) { return new yarnwrap.world.chunk.light.LightSourceView(wrapperContained.getChunk(chunkX,chunkZ)); }
// public static yarnwrap.world.chunk.light.LightSourceView getChunk(int chunkX,int chunkZ, ) { return new yarnwrap.world.chunk.light.LightSourceView(net.minecraft.world.chunk.light.ChunkLightProvider.getChunk(chunkX,chunkZ)); }
// public void clearChunkCache() { wrapperContained.clearChunkCache(); }
// public static void clearChunkCache() { net.minecraft.world.chunk.light.ChunkLightProvider.clearChunkCache(); }
// public int getRealisticOpacity(yarnwrap.block.BlockState state1,yarnwrap.block.BlockState state2,yarnwrap.util.math.Direction direction,int opacity2) { return wrapperContained.getRealisticOpacity(state1.wrapperContained,state2.wrapperContained,direction.wrapperContained,opacity2); }
// public static int getRealisticOpacity(yarnwrap.block.BlockState state1,yarnwrap.block.BlockState state2,yarnwrap.util.math.Direction direction,int opacity2, ) { return net.minecraft.world.chunk.light.ChunkLightProvider.getRealisticOpacity(state1.wrapperContained,state2.wrapperContained,direction.wrapperContained,opacity2); }
public void setRetainColumn(yarnwrap.util.math.ChunkPos pos,boolean retainData) { wrapperContained.setRetainColumn(pos.wrapperContained,retainData); }
// public static void setRetainColumn(yarnwrap.util.math.ChunkPos pos,boolean retainData, ) { net.minecraft.world.chunk.light.ChunkLightProvider.setRetainColumn(pos.wrapperContained,retainData); }
public java.lang.String displaySectionLevel(long sectionPos) { return wrapperContained.displaySectionLevel(sectionPos); }
// public static java.lang.String displaySectionLevel(long sectionPos, ) { return net.minecraft.world.chunk.light.ChunkLightProvider.displaySectionLevel(sectionPos); }
// public boolean shapesCoverFullCube(yarnwrap.block.BlockState source,yarnwrap.block.BlockState target,yarnwrap.util.math.Direction direction) { return wrapperContained.shapesCoverFullCube(source.wrapperContained,target.wrapperContained,direction.wrapperContained); }
// public static boolean shapesCoverFullCube(yarnwrap.block.BlockState source,yarnwrap.block.BlockState target,yarnwrap.util.math.Direction direction, ) { return net.minecraft.world.chunk.light.ChunkLightProvider.shapesCoverFullCube(source.wrapperContained,target.wrapperContained,direction.wrapperContained); }
// public int getOpacity(yarnwrap.block.BlockState state) { return wrapperContained.getOpacity(state.wrapperContained); }
// public static int getOpacity(yarnwrap.block.BlockState state, ) { return net.minecraft.world.chunk.light.ChunkLightProvider.getOpacity(state.wrapperContained); }
// public yarnwrap.block.BlockState getStateForLighting(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getStateForLighting(pos.wrapperContained)); }
// public static yarnwrap.block.BlockState getStateForLighting(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.BlockState(net.minecraft.world.chunk.light.ChunkLightProvider.getStateForLighting(pos.wrapperContained)); }
// public void method_51529(long blockPos) { wrapperContained.method_51529(blockPos); }
// public static void method_51529(long blockPos, ) { net.minecraft.world.chunk.light.ChunkLightProvider.method_51529(blockPos); }
// public void method_51530(long blockPos,long packed) { wrapperContained.method_51530(blockPos,packed); }
// public static void method_51530(long blockPos,long packed, ) { net.minecraft.world.chunk.light.ChunkLightProvider.method_51530(blockPos,packed); }
// public void method_51531(long blockPos,long packed,int lightLevel) { wrapperContained.method_51531(blockPos,packed,lightLevel); }
// public static void method_51531(long blockPos,long packed,int lightLevel, ) { net.minecraft.world.chunk.light.ChunkLightProvider.method_51531(blockPos,packed,lightLevel); }
// public boolean needsLightUpdate(yarnwrap.block.BlockState oldState,yarnwrap.block.BlockState newState) { return wrapperContained.needsLightUpdate(oldState.wrapperContained,newState.wrapperContained); }
// public static boolean needsLightUpdate(yarnwrap.block.BlockState oldState,yarnwrap.block.BlockState newState, ) { return net.minecraft.world.chunk.light.ChunkLightProvider.needsLightUpdate(oldState.wrapperContained,newState.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape getOpaqueShape(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction direction) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getOpaqueShape(state.wrapperContained,direction.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape getOpaqueShape(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction direction, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.world.chunk.light.ChunkLightProvider.getOpaqueShape(state.wrapperContained,direction.wrapperContained)); }
// public boolean isTrivialForLighting(yarnwrap.block.BlockState blockState) { return wrapperContained.isTrivialForLighting(blockState.wrapperContained); }
// public static boolean isTrivialForLighting(yarnwrap.block.BlockState blockState, ) { return net.minecraft.world.chunk.light.ChunkLightProvider.isTrivialForLighting(blockState.wrapperContained); }
// public void method_51565(long blockPos,long flags) { wrapperContained.method_51565(blockPos,flags); }
// public static void method_51565(long blockPos,long flags, ) { net.minecraft.world.chunk.light.ChunkLightProvider.method_51565(blockPos,flags); }
// public void method_51566(long blockPos,long flags) { wrapperContained.method_51566(blockPos,flags); }
// public static void method_51566(long blockPos,long flags, ) { net.minecraft.world.chunk.light.ChunkLightProvider.method_51566(blockPos,flags); }
public Object getStatus(long sectionPos) { return wrapperContained.getStatus(sectionPos); }
// public static Object getStatus(long sectionPos, ) { return net.minecraft.world.chunk.light.ChunkLightProvider.getStatus(sectionPos); }

}