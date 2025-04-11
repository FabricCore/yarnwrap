package yarnwrap.world.chunk;
public class ChunkCache { public net.minecraft.world.chunk.ChunkCache wrapperContained; public ChunkCache(net.minecraft.world.chunk.ChunkCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier plainsEntryGetter() { return wrapperContained.plainsEntryGetter; }
// public void plainsEntryGetter(java.util.function.Supplier value) { wrapperContained.plainsEntryGetter = value; }
// public boolean empty() { return wrapperContained.empty; }
// public void empty(boolean value) { wrapperContained.empty = value; }
// public int minZ() { return wrapperContained.minZ; }
// public void minZ(int value) { wrapperContained.minZ = value; }
// public int minX() { return wrapperContained.minX; }
// public void minX(int value) { wrapperContained.minX = value; }
// public net.minecraft.world.chunk.Chunk[][] chunks() { return wrapperContained.chunks; }
// public void chunks(net.minecraft.world.chunk.Chunk[][] value) { wrapperContained.chunks = value; }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
public ChunkCache(yarnwrap.world.World world,yarnwrap.util.math.BlockPos minPos,yarnwrap.util.math.BlockPos maxPos) { this.wrapperContained = new net.minecraft.world.chunk.ChunkCache(world.wrapperContained,minPos.wrapperContained,maxPos.wrapperContained); }
// public yarnwrap.world.chunk.Chunk getChunk(int chunkX,int chunkZ) { return new yarnwrap.world.chunk.Chunk(wrapperContained.getChunk(chunkX,chunkZ)); }
// public yarnwrap.world.chunk.Chunk getChunk(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.world.chunk.Chunk(wrapperContained.getChunk(pos.wrapperContained)); }
public yarnwrap.util.profiler.Profiler getProfiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.getProfiler()); }

}