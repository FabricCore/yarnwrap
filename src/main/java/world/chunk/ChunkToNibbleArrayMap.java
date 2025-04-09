package yarnwrap.world.chunk;
public class ChunkToNibbleArrayMap { public net.minecraft.world.chunk.ChunkToNibbleArrayMap wrapperContained; public ChunkToNibbleArrayMap(net.minecraft.world.chunk.ChunkToNibbleArrayMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public long[] cachePositions() { return wrapperContained.cachePositions; }
// public net.minecraft.world.chunk.ChunkNibbleArray[] cacheArrays() { return wrapperContained.cacheArrays; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap arrays() { return wrapperContained.arrays; }
// public boolean cacheEnabled() { return wrapperContained.cacheEnabled; }
public void put(long pos,yarnwrap.world.chunk.ChunkNibbleArray data) { wrapperContained.put(pos,data.wrapperContained); }
public yarnwrap.world.chunk.ChunkNibbleArray removeChunk(long chunkPos) { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.removeChunk(chunkPos)); }
public yarnwrap.world.chunk.ChunkNibbleArray get(long chunkPos) { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.get(chunkPos)); }
public yarnwrap.world.chunk.ChunkNibbleArray replaceWithCopy(long pos) { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.replaceWithCopy(pos)); }
public boolean containsKey(long chunkPos) { return wrapperContained.containsKey(chunkPos); }
public yarnwrap.world.chunk.ChunkToNibbleArrayMap copy() { return new yarnwrap.world.chunk.ChunkToNibbleArrayMap(wrapperContained.copy()); }
public void clearCache() { wrapperContained.clearCache(); }
public void disableCache() { wrapperContained.disableCache(); }

}