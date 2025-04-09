package yarnwrap.world.chunk;
public class ChunkCache { public net.minecraft.world.chunk.ChunkCache wrapperContained; public ChunkCache(net.minecraft.world.chunk.ChunkCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier plainsEntryGetter() { return wrapperContained.plainsEntryGetter; }
// public boolean empty() { return wrapperContained.empty; }
// public int minZ() { return wrapperContained.minZ; }
// public int minX() { return wrapperContained.minX; }
// public net.minecraft.world.chunk.Chunk[][] chunks() { return wrapperContained.chunks; }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public yarnwrap.world.chunk.Chunk getChunk(int chunkX,int chunkZ) { return new yarnwrap.world.chunk.Chunk(wrapperContained.getChunk(chunkX,chunkZ)); }
// public yarnwrap.world.chunk.Chunk getChunk(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.world.chunk.Chunk(wrapperContained.getChunk(pos.wrapperContained)); }
public yarnwrap.util.profiler.Profiler getProfiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.getProfiler()); }

}